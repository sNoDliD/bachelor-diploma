package com.qmlplugin.language;

import com.intellij.lang.ASTNode;
import com.intellij.lang.folding.FoldingBuilderEx;
import com.intellij.lang.folding.FoldingDescriptor;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.editor.FoldingGroup;
import com.intellij.openapi.project.DumbAware;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
//import com.intellij.psi.PsiLiteralExpression;
//import com.intellij.psi.PsiLiteralExpression;
import com.intellij.psi.util.PsiTreeUtil;
import com.qmlplugin.language.psi.QmlProperty;
import com.qmlplugin.language.psi.QmlTokenType;
import com.qmlplugin.language.psi.QmlTypes;
import com.qmlplugin.language.psi.impl.QmlPropertyImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class QmlFoldingBuilder extends FoldingBuilderEx implements DumbAware {

    @Override
    public FoldingDescriptor @NotNull [] buildFoldRegions(@NotNull PsiElement root, @NotNull Document document, boolean quick) {
        // Initialize the group of folding regions that will expand/collapse together.
        FoldingGroup group = FoldingGroup.newGroup(QmlAnnotator.Qml_PREFIX_STR);
        // Initialize the list of folding regions
        List<FoldingDescriptor> descriptors = new ArrayList<>();
        // Get a collection of the literal expressions in the document below root
//        Collection<PsiLiteralExpression> literalExpressions =
//                PsiTreeUtil.findChildrenOfType(root, PsiLiteralExpression.class);
        var literalExpressions =
                PsiTreeUtil.findChildrenOfType(root, QmlPropertyImpl.class);
        // Evaluate the collection
        for (final QmlPropertyImpl literalExpression : literalExpressions) {
            String value = literalExpression.getValue();
//            String value = literalExpression.getValue() instanceof String ? (String) literalExpression.getValue() : null;
            if (value != null && value.startsWith(QmlAnnotator.Qml_PREFIX_STR + QmlAnnotator.Qml_SEPARATOR_STR)) {
                Project project = literalExpression.getProject();
                String key = value.substring(
                        QmlAnnotator.Qml_PREFIX_STR.length() + QmlAnnotator.Qml_SEPARATOR_STR.length()
                );
                // Get a list of all properties for a given key in the project
                final List<QmlProperty> properties = QmlUtil.findProperties(project, key);
                if (properties.size() == 1) {
                    // Add a folding descriptor for the literal expression at this node.
                    descriptors.add(new FoldingDescriptor(literalExpression.getNode(),
                            new TextRange(literalExpression.getTextRange().getStartOffset(),
                                    literalExpression.getTextRange().getEndOffset()),
                            group));
                }
            }
        }
        return descriptors.toArray(new FoldingDescriptor[descriptors.size()]);

    }

    /**
     * Gets the Qml Language 'value' string corresponding to the 'key'
     *
     * @param node Node corresponding to PsiLiteralExpression containing a string in the format
     *             Qml_PREFIX_STR + Qml_SEPARATOR_STR + Key, where Key is
     *             defined by the Qml language file.
     */
    @Nullable
    @Override
    public String getPlaceholderText(@NotNull ASTNode node) {
        String retTxt = "...";
        if (node.getPsi() instanceof QmlPropertyImpl) {
            QmlPropertyImpl nodeElement = (QmlPropertyImpl) node.getPsi();
            String key = ((String) nodeElement.getValue()).substring(
                    QmlAnnotator.Qml_PREFIX_STR.length() + QmlAnnotator.Qml_SEPARATOR_STR.length()
            );
            final List<QmlProperty> properties = QmlUtil.findProperties(nodeElement.getProject(), key);
            String place = properties.get(0).getValue();
            // IMPORTANT: keys can come with no values, so a test for null is needed
            // IMPORTANT: Convert embedded \n to backslash n, so that the string will look
            // like it has LF embedded in it and embedded " to escaped "
            return place == null ? retTxt : place.replaceAll("\n", "\\n").replaceAll("\"", "\\\\\"");
        }
        return retTxt;
    }

    @Override
    public boolean isCollapsedByDefault(@NotNull ASTNode node) {
        return true;
    }

}
