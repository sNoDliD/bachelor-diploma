// This is a generated file. Not intended for manual editing.
package com.qmlplugin.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.qmlplugin.language.psi.impl.*;

public interface QmlTypes {

  IElementType ARGUMENT_LIST = new QmlElementType("ARGUMENT_LIST");
  IElementType ARRAY_DECLARATION = new QmlElementType("ARRAY_DECLARATION");
  IElementType ASSIGNMENT = new QmlElementType("ASSIGNMENT");
  IElementType BEHAVIOR = new QmlElementType("BEHAVIOR");
  IElementType CASE_STATEMENT = new QmlElementType("CASE_STATEMENT");
  IElementType DEFAULT_STATEMENT = new QmlElementType("DEFAULT_STATEMENT");
  IElementType DOT_CHAIN_NAME = new QmlElementType("DOT_CHAIN_NAME");
  IElementType ENUM_FIELD = new QmlElementType("ENUM_FIELD");
  IElementType EXPRESSION = new QmlElementType("EXPRESSION");
  IElementType FUNCTION_CALL = new QmlElementType("FUNCTION_CALL");
  IElementType FUNCTION_DECLARATION = new QmlElementType("FUNCTION_DECLARATION");
  IElementType ID_FIELD = new QmlElementType("ID_FIELD");
  IElementType IF_STATEMENT = new QmlElementType("IF_STATEMENT");
  IElementType IMPORT_ITEM = new QmlElementType("IMPORT_ITEM");
  IElementType IMPORT_NAME = new QmlElementType("IMPORT_NAME");
  IElementType IMPORT_PATH = new QmlElementType("IMPORT_PATH");
  IElementType IMPORT_VERSION = new QmlElementType("IMPORT_VERSION");
  IElementType JS_EXPRESSION = new QmlElementType("JS_EXPRESSION");
  IElementType JS_PROGRAM = new QmlElementType("JS_PROGRAM");
  IElementType NEW_STATEMENT = new QmlElementType("NEW_STATEMENT");
  IElementType OBJECT_CONTENT = new QmlElementType("OBJECT_CONTENT");
  IElementType OBJECT_NAME = new QmlElementType("OBJECT_NAME");
  IElementType PARAMETER_LIST = new QmlElementType("PARAMETER_LIST");
  IElementType PROPERTY_ALIAS_FIELD = new QmlElementType("PROPERTY_ALIAS_FIELD");
  IElementType PROPERTY_FIELD = new QmlElementType("PROPERTY_FIELD");
  IElementType QML_OBJECT = new QmlElementType("QML_OBJECT");
  IElementType RETURN_STATEMENT = new QmlElementType("RETURN_STATEMENT");
  IElementType ROOT_OBJECT = new QmlElementType("ROOT_OBJECT");
  IElementType SIGNAL_FIELD = new QmlElementType("SIGNAL_FIELD");
  IElementType SWITCH_STATEMENT = new QmlElementType("SWITCH_STATEMENT");
  IElementType THROW_STATEMENT = new QmlElementType("THROW_STATEMENT");
  IElementType TRY_CATCH_STATEMENT = new QmlElementType("TRY_CATCH_STATEMENT");
  IElementType VARIABLE_DECLARATION = new QmlElementType("VARIABLE_DECLARATION");
  IElementType WHILE_STATEMENT = new QmlElementType("WHILE_STATEMENT");

  IElementType AND = new QmlTokenType("&");
  IElementType BASE_TYPE = new QmlTokenType("BASE_TYPE");
  IElementType CATCH = new QmlTokenType("CATCH");
  IElementType COLON = new QmlTokenType(":");
  IElementType COMMA = new QmlTokenType(",");
  IElementType COMMENT = new QmlTokenType("COMMENT");
  IElementType DIV = new QmlTokenType("/");
  IElementType DOT = new QmlTokenType(".");
  IElementType D_EQ = new QmlTokenType("==");
  IElementType D_NOT_EQ = new QmlTokenType("!==");
  IElementType EQ = new QmlTokenType("=");
  IElementType FLOAT = new QmlTokenType("FLOAT");
  IElementType GRATER = new QmlTokenType(">");
  IElementType GRATER_EQ = new QmlTokenType(">=");
  IElementType IDENTIFIER = new QmlTokenType("identifier");
  IElementType INT = new QmlTokenType("INT");
  IElementType KEYWORD = new QmlTokenType("KEYWORD");
  IElementType LAZY_AND = new QmlTokenType("&&");
  IElementType LAZY_OR = new QmlTokenType("||");
  IElementType LB = new QmlTokenType("{");
  IElementType LESS = new QmlTokenType("<");
  IElementType LESS_EQ = new QmlTokenType("<=");
  IElementType LP = new QmlTokenType("(");
  IElementType L_BRACKET = new QmlTokenType("[");
  IElementType MINUS = new QmlTokenType("-");
  IElementType MULT = new QmlTokenType("*");
  IElementType NEW_LINE = new QmlTokenType("NEW_LINE");
  IElementType NOT = new QmlTokenType("!");
  IElementType NOT_EQ = new QmlTokenType("!=");
  IElementType OR = new QmlTokenType("|");
  IElementType PERCENT = new QmlTokenType("%");
  IElementType PLUS = new QmlTokenType("+");
  IElementType Q_MARK = new QmlTokenType("?");
  IElementType RB = new QmlTokenType("}");
  IElementType RP = new QmlTokenType(")");
  IElementType R_BRACKET = new QmlTokenType("]");
  IElementType SEMI = new QmlTokenType(";");
  IElementType STRING = new QmlTokenType("string");
  IElementType T_EQ = new QmlTokenType("===");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ARGUMENT_LIST) {
        return new QmlArgumentListImpl(node);
      }
      else if (type == ARRAY_DECLARATION) {
        return new QmlArrayDeclarationImpl(node);
      }
      else if (type == ASSIGNMENT) {
        return new QmlAssignmentImpl(node);
      }
      else if (type == BEHAVIOR) {
        return new QmlBehaviorImpl(node);
      }
      else if (type == CASE_STATEMENT) {
        return new QmlCaseStatementImpl(node);
      }
      else if (type == DEFAULT_STATEMENT) {
        return new QmlDefaultStatementImpl(node);
      }
      else if (type == DOT_CHAIN_NAME) {
        return new QmlDotChainNameImpl(node);
      }
      else if (type == ENUM_FIELD) {
        return new QmlEnumFieldImpl(node);
      }
      else if (type == EXPRESSION) {
        return new QmlExpressionImpl(node);
      }
      else if (type == FUNCTION_CALL) {
        return new QmlFunctionCallImpl(node);
      }
      else if (type == FUNCTION_DECLARATION) {
        return new QmlFunctionDeclarationImpl(node);
      }
      else if (type == ID_FIELD) {
        return new QmlIdFieldImpl(node);
      }
      else if (type == IF_STATEMENT) {
        return new QmlIfStatementImpl(node);
      }
      else if (type == IMPORT_ITEM) {
        return new QmlImportItemImpl(node);
      }
      else if (type == IMPORT_NAME) {
        return new QmlImportNameImpl(node);
      }
      else if (type == IMPORT_PATH) {
        return new QmlImportPathImpl(node);
      }
      else if (type == IMPORT_VERSION) {
        return new QmlImportVersionImpl(node);
      }
      else if (type == JS_EXPRESSION) {
        return new QmlJsExpressionImpl(node);
      }
      else if (type == JS_PROGRAM) {
        return new QmlJsProgramImpl(node);
      }
      else if (type == NEW_STATEMENT) {
        return new QmlNewStatementImpl(node);
      }
      else if (type == OBJECT_CONTENT) {
        return new QmlObjectContentImpl(node);
      }
      else if (type == OBJECT_NAME) {
        return new QmlObjectNameImpl(node);
      }
      else if (type == PARAMETER_LIST) {
        return new QmlParameterListImpl(node);
      }
      else if (type == PROPERTY_ALIAS_FIELD) {
        return new QmlPropertyAliasFieldImpl(node);
      }
      else if (type == PROPERTY_FIELD) {
        return new QmlPropertyFieldImpl(node);
      }
      else if (type == QML_OBJECT) {
        return new QmlQmlObjectImpl(node);
      }
      else if (type == RETURN_STATEMENT) {
        return new QmlReturnStatementImpl(node);
      }
      else if (type == ROOT_OBJECT) {
        return new QmlRootObjectImpl(node);
      }
      else if (type == SIGNAL_FIELD) {
        return new QmlSignalFieldImpl(node);
      }
      else if (type == SWITCH_STATEMENT) {
        return new QmlSwitchStatementImpl(node);
      }
      else if (type == THROW_STATEMENT) {
        return new QmlThrowStatementImpl(node);
      }
      else if (type == TRY_CATCH_STATEMENT) {
        return new QmlTryCatchStatementImpl(node);
      }
      else if (type == VARIABLE_DECLARATION) {
        return new QmlVariableDeclarationImpl(node);
      }
      else if (type == WHILE_STATEMENT) {
        return new QmlWhileStatementImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
