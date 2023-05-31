package com.qmlplugin.language;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class QmlFileType extends LanguageFileType {

    public static final QmlFileType INSTANCE = new QmlFileType();

    private QmlFileType() {
        super(QmlLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "QML";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "QML language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "qml";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return QmlIcons.FILE;
    }

}
