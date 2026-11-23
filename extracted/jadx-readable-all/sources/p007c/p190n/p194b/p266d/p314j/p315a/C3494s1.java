package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.os.RemoteException;
import java.util.ArrayList;
import p007c.p190n.p194b.p266d.p267a.C2191r;
import p007c.p190n.p194b.p266d.p267a.p281y.InterfaceC2215a;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.s1 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3494s1 {

    /* JADX INFO: renamed from: a */
    public static C3494s1 f19434a;

    /* JADX INFO: renamed from: d */
    public InterfaceC3234l0 f19437d;

    /* JADX INFO: renamed from: h */
    public InterfaceC2215a f19441h;

    /* JADX INFO: renamed from: c */
    public final Object f19436c = new Object();

    /* JADX INFO: renamed from: e */
    public boolean f19438e = false;

    /* JADX INFO: renamed from: f */
    public boolean f19439f = false;

    /* JADX INFO: renamed from: g */
    public C2191r f19440g = new C2191r.a().m4633a();

    /* JADX INFO: renamed from: b */
    public final ArrayList<?> f19435b = new ArrayList<>();

    /* JADX INFO: renamed from: a */
    public static C3494s1 m8336a() {
        C3494s1 c3494s1;
        synchronized (C3494s1.class) {
            if (f19434a == null) {
                f19434a = new C3494s1();
            }
            c3494s1 = f19434a;
        }
        return c3494s1;
    }

    /* JADX INFO: renamed from: b */
    public final String m8337b() {
        String strM5278L0;
        synchronized (this.f19436c) {
            C2622l.m5389k(this.f19437d != null, "MobileAds.initialize() must be called prior to getting version string.");
            try {
                strM5278L0 = C2622l.m5278L0(this.f19437d.mo6550m());
            } catch (RemoteException e) {
                C2622l.m5438t3("Unable to get version string.", e);
                return "";
            }
        }
        return strM5278L0;
    }

    /* JADX INFO: renamed from: c */
    public final void m8338c(Context context) {
        if (this.f19437d == null) {
            this.f19437d = new cx2(gx2.f14692a.f14694c, context).m6891d(context, false);
        }
    }
}
