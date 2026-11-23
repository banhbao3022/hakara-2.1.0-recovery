package p007c.p165l.p178k0;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcel;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.facebook.stetho.common.Utf8Charset;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import p007c.p165l.FacebookException;
import p007c.p165l.FacebookRequestError;
import p007c.p165l.FacebookSdk;
import p007c.p165l.GraphRequest2;
import p007c.p165l.GraphResponse;
import p007c.p165l.HttpMethod;
import p007c.p165l.LoggingBehavior;

/* JADX INFO: renamed from: c.l.k0.e0, reason: use source file name */
/* JADX INFO: compiled from: Utility.java */
/* JADX INFO: loaded from: classes.dex */
public final class Utility {

    /* JADX INFO: renamed from: a */
    public static int f4909a = 0;

    /* JADX INFO: renamed from: b */
    public static long f4910b = -1;

    /* JADX INFO: renamed from: c */
    public static long f4911c = -1;

    /* JADX INFO: renamed from: d */
    public static long f4912d = -1;

    /* JADX INFO: renamed from: e */
    public static String f4913e = "";

    /* JADX INFO: renamed from: f */
    public static String f4914f = "";

    /* JADX INFO: renamed from: g */
    public static String f4915g = "NoCarrier";

    /* JADX INFO: renamed from: c.l.k0.e0$a */
    /* JADX INFO: compiled from: Utility.java */
    public static class a implements GraphRequest2.c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ b f4916a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f4917b;

        public a(b bVar, String str) {
            this.f4916a = bVar;
            this.f4917b = str;
        }

        @Override // p007c.p165l.GraphRequest2.c
        /* JADX INFO: renamed from: b */
        public void mo2263b(GraphResponse graphResponse) {
            FacebookRequestError facebookRequestError = graphResponse.f5409d;
            if (facebookRequestError != null) {
                this.f4916a.mo2469b(facebookRequestError.f5184p);
                return;
            }
            ProfileInformationCache.f4895a.put(this.f4917b, graphResponse.f5408c);
            this.f4916a.mo2468a(graphResponse.f5408c);
        }
    }

    /* JADX INFO: renamed from: c.l.k0.e0$b */
    /* JADX INFO: compiled from: Utility.java */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo2468a(JSONObject jSONObject);

        /* JADX INFO: renamed from: b */
        void mo2469b(FacebookException facebookException);
    }

    /* JADX INFO: renamed from: c.l.k0.e0$c */
    /* JADX INFO: compiled from: Utility.java */
    public interface c<T, K> {
        K apply(T t);
    }

    /* JADX INFO: renamed from: c.l.k0.e0$d */
    /* JADX INFO: compiled from: Utility.java */
    public static class d {

        /* JADX INFO: renamed from: a */
        public List<String> f4918a;

        /* JADX INFO: renamed from: b */
        public List<String> f4919b;

        /* JADX INFO: renamed from: c */
        public List<String> f4920c;

        public d(List<String> list, List<String> list2, List<String> list3) {
            this.f4918a = list;
            this.f4919b = list2;
            this.f4920c = list3;
        }
    }

    /* JADX INFO: renamed from: A */
    public static boolean m2428A(Uri uri) {
        return uri != null && ("http".equalsIgnoreCase(uri.getScheme()) || "https".equalsIgnoreCase(uri.getScheme()) || "fbstaging".equalsIgnoreCase(uri.getScheme()));
    }

    /* JADX INFO: renamed from: B */
    public static List<String> m2429B(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: C */
    public static <T, K> List<K> m2430C(List<T> list, c<T, K> cVar) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            K kApply = cVar.apply(it.next());
            if (kApply != null) {
                arrayList.add(kApply);
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: D */
    public static String m2431D(Map<String, String> map) {
        if (map.isEmpty()) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: E */
    public static Bundle m2432E(String str) {
        Bundle bundle = new Bundle();
        if (!m2466y(str)) {
            for (String str2 : str.split("&")) {
                String[] strArrSplit = str2.split("=");
                try {
                    if (strArrSplit.length == 2) {
                        bundle.putString(URLDecoder.decode(strArrSplit[0], Utf8Charset.NAME), URLDecoder.decode(strArrSplit[1], Utf8Charset.NAME));
                    } else if (strArrSplit.length == 1) {
                        bundle.putString(URLDecoder.decode(strArrSplit[0], Utf8Charset.NAME), "");
                    }
                } catch (UnsupportedEncodingException unused) {
                    HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
                }
            }
        }
        return bundle;
    }

    /* JADX INFO: renamed from: F */
    public static boolean m2433F(Bundle bundle, String str, Object obj) {
        if (obj == null) {
            bundle.remove(str);
            return true;
        }
        if (obj instanceof Boolean) {
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            return true;
        }
        if (obj instanceof boolean[]) {
            bundle.putBooleanArray(str, (boolean[]) obj);
            return true;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return true;
        }
        if (obj instanceof double[]) {
            bundle.putDoubleArray(str, (double[]) obj);
            return true;
        }
        if (obj instanceof Integer) {
            bundle.putInt(str, ((Integer) obj).intValue());
            return true;
        }
        if (obj instanceof int[]) {
            bundle.putIntArray(str, (int[]) obj);
            return true;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return true;
        }
        if (obj instanceof long[]) {
            bundle.putLongArray(str, (long[]) obj);
            return true;
        }
        if (obj instanceof String) {
            bundle.putString(str, (String) obj);
            return true;
        }
        if (obj instanceof JSONArray) {
            bundle.putString(str, obj.toString());
            return true;
        }
        if (!(obj instanceof JSONObject)) {
            return false;
        }
        bundle.putString(str, obj.toString());
        return true;
    }

    /* JADX INFO: renamed from: G */
    public static void m2434G(Bundle bundle, String str, String str2) {
        if (m2466y(str2)) {
            return;
        }
        bundle.putString(str, str2);
    }

    /* JADX INFO: renamed from: H */
    public static void m2435H(Bundle bundle, String str, Uri uri) {
        if (uri != null) {
            m2434G(bundle, str, uri.toString());
        }
    }

    /* JADX INFO: renamed from: I */
    public static String m2436I(InputStream inputStream) throws Throwable {
        BufferedInputStream bufferedInputStream;
        Throwable th;
        InputStreamReader inputStreamReader;
        try {
            bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                inputStreamReader = new InputStreamReader(bufferedInputStream);
                try {
                    StringBuilder sb = new StringBuilder();
                    char[] cArr = new char[2048];
                    while (true) {
                        int i = inputStreamReader.read(cArr);
                        if (i == -1) {
                            break;
                        }
                        sb.append(cArr, 0, i);
                    }
                    String string = sb.toString();
                    try {
                        bufferedInputStream.close();
                    } catch (IOException unused) {
                    }
                    try {
                        inputStreamReader.close();
                    } catch (IOException unused2) {
                    }
                    return string;
                } catch (Throwable th2) {
                    th = th2;
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    if (inputStreamReader == null) {
                        throw th;
                    }
                    try {
                        inputStreamReader.close();
                        throw th;
                    } catch (IOException unused4) {
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                inputStreamReader = null;
            }
        } catch (Throwable th4) {
            bufferedInputStream = null;
            th = th4;
            inputStreamReader = null;
        }
    }

    /* JADX INFO: renamed from: J */
    public static Map<String, String> m2437J(Parcel parcel) {
        int i = parcel.readInt();
        if (i < 0) {
            return null;
        }
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < i; i2++) {
            map.put(parcel.readString(), parcel.readString());
        }
        return map;
    }

    /* JADX INFO: renamed from: K */
    public static void m2438K(Runnable runnable) {
        try {
            FacebookSdk.m2660b().execute(runnable);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: L */
    public static void m2439L(JSONObject jSONObject, Context context) throws JSONException {
        String str;
        Locale locale;
        int i;
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("a2");
        int i2 = 0;
        if (f4910b == -1 || System.currentTimeMillis() - f4910b >= 1800000) {
            f4910b = System.currentTimeMillis();
            try {
                TimeZone timeZone = TimeZone.getDefault();
                f4913e = timeZone.getDisplayName(timeZone.inDaylightTime(new Date()), 0);
                f4914f = timeZone.getID();
            } catch (AssertionError | Exception unused) {
            }
            if (f4915g.equals("NoCarrier")) {
                try {
                    f4915g = ((TelephonyManager) context.getSystemService("phone")).getNetworkOperatorName();
                } catch (Exception unused2) {
                }
            }
            try {
                if ("mounted".equals(Environment.getExternalStorageState())) {
                    StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                    f4911c = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
                }
                f4911c = Math.round(f4911c / 1.073741824E9d);
            } catch (Exception unused3) {
            }
            try {
                if ("mounted".equals(Environment.getExternalStorageState())) {
                    StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getPath());
                    f4912d = ((long) statFs2.getAvailableBlocks()) * ((long) statFs2.getBlockSize());
                }
                f4912d = Math.round(f4912d / 1.073741824E9d);
            } catch (Exception unused4) {
            }
        }
        String packageName = context.getPackageName();
        int i3 = -1;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            i3 = packageInfo.versionCode;
            str = packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused5) {
            str = "";
        }
        jSONArray.put(packageName);
        jSONArray.put(i3);
        jSONArray.put(str);
        jSONArray.put(Build.VERSION.RELEASE);
        jSONArray.put(Build.MODEL);
        try {
            locale = context.getResources().getConfiguration().locale;
        } catch (Exception unused6) {
            locale = Locale.getDefault();
        }
        jSONArray.put(locale.getLanguage() + "_" + locale.getCountry());
        jSONArray.put(f4913e);
        jSONArray.put(f4915g);
        double d2 = 0.0d;
        try {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                Display defaultDisplay = windowManager.getDefaultDisplay();
                DisplayMetrics displayMetrics = new DisplayMetrics();
                defaultDisplay.getMetrics(displayMetrics);
                i = displayMetrics.widthPixels;
                try {
                    i2 = displayMetrics.heightPixels;
                    d2 = displayMetrics.density;
                } catch (Exception unused7) {
                }
            } else {
                i = 0;
            }
        } catch (Exception unused8) {
        }
        jSONArray.put(i);
        jSONArray.put(i2);
        jSONArray.put(new DecimalFormat("#.##").format(d2));
        int i4 = f4909a;
        if (i4 <= 0) {
            try {
                File[] fileArrListFiles = new File("/sys/devices/system/cpu/").listFiles(new Utility2());
                if (fileArrListFiles != null) {
                    f4909a = fileArrListFiles.length;
                }
            } catch (Exception unused9) {
            }
            if (f4909a <= 0) {
                f4909a = Math.max(Runtime.getRuntime().availableProcessors(), 1);
            }
            i4 = f4909a;
        }
        jSONArray.put(i4);
        jSONArray.put(f4911c);
        jSONArray.put(f4912d);
        jSONArray.put(f4914f);
        jSONObject.put("extinfo", jSONArray.toString());
    }

    /* JADX INFO: renamed from: M */
    public static String m2440M(String str) {
        if (str == null) {
            return null;
        }
        return m2460s("SHA-256", str.getBytes());
    }

    /* JADX INFO: renamed from: N */
    public static void m2441N(Parcel parcel, Map<String, String> map) {
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
    }

    /* JADX INFO: renamed from: a */
    public static Map<String, String> m2442a(String str) {
        if (str.isEmpty()) {
            return new HashMap();
        }
        try {
            HashMap map = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.getString(next));
            }
            return map;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    /* JADX INFO: renamed from: b */
    public static <T> boolean m2443b(T t, T t2) {
        if (t == null) {
            return t2 == null;
        }
        return t.equals(t2);
    }

    /* JADX INFO: renamed from: c */
    public static Uri m2444c(String str, String str2, Bundle bundle) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https");
        builder.authority(str);
        builder.path(str2);
        if (bundle != null) {
            for (String str3 : bundle.keySet()) {
                Object obj = bundle.get(str3);
                if (obj instanceof String) {
                    builder.appendQueryParameter(str3, (String) obj);
                }
            }
        }
        return builder.build();
    }

    /* JADX INFO: renamed from: d */
    public static void m2445d(Context context, String str) {
        CookieSyncManager.createInstance(context).sync();
        CookieManager cookieManager = CookieManager.getInstance();
        String cookie = cookieManager.getCookie(str);
        if (cookie == null) {
            return;
        }
        for (String str2 : cookie.split(";")) {
            String[] strArrSplit = str2.split("=");
            if (strArrSplit.length > 0) {
                cookieManager.setCookie(str, strArrSplit[0].trim() + "=;expires=Sat, 1 Jan 2000 00:00:01 UTC;");
            }
        }
        cookieManager.removeExpiredCookie();
    }

    /* JADX INFO: renamed from: e */
    public static String m2446e(String str, String str2) {
        return m2466y(str) ? str2 : str;
    }

    /* JADX INFO: renamed from: f */
    public static int m2447f(InputStream inputStream, OutputStream outputStream) throws Throwable {
        BufferedInputStream bufferedInputStream = null;
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(inputStream);
            try {
                byte[] bArr = new byte[8192];
                int i = 0;
                while (true) {
                    int i2 = bufferedInputStream2.read(bArr);
                    if (i2 == -1) {
                        break;
                    }
                    outputStream.write(bArr, 0, i2);
                    i += i2;
                }
                bufferedInputStream2.close();
                if (inputStream != null) {
                    inputStream.close();
                }
                return i;
            } catch (Throwable th) {
                th = th;
                bufferedInputStream = bufferedInputStream2;
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m2448g(File file) {
        File[] fileArrListFiles;
        if (file.exists()) {
            if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
                for (File file2 : fileArrListFiles) {
                    m2448g(file2);
                }
            }
            file.delete();
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m2449h(URLConnection uRLConnection) {
        if (uRLConnection == null || !(uRLConnection instanceof HttpURLConnection)) {
            return;
        }
        ((HttpURLConnection) uRLConnection).disconnect();
    }

    /* JADX INFO: renamed from: i */
    public static String m2450i(Context context) {
        if (context == null) {
            return "null";
        }
        return context == context.getApplicationContext() ? "unknown" : context.getClass().getSimpleName();
    }

    /* JADX INFO: renamed from: j */
    public static Date m2451j(Bundle bundle, String str, Date date) {
        long jLongValue;
        if (bundle == null) {
            return null;
        }
        Object obj = bundle.get(str);
        if (obj instanceof Long) {
            jLongValue = ((Long) obj).longValue();
        } else {
            if (!(obj instanceof String)) {
                return null;
            }
            try {
                jLongValue = Long.parseLong((String) obj);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        if (jLongValue == 0) {
            return new Date(Long.MAX_VALUE);
        }
        return new Date((jLongValue * 1000) + date.getTime());
    }

    /* JADX INFO: renamed from: k */
    public static GraphRequest2 m2452k(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,name,first_name,middle_name,last_name,link");
        bundle.putString("access_token", str);
        return new GraphRequest2(null, "me", bundle, HttpMethod.GET, null);
    }

    /* JADX INFO: renamed from: l */
    public static void m2453l(String str, b bVar) {
        JSONObject jSONObject = ProfileInformationCache.f4895a.get(str);
        if (jSONObject != null) {
            bVar.mo2468a(jSONObject);
            return;
        }
        a aVar = new a(bVar, str);
        GraphRequest2 graphRequest2M2452k = m2452k(str);
        graphRequest2M2452k.m2691u(aVar);
        graphRequest2M2452k.m2688e();
    }

    /* JADX INFO: renamed from: m */
    public static String m2454m(Context context) {
        Validate.m2477f(context, "context");
        FacebookSdk.m2667i(context);
        Validate.m2479h();
        return FacebookSdk.f5354c;
    }

    /* JADX INFO: renamed from: n */
    public static Method m2455n(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: o */
    public static Locale m2456o() {
        try {
            HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
            Validate.m2479h();
            return FacebookSdk.f5360i.getResources().getConfiguration().locale;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: p */
    public static Object m2457p(JSONObject jSONObject, String str, String str2) throws JSONException {
        Object objOpt = jSONObject.opt(str);
        if (objOpt != null && (objOpt instanceof String)) {
            objOpt = new JSONTokener((String) objOpt).nextValue();
        }
        if (objOpt == null || (objOpt instanceof JSONObject) || (objOpt instanceof JSONArray)) {
            return objOpt;
        }
        if (str2 == null) {
            throw new FacebookException("Got an unexpected non-JSON object.");
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.putOpt(str2, objOpt);
        return jSONObject2;
    }

    /* JADX INFO: renamed from: q */
    public static String m2458q(Uri uri) {
        if (uri == null) {
            return null;
        }
        return uri.toString();
    }

    /* JADX INFO: renamed from: r */
    public static d m2459r(JSONObject jSONObject) throws JSONException {
        String strOptString;
        JSONArray jSONArray = jSONObject.getJSONObject("permissions").getJSONArray("data");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        ArrayList arrayList2 = new ArrayList(jSONArray.length());
        ArrayList arrayList3 = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            String strOptString2 = jSONObjectOptJSONObject.optString("permission");
            if (strOptString2 != null && !strOptString2.equals("installed") && (strOptString = jSONObjectOptJSONObject.optString("status")) != null) {
                if (strOptString.equals("granted")) {
                    arrayList.add(strOptString2);
                } else if (strOptString.equals("declined")) {
                    arrayList2.add(strOptString2);
                } else if (strOptString.equals("expired")) {
                    arrayList3.add(strOptString2);
                }
            }
        }
        return new d(arrayList, arrayList2, arrayList3);
    }

    /* JADX INFO: renamed from: s */
    public static String m2460s(String str, byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            messageDigest.update(bArr);
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b2 : bArrDigest) {
                sb.append(Integer.toHexString((b2 >> 4) & 15));
                sb.append(Integer.toHexString((b2 >> 0) & 15));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: t */
    public static Object m2461t(Object obj, Method method, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: u */
    public static boolean m2462u() {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
            Validate.m2479h();
            intent.setData(Uri.parse(String.format("fb%s://applinks", FacebookSdk.f5354c)));
            Validate.m2479h();
            Context context = FacebookSdk.f5360i;
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            Iterator<ResolveInfo> it = packageManager.queryIntentActivities(intent, 65536).iterator();
            while (it.hasNext()) {
                if (packageName.equals(it.next().activityInfo.packageName)) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: v */
    public static boolean m2463v(Context context) {
        if (Build.VERSION.SDK_INT >= 27) {
            return context.getPackageManager().hasSystemFeature("android.hardware.type.pc");
        }
        String str = Build.DEVICE;
        return str != null && str.matches(".+_cheets|cheets_.+");
    }

    /* JADX INFO: renamed from: w */
    public static boolean m2464w(Uri uri) {
        return uri != null && "content".equalsIgnoreCase(uri.getScheme());
    }

    /* JADX INFO: renamed from: x */
    public static boolean m2465x(Uri uri) {
        return uri != null && "file".equalsIgnoreCase(uri.getScheme());
    }

    /* JADX INFO: renamed from: y */
    public static boolean m2466y(String str) {
        return str == null || str.length() == 0;
    }

    /* JADX INFO: renamed from: z */
    public static <T> boolean m2467z(Collection<T> collection) {
        return collection == null || collection.size() == 0;
    }
}
