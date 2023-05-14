// This is a generated file. Not intended for manual editing.
package com.qmlplugin.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.qmlplugin.language.psi.impl.*;

public interface QmlTypes {

  IElementType PROPERTY = new QmlElementType("PROPERTY");

  IElementType COMMENT = new QmlTokenType("COMMENT");
  IElementType CRLF = new QmlTokenType("CRLF");
  IElementType KEY = new QmlTokenType("KEY");
  IElementType KEYWORD = new QmlTokenType("KEYWORD");
  IElementType SEPARATOR = new QmlTokenType("SEPARATOR");
  IElementType VALUE = new QmlTokenType("VALUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == PROPERTY) {
        return new QmlPropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
