package com.qmlplugin.language;

import com.intellij.ide.IconProvider;
import com.intellij.psi.PsiElement;
import com.qmlplugin.language.psi.QmlProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class QmlPropertyIconProvider extends IconProvider {
    @Override
    public @Nullable Icon getIcon(@NotNull PsiElement element, int flags) {
        return element instanceof QmlProperty ? QmlIcons.FILE : null;
    }
}
