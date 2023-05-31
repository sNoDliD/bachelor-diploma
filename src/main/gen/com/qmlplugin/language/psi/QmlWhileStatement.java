// This is a generated file. Not intended for manual editing.
package com.qmlplugin.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface QmlWhileStatement extends PsiElement {

  @Nullable
  QmlFunctionDeclaration getFunctionDeclaration();

  @Nullable
  QmlIfStatement getIfStatement();

  @NotNull
  List<QmlJsExpression> getJsExpressionList();

  @Nullable
  QmlJsProgram getJsProgram();

  @Nullable
  QmlNewStatement getNewStatement();

  @Nullable
  QmlReturnStatement getReturnStatement();

  @Nullable
  QmlSwitchStatement getSwitchStatement();

  @Nullable
  QmlThrowStatement getThrowStatement();

  @Nullable
  QmlTryCatchStatement getTryCatchStatement();

  @Nullable
  QmlVariableDeclaration getVariableDeclaration();

  @Nullable
  QmlWhileStatement getWhileStatement();

}
