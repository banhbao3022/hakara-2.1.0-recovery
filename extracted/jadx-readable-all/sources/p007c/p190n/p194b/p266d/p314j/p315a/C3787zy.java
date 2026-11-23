package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p194b.p266d.p267a.p282z.p283a.InterfaceC2235r;
import p007c.p190n.p194b.p266d.p298f.p307u.InterfaceC2782b;

/* JADX INFO: renamed from: c.n.b.d.j.a.zy */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3787zy implements ip2, b70, InterfaceC2235r, a70 {

    /* JADX INFO: renamed from: f */
    public final C3602uy f22435f;

    /* JADX INFO: renamed from: g */
    public final C3639vy f22436g;

    /* JADX INFO: renamed from: i */
    public final C2951dd<JSONObject, JSONObject> f22438i;

    /* JADX INFO: renamed from: j */
    public final Executor f22439j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC2782b f22440k;

    /* JADX INFO: renamed from: h */
    public final Set<InterfaceC3410ps> f22437h = new HashSet();

    /* JADX INFO: renamed from: l */
    public final AtomicBoolean f22441l = new AtomicBoolean(false);

    /* JADX INFO: renamed from: m */
    public final C3750yy f22442m = new C3750yy();

    /* JADX INFO: renamed from: n */
    public boolean f22443n = false;

    /* JADX INFO: renamed from: o */
    public WeakReference<?> f22444o = new WeakReference<>(this);

    public C3787zy(C2839ad c2839ad, C3639vy c3639vy, Executor executor, C3602uy c3602uy, InterfaceC2782b interfaceC2782b) {
        this.f22435f = c3602uy;
        C3320nc<JSONObject> c3320nc = C3357oc.f17593b;
        c2839ad.m5729a();
        this.f22438i = new C2951dd<>(c2839ad.f12070b, c3320nc, c3320nc);
        this.f22436g = c3639vy;
        this.f22439j = executor;
        this.f22440k = interfaceC2782b;
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p282z.p283a.InterfaceC2235r
    /* JADX INFO: renamed from: F3 */
    public final void mo4698F3() {
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p282z.p283a.InterfaceC2235r
    /* JADX INFO: renamed from: J3 */
    public final void mo4699J3(int i) {
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p282z.p283a.InterfaceC2235r
    /* JADX INFO: renamed from: O5 */
    public final synchronized void mo4700O5() {
        this.f22442m.f22134b = false;
        m8912b();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.b70
    /* JADX INFO: renamed from: a */
    public final synchronized void mo5929a(Context context) {
        this.f22442m.f22134b = true;
        m8912b();
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m8912b() {
        if (this.f22444o.get() == null) {
            synchronized (this) {
                m8913c();
                this.f22443n = true;
            }
            return;
        }
        if (this.f22443n || !this.f22441l.get()) {
            return;
        }
        try {
            this.f22442m.f22135c = this.f22440k.mo5621a();
            final JSONObject jSONObjectM8596a = this.f22436g.mo7491b(this.f22442m);
            for (final InterfaceC3410ps interfaceC3410ps : this.f22437h) {
                this.f22439j.execute(new Runnable(interfaceC3410ps, jSONObjectM8596a) { // from class: c.n.b.d.j.a.xy

                    /* JADX INFO: renamed from: f */
                    public final InterfaceC3410ps f21714f;

                    /* JADX INFO: renamed from: g */
                    public final JSONObject f21715g;

                    {
                        this.f21714f = interfaceC3410ps;
                        this.f21715g = jSONObjectM8596a;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f21714f.mo6507u0("AFMA_updateActiveView", this.f21715g);
                    }
                });
            }
            C2951dd<JSONObject, JSONObject> c2951dd = this.f22438i;
            kv1<InterfaceC2987ec> kv1Var = c2951dd.f13241a;
            C2876bd c2876bd = new C2876bd(c2951dd, jSONObjectM8596a);
            lv1 lv1Var = C2962do.f13335f;
            kv1 kv1VarM6249s = cw0.m6249s(kv1Var, c2876bd, lv1Var);
            ((du1) kv1VarM6249s).mo6230f(new ev1(kv1VarM6249s, new C3036fo()), lv1Var);
            return;
        } catch (Exception e) {
            C2096e.m4554C("Failed to call ActiveViewJS", e);
            return;
        }
        throw th;
    }

    /* JADX INFO: renamed from: c */
    public final void m8913c() {
        Iterator<InterfaceC3410ps> it = this.f22437h.iterator();
        while (true) {
            final String str = "/untrackActiveViewUnit";
            final String str2 = "/updateActiveView";
            if (!it.hasNext()) {
                C3602uy c3602uy = this.f22435f;
                C2839ad c2839ad = c3602uy.f20672b;
                final InterfaceC3464r8<Object> interfaceC3464r8 = c3602uy.f20675e;
                kv1<InterfaceC2987ec> kv1Var = c2839ad.f12070b;
                cs1 cs1Var = new cs1(str2, interfaceC3464r8) { // from class: c.n.b.d.j.a.zc

                    /* JADX INFO: renamed from: a */
                    public final String f22230a;

                    /* JADX INFO: renamed from: b */
                    public final InterfaceC3464r8 f22231b;

                    {
                        this.f22230a = str2;
                        this.f22231b = interfaceC3464r8;
                    }

                    @Override // p007c.p190n.p194b.p266d.p314j.p315a.cs1
                    public final Object apply(Object obj) {
                        InterfaceC2987ec interfaceC2987ec = (InterfaceC2987ec) obj;
                        interfaceC2987ec.mo6617c(this.f22230a, this.f22231b);
                        return interfaceC2987ec;
                    }
                };
                lv1 lv1Var = C2962do.f13335f;
                c2839ad.f12070b = cw0.m6250t(kv1Var, cs1Var, lv1Var);
                C2839ad c2839ad2 = c3602uy.f20672b;
                final InterfaceC3464r8<Object> interfaceC3464r9 = c3602uy.f20676f;
                c2839ad2.f12070b = cw0.m6250t(c2839ad2.f12070b, new cs1(str, interfaceC3464r9) { // from class: c.n.b.d.j.a.zc

                    /* JADX INFO: renamed from: a */
                    public final String f22230a;

                    /* JADX INFO: renamed from: b */
                    public final InterfaceC3464r8 f22231b;

                    {
                        this.f22230a = str;
                        this.f22231b = interfaceC3464r9;
                    }

                    @Override // p007c.p190n.p194b.p266d.p314j.p315a.cs1
                    public final Object apply(Object obj) {
                        InterfaceC2987ec interfaceC2987ec = (InterfaceC2987ec) obj;
                        interfaceC2987ec.mo6617c(this.f22230a, this.f22231b);
                        return interfaceC2987ec;
                    }
                }, lv1Var);
                return;
            }
            InterfaceC3410ps next = it.next();
            C3602uy c3602uy2 = this.f22435f;
            next.mo6466V("/updateActiveView", c3602uy2.f20675e);
            next.mo6466V("/untrackActiveViewUnit", c3602uy2.f20676f);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.a70
    /* JADX INFO: renamed from: i */
    public final synchronized void mo5699i() {
        if (this.f22441l.compareAndSet(false, true)) {
            this.f22435f.m8526a(this);
            m8912b();
        }
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p282z.p283a.InterfaceC2235r
    /* JADX INFO: renamed from: i1 */
    public final synchronized void mo4701i1() {
        this.f22442m.f22134b = true;
        m8912b();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ip2
    /* JADX INFO: renamed from: q0 */
    public final synchronized void mo6352q0(hp2 hp2Var) {
        C3750yy c3750yy = this.f22442m;
        c3750yy.f22133a = hp2Var.f14934j;
        c3750yy.f22137e = hp2Var;
        m8912b();
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p282z.p283a.InterfaceC2235r
    /* JADX INFO: renamed from: r0 */
    public final void mo4702r0() {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.b70
    /* JADX INFO: renamed from: t */
    public final synchronized void mo5930t(Context context) {
        this.f22442m.f22136d = "u";
        m8912b();
        m8913c();
        this.f22443n = true;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.b70
    /* JADX INFO: renamed from: v */
    public final synchronized void mo5931v(Context context) {
        this.f22442m.f22134b = false;
        m8912b();
    }
}
