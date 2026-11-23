package p007c.p190n.p385d.p391l.p392e.p395k;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Debug;
import android.os.StatFs;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;
import p007c.p190n.p385d.p391l.p392e.Logger4;
import p007c.p190n.p385d.p391l.p392e.p401p.CodedOutputStream;

/* JADX INFO: renamed from: c.n.d.l.e.k.g, reason: use source file name */
/* JADX INFO: compiled from: CommonUtils.java */
/* JADX INFO: loaded from: classes.dex */
public class CommonUtils {

    /* JADX INFO: renamed from: a */
    public static final char[] f26485a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: b */
    public static long f26486b = -1;

    /* JADX INFO: renamed from: c */
    public static final Comparator<File> f26487c = new a();

    /* JADX INFO: renamed from: c.n.d.l.e.k.g$a */
    /* JADX INFO: compiled from: CommonUtils.java */
    public class a implements Comparator<File> {
        @Override // java.util.Comparator
        public int compare(File file, File file2) {
            return (int) (file.lastModified() - file2.lastModified());
        }
    }

    /* JADX INFO: renamed from: c.n.d.l.e.k.g$b */
    /* JADX INFO: compiled from: CommonUtils.java */
    public enum b {
        X86_32,
        X86_64,
        ARM_UNKNOWN,
        PPC,
        PPC64,
        ARMV6,
        ARMV7,
        UNKNOWN,
        ARMV7S,
        ARM64;


        /* JADX INFO: renamed from: p */
        public static final Map<String, b> f26498p;

        static {
            b bVar = X86_32;
            b bVar2 = ARMV6;
            b bVar3 = ARMV7;
            b bVar4 = ARM64;
            HashMap map = new HashMap(4);
            f26498p = map;
            map.put("armeabi-v7a", bVar3);
            map.put("armeabi", bVar2);
            map.put("arm64-v8a", bVar4);
            map.put("x86", bVar);
        }
    }

    /* JADX INFO: renamed from: a */
    public static long m11738a(String str) {
        StatFs statFs = new StatFs(str);
        long blockSize = statFs.getBlockSize();
        return (((long) statFs.getBlockCount()) * blockSize) - (blockSize * ((long) statFs.getAvailableBlocks()));
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: b */
    public static boolean m11739b(Context context) {
        if (!(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0)) {
            return true;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }

    /* JADX INFO: renamed from: c */
    public static void m11740c(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                Logger4 logger4 = Logger4.f26421a;
                if (logger4.m11712a(6)) {
                    Log.e(logger4.f26422b, str, e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static long m11741d(String str, String str2, int i) {
        return Long.parseLong(str.split(str2)[0].trim()) * ((long) i);
    }

    /* JADX INFO: renamed from: e */
    public static String m11742e(String... strArr) {
        if (strArr.length != 0) {
            ArrayList arrayList = new ArrayList();
            for (String str : strArr) {
                if (str != null) {
                    arrayList.add(str.replace("-", "").toLowerCase(Locale.US));
                }
            }
            Collections.sort(arrayList);
            StringBuilder sb = new StringBuilder();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                sb.append((String) it.next());
            }
            String string = sb.toString();
            if (string.length() > 0) {
                return m11757t(string);
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX INFO: renamed from: f */
    public static String m11743f(File file, String str) throws Throwable {
        ?? Exists = file.exists();
        String str2 = null;
        str2 = null;
        str2 = null;
        ?? r2 = 0;
        try {
            if (Exists != 0) {
                try {
                    Exists = new BufferedReader(new FileReader(file), 1024);
                    while (true) {
                        try {
                            String line = Exists.readLine();
                            if (line == null) {
                                break;
                            }
                            String[] strArrSplit = Pattern.compile("\\s*:\\s*").split(line, 2);
                            if (strArrSplit.length > 1 && strArrSplit[0].equals(str)) {
                                str2 = strArrSplit[1];
                                break;
                            }
                        } catch (Exception e) {
                            e = e;
                            Logger4.f26421a.m11716e("Error parsing " + file, e);
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    Exists = 0;
                } catch (Throwable th) {
                    th = th;
                    m11740c(r2, "Failed to close system file reader.");
                    throw th;
                }
                m11740c(Exists, "Failed to close system file reader.");
            }
            return str2;
        } catch (Throwable th2) {
            th = th2;
            r2 = Exists;
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m11744g(Flushable flushable, String str) {
        if (flushable != null) {
            try {
                ((CodedOutputStream) flushable).flush();
            } catch (IOException e) {
                Logger4 logger4 = Logger4.f26421a;
                if (logger4.m11712a(6)) {
                    Log.e(logger4.f26422b, str, e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static ActivityManager.RunningAppProcessInfo m11745h(String str, Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.processName.equals(str)) {
                    return runningAppProcessInfo;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m11746i(Context context, String str, boolean z) {
        Resources resources;
        if (context != null && (resources = context.getResources()) != null) {
            int iM11750m = m11750m(context, str, "bool");
            if (iM11750m > 0) {
                return resources.getBoolean(iM11750m);
            }
            int iM11750m2 = m11750m(context, str, "string");
            if (iM11750m2 > 0) {
                return Boolean.parseBoolean(context.getString(iM11750m2));
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: j */
    public static int m11747j(Context context) {
        boolean z = true;
        int i = m11754q(context) ? 1 : 0;
        if (m11756s(context)) {
            i |= 2;
        }
        if (!Debug.isDebuggerConnected() && !Debug.waitingForDebugger()) {
            z = false;
        }
        return z ? i | 4 : i;
    }

    /* JADX INFO: renamed from: k */
    public static String m11748k(Context context) {
        int iM11750m = m11750m(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
        if (iM11750m == 0) {
            iM11750m = m11750m(context, "com.crashlytics.android.build_id", "string");
        }
        if (iM11750m != 0) {
            return context.getResources().getString(iM11750m);
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m11749l(Context context) {
        return (m11754q(context) || ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) == null) ? false : true;
    }

    /* JADX INFO: renamed from: m */
    public static int m11750m(Context context, String str, String str2) {
        String packageName;
        Resources resources = context.getResources();
        int i = context.getApplicationContext().getApplicationInfo().icon;
        if (i > 0) {
            try {
                packageName = context.getResources().getResourcePackageName(i);
                if ("android".equals(packageName)) {
                    packageName = context.getPackageName();
                }
            } catch (Resources.NotFoundException unused) {
                packageName = context.getPackageName();
            }
        } else {
            packageName = context.getPackageName();
        }
        return resources.getIdentifier(str, str2, packageName);
    }

    /* JADX INFO: renamed from: n */
    public static SharedPreferences m11751n(Context context) {
        return context.getSharedPreferences("com.google.firebase.crashlytics", 0);
    }

    /* JADX INFO: renamed from: o */
    public static synchronized long m11752o() {
        if (f26486b == -1) {
            long jM11741d = 0;
            String strM11743f = m11743f(new File("/proc/meminfo"), "MemTotal");
            if (!TextUtils.isEmpty(strM11743f)) {
                String upperCase = strM11743f.toUpperCase(Locale.US);
                try {
                    if (upperCase.endsWith("KB")) {
                        jM11741d = m11741d(upperCase, "KB", 1024);
                    } else if (upperCase.endsWith("MB")) {
                        jM11741d = m11741d(upperCase, "MB", 1048576);
                    } else if (upperCase.endsWith("GB")) {
                        jM11741d = m11741d(upperCase, "GB", 1073741824);
                    } else {
                        Logger4.f26421a.m11713b("Unexpected meminfo format while computing RAM: " + upperCase);
                    }
                } catch (NumberFormatException e) {
                    Logger4.f26421a.m11716e("Unexpected meminfo format while computing RAM: " + upperCase, e);
                }
            }
            f26486b = jM11741d;
        }
        return f26486b;
    }

    /* JADX INFO: renamed from: p */
    public static String m11753p(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = bArr[i] & 255;
            int i3 = i * 2;
            char[] cArr2 = f26485a;
            cArr[i3] = cArr2[i2 >>> 4];
            cArr[i3 + 1] = cArr2[i2 & 15];
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: q */
    public static boolean m11754q(Context context) {
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        String str = Build.PRODUCT;
        return "sdk".equals(str) || "google_sdk".equals(str) || string == null;
    }

    /* JADX INFO: renamed from: r */
    public static boolean m11755r(String str) {
        return str == null || str.length() == 0;
    }

    /* JADX INFO: renamed from: s */
    public static boolean m11756s(Context context) {
        boolean zM11754q = m11754q(context);
        String str = Build.TAGS;
        if ((zM11754q || str == null || !str.contains("test-keys")) && !new File("/system/app/Superuser.apk").exists()) {
            return !zM11754q && new File("/system/xbin/su").exists();
        }
        return true;
    }

    /* JADX INFO: renamed from: t */
    public static String m11757t(String str) {
        byte[] bytes = str.getBytes();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(bytes);
            return m11753p(messageDigest.digest());
        } catch (NoSuchAlgorithmException e) {
            Logger4.f26421a.m11716e("Could not create hashing algorithm: SHA-1, returning empty string.", e);
            return "";
        }
    }

    /* JADX INFO: renamed from: u */
    public static String m11758u(InputStream inputStream) throws IOException {
        Scanner scannerUseDelimiter = new Scanner(inputStream).useDelimiter("\\A");
        return scannerUseDelimiter.hasNext() ? scannerUseDelimiter.next() : "";
    }
}
