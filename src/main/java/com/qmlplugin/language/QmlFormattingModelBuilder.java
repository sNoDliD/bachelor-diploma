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
                .around(QmlTypes.SEPARATOR)
                .spaceIf(settings.getCommonSettings(QmlLanguage.INSTANCE.getID()).SPACE_AROUND_ASSIGNMENT_OPERATORS)
                .between(QmlTypes.CRLF, QmlTypes.PROPERTY)
                .none();
//        .between(TokenSet.ANY, TokenSet.ANY).none();
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
