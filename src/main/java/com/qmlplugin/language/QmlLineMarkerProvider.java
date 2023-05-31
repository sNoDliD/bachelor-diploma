package com.qmlplugin.language;

import com.intellij.codeInsight.daemon.LineMarkerInfo;
import com.intellij.codeInsight.daemon.LineMarkerProvider;
import com.intellij.openapi.editor.markup.GutterIconRenderer;
import com.intellij.psi.PsiElement;
import com.intellij.psi.impl.source.tree.LeafPsiElement;
import com.intellij.util.ui.ImageUtil;
import com.intellij.util.ui.JBImageIcon;
import com.qmlplugin.language.psi.QmlTypes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class QmlLineMarkerProvider implements LineMarkerProvider {
    @Nullable
    @Override
    public LineMarkerInfo getLineMarkerInfo(@NotNull PsiElement element) {
        if (!(element instanceof LeafPsiElement)) {
            return null;
        }
        if (!((LeafPsiElement) element).getElementType().equals(QmlTypes.STRING)) {
            return null;
        }
        String color = element.getText().replace("\"", "");
        color = color.replace("'", "");
        if (color.equals("black")) {
            color = "#000000";
        } else if (color.equals("red")) {
            color = "#ff0000";
        } else if (color.equals("blue")) {
            color = "#0000ff";
        } else if (!(color.startsWith("#") && color.length() == 7)) {
            return null;
        }

        color = color.replace("#", "");
        int intColor = Integer.parseInt(color, 16);

        return new LineMarkerInfo(element, element.getTextRange(),
                IconCreator.createColorCircleIcon(15, new Color(intColor)),
                null, null, GutterIconRenderer.Alignment.CENTER);
    }
}

class IconCreator {
    public static Icon createColorCircleIcon(int size, Color color) {
        BufferedImage image = ImageUtil.createImage(size, size, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = image.createGraphics();
        g2.setColor(color);
        g2.fillOval(0, 0, size, size);
        g2.dispose();

        return new JBImageIcon(image);
    }
}
