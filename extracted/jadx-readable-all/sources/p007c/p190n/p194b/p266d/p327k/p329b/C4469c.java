package p007c.p190n.p194b.p266d.p327k.p329b;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.stetho.server.http.HttpStatus;
import java.lang.reflect.InvocationTargetException;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p309v.C2794c;
import p007c.p190n.p194b.p266d.p314j.p325k.C4091ab;
import p007c.p190n.p194b.p266d.p314j.p325k.C4433z8;
import p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4435za;

/* JADX INFO: renamed from: c.n.b.d.k.b.c */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4469c extends C4686u5 {

    /* JADX INFO: renamed from: b */
    public Boolean f23742b;

    /* JADX INFO: renamed from: c */
    public InterfaceC4493e f23743c;

    /* JADX INFO: renamed from: d */
    public Boolean f23744d;

    public C4469c(C4707w4 c4707w4) {
        super(c4707w4);
        this.f23743c = C4457b.f23722a;
    }

    /* JADX INFO: renamed from: B */
    public static long m10410B() {
        return C4647r.f24302D.m10638a(null).longValue();
    }

    /* JADX INFO: renamed from: A */
    public final boolean m10411A(String str) {
        return "1".equals(this.f23743c.mo10379d(str, "measurement.event_sampling_enabled"));
    }

    /* JADX INFO: renamed from: C */
    public final boolean m10412C() {
        if (this.f23742b == null) {
            Boolean boolM10425w = m10425w("app_measurement_lite");
            this.f23742b = boolM10425w;
            if (boolM10425w == null) {
                this.f23742b = Boolean.FALSE;
            }
        }
        return this.f23742b.booleanValue() || !this.f24476a.f24532f;
    }

    /* JADX INFO: renamed from: D */
    public final Bundle m10413D() {
        try {
            if (this.f24476a.f24528b.getPackageManager() == null) {
                mo10684l().f24418f.m10811a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfoM5633a = C2794c.m5637a(this.f24476a.f24528b).m5633a(this.f24476a.f24528b.getPackageName(), 128);
            if (applicationInfoM5633a != null) {
                return applicationInfoM5633a.metaData;
            }
            mo10684l().f24418f.m10811a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            mo10684l().f24418f.m10812b("Failed to load metadata: Package name not found", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public final String m10414d(String str, String str2) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, str2);
        } catch (ClassNotFoundException e) {
            mo10684l().f24418f.m10812b("Could not find SystemProperties class", e);
            return str2;
        } catch (IllegalAccessException e2) {
            mo10684l().f24418f.m10812b("Could not access SystemProperties.get()", e2);
            return str2;
        } catch (NoSuchMethodException e3) {
            mo10684l().f24418f.m10812b("Could not find SystemProperties.get() method", e3);
            return str2;
        } catch (InvocationTargetException e4) {
            mo10684l().f24418f.m10812b("SystemProperties.get() threw an exception", e4);
            return str2;
        }
    }

    /* JADX INFO: renamed from: h */
    public final int m10415h(String str) {
        return Math.max(Math.min(m10419q(str, C4647r.f24312I), 100), 25);
    }

    /* JADX INFO: renamed from: i */
    public final long m10416i(String str, C4581l3<Long> c4581l3) {
        if (str == null) {
            return c4581l3.m10638a(null).longValue();
        }
        String strMo10379d = this.f23743c.mo10379d(str, c4581l3.f24103b);
        if (TextUtils.isEmpty(strMo10379d)) {
            return c4581l3.m10638a(null).longValue();
        }
        try {
            return c4581l3.m10638a(Long.valueOf(Long.parseLong(strMo10379d))).longValue();
        } catch (NumberFormatException unused) {
            return c4581l3.m10638a(null).longValue();
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m10417k(C4581l3<Boolean> c4581l3) {
        return m10423u(null, c4581l3);
    }

    /* JADX INFO: renamed from: p */
    public final int m10418p(String str) {
        return (C4433z8.m10348a() && m10423u(null, C4647r.f24382w0)) ? Math.max(Math.min(m10419q(str, C4647r.f24310H), 2000), HttpStatus.HTTP_INTERNAL_SERVER_ERROR) : HttpStatus.HTTP_INTERNAL_SERVER_ERROR;
    }

    /* JADX INFO: renamed from: q */
    public final int m10419q(String str, C4581l3<Integer> c4581l3) {
        if (str == null) {
            return c4581l3.m10638a(null).intValue();
        }
        String strMo10379d = this.f23743c.mo10379d(str, c4581l3.f24103b);
        if (TextUtils.isEmpty(strMo10379d)) {
            return c4581l3.m10638a(null).intValue();
        }
        try {
            return c4581l3.m10638a(Integer.valueOf(Integer.parseInt(strMo10379d))).intValue();
        } catch (NumberFormatException unused) {
            return c4581l3.m10638a(null).intValue();
        }
    }

    /* JADX INFO: renamed from: r */
    public final double m10420r(String str, C4581l3<Double> c4581l3) {
        if (str == null) {
            return c4581l3.m10638a(null).doubleValue();
        }
        String strMo10379d = this.f23743c.mo10379d(str, c4581l3.f24103b);
        if (TextUtils.isEmpty(strMo10379d)) {
            return c4581l3.m10638a(null).doubleValue();
        }
        try {
            return c4581l3.m10638a(Double.valueOf(Double.parseDouble(strMo10379d))).doubleValue();
        } catch (NumberFormatException unused) {
            return c4581l3.m10638a(null).doubleValue();
        }
    }

    /* JADX INFO: renamed from: s */
    public final int m10421s(String str) {
        return m10419q(str, C4647r.f24365o);
    }

    /* JADX INFO: renamed from: t */
    public final int m10422t() {
        if (!C4433z8.m10348a() || !this.f24476a.f24534h.m10423u(null, C4647r.f24384x0)) {
            return 25;
        }
        C4723x9 c4723x9M10817f = m10817f();
        Boolean bool = c4723x9M10817f.f24476a.m10841x().f24456e;
        return c4723x9M10817f.m10908y0() >= 201500 || (bool != null && !bool.booleanValue()) ? 100 : 25;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m10423u(String str, C4581l3<Boolean> c4581l3) {
        if (str == null) {
            return c4581l3.m10638a(null).booleanValue();
        }
        String strMo10379d = this.f23743c.mo10379d(str, c4581l3.f24103b);
        return TextUtils.isEmpty(strMo10379d) ? c4581l3.m10638a(null).booleanValue() : c4581l3.m10638a(Boolean.valueOf(Boolean.parseBoolean(strMo10379d))).booleanValue();
    }

    /* JADX INFO: renamed from: v */
    public final boolean m10424v(String str, C4581l3<Boolean> c4581l3) {
        return m10423u(str, c4581l3);
    }

    /* JADX INFO: renamed from: w */
    public final Boolean m10425w(String str) {
        C2622l.m5359e(str);
        Bundle bundleM10413D = m10413D();
        if (bundleM10413D == null) {
            mo10684l().f24418f.m10811a("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (bundleM10413D.containsKey(str)) {
            return Boolean.valueOf(bundleM10413D.getBoolean(str));
        }
        return null;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m10426x() {
        Boolean boolM10425w = m10425w("firebase_analytics_collection_deactivated");
        return boolM10425w != null && boolM10425w.booleanValue();
    }

    /* JADX INFO: renamed from: y */
    public final Boolean m10427y() {
        Boolean boolM10425w = m10425w("google_analytics_adid_collection_enabled");
        return Boolean.valueOf(boolM10425w == null || boolM10425w.booleanValue());
    }

    /* JADX INFO: renamed from: z */
    public final Boolean m10428z() {
        if (!((InterfaceC4435za) C4091ab.f23071f.zza()).zza() || !m10417k(C4647r.f24378u0)) {
            return Boolean.TRUE;
        }
        Boolean boolM10425w = m10425w("google_analytics_automatic_screen_reporting_enabled");
        return Boolean.valueOf(boolM10425w == null || boolM10425w.booleanValue());
    }
}
