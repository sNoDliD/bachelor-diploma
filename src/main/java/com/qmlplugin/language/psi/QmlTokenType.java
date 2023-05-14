package com.qmlplugin.language.psi;

import com.intellij.psi.tree.IElementType;
import com.qmlplugin.language.QmlLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class QmlTokenType extends IElementType {

    public QmlTokenType(@NotNull @NonNls String debugName) {
        super(debugName, QmlLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "QmlTokenType." + super.toString();
    }

}
