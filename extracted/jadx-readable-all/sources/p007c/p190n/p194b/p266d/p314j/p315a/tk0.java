package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p007c.p190n.p194b.p266d.p267a.p282z.C2312c;
import p007c.p190n.p194b.p266d.p267a.p282z.C2313d;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class tk0 implements Callable<vk0> {

    /* JADX INFO: renamed from: a */
    public final C2312c f19860a;

    /* JADX INFO: renamed from: b */
    public final C2855at f19861b;

    /* JADX INFO: renamed from: c */
    public final Context f19862c;

    /* JADX INFO: renamed from: d */
    public final po0 f19863d;

    /* JADX INFO: renamed from: e */
    public final im1 f19864e;

    /* JADX INFO: renamed from: f */
    public final pw0 f19865f;

    /* JADX INFO: renamed from: g */
    public final Executor f19866g;

    /* JADX INFO: renamed from: h */
    public final rd2 f19867h;

    /* JADX INFO: renamed from: i */
    public final C3702xn f19868i;

    /* JADX INFO: renamed from: j */
    public final bn1 f19869j;

    public tk0(Context context, Executor executor, rd2 rd2Var, C3702xn c3702xn, C2312c c2312c, C2855at c2855at, pw0 pw0Var, bn1 bn1Var, po0 po0Var, im1 im1Var) {
        this.f19862c = context;
        this.f19866g = executor;
        this.f19867h = rd2Var;
        this.f19868i = c3702xn;
        this.f19860a = c2312c;
        this.f19861b = c2855at;
        this.f19865f = pw0Var;
        this.f19869j = bn1Var;
        this.f19863d = po0Var;
        this.f19864e = im1Var;
    }

    @Override // java.util.concurrent.Callable
    public final vk0 call() throws Exception {
        final vk0 vk0Var = new vk0(this);
        synchronized (vk0Var) {
            final Context context = vk0Var.f20813c;
            final C3702xn c3702xn = vk0Var.f20818h;
            final String str = (String) C2862b.f12493a.f12496d.m6596a(C3052g3.f14228M1);
            final rd2 rd2Var = vk0Var.f20817g;
            final C2312c c2312c = vk0Var.f20812b;
            kv1<InterfaceC3410ps> kv1VarM6250t = cw0.m6250t(cw0.m6249s(cw0.m6231a(null), new qu1(context, rd2Var, c3702xn, c2312c, str) { // from class: c.n.b.d.j.a.xs

                /* JADX INFO: renamed from: a */
                public final Context f21664a;

                /* JADX INFO: renamed from: b */
                public final rd2 f21665b;

                /* JADX INFO: renamed from: c */
                public final C3702xn f21666c;

                /* JADX INFO: renamed from: d */
                public final C2312c f21667d;

                /* JADX INFO: renamed from: e */
                public final String f21668e;

                {
                    this.f21664a = context;
                    this.f21665b = rd2Var;
                    this.f21666c = c3702xn;
                    this.f21667d = c2312c;
                    this.f21668e = str;
                }

                @Override // p007c.p190n.p194b.p266d.p314j.p315a.qu1
                /* JADX INFO: renamed from: a */
                public final kv1 mo4612a(Object obj) throws C3781zs {
                    Context context2 = this.f21664a;
                    rd2 rd2Var2 = this.f21665b;
                    C3702xn c3702xn2 = this.f21666c;
                    C2312c c2312c2 = this.f21667d;
                    String str2 = this.f21668e;
                    C2855at c2855at = C2330u.f10884a.f10890e;
                    InterfaceC3410ps interfaceC3410psM5850a = C2855at.m5850a(context2, C3005eu.m6687b(), "", false, false, rd2Var2, null, c3702xn2, null, null, c2312c2, new as2(), null, null);
                    final C3110ho c3110ho = new C3110ho(interfaceC3410psM5850a);
                    C2967dt c2967dt = (C2967dt) interfaceC3410psM5850a;
                    ((C3670ws) c2967dt.mo6459O0()).f21331m = new InterfaceC2856au(c3110ho) { // from class: c.n.b.d.j.a.ys

                        /* JADX INFO: renamed from: f */
                        public final C3110ho f21988f;

                        {
                            this.f21988f = c3110ho;
                        }

                        @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2856au
                        /* JADX INFO: renamed from: B */
                        public final void mo4670B(boolean z) {
                            C3110ho c3110ho2 = this.f21988f;
                            c3110ho2.m7286a(c3110ho2.f14919g);
                        }
                    };
                    c2967dt.f13378f.loadUrl(str2);
                    return c3110ho;
                }
            }, C2962do.f13334e), new cs1(vk0Var) { // from class: c.n.b.d.j.a.jk0

                /* JADX INFO: renamed from: a */
                public final vk0 f15605a;

                {
                    this.f15605a = vk0Var;
                }

                @Override // p007c.p190n.p194b.p266d.p314j.p315a.cs1
                public final Object apply(Object obj) {
                    vk0 vk0Var2 = this.f15605a;
                    InterfaceC3410ps interfaceC3410ps = (InterfaceC3410ps) obj;
                    interfaceC3410ps.mo6479f0("/result", vk0Var2.f20819i);
                    InterfaceC2931cu interfaceC2931cuMo6459O0 = interfaceC3410ps.mo6459O0();
                    qk0 qk0Var = vk0Var2.f20811a;
                    ((C3670ws) interfaceC2931cuMo6459O0).m8676b(null, qk0Var, qk0Var, qk0Var, qk0Var, false, null, new C2313d(vk0Var2.f20813c, null, null), null, null, vk0Var2.f20820j, vk0Var2.f20821k, vk0Var2.f20814d, vk0Var2.f20815e, null);
                    return interfaceC3410ps;
                }
            }, vk0Var.f20816f);
            vk0Var.f20822l = kv1VarM6250t;
            C2622l.m5320V0(kv1VarM6250t, "NativeJavascriptExecutor.initializeEngine");
        }
        return vk0Var;
    }
}
