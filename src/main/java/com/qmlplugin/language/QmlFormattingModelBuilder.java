package com.qmlplugin.language;

import com.intellij.formatting.*;
import com.intellij.psi.codeStyle.CodeStyleSettings;
import com.intellij.psi.tree.TokenSet;
import com.qmlplugin.language.psi.QmlFile;
import com.qmlplugin.language.psi.QmlTypes;
import org.jetbrains.annotations.NotNull;

public class QmlFormattingModelBuilder implements FormattingModelBuilder {
    private static SpacingBuilder createSpaceBuilder(CodeStyleSettings settings) {
        return new SpacingBuilder(settings, QmlLanguage.INSTANCE)
                .before(QmlTypes.COLON).none()
                .after(QmlTypes.COLON)
                .spaceIf(settings.getCommonSettings(QmlLanguage.INSTANCE.getID()).SPACE_AFTER_COLON)
        ;
    }

    @Override
    public @NotNull FormattingModel createModel(@NotNull FormattingContext formattingContext) {
        final CodeStyleSettings codeStyleSettings = formattingContext.getCodeStyleSettings();
        return FormattingModelProvider
                .createFormattingModelForPsiFile(formattingContext.getContainingFile(),
                        new QmlBlock(formattingContext.getNode(),
                                Wrap.createWrap(WrapType.NONE, false),
                                Alignment.createAlignment(),
                                createSpaceBuilder(codeStyleSettings)),
                        codeStyleSettings);
    }
}
