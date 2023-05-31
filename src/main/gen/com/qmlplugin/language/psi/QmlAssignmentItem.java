// This is a generated file. Not intended for manual editing.
package com.qmlplugin.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface QmlAssignmentItem extends PsiElement {

  @NotNull
  List<QmlAssignmentValue> getAssignmentValueList();

  @NotNull
  QmlObjectName getObjectName();

}
