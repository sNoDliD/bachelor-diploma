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

public class QmlJsProgramImpl extends ASTWrapperPsiElement implements QmlJsProgram {

  public QmlJsProgramImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull QmlVisitor visitor) {
    visitor.visitJsProgram(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof QmlVisitor) accept((QmlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<QmlFunctionDeclaration> getFunctionDeclarationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, QmlFunctionDeclaration.class);
  }

  @Override
  @NotNull
  public List<QmlIfStatement> getIfStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, QmlIfStatement.class);
  }

  @Override
  @NotNull
  public List<QmlJsExpression> getJsExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, QmlJsExpression.class);
  }

  @Override
  @NotNull
  public List<QmlJsProgram> getJsProgramList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, QmlJsProgram.class);
  }

  @Override
  @NotNull
  public List<QmlNewStatement> getNewStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, QmlNewStatement.class);
  }

  @Override
  @NotNull
  public List<QmlReturnStatement> getReturnStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, QmlReturnStatement.class);
  }

  @Override
  @NotNull
  public List<QmlSwitchStatement> getSwitchStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, QmlSwitchStatement.class);
  }

  @Override
  @NotNull
  public List<QmlThrowStatement> getThrowStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, QmlThrowStatement.class);
  }

  @Override
  @NotNull
  public List<QmlTryCatchStatement> getTryCatchStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, QmlTryCatchStatement.class);
  }

  @Override
  @NotNull
  public List<QmlVariableDeclaration> getVariableDeclarationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, QmlVariableDeclaration.class);
  }

  @Override
  @NotNull
  public List<QmlWhileStatement> getWhileStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, QmlWhileStatement.class);
  }

}
