package p007c.p114h.p122b;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import mtp.media.karaoke.R;
import p007c.p071d.p078c.p079a.outline;
import p007c.p114h.p147g.p149b.PermissionConfirmDialogFragment;
import p636z0.p725k.C8162a;
import p636z0.p725k.p727d.ContextCompat;
import p636z0.p752p.p753c.Fragment;
import p636z0.p752p.p753c.FragmentHostCallback;

/* JADX INFO: renamed from: c.h.b.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0868a {
    /* JADX INFO: renamed from: a */
    public static String m2105a(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                return sb.toString();
            }
            sb.append(line);
            sb.append("\n");
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m2106b(String str) {
        File file = null;
        if (str != null) {
            if (m2111g(str)) {
                file = new File(outline.m1600v(str, "/", ".nomedia"));
            } else {
                Log.e("FileUtils", "create parent directory failed, " + str);
            }
        }
        if (file != null) {
            try {
                file.createNewFile();
            } catch (IOException unused) {
                Log.e("FileUtils", "createNoMediaFile:  failed to create nomedia file");
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m2107c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return new File(str).delete();
    }

    /* JADX INFO: renamed from: d */
    public static String m2108d(String str) {
        int length = str.length();
        int iLastIndexOf = str.lastIndexOf(47);
        if (iLastIndexOf == -1 || str.charAt(length - 1) == '/') {
            return str;
        }
        return (str.indexOf(47) == iLastIndexOf && str.charAt(0) == '/') ? str.substring(0, iLastIndexOf + 1) : str.substring(0, iLastIndexOf);
    }

    /* JADX INFO: renamed from: e */
    public static String m2109e(String str) {
        int iLastIndexOf = str.lastIndexOf("/");
        return iLastIndexOf < 0 ? str : str.substring(iLastIndexOf + 1, str.length());
    }

    /* JADX INFO: renamed from: f */
    public static boolean m2110f(String str) {
        if (str == null) {
            return false;
        }
        return new File(str).exists();
    }

    /* JADX INFO: renamed from: g */
    public static boolean m2111g(String str) {
        File file = new File(str);
        return file.exists() ? file.isDirectory() : file.mkdirs();
    }

    /* JADX INFO: renamed from: h */
    public static boolean m2112h(Context context, String str) {
        int i;
        try {
            i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.targetSdkVersion;
        } catch (PackageManager.NameNotFoundException unused) {
            i = 1;
        }
        if (Build.VERSION.SDK_INT < 23 || i < 23) {
            if (C8162a.m16064i(context, str) == 0) {
                return true;
            }
        } else if (ContextCompat.m16133a(context, str) == 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public static void m2113i(Fragment fragment) {
        FragmentHostCallback<?> fragmentHostCallback = fragment.f38451z;
        if (fragmentHostCallback != null ? fragmentHostCallback.mo16584j("android.permission.CAMERA") : false) {
            PermissionConfirmDialogFragment.m2216d1(fragment.m16546Q(R.string.request_camera_permission), 1, true).mo5469c1(fragment.m16570w(), "dialog");
        } else {
            fragment.m16523D0(new String[]{"android.permission.CAMERA"}, 1);
        }
    }

    /* JADX INFO: renamed from: j */
    public static boolean m2114j(Closeable closeable) {
        if (closeable == null) {
            return true;
        }
        try {
            closeable.close();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }
}
