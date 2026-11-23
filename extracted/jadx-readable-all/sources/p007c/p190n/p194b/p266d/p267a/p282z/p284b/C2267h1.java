package p007c.p190n.p194b.p266d.p267a.p282z.p284b;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Rect;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import mtp.media.karaoke.R;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p309v.C2794c;
import p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3718y2;
import p007c.p190n.p194b.p266d.p314j.p315a.C2830a4;
import p007c.p190n.p194b.p266d.p314j.p315a.C2862b;
import p007c.p190n.p194b.p266d.p314j.p315a.C2994ej;
import p007c.p190n.p194b.p266d.p314j.p315a.C2998en;
import p007c.p190n.p194b.p266d.p314j.p315a.C3052g3;
import p007c.p190n.p194b.p266d.p314j.p315a.C3331nn;
import p007c.p190n.p194b.p266d.p314j.p315a.C3553tn;
import p007c.p190n.p194b.p266d.p314j.p315a.C3696xh;
import p007c.p190n.p194b.p266d.p314j.p315a.gx2;
import p007c.p190n.p194b.p266d.p314j.p315a.hd2;
import p007c.p190n.p194b.p266d.p314j.p315a.xr1;
import p636z0.p663d.p664a.CustomTabsIntent;
import p636z0.p725k.p727d.ContextCompat;

/* JADX INFO: renamed from: c.n.b.d.a.z.b.h1 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2267h1 {

    /* JADX INFO: renamed from: a */
    public static final xr1 f10713a = new HandlerC2303v0(Looper.getMainLooper());

    /* JADX INFO: renamed from: b */
    public static boolean f10714b = false;

    /* JADX INFO: renamed from: g */
    public String f10719g;

    /* JADX INFO: renamed from: c */
    public final AtomicReference<Pattern> f10715c = new AtomicReference<>(null);

    /* JADX INFO: renamed from: d */
    public final AtomicReference<Pattern> f10716d = new AtomicReference<>(null);

    /* JADX INFO: renamed from: e */
    public boolean f10717e = true;

    /* JADX INFO: renamed from: f */
    public final Object f10718f = new Object();

    /* JADX INFO: renamed from: h */
    public boolean f10720h = false;

    /* JADX INFO: renamed from: i */
    public boolean f10721i = false;

    /* JADX INFO: renamed from: j */
    public final Executor f10722j = Executors.newSingleThreadExecutor();

    /* JADX WARN: Code duplicated, block: B:4:0x0007  */
    /* JADX INFO: renamed from: F */
    public static final boolean m4736F(View view) {
        Activity activity;
        View rootView = view.getRootView();
        if (rootView == null) {
            activity = null;
        } else {
            Context context = rootView.getContext();
            if (context instanceof Activity) {
                activity = (Activity) context;
            } else {
                activity = null;
            }
        }
        if (activity == null) {
            return false;
        }
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
        return (attributes == null || (attributes.flags & 524288) == 0) ? false : true;
    }

    @TargetApi(18)
    /* JADX INFO: renamed from: G */
    public static final void m4737G(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
        extras.putBinder("android.support.customtabs.extra.SESSION", null);
        extras.putString("com.android.browser.application_id", context.getPackageName());
        intent.putExtras(extras);
    }

    /* JADX INFO: renamed from: H */
    public static final String m4738H(Context context) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        return m4763y(m4764z(context));
    }

    /* JADX INFO: renamed from: I */
    public static final String m4739I() {
        StringBuilder sb = new StringBuilder(256);
        sb.append("Mozilla/5.0 (Linux; U; Android");
        String str = Build.VERSION.RELEASE;
        if (str != null) {
            sb.append(" ");
            sb.append(str);
        }
        sb.append("; ");
        sb.append(Locale.getDefault());
        String str2 = Build.DEVICE;
        if (str2 != null) {
            sb.append("; ");
            sb.append(str2);
            String str3 = Build.DISPLAY;
            if (str3 != null) {
                sb.append(" Build/");
                sb.append(str3);
            }
        }
        sb.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb.toString();
    }

    /* JADX INFO: renamed from: J */
    public static final String m4740J() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return str2;
        }
        return outline.m1552C(new StringBuilder(String.valueOf(str).length() + 1 + str2.length()), str, " ", str2);
    }

    /* JADX INFO: renamed from: K */
    public static final DisplayMetrics m4741K(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    /* JADX INFO: renamed from: a */
    public static final String m4742a() {
        Resources resourcesM6646c = C2330u.f10884a.f10893h.m6646c();
        return resourcesM6646c != null ? resourcesM6646c.getString(R.string.f33408s7) : "Test Ad";
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC2266h0 m4743b(Context context) {
        try {
            Object objNewInstance = context.getClassLoader().loadClass("com.google.android.gms.ads.internal.util.WorkManagerUtil").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (!(objNewInstance instanceof IBinder)) {
                C2622l.m5408n3("Instantiated WorkManagerUtil not instance of IBinder.");
                return null;
            }
            IBinder iBinder = (IBinder) objNewInstance;
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
            return iInterfaceQueryLocalInterface instanceof InterfaceC2266h0 ? (InterfaceC2266h0) iInterfaceQueryLocalInterface : new C2260f0(iBinder);
        } catch (Exception e) {
            C2998en c2998en = C2330u.f10884a.f10893h;
            C3696xh.m8734c(c2998en.f13616e, c2998en.f13617f).mo8736b(e, "Failed to instantiate WorkManagerUtil");
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m4744c(Context context, String str) {
        Context contextM6634a = C2994ej.m6634a(context);
        return C2794c.m5637a(contextM6634a).f11958a.getPackageManager().checkPermission(str, contextM6634a.getPackageName()) == 0;
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m4745d(String str) {
        if (!C3553tn.m8431d()) {
            return false;
        }
        AbstractC3718y2<Boolean> abstractC3718y2 = C3052g3.f14235N2;
        C2862b c2862b = C2862b.f12493a;
        if (!((Boolean) c2862b.f12496d.m6596a(abstractC3718y2)).booleanValue()) {
            return false;
        }
        String str2 = (String) c2862b.f12496d.m6596a(C3052g3.f14247P2);
        if (!str2.isEmpty()) {
            for (String str3 : str2.split(";")) {
                if (str3.equals(str)) {
                    return false;
                }
            }
        }
        String str4 = (String) C2862b.f12493a.f12496d.m6596a(C3052g3.f14241O2);
        if (str4.isEmpty()) {
            return true;
        }
        for (String str5 : str4.split(";")) {
            if (str5.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m4746e(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th) {
            C2622l.m5438t3("Error loading class.", th);
            C2998en c2998en = C2330u.f10884a.f10893h;
            C3696xh.m8734c(c2998en.f13616e, c2998en.f13617f).mo8736b(th, "AdUtil.isLiteSdk");
            return false;
        }
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m4747f(Context context) {
        boolean z;
        if (C2622l.m5464z()) {
            if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14303Y4)).booleanValue()) {
                synchronized (C2267h1.class) {
                    z = f10714b;
                }
                return z;
            }
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m4748g(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        PowerManager powerManager;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    return runningAppProcessInfo.importance != 100 || keyguardManager.inKeyguardRestrictedInputMode() || (powerManager = (PowerManager) context.getSystemService("power")) == null || !powerManager.isScreenOn();
                }
            }
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m4749h(Context context) {
        Bundle bundleM4764z = m4764z(context);
        return TextUtils.isEmpty(m4763y(bundleM4764z)) && !TextUtils.isEmpty(bundleM4764z.getString("com.google.android.gms.ads.INTEGRATION_MANAGER"));
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m4750i(Context context) {
        Window window;
        if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null && window.getDecorView() != null) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            window.getDecorView().getGlobalVisibleRect(rect, null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (rect.bottom != 0 && rect2.bottom != 0 && rect.top == rect2.top) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public static final void m4751j(Context context, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            new C2278l0(context, str, (String) it.next()).m4707b();
        }
    }

    /* JADX INFO: renamed from: k */
    public static final void m4752k(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (Throwable unused) {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    /* JADX INFO: renamed from: l */
    public static final int m4753l(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            String strValueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 22);
            sb.append("Could not parse value:");
            sb.append(strValueOf);
            C2622l.m5226A3(sb.toString());
            return 0;
        }
    }

    /* JADX INFO: renamed from: m */
    public static final Map<String, String> m4754m(Uri uri) {
        if (uri == null) {
            return null;
        }
        HashMap map = new HashMap();
        for (String str : uri.getQueryParameterNames()) {
            if (!TextUtils.isEmpty(str)) {
                map.put(str, uri.getQueryParameter(str));
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: n */
    public static final WebResourceResponse m4755n(HttpURLConnection httpURLConnection) throws IOException {
        C2267h1 c2267h1 = C2330u.f10884a.f10889d;
        String contentType = httpURLConnection.getContentType();
        String strTrim = "";
        String strTrim2 = TextUtils.isEmpty(contentType) ? "" : contentType.split(";")[0].trim();
        String contentType2 = httpURLConnection.getContentType();
        if (!TextUtils.isEmpty(contentType2)) {
            String[] strArrSplit = contentType2.split(";");
            if (strArrSplit.length != 1) {
                for (int i = 1; i < strArrSplit.length; i++) {
                    if (strArrSplit[i].trim().startsWith("charset")) {
                        String[] strArrSplit2 = strArrSplit[i].trim().split("=");
                        if (strArrSplit2.length > 1) {
                            strTrim = strArrSplit2[1].trim();
                            break;
                        }
                    }
                }
            }
        }
        String str = strTrim;
        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        HashMap map = new HashMap(headerFields.size());
        for (Map.Entry<String, List<String>> entry : headerFields.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null && entry.getValue().size() > 0) {
                map.put(entry.getKey(), entry.getValue().get(0));
            }
        }
        return C2330u.f10884a.f10891f.mo4725n(strTrim2, str, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), map, httpURLConnection.getInputStream());
    }

    /* JADX INFO: renamed from: o */
    public static final int[] m4756o(Activity activity) {
        View viewFindViewById;
        Window window = activity.getWindow();
        return (window == null || (viewFindViewById = window.findViewById(android.R.id.content)) == null) ? new int[]{0, 0} : new int[]{viewFindViewById.getWidth(), viewFindViewById.getHeight()};
    }

    /* JADX INFO: renamed from: p */
    public static final int[] m4757p(Activity activity) {
        View viewFindViewById;
        Window window = activity.getWindow();
        int[] iArr = (window == null || (viewFindViewById = window.findViewById(android.R.id.content)) == null) ? new int[]{0, 0} : new int[]{viewFindViewById.getTop(), viewFindViewById.getBottom()};
        gx2 gx2Var = gx2.f14692a;
        return new int[]{gx2Var.f14693b.m7896a(activity, iArr[0]), gx2Var.f14693b.m7896a(activity, iArr[1])};
    }

    /* JADX INFO: renamed from: q */
    public static final boolean m4758q(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        boolean z = C2330u.f10884a.f10889d.f10717e || keyguardManager == null || !keyguardManager.inKeyguardRestrictedInputMode() || m4736F(view);
        if (view.getVisibility() != 0 || !view.isShown()) {
            return false;
        }
        if ((powerManager == null || powerManager.isScreenOn()) && z) {
            return !((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14215K0)).booleanValue() || view.getLocalVisibleRect(new Rect()) || view.getGlobalVisibleRect(new Rect());
        }
        return false;
    }

    @TargetApi(18)
    /* JADX INFO: renamed from: r */
    public static final void m4759r(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            m4737G(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            String string = uri.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 26);
            sb.append("Opening ");
            sb.append(string);
            sb.append(" in a new browser.");
            C2622l.m5318U2(sb.toString());
        } catch (ActivityNotFoundException e) {
            C2622l.m5438t3("No browser is found.", e);
        }
    }

    /* JADX INFO: renamed from: s */
    public static final int[] m4760s(Activity activity) {
        int[] iArrM4756o = m4756o(activity);
        gx2 gx2Var = gx2.f14692a;
        return new int[]{gx2Var.f14693b.m7896a(activity, iArrM4756o[0]), gx2Var.f14693b.m7896a(activity, iArrM4756o[1])};
    }

    /* JADX INFO: renamed from: v */
    public static int m4761v(int i) {
        if (i >= 5000) {
            return i;
        }
        if (i <= 0) {
            return 60000;
        }
        StringBuilder sb = new StringBuilder(97);
        sb.append("HTTP timeout too low: ");
        sb.append(i);
        sb.append(" milliseconds. Reverting to default timeout: 60000 milliseconds.");
        C2622l.m5226A3(sb.toString());
        return 60000;
    }

    /* JADX INFO: renamed from: x */
    public static boolean m4762x(String str, AtomicReference<Pattern> atomicReference, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Pattern patternCompile = atomicReference.get();
            if (patternCompile == null || !str2.equals(patternCompile.pattern())) {
                patternCompile = Pattern.compile(str2);
                atomicReference.set(patternCompile);
            }
            return patternCompile.matcher(str).matches();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: y */
    public static String m4763y(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        String string = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
        if (TextUtils.isEmpty(string)) {
            return "";
        }
        return (string.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") || string.matches("^/\\d+~.+$")) ? string : "";
    }

    /* JADX INFO: renamed from: z */
    public static Bundle m4764z(Context context) {
        try {
            return C2794c.m5637a(context).m5633a(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            C2096e.m4554C("Error getting metadata", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m4765A(Context context, String str, boolean z, HttpURLConnection httpURLConnection, boolean z2, int i) {
        int iM4761v = m4761v(i);
        StringBuilder sb = new StringBuilder(39);
        sb.append("HTTP timeout: ");
        sb.append(iM4761v);
        sb.append(" milliseconds.");
        C2622l.m5458x3(sb.toString());
        httpURLConnection.setConnectTimeout(iM4761v);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(iM4761v);
        httpURLConnection.setRequestProperty("User-Agent", m4766B(context, str));
        httpURLConnection.setUseCaches(false);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00a9 A[Catch: Exception -> 0x00b8, all -> 0x00da, TRY_LEAVE, TryCatch #3 {Exception -> 0x00b8, blocks: (B:33:0x009f, B:35:0x00a9), top: B:52:0x009f, outer: #4 }] */
    /* JADX INFO: renamed from: B */
    public final String m4766B(Context context, String str) {
        String strM4739I;
        synchronized (this.f10718f) {
            String str2 = this.f10719g;
            if (str2 != null) {
                return str2;
            }
            if (str == null) {
                return m4739I();
            }
            try {
                this.f10719g = C2330u.f10884a.f10891f.mo4713b(context);
            } catch (Exception unused) {
            }
            if (!TextUtils.isEmpty(this.f10719g)) {
                String strValueOf = String.valueOf(this.f10719g);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 10 + str.length());
                sb.append(strValueOf);
                sb.append(" (Mobile; ");
                sb.append(str);
                this.f10719g = sb.toString();
                if (C2794c.m5637a(context).m5636d()) {
                    this.f10719g = String.valueOf(this.f10719g).concat(";aia");
                }
                String strConcat = String.valueOf(this.f10719g).concat(")");
                this.f10719g = strConcat;
                return strConcat;
            }
            C3331nn c3331nn = gx2.f14692a.f14693b;
            if (C3331nn.m7890h()) {
                try {
                    strM4739I = new WebView(context).getSettings().getUserAgentString();
                } catch (Throwable unused2) {
                    strM4739I = m4739I();
                }
                this.f10719g = strM4739I;
                String strValueOf2 = String.valueOf(this.f10719g);
                StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 10 + str.length());
                sb2.append(strValueOf2);
                sb2.append(" (Mobile; ");
                sb2.append(str);
                this.f10719g = sb2.toString();
                if (C2794c.m5637a(context).m5636d()) {
                    this.f10719g = String.valueOf(this.f10719g).concat(";aia");
                }
                String strConcat2 = String.valueOf(this.f10719g).concat(")");
                this.f10719g = strConcat2;
                return strConcat2;
            }
            this.f10719g = null;
            f10713a.post(new RunnableC2252c1(this, context));
            while (this.f10719g == null) {
                try {
                    this.f10718f.wait();
                } catch (InterruptedException unused3) {
                    String strM4739I2 = m4739I();
                    this.f10719g = strM4739I2;
                    String strValueOf3 = String.valueOf(strM4739I2);
                    C2622l.m5226A3(strValueOf3.length() != 0 ? "Interrupted, use default user agent: ".concat(strValueOf3) : new String("Interrupted, use default user agent: "));
                }
            }
            String strValueOf4 = String.valueOf(this.f10719g);
            StringBuilder sb3 = new StringBuilder(strValueOf4.length() + 10 + str.length());
            sb3.append(strValueOf4);
            sb3.append(" (Mobile; ");
            sb3.append(str);
            this.f10719g = sb3.toString();
            try {
                if (C2794c.m5637a(context).m5636d()) {
                    this.f10719g = String.valueOf(this.f10719g).concat(";aia");
                }
            } catch (Exception e) {
                C2998en c2998en = C2330u.f10884a.f10893h;
                C3696xh.m8734c(c2998en.f13616e, c2998en.f13617f).mo8736b(e, "AdUtil.getUserAgent");
            }
            String strConcat3 = String.valueOf(this.f10719g).concat(")");
            this.f10719g = strConcat3;
            return strConcat3;
            throw th;
        }
    }

    /* JADX INFO: renamed from: C */
    public final JSONObject m4767C(Map<String, ?> map) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                m4772w(jSONObject, str, map.get(str));
            }
            return jSONObject;
        } catch (ClassCastException e) {
            String strValueOf = String.valueOf(e.getMessage());
            throw new JSONException(strValueOf.length() != 0 ? "Could not convert map to JSON: ".concat(strValueOf) : new String("Could not convert map to JSON: "));
        }
    }

    /* JADX INFO: renamed from: D */
    public final JSONObject m4768D(Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            m4772w(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    @TargetApi(18)
    /* JADX INFO: renamed from: E */
    public final int m4769E(Context context, Uri uri) {
        int i;
        String strM5263I0;
        if (context == null) {
            C2096e.m4590z("Trying to open chrome custom tab on a null context");
            i = 3;
        } else if (!(context instanceof Activity)) {
            C2096e.m4590z("Chrome Custom Tabs can only work with Activity context.");
            i = 2;
        } else if (C2622l.m5263I0(context) == null) {
            C2096e.m4590z("Default browser does not support custom tabs.");
            i = 4;
        } else {
            i = 0;
        }
        AbstractC3718y2<Boolean> abstractC3718y2 = C3052g3.f14446t2;
        C2862b c2862b = C2862b.f12493a;
        Boolean bool = (Boolean) c2862b.f12496d.m6596a(abstractC3718y2);
        AbstractC3718y2<Boolean> abstractC3718y3 = C3052g3.f14453u2;
        if (true == bool.equals(c2862b.f12496d.m6596a(abstractC3718y3))) {
            i = 9;
        }
        if (i != 0) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            intent.addFlags(268435456);
            context.startActivity(intent);
            return i;
        }
        if (((Boolean) c2862b.f12496d.m6596a(abstractC3718y2)).booleanValue()) {
            C2830a4 c2830a4 = new C2830a4();
            c2830a4.f12012d = new C2249b1(c2830a4, context, uri);
            Activity activity = (Activity) context;
            if (c2830a4.f12010b == null && (strM5263I0 = C2622l.m5263I0(activity)) != null) {
                hd2 hd2Var = new hd2(c2830a4, null);
                c2830a4.f12011c = hd2Var;
                Intent intent2 = new Intent("android.support.customtabs.action.CustomTabsService");
                if (!TextUtils.isEmpty(strM5263I0)) {
                    intent2.setPackage(strM5263I0);
                }
                activity.bindService(intent2, hd2Var, 33);
            }
        }
        if (!((Boolean) c2862b.f12496d.m6596a(abstractC3718y3)).booleanValue()) {
            return 5;
        }
        CustomTabsIntent customTabsIntentM15061a = new CustomTabsIntent.a().m15061a();
        customTabsIntentM15061a.f35369a.setData(uri);
        Intent intent3 = customTabsIntentM15061a.f35369a;
        Object obj = ContextCompat.f37815a;
        ContextCompat.a.m16136b(context, intent3, null);
        return 5;
    }

    /* JADX INFO: renamed from: t */
    public final JSONArray m4770t(Collection<?> collection) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            m4771u(jSONArray, it.next());
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: u */
    public final void m4771u(JSONArray jSONArray, Object obj) throws JSONException {
        if (obj instanceof Bundle) {
            jSONArray.put(m4768D((Bundle) obj));
            return;
        }
        if (obj instanceof Map) {
            jSONArray.put(m4767C((Map) obj));
            return;
        }
        if (obj instanceof Collection) {
            jSONArray.put(m4770t((Collection) obj));
            return;
        }
        if (!(obj instanceof Object[])) {
            jSONArray.put(obj);
            return;
        }
        JSONArray jSONArray2 = new JSONArray();
        for (Object obj2 : (Object[]) obj) {
            m4771u(jSONArray2, obj2);
        }
        jSONArray.put(jSONArray2);
    }

    /* JADX INFO: renamed from: w */
    public final void m4772w(JSONObject jSONObject, String str, Object obj) throws JSONException {
        if (obj instanceof Bundle) {
            jSONObject.put(str, m4768D((Bundle) obj));
            return;
        }
        if (obj instanceof Map) {
            jSONObject.put(str, m4767C((Map) obj));
            return;
        }
        if (obj instanceof Collection) {
            if (str == null) {
                str = "null";
            }
            jSONObject.put(str, m4770t((Collection) obj));
        } else if (obj instanceof Object[]) {
            jSONObject.put(str, m4770t(Arrays.asList((Object[]) obj)));
        } else {
            jSONObject.put(str, obj);
        }
    }
}
