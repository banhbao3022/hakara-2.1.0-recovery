package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2255d1;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2267h1;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2300u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2302v;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2304w;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.yp */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3741yp {

    /* JADX INFO: renamed from: a */
    public final Context f21948a;

    /* JADX INFO: renamed from: b */
    public final String f21949b;

    /* JADX INFO: renamed from: c */
    public final C3702xn f21950c;

    /* JADX INFO: renamed from: d */
    public final C3422q3 f21951d;

    /* JADX INFO: renamed from: e */
    public final C3533t3 f21952e;

    /* JADX INFO: renamed from: f */
    public final C2304w f21953f;

    /* JADX INFO: renamed from: g */
    public final long[] f21954g;

    /* JADX INFO: renamed from: h */
    public final String[] f21955h;

    /* JADX INFO: renamed from: i */
    public boolean f21956i;

    /* JADX INFO: renamed from: j */
    public boolean f21957j;

    /* JADX INFO: renamed from: k */
    public boolean f21958k;

    /* JADX INFO: renamed from: l */
    public boolean f21959l;

    /* JADX INFO: renamed from: m */
    public boolean f21960m;

    /* JADX INFO: renamed from: n */
    public AbstractC3037fp f21961n;

    /* JADX INFO: renamed from: o */
    public boolean f21962o;

    /* JADX INFO: renamed from: p */
    public boolean f21963p;

    /* JADX INFO: renamed from: q */
    public long f21964q;

    public C3741yp(Context context, C3702xn c3702xn, String str, C3533t3 c3533t3, C3422q3 c3422q3) {
        C2302v c2302v = new C2302v();
        c2302v.m4806a("min_1", Double.MIN_VALUE, 1.0d);
        c2302v.m4806a("1_5", 1.0d, 5.0d);
        c2302v.m4806a("5_10", 5.0d, 10.0d);
        c2302v.m4806a("10_20", 10.0d, 20.0d);
        c2302v.m4806a("20_30", 20.0d, 30.0d);
        c2302v.m4806a("30_max", 30.0d, Double.MAX_VALUE);
        this.f21953f = new C2304w(c2302v);
        this.f21956i = false;
        this.f21957j = false;
        this.f21958k = false;
        this.f21959l = false;
        this.f21964q = -1L;
        this.f21948a = context;
        this.f21950c = c3702xn;
        this.f21949b = str;
        this.f21952e = c3533t3;
        this.f21951d = c3422q3;
        String str2 = (String) C2862b.f12493a.f12496d.m6596a(C3052g3.f14443t);
        if (str2 == null) {
            this.f21955h = new String[0];
            this.f21954g = new long[0];
            return;
        }
        String[] strArrSplit = TextUtils.split(str2, ",");
        int length = strArrSplit.length;
        this.f21955h = new String[length];
        this.f21954g = new long[length];
        for (int i = 0; i < strArrSplit.length; i++) {
            try {
                this.f21954g[i] = Long.parseLong(strArrSplit[i]);
            } catch (NumberFormatException e) {
                C2622l.m5241D3("Unable to parse frame hash target time number.", e);
                this.f21954g[i] = -1;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m8817a(AbstractC3037fp abstractC3037fp) {
        C2622l.m5391k1(this.f21952e, this.f21951d, "vpc2");
        this.f21956i = true;
        this.f21952e.m8398c("vpn", abstractC3037fp.mo6405e());
        this.f21961n = abstractC3037fp;
    }

    /* JADX INFO: renamed from: b */
    public final void m8818b() {
        if (!this.f21956i || this.f21957j) {
            return;
        }
        C2622l.m5391k1(this.f21952e, this.f21951d, "vfr2");
        this.f21957j = true;
    }

    /* JADX INFO: renamed from: c */
    public final void m8819c() {
        if (!C2868b5.f12525a.m6603d().booleanValue() || this.f21962o) {
            return;
        }
        Bundle bundleM1575Z = outline.m1575Z("type", "native-player-metrics");
        bundleM1575Z.putString("request", this.f21949b);
        bundleM1575Z.putString("player", this.f21961n.mo6405e());
        C2304w c2304w = this.f21953f;
        Objects.requireNonNull(c2304w);
        ArrayList<C2300u> arrayList = new ArrayList(c2304w.f10792a.length);
        int i = 0;
        while (true) {
            String[] strArr = c2304w.f10792a;
            if (i >= strArr.length) {
                break;
            }
            String str = strArr[i];
            double d = c2304w.f10794c[i];
            double d2 = c2304w.f10793b[i];
            int i2 = c2304w.f10795d[i];
            arrayList.add(new C2300u(str, d, d2, ((double) i2) / ((double) c2304w.f10796e), i2));
            i++;
            bundleM1575Z = bundleM1575Z;
        }
        Bundle bundle = bundleM1575Z;
        for (C2300u c2300u : arrayList) {
            String strValueOf = String.valueOf(c2300u.f10783a);
            Bundle bundle2 = bundle;
            bundle2.putString(strValueOf.length() != 0 ? "fps_c_".concat(strValueOf) : new String("fps_c_"), Integer.toString(c2300u.f10787e));
            String strValueOf2 = String.valueOf(c2300u.f10783a);
            bundle2.putString(strValueOf2.length() != 0 ? "fps_p_".concat(strValueOf2) : new String("fps_p_"), Double.toString(c2300u.f10786d));
            bundle = bundle2;
        }
        Bundle bundle3 = bundle;
        int i3 = 0;
        while (true) {
            long[] jArr = this.f21954g;
            if (i3 >= jArr.length) {
                C2330u c2330u = C2330u.f10884a;
                C2267h1 c2267h1 = c2330u.f10889d;
                Context context = this.f21948a;
                String str2 = this.f21950c.f21615f;
                Objects.requireNonNull(c2267h1);
                C2267h1 c2267h2 = c2330u.f10889d;
                bundle3.putString("device", C2267h1.m4740J());
                bundle3.putString("eids", TextUtils.join(",", C3052g3.m6923b()));
                C3331nn c3331nn = gx2.f14692a.f14693b;
                C3331nn.m7892j(context, str2, "gmob-apps", bundle3, new C2255d1(context, str2));
                this.f21962o = true;
                return;
            }
            String str3 = this.f21955h[i3];
            if (str3 != null) {
                String strValueOf3 = String.valueOf(Long.valueOf(jArr[i3]));
                StringBuilder sb = new StringBuilder(strValueOf3.length() + 3);
                sb.append("fh_");
                sb.append(strValueOf3);
                bundle3.putString(sb.toString(), str3);
            }
            i3++;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m8820d(AbstractC3037fp abstractC3037fp) {
        if (this.f21958k && !this.f21959l) {
            if (C2096e.m4556E() && !this.f21959l) {
                C2096e.m4590z("VideoMetricsMixin first frame");
            }
            C2622l.m5391k1(this.f21952e, this.f21951d, "vff2");
            this.f21959l = true;
        }
        long jMo5622b = C2330u.f10884a.f10896k.mo5622b();
        if (this.f21960m && this.f21963p && this.f21964q != -1) {
            long nanos = TimeUnit.SECONDS.toNanos(1L);
            long j2 = this.f21964q;
            C2304w c2304w = this.f21953f;
            double d = nanos / (jMo5622b - j2);
            c2304w.f10796e++;
            int i = 0;
            while (true) {
                double[] dArr = c2304w.f10794c;
                if (i >= dArr.length) {
                    break;
                }
                double d2 = dArr[i];
                if (d2 <= d && d < c2304w.f10793b[i]) {
                    int[] iArr = c2304w.f10795d;
                    iArr[i] = iArr[i] + 1;
                }
                if (d < d2) {
                    break;
                } else {
                    i++;
                }
            }
        }
        this.f21963p = this.f21960m;
        this.f21964q = jMo5622b;
        long jLongValue = ((Long) C2862b.f12493a.f12496d.m6596a(C3052g3.f14450u)).longValue();
        long jMo6412n = abstractC3037fp.mo6412n();
        int i2 = 0;
        while (true) {
            String[] strArr = this.f21955h;
            if (i2 >= strArr.length) {
                return;
            }
            if (strArr[i2] == null && jLongValue > Math.abs(jMo6412n - this.f21954g[i2])) {
                String[] strArr2 = this.f21955h;
                int i3 = 8;
                Bitmap bitmap = abstractC3037fp.getBitmap(8, 8);
                long j3 = 63;
                long j4 = 0;
                int i4 = 0;
                while (i4 < i3) {
                    int i5 = 0;
                    while (i5 < i3) {
                        int pixel = bitmap.getPixel(i5, i4);
                        j4 |= (Color.green(pixel) + (Color.red(pixel) + Color.blue(pixel)) > 128 ? 1L : 0L) << ((int) j3);
                        i5++;
                        j3--;
                        i3 = 8;
                    }
                    i4++;
                    i3 = 8;
                }
                strArr2[i2] = String.format("%016X", Long.valueOf(j4));
                return;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m8821e() {
        this.f21960m = true;
        if (!this.f21957j || this.f21958k) {
            return;
        }
        C2622l.m5391k1(this.f21952e, this.f21951d, "vfp2");
        this.f21958k = true;
    }
}
