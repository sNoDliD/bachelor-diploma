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

public class QmlJsExpressionImpl extends ASTWrapperPsiElement implements QmlJsExpression {

  public QmlJsExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull QmlVisitor visitor) {
    visitor.visitJsExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof QmlVisitor) accept((QmlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public QmlArrayDeclaration getArrayDeclaration() {
    return findChildByClass(QmlArrayDeclaration.class);
  }

  @Override
  @Nullable
  public QmlExpression getExpression() {
    return findChildByClass(QmlExpression.class);
  }

  @Override
  @Nullable
  public QmlFunctionCall getFunctionCall() {
    return findChildByClass(QmlFunctionCall.class);
  }

  @Override
  @Nullable
  public QmlFunctionDeclaration getFunctionDeclaration() {
    return findChildByClass(QmlFunctionDeclaration.class);
  }

  @Override
  @Nullable
  public QmlJsExpression getJsExpression() {
    return findChildByClass(QmlJsExpression.class);
  }

}
