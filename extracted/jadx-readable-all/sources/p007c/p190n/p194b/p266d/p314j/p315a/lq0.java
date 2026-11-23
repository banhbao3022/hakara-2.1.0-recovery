package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2311z0;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.InterfaceC2305w0;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class lq0 {

    /* JADX INFO: renamed from: d */
    public final long f16445d;

    /* JADX INFO: renamed from: f */
    public final Context f16447f;

    /* JADX INFO: renamed from: g */
    public final WeakReference<Context> f16448g;

    /* JADX INFO: renamed from: h */
    public final mm0 f16449h;

    /* JADX INFO: renamed from: i */
    public final Executor f16450i;

    /* JADX INFO: renamed from: j */
    public final Executor f16451j;

    /* JADX INFO: renamed from: k */
    public final ScheduledExecutorService f16452k;

    /* JADX INFO: renamed from: l */
    public final yo0 f16453l;

    /* JADX INFO: renamed from: m */
    public final C3702xn f16454m;

    /* JADX INFO: renamed from: n */
    public final Map<String, C3762z9> f16455n;

    /* JADX INFO: renamed from: o */
    public final nb0 f16456o;

    /* JADX INFO: renamed from: p */
    public boolean f16457p;

    /* JADX INFO: renamed from: a */
    public boolean f16442a = false;

    /* JADX INFO: renamed from: b */
    public boolean f16443b = false;

    /* JADX INFO: renamed from: c */
    public boolean f16444c = false;

    /* JADX INFO: renamed from: e */
    public final C3147io<Boolean> f16446e = new C3147io<>();

    public lq0(Executor executor, Context context, WeakReference<Context> weakReference, Executor executor2, mm0 mm0Var, ScheduledExecutorService scheduledExecutorService, yo0 yo0Var, C3702xn c3702xn, nb0 nb0Var) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f16455n = concurrentHashMap;
        this.f16457p = true;
        this.f16449h = mm0Var;
        this.f16447f = context;
        this.f16448g = weakReference;
        this.f16450i = executor2;
        this.f16452k = scheduledExecutorService;
        this.f16451j = executor;
        this.f16453l = yo0Var;
        this.f16454m = c3702xn;
        this.f16456o = nb0Var;
        this.f16445d = C2330u.f10884a.f10896k.mo5621a();
        concurrentHashMap.put("com.google.android.gms.ads.MobileAds", new C3762z9("com.google.android.gms.ads.MobileAds", false, 0, ""));
    }

    /* JADX INFO: renamed from: c */
    public static void m7601c(lq0 lq0Var, String str, boolean z, String str2, int i) {
        lq0Var.f16455n.put(str, new C3762z9(str, z, i, str2));
    }

    /* JADX INFO: renamed from: a */
    public final void m7602a() {
        if (!C3534t4.f19760a.m6603d().booleanValue()) {
            int i = this.f16454m.f21617h;
            AbstractC3718y2<Integer> abstractC3718y2 = C3052g3.f14312a1;
            C2862b c2862b = C2862b.f12493a;
            if (i >= ((Integer) c2862b.f12496d.m6596a(abstractC3718y2)).intValue() && this.f16457p) {
                if (this.f16442a) {
                    return;
                }
                synchronized (this) {
                    if (this.f16442a) {
                        return;
                    }
                    this.f16453l.m8814d();
                    this.f16456o.m7108A0(lb0.f16312a);
                    C3147io<Boolean> c3147io = this.f16446e;
                    c3147io.f15328f.mo6230f(new Runnable(this) { // from class: c.n.b.d.j.a.aq0

                        /* JADX INFO: renamed from: f */
                        public final lq0 f12250f;

                        {
                            this.f12250f = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            lq0 lq0Var = this.f12250f;
                            yo0 yo0Var = lq0Var.f16453l;
                            synchronized (yo0Var) {
                                AbstractC3718y2<Boolean> abstractC3718y3 = C3052g3.f14354g1;
                                C2862b c2862b2 = C2862b.f12493a;
                                if (((Boolean) c2862b2.f12496d.m6596a(abstractC3718y3)).booleanValue()) {
                                    if (!((Boolean) c2862b2.f12496d.m6596a(C3052g3.f14351f5)).booleanValue()) {
                                        if (!yo0Var.f21940d) {
                                            Map<String, String> mapM8815e = yo0Var.m8815e();
                                            ((HashMap) mapM8815e).put("action", "init_finished");
                                            yo0Var.f21938b.add(mapM8815e);
                                            Iterator<Map<String, String>> it = yo0Var.f21938b.iterator();
                                            while (it.hasNext()) {
                                                yo0Var.f21942f.m8663a(it.next());
                                            }
                                            yo0Var.f21940d = true;
                                        }
                                    }
                                }
                            }
                            lq0Var.f16456o.m7108A0(mb0.f16711a);
                            lq0Var.f16443b = true;
                        }
                    }, this.f16450i);
                    this.f16442a = true;
                    kv1<String> kv1VarM7604d = m7604d();
                    this.f16452k.schedule(new Runnable(this) { // from class: c.n.b.d.j.a.dq0

                        /* JADX INFO: renamed from: f */
                        public final lq0 f13363f;

                        {
                            this.f13363f = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            lq0 lq0Var = this.f13363f;
                            synchronized (lq0Var) {
                                if (lq0Var.f16444c) {
                                    return;
                                }
                                lq0Var.f16455n.put("com.google.android.gms.ads.MobileAds", new C3762z9("com.google.android.gms.ads.MobileAds", false, (int) (C2330u.f10884a.f10896k.mo5621a() - lq0Var.f16445d), "Timeout."));
                                lq0Var.f16446e.m7287b(new Exception());
                            }
                        }
                    }, ((Long) c2862b.f12496d.m6596a(C3052g3.f14326c1)).longValue(), TimeUnit.SECONDS);
                    jq0 jq0Var = new jq0(this);
                    kv1VarM7604d.mo6230f(new ev1(kv1VarM7604d, jq0Var), this.f16450i);
                    return;
                }
            }
        }
        if (this.f16442a) {
            return;
        }
        this.f16455n.put("com.google.android.gms.ads.MobileAds", new C3762z9("com.google.android.gms.ads.MobileAds", true, 0, ""));
        this.f16446e.m7286a(Boolean.FALSE);
        this.f16442a = true;
        this.f16443b = true;
    }

    /* JADX INFO: renamed from: b */
    public final List<C3762z9> m7603b() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.f16455n.keySet()) {
            C3762z9 c3762z9 = this.f16455n.get(str);
            arrayList.add(new C3762z9(str, c3762z9.f22199g, c3762z9.f22200h, c3762z9.f22201i));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public final synchronized kv1<String> m7604d() {
        C2330u c2330u = C2330u.f10884a;
        String str = ((C2311z0) c2330u.f10893h.m6649f()).mo4818p().f12217e;
        if (!TextUtils.isEmpty(str)) {
            return cw0.m6231a(str);
        }
        final C3147io c3147io = new C3147io();
        InterfaceC2305w0 interfaceC2305w0M6649f = c2330u.f10893h.m6649f();
        ((C2311z0) interfaceC2305w0M6649f).f10807c.add(new Runnable(this, c3147io) { // from class: c.n.b.d.j.a.cq0

            /* JADX INFO: renamed from: f */
            public final lq0 f13080f;

            /* JADX INFO: renamed from: g */
            public final C3147io f13081g;

            {
                this.f13080f = this;
                this.f13081g = c3147io;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final lq0 lq0Var = this.f13080f;
                final C3147io c3147io2 = this.f13081g;
                lq0Var.f16450i.execute(new Runnable(lq0Var, c3147io2) { // from class: c.n.b.d.j.a.hq0

                    /* JADX INFO: renamed from: f */
                    public final C3147io f14937f;

                    {
                        this.f14937f = c3147io2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C3147io c3147io3 = this.f14937f;
                        String str2 = ((C2311z0) C2330u.f10884a.f10893h.m6649f()).mo4818p().f12217e;
                        if (TextUtils.isEmpty(str2)) {
                            c3147io3.m7287b(new Exception());
                        } else {
                            c3147io3.m7286a(str2);
                        }
                    }
                });
            }
        });
        return c3147io;
    }

    /* JADX INFO: renamed from: e */
    public final void m7605e(String str, boolean z, String str2, int i) {
        this.f16455n.put(str, new C3762z9(str, z, i, str2));
    }
}
