package com.qmlplugin.language;

import com.intellij.openapi.util.TextRange;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.patterns.PsiElementPattern;
import com.intellij.patterns.StringPattern;
import com.intellij.psi.*;
import com.intellij.psi.PsiLiteralExpression;
import com.intellij.psi.impl.source.tree.PsiCommentImpl;
import com.intellij.util.ProcessingContext;
import com.qmlplugin.language.psi.QmlTypes;
import com.qmlplugin.language.psi.impl.QmlPropertyImpl;
import org.jetbrains.annotations.NotNull;
import com.qmlplugin.language.psi.QmlElementType;
import static com.qmlplugin.language.QmlAnnotator.Qml_PREFIX_STR;
import static com.qmlplugin.language.QmlAnnotator.Qml_SEPARATOR_STR;

public class QmlReferenceContributor extends PsiReferenceContributor {

    @Override
    public void registerReferenceProviders(@NotNull PsiReferenceRegistrar registrar) {

//        var patterns = PlatformPatterns.psiElement(QmlTypes.ASSIGNMENT_VALUE)
//                .withParent(PlatformPatterns.psiElement(QmlTypes.ASSIGNMENT))
////                .withSuperParent(2, PlatformPatterns.psiElement(XmlElementType.XML_TAG))
//                .withLanguage(QmlLanguage.INSTANCE);
//        registrar.registerReferenceProvider(patterns,

        registrar.registerReferenceProvider(PlatformPatterns.psiElement(QmlPropertyImpl.class),
                new PsiReferenceProvider() {
                    @Override
                    public PsiReference @NotNull [] getReferencesByElement(@NotNull PsiElement element,
                                                                           @NotNull ProcessingContext context) {
//                        PsiLiteralExpression literalExpression = (PsiLiteralExpression) element;
//                        String value = literalExpression.getValue() instanceof String ?
//                                (String) literalExpression.getValue() : null;
//                        if ((value != null && value.startsWith(Qml_PREFIX_STR + Qml_SEPARATOR_STR))) {
//                            TextRange property = new TextRange(Qml_PREFIX_STR.length() + Qml_SEPARATOR_STR.length() + 1,
//                                    value.length() + 1);
//                            return new PsiReference[]{new QmlReference(element, property)};
//                        }
                        if ((((PsiCommentImpl) element).getTokenType().equals(QmlTypes.COMMENT))) {
                            TextRange property = new TextRange(2, 6);
                            return new PsiReference[]{new QmlReference(element, property)};
//                            return PsiReference.EMPTY_ARRAY;
                        }
                        System.out.println("WTF");
                        return PsiReference.EMPTY_ARRAY;
                    }
                });
    }
}
