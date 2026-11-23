package p007c.p190n.p194b.p266d.p290d;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import p007c.p190n.p194b.p266d.p290d.p295s.C2518b;
import p007c.p190n.p194b.p266d.p290d.p295s.C2532h0;
import p007c.p190n.p194b.p266d.p290d.p295s.C2535j;
import p007c.p190n.p194b.p266d.p290d.p295s.InterfaceC2527f;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p299o.C2628a;
import p007c.p190n.p194b.p266d.p298f.p299o.C2629b;
import p007c.p190n.p194b.p266d.p298f.p299o.C2631d;
import p007c.p190n.p194b.p266d.p298f.p299o.p300n.AbstractC2687r;
import p007c.p190n.p194b.p266d.p298f.p299o.p300n.C2643a1;
import p007c.p190n.p194b.p266d.p298f.p299o.p300n.C2659g;
import p007c.p190n.p194b.p266d.p298f.p299o.p300n.C2666i0;
import p007c.p190n.p194b.p266d.p298f.p299o.p300n.C2671k;
import p007c.p190n.p194b.p266d.p298f.p302q.C2714b;
import p007c.p190n.p194b.p266d.p314j.p320f.HandlerC4025w;
import p007c.p190n.p194b.p266d.p333n.AbstractC4781i;
import p007c.p190n.p194b.p266d.p333n.C4782j;

/* JADX INFO: renamed from: c.n.b.d.d.a0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UseSparseArrays"})
public final class C2372a0 extends C2631d<C2383e.b> implements InterfaceC2415o1 {

    /* JADX INFO: renamed from: j */
    public static final C2518b f10968j = new C2518b("CastClient");

    /* JADX INFO: renamed from: k */
    public static final C2628a.a<C2532h0, C2383e.b> f10969k;

    /* JADX INFO: renamed from: l */
    public static final C2628a<C2383e.b> f10970l;

    /* JADX INFO: renamed from: A */
    public int f10971A;

    /* JADX INFO: renamed from: B */
    public int f10972B;

    /* JADX INFO: renamed from: C */
    public C2565x f10973C;

    /* JADX INFO: renamed from: D */
    public final CastDevice f10974D;

    /* JADX INFO: renamed from: E */
    public final Map<Long, C4782j<Void>> f10975E;

    /* JADX INFO: renamed from: F */
    public final Map<String, C2383e.d> f10976F;

    /* JADX INFO: renamed from: G */
    public final C2383e.c f10977G;

    /* JADX INFO: renamed from: H */
    public final List<C2418p1> f10978H;

    /* JADX INFO: renamed from: m */
    public final BinderC2405l0 f10979m;

    /* JADX INFO: renamed from: n */
    public final Handler f10980n;

    /* JADX INFO: renamed from: o */
    public int f10981o;

    /* JADX INFO: renamed from: p */
    public boolean f10982p;

    /* JADX INFO: renamed from: q */
    public boolean f10983q;

    /* JADX INFO: renamed from: r */
    public C4782j<C2383e.a> f10984r;

    /* JADX INFO: renamed from: s */
    public C4782j<Status> f10985s;

    /* JADX INFO: renamed from: t */
    public final AtomicLong f10986t;

    /* JADX INFO: renamed from: u */
    public final Object f10987u;

    /* JADX INFO: renamed from: v */
    public final Object f10988v;

    /* JADX INFO: renamed from: w */
    public C2380d f10989w;

    /* JADX INFO: renamed from: x */
    public String f10990x;

    /* JADX INFO: renamed from: y */
    public double f10991y;

    /* JADX INFO: renamed from: z */
    public boolean f10992z;

    static {
        C2396i0 c2396i0 = new C2396i0();
        f10969k = c2396i0;
        f10970l = new C2628a<>("Cast.API_CXLESS", c2396i0, C2535j.f11423b);
    }

    public C2372a0(Context context, C2383e.b bVar) {
        super(context, f10970l, bVar, C2631d.a.f11619a);
        this.f10979m = new BinderC2405l0(this);
        this.f10987u = new Object();
        this.f10988v = new Object();
        this.f10978H = new ArrayList();
        C2622l.m5379i(context, "context cannot be null");
        C2622l.m5379i(bVar, "CastOptions cannot be null");
        this.f10977G = bVar.f11019g;
        this.f10974D = bVar.f11018f;
        this.f10975E = new HashMap();
        this.f10976F = new HashMap();
        this.f10986t = new AtomicLong(0L);
        this.f10981o = 1;
        m4949m();
        this.f10980n = new HandlerC4025w(this.f11614e);
    }

    /* JADX INFO: renamed from: f */
    public static void m4940f(C2372a0 c2372a0, long j2, int i) {
        C4782j<Void> c4782j;
        synchronized (c2372a0.f10975E) {
            c4782j = c2372a0.f10975E.get(Long.valueOf(j2));
            c2372a0.f10975E.remove(Long.valueOf(j2));
        }
        if (c4782j != null) {
            if (i == 0) {
                c4782j.f24683a.m10944q(null);
            } else {
                c4782j.f24683a.m10943p(m4942k(i));
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m4941h(C2372a0 c2372a0, int i) {
        synchronized (c2372a0.f10988v) {
            C4782j<Status> c4782j = c2372a0.f10985s;
            if (c4782j == null) {
                return;
            }
            if (i == 0) {
                c4782j.f24683a.m10944q(new Status(i));
            } else {
                c4782j.f24683a.m10943p(m4942k(i));
            }
            c2372a0.f10985s = null;
        }
    }

    /* JADX INFO: renamed from: k */
    public static C2629b m4942k(int i) {
        return C2714b.m5564a(new Status(i));
    }

    /* JADX INFO: renamed from: d */
    public final void m4943d() {
        C2622l.m5389k(this.f10981o == 2, "Not connected to device");
    }

    /* JADX INFO: renamed from: e */
    public final AbstractC4781i<Boolean> m4944e(InterfaceC2527f interfaceC2527f) {
        Looper looper = this.f11614e;
        C2622l.m5379i(interfaceC2527f, "Listener must not be null");
        C2622l.m5379i(looper, "Looper must not be null");
        C2622l.m5379i("castDeviceControllerListenerKey", "Listener type must not be null");
        C2671k.a<L> aVar = new C2671k(looper, interfaceC2527f, "castDeviceControllerListenerKey").f11717b;
        C2622l.m5379i(aVar, "Key must not be null");
        C2622l.m5379i(aVar, "Listener key cannot be null.");
        C2659g c2659g = this.f11618i;
        Objects.requireNonNull(c2659g);
        C4782j c4782j = new C4782j();
        C2643a1 c2643a1 = new C2643a1(aVar, c4782j);
        Handler handler = c2659g.f11672t;
        handler.sendMessage(handler.obtainMessage(13, new C2666i0(c2643a1, c2659g.f11667o.get(), this)));
        return c4782j.f24683a;
    }

    /* JADX INFO: renamed from: g */
    public final void m4945g(C4782j<C2383e.a> c4782j) {
        synchronized (this.f10987u) {
            if (this.f10984r != null) {
                m4947j(2002);
            }
            this.f10984r = c4782j;
        }
    }

    /* JADX INFO: renamed from: i */
    public final AbstractC4781i<Void> m4946i() {
        AbstractC2687r.a aVarM5551a = AbstractC2687r.m5551a();
        aVarM5551a.f11748a = C2381d0.f11016a;
        AbstractC4781i abstractC4781iM5487c = m5487c(1, aVarM5551a.m5553a());
        m4948l();
        m4944e(this.f10979m);
        return abstractC4781iM5487c;
    }

    /* JADX INFO: renamed from: j */
    public final void m4947j(int i) {
        synchronized (this.f10987u) {
            C4782j<C2383e.a> c4782j = this.f10984r;
            if (c4782j != null) {
                c4782j.f24683a.m10943p(m4942k(i));
            }
            this.f10984r = null;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m4948l() {
        f10968j.m5119a("removing all MessageReceivedCallbacks", new Object[0]);
        synchronized (this.f10976F) {
            this.f10976F.clear();
        }
    }

    /* JADX INFO: renamed from: m */
    public final double m4949m() {
        if (this.f10974D.m12647K(2048)) {
            return 0.02d;
        }
        return (!this.f10974D.m12647K(4) || this.f10974D.m12647K(1) || "Chromecast Audio".equals(this.f10974D.f28549j)) ? 0.05d : 0.02d;
    }
}
