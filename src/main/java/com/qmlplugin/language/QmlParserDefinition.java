package com.qmlplugin.language;

import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import com.qmlplugin.language.parser.QmlParser;
import com.qmlplugin.language.psi.QmlFile;
import com.qmlplugin.language.psi.QmlTokenSets;
import com.qmlplugin.language.psi.QmlTypes;
import org.jetbrains.annotations.NotNull;

public class QmlParserDefinition implements ParserDefinition {

    public static final IFileElementType FILE = new IFileElementType(QmlLanguage.INSTANCE);

    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        return new QmlLexerAdapter();
    }

    @NotNull
    @Override
    public TokenSet getCommentTokens() {
        return QmlTokenSets.COMMENTS;
    }

    @NotNull
    @Override
    public TokenSet getStringLiteralElements() {
        return TokenSet.EMPTY;
    }

    @NotNull
    @Override
    public PsiParser createParser(final Project project) {
        return new QmlParser();
    }

    @NotNull
    @Override
    public IFileElementType getFileNodeType() {
        return FILE;
    }

    @NotNull
    @Override
    public PsiFile createFile(@NotNull FileViewProvider viewProvider) {
        return new QmlFile(viewProvider);
    }

    @NotNull
    @Override
    public PsiElement createElement(ASTNode node) {
        return QmlTypes.Factory.createElement(node);
    }
}
