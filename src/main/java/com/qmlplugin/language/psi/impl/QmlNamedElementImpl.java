package com.qmlplugin.language.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.qmlplugin.language.psi.QmlNamedElement;
import org.jetbrains.annotations.NotNull;

public abstract class QmlNamedElementImpl extends ASTWrapperPsiElement implements QmlNamedElement {

    public QmlNamedElementImpl(@NotNull ASTNode node) {
        super(node);
    }

}
