package p007c.p190n.p194b.p266d.p314j.p315a;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import java.util.Locale;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2267h1;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p309v.C2794c;

/* JADX INFO: renamed from: c.n.b.d.j.a.ui */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3585ui {

    /* JADX INFO: renamed from: A */
    public int f20327A;

    /* JADX INFO: renamed from: B */
    public final String f20328B;

    /* JADX INFO: renamed from: C */
    public boolean f20329C;

    /* JADX INFO: renamed from: a */
    public int f20330a;

    /* JADX INFO: renamed from: b */
    public boolean f20331b;

    /* JADX INFO: renamed from: c */
    public boolean f20332c;

    /* JADX INFO: renamed from: d */
    public int f20333d;

    /* JADX INFO: renamed from: e */
    public int f20334e;

    /* JADX INFO: renamed from: f */
    public int f20335f;

    /* JADX INFO: renamed from: g */
    public String f20336g;

    /* JADX INFO: renamed from: h */
    public int f20337h;

    /* JADX INFO: renamed from: i */
    public int f20338i;

    /* JADX INFO: renamed from: j */
    public int f20339j;

    /* JADX INFO: renamed from: k */
    public boolean f20340k;

    /* JADX INFO: renamed from: l */
    public int f20341l;

    /* JADX INFO: renamed from: m */
    public double f20342m;

    /* JADX INFO: renamed from: n */
    public boolean f20343n;

    /* JADX INFO: renamed from: o */
    public String f20344o;

    /* JADX INFO: renamed from: p */
    public String f20345p;

    /* JADX INFO: renamed from: q */
    public final boolean f20346q;

    /* JADX INFO: renamed from: r */
    public final boolean f20347r;

    /* JADX INFO: renamed from: s */
    public final String f20348s;

    /* JADX INFO: renamed from: t */
    public final boolean f20349t;

    /* JADX INFO: renamed from: u */
    public final boolean f20350u;

    /* JADX INFO: renamed from: v */
    public final boolean f20351v;

    /* JADX INFO: renamed from: w */
    public final String f20352w;

    /* JADX INFO: renamed from: x */
    public final String f20353x;

    /* JADX INFO: renamed from: y */
    public float f20354y;

    /* JADX INFO: renamed from: z */
    public int f20355z;

    /* JADX WARN: Code duplicated, block: B:20:0x008f  */
    public C3585ui(Context context) {
        String string;
        DisplayMetrics displayMetrics;
        ActivityInfo activityInfo;
        PackageManager packageManager = context.getPackageManager();
        m8503b(context);
        m8504c(context);
        m8505d(context);
        Locale locale = Locale.getDefault();
        this.f20346q = m8501e(packageManager, "geo:0,0?q=donuts") != null;
        this.f20347r = m8501e(packageManager, "http://www.google.com") != null;
        this.f20348s = locale.getCountry();
        C3331nn c3331nn = gx2.f14692a.f14693b;
        this.f20349t = C3331nn.m7887e();
        this.f20350u = C2622l.m5232C(context);
        this.f20351v = C2622l.m5381i1(context);
        this.f20352w = locale.getLanguage();
        ResolveInfo resolveInfoM8501e = m8501e(packageManager, "market://details?id=com.google.android.gms.ads");
        String string2 = null;
        if (resolveInfoM8501e == null || (activityInfo = resolveInfoM8501e.activityInfo) == null) {
            string = null;
        } else {
            try {
                PackageInfo packageInfoM5635c = C2794c.m5637a(context).m5635c(activityInfo.packageName, 0);
                if (packageInfoM5635c != null) {
                    int i = packageInfoM5635c.versionCode;
                    String str = activityInfo.packageName;
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
                    sb.append(i);
                    sb.append(".");
                    sb.append(str);
                    string = sb.toString();
                } else {
                    string = null;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        this.f20353x = string;
        try {
            PackageInfo packageInfo = C2794c.m5637a(context).f11958a.getPackageManager().getPackageInfo("com.android.vending", 128);
            if (packageInfo != null) {
                int i2 = packageInfo.versionCode;
                String str2 = packageInfo.packageName;
                StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 12);
                sb2.append(i2);
                sb2.append(".");
                sb2.append(str2);
                string2 = sb2.toString();
            }
        } catch (Exception unused2) {
        }
        this.f20328B = string2;
        Resources resources = context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return;
        }
        this.f20354y = displayMetrics.density;
        this.f20355z = displayMetrics.widthPixels;
        this.f20327A = displayMetrics.heightPixels;
    }

    /* JADX INFO: renamed from: e */
    public static ResolveInfo m8501e(PackageManager packageManager, String str) {
        try {
            return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
        } catch (Throwable th) {
            C2998en c2998en = C2330u.f10884a.f10893h;
            C3696xh.m8734c(c2998en.f13616e, c2998en.f13617f).mo8736b(th, "DeviceInfo.getResolveInfo");
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final C3623vi m8502a() {
        return new C3623vi(this.f20346q, this.f20347r, this.f20336g, this.f20348s, this.f20349t, this.f20350u, this.f20351v, this.f20352w, this.f20353x, this.f20328B, this.f20337h, this.f20338i, this.f20354y, this.f20355z, this.f20327A, this.f20344o, this.f20345p);
    }

    /* JADX INFO: renamed from: b */
    public final void m8503b(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            try {
                this.f20330a = audioManager.getMode();
                this.f20331b = audioManager.isMusicActive();
                this.f20332c = audioManager.isSpeakerphoneOn();
                this.f20333d = audioManager.getStreamVolume(3);
                this.f20334e = audioManager.getRingerMode();
                this.f20335f = audioManager.getStreamVolume(2);
                return;
            } catch (Throwable th) {
                C2998en c2998en = C2330u.f10884a.f10893h;
                C3696xh.m8734c(c2998en.f13616e, c2998en.f13617f).mo8736b(th, "DeviceInfo.gatherAudioInfo");
            }
        }
        this.f20330a = -2;
        this.f20331b = false;
        this.f20332c = false;
        this.f20333d = 0;
        this.f20334e = 2;
        this.f20335f = 0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0031  */
    @TargetApi(16)
    /* JADX INFO: renamed from: c */
    public final void m8504c(Context context) {
        int networkType;
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.f20336g = telephonyManager.getNetworkOperator();
        if (C2622l.m5222A()) {
            if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14316a5)).booleanValue()) {
                networkType = 0;
            } else {
                networkType = telephonyManager.getNetworkType();
            }
        } else {
            networkType = telephonyManager.getNetworkType();
        }
        this.f20338i = networkType;
        this.f20339j = telephonyManager.getPhoneType();
        this.f20337h = -2;
        this.f20340k = false;
        this.f20341l = -1;
        C2267h1 c2267h1 = C2330u.f10884a.f10889d;
        if (C2267h1.m4744c(context, "android.permission.ACCESS_NETWORK_STATE")) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                this.f20337h = activeNetworkInfo.getType();
                this.f20341l = activeNetworkInfo.getDetailedState().ordinal();
            } else {
                this.f20337h = -1;
            }
            this.f20340k = connectivityManager.isActiveNetworkMetered();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m8505d(Context context) {
        Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            this.f20342m = -1.0d;
            this.f20343n = false;
        } else {
            int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
            this.f20342m = intentRegisterReceiver.getIntExtra("level", -1) / intentRegisterReceiver.getIntExtra("scale", -1);
            this.f20343n = intExtra == 2 || intExtra == 5;
        }
    }

    public C3585ui(Context context, C3623vi c3623vi) {
        m8503b(context);
        m8504c(context);
        m8505d(context);
        this.f20344o = Build.FINGERPRINT;
        this.f20345p = Build.DEVICE;
        this.f20329C = C2830a4.m5684a(context);
        this.f20346q = c3623vi.f20790a;
        this.f20347r = c3623vi.f20791b;
        this.f20348s = c3623vi.f20792c;
        this.f20349t = c3623vi.f20793d;
        this.f20350u = c3623vi.f20794e;
        this.f20351v = c3623vi.f20795f;
        this.f20352w = c3623vi.f20796g;
        this.f20353x = c3623vi.f20797h;
        this.f20328B = c3623vi.f20798i;
        this.f20354y = c3623vi.f20801l;
        this.f20355z = c3623vi.f20802m;
        this.f20327A = c3623vi.f20803n;
    }
}
