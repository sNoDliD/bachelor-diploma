package com.qmlplugin.language.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.qmlplugin.language.psi.QmlElementFactory;
import com.qmlplugin.language.psi.QmlProperty;
import com.qmlplugin.language.psi.QmlTypes;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class QmlPsiImplUtil {

    public static String getKey(QmlProperty element) {
        ASTNode keyNode = element.getNode().findChildByType(QmlTypes.IDENTIFIER);
        if (keyNode != null) {
            // IMPORTANT: Convert embedded escaped spaces to simple spaces
            return keyNode.getText().replaceAll("\\\\ ", " ");
        } else {
            return null;
        }
    }

//    public static String getValue(QmlProperty element) {
//        ASTNode valueNode = element.getNode().findChildByType(QmlTypes.ASSIGNMENT_VALUE);
//        if (valueNode != null) {
//            return valueNode.getText();
//        } else {
//            return null;
//        }
//    }

    public static String getName(QmlProperty element) {
        return getKey(element);
    }

    public static PsiElement setName(QmlProperty element, String newName) {
        ASTNode keyNode = element.getNode().findChildByType(QmlTypes.DOT_CHAIN_NAME);
        if (keyNode != null) {
            QmlProperty property = QmlElementFactory.createProperty(element.getProject(), newName);
            ASTNode newKeyNode = property.getFirstChild().getNode();
            element.getNode().replaceChild(keyNode, newKeyNode);
        }
        return element;
    }

    public static PsiElement getNameIdentifier(QmlProperty element) {
        ASTNode keyNode = element.getNode().findChildByType(QmlTypes.DOT_CHAIN_NAME);
        if (keyNode != null) {
            return keyNode.getPsi();
        } else {
            return null;
        }
    }

    public static ItemPresentation getPresentation(final QmlProperty element) {
        return new ItemPresentation() {
            @Nullable
            @Override
            public String getPresentableText() {
                return element.getKey();
            }

            @Nullable
            @Override
            public String getLocationString() {
                PsiFile containingFile = element.getContainingFile();
                return containingFile == null ? null : containingFile.getName();
            }

            @Override
            public Icon getIcon(boolean unused) {
                return element.getIcon(0);
            }
        };
    }

}
