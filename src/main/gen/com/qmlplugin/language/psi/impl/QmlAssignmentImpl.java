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

public class QmlAssignmentImpl extends ASTWrapperPsiElement implements QmlAssignment {

  public QmlAssignmentImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull QmlVisitor visitor) {
    visitor.visitAssignment(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof QmlVisitor) accept((QmlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public QmlFunctionDeclaration getFunctionDeclaration() {
    return findChildByClass(QmlFunctionDeclaration.class);
  }

  @Override
  @Nullable
  public QmlIfStatement getIfStatement() {
    return findChildByClass(QmlIfStatement.class);
  }

  @Override
  @Nullable
  public QmlJsExpression getJsExpression() {
    return findChildByClass(QmlJsExpression.class);
  }

  @Override
  @Nullable
  public QmlJsProgram getJsProgram() {
    return findChildByClass(QmlJsProgram.class);
  }

  @Override
  @Nullable
  public QmlNewStatement getNewStatement() {
    return findChildByClass(QmlNewStatement.class);
  }

  @Override
  @Nullable
  public QmlReturnStatement getReturnStatement() {
    return findChildByClass(QmlReturnStatement.class);
  }

  @Override
  @Nullable
  public QmlSwitchStatement getSwitchStatement() {
    return findChildByClass(QmlSwitchStatement.class);
  }

  @Override
  @Nullable
  public QmlThrowStatement getThrowStatement() {
    return findChildByClass(QmlThrowStatement.class);
  }

  @Override
  @Nullable
  public QmlTryCatchStatement getTryCatchStatement() {
    return findChildByClass(QmlTryCatchStatement.class);
  }

  @Override
  @Nullable
  public QmlVariableDeclaration getVariableDeclaration() {
    return findChildByClass(QmlVariableDeclaration.class);
  }

  @Override
  @Nullable
  public QmlWhileStatement getWhileStatement() {
    return findChildByClass(QmlWhileStatement.class);
  }

}
