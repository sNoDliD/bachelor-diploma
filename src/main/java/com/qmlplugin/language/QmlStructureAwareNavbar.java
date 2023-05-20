package com.qmlplugin.language;

import com.intellij.icons.AllIcons;
import com.intellij.ide.navigationToolbar.StructureAwareNavBarModelExtension;
import com.intellij.lang.Language;
import com.qmlplugin.language.psi.QmlFile;
import com.qmlplugin.language.psi.QmlProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class QmlStructureAwareNavbar extends StructureAwareNavBarModelExtension {
    @NotNull
    @Override
    protected Language getLanguage() {
        return QmlLanguage.INSTANCE;
    }

    @Override
    public @Nullable String getPresentableText(Object object) {
        if (object instanceof QmlFile) {
            return ((QmlFile) object).getName();
        }
        if (object instanceof QmlProperty) {
            return ((QmlProperty) object).getName();
        }

        return null;
    }

    @Override
    @Nullable
    public Icon getIcon(Object object) {
        if (object instanceof QmlProperty) {
            return AllIcons.Nodes.Property;
        }

        return null;
    }
}
