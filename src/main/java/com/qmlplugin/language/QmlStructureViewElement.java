package com.qmlplugin.language;

import com.intellij.ide.projectView.PresentationData;
import com.intellij.ide.structureView.StructureViewTreeElement;
import com.intellij.ide.util.treeView.smartTree.SortableTreeElement;
import com.intellij.ide.util.treeView.smartTree.TreeElement;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.NavigatablePsiElement;
import com.intellij.psi.util.PsiTreeUtil;
import com.qmlplugin.language.psi.QmlFile;
import com.qmlplugin.language.psi.QmlProperty;
import com.qmlplugin.language.psi.impl.QmlPropertyImpl;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class QmlStructureViewElement implements StructureViewTreeElement, SortableTreeElement {
    private final NavigatablePsiElement myElement;

    public QmlStructureViewElement(NavigatablePsiElement element) {
        this.myElement = element;
    }

    @Override
    public Object getValue() {
        return myElement;
    }

    @Override
    public void navigate(boolean requestFocus) {
        myElement.navigate(requestFocus);
    }

    @Override
    public boolean canNavigate() {
        return myElement.canNavigate();
    }

    @Override
    public boolean canNavigateToSource() {
        return myElement.canNavigateToSource();
    }

    @NotNull
    @Override
    public String getAlphaSortKey() {
        String name = myElement.getName();
        return name != null ? name : "";
    }

    @NotNull
    @Override
    public ItemPresentation getPresentation() {
        ItemPresentation presentation = myElement.getPresentation();
        return presentation != null ? presentation : new PresentationData();
    }

    @Override
    public TreeElement @NotNull [] getChildren() {
        if (myElement instanceof QmlFile) {
            List<QmlProperty> properties = PsiTreeUtil.getChildrenOfTypeAsList(myElement, QmlProperty.class);
            List<TreeElement> treeElements = new ArrayList<>(properties.size());
            for (QmlProperty property : properties) {
                treeElements.add(new QmlStructureViewElement((QmlPropertyImpl) property));
            }
            return treeElements.toArray(new TreeElement[0]);
        }
        return EMPTY_ARRAY;
    }
}
