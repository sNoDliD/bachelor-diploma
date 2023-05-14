package com.qmlplugin.language.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import com.qmlplugin.language.QmlFileType;
import com.qmlplugin.language.QmlLanguage;
import org.jetbrains.annotations.NotNull;

public class QmlFile extends PsiFileBase {

    public QmlFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, QmlLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return QmlFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "QML File";
    }

}
