package com.qmlplugin.language;

import com.intellij.application.options.CodeStyleAbstractConfigurable;
import com.intellij.application.options.CodeStyleAbstractPanel;
import com.intellij.application.options.TabbedLanguageCodeStylePanel;
import com.intellij.psi.codeStyle.CodeStyleConfigurable;
import com.intellij.psi.codeStyle.CodeStyleSettings;
import com.intellij.psi.codeStyle.CodeStyleSettingsProvider;
import com.intellij.psi.codeStyle.CustomCodeStyleSettings;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class QmlCodeStyleSettingsProvider extends CodeStyleSettingsProvider {
    @Override
    public CustomCodeStyleSettings createCustomSettings(CodeStyleSettings settings) {
        return new QmlCodeStyleSettings(settings);
    }

    @Nullable
    @Override
    public String getConfigurableDisplayName() {
        return "Qml";
    }

    @NotNull
    public CodeStyleConfigurable createConfigurable(@NotNull CodeStyleSettings settings, @NotNull CodeStyleSettings modelSettings) {
        return new CodeStyleAbstractConfigurable(settings, modelSettings, this.getConfigurableDisplayName()) {
            @Override
            protected CodeStyleAbstractPanel createPanel(CodeStyleSettings settings) {
                return new QmlCodeStyleMainPanel(getCurrentSettings(), settings);
            }
        };
    }

    private static class QmlCodeStyleMainPanel extends TabbedLanguageCodeStylePanel {
        public QmlCodeStyleMainPanel(CodeStyleSettings currentSettings, CodeStyleSettings settings) {
            super(QmlLanguage.INSTANCE, currentSettings, settings);
        }
    }
}
