package com.qmlplugin.language;

import com.intellij.codeInsight.completion.*;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.util.ProcessingContext;
import com.qmlplugin.language.psi.QmlTypes;
import org.jetbrains.annotations.NotNull;

public class QmlCompletionContributor extends CompletionContributor {
    public QmlCompletionContributor() {
        extend(CompletionType.BASIC, PlatformPatterns.psiElement(QmlTypes.VALUE),
                new CompletionProvider<>() {
                    public void addCompletions(@NotNull CompletionParameters parameters,
                                               @NotNull ProcessingContext context,
                                               @NotNull CompletionResultSet resultSet) {
                        resultSet.addElement(LookupElementBuilder.create("Hello"));
                        resultSet.addLookupAdvertisement("Test");
                    }
                }
        );
    }

}
