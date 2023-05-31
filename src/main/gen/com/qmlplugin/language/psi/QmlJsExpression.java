// This is a generated file. Not intended for manual editing.
package com.qmlplugin.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface QmlJsExpression extends PsiElement {

  @Nullable
  QmlArrayDeclaration getArrayDeclaration();

  @Nullable
  QmlExpression getExpression();

  @Nullable
  QmlFunctionCall getFunctionCall();

  @Nullable
  QmlFunctionDeclaration getFunctionDeclaration();

  @Nullable
  QmlJsExpression getJsExpression();

}
