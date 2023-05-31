package com.qmlplugin.language;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import com.qmlplugin.language.psi.QmlTypes;
import org.jetbrains.annotations.NotNull;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class QmlSyntaxHighlighter extends SyntaxHighlighterBase {
    public static final TextAttributesKey IMPORT =
            createTextAttributesKey("QML_IMPORT", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey COMMENT =
            createTextAttributesKey("COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey BAD_CHARACTER =
            createTextAttributesKey("QML_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER);
    public static final TextAttributesKey KEYWORD =
            createTextAttributesKey("QML_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey BASE_TYPE =
            createTextAttributesKey("QML_BASE_TYPE", DefaultLanguageHighlighterColors.IDENTIFIER);

 public static final TextAttributesKey NUMBER =
            createTextAttributesKey("QML_NUMBER", DefaultLanguageHighlighterColors.NUMBER);

 public static final TextAttributesKey STRING =
            createTextAttributesKey("QML_STRING", DefaultLanguageHighlighterColors.STRING);


    private static final TextAttributesKey[] BAD_CHAR_KEYS = new TextAttributesKey[]{BAD_CHARACTER};
    private static final TextAttributesKey[] KEYWORD_KEYS = new TextAttributesKey[]{KEYWORD};
    private static final TextAttributesKey[] BASE_TYPE_KEYS = new TextAttributesKey[]{BASE_TYPE};
    private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{COMMENT};
    private static final TextAttributesKey[] STRING_KEYS = new TextAttributesKey[]{STRING};
    private static final TextAttributesKey[] NUMBER_KEYS = new TextAttributesKey[]{NUMBER};
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new QmlLexerAdapter();
    }

    @Override
    public TextAttributesKey @NotNull [] getTokenHighlights(IElementType tokenType) {
        if (tokenType.equals(QmlTypes.COMMENT)) {
            return COMMENT_KEYS;
        }
        if (tokenType.equals(TokenType.BAD_CHARACTER)) {
            return BAD_CHAR_KEYS;
        }
        if (tokenType.equals(QmlTypes.STRING)) {
            return STRING_KEYS;
        }
        if (tokenType.equals(QmlTypes.INT) || tokenType.equals(QmlTypes.FLOAT)) {
            return NUMBER_KEYS;
        }
        if (tokenType.equals(QmlTypes.KEYWORD)) {
            return KEYWORD_KEYS;
        }
        if (tokenType.equals(QmlTypes.BASE_TYPE)) {
            return BASE_TYPE_KEYS;
        }
        return EMPTY_KEYS;
    }
}
