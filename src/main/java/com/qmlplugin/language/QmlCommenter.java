package com.qmlplugin.language;

import com.intellij.lang.Commenter;
import org.jetbrains.annotations.Nullable;

public class QmlCommenter implements Commenter {

    @Nullable
    @Override
    public String getLineCommentPrefix() {
        return "//";
    }

    @Nullable
    @Override
    public String getBlockCommentPrefix() {
        return "/*";
    }

    @Nullable
    @Override
    public String getBlockCommentSuffix() {
        return "*/";
    }

    @Nullable
    @Override
    public String getCommentedBlockCommentPrefix() {
        return "/**";
    }

    @Nullable
    @Override
    public String getCommentedBlockCommentSuffix() {
        return "**/";
    }

}

