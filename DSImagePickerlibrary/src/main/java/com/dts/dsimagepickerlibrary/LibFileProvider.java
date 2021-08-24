package com.dts.dsimagepickerlibrary;

import android.content.Context;
import android.net.Uri;

import androidx.annotation.NonNull;
import androidx.core.content.FileProvider;

import java.io.File;

public class LibFileProvider extends FileProvider {
    private static final String FILE_PROVIDER = "com.orthotic.provider";

    public static String getAuthority(@NonNull Context context) {
        return FILE_PROVIDER;
    }

    public static Uri getUriForFile(@NonNull Context context, @NonNull File file) {
        return getUriForFile(context, getAuthority(context), file);
    }
    // This class intentionally left blank.

}
