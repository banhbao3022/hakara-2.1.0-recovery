package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import p007c.p190n.p194b.p266d.p267a.C2169e;
import p007c.p190n.p194b.p266d.p267a.C2182i;
import p007c.p190n.p194b.p266d.p267a.p268a0.AbstractC2104a;
import p007c.p190n.p194b.p266d.p267a.p277g0.C2179b;
import p007c.p190n.p194b.p266d.p267a.p278v.AbstractC2196b;
import p007c.p190n.p194b.p266d.p267a.p278v.C2195a;
import p007c.p190n.p194b.p266d.p298f.C2610f;

/* JADX INFO: renamed from: c.n.b.d.j.a.nn */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3331nn {

    /* JADX INFO: renamed from: a */
    public static final Handler f17166a = new xr1(Looper.getMainLooper());

    /* JADX INFO: renamed from: b */
    public static final String f17167b = C2182i.class.getName();

    /* JADX INFO: renamed from: c */
    public static final String f17168c = AbstractC2104a.class.getName();

    /* JADX INFO: renamed from: d */
    public static final String f17169d = C2195a.class.getName();

    /* JADX INFO: renamed from: e */
    public static final String f17170e = AbstractC2196b.class.getName();

    /* JADX INFO: renamed from: f */
    public static final String f17171f = C2179b.class.getName();

    /* JADX INFO: renamed from: g */
    public static final String f17172g = C2169e.class.getName();

    /* JADX INFO: renamed from: h */
    public float f17173h = -1.0f;

    /* JADX INFO: renamed from: b */
    public static String m7884b(String str) {
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(str.getBytes());
                return String.format(Locale.US, "%032X", new BigInteger(1, messageDigest.digest()));
            } catch (ArithmeticException unused) {
                return null;
            } catch (NoSuchAlgorithmException unused2) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m7885c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith(C3646w4.f20988d.m6603d());
    }

    /* JADX INFO: renamed from: d */
    public static final int m7886d(DisplayMetrics displayMetrics, int i) {
        return (int) TypedValue.applyDimension(1, i, displayMetrics);
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m7887e() {
        return Build.DEVICE.startsWith("generic");
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m7888f(Context context, int i) {
        return C2610f.f11568b.mo5207d(context, i) == 0;
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m7889g(Context context) {
        int iMo5207d = C2610f.f11568b.mo5207d(context, 12451000);
        return iMo5207d == 0 || iMo5207d == 2;
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m7890h() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* JADX INFO: renamed from: i */
    public static final int m7891i(DisplayMetrics displayMetrics, int i) {
        return Math.round(i / displayMetrics.density);
    }

    /* JADX INFO: renamed from: j */
    public static final void m7892j(Context context, String str, String str2, Bundle bundle, InterfaceC3294mn interfaceC3294mn) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        bundle.putString("os", Build.VERSION.RELEASE);
        bundle.putString("api", String.valueOf(Build.VERSION.SDK_INT));
        bundle.putString("appid", applicationContext.getPackageName());
        if (str == null) {
            int iM5212a = C2610f.f11568b.m5212a(context);
            StringBuilder sb = new StringBuilder(23);
            sb.append(iM5212a);
            sb.append(".210890000");
            str = sb.toString();
        }
        bundle.putString("js", str);
        Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", "gmob-apps");
        for (String str3 : bundle.keySet()) {
            builderAppendQueryParameter.appendQueryParameter(str3, bundle.getString(str3));
        }
        interfaceC3294mn.mo4730f(builderAppendQueryParameter.toString());
    }

    /* JADX INFO: renamed from: k */
    public static final int m7893k(Context context, int i) {
        return m7886d(context.getResources().getDisplayMetrics(), i);
    }

    /* JADX INFO: renamed from: l */
    public static final String m7894l(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        String string = contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id");
        if (string == null || m7887e()) {
            string = "emulator";
        }
        return m7884b(string);
    }

    /* JADX INFO: renamed from: m */
    public static final void m7895m(ViewGroup viewGroup, jw2 jw2Var, String str, int i, int i2) {
        if (viewGroup.getChildCount() != 0) {
            return;
        }
        Context context = viewGroup.getContext();
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setText(str);
        textView.setTextColor(i);
        textView.setBackgroundColor(i2);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(i);
        int iM7893k = m7893k(context, 3);
        frameLayout.addView(textView, new FrameLayout.LayoutParams(jw2Var.f15840k - iM7893k, jw2Var.f15837h - iM7893k, 17));
        viewGroup.addView(frameLayout, jw2Var.f15840k, jw2Var.f15837h);
    }

    /* JADX INFO: renamed from: a */
    public final int m7896a(Context context, int i) {
        if (this.f17173h < 0.0f) {
            synchronized (this) {
                if (this.f17173h < 0.0f) {
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    if (windowManager == null) {
                        return 0;
                    }
                    Display defaultDisplay = windowManager.getDefaultDisplay();
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    defaultDisplay.getMetrics(displayMetrics);
                    this.f17173h = displayMetrics.density;
                }
            }
        }
        return Math.round(i / this.f17173h);
    }
}
