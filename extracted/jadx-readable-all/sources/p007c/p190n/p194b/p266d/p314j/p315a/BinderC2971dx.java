package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2256e;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2267h1;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2277l;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2311z0;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.InterfaceC2305w0;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: renamed from: c.n.b.d.j.a.dx */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC2971dx extends AbstractBinderC3197k0 {

    /* JADX INFO: renamed from: f */
    public final Context f13409f;

    /* JADX INFO: renamed from: g */
    public final C3702xn f13410g;

    /* JADX INFO: renamed from: h */
    public final mm0 f13411h;

    /* JADX INFO: renamed from: i */
    public final dx0<vi1, zy0> f13412i;

    /* JADX INFO: renamed from: j */
    public final e31 f13413j;

    /* JADX INFO: renamed from: k */
    public final lq0 f13414k;

    /* JADX INFO: renamed from: l */
    public final C2885bm f13415l;

    /* JADX INFO: renamed from: m */
    public final rm0 f13416m;

    /* JADX INFO: renamed from: n */
    public final br0 f13417n;

    /* JADX INFO: renamed from: o */
    public boolean f13418o = false;

    public BinderC2971dx(Context context, C3702xn c3702xn, mm0 mm0Var, dx0<vi1, zy0> dx0Var, e31 e31Var, lq0 lq0Var, C2885bm c2885bm, rm0 rm0Var, br0 br0Var) {
        this.f13409f = context;
        this.f13410g = c3702xn;
        this.f13411h = mm0Var;
        this.f13412i = dx0Var;
        this.f13413j = e31Var;
        this.f13414k = lq0Var;
        this.f13415l = c2885bm;
        this.f13416m = rm0Var;
        this.f13417n = br0Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3234l0
    /* JADX INFO: renamed from: C1 */
    public final void mo6537C1(InterfaceC3059ga interfaceC3059ga) throws RemoteException {
        lq0 lq0Var = this.f13414k;
        C3147io<Boolean> c3147io = lq0Var.f16446e;
        c3147io.f15328f.mo6230f(new zp0(lq0Var, interfaceC3059ga), lq0Var.f16451j);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3234l0
    /* JADX INFO: renamed from: I */
    public final void mo6538I(String str) {
        this.f13413j.m6598a(str);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3234l0
    /* JADX INFO: renamed from: K4 */
    public final synchronized void mo6539K4(String str) {
        C3052g3.m6922a(this.f13409f);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14294X1)).booleanValue()) {
                C2330u.f10884a.f10897l.m4845a(this.f13409f, this.f13410g, true, null, str, null, null);
            }
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3234l0
    /* JADX INFO: renamed from: T2 */
    public final void mo6540T2(C3125i2 c3125i2) throws RemoteException {
        C2885bm c2885bm = this.f13415l;
        Context context = this.f13409f;
        Objects.requireNonNull(c2885bm);
        C3070gl c3070glMo6202b = AbstractC2923cm.m6200d(context).mo6202b();
        c3070glMo6202b.f14609b.m6635a(-1, c3070glMo6202b.f14608a.mo5623c());
        if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14339e0)).booleanValue() && c2885bm.m6048f(context) && C2885bm.m6042m(context)) {
            synchronized (c2885bm.f12743l) {
            }
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3234l0
    /* JADX INFO: renamed from: X1 */
    public final void mo6541X1(InterfaceC2799a interfaceC2799a, String str) {
        if (interfaceC2799a == null) {
            C2622l.m5408n3("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) BinderC2800b.m5639T1(interfaceC2799a);
        if (context == null) {
            C2622l.m5408n3("Context is null. Failed to open debug menu.");
            return;
        }
        C2277l c2277l = new C2277l(context);
        c2277l.f10735c = str;
        c2277l.f10736d = this.f13410g.f21615f;
        c2277l.m4788b();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3234l0
    /* JADX INFO: renamed from: Y3 */
    public final void mo6542Y3(InterfaceC3395pd interfaceC3395pd) throws RemoteException {
        this.f13411h.f16797b.compareAndSet(null, interfaceC3395pd);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3234l0
    /* JADX INFO: renamed from: Z1 */
    public final synchronized void mo6543Z1(float f) {
        C2256e c2256e = C2330u.f10884a.f10894i;
        synchronized (c2256e) {
            c2256e.f10702b = f;
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3234l0
    /* JADX INFO: renamed from: Z5 */
    public final void mo6544Z5(InterfaceC3605v0 interfaceC3605v0) throws RemoteException {
        this.f13417n.m6074c(interfaceC3605v0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3234l0
    /* JADX INFO: renamed from: c */
    public final synchronized void mo6545c() {
        if (this.f13418o) {
            C2622l.m5226A3("Mobile ads is initialized already.");
            return;
        }
        C3052g3.m6922a(this.f13409f);
        C2330u c2330u = C2330u.f10884a;
        c2330u.f10893h.m6645b(this.f13409f, this.f13410g);
        c2330u.f10895j.m7159a(this.f13409f);
        this.f13418o = true;
        this.f13414k.m7602a();
        final e31 e31Var = this.f13413j;
        Objects.requireNonNull(e31Var);
        InterfaceC2305w0 interfaceC2305w0M6649f = c2330u.f10893h.m6649f();
        ((C2311z0) interfaceC2305w0M6649f).f10807c.add(new Runnable(e31Var) { // from class: c.n.b.d.j.a.b31

            /* JADX INFO: renamed from: f */
            public final e31 f12511f;

            {
                this.f12511f = e31Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final e31 e31Var2 = this.f12511f;
                e31Var2.f13477c.execute(new Runnable(e31Var2) { // from class: c.n.b.d.j.a.d31

                    /* JADX INFO: renamed from: f */
                    public final e31 f13171f;

                    {
                        this.f13171f = e31Var2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f13171f.m6599b();
                    }
                });
            }
        });
        e31Var.f13477c.execute(new Runnable(e31Var) { // from class: c.n.b.d.j.a.c31

            /* JADX INFO: renamed from: f */
            public final e31 f12931f;

            {
                this.f12931f = e31Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f12931f.m6599b();
            }
        });
        if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14300Y1)).booleanValue()) {
            final rm0 rm0Var = this.f13416m;
            Objects.requireNonNull(rm0Var);
            InterfaceC2305w0 interfaceC2305w0M6649f2 = c2330u.f10893h.m6649f();
            ((C2311z0) interfaceC2305w0M6649f2).f10807c.add(new Runnable(rm0Var) { // from class: c.n.b.d.j.a.om0

                /* JADX INFO: renamed from: f */
                public final rm0 f17677f;

                {
                    this.f17677f = rm0Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    final rm0 rm0Var2 = this.f17677f;
                    rm0Var2.f18952c.execute(new Runnable(rm0Var2) { // from class: c.n.b.d.j.a.qm0

                        /* JADX INFO: renamed from: f */
                        public final rm0 f18379f;

                        {
                            this.f18379f = rm0Var2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f18379f.m8296a();
                        }
                    });
                }
            });
            rm0Var.f18952c.execute(new Runnable(rm0Var) { // from class: c.n.b.d.j.a.pm0

                /* JADX INFO: renamed from: f */
                public final rm0 f18029f;

                {
                    this.f18029f = rm0Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f18029f.m8296a();
                }
            });
        }
        this.f13417n.m6072a();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3234l0
    /* JADX INFO: renamed from: g2 */
    public final void mo6546g2(String str, InterfaceC2799a interfaceC2799a) {
        String strM4738H;
        Runnable runnable;
        C3052g3.m6922a(this.f13409f);
        AbstractC3718y2<Boolean> abstractC3718y2 = C3052g3.f14313a2;
        C2862b c2862b = C2862b.f12493a;
        if (((Boolean) c2862b.f12496d.m6596a(abstractC3718y2)).booleanValue()) {
            C2267h1 c2267h1 = C2330u.f10884a.f10889d;
            strM4738H = C2267h1.m4738H(this.f13409f);
        } else {
            strM4738H = "";
        }
        boolean z = true;
        String str2 = true != TextUtils.isEmpty(strM4738H) ? strM4738H : str;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        boolean zBooleanValue = ((Boolean) c2862b.f12496d.m6596a(C3052g3.f14294X1)).booleanValue();
        AbstractC3718y2<Boolean> abstractC3718y3 = C3052g3.f14465w0;
        boolean zBooleanValue2 = zBooleanValue | ((Boolean) c2862b.f12496d.m6596a(abstractC3718y3)).booleanValue();
        if (((Boolean) c2862b.f12496d.m6596a(abstractC3718y3)).booleanValue()) {
            final Runnable runnable2 = (Runnable) BinderC2800b.m5639T1(interfaceC2799a);
            runnable = new Runnable(this, runnable2) { // from class: c.n.b.d.j.a.bx

                /* JADX INFO: renamed from: f */
                public final BinderC2971dx f12887f;

                /* JADX INFO: renamed from: g */
                public final Runnable f12888g;

                {
                    this.f12887f = this;
                    this.f12888g = runnable2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    final BinderC2971dx binderC2971dx = this.f12887f;
                    final Runnable runnable3 = this.f12888g;
                    C2962do.f13334e.execute(new Runnable(binderC2971dx, runnable3) { // from class: c.n.b.d.j.a.cx

                        /* JADX INFO: renamed from: f */
                        public final BinderC2971dx f13138f;

                        /* JADX INFO: renamed from: g */
                        public final Runnable f13139g;

                        {
                            this.f13138f = binderC2971dx;
                            this.f13139g = runnable3;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.lang.Runnable
                        public final void run() {
                            BinderC2971dx binderC2971dx2 = this.f13138f;
                            Runnable runnable4 = this.f13139g;
                            Objects.requireNonNull(binderC2971dx2);
                            C2622l.m5354d("Adapters must be initialized on the main thread.");
                            Map<String, C3173jd> map = ((C2311z0) C2330u.f10884a.f10893h.m6649f()).mo4818p().f12215c;
                            if (map.isEmpty()) {
                                return;
                            }
                            if (runnable4 != null) {
                                try {
                                    runnable4.run();
                                } catch (Throwable th) {
                                    C2622l.m5241D3("Could not initialize rewarded ads.", th);
                                    return;
                                }
                            }
                            if (binderC2971dx2.f13411h.f16797b.get() != null) {
                                HashMap map2 = new HashMap();
                                Iterator<C3173jd> it = map.values().iterator();
                                while (it.hasNext()) {
                                    for (C3136id c3136id : it.next().f15562a) {
                                        String str3 = c3136id.f15148g;
                                        for (String str4 : c3136id.f15142a) {
                                            if (!map2.containsKey(str4)) {
                                                map2.put(str4, new ArrayList());
                                            }
                                            if (str3 != null) {
                                                ((Collection) map2.get(str4)).add(str3);
                                            }
                                        }
                                    }
                                }
                                JSONObject jSONObject = new JSONObject();
                                for (Map.Entry entry : map2.entrySet()) {
                                    String str5 = (String) entry.getKey();
                                    try {
                                        ex0<vi1, ListenerT> ex0VarMo6274a = binderC2971dx2.f13412i.mo6274a(str5, jSONObject);
                                        if (ex0VarMo6274a != 0) {
                                            vi1 vi1Var = (vi1) ex0VarMo6274a.f13744b;
                                            if (!vi1Var.m8559a()) {
                                                try {
                                                    if (vi1Var.f20804a.mo7826N()) {
                                                        try {
                                                            vi1Var.f20804a.mo7839d3(new BinderC2800b(binderC2971dx2.f13409f), (zy0) ex0VarMo6274a.f13745c, (List) entry.getValue());
                                                            String strValueOf = String.valueOf(str5);
                                                            C2622l.m5318U2(strValueOf.length() != 0 ? "Initialized rewarded video mediation adapter ".concat(strValueOf) : new String("Initialized rewarded video mediation adapter "));
                                                        } catch (Throwable th2) {
                                                            throw new mi1(th2);
                                                        }
                                                    }
                                                } catch (Throwable th3) {
                                                    throw new mi1(th3);
                                                }
                                            }
                                        }
                                    } catch (mi1 e) {
                                        StringBuilder sb = new StringBuilder(String.valueOf(str5).length() + 56);
                                        sb.append("Failed to initialize rewarded video mediation adapter \"");
                                        sb.append(str5);
                                        sb.append("\"");
                                        C2622l.m5241D3(sb.toString(), e);
                                    }
                                }
                            }
                        }
                    });
                }
            };
        } else {
            runnable = null;
            z = zBooleanValue2;
        }
        Runnable runnable3 = runnable;
        if (z) {
            C2330u.f10884a.f10897l.m4845a(this.f13409f, this.f13410g, true, null, str2, null, runnable3);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3234l0
    /* JADX INFO: renamed from: j */
    public final synchronized boolean mo6547j() {
        return C2330u.f10884a.f10894i.m4733b();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3234l0
    /* JADX INFO: renamed from: k */
    public final synchronized float mo6548k() {
        return C2330u.f10884a.f10894i.m4732a();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3234l0
    /* JADX INFO: renamed from: l */
    public final List<C3762z9> mo6549l() throws RemoteException {
        return this.f13414k.m7603b();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3234l0
    /* JADX INFO: renamed from: m */
    public final String mo6550m() {
        return this.f13410g.f21615f;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3234l0
    /* JADX INFO: renamed from: q */
    public final void mo6551q() {
        this.f13414k.f16457p = false;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3234l0
    /* JADX INFO: renamed from: v0 */
    public final synchronized void mo6552v0(boolean z) {
        C2256e c2256e = C2330u.f10884a.f10894i;
        synchronized (c2256e) {
            c2256e.f10701a = z;
        }
    }
}
