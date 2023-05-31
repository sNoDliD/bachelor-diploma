// This is a generated file. Not intended for manual editing.
package com.qmlplugin.language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.qmlplugin.language.psi.QmlTypes.*;
import com.qmlplugin.language.psi.*;
import com.intellij.navigation.ItemPresentation;

public class QmlPropertyImpl extends QmlNamedElementImpl implements QmlProperty {

  public QmlPropertyImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull QmlVisitor visitor) {
//    visitor.visitProperty(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof QmlVisitor) accept((QmlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  public String getKey() {
    return QmlPsiImplUtil.getKey(this);
  }

  @Override
  public String getValue() {
    return null;
//    return QmlPsiImplUtil.getValue(this);
  }

  @Override
  public String getName() {
    return QmlPsiImplUtil.getName(this);
  }

  @Override
  public PsiElement setName(String newName) {
    return QmlPsiImplUtil.setName(this, newName);
  }

  @Override
  public PsiElement getNameIdentifier() {
    return QmlPsiImplUtil.getNameIdentifier(this);
  }

  @Override
  public ItemPresentation getPresentation() {
    return QmlPsiImplUtil.getPresentation(this);
  }

}
