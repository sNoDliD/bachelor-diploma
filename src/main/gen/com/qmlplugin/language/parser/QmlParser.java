// This is a generated file. Not intended for manual editing.
package com.qmlplugin.language.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.qmlplugin.language.psi.QmlTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class QmlParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return root(b, l + 1);
  }

  /* ********************************************************** */
  // multiplicativeExpression ((PLUS | MINUS) multiplicativeExpression)*
  static boolean additiveExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "additiveExpression")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = multiplicativeExpression(b, l + 1);
    r = r && additiveExpression_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ((PLUS | MINUS) multiplicativeExpression)*
  private static boolean additiveExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "additiveExpression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!additiveExpression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "additiveExpression_1", c)) break;
    }
    return true;
  }

  // (PLUS | MINUS) multiplicativeExpression
  private static boolean additiveExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "additiveExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = additiveExpression_1_0_0(b, l + 1);
    r = r && multiplicativeExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // PLUS | MINUS
  private static boolean additiveExpression_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "additiveExpression_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, PLUS);
    if (!r) r = consumeToken(b, MINUS);
    return r;
  }

  /* ********************************************************** */
  // js_expression_for_function ((NEW_LINE| COMMENT)* COMMA NEW_LINE* js_expression_for_function )* &RP
  public static boolean argumentList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argumentList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARGUMENT_LIST, "<argument list>");
    r = js_expression_for_function(b, l + 1);
    r = r && argumentList_1(b, l + 1);
    r = r && argumentList_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ((NEW_LINE| COMMENT)* COMMA NEW_LINE* js_expression_for_function )*
  private static boolean argumentList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argumentList_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!argumentList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "argumentList_1", c)) break;
    }
    return true;
  }

  // (NEW_LINE| COMMENT)* COMMA NEW_LINE* js_expression_for_function
  private static boolean argumentList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argumentList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = argumentList_1_0_0(b, l + 1);
    r = r && consumeToken(b, COMMA);
    r = r && argumentList_1_0_2(b, l + 1);
    r = r && js_expression_for_function(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (NEW_LINE| COMMENT)*
  private static boolean argumentList_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argumentList_1_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!argumentList_1_0_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "argumentList_1_0_0", c)) break;
    }
    return true;
  }

  // NEW_LINE| COMMENT
  private static boolean argumentList_1_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argumentList_1_0_0_0")) return false;
    boolean r;
    r = consumeToken(b, NEW_LINE);
    if (!r) r = consumeToken(b, COMMENT);
    return r;
  }

  // NEW_LINE*
  private static boolean argumentList_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argumentList_1_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NEW_LINE)) break;
      if (!empty_element_parsed_guard_(b, "argumentList_1_0_2", c)) break;
    }
    return true;
  }

  // &RP
  private static boolean argumentList_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argumentList_2")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = consumeToken(b, RP);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // L_BRACKET (js_expression (COMMA js_expression)*)? R_BRACKET
  public static boolean arrayDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayDeclaration")) return false;
    if (!nextTokenIs(b, L_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, L_BRACKET);
    r = r && arrayDeclaration_1(b, l + 1);
    r = r && consumeToken(b, R_BRACKET);
    exit_section_(b, m, ARRAY_DECLARATION, r);
    return r;
  }

  // (js_expression (COMMA js_expression)*)?
  private static boolean arrayDeclaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayDeclaration_1")) return false;
    arrayDeclaration_1_0(b, l + 1);
    return true;
  }

  // js_expression (COMMA js_expression)*
  private static boolean arrayDeclaration_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayDeclaration_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = js_expression(b, l + 1);
    r = r && arrayDeclaration_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA js_expression)*
  private static boolean arrayDeclaration_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayDeclaration_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!arrayDeclaration_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "arrayDeclaration_1_0_1", c)) break;
    }
    return true;
  }

  // COMMA js_expression
  private static boolean arrayDeclaration_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayDeclaration_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && js_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // COLON (&LB js_program | statement)
  public static boolean assignment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignment")) return false;
    if (!nextTokenIs(b, COLON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && assignment_1(b, l + 1);
    exit_section_(b, m, ASSIGNMENT, r);
    return r;
  }

  // &LB js_program | statement
  private static boolean assignment_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignment_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = assignment_1_0(b, l + 1);
    if (!r) r = statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // &LB js_program
  private static boolean assignment_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignment_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = assignment_1_0_0(b, l + 1);
    r = r && js_program(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // &LB
  private static boolean assignment_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignment_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = consumeToken(b, LB);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "Behavior" "on" dot_chain_name (LB (free_space | (object_name qml_object))* RB)
  public static boolean behavior(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "behavior")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BEHAVIOR, "<behavior>");
    r = consumeToken(b, "Behavior");
    r = r && consumeToken(b, "on");
    r = r && dot_chain_name(b, l + 1);
    r = r && behavior_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // LB (free_space | (object_name qml_object))* RB
  private static boolean behavior_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "behavior_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LB);
    r = r && behavior_3_1(b, l + 1);
    r = r && consumeToken(b, RB);
    exit_section_(b, m, null, r);
    return r;
  }

  // (free_space | (object_name qml_object))*
  private static boolean behavior_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "behavior_3_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!behavior_3_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "behavior_3_1", c)) break;
    }
    return true;
  }

  // free_space | (object_name qml_object)
  private static boolean behavior_3_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "behavior_3_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = free_space(b, l + 1);
    if (!r) r = behavior_3_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // object_name qml_object
  private static boolean behavior_3_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "behavior_3_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = object_name(b, l + 1);
    r = r && qml_object(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LB js_program  RB
  static boolean bracket_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bracket_statement")) return false;
    if (!nextTokenIs(b, LB)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LB);
    r = r && js_program(b, l + 1);
    r = r && consumeToken(b, RB);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "case" js_expression COLON js_program
  public static boolean caseStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "caseStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CASE_STATEMENT, "<case statement>");
    r = consumeToken(b, "case");
    r = r && js_expression(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && js_program(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // logicalExpression (Q_MARK expression COLON expression)*
  static boolean conditionalExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditionalExpression")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = logicalExpression(b, l + 1);
    r = r && conditionalExpression_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (Q_MARK expression COLON expression)*
  private static boolean conditionalExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditionalExpression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!conditionalExpression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "conditionalExpression_1", c)) break;
    }
    return true;
  }

  // Q_MARK expression COLON expression
  private static boolean conditionalExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditionalExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, Q_MARK);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "default" COLON js_program
  public static boolean defaultStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defaultStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DEFAULT_STATEMENT, "<default statement>");
    r = consumeToken(b, "default");
    r = r && consumeToken(b, COLON);
    r = r && js_program(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // identifier (DOT identifier)*
  public static boolean dot_chain_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dot_chain_name")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && dot_chain_name_1(b, l + 1);
    exit_section_(b, m, DOT_CHAIN_NAME, r);
    return r;
  }

  // (DOT identifier)*
  private static boolean dot_chain_name_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dot_chain_name_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!dot_chain_name_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "dot_chain_name_1", c)) break;
    }
    return true;
  }

  // DOT identifier
  private static boolean dot_chain_name_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dot_chain_name_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DOT, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "enum" IDENTIFIER LB (NEW_LINE | COMMENT)+ IDENTIFIER (skip COMMA skip IDENTIFIER)* skip RB
  public static boolean enum_field(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_field")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ENUM_FIELD, "<enum field>");
    r = consumeToken(b, "enum");
    p = r; // pin = 1
    r = r && report_error_(b, consumeTokens(b, -1, IDENTIFIER, LB));
    r = p && report_error_(b, enum_field_3(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, IDENTIFIER)) && r;
    r = p && report_error_(b, enum_field_5(b, l + 1)) && r;
    r = p && report_error_(b, skip(b, l + 1)) && r;
    r = p && consumeToken(b, RB) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (NEW_LINE | COMMENT)+
  private static boolean enum_field_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_field_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = enum_field_3_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!enum_field_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "enum_field_3", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // NEW_LINE | COMMENT
  private static boolean enum_field_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_field_3_0")) return false;
    boolean r;
    r = consumeToken(b, NEW_LINE);
    if (!r) r = consumeToken(b, COMMENT);
    return r;
  }

  // (skip COMMA skip IDENTIFIER)*
  private static boolean enum_field_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_field_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!enum_field_5_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "enum_field_5", c)) break;
    }
    return true;
  }

  // skip COMMA skip IDENTIFIER
  private static boolean enum_field_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_field_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = skip(b, l + 1);
    r = r && consumeToken(b, COMMA);
    r = r && skip(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // relationalExpression ((D_EQ | T_EQ | NOT_EQ | D_NOT_EQ) relationalExpression)*
  static boolean equalityExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "equalityExpression")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = relationalExpression(b, l + 1);
    r = r && equalityExpression_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ((D_EQ | T_EQ | NOT_EQ | D_NOT_EQ) relationalExpression)*
  private static boolean equalityExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "equalityExpression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!equalityExpression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "equalityExpression_1", c)) break;
    }
    return true;
  }

  // (D_EQ | T_EQ | NOT_EQ | D_NOT_EQ) relationalExpression
  private static boolean equalityExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "equalityExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = equalityExpression_1_0_0(b, l + 1);
    r = r && relationalExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // D_EQ | T_EQ | NOT_EQ | D_NOT_EQ
  private static boolean equalityExpression_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "equalityExpression_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, D_EQ);
    if (!r) r = consumeToken(b, T_EQ);
    if (!r) r = consumeToken(b, NOT_EQ);
    if (!r) r = consumeToken(b, D_NOT_EQ);
    return r;
  }

  /* ********************************************************** */
  // conditionalExpression
  public static boolean expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, EXPRESSION, "<expression>");
    r = conditionalExpression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // NEW_LINE | SEMI | COMMENT
  static boolean free_space(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "free_space")) return false;
    boolean r;
    r = consumeToken(b, NEW_LINE);
    if (!r) r = consumeToken(b, SEMI);
    if (!r) r = consumeToken(b, COMMENT);
    return r;
  }

  /* ********************************************************** */
  // dot_chain_name LP argumentList? RP
  public static boolean functionCall(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionCall")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_CALL, null);
    r = dot_chain_name(b, l + 1);
    r = r && consumeToken(b, LP);
    p = r; // pin = 2
    r = r && report_error_(b, functionCall_2(b, l + 1));
    r = p && consumeToken(b, RP) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // argumentList?
  private static boolean functionCall_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionCall_2")) return false;
    argumentList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // "function" dot_chain_name? LP parameterList? RP LB (NEW_LINE | COMMENT)* js_program RB
  public static boolean functionDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionDeclaration")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_DECLARATION, "<function declaration>");
    r = consumeToken(b, "function");
    p = r; // pin = 1
    r = r && report_error_(b, functionDeclaration_1(b, l + 1));
    r = p && report_error_(b, consumeToken(b, LP)) && r;
    r = p && report_error_(b, functionDeclaration_3(b, l + 1)) && r;
    r = p && report_error_(b, consumeTokens(b, -1, RP, LB)) && r;
    r = p && report_error_(b, functionDeclaration_6(b, l + 1)) && r;
    r = p && report_error_(b, js_program(b, l + 1)) && r;
    r = p && consumeToken(b, RB) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // dot_chain_name?
  private static boolean functionDeclaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionDeclaration_1")) return false;
    dot_chain_name(b, l + 1);
    return true;
  }

  // parameterList?
  private static boolean functionDeclaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionDeclaration_3")) return false;
    parameterList(b, l + 1);
    return true;
  }

  // (NEW_LINE | COMMENT)*
  private static boolean functionDeclaration_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionDeclaration_6")) return false;
    while (true) {
      int c = current_position_(b);
      if (!functionDeclaration_6_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "functionDeclaration_6", c)) break;
    }
    return true;
  }

  // NEW_LINE | COMMENT
  private static boolean functionDeclaration_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionDeclaration_6_0")) return false;
    boolean r;
    r = consumeToken(b, NEW_LINE);
    if (!r) r = consumeToken(b, COMMENT);
    return r;
  }

  /* ********************************************************** */
  // &(dot_chain_name LP)
  static boolean function_call_lookup(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_call_lookup")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = function_call_lookup_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // dot_chain_name LP
  private static boolean function_call_lookup_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_call_lookup_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = dot_chain_name(b, l + 1);
    r = r && consumeToken(b, LP);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "id" COLON identifier
  public static boolean id_field(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "id_field")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ID_FIELD, "<id field>");
    r = consumeToken(b, "id");
    p = r; // pin = 1
    r = r && report_error_(b, consumeTokens(b, -1, COLON, IDENTIFIER));
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // "if" LP js_expression RP js_program ("else" js_program)?
  public static boolean ifStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IF_STATEMENT, "<if statement>");
    r = consumeToken(b, "if");
    r = r && consumeToken(b, LP);
    r = r && js_expression(b, l + 1);
    r = r && consumeToken(b, RP);
    r = r && js_program(b, l + 1);
    r = r && ifStatement_5(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ("else" js_program)?
  private static boolean ifStatement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifStatement_5")) return false;
    ifStatement_5_0(b, l + 1);
    return true;
  }

  // "else" js_program
  private static boolean ifStatement_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifStatement_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "else");
    r = r && js_program(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "import" COMMENT* import_location ["as" identifier]
  public static boolean import_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_item")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, IMPORT_ITEM, "<import item>");
    r = consumeToken(b, "import");
    p = r; // pin = 1
    r = r && report_error_(b, import_item_1(b, l + 1));
    r = p && report_error_(b, import_location(b, l + 1)) && r;
    r = p && import_item_3(b, l + 1) && r;
    exit_section_(b, l, m, r, p, QmlParser::import_item_recover);
    return r || p;
  }

  // COMMENT*
  private static boolean import_item_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_item_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, COMMENT)) break;
      if (!empty_element_parsed_guard_(b, "import_item_1", c)) break;
    }
    return true;
  }

  // ["as" identifier]
  private static boolean import_item_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_item_3")) return false;
    import_item_3_0(b, l + 1);
    return true;
  }

  // "as" identifier
  private static boolean import_item_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_item_3_0")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, "as");
    p = r; // pin = 1
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // !(NEW_LINE | SEMI)
  static boolean import_item_recover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_item_recover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !import_item_recover_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // NEW_LINE | SEMI
  private static boolean import_item_recover_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_item_recover_0")) return false;
    boolean r;
    r = consumeToken(b, NEW_LINE);
    if (!r) r = consumeToken(b, SEMI);
    return r;
  }

  /* ********************************************************** */
  // import_version | import_path
  static boolean import_location(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_location")) return false;
    if (!nextTokenIs(b, "", IDENTIFIER, STRING)) return false;
    boolean r;
    r = import_version(b, l + 1);
    if (!r) r = import_path(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // identifier [DOT identifier]
  public static boolean import_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_name")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, IMPORT_NAME, "<import name>");
    r = consumeToken(b, IDENTIFIER);
    p = r; // pin = 1
    r = r && import_name_1(b, l + 1);
    exit_section_(b, l, m, r, p, QmlParser::import_name_recover);
    return r || p;
  }

  // [DOT identifier]
  private static boolean import_name_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_name_1")) return false;
    parseTokens(b, 0, DOT, IDENTIFIER);
    return true;
  }

  /* ********************************************************** */
  // !(NEW_LINE | FLOAT)
  static boolean import_name_recover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_name_recover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !import_name_recover_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // NEW_LINE | FLOAT
  private static boolean import_name_recover_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_name_recover_0")) return false;
    boolean r;
    r = consumeToken(b, NEW_LINE);
    if (!r) r = consumeToken(b, FLOAT);
    return r;
  }

  /* ********************************************************** */
  // string
  public static boolean import_path(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_path")) return false;
    if (!nextTokenIs(b, STRING)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING);
    exit_section_(b, m, IMPORT_PATH, r);
    return r;
  }

  /* ********************************************************** */
  // import_name (FLOAT | INT)
  public static boolean import_version(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_version")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, IMPORT_VERSION, null);
    r = import_name(b, l + 1);
    p = r; // pin = 1
    r = r && import_version_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // FLOAT | INT
  private static boolean import_version_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_version_1")) return false;
    boolean r;
    r = consumeToken(b, FLOAT);
    if (!r) r = consumeToken(b, INT);
    return r;
  }

  /* ********************************************************** */
  // (NEW_LINE | COMMENT | (import_item SEMI?))*
  static boolean imports(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "imports")) return false;
    while (true) {
      int c = current_position_(b);
      if (!imports_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "imports", c)) break;
    }
    return true;
  }

  // NEW_LINE | COMMENT | (import_item SEMI?)
  private static boolean imports_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "imports_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NEW_LINE);
    if (!r) r = consumeToken(b, COMMENT);
    if (!r) r = imports_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // import_item SEMI?
  private static boolean imports_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "imports_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = import_item(b, l + 1);
    r = r && imports_0_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // SEMI?
  private static boolean imports_0_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "imports_0_2_1")) return false;
    consumeToken(b, SEMI);
    return true;
  }

  /* ********************************************************** */
  // functionDeclaration | LP js_expression RP | arrayDeclaration
  //                 | function_call_lookup functionCall
  //                 | expression
  public static boolean js_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "js_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, JS_EXPRESSION, "<js expression>");
    r = functionDeclaration(b, l + 1);
    if (!r) r = js_expression_1(b, l + 1);
    if (!r) r = arrayDeclaration(b, l + 1);
    if (!r) r = js_expression_3(b, l + 1);
    if (!r) r = expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // LP js_expression RP
  private static boolean js_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "js_expression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LP);
    r = r && js_expression(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, null, r);
    return r;
  }

  // function_call_lookup functionCall
  private static boolean js_expression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "js_expression_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = function_call_lookup(b, l + 1);
    r = r && functionCall(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // arrayDeclaration
  //             | function_call_lookup functionCall | expression
  static boolean js_expression_for_function(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "js_expression_for_function")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = arrayDeclaration(b, l + 1);
    if (!r) r = js_expression_for_function_1(b, l + 1);
    if (!r) r = expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // function_call_lookup functionCall
  private static boolean js_expression_for_function_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "js_expression_for_function_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = function_call_lookup(b, l + 1);
    r = r && functionCall(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (statement required_end (NEW_LINE | COMMENT | SEMI)*)* statement?
  public static boolean js_program(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "js_program")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, JS_PROGRAM, "<js program>");
    r = js_program_0(b, l + 1);
    r = r && js_program_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (statement required_end (NEW_LINE | COMMENT | SEMI)*)*
  private static boolean js_program_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "js_program_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!js_program_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "js_program_0", c)) break;
    }
    return true;
  }

  // statement required_end (NEW_LINE | COMMENT | SEMI)*
  private static boolean js_program_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "js_program_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = statement(b, l + 1);
    r = r && required_end(b, l + 1);
    r = r && js_program_0_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (NEW_LINE | COMMENT | SEMI)*
  private static boolean js_program_0_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "js_program_0_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!js_program_0_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "js_program_0_0_2", c)) break;
    }
    return true;
  }

  // NEW_LINE | COMMENT | SEMI
  private static boolean js_program_0_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "js_program_0_0_2_0")) return false;
    boolean r;
    r = consumeToken(b, NEW_LINE);
    if (!r) r = consumeToken(b, COMMENT);
    if (!r) r = consumeToken(b, SEMI);
    return r;
  }

  // statement?
  private static boolean js_program_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "js_program_1")) return false;
    statement(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // STRING | FLOAT | INT
  static boolean literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal")) return false;
    boolean r;
    r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, FLOAT);
    if (!r) r = consumeToken(b, INT);
    return r;
  }

  /* ********************************************************** */
  // equalityExpression (NEW_LINE | COMMENT)* ((OR | LAZY_OR| AND | LAZY_AND) (NEW_LINE | COMMENT)* equalityExpression)*
  static boolean logicalExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "logicalExpression")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = equalityExpression(b, l + 1);
    r = r && logicalExpression_1(b, l + 1);
    r = r && logicalExpression_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (NEW_LINE | COMMENT)*
  private static boolean logicalExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "logicalExpression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!logicalExpression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "logicalExpression_1", c)) break;
    }
    return true;
  }

  // NEW_LINE | COMMENT
  private static boolean logicalExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "logicalExpression_1_0")) return false;
    boolean r;
    r = consumeToken(b, NEW_LINE);
    if (!r) r = consumeToken(b, COMMENT);
    return r;
  }

  // ((OR | LAZY_OR| AND | LAZY_AND) (NEW_LINE | COMMENT)* equalityExpression)*
  private static boolean logicalExpression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "logicalExpression_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!logicalExpression_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "logicalExpression_2", c)) break;
    }
    return true;
  }

  // (OR | LAZY_OR| AND | LAZY_AND) (NEW_LINE | COMMENT)* equalityExpression
  private static boolean logicalExpression_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "logicalExpression_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = logicalExpression_2_0_0(b, l + 1);
    r = r && logicalExpression_2_0_1(b, l + 1);
    r = r && equalityExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // OR | LAZY_OR| AND | LAZY_AND
  private static boolean logicalExpression_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "logicalExpression_2_0_0")) return false;
    boolean r;
    r = consumeToken(b, OR);
    if (!r) r = consumeToken(b, LAZY_OR);
    if (!r) r = consumeToken(b, AND);
    if (!r) r = consumeToken(b, LAZY_AND);
    return r;
  }

  // (NEW_LINE | COMMENT)*
  private static boolean logicalExpression_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "logicalExpression_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!logicalExpression_2_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "logicalExpression_2_0_1", c)) break;
    }
    return true;
  }

  // NEW_LINE | COMMENT
  private static boolean logicalExpression_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "logicalExpression_2_0_1_0")) return false;
    boolean r;
    r = consumeToken(b, NEW_LINE);
    if (!r) r = consumeToken(b, COMMENT);
    return r;
  }

  /* ********************************************************** */
  // unaryExpression  ((MULT | DIV | PERCENT) unaryExpression)*
  static boolean multiplicativeExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multiplicativeExpression")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = unaryExpression(b, l + 1);
    r = r && multiplicativeExpression_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ((MULT | DIV | PERCENT) unaryExpression)*
  private static boolean multiplicativeExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multiplicativeExpression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!multiplicativeExpression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "multiplicativeExpression_1", c)) break;
    }
    return true;
  }

  // (MULT | DIV | PERCENT) unaryExpression
  private static boolean multiplicativeExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multiplicativeExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = multiplicativeExpression_1_0_0(b, l + 1);
    r = r && unaryExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // MULT | DIV | PERCENT
  private static boolean multiplicativeExpression_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multiplicativeExpression_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, MULT);
    if (!r) r = consumeToken(b, DIV);
    if (!r) r = consumeToken(b, PERCENT);
    return r;
  }

  /* ********************************************************** */
  // "new" IDENTIFIER [LP argumentList? RP]
  public static boolean new_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "new_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NEW_STATEMENT, "<new statement>");
    r = consumeToken(b, "new");
    r = r && consumeToken(b, IDENTIFIER);
    r = r && new_statement_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [LP argumentList? RP]
  private static boolean new_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "new_statement_2")) return false;
    new_statement_2_0(b, l + 1);
    return true;
  }

  // LP argumentList? RP
  private static boolean new_statement_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "new_statement_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LP);
    r = r && new_statement_2_0_1(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, null, r);
    return r;
  }

  // argumentList?
  private static boolean new_statement_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "new_statement_2_0_1")) return false;
    argumentList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // id_field
  //                 | enum_field
  //                 | property_alias_field
  //                 | property_field
  //                 | signal_field
  //                 | behavior
  //                 | functionDeclaration
  //                 | (object_name (NEW_LINE | COMMENT)* (qml_object | assignment))
  public static boolean object_content(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_content")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OBJECT_CONTENT, "<object content>");
    r = id_field(b, l + 1);
    if (!r) r = enum_field(b, l + 1);
    if (!r) r = property_alias_field(b, l + 1);
    if (!r) r = property_field(b, l + 1);
    if (!r) r = signal_field(b, l + 1);
    if (!r) r = behavior(b, l + 1);
    if (!r) r = functionDeclaration(b, l + 1);
    if (!r) r = object_content_7(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // object_name (NEW_LINE | COMMENT)* (qml_object | assignment)
  private static boolean object_content_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_content_7")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = object_name(b, l + 1);
    r = r && object_content_7_1(b, l + 1);
    r = r && object_content_7_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (NEW_LINE | COMMENT)*
  private static boolean object_content_7_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_content_7_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!object_content_7_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "object_content_7_1", c)) break;
    }
    return true;
  }

  // NEW_LINE | COMMENT
  private static boolean object_content_7_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_content_7_1_0")) return false;
    boolean r;
    r = consumeToken(b, NEW_LINE);
    if (!r) r = consumeToken(b, COMMENT);
    return r;
  }

  // qml_object | assignment
  private static boolean object_content_7_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_content_7_2")) return false;
    boolean r;
    r = qml_object(b, l + 1);
    if (!r) r = assignment(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // identifier [DOT identifier]
  public static boolean object_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_name")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && object_name_1(b, l + 1);
    exit_section_(b, m, OBJECT_NAME, r);
    return r;
  }

  // [DOT identifier]
  private static boolean object_name_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_name_1")) return false;
    parseTokens(b, 0, DOT, IDENTIFIER);
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER (COMMA IDENTIFIER)*
  public static boolean parameterList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameterList")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && parameterList_1(b, l + 1);
    exit_section_(b, m, PARAMETER_LIST, r);
    return r;
  }

  // (COMMA IDENTIFIER)*
  private static boolean parameterList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameterList_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!parameterList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "parameterList_1", c)) break;
    }
    return true;
  }

  // COMMA IDENTIFIER
  private static boolean parameterList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameterList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COMMA, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "null" | literal | dot_chain_name | LP expression RP
  static boolean primaryExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primaryExpression")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "null");
    if (!r) r = literal(b, l + 1);
    if (!r) r = dot_chain_name(b, l + 1);
    if (!r) r = primaryExpression_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LP expression RP
  private static boolean primaryExpression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primaryExpression_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LP);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ["readonly"] "property" "alias" IDENTIFIER COLON dot_chain_name
  public static boolean property_alias_field(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_alias_field")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, PROPERTY_ALIAS_FIELD, "<property alias field>");
    r = property_alias_field_0(b, l + 1);
    r = r && consumeToken(b, "property");
    r = r && consumeToken(b, "alias");
    p = r; // pin = 3
    r = r && report_error_(b, consumeTokens(b, -1, IDENTIFIER, COLON));
    r = p && dot_chain_name(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ["readonly"]
  private static boolean property_alias_field_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_alias_field_0")) return false;
    consumeToken(b, "readonly");
    return true;
  }

  /* ********************************************************** */
  // ["readonly"] "property" (BASE_TYPE | IDENTIFIER) IDENTIFIER [assignment]
  public static boolean property_field(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_field")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, PROPERTY_FIELD, "<property field>");
    r = property_field_0(b, l + 1);
    r = r && consumeToken(b, "property");
    p = r; // pin = 2
    r = r && report_error_(b, property_field_2(b, l + 1));
    r = p && report_error_(b, consumeToken(b, IDENTIFIER)) && r;
    r = p && property_field_4(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ["readonly"]
  private static boolean property_field_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_field_0")) return false;
    consumeToken(b, "readonly");
    return true;
  }

  // BASE_TYPE | IDENTIFIER
  private static boolean property_field_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_field_2")) return false;
    boolean r;
    r = consumeToken(b, BASE_TYPE);
    if (!r) r = consumeToken(b, IDENTIFIER);
    return r;
  }

  // [assignment]
  private static boolean property_field_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_field_4")) return false;
    assignment(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // LB (free_space | object_content)* RB
  public static boolean qml_object(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qml_object")) return false;
    if (!nextTokenIs(b, LB)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LB);
    r = r && qml_object_1(b, l + 1);
    r = r && consumeToken(b, RB);
    exit_section_(b, m, QML_OBJECT, r);
    return r;
  }

  // (free_space | object_content)*
  private static boolean qml_object_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qml_object_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!qml_object_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "qml_object_1", c)) break;
    }
    return true;
  }

  // free_space | object_content
  private static boolean qml_object_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qml_object_1_0")) return false;
    boolean r;
    r = free_space(b, l + 1);
    if (!r) r = object_content(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // additiveExpression ((LESS | GRATER | LESS_EQ | GRATER_EQ) additiveExpression)*
  static boolean relationalExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relationalExpression")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = additiveExpression(b, l + 1);
    r = r && relationalExpression_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ((LESS | GRATER | LESS_EQ | GRATER_EQ) additiveExpression)*
  private static boolean relationalExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relationalExpression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!relationalExpression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "relationalExpression_1", c)) break;
    }
    return true;
  }

  // (LESS | GRATER | LESS_EQ | GRATER_EQ) additiveExpression
  private static boolean relationalExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relationalExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = relationalExpression_1_0_0(b, l + 1);
    r = r && additiveExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LESS | GRATER | LESS_EQ | GRATER_EQ
  private static boolean relationalExpression_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relationalExpression_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, LESS);
    if (!r) r = consumeToken(b, GRATER);
    if (!r) r = consumeToken(b, LESS_EQ);
    if (!r) r = consumeToken(b, GRATER_EQ);
    return r;
  }

  /* ********************************************************** */
  // SEMI | NEW_LINE | COMMENT+ SEMI
  static boolean required_end(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "required_end")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SEMI);
    if (!r) r = consumeToken(b, NEW_LINE);
    if (!r) r = required_end_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMENT+ SEMI
  private static boolean required_end_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "required_end_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = required_end_2_0(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMENT+
  private static boolean required_end_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "required_end_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMENT);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, COMMENT)) break;
      if (!empty_element_parsed_guard_(b, "required_end_2_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "return" (NEW_LINE | COMMENT)* js_expression? SEMI?
  public static boolean returnStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "returnStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RETURN_STATEMENT, "<return statement>");
    r = consumeToken(b, "return");
    r = r && returnStatement_1(b, l + 1);
    r = r && returnStatement_2(b, l + 1);
    r = r && returnStatement_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (NEW_LINE | COMMENT)*
  private static boolean returnStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "returnStatement_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!returnStatement_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "returnStatement_1", c)) break;
    }
    return true;
  }

  // NEW_LINE | COMMENT
  private static boolean returnStatement_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "returnStatement_1_0")) return false;
    boolean r;
    r = consumeToken(b, NEW_LINE);
    if (!r) r = consumeToken(b, COMMENT);
    return r;
  }

  // js_expression?
  private static boolean returnStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "returnStatement_2")) return false;
    js_expression(b, l + 1);
    return true;
  }

  // SEMI?
  private static boolean returnStatement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "returnStatement_3")) return false;
    consumeToken(b, SEMI);
    return true;
  }

  /* ********************************************************** */
  // imports root_object (NEW_LINE | COMMENT)*
  static boolean root(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = imports(b, l + 1);
    r = r && root_object(b, l + 1);
    r = r && root_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (NEW_LINE | COMMENT)*
  private static boolean root_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!root_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "root_2", c)) break;
    }
    return true;
  }

  // NEW_LINE | COMMENT
  private static boolean root_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_2_0")) return false;
    boolean r;
    r = consumeToken(b, NEW_LINE);
    if (!r) r = consumeToken(b, COMMENT);
    return r;
  }

  /* ********************************************************** */
  // object_name (NEW_LINE | COMMENT)* qml_object
  public static boolean root_object(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_object")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ROOT_OBJECT, null);
    r = object_name(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, root_object_1(b, l + 1));
    r = p && qml_object(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (NEW_LINE | COMMENT)*
  private static boolean root_object_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_object_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!root_object_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "root_object_1", c)) break;
    }
    return true;
  }

  // NEW_LINE | COMMENT
  private static boolean root_object_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_object_1_0")) return false;
    boolean r;
    r = consumeToken(b, NEW_LINE);
    if (!r) r = consumeToken(b, COMMENT);
    return r;
  }

  /* ********************************************************** */
  // "signal" IDENTIFIER [LP (BASE_TYPE IDENTIFIER)? (COMMA BASE_TYPE IDENTIFIER)* RP]
  public static boolean signal_field(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signal_field")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIGNAL_FIELD, "<signal field>");
    r = consumeToken(b, "signal");
    r = r && consumeToken(b, IDENTIFIER);
    r = r && signal_field_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [LP (BASE_TYPE IDENTIFIER)? (COMMA BASE_TYPE IDENTIFIER)* RP]
  private static boolean signal_field_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signal_field_2")) return false;
    signal_field_2_0(b, l + 1);
    return true;
  }

  // LP (BASE_TYPE IDENTIFIER)? (COMMA BASE_TYPE IDENTIFIER)* RP
  private static boolean signal_field_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signal_field_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LP);
    r = r && signal_field_2_0_1(b, l + 1);
    r = r && signal_field_2_0_2(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, null, r);
    return r;
  }

  // (BASE_TYPE IDENTIFIER)?
  private static boolean signal_field_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signal_field_2_0_1")) return false;
    signal_field_2_0_1_0(b, l + 1);
    return true;
  }

  // BASE_TYPE IDENTIFIER
  private static boolean signal_field_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signal_field_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, BASE_TYPE, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA BASE_TYPE IDENTIFIER)*
  private static boolean signal_field_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signal_field_2_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!signal_field_2_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "signal_field_2_0_2", c)) break;
    }
    return true;
  }

  // COMMA BASE_TYPE IDENTIFIER
  private static boolean signal_field_2_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signal_field_2_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COMMA, BASE_TYPE, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (NEW_LINE | COMMENT)*
  static boolean skip(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "skip")) return false;
    while (true) {
      int c = current_position_(b);
      if (!skip_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "skip", c)) break;
    }
    return true;
  }

  // NEW_LINE | COMMENT
  private static boolean skip_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "skip_0")) return false;
    boolean r;
    r = consumeToken(b, NEW_LINE);
    if (!r) r = consumeToken(b, COMMENT);
    return r;
  }

  /* ********************************************************** */
  // variableDeclaration
  //                     | functionDeclaration
  //                     | returnStatement
  //                     | new_statement
  //                     | ifStatement
  //                     | whileStatement
  //                     | switchStatement
  //                     | tryCatchStatement
  //                     | throwStatement
  //                     | SEMI+
  // //                    | (NEW_LINE | COMMENT)+
  // //                    | js_assignment
  //                     | bracket_statement
  //                     | js_expression
  static boolean statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = variableDeclaration(b, l + 1);
    if (!r) r = functionDeclaration(b, l + 1);
    if (!r) r = returnStatement(b, l + 1);
    if (!r) r = new_statement(b, l + 1);
    if (!r) r = ifStatement(b, l + 1);
    if (!r) r = whileStatement(b, l + 1);
    if (!r) r = switchStatement(b, l + 1);
    if (!r) r = tryCatchStatement(b, l + 1);
    if (!r) r = throwStatement(b, l + 1);
    if (!r) r = statement_9(b, l + 1);
    if (!r) r = bracket_statement(b, l + 1);
    if (!r) r = js_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // SEMI+
  private static boolean statement_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_9")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SEMI);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, SEMI)) break;
      if (!empty_element_parsed_guard_(b, "statement_9", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "switch" LP js_expression RP LB caseStatement* (defaultStatement)? RB
  public static boolean switchStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switchStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SWITCH_STATEMENT, "<switch statement>");
    r = consumeToken(b, "switch");
    r = r && consumeToken(b, LP);
    r = r && js_expression(b, l + 1);
    r = r && consumeTokens(b, 0, RP, LB);
    r = r && switchStatement_5(b, l + 1);
    r = r && switchStatement_6(b, l + 1);
    r = r && consumeToken(b, RB);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // caseStatement*
  private static boolean switchStatement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switchStatement_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!caseStatement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "switchStatement_5", c)) break;
    }
    return true;
  }

  // (defaultStatement)?
  private static boolean switchStatement_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switchStatement_6")) return false;
    switchStatement_6_0(b, l + 1);
    return true;
  }

  // (defaultStatement)
  private static boolean switchStatement_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switchStatement_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = defaultStatement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "throw" js_expression
  public static boolean throwStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "throwStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, THROW_STATEMENT, "<throw statement>");
    r = consumeToken(b, "throw");
    r = r && js_expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "try" LB js_program RB CATCH LP IDENTIFIER RP LB js_program RB ("finally" LB js_program RB)?
  public static boolean tryCatchStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryCatchStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TRY_CATCH_STATEMENT, "<try catch statement>");
    r = consumeToken(b, "try");
    r = r && consumeToken(b, LB);
    r = r && js_program(b, l + 1);
    r = r && consumeTokens(b, 0, RB, CATCH, LP, IDENTIFIER, RP, LB);
    r = r && js_program(b, l + 1);
    r = r && consumeToken(b, RB);
    r = r && tryCatchStatement_11(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ("finally" LB js_program RB)?
  private static boolean tryCatchStatement_11(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryCatchStatement_11")) return false;
    tryCatchStatement_11_0(b, l + 1);
    return true;
  }

  // "finally" LB js_program RB
  private static boolean tryCatchStatement_11_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryCatchStatement_11_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "finally");
    r = r && consumeToken(b, LB);
    r = r && js_program(b, l + 1);
    r = r && consumeToken(b, RB);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (NEW_LINE | COMMENT | NOT | MINUS)* primaryExpression
  static boolean unaryExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unaryExpression")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = unaryExpression_0(b, l + 1);
    r = r && primaryExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (NEW_LINE | COMMENT | NOT | MINUS)*
  private static boolean unaryExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unaryExpression_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!unaryExpression_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "unaryExpression_0", c)) break;
    }
    return true;
  }

  // NEW_LINE | COMMENT | NOT | MINUS
  private static boolean unaryExpression_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unaryExpression_0_0")) return false;
    boolean r;
    r = consumeToken(b, NEW_LINE);
    if (!r) r = consumeToken(b, COMMENT);
    if (!r) r = consumeToken(b, NOT);
    if (!r) r = consumeToken(b, MINUS);
    return r;
  }

  /* ********************************************************** */
  // ("let" | "var" | "const") IDENTIFIER (EQ js_expression)?
  public static boolean variableDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variableDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VARIABLE_DECLARATION, "<variable declaration>");
    r = variableDeclaration_0(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && variableDeclaration_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "let" | "var" | "const"
  private static boolean variableDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variableDeclaration_0")) return false;
    boolean r;
    r = consumeToken(b, "let");
    if (!r) r = consumeToken(b, "var");
    if (!r) r = consumeToken(b, "const");
    return r;
  }

  // (EQ js_expression)?
  private static boolean variableDeclaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variableDeclaration_2")) return false;
    variableDeclaration_2_0(b, l + 1);
    return true;
  }

  // EQ js_expression
  private static boolean variableDeclaration_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variableDeclaration_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EQ);
    r = r && js_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "while" LP js_expression RP statement
  public static boolean whileStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whileStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, WHILE_STATEMENT, "<while statement>");
    r = consumeToken(b, "while");
    r = r && consumeToken(b, LP);
    r = r && js_expression(b, l + 1);
    r = r && consumeToken(b, RP);
    r = r && statement(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

}
