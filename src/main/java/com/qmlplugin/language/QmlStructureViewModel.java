package com.qmlplugin.language;

import com.intellij.ide.structureView.StructureViewModel;
import com.intellij.ide.structureView.StructureViewModelBase;
import com.intellij.ide.structureView.StructureViewTreeElement;
import com.intellij.ide.util.treeView.smartTree.Sorter;
import com.intellij.openapi.editor.Editor;
import com.intellij.psi.PsiFile;
import com.qmlplugin.language.psi.QmlProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class QmlStructureViewModel extends StructureViewModelBase implements
        StructureViewModel.ElementInfoProvider {
    public QmlStructureViewModel(@Nullable Editor editor, PsiFile psiFile) {
        super(psiFile, editor, new QmlStructureViewElement(psiFile));
    }

    @NotNull
    public Sorter @NotNull [] getSorters() {
        return new Sorter[]{Sorter.ALPHA_SORTER};
    }


    @Override
    public boolean isAlwaysShowsPlus(StructureViewTreeElement element) {
        return false;
    }

    @Override
    public boolean isAlwaysLeaf(StructureViewTreeElement element) {
        return element.getValue() instanceof QmlProperty;
    }

    @Override
    protected Class<?> @NotNull [] getSuitableClasses() {
        return new Class[]{QmlProperty.class};
    }
}
