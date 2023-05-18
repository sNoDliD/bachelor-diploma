package com.qmlplugin.language;

import com.google.common.collect.Lists;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.text.StringUtil;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiComment;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiManager;
import com.intellij.psi.PsiWhiteSpace;
import com.intellij.psi.search.FileTypeIndex;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.util.PsiTreeUtil;
import com.qmlplugin.language.psi.QmlFile;
import com.qmlplugin.language.psi.QmlProperty;
import org.jetbrains.annotations.NotNull;

import java.util.*;

public class QmlUtil {

    /**
     * Searches the entire project for Qml language files with instances of the Qml property with the given key.
     *
     * @param project current project
     * @param key     to check
     * @return matching properties
     */
    public static List<QmlProperty> findProperties(Project project, String key) {
        List<QmlProperty> result = new ArrayList<>();
        Collection<VirtualFile> virtualFiles =
                FileTypeIndex.getFiles(QmlFileType.INSTANCE, GlobalSearchScope.allScope(project));
        for (VirtualFile virtualFile : virtualFiles) {
            QmlFile QmlFile = (QmlFile) PsiManager.getInstance(project).findFile(virtualFile);
            if (QmlFile != null) {
                QmlProperty[] properties = PsiTreeUtil.getChildrenOfType(QmlFile, QmlProperty.class);
                if (properties != null) {
                    for (QmlProperty property : properties) {
                        if (key.equals(property.getKey())) {
                            result.add(property);
                        }
                    }
                }
            }
        }
        return result;
    }

    public static List<QmlProperty> findProperties(Project project) {
        List<QmlProperty> result = new ArrayList<>();
        Collection<VirtualFile> virtualFiles =
                FileTypeIndex.getFiles(QmlFileType.INSTANCE, GlobalSearchScope.allScope(project));
        for (VirtualFile virtualFile : virtualFiles) {
            QmlFile QmlFile = (QmlFile) PsiManager.getInstance(project).findFile(virtualFile);
            if (QmlFile != null) {
                QmlProperty[] properties = PsiTreeUtil.getChildrenOfType(QmlFile, QmlProperty.class);
                if (properties != null) {
                    Collections.addAll(result, properties);
                }
            }
        }
        return result;
    }

    /**
     * Attempts to collect any comment elements above the Qml key/value pair.
     */
    public static @NotNull String findDocumentationComment(QmlProperty property) {
        List<String> result = new LinkedList<>();
        PsiElement element = property.getPrevSibling();
        while (element instanceof PsiComment || element instanceof PsiWhiteSpace) {
            if (element instanceof PsiComment) {
                String commentText = element.getText().replaceFirst("[!# ]+", "");
                result.add(commentText);
            }
            element = element.getPrevSibling();
        }
        return StringUtil.join(Lists.reverse(result), "\n ");
    }
}
