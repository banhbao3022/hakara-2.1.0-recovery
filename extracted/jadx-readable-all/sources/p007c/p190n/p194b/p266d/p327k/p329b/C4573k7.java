package p007c.p190n.p194b.p266d.p327k.p329b;

import android.app.Activity;
import android.os.Bundle;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import p007c.p190n.p194b.p266d.p314j.p325k.C4132da;
import p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4174ga;

/* JADX INFO: renamed from: c.n.b.d.k.b.k7 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4573k7 extends AbstractC4475c5 {

    /* JADX INFO: renamed from: c */
    public volatile C4585l7 f24065c;

    /* JADX INFO: renamed from: d */
    public C4585l7 f24066d;

    /* JADX INFO: renamed from: e */
    public C4585l7 f24067e;

    /* JADX INFO: renamed from: f */
    public final Map<Activity, C4585l7> f24068f;

    /* JADX INFO: renamed from: g */
    public Activity f24069g;

    /* JADX INFO: renamed from: h */
    public volatile boolean f24070h;

    /* JADX INFO: renamed from: i */
    public volatile C4585l7 f24071i;

    /* JADX INFO: renamed from: j */
    public C4585l7 f24072j;

    /* JADX INFO: renamed from: k */
    public boolean f24073k;

    /* JADX INFO: renamed from: l */
    public final Object f24074l;

    /* JADX INFO: renamed from: m */
    public String f24075m;

    public C4573k7(C4707w4 c4707w4) {
        super(c4707w4);
        this.f24074l = new Object();
        this.f24068f = new ConcurrentHashMap();
    }

    /* JADX INFO: renamed from: A */
    public static void m10622A(C4585l7 c4585l7, Bundle bundle, boolean z) {
        if (c4585l7 == null || (bundle.containsKey("_sc") && !z)) {
            if (c4585l7 == null && z) {
                bundle.remove("_sn");
                bundle.remove("_sc");
                bundle.remove("_si");
                return;
            }
            return;
        }
        String str = c4585l7.f24121a;
        if (str != null) {
            bundle.putString("_sn", str);
        } else {
            bundle.remove("_sn");
        }
        String str2 = c4585l7.f24122b;
        if (str2 != null) {
            bundle.putString("_sc", str2);
        } else {
            bundle.remove("_sc");
        }
        bundle.putLong("_si", c4585l7.f24123c);
    }

    /* JADX INFO: renamed from: x */
    public static String m10623x(String str) {
        String[] strArrSplit = str.split("\\.");
        String str2 = strArrSplit.length > 0 ? strArrSplit[strArrSplit.length - 1] : "";
        return str2.length() > 100 ? str2.substring(0, 100) : str2;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:67:0x0121  */
    /* JADX INFO: renamed from: B */
    public final void m10624B(C4585l7 c4585l7, C4585l7 c4585l8, long j2, boolean z, Bundle bundle) {
        boolean z2;
        C4585l7 c4585l9;
        String str;
        long j3;
        long jM10589b;
        mo10381b();
        if (this.f24476a.f24534h.m10417k(C4647r.f24330T)) {
            z2 = z && this.f24067e != null;
            if (z2) {
                m10625C(this.f24067e, true, j2);
            }
        } else {
            if (z && (c4585l9 = this.f24067e) != null) {
                m10625C(c4585l9, true, j2);
            }
            z2 = false;
        }
        if ((c4585l8 != null && c4585l8.f24123c == c4585l7.f24123c && C4723x9.m10864q0(c4585l8.f24122b, c4585l7.f24122b) && C4723x9.m10864q0(c4585l8.f24121a, c4585l7.f24121a)) ? false : true) {
            Bundle bundle2 = new Bundle();
            if (this.f24476a.f24534h.m10417k(C4647r.f24380v0)) {
                bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            }
            Bundle bundle3 = bundle2;
            m10622A(c4585l7, bundle3, true);
            if (c4585l8 != null) {
                String str2 = c4585l8.f24121a;
                if (str2 != null) {
                    bundle3.putString("_pn", str2);
                }
                String str3 = c4585l8.f24122b;
                if (str3 != null) {
                    bundle3.putString("_pc", str3);
                }
                bundle3.putLong("_pi", c4585l8.f24123c);
            }
            if (this.f24476a.f24534h.m10417k(C4647r.f24330T) && z2) {
                if (((InterfaceC4174ga) C4132da.f23116f.zza()).zza() && this.f24476a.f24534h.m10417k(C4647r.f24332V)) {
                    C4527g9 c4527g9 = m10388s().f24634e;
                    jM10589b = j2 - c4527g9.f23950b;
                    c4527g9.f23950b = j2;
                } else {
                    jM10589b = m10388s().f24634e.m10589b();
                }
                if (jM10589b > 0) {
                    m10817f().m10873G(bundle3, jM10589b);
                }
            }
            if (this.f24476a.f24534h.m10417k(C4647r.f24380v0)) {
                if (!this.f24476a.f24534h.m10428z().booleanValue()) {
                    bundle3.putLong("_mst", 1L);
                }
                if (c4585l7.f24125e) {
                    str = "app";
                } else {
                    str = "auto";
                }
            } else {
                str = "auto";
            }
            String str4 = str;
            if (this.f24476a.f24534h.m10417k(C4647r.f24380v0)) {
                long jMo5623c = this.f24476a.f24541o.mo5623c();
                if (c4585l7.f24125e) {
                    long j4 = c4585l7.f24126f;
                    if (j4 != 0) {
                        j3 = j4;
                    } else {
                        j3 = jMo5623c;
                    }
                } else {
                    j3 = jMo5623c;
                }
                m10383i().m10514E(str4, "_vs", j3, bundle3);
            } else {
                C4500e6 c4500e6M10383i = m10383i();
                c4500e6M10383i.mo10381b();
                c4500e6M10383i.m10514E(str4, "_vs", c4500e6M10383i.f24476a.f24541o.mo5623c(), bundle3);
            }
        }
        this.f24067e = c4585l7;
        if (this.f24476a.f24534h.m10417k(C4647r.f24380v0) && c4585l7.f24125e) {
            this.f24072j = c4585l7;
        }
        C4677t7 c4677t7M10385p = m10385p();
        c4677t7M10385p.mo10381b();
        c4677t7M10385p.m10479t();
        c4677t7M10385p.m10778z(new RunnableC4743z7(c4677t7M10385p, c4585l7));
    }

    /* JADX INFO: renamed from: C */
    public final void m10625C(C4585l7 c4585l7, boolean z, long j2) {
        m10382h().m10372t(this.f24476a.f24541o.mo5621a());
        if (!m10388s().m10914w(c4585l7 != null && c4585l7.f24124d, z, j2) || c4585l7 == null) {
            return;
        }
        c4585l7.f24124d = false;
    }

    /* JADX INFO: renamed from: D */
    public final void m10626D(String str, C4585l7 c4585l7) {
        mo10381b();
        synchronized (this) {
            String str2 = this.f24075m;
            if (str2 == null || str2.equals(str) || c4585l7 != null) {
                this.f24075m = str;
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public final C4585l7 m10627E(Activity activity) {
        Objects.requireNonNull(activity, "null reference");
        C4585l7 c4585l7 = this.f24068f.get(activity);
        if (c4585l7 == null) {
            C4585l7 c4585l8 = new C4585l7(null, m10623x(activity.getClass().getCanonicalName()), m10817f().m10902t0());
            this.f24068f.put(activity, c4585l8);
            c4585l7 = c4585l8;
        }
        return (this.f24476a.f24534h.m10417k(C4647r.f24380v0) && this.f24071i != null) ? this.f24071i : c4585l7;
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.AbstractC4475c5
    /* JADX INFO: renamed from: v */
    public final boolean mo10481v() {
        return false;
    }

    /* JADX INFO: renamed from: w */
    public final C4585l7 m10628w(boolean z) {
        m10479t();
        mo10381b();
        if (!this.f24476a.f24534h.m10417k(C4647r.f24380v0) || !z) {
            return this.f24067e;
        }
        C4585l7 c4585l7 = this.f24067e;
        return c4585l7 != null ? c4585l7 : this.f24072j;
    }

    /* JADX INFO: renamed from: y */
    public final void m10629y(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!this.f24476a.f24534h.m10428z().booleanValue() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f24068f.put(activity, new C4585l7(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    /* JADX INFO: renamed from: z */
    public final void m10630z(Activity activity, C4585l7 c4585l7, boolean z) {
        C4585l7 c4585l8;
        C4585l7 c4585l9 = this.f24065c == null ? this.f24066d : this.f24065c;
        if (c4585l7.f24122b == null) {
            c4585l8 = new C4585l7(c4585l7.f24121a, activity != null ? m10623x(activity.getClass().getCanonicalName()) : null, c4585l7.f24123c, c4585l7.f24125e, c4585l7.f24126f);
        } else {
            c4585l8 = c4585l7;
        }
        this.f24066d = this.f24065c;
        this.f24065c = c4585l8;
        mo10686n().m10758v(new RunnableC4597m7(this, c4585l8, c4585l9, this.f24476a.f24541o.mo5621a(), z));
    }
}
