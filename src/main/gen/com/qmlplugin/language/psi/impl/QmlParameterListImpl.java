// This is a generated file. Not intended for manual editing.
package com.qmlplugin.language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.qmlplugin.language.psi.QmlTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.qmlplugin.language.psi.*;

public class QmlParameterListImpl extends ASTWrapperPsiElement implements QmlParameterList {

  public QmlParameterListImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull QmlVisitor visitor) {
    visitor.visitParameterList(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof QmlVisitor) accept((QmlVisitor)visitor);
    else super.accept(visitor);
  }

}
