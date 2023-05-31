// This is a generated file. Not intended for manual editing.
package com.qmlplugin.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface QmlObjectContent extends PsiElement {

  @Nullable
  QmlAssignment getAssignment();

  @Nullable
  QmlBehavior getBehavior();

  @Nullable
  QmlEnumField getEnumField();

  @Nullable
  QmlFunctionDeclaration getFunctionDeclaration();

  @Nullable
  QmlIdField getIdField();

  @Nullable
  QmlObjectName getObjectName();

  @Nullable
  QmlPropertyAliasField getPropertyAliasField();

  @Nullable
  QmlPropertyField getPropertyField();

  @Nullable
  QmlQmlObject getQmlObject();

  @Nullable
  QmlSignalField getSignalField();

}
