// This is a generated file. Not intended for manual editing.
package com.qmlplugin.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface QmlConditionalExpression extends PsiElement {

  @NotNull
  List<QmlExpression> getExpressionList();

  @NotNull
  List<QmlUnaryExpression> getUnaryExpressionList();

}
