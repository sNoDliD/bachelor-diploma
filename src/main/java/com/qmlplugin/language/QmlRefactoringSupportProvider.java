package com.qmlplugin.language;

import com.intellij.lang.refactoring.RefactoringSupportProvider;
import com.intellij.psi.PsiElement;
import com.qmlplugin.language.psi.QmlProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class QmlRefactoringSupportProvider extends RefactoringSupportProvider {
    @Override
    public boolean isMemberInplaceRenameAvailable(@NotNull PsiElement elementToRename, @Nullable PsiElement context) {
        return (elementToRename instanceof QmlProperty);
    }
}
