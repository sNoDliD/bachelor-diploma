package com.qmlplugin.language;

import com.intellij.codeInspection.ProblemHighlightType;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.Annotator;
import com.intellij.lang.annotation.HighlightSeverity;
import com.intellij.psi.PsiElement;
import com.qmlplugin.language.psi.QmlImportItem;
import org.jetbrains.annotations.NotNull;

public class QmlAnnotator implements Annotator {
    // Define strings for the Qml language prefix - used for annotations, line markers, etc.
    public static final String Qml_PREFIX_STR = "qml";
    public static final String Qml_SEPARATOR_STR = ":";

    @Override
    public void annotate(@NotNull final PsiElement element, @NotNull AnnotationHolder holder) {
        if (element.getText().equals("import") || element.getText().equals("as")) {
            var range = element.getTextRange();
            if (element.getParent() instanceof QmlImportItem) {
                holder.newSilentAnnotation(HighlightSeverity.INFORMATION)
                        .range(range).textAttributes(QmlSyntaxHighlighter.IMPORT).create();
            } else {
                holder.newAnnotation(HighlightSeverity.ERROR, "Unexpected import")
                        .range(range)
                        .textAttributes(QmlSyntaxHighlighter.BAD_CHARACTER)
                        .highlightType(ProblemHighlightType.GENERIC_ERROR_OR_WARNING)
                        .create();
            }
            return;
        }
    }
}
