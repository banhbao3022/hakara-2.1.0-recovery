package p007c.p190n.p194b.p209b.p263z1;

import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.RemoteException;
import android.os.StrictMode;
import android.os.Trace;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.RecentlyNonNull;
import com.facebook.stetho.server.http.HttpHeaders;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.dataflow.qual.Pure;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.p212b2.MimeTypes;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p266d.p267a.C2191r;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2267h1;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2301u0;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3718y2;
import p007c.p190n.p194b.p266d.p314j.p315a.C2862b;
import p007c.p190n.p194b.p266d.p314j.p315a.C3052g3;
import p007c.p190n.p194b.p266d.p314j.p315a.C3125i2;
import p007c.p190n.p194b.p266d.p314j.p315a.C3312n4;
import p007c.p190n.p194b.p266d.p314j.p315a.C3460r4;
import p007c.p190n.p194b.p266d.p314j.p315a.C3494s1;
import p007c.p190n.p194b.p266d.p314j.p315a.C3553tn;
import p007c.p190n.p194b.p266d.p314j.p315a.C3646w4;
import p007c.p190n.p194b.p266d.p314j.p315a.C3696xh;
import p007c.p190n.p194b.p266d.p314j.p315a.C3702xn;
import p007c.p190n.p194b.p266d.p314j.p315a.C3733yh;
import p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3234l0;
import p007c.p190n.p194b.p266d.p314j.p315a.as1;
import p007c.p190n.p194b.p266d.p314j.p315a.gx2;
import p007c.p190n.p194b.p266d.p314j.p315a.is1;
import p007c.p190n.p194b.p266d.p314j.p315a.ks1;
import p007c.p190n.p194b.p266d.p314j.p315a.kv1;
import p007c.p190n.p194b.p266d.p314j.p315a.rh1;

/* JADX INFO: renamed from: c.n.b.b.z1.e */
/* JADX INFO: loaded from: classes.dex */
public final class C2096e {
    /* JADX INFO: renamed from: A */
    public static boolean m4552A(int i) {
        AbstractC3718y2<Boolean> abstractC3718y2 = C3052g3.f14198H1;
        C2862b c2862b = C2862b.f12493a;
        if (((Boolean) c2862b.f12496d.m6596a(abstractC3718y2)).booleanValue()) {
            return ((Boolean) c2862b.f12496d.m6596a(C3052g3.f14204I1)).booleanValue() || i <= 15299999;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0152  */
    /* JADX INFO: renamed from: B */
    public static JSONObject m4553B(Context context, View view) {
        String str;
        byte b;
        JSONObject jSONObjectM4564M;
        JSONObject jSONObject = new JSONObject();
        if (view == null) {
            return jSONObject;
        }
        try {
            int[] iArrM4560I = m4560I(view);
            int[] iArr = {view.getMeasuredWidth(), view.getMeasuredHeight()};
            for (ViewParent parent = view.getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                ViewGroup viewGroup = (ViewGroup) parent;
                iArr[0] = Math.min(viewGroup.getMeasuredWidth(), iArr[0]);
                iArr[1] = Math.min(viewGroup.getMeasuredHeight(), iArr[1]);
            }
            JSONObject jSONObject2 = new JSONObject();
            int measuredWidth = view.getMeasuredWidth();
            gx2 gx2Var = gx2.f14692a;
            jSONObject2.put("width", gx2Var.f14693b.m7896a(context, measuredWidth));
            jSONObject2.put("height", gx2Var.f14693b.m7896a(context, view.getMeasuredHeight()));
            jSONObject2.put("x", gx2Var.f14693b.m7896a(context, iArrM4560I[0]));
            jSONObject2.put("y", gx2Var.f14693b.m7896a(context, iArrM4560I[1]));
            jSONObject2.put("maximum_visible_width", gx2Var.f14693b.m7896a(context, iArr[0]));
            jSONObject2.put("maximum_visible_height", gx2Var.f14693b.m7896a(context, iArr[1]));
            jSONObject2.put("relative_to", "window");
            jSONObject.put("frame", jSONObject2);
            Rect rect = new Rect();
            if (view.getGlobalVisibleRect(rect)) {
                jSONObjectM4564M = m4564M(context, rect);
            } else {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("width", 0);
                jSONObject3.put("height", 0);
                jSONObject3.put("x", gx2Var.f14693b.m7896a(context, iArrM4560I[0]));
                jSONObject3.put("y", gx2Var.f14693b.m7896a(context, iArrM4560I[1]));
                jSONObject3.put("relative_to", "window");
                jSONObjectM4564M = jSONObject3;
            }
            jSONObject.put("visible_bounds", jSONObjectM4564M);
        } catch (Exception unused) {
            C2622l.m5226A3("Unable to get native ad view bounding box");
        }
        if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14248P3)).booleanValue()) {
            ViewParent parent2 = view.getParent();
            if (parent2 != null) {
                try {
                    str = (String) parent2.getClass().getMethod("getTemplateTypeName", new Class[0]).invoke(parent2, new Object[0]);
                } catch (IllegalAccessException e) {
                    e = e;
                    C2622l.m5438t3("Cannot access method getTemplateTypeName: ", e);
                    str = "";
                } catch (NoSuchMethodException unused2) {
                    str = "";
                } catch (SecurityException e2) {
                    e = e2;
                    C2622l.m5438t3("Cannot access method getTemplateTypeName: ", e);
                    str = "";
                } catch (InvocationTargetException e3) {
                    e = e3;
                    C2622l.m5438t3("Cannot access method getTemplateTypeName: ", e);
                    str = "";
                }
            } else {
                str = "";
            }
            try {
                int iHashCode = str.hashCode();
                if (iHashCode != -2066603854) {
                    if (iHashCode == 2019754500 && str.equals("medium_template")) {
                        b = 1;
                    } else {
                        b = -1;
                    }
                } else if (str.equals("small_template")) {
                    b = 0;
                } else {
                    b = -1;
                }
                if (b == 0) {
                    jSONObject.put("native_template_type", 1);
                } else if (b != 1) {
                    jSONObject.put("native_template_type", 0);
                } else {
                    jSONObject.put("native_template_type", 2);
                }
            } catch (JSONException e4) {
                C2622l.m5438t3("Could not log native template signal to JSON", e4);
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: C */
    public static void m4554C(String str, Throwable th) {
        if (m4556E()) {
            Log.v("Ads", str, th);
        }
    }

    /* JADX INFO: renamed from: D */
    public static JSONObject m4555D(View view) {
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                boolean z = false;
                if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14168C4)).booleanValue()) {
                    C2267h1 c2267h1 = C2330u.f10884a.f10889d;
                    ViewParent parent = view.getParent();
                    while (parent != null && !(parent instanceof ScrollView)) {
                        parent = parent.getParent();
                    }
                    if (parent != null) {
                        z = true;
                    }
                    jSONObject.put("contained_in_scroll_view", z);
                } else {
                    C2267h1 c2267h2 = C2330u.f10884a.f10889d;
                    ViewParent parent2 = view.getParent();
                    while (parent2 != null && !(parent2 instanceof AdapterView)) {
                        parent2 = parent2.getParent();
                    }
                    jSONObject.put("contained_in_scroll_view", (parent2 == null ? -1 : ((AdapterView) parent2).getPositionForView(view)) != -1);
                }
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: E */
    public static boolean m4556E() {
        return C2622l.m5281L3(2) && C3460r4.f18704a.m6603d().booleanValue();
    }

    /* JADX INFO: renamed from: F */
    public static JSONObject m4557F(Context context, View view) {
        JSONObject jSONObject = new JSONObject();
        if (view == null) {
            return jSONObject;
        }
        try {
            C2330u c2330u = C2330u.f10884a;
            C2267h1 c2267h1 = c2330u.f10889d;
            jSONObject.put("can_show_on_lock_screen", C2267h1.m4736F(view));
            C2267h1 c2267h2 = c2330u.f10889d;
            boolean z = false;
            if (context != null) {
                Object systemService = context.getSystemService("keyguard");
                KeyguardManager keyguardManager = (systemService == null || !(systemService instanceof KeyguardManager)) ? null : (KeyguardManager) systemService;
                if (keyguardManager != null && keyguardManager.isKeyguardLocked()) {
                    z = true;
                }
            }
            jSONObject.put("is_keyguard_locked", z);
        } catch (JSONException unused) {
            C2622l.m5226A3("Unable to get lock screen information");
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: G */
    public static JSONObject m4558G(Context context, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, View view) {
        JSONObject jSONObject;
        JSONObject jSONObjectM4564M;
        JSONObject jSONObject2 = new JSONObject();
        if (map == null || view == null) {
            return jSONObject2;
        }
        int[] iArrM4560I = m4560I(view);
        Iterator<Map.Entry<String, WeakReference<View>>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, WeakReference<View>> next = it.next();
            View view2 = next.getValue().get();
            if (view2 != null) {
                int[] iArrM4560I2 = m4560I(view2);
                JSONObject jSONObject3 = new JSONObject();
                JSONObject jSONObject4 = new JSONObject();
                Iterator<Map.Entry<String, WeakReference<View>>> it2 = it;
                try {
                    int measuredWidth = view2.getMeasuredWidth();
                    JSONObject jSONObject5 = jSONObject2;
                    try {
                        gx2 gx2Var = gx2.f14692a;
                        jSONObject4.put("width", gx2Var.f14693b.m7896a(context, measuredWidth));
                        jSONObject4.put("height", gx2Var.f14693b.m7896a(context, view2.getMeasuredHeight()));
                        jSONObject4.put("x", gx2Var.f14693b.m7896a(context, iArrM4560I2[0] - iArrM4560I[0]));
                        jSONObject4.put("y", gx2Var.f14693b.m7896a(context, iArrM4560I2[1] - iArrM4560I[1]));
                        jSONObject4.put("relative_to", "ad_view");
                        jSONObject3.put("frame", jSONObject4);
                        Rect rect = new Rect();
                        if (view2.getLocalVisibleRect(rect)) {
                            jSONObjectM4564M = m4564M(context, rect);
                        } else {
                            JSONObject jSONObject6 = new JSONObject();
                            jSONObject6.put("width", 0);
                            jSONObject6.put("height", 0);
                            jSONObject6.put("x", gx2Var.f14693b.m7896a(context, iArrM4560I2[0] - iArrM4560I[0]));
                            jSONObject6.put("y", gx2Var.f14693b.m7896a(context, iArrM4560I2[1] - iArrM4560I[1]));
                            jSONObject6.put("relative_to", "ad_view");
                            jSONObjectM4564M = jSONObject6;
                        }
                        jSONObject3.put("visible_bounds", jSONObjectM4564M);
                        if (view2 instanceof TextView) {
                            TextView textView = (TextView) view2;
                            jSONObject3.put("text_color", textView.getCurrentTextColor());
                            jSONObject3.put("font_size", textView.getTextSize());
                            jSONObject3.put("text", textView.getText());
                        }
                        jSONObject3.put("is_clickable", map2 != null && map2.containsKey(next.getKey()) && view2.isClickable());
                        jSONObject = jSONObject5;
                        try {
                            jSONObject.put(next.getKey(), jSONObject3);
                        } catch (JSONException unused) {
                            C2622l.m5226A3("Unable to get asset views information");
                        }
                    } catch (JSONException unused2) {
                        jSONObject = jSONObject5;
                    }
                } catch (JSONException unused3) {
                    jSONObject = jSONObject2;
                }
                jSONObject2 = jSONObject;
                it = it2;
            }
        }
        return jSONObject2;
    }

    /* JADX INFO: renamed from: H */
    public static JSONObject m4559H(String str, Context context, Point point, Point point2) {
        JSONObject jSONObject = null;
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    int i = point2.x;
                    gx2 gx2Var = gx2.f14692a;
                    jSONObject3.put("x", gx2Var.f14693b.m7896a(context, i));
                    jSONObject3.put("y", gx2Var.f14693b.m7896a(context, point2.y));
                    jSONObject3.put("start_x", gx2Var.f14693b.m7896a(context, point.x));
                    jSONObject3.put("start_y", gx2Var.f14693b.m7896a(context, point.y));
                    jSONObject = jSONObject3;
                } catch (JSONException e) {
                    C2622l.m5438t3("Error occurred while putting signals into JSON object.", e);
                }
                jSONObject2.put("click_point", jSONObject);
                jSONObject2.put("asset_id", str);
                return jSONObject2;
            } catch (Exception e2) {
                e = e2;
                jSONObject = jSONObject2;
                C2622l.m5438t3("Error occurred while grabbing click signals.", e);
                return jSONObject;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    /* JADX INFO: renamed from: I */
    public static int[] m4560I(View view) {
        int[] iArr = new int[2];
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        return iArr;
    }

    /* JADX INFO: renamed from: J */
    public static Point m4561J(MotionEvent motionEvent, View view) {
        int[] iArrM4560I = m4560I(view);
        float rawX = motionEvent.getRawX();
        return new Point(((int) rawX) - iArrM4560I[0], ((int) motionEvent.getRawY()) - iArrM4560I[1]);
    }

    /* JADX INFO: renamed from: K */
    public static boolean m4562K(Context context, rh1 rh1Var) {
        if (!rh1Var.f18785I) {
            return false;
        }
        AbstractC3718y2<Boolean> abstractC3718y2 = C3052g3.f14175D4;
        C2862b c2862b = C2862b.f12493a;
        if (((Boolean) c2862b.f12496d.m6596a(abstractC3718y2)).booleanValue()) {
            return ((Boolean) c2862b.f12496d.m6596a(C3052g3.f14195G4)).booleanValue();
        }
        String str = (String) c2862b.f12496d.m6596a(C3052g3.f14182E4);
        if (!str.isEmpty() && context != null) {
            String packageName = context.getPackageName();
            Iterator<String> it = ((is1) ks1.m7543a(new as1(';')).m7544b(str)).iterator();
            while (it.hasNext()) {
                if (it.next().equals(packageName)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: L */
    public static WindowManager.LayoutParams m4563L() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 0, 0, -2);
        layoutParams.flags = ((Integer) C2862b.f12493a.f12496d.m6596a(C3052g3.f14189F4)).intValue();
        layoutParams.type = 2;
        layoutParams.gravity = 8388659;
        return layoutParams;
    }

    /* JADX INFO: renamed from: M */
    public static JSONObject m4564M(Context context, Rect rect) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        int i = rect.right;
        int i2 = rect.left;
        gx2 gx2Var = gx2.f14692a;
        jSONObject.put("width", gx2Var.f14693b.m7896a(context, i - i2));
        jSONObject.put("height", gx2Var.f14693b.m7896a(context, rect.bottom - rect.top));
        jSONObject.put("x", gx2Var.f14693b.m7896a(context, rect.left));
        jSONObject.put("y", gx2Var.f14693b.m7896a(context, rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }

    /* JADX INFO: renamed from: a */
    public static void m4565a(String str) {
        if (Util6.f6307a >= 18) {
            Trace.beginSection(str);
        }
    }

    @Pure
    /* JADX INFO: renamed from: b */
    public static void m4566b(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    @Pure
    /* JADX INFO: renamed from: c */
    public static void m4567c(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m4568d() {
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                return;
            }
            StringBuilder sbM1556G = outline.m1556G("glError ");
            sbM1556G.append(GLU.gluErrorString(iGlGetError));
            Log.e("GlUtil", sbM1556G.toString());
        }
    }

    @Pure
    /* JADX INFO: renamed from: e */
    public static int m4569e(int i, int i2, int i3) {
        if (i < i2 || i >= i3) {
            throw new IndexOutOfBoundsException();
        }
        return i;
    }

    @Pure
    /* JADX INFO: renamed from: f */
    public static void m4570f(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    @Pure
    /* JADX INFO: renamed from: g */
    public static void m4571g(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    @EnsuresNonNull({"#1"})
    @Pure
    /* JADX INFO: renamed from: h */
    public static <T> T m4572h(T t) {
        if (t != null) {
            return t;
        }
        throw new IllegalStateException();
    }

    @EnsuresNonNull({"#1"})
    @Pure
    /* JADX INFO: renamed from: i */
    public static <T> T m4573i(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new IllegalStateException(String.valueOf(obj));
    }

    /* JADX INFO: renamed from: j */
    public static void m4574j() {
        if (Util6.f6307a >= 18) {
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: k */
    public static String m4575k(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public static int[] m4576l(String str) {
        int iIndexOf;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int iIndexOf2 = str.indexOf(35);
        if (iIndexOf2 != -1) {
            length = iIndexOf2;
        }
        int iIndexOf3 = str.indexOf(63);
        if (iIndexOf3 == -1 || iIndexOf3 > length) {
            iIndexOf3 = length;
        }
        int iIndexOf4 = str.indexOf(47);
        if (iIndexOf4 == -1 || iIndexOf4 > iIndexOf3) {
            iIndexOf4 = iIndexOf3;
        }
        int iIndexOf5 = str.indexOf(58);
        if (iIndexOf5 > iIndexOf4) {
            iIndexOf5 = -1;
        }
        int i = iIndexOf5 + 2;
        if (i < iIndexOf3 && str.charAt(iIndexOf5 + 1) == '/' && str.charAt(i) == '/') {
            iIndexOf = str.indexOf(47, iIndexOf5 + 3);
            if (iIndexOf == -1 || iIndexOf > iIndexOf3) {
                iIndexOf = iIndexOf3;
            }
        } else {
            iIndexOf = iIndexOf5 + 1;
        }
        iArr[0] = iIndexOf5;
        iArr[1] = iIndexOf;
        iArr[2] = iIndexOf3;
        iArr[3] = length;
        return iArr;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:28:0x0062  */
    /* JADX WARN: Code duplicated, block: B:7:0x0012  */
    /* JADX INFO: renamed from: m */
    public static int m4577m(String str) {
        byte b;
        String str2 = str;
        if (str2 == null) {
            return -1;
        }
        ArrayList<MimeTypes.a> arrayList = MimeTypes.f6360a;
        switch (str.hashCode()) {
            case -1007807498:
                if (!str2.equals("audio/x-flac")) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            case -586683234:
                if (!str2.equals("audio/x-wav")) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case 187090231:
                if (!str2.equals("audio/mp3")) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                str2 = "audio/flac";
                break;
            case 1:
                str2 = "audio/wav";
                break;
            case 2:
                str2 = "audio/mpeg";
                break;
        }
        switch (str2) {
            case "audio/eac3-joc":
            case "audio/ac3":
            case "audio/eac3":
                return 0;
            case "video/mp2p":
                return 10;
            case "video/mp2t":
                return 11;
            case "video/webm":
            case "audio/x-matroska":
            case "application/webm":
            case "audio/webm":
            case "video/x-matroska":
                return 6;
            case "audio/amr-wb":
            case "audio/amr":
            case "audio/3gpp":
                return 3;
            case "image/jpeg":
                return 14;
            case "application/mp4":
            case "audio/mp4":
            case "video/mp4":
                return 8;
            case "text/vtt":
                return 13;
            case "video/x-flv":
                return 5;
            case "audio/ac4":
                return 1;
            case "audio/ogg":
                return 9;
            case "audio/wav":
                return 12;
            case "audio/flac":
                return 4;
            case "audio/mpeg":
                return 7;
            default:
                return -1;
        }
    }

    /* JADX INFO: renamed from: n */
    public static int m4578n(Map<String, List<String>> map) {
        List<String> list = map.get(HttpHeaders.CONTENT_TYPE);
        return m4577m((list == null || list.isEmpty()) ? null : list.get(0));
    }

    /* JADX INFO: renamed from: o */
    public static int m4579o(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        return (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) ? 14 : -1;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m4580p(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        return (xmlPullParser.getEventType() == 3) && xmlPullParser.getName().equals(str);
    }

    /* JADX INFO: renamed from: q */
    public static boolean m4581q(XmlPullParser xmlPullParser) throws XmlPullParserException {
        return xmlPullParser.getEventType() == 2;
    }

    /* JADX INFO: renamed from: r */
    public static boolean m4582r(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        return m4581q(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    /* JADX INFO: renamed from: s */
    public static String m4583s(StringBuilder sb, int i, int i2) {
        int i3;
        int iLastIndexOf;
        if (i >= i2) {
            return sb.toString();
        }
        if (sb.charAt(i) == '/') {
            i++;
        }
        int i4 = i;
        int i5 = i4;
        while (i4 <= i2) {
            if (i4 == i2) {
                i3 = i4;
            } else if (sb.charAt(i4) == '/') {
                i3 = i4 + 1;
            } else {
                i4++;
            }
            int i6 = i5 + 1;
            if (i4 == i6 && sb.charAt(i5) == '.') {
                sb.delete(i5, i3);
                i2 -= i3 - i5;
            } else {
                if (i4 == i5 + 2 && sb.charAt(i5) == '.' && sb.charAt(i6) == '.') {
                    iLastIndexOf = sb.lastIndexOf("/", i5 - 2) + 1;
                    int i7 = iLastIndexOf > i ? iLastIndexOf : i;
                    sb.delete(i7, i3);
                    i2 -= i3 - i7;
                } else {
                    iLastIndexOf = i4 + 1;
                }
                i5 = iLastIndexOf;
            }
            i4 = i5;
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: t */
    public static String m4584t(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] iArrM4576l = m4576l(str2);
        if (iArrM4576l[0] != -1) {
            sb.append(str2);
            m4583s(sb, iArrM4576l[1], iArrM4576l[2]);
            return sb.toString();
        }
        int[] iArrM4576l2 = m4576l(str);
        if (iArrM4576l[3] == 0) {
            sb.append((CharSequence) str, 0, iArrM4576l2[3]);
            sb.append(str2);
            return sb.toString();
        }
        if (iArrM4576l[2] == 0) {
            sb.append((CharSequence) str, 0, iArrM4576l2[2]);
            sb.append(str2);
            return sb.toString();
        }
        if (iArrM4576l[1] != 0) {
            int i = iArrM4576l2[0] + 1;
            sb.append((CharSequence) str, 0, i);
            sb.append(str2);
            return m4583s(sb, iArrM4576l[1] + i, i + iArrM4576l[2]);
        }
        if (str2.charAt(iArrM4576l[1]) == '/') {
            sb.append((CharSequence) str, 0, iArrM4576l2[1]);
            sb.append(str2);
            return m4583s(sb, iArrM4576l2[1], iArrM4576l2[1] + iArrM4576l[2]);
        }
        if (iArrM4576l2[0] + 2 < iArrM4576l2[1] && iArrM4576l2[1] == iArrM4576l2[2]) {
            sb.append((CharSequence) str, 0, iArrM4576l2[1]);
            sb.append('/');
            sb.append(str2);
            return m4583s(sb, iArrM4576l2[1], iArrM4576l2[1] + iArrM4576l[2] + 1);
        }
        int iLastIndexOf = str.lastIndexOf(47, iArrM4576l2[2] - 1);
        int i2 = iLastIndexOf == -1 ? iArrM4576l2[1] : iLastIndexOf + 1;
        sb.append((CharSequence) str, 0, i2);
        sb.append(str2);
        return m4583s(sb, iArrM4576l2[1], i2 + iArrM4576l[2]);
    }

    /* JADX INFO: renamed from: u */
    public static float m4585u(int i, float f, int i2, int i3) {
        float f2;
        if (f == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i == 0) {
            f2 = i3;
        } else {
            if (i != 1) {
                if (i != 2) {
                    return -3.4028235E38f;
                }
                return f;
            }
            f2 = i2;
        }
        return f * f2;
    }

    /* JADX INFO: renamed from: v */
    public static Uri m4586v(String str, String str2) {
        return Uri.parse(m4584t(str, str2));
    }

    /* JADX INFO: renamed from: w */
    public static void m4587w(@RecentlyNonNull C2191r c2191r) {
        C3494s1 c3494s1M8336a = C3494s1.m8336a();
        Objects.requireNonNull(c3494s1M8336a);
        C2622l.m5344b(true, "Null passed to setRequestConfiguration.");
        synchronized (c3494s1M8336a.f19436c) {
            C2191r c2191r2 = c3494s1M8336a.f19440g;
            c3494s1M8336a.f19440g = c2191r;
            InterfaceC3234l0 interfaceC3234l0 = c3494s1M8336a.f19437d;
            if (interfaceC3234l0 == null) {
                return;
            }
            if (c2191r2.f10582b != c2191r.f10582b || c2191r2.f10583c != c2191r.f10583c) {
                try {
                    interfaceC3234l0.mo6540T2(new C3125i2(c2191r));
                } catch (RemoteException e) {
                    C2622l.m5438t3("Unable to set request configuration parcel.", e);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005e A[Catch: all -> 0x006f, TryCatch #2 {, blocks: (B:12:0x002e, B:14:0x0032, B:16:0x0040, B:18:0x0052, B:19:0x005e, B:20:0x0065), top: B:29:0x002e }] */
    @Deprecated
    /* JADX INFO: renamed from: x */
    public static <T> T m4588x(Context context, Callable<T> callable) {
        try {
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                return callable.call();
            } finally {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        } catch (Throwable th) {
            C2622l.m5438t3("Unexpected exception.", th);
            synchronized (C3696xh.f21536a) {
                if (C3696xh.f21537b == null) {
                    if (C3646w4.f20989e.m6603d().booleanValue()) {
                        if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14483y4)).booleanValue()) {
                            C3696xh.f21537b = new C3733yh();
                        } else {
                            C3696xh.f21537b = new C3696xh(context, C3702xn.m8742H());
                        }
                    } else {
                        C3696xh.f21537b = new C3733yh();
                    }
                }
                C3696xh.f21537b.mo8736b(th, "StrictModeUtil.runWithLaxStrictMode");
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m4589y(Context context) {
        boolean z;
        Object obj = C3553tn.f19921a;
        boolean z2 = false;
        if (C3312n4.f17020a.m6603d().booleanValue()) {
            try {
                if (Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0) {
                    z2 = true;
                }
            } catch (Exception e) {
                C2622l.m5241D3("Fail to determine debug setting.", e);
            }
        }
        if (z2) {
            synchronized (C3553tn.f19921a) {
                z = C3553tn.f19922b;
            }
            if (z) {
                return;
            }
            kv1<?> kv1VarM4707b = new C2301u0(context).m4707b();
            C2622l.m5458x3("Updating ad debug logging enablement.");
            C2622l.m5320V0(kv1VarM4707b, "AdDebugLogUpdater.updateEnablement");
        }
    }

    /* JADX INFO: renamed from: z */
    public static void m4590z(String str) {
        if (m4556E()) {
            Log.v("Ads", str);
        }
    }
}
