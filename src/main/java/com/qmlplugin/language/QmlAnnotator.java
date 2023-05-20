package com.qmlplugin.language;

import com.intellij.codeInspection.ProblemHighlightType;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.Annotator;
import com.intellij.lang.annotation.HighlightSeverity;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.intellij.psi.impl.source.tree.LeafPsiElement;
import com.qmlplugin.language.psi.QmlProperty;
import com.qmlplugin.language.psi.QmlTypes;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class QmlAnnotator implements Annotator {
    // Define strings for the Qml language prefix - used for annotations, line markers, etc.
    public static final String Qml_PREFIX_STR = "qml";
    public static final String Qml_SEPARATOR_STR = ":";

    @Override
    public void annotate(@NotNull final PsiElement element, @NotNull AnnotationHolder holder) {
        if (!(element.getParent() instanceof QmlProperty)) {
            return;
        }
        if (!((LeafPsiElement) element).getElementType().equals(QmlTypes.VALUE)) {
            return;
        }

        String value = element.getText();
        if ((value == null) || !value.startsWith(Qml_PREFIX_STR + Qml_SEPARATOR_STR)) {
            return;
        }

        // Define the text ranges (start is inclusive, end is exclusive)
        // "Qml:key"
        //  01234567890
        TextRange prefixRange = TextRange.from(element.getTextRange().getStartOffset(), Qml_PREFIX_STR.length());
        TextRange separatorRange = TextRange.from(prefixRange.getEndOffset(), Qml_SEPARATOR_STR.length());
        TextRange keyRange = new TextRange(separatorRange.getEndOffset(), element.getTextRange().getEndOffset());

        // highlight "Qml" prefix and ":" separator
        holder.newSilentAnnotation(HighlightSeverity.INFORMATION)
                .range(prefixRange).textAttributes(DefaultLanguageHighlighterColors.KEYWORD).create();
        holder.newSilentAnnotation(HighlightSeverity.INFORMATION)
                .range(separatorRange).textAttributes(QmlSyntaxHighlighter.SEPARATOR).create();


        // Get the list of properties for given key
        String key = value.substring(Qml_PREFIX_STR.length() + Qml_SEPARATOR_STR.length());
        List<QmlProperty> properties = QmlUtil.findProperties(element.getProject(), key);
        if (properties.isEmpty()) {
            holder.newAnnotation(HighlightSeverity.ERROR, "Unresolved property")
                    .range(keyRange)
                    .highlightType(ProblemHighlightType.LIKE_UNKNOWN_SYMBOL)
                    // ** Tutorial step 18.3 - Add a quick fix for the string containing possible properties
                    .withFix(new QmlCreatePropertyQuickFix(key))
                    .create();
        } else {
            // Found at least one property, force the text attributes to Qml syntax value character
            holder.newSilentAnnotation(HighlightSeverity.INFORMATION)
                    .range(keyRange).textAttributes(QmlSyntaxHighlighter.KEYWORD).create();
        }
    }
}
