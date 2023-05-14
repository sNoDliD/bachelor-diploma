// This is a generated file. Not intended for manual editing.
package com.qmlplugin.language.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;

public class QmlVisitor extends PsiElementVisitor {

  public void visitProperty(@NotNull QmlProperty o) {
    visitNamedElement(o);
  }

  public void visitNamedElement(@NotNull QmlNamedElement o) {
    visitPsiElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
