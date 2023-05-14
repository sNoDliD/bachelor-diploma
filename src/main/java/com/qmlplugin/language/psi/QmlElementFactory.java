package com.qmlplugin.language.psi;

import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFileFactory;
import com.qmlplugin.language.QmlFileType;

public class QmlElementFactory {

    public static QmlProperty createProperty(Project project, String name) {
        final QmlFile file = createFile(project, name);
        return (QmlProperty) file.getFirstChild();
    }

    public static QmlFile createFile(Project project, String text) {
        String name = "dummy.qml";
        return (QmlFile) PsiFileFactory.getInstance(project).createFileFromText(name, QmlFileType.INSTANCE, text);
    }

    public static QmlProperty createProperty(Project project, String name, String value) {
        final QmlFile file = createFile(project, name + " = " + value);
        return (QmlProperty) file.getFirstChild();
    }

    public static PsiElement createCRLF(Project project) {
        final QmlFile file = createFile(project, "\n");
        return file.getFirstChild();
    }

}
