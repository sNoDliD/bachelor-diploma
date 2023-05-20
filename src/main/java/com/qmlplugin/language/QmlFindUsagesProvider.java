package com.qmlplugin.language;

import com.intellij.lang.cacheBuilder.DefaultWordsScanner;
import com.intellij.lang.cacheBuilder.WordsScanner;
import com.intellij.lang.findUsages.FindUsagesProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNamedElement;
import com.intellij.psi.tree.TokenSet;
import com.qmlplugin.language.psi.QmlProperty;
import com.qmlplugin.language.psi.QmlTokenSets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class QmlFindUsagesProvider implements FindUsagesProvider {
    @Nullable
    @Override
    public WordsScanner getWordsScanner() {
        return new DefaultWordsScanner(new QmlLexerAdapter(),
                QmlTokenSets.IDENTIFIERS,
                QmlTokenSets.COMMENTS,
                TokenSet.EMPTY);
    }

    @Override
    public boolean canFindUsagesFor(@NotNull PsiElement psiElement) {
        return psiElement instanceof PsiNamedElement;
    }

    @Nullable
    @Override
    public String getHelpId(@NotNull PsiElement psiElement) {
        return null;
    }

    @NotNull
    @Override
    public String getType(@NotNull PsiElement element) {
        if (element instanceof QmlProperty) {
            return "Qml property";
        }
        return "";
    }

    @NotNull
    @Override
    public String getDescriptiveName(@NotNull PsiElement element) {
        if (element instanceof QmlProperty) {
            return ((QmlProperty) element).getKey();
        }
        return "";
    }

    @NotNull
    @Override
    public String getNodeText(@NotNull PsiElement element, boolean useFullName) {
        if (element instanceof QmlProperty) {
            return ((QmlProperty) element).getKey() +
                    QmlAnnotator.Qml_SEPARATOR_STR +
                    ((QmlProperty) element).getValue();
        }
        return "";
    }

}
