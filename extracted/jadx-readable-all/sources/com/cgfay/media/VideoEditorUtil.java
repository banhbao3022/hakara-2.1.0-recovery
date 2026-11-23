package com.cgfay.media;

import android.content.Context;
import android.os.Environment;
import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: loaded from: classes.dex */
public class VideoEditorUtil {
    public static final String TAG = "VideoEditorUtil";

    private VideoEditorUtil() {
    }

    public static String createFile(String str, String str2) {
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(11);
        int i2 = calendar.get(12);
        int i3 = calendar.get(1);
        int i4 = calendar.get(2) + 1;
        int i5 = calendar.get(5);
        int i6 = calendar.get(13);
        int i7 = calendar.get(14);
        int i8 = i3 - 2000;
        File file = new File(str);
        if (!file.exists()) {
            file.mkdir();
        }
        StringBuilder sbM1556G = outline.m1556G(outline.m1599u(str, "/"));
        sbM1556G.append(String.valueOf(i8));
        StringBuilder sbM1556G2 = outline.m1556G(sbM1556G.toString());
        sbM1556G2.append(String.valueOf(i4));
        StringBuilder sbM1556G3 = outline.m1556G(sbM1556G2.toString());
        sbM1556G3.append(String.valueOf(i5));
        StringBuilder sbM1556G4 = outline.m1556G(sbM1556G3.toString());
        sbM1556G4.append(String.valueOf(i));
        StringBuilder sbM1556G5 = outline.m1556G(sbM1556G4.toString());
        sbM1556G5.append(String.valueOf(i2));
        StringBuilder sbM1556G6 = outline.m1556G(sbM1556G5.toString());
        sbM1556G6.append(String.valueOf(i6));
        StringBuilder sbM1556G7 = outline.m1556G(sbM1556G6.toString());
        sbM1556G7.append(String.valueOf(i7));
        String string = sbM1556G7.toString();
        if (!str2.startsWith(".")) {
            string = outline.m1599u(string, ".");
        }
        String strM1599u = outline.m1599u(string, str2);
        try {
            Thread.sleep(1L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        File file2 = new File(strM1599u);
        if (!file2.exists()) {
            try {
                file2.createNewFile();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
        return strM1599u;
    }

    public static String createFileInBox(Context context, String str) {
        return createFile((!"mounted".equals(Environment.getExternalStorageState()) || context.getExternalCacheDir() == null) ? context.getCacheDir().getAbsolutePath() : context.getExternalCacheDir().getAbsolutePath(), str);
    }

    public static String createPath(String str, String str2) {
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(11);
        int i2 = calendar.get(12);
        int i3 = calendar.get(1);
        int i4 = calendar.get(2) + 1;
        int i5 = calendar.get(5);
        int i6 = calendar.get(13);
        int i7 = calendar.get(14);
        int i8 = i3 - 2000;
        File file = new File(str);
        if (!file.exists()) {
            file.mkdir();
        }
        StringBuilder sbM1556G = outline.m1556G(outline.m1599u(str, "/"));
        sbM1556G.append(String.valueOf(i8));
        StringBuilder sbM1556G2 = outline.m1556G(sbM1556G.toString());
        sbM1556G2.append(String.valueOf(i4));
        StringBuilder sbM1556G3 = outline.m1556G(sbM1556G2.toString());
        sbM1556G3.append(String.valueOf(i5));
        StringBuilder sbM1556G4 = outline.m1556G(sbM1556G3.toString());
        sbM1556G4.append(String.valueOf(i));
        StringBuilder sbM1556G5 = outline.m1556G(sbM1556G4.toString());
        sbM1556G5.append(String.valueOf(i2));
        StringBuilder sbM1556G6 = outline.m1556G(sbM1556G5.toString());
        sbM1556G6.append(String.valueOf(i6));
        StringBuilder sbM1556G7 = outline.m1556G(sbM1556G6.toString());
        sbM1556G7.append(String.valueOf(i7));
        String string = sbM1556G7.toString();
        if (!str2.startsWith(".")) {
            string = outline.m1599u(string, ".");
        }
        return outline.m1599u(string, str2);
    }

    public static String createPathInBox(Context context, String str) {
        return createPath((!"mounted".equals(Environment.getExternalStorageState()) || context.getExternalCacheDir() == null) ? context.getCacheDir().getAbsolutePath() : context.getExternalCacheDir().getAbsolutePath(), str);
    }
}
