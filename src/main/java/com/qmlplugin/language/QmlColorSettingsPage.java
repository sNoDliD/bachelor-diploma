package com.qmlplugin.language;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.Map;

public class QmlColorSettingsPage implements ColorSettingsPage {

    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
            new AttributesDescriptor("Key", QmlSyntaxHighlighter.KEY),
            new AttributesDescriptor("Separator", QmlSyntaxHighlighter.SEPARATOR),
            new AttributesDescriptor("Value", QmlSyntaxHighlighter.VALUE),
            new AttributesDescriptor("Bad value", QmlSyntaxHighlighter.BAD_CHARACTER),
            new AttributesDescriptor("Keyword", QmlSyntaxHighlighter.KEYWORD),
    };

    @Nullable
    @Override
    public Icon getIcon() {
        return QmlIcons.FILE;
    }

    @NotNull
    @Override
    public SyntaxHighlighter getHighlighter() {
        return new QmlSyntaxHighlighter();
    }

    @NotNull
    @Override
    public String getDemoText() {
        return """
                for
                in
                            
                # You are reading the ".properties" entry.
                ! The exclamation mark can also mark text as comments.
                website = https://en.wikipedia.org/
                language = English
                # The backslash below tells the application to continue reading
                # the value onto the next line.
                message = Welcome to \\
                          Wikipedia!
                # Add spaces to the key
                key\\ with\\ spaces = This is the value that could be looked up with the key "key with spaces".
                # Unicode
                tab : \\u0009""";
    }

    @Nullable
    @Override
    public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return null;
    }

    @Override
    public AttributesDescriptor @NotNull [] getAttributeDescriptors() {
        return DESCRIPTORS;
    }

    @Override
    public ColorDescriptor @NotNull [] getColorDescriptors() {
        return ColorDescriptor.EMPTY_ARRAY;
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return "Qml";
    }

}