package com.qmlplugin.language;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.qmlplugin.language.psi.QmlTypes;
import com.intellij.psi.TokenType;

%%

%class QmlLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}

CRLF=\R
WHITE_SPACE=[\ \t\f]
FIRST_VALUE_CHARACTER=[^ \n\f\\] | "\\"{CRLF} | "\\".
VALUE_CHARACTER=[^\n\f\\] | "\\"{CRLF} | "\\".
END_OF_LINE_COMMENT=("//")[^\r\n]*
BLOCK_COMMENT_START="/*"
BLOCK_COMMENT_END="*/"
STRING='([^'\\]|\\.)*'|\"([^\"\\]|\\.)*\"
IDENTIFIER=[a-zA-Z_]\w*
//KEY_CHARACTER=[^:=\ \n\t\f\\] | "\\ "
KEYWORDS = import | as | property | let | alias
        | signal | readonly | Behavior | on
        | function | null | true | false | const | return
        | if | else | while | switch | case | default
        | try | catch | finally | throw | new | enum | for
BASE_TYPE=double | enumeration | int | list | real | string | url | var
        | date | point | rect | size

%state WAITING_VALUE
%state BLOCK_OF_COMMENT

%%

// COMENTS
<YYINITIAL> {END_OF_LINE_COMMENT}                           { yybegin(YYINITIAL); return QmlTypes.COMMENT; }
<YYINITIAL> {BLOCK_COMMENT_START}                           { yybegin(BLOCK_OF_COMMENT); continue; }
<BLOCK_OF_COMMENT> {BLOCK_COMMENT_END}                      { yybegin(YYINITIAL); return QmlTypes.COMMENT; }
<BLOCK_OF_COMMENT> [^]                                      { continue; }


<YYINITIAL> {BASE_TYPE}                                     { yybegin(YYINITIAL); return QmlTypes.BASE_TYPE; }
<YYINITIAL> {KEYWORDS}                                      { yybegin(YYINITIAL); return QmlTypes.KEYWORD; }
<YYINITIAL> {STRING}                                        { yybegin(YYINITIAL); return QmlTypes.STRING; }
[\n\R\f]                                                    { yybegin(YYINITIAL); return QmlTypes.NEW_LINE; }

<YYINITIAL> {IDENTIFIER}+                                   { yybegin(YYINITIAL); return QmlTypes.IDENTIFIER; }
<YYINITIAL> ;                                               { yybegin(YYINITIAL); return QmlTypes.SEMI; }
<YYINITIAL> :                                               { yybegin(YYINITIAL); return QmlTypes.COLON; }
<YYINITIAL> \(                                              { yybegin(YYINITIAL); return QmlTypes.LP; }
<YYINITIAL> \)                                              { yybegin(YYINITIAL); return QmlTypes.RP; }
<YYINITIAL> \{                                              { yybegin(YYINITIAL); return QmlTypes.LB; }
<YYINITIAL> \}                                              { yybegin(YYINITIAL); return QmlTypes.RB; }
<YYINITIAL> \}                                              { yybegin(YYINITIAL); return QmlTypes.RB; }
<YYINITIAL> \[                                              { yybegin(YYINITIAL); return QmlTypes.L_BRACKET; }
<YYINITIAL> \]                                              { yybegin(YYINITIAL); return QmlTypes.R_BRACKET; }
<YYINITIAL> \.                                              { yybegin(YYINITIAL); return QmlTypes.DOT; }
<YYINITIAL> ,                                               { yybegin(YYINITIAL); return QmlTypes.COMMA; }
<YYINITIAL> \d+                                             { yybegin(YYINITIAL); return QmlTypes.INT; }
<YYINITIAL> \d+(\.\d*)?                                     { yybegin(YYINITIAL); return QmlTypes.FLOAT; }

// BOOLEAN
<YYINITIAL> \!                                              { yybegin(YYINITIAL); return QmlTypes.NOT; }
<YYINITIAL> \?                                              { yybegin(YYINITIAL); return QmlTypes.Q_MARK; }
<YYINITIAL> \|\|                                            { yybegin(YYINITIAL); return QmlTypes.LAZY_OR; }
<YYINITIAL> \|                                              { yybegin(YYINITIAL); return QmlTypes.OR; }
<YYINITIAL> &&                                              { yybegin(YYINITIAL); return QmlTypes.LAZY_AND; }
<YYINITIAL> &                                               { yybegin(YYINITIAL); return QmlTypes.AND; }
<YYINITIAL> ===                                             { yybegin(YYINITIAL); return QmlTypes.T_EQ; }
<YYINITIAL> ==                                              { yybegin(YYINITIAL); return QmlTypes.D_EQ; }
<YYINITIAL> =                                               { yybegin(YYINITIAL); return QmlTypes.EQ; }
<YYINITIAL> \!==                                            { yybegin(YYINITIAL); return QmlTypes.D_NOT_EQ; }
<YYINITIAL> \!=                                             { yybegin(YYINITIAL); return QmlTypes.NOT_EQ; }
<YYINITIAL> <=                                              { yybegin(YYINITIAL); return QmlTypes.LESS_EQ; }
<YYINITIAL> <                                               { yybegin(YYINITIAL); return QmlTypes.LESS; }
<YYINITIAL> >=                                              { yybegin(YYINITIAL); return QmlTypes.GRATER_EQ; }
<YYINITIAL> >                                               { yybegin(YYINITIAL); return QmlTypes.GRATER; }

// MATH
<YYINITIAL> \*                                              { yybegin(YYINITIAL); return QmlTypes.MULT; }
<YYINITIAL> \/                                              { yybegin(YYINITIAL); return QmlTypes.DIV; }
<YYINITIAL> -                                               { yybegin(YYINITIAL); return QmlTypes.MINUS; }
<YYINITIAL> \+                                              { yybegin(YYINITIAL); return QmlTypes.PLUS; }
<YYINITIAL> %                                               { yybegin(YYINITIAL); return QmlTypes.PERCENT; }


<YYINITIAL> ({WHITE_SPACE})+                                { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

[^]                                                         { return TokenType.BAD_CHARACTER; }
