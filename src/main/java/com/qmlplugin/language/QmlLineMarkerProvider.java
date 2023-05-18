package com.qmlplugin.language;

import com.intellij.codeInsight.daemon.RelatedItemLineMarkerInfo;
import com.intellij.codeInsight.daemon.RelatedItemLineMarkerProvider;
import com.intellij.codeInsight.navigation.NavigationGutterIconBuilder;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiLiteralExpression;
import com.intellij.psi.impl.source.tree.LeafPsiElement;
import com.qmlplugin.language.psi.QmlProperty;
import com.qmlplugin.language.psi.QmlTokenType;
import com.qmlplugin.language.psi.QmlTypes;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.List;

public class QmlLineMarkerProvider extends RelatedItemLineMarkerProvider {

    @Override
    protected void collectNavigationMarkers(@NotNull PsiElement element,
                                            @NotNull Collection<? super RelatedItemLineMarkerInfo<?>> result) {
        // This must be an element with a literal expression as a parent
//        if (!(element.get))
        if (!(element.getParent() instanceof QmlProperty)) {
            return;
        }
//        if (!(element instanceof LeafPsiElement)) {
//            return;
//        }
        if (!((LeafPsiElement) element).getElementType().equals(QmlTypes.KEY)) {
            return;
        }
        if (!((QmlProperty) element.getParent()).getKey().equals("website")){
            return;
        }

        NavigationGutterIconBuilder<PsiElement> builder =
                NavigationGutterIconBuilder.create(QmlIcons.FILE)
                        .setTargets(element)
                        .setTooltipText("Navigate to Qml language property");
        result.add(builder.createLineMarkerInfo(element));
//        if (!(element instanceof PsiJavaTokenImpl) || !(element.getParent() instanceof PsiLiteralExpression)) {
//            return;
//        }
//        if (((PsiJavaTokenImpl) element).getTokenType() instanceof QmlTypes)
        // The literal expression must start with the Qml language literal expression
//        PsiLiteralExpression literalExpression = (PsiLiteralExpression) element.getParent();
//        String value = literalExpression.getValue() instanceof String ? (String) literalExpression.getValue() : null;
//        if ((value == null) ||
//                !value.startsWith(QmlAnnotator.Qml_PREFIX_STR + QmlAnnotator.Qml_SEPARATOR_STR)) {
//            return;
//        }
//
//        // Get the Qml language property usage
//        Project project = element.getProject();
//        String possibleProperties = "website";
////        String possibleProperties = value.substring(
////                QmlAnnotator.Qml_PREFIX_STR.length() + QmlAnnotator.Qml_SEPARATOR_STR.length()
////        );
//        final List<QmlProperty> properties = QmlUtil.findProperties(project, possibleProperties);
//        if (properties.size() > 0) {
//            // Add the property to a collection of line marker info
//            NavigationGutterIconBuilder<PsiElement> builder2 =
//                    NavigationGutterIconBuilder.create(QmlIcons.FILE)
//                            .setTargets(properties)
//                            .setTooltipText("Navigate to Qml language property");
//            result.add(builder2.createLineMarkerInfo(element));
//        }
    }

}

