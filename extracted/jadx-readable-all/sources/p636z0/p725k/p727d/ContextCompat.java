package p636z0.p725k.p727d;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import java.io.File;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: z0.k.d.a, reason: use source file name */
/* JADX INFO: compiled from: ContextCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class ContextCompat {

    /* JADX INFO: renamed from: a */
    public static final Object f37815a = new Object();

    /* JADX INFO: renamed from: z0.k.d.a$a */
    /* JADX INFO: compiled from: ContextCompat.java */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static void m16135a(Context context, Intent[] intentArr, Bundle bundle) {
            context.startActivities(intentArr, bundle);
        }

        /* JADX INFO: renamed from: b */
        public static void m16136b(Context context, Intent intent, Bundle bundle) {
            context.startActivity(intent, bundle);
        }
    }

    /* JADX INFO: renamed from: z0.k.d.a$b */
    /* JADX INFO: compiled from: ContextCompat.java */
    public static class b {
        /* JADX INFO: renamed from: a */
        public static File[] m16137a(Context context) {
            return context.getExternalCacheDirs();
        }

        /* JADX INFO: renamed from: b */
        public static File[] m16138b(Context context, String str) {
            return context.getExternalFilesDirs(str);
        }

        /* JADX INFO: renamed from: c */
        public static File[] m16139c(Context context) {
            return context.getObbDirs();
        }
    }

    /* JADX INFO: renamed from: z0.k.d.a$c */
    /* JADX INFO: compiled from: ContextCompat.java */
    public static class c {
        /* JADX INFO: renamed from: a */
        public static File m16140a(Context context) {
            return context.getCodeCacheDir();
        }

        /* JADX INFO: renamed from: b */
        public static Drawable m16141b(Context context, int i) {
            return context.getDrawable(i);
        }

        /* JADX INFO: renamed from: c */
        public static File m16142c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    /* JADX INFO: renamed from: z0.k.d.a$d */
    /* JADX INFO: compiled from: ContextCompat.java */
    public static class d {
        /* JADX INFO: renamed from: a */
        public static int m16143a(Context context, int i) {
            return context.getColor(i);
        }

        /* JADX INFO: renamed from: b */
        public static ColorStateList m16144b(Context context, int i) {
            return context.getColorStateList(i);
        }

        /* JADX INFO: renamed from: c */
        public static <T> T m16145c(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        /* JADX INFO: renamed from: d */
        public static String m16146d(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    /* JADX INFO: renamed from: z0.k.d.a$e */
    /* JADX INFO: compiled from: ContextCompat.java */
    public static class e {
        /* JADX INFO: renamed from: a */
        public static Context m16147a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        /* JADX INFO: renamed from: b */
        public static File m16148b(Context context) {
            return context.getDataDir();
        }

        /* JADX INFO: renamed from: c */
        public static boolean m16149c(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    /* JADX INFO: renamed from: z0.k.d.a$f */
    /* JADX INFO: compiled from: ContextCompat.java */
    public static class f {
        /* JADX INFO: renamed from: a */
        public static ComponentName m16150a(Context context, Intent intent) {
            return context.startForegroundService(intent);
        }
    }

    /* JADX INFO: renamed from: z0.k.d.a$g */
    /* JADX INFO: compiled from: ContextCompat.java */
    public static class g {
        /* JADX INFO: renamed from: a */
        public static Executor m16151a(Context context) {
            return context.getMainExecutor();
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m16133a(Context context, String str) {
        if (str != null) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new IllegalArgumentException("permission is null");
    }

    /* JADX INFO: renamed from: b */
    public static int m16134b(Context context, int i) {
        return Build.VERSION.SDK_INT >= 23 ? d.m16143a(context, i) : context.getResources().getColor(i);
    }
}
