package com.qmlplugin.language;

import com.intellij.lang.Language;
import com.intellij.psi.codeStyle.CodeStyleSettingsCustomizable;
import com.intellij.psi.codeStyle.LanguageCodeStyleSettingsProvider;
import org.jetbrains.annotations.NotNull;

public class QmlLanguageCodeStyleSettingsProvider extends LanguageCodeStyleSettingsProvider {
    @NotNull
    @Override
    public Language getLanguage() {
        return QmlLanguage.INSTANCE;
    }

    @Override
    public void customizeSettings(@NotNull CodeStyleSettingsCustomizable consumer, @NotNull SettingsType settingsType) {
        if (settingsType == SettingsType.SPACING_SETTINGS) {
            consumer.showStandardOptions("SPACE_AFTER_COLON");
            consumer.renameStandardOption("SPACE_AFTER_COLON", "Assignment colon");
        } else if (settingsType == SettingsType.BLANK_LINES_SETTINGS) {
            consumer.showStandardOptions("KEEP_BLANK_LINES_IN_CODE");
            consumer.renameStandardOption("KEEP_BLANK_LINES_IN_CODE", "Blank lines");

        } else if (settingsType == SettingsType.WRAPPING_AND_BRACES_SETTINGS) {
            String[] x = {"RIGHT_MARGIN", "WRAP_ON_TYPING", "KEEP_CONTROL_STATEMENT_IN_ONE_LINE", "KEEP_LINE_BREAKS", "KEEP_FIRST_COLUMN_COMMENT", "CALL_PARAMETERS_WRAP", "PREFER_PARAMETERS_WRAP", "CALL_PARAMETERS_LPAREN_ON_NEXT_LINE", "CALL_PARAMETERS_RPAREN_ON_NEXT_LINE", "METHOD_PARAMETERS_WRAP", "METHOD_PARAMETERS_LPAREN_ON_NEXT_LINE", "METHOD_PARAMETERS_RPAREN_ON_NEXT_LINE", "RESOURCE_LIST_WRAP", "RESOURCE_LIST_LPAREN_ON_NEXT_LINE", "RESOURCE_LIST_RPAREN_ON_NEXT_LINE", "EXTENDS_LIST_WRAP", "THROWS_LIST_WRAP", "EXTENDS_KEYWORD_WRAP", "THROWS_KEYWORD_WRAP", "METHOD_CALL_CHAIN_WRAP", "PARENTHESES_EXPRESSION_LPAREN_WRAP", "PARENTHESES_EXPRESSION_RPAREN_WRAP", "BINARY_OPERATION_WRAP", "BINARY_OPERATION_SIGN_ON_NEXT_LINE", "TERNARY_OPERATION_WRAP", "TERNARY_OPERATION_SIGNS_ON_NEXT_LINE", "MODIFIER_LIST_WRAP", "KEEP_SIMPLE_BLOCKS_IN_ONE_LINE", "KEEP_SIMPLE_METHODS_IN_ONE_LINE", "KEEP_SIMPLE_CLASSES_IN_ONE_LINE", "KEEP_SIMPLE_LAMBDAS_IN_ONE_LINE", "KEEP_MULTIPLE_EXPRESSIONS_IN_ONE_LINE", "FOR_STATEMENT_WRAP", "FOR_STATEMENT_LPAREN_ON_NEXT_LINE", "FOR_STATEMENT_RPAREN_ON_NEXT_LINE", "ARRAY_INITIALIZER_WRAP", "ARRAY_INITIALIZER_LBRACE_ON_NEXT_LINE", "ARRAY_INITIALIZER_RBRACE_ON_NEXT_LINE", "ASSIGNMENT_WRAP", "PLACE_ASSIGNMENT_SIGN_ON_NEXT_LINE", "LABELED_STATEMENT_WRAP", "WRAP_COMMENTS", "ASSERT_STATEMENT_WRAP", "ASSERT_STATEMENT_COLON_ON_NEXT_LINE", "IF_BRACE_FORCE", "DOWHILE_BRACE_FORCE", "WHILE_BRACE_FORCE", "FOR_BRACE_FORCE", "WRAP_LONG_LINES", "METHOD_ANNOTATION_WRAP", "CLASS_ANNOTATION_WRAP", "FIELD_ANNOTATION_WRAP", "PARAMETER_ANNOTATION_WRAP", "VARIABLE_ANNOTATION_WRAP", "ALIGN_MULTILINE_CHAINED_METHODS", "WRAP_FIRST_METHOD_IN_CALL_CHAIN", "ALIGN_MULTILINE_PARAMETERS", "ALIGN_MULTILINE_PARAMETERS_IN_CALLS", "ALIGN_MULTILINE_RESOURCES", "ALIGN_MULTILINE_FOR", "INDENT_WHEN_CASES", "ALIGN_MULTILINE_BINARY_OPERATION", "ALIGN_MULTILINE_ASSIGNMENT", "ALIGN_MULTILINE_TERNARY_OPERATION", "ALIGN_MULTILINE_THROWS_LIST", "ALIGN_THROWS_KEYWORD", "ALIGN_MULTILINE_EXTENDS_LIST", "ALIGN_MULTILINE_METHOD_BRACKETS", "ALIGN_MULTILINE_PARENTHESIZED_EXPRESSION", "ALIGN_MULTILINE_ARRAY_INITIALIZER_EXPRESSION", "ALIGN_GROUP_FIELD_DECLARATIONS", "BRACE_STYLE", "CLASS_BRACE_STYLE", "METHOD_BRACE_STYLE", "LAMBDA_BRACE_STYLE", "USE_FLYING_GEESE_BRACES", "FLYING_GEESE_BRACES_GAP", "DO_NOT_INDENT_TOP_LEVEL_CLASS_MEMBERS", "ELSE_ON_NEW_LINE", "WHILE_ON_NEW_LINE", "CATCH_ON_NEW_LINE", "FINALLY_ON_NEW_LINE", "INDENT_CASE_FROM_SWITCH", "CASE_STATEMENT_ON_NEW_LINE", "SPECIAL_ELSE_IF_TREATMENT", "ENUM_CONSTANTS_WRAP", "ALIGN_CONSECUTIVE_VARIABLE_DECLARATIONS", "ALIGN_CONSECUTIVE_ASSIGNMENTS", "ALIGN_SUBSEQUENT_SIMPLE_METHODS", "INDENT_BREAK_FROM_CASE", "BUILDER_METHODS", "KEEP_BUILDER_METHODS_INDENTS"};
            for (var i : x) {
                consumer.showStandardOptions(i);
            }
//            consumer.renameStandardOption("KEEP_BLANK_LINES_IN_CODE", "Blank lines");
        }
    }

    @Override
    public String getCodeSample(@NotNull SettingsType settingsType) {
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

}
