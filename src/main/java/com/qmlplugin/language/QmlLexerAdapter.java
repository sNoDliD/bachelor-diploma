package com.qmlplugin.language;

import com.intellij.lexer.FlexAdapter;

public class QmlLexerAdapter extends FlexAdapter {
    public QmlLexerAdapter() {
        super(new QmlLexer(null));
    }

}
