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
            new AttributesDescriptor("Bad value", QmlSyntaxHighlighter.BAD_CHARACTER),
            new AttributesDescriptor("Keyword", QmlSyntaxHighlighter.KEYWORD),
            new AttributesDescriptor("Base types", QmlSyntaxHighlighter.BASE_TYPE),
            new AttributesDescriptor("Number", QmlSyntaxHighlighter.NUMBER),
            new AttributesDescriptor("String", QmlSyntaxHighlighter.STRING),
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
                import QtQuick 2.2
                
                Rectangle {
                    id: root
                    q: e
                    /* */ property var x: 22
                    property var xxx
                //    property var theArray: []
                //    property var theDate: new Date()
                //    readonly property alias y: 0  // must be failed
                    readonly property alias y: q
                        /*  ; /* */
                                
                    enum TextType {
                        Normal,
                        Heading
                    }
                                
                    property alias buttonText: textItem.text
                                
                    Behavior on opacity {
                        NumberAnimation { duration: 300 }
                    }
                                
                    Rectangle {
                        signal processInput(int text, var i)
                        signal processInput
                        signal processInput()
                                
                        width: 100; height: 30
                                
                        // color: root.selected || !enabled ? "blue" : "red"
                    }
                                
                    function loadNextScene(userAuthorization){
                //        mainStackView.replace(userAuthorization)
                //        intro.destroy()
                //
                //        if (!generalInfo.location) {
                //            criticalErrorPopup.setError(qsTranslate("location", "failed_to_get_location"),
                //                                        qsTranslate("location", "check_location"))
                //            return
                //        }
                //        return settings.introEnabled ? intro : userAuthorization
                    }
                //    Component.onCompleted: {
                //        for (var i = 0; i < 10; i++)
                //            theArray.push("Item " + i)
                //        console.log("There are", theArray.length, "items in the array")
                //        console.log("The time is", theDate.toUTCString())
                //    }
                }""";
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