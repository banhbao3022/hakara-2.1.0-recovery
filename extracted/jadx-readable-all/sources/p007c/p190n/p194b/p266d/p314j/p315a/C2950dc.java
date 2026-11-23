package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import com.facebook.stetho.common.Utf8Charset;
import java.util.Objects;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2267h1;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2284n0;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.InterfaceC2298t;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.dc */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2950dc {

    /* JADX INFO: renamed from: b */
    public final Context f13225b;

    /* JADX INFO: renamed from: c */
    public final String f13226c;

    /* JADX INFO: renamed from: d */
    public final C3702xn f13227d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC2298t<InterfaceC3689xa> f13228e;

    /* JADX INFO: renamed from: f */
    public C2913cc f13229f;

    /* JADX INFO: renamed from: a */
    public final Object f13224a = new Object();

    /* JADX INFO: renamed from: g */
    public int f13230g = 1;

    public C2950dc(Context context, C3702xn c3702xn, String str, InterfaceC2298t<InterfaceC3689xa> interfaceC2298t, InterfaceC2298t<InterfaceC3689xa> interfaceC2298t2) {
        this.f13226c = str;
        this.f13225b = context.getApplicationContext();
        this.f13227d = c3702xn;
        this.f13228e = interfaceC2298t2;
    }

    /* JADX INFO: renamed from: a */
    public final C2913cc m6349a(rd2 rd2Var) {
        final C2913cc c2913cc = new C2913cc(this.f13228e);
        C2962do.f13334e.execute(new Runnable(this, c2913cc) { // from class: c.n.b.d.j.a.hb

            /* JADX INFO: renamed from: f */
            public final C2950dc f14799f;

            /* JADX INFO: renamed from: g */
            public final C2913cc f14800g;

            {
                this.f14799f = this;
                this.f14800g = c2913cc;
            }

            /* JADX WARN: Type inference failed for: r3v7, types: [T, c.n.b.d.j.a.pb, c.n.b.d.j.a.r8] */
            @Override // java.lang.Runnable
            public final void run() {
                C2950dc c2950dc = this.f14799f;
                C2913cc c2913cc2 = this.f14800g;
                Objects.requireNonNull(c2950dc);
                try {
                    final C3023fb c3023fb = new C3023fb(c2950dc.f13225b, c2950dc.f13227d, null, null);
                    ((C3670ws) c3023fb.f14003f.mo6459O0()).f21332n = new InterfaceC2893bu(new C3208kb(c2950dc, c2913cc2, c3023fb)) { // from class: c.n.b.d.j.a.db

                        /* JADX INFO: renamed from: a */
                        public final C3208kb f13201a;

                        {
                            this.f13201a = c3208kb;
                        }

                        @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2893bu
                        /* JADX INFO: renamed from: a */
                        public final void mo6099a() {
                            C3208kb c3208kb = this.f13201a;
                            final C2950dc c2950dc2 = c3208kb.f15909a;
                            final C2913cc c2913cc3 = c3208kb.f15910b;
                            final InterfaceC3689xa interfaceC3689xa = c3208kb.f15911c;
                            C2267h1.f10713a.postDelayed(new Runnable(c2950dc2, c2913cc3, interfaceC3689xa) { // from class: c.n.b.d.j.a.lb

                                /* JADX INFO: renamed from: f */
                                public final C2950dc f16309f;

                                /* JADX INFO: renamed from: g */
                                public final C2913cc f16310g;

                                /* JADX INFO: renamed from: h */
                                public final InterfaceC3689xa f16311h;

                                {
                                    this.f16309f = c2950dc2;
                                    this.f16310g = c2913cc3;
                                    this.f16311h = interfaceC3689xa;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    C2950dc c2950dc3 = this.f16309f;
                                    C2913cc c2913cc4 = this.f16310g;
                                    final InterfaceC3689xa interfaceC3689xa2 = this.f16311h;
                                    synchronized (c2950dc3.f13224a) {
                                        if (c2913cc4.m8130c() != -1 && c2913cc4.m8130c() != 1) {
                                            c2913cc4.m8129b();
                                            C2962do.f13334e.execute(new Runnable(interfaceC3689xa2) { // from class: c.n.b.d.j.a.nb

                                                /* JADX INFO: renamed from: f */
                                                public final InterfaceC3689xa f17063f;

                                                {
                                                    this.f17063f = interfaceC3689xa2;
                                                }

                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    this.f17063f.mo6786i();
                                                }
                                            });
                                            C2096e.m4590z("Could not receive loaded message in a timely manner. Rejecting.");
                                        }
                                    }
                                }
                            }, 10000L);
                        }
                    };
                    c3023fb.f14003f.mo6479f0("/jsLoaded", new C2986eb(c3023fb, new C3356ob(c2950dc, c2913cc2, c3023fb)));
                    C2284n0 c2284n0 = new C2284n0();
                    ?? c3393pb = new C3393pb(c2950dc, c3023fb, c2284n0);
                    c2284n0.f10754a = c3393pb;
                    c3023fb.f14003f.mo6479f0("/requestReload", new C2986eb(c3023fb, c3393pb));
                    if (c2950dc.f13226c.endsWith(".js")) {
                        final String str = String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", c2950dc.f13226c);
                        C3023fb.m6784a(new Runnable(c3023fb, str) { // from class: c.n.b.d.j.a.za

                            /* JADX INFO: renamed from: f */
                            public final C3023fb f22213f;

                            /* JADX INFO: renamed from: g */
                            public final String f22214g;

                            {
                                this.f22213f = c3023fb;
                                this.f22214g = str;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                C3023fb c3023fb2 = this.f22213f;
                                c3023fb2.f14003f.loadData(this.f22214g, "text/html", Utf8Charset.NAME);
                            }
                        });
                    } else if (c2950dc.f13226c.startsWith("<html>")) {
                        C3023fb.m6784a(new Runnable(c3023fb, c2950dc.f13226c) { // from class: c.n.b.d.j.a.ab

                            /* JADX INFO: renamed from: f */
                            public final C3023fb f12055f;

                            /* JADX INFO: renamed from: g */
                            public final String f12056g;

                            {
                                this.f12055f = c3023fb;
                                this.f12056g = str;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                C3023fb c3023fb2 = this.f12055f;
                                c3023fb2.f14003f.loadData(this.f12056g, "text/html", Utf8Charset.NAME);
                            }
                        });
                    } else {
                        C3023fb.m6784a(new Runnable(c3023fb, c2950dc.f13226c) { // from class: c.n.b.d.j.a.bb

                            /* JADX INFO: renamed from: f */
                            public final C3023fb f12552f;

                            /* JADX INFO: renamed from: g */
                            public final String f12553g;

                            {
                                this.f12552f = c3023fb;
                                this.f12553g = str;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                C3023fb c3023fb2 = this.f12552f;
                                c3023fb2.f14003f.loadUrl(this.f12553g);
                            }
                        });
                    }
                    C2267h1.f10713a.postDelayed(new RunnableC3467rb(c2950dc, c2913cc2, c3023fb), 60000L);
                } catch (Throwable th) {
                    C2622l.m5438t3("Error creating webview.", th);
                    C2998en c2998en = C2330u.f10884a.f10893h;
                    C3696xh.m8734c(c2998en.f13616e, c2998en.f13617f).mo8736b(th, "SdkJavascriptFactory.loadJavascriptEngine");
                    c2913cc2.m8129b();
                }
            }
        });
        c2913cc.m8128a(new C3504sb(this, c2913cc), new C3541tb(this, c2913cc));
        return c2913cc;
    }

    /* JADX INFO: renamed from: b */
    public final C3690xb m6350b(rd2 rd2Var) {
        synchronized (this.f13224a) {
            synchronized (this.f13224a) {
                C2913cc c2913cc = this.f13229f;
                if (c2913cc != null && this.f13230g == 0) {
                    c2913cc.m8128a(new InterfaceC3295mo(this) { // from class: c.n.b.d.j.a.ib

                        /* JADX INFO: renamed from: a */
                        public final C2950dc f15132a;

                        {
                            this.f15132a = this;
                        }

                        @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3295mo
                        /* JADX INFO: renamed from: a */
                        public final void mo5960a(Object obj) {
                            C2950dc c2950dc = this.f15132a;
                            Objects.requireNonNull(c2950dc);
                            if (((InterfaceC3689xa) obj).mo6785h()) {
                                c2950dc.f13230g = 1;
                            }
                        }
                    }, C3171jb.f15544a);
                }
            }
            C2913cc c2913cc2 = this.f13229f;
            if (c2913cc2 != null && c2913cc2.m8130c() != -1) {
                int i = this.f13230g;
                if (i == 0) {
                    return this.f13229f.m6163d();
                }
                if (i != 1) {
                    return this.f13229f.m6163d();
                }
                this.f13230g = 2;
                m6349a(null);
                return this.f13229f.m6163d();
            }
            this.f13230g = 2;
            C2913cc c2913ccM6349a = m6349a(null);
            this.f13229f = c2913ccM6349a;
            return c2913ccM6349a.m6163d();
        }
    }
}
