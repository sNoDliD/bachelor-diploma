package com.qmlplugin.language.psi;

import com.intellij.psi.tree.IElementType;
import com.qmlplugin.language.QmlLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class QmlElementType extends IElementType {
    public QmlElementType(@NotNull @NonNls String debugName) {
        super(debugName, QmlLanguage.INSTANCE);
    }

}
