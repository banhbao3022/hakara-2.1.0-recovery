package p007c.p190n.p194b.p367f.p368a.p370b;

import android.os.Handler;
import android.os.Looper;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import p007c.p190n.p194b.p367f.p368a.p372c.C5076c;
import p007c.p190n.p194b.p367f.p368a.p373d.C5089f;
import p007c.p190n.p194b.p367f.p368a.p373d.InterfaceC5086d0;
import p007c.p190n.p194b.p367f.p368a.p376g.C5136a;
import p007c.p190n.p194b.p367f.p368a.p377h.AbstractC5141e;
import p007c.p190n.p194b.p367f.p368a.p377h.InterfaceC5139c;

/* JADX INFO: renamed from: c.n.b.f.a.b.c2 */
/* JADX INFO: loaded from: classes.dex */
public final class C4989c2 {

    /* JADX INFO: renamed from: a */
    public static final C5089f f25715a = new C5089f("AssetPackManager");

    /* JADX INFO: renamed from: b */
    public final C5056u f25716b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5086d0<InterfaceC5037o2> f25717c;

    /* JADX INFO: renamed from: d */
    public final C5046r f25718d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC5086d0<Executor> f25719e;

    public C4989c2(C5056u c5056u, InterfaceC5086d0<InterfaceC5037o2> interfaceC5086d0, C5046r c5046r, C5136a c5136a, C5066x0 c5066x0, C5027m0 c5027m0, C4991d0 c4991d0, InterfaceC5086d0<Executor> interfaceC5086d1, C5076c c5076c) {
        new Handler(Looper.getMainLooper());
        this.f25716b = c5056u;
        this.f25717c = interfaceC5086d0;
        this.f25718d = c5046r;
        this.f25719e = interfaceC5086d1;
    }

    /* JADX INFO: renamed from: a */
    public final void m11430a(boolean z) {
        boolean z2;
        C5046r c5046r = this.f25718d;
        synchronized (c5046r) {
            z2 = c5046r.f26081e != null;
        }
        C5046r c5046r2 = this.f25718d;
        synchronized (c5046r2) {
            c5046r2.f26082f = z;
            c5046r2.m11559b();
        }
        if (!z || z2) {
            return;
        }
        this.f25719e.m11529a().execute(new Runnable(this) { // from class: c.n.b.f.a.b.z1

            /* JADX INFO: renamed from: f */
            public final C4989c2 f26032f;

            {
                this.f26032f = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C4989c2 c4989c2 = this.f26032f;
                AbstractC5141e<List<String>> abstractC5141eMo11438f = c4989c2.f25717c.m11529a().mo11438f(c4989c2.f25716b.m11492i());
                Executor executorM11529a = c4989c2.f25719e.m11529a();
                C5056u c5056u = c4989c2.f25716b;
                c5056u.getClass();
                abstractC5141eMo11438f.mo11564b(executorM11529a, new InterfaceC5139c(c5056u) { // from class: c.n.b.f.a.b.a2

                    /* JADX INFO: renamed from: a */
                    public final C5056u f25702a;

                    {
                        this.f25702a = c5056u;
                    }

                    @Override // p007c.p190n.p194b.p367f.p368a.p377h.InterfaceC5139c
                    /* JADX INFO: renamed from: a */
                    public final void mo11421a(Object obj) {
                        C5056u c5056u2 = this.f25702a;
                        List list = (List) obj;
                        int iM11467a = c5056u2.f25975e.m11467a();
                        for (File file : (ArrayList) c5056u2.m11488d()) {
                            if (!list.contains(file.getName()) && C5056u.m11485c(file, true) != iM11467a) {
                                C5056u.m11486h(file);
                            }
                        }
                    }
                });
                abstractC5141eMo11438f.mo11563a(c4989c2.f25719e.m11529a(), C4985b2.f25708a);
            }
        });
    }
}
