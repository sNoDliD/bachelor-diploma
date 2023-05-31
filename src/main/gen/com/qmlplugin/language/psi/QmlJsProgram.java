// This is a generated file. Not intended for manual editing.
package com.qmlplugin.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface QmlJsProgram extends PsiElement {

  @NotNull
  List<QmlFunctionDeclaration> getFunctionDeclarationList();

  @NotNull
  List<QmlIfStatement> getIfStatementList();

  @NotNull
  List<QmlJsExpression> getJsExpressionList();

  @NotNull
  List<QmlJsProgram> getJsProgramList();

  @NotNull
  List<QmlNewStatement> getNewStatementList();

  @NotNull
  List<QmlReturnStatement> getReturnStatementList();

  @NotNull
  List<QmlSwitchStatement> getSwitchStatementList();

  @NotNull
  List<QmlThrowStatement> getThrowStatementList();

  @NotNull
  List<QmlTryCatchStatement> getTryCatchStatementList();

  @NotNull
  List<QmlVariableDeclaration> getVariableDeclarationList();

  @NotNull
  List<QmlWhileStatement> getWhileStatementList();

}
