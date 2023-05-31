package com.qmlplugin.language.psi;

import com.intellij.psi.tree.TokenSet;

public interface QmlTokenSets {

    TokenSet IDENTIFIERS = TokenSet.create(QmlTypes.IDENTIFIER);

    TokenSet COMMENTS = TokenSet.create(QmlTypes.COMMENT);

    TokenSet KEYWORD = TokenSet.create(QmlTypes.KEYWORD);

}
