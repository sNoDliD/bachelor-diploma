package com.qmlplugin.language;

import com.intellij.psi.codeStyle.CodeStyleSettings;
import com.intellij.psi.codeStyle.CustomCodeStyleSettings;

public class QmlCodeStyleSettings extends CustomCodeStyleSettings {
    public QmlCodeStyleSettings(CodeStyleSettings settings) {
        super("SimpleCodeStyleSettings", settings);
    }
}
