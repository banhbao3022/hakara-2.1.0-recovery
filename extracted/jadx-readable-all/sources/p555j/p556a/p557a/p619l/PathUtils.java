package p555j.p556a.p557a.p619l;

import android.content.Context;
import android.os.Environment;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import p636z0.p725k.p727d.ContextCompat;

/* JADX INFO: renamed from: j.a.a.l.m, reason: use source file name */
/* JADX INFO: compiled from: PathUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public class PathUtils {
    /* JADX INFO: renamed from: a */
    public static String m14255a(String str) {
        File file = new File(str);
        if (!file.exists()) {
            file.mkdir();
        }
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static void m14256b(File file, String str) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        FileOutputStream fileOutputStream = new FileOutputStream(str);
        byte[] bArr = new byte[1024];
        while (true) {
            int i = fileInputStream.read(bArr);
            if (i <= 0) {
                fileOutputStream.flush();
                fileOutputStream.close();
                fileInputStream.close();
                return;
            }
            fileOutputStream.write(bArr, 0, i);
        }
    }

    /* JADX INFO: renamed from: c */
    public static long m14257c(File file) {
        long length = 0;
        for (File file2 : file.listFiles()) {
            length += file2.isFile() ? file2.length() : m14257c(file2);
        }
        return length;
    }

    /* JADX INFO: renamed from: d */
    public static String m14258d(Context context) {
        String str = m14260f(context) + "/audios";
        File file = new File(str);
        if (!file.exists()) {
            file.mkdir();
        }
        return str;
    }

    /* JADX INFO: renamed from: e */
    public static String m14259e(Context context) {
        String str = m14260f(context) + "/recordings";
        File file = new File(str);
        if (!file.exists()) {
            file.mkdir();
        }
        return str;
    }

    /* JADX INFO: renamed from: f */
    public static String m14260f(Context context) {
        if (!"mounted".equals(Environment.getExternalStorageState())) {
            return context.getApplicationContext().getFilesDir().getAbsolutePath();
        }
        Context applicationContext = context.getApplicationContext();
        Object obj = ContextCompat.f37815a;
        return ContextCompat.b.m16138b(applicationContext, null)[0].getAbsolutePath();
    }

    /* JADX INFO: renamed from: g */
    public static String m14261g(Context context) {
        String str = m14260f(context) + "/tmp";
        File file = new File(str);
        if (!file.exists()) {
            file.mkdir();
        }
        return str;
    }

    /* JADX INFO: renamed from: h */
    public static String m14262h(Context context) {
        String str = m14260f(context) + "/videos";
        File file = new File(str);
        if (!file.exists()) {
            file.mkdir();
        }
        return str;
    }

    /* JADX INFO: renamed from: i */
    public static String m14263i(Context context) {
        String str = m14260f(context) + "/voices";
        File file = new File(str);
        if (!file.exists()) {
            file.mkdir();
        }
        return str;
    }
}
