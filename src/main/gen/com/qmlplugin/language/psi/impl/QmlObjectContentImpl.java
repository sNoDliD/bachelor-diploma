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

public class QmlObjectContentImpl extends ASTWrapperPsiElement implements QmlObjectContent {

  public QmlObjectContentImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull QmlVisitor visitor) {
    visitor.visitObjectContent(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof QmlVisitor) accept((QmlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public QmlAssignment getAssignment() {
    return findChildByClass(QmlAssignment.class);
  }

  @Override
  @Nullable
  public QmlBehavior getBehavior() {
    return findChildByClass(QmlBehavior.class);
  }

  @Override
  @Nullable
  public QmlEnumField getEnumField() {
    return findChildByClass(QmlEnumField.class);
  }

  @Override
  @Nullable
  public QmlFunctionDeclaration getFunctionDeclaration() {
    return findChildByClass(QmlFunctionDeclaration.class);
  }

  @Override
  @Nullable
  public QmlIdField getIdField() {
    return findChildByClass(QmlIdField.class);
  }

  @Override
  @Nullable
  public QmlObjectName getObjectName() {
    return findChildByClass(QmlObjectName.class);
  }

  @Override
  @Nullable
  public QmlPropertyAliasField getPropertyAliasField() {
    return findChildByClass(QmlPropertyAliasField.class);
  }

  @Override
  @Nullable
  public QmlPropertyField getPropertyField() {
    return findChildByClass(QmlPropertyField.class);
  }

  @Override
  @Nullable
  public QmlQmlObject getQmlObject() {
    return findChildByClass(QmlQmlObject.class);
  }

  @Override
  @Nullable
  public QmlSignalField getSignalField() {
    return findChildByClass(QmlSignalField.class);
  }

}
