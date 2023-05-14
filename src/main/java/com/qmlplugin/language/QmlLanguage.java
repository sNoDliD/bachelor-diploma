package com.qmlplugin.language;

import com.intellij.lang.Language;

public class QmlLanguage extends Language {
    public static final QmlLanguage INSTANCE = new QmlLanguage();

    private QmlLanguage() {
        super("QML");
    }
}
