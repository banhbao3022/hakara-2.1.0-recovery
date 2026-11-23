package p007c.p190n.p194b.p266d.p314j.p315a;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: c.n.b.d.j.a.uy */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3602uy {

    /* JADX INFO: renamed from: a */
    public final String f20671a;

    /* JADX INFO: renamed from: b */
    public final C2839ad f20672b;

    /* JADX INFO: renamed from: c */
    public final Executor f20673c;

    /* JADX INFO: renamed from: d */
    public C3787zy f20674d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC3464r8<Object> f20675e = new C3490ry(this);

    /* JADX INFO: renamed from: f */
    public final InterfaceC3464r8<Object> f20676f = new C3564ty(this);

    public C3602uy(String str, C2839ad c2839ad, Executor executor) {
        this.f20671a = str;
        this.f20672b = c2839ad;
        this.f20673c = executor;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ boolean m8525b(C3602uy c3602uy, Map map) {
        if (map == null) {
            return false;
        }
        String str = (String) map.get("hashCode");
        return !TextUtils.isEmpty(str) && str.equals(c3602uy.f20671a);
    }

    /* JADX INFO: renamed from: a */
    public final void m8526a(C3787zy c3787zy) {
        C2839ad c2839ad = this.f20672b;
        final InterfaceC3464r8<Object> interfaceC3464r8 = this.f20675e;
        c2839ad.m5729a();
        kv1<InterfaceC2987ec> kv1Var = c2839ad.f12070b;
        final String str = "/updateActiveView";
        qu1 qu1Var = new qu1(str, interfaceC3464r8) { // from class: c.n.b.d.j.a.yc

            /* JADX INFO: renamed from: a */
            public final String f21841a;

            /* JADX INFO: renamed from: b */
            public final InterfaceC3464r8 f21842b;

            {
                this.f21841a = str;
                this.f21842b = interfaceC3464r8;
            }

            @Override // p007c.p190n.p194b.p266d.p314j.p315a.qu1
            /* JADX INFO: renamed from: a */
            public final kv1 mo4612a(Object obj) {
                InterfaceC2987ec interfaceC2987ec = (InterfaceC2987ec) obj;
                interfaceC2987ec.mo6618e(this.f21841a, this.f21842b);
                return cw0.m6231a(interfaceC2987ec);
            }
        };
        lv1 lv1Var = C2962do.f13335f;
        c2839ad.f12070b = cw0.m6249s(kv1Var, qu1Var, lv1Var);
        C2839ad c2839ad2 = this.f20672b;
        final InterfaceC3464r8<Object> interfaceC3464r9 = this.f20676f;
        c2839ad2.m5729a();
        final String str2 = "/untrackActiveViewUnit";
        c2839ad2.f12070b = cw0.m6249s(c2839ad2.f12070b, new qu1(str2, interfaceC3464r9) { // from class: c.n.b.d.j.a.yc

            /* JADX INFO: renamed from: a */
            public final String f21841a;

            /* JADX INFO: renamed from: b */
            public final InterfaceC3464r8 f21842b;

            {
                this.f21841a = str2;
                this.f21842b = interfaceC3464r9;
            }

            @Override // p007c.p190n.p194b.p266d.p314j.p315a.qu1
            /* JADX INFO: renamed from: a */
            public final kv1 mo4612a(Object obj) {
                InterfaceC2987ec interfaceC2987ec = (InterfaceC2987ec) obj;
                interfaceC2987ec.mo6618e(this.f21841a, this.f21842b);
                return cw0.m6231a(interfaceC2987ec);
            }
        }, lv1Var);
        this.f20674d = c3787zy;
    }
}
