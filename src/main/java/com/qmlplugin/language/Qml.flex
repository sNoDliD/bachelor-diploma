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
WHITE_SPACE=[\ \n\t\f]
FIRST_VALUE_CHARACTER=[^ \n\f\\] | "\\"{CRLF} | "\\".
VALUE_CHARACTER=[^\n\f\\] | "\\"{CRLF} | "\\".
END_OF_LINE_COMMENT=("#"|"!")[^\r\n]*
//BLOCK_COMMENT_START="/*"
//BLOCK_COMMENT_END="*/"
SEPARATOR=[:=]
KEY_CHARACTER=[^:=\ \n\t\f\\] | "\\ "
KEYWORDS="for" | "in"

%state WAITING_VALUE
//%state BLOCK_OF_COMMENT

%%

<YYINITIAL> {END_OF_LINE_COMMENT}                           { yybegin(YYINITIAL); return QmlTypes.COMMENT; }
//<YYINITIAL> {BLOCK_COMMENT_START}                           { yybegin(BLOCK_OF_COMMENT); continue; }
//<BLOCK_OF_COMMENT> {BLOCK_COMMENT_END}                      { yybegin(YYINITIAL); return QmlTypes.COMMENT; }
//<BLOCK_OF_COMMENT> [^]                                      { continue; }


//<YYINITIAL> "/*" {
//    yybegin(BLOCK_OF_COMMENT);
//}
////<BLOCK_OF_COMMENT> [^]                                      { continue; }
//
//<BLOCK_OF_COMMENT> ([^]|CRLF)* "*/" {
//    yybegin(YYINITIAL); return QmlTypes.COMMENT;
//}


<YYINITIAL> {KEYWORDS}                                      { yybegin(YYINITIAL); return QmlTypes.KEYWORD; }

<YYINITIAL> {KEY_CHARACTER}+                                { yybegin(YYINITIAL); return QmlTypes.KEY; }

<YYINITIAL> {SEPARATOR}                                     { yybegin(WAITING_VALUE); return QmlTypes.SEPARATOR; }

<WAITING_VALUE> {CRLF}({CRLF}|{WHITE_SPACE})+               { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

<WAITING_VALUE> {WHITE_SPACE}+                              { yybegin(WAITING_VALUE); return TokenType.WHITE_SPACE; }

<WAITING_VALUE> {FIRST_VALUE_CHARACTER}{VALUE_CHARACTER}*   { yybegin(YYINITIAL); return QmlTypes.VALUE; }

({CRLF}|{WHITE_SPACE})+                                     { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

[^]                                                         { return TokenType.BAD_CHARACTER; }
