package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.RemoteException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p636z0.p691g.ArrayMap;

/* JADX INFO: renamed from: c.n.b.d.j.a.lt */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC3263lt extends AbstractBinderC3050g1 {

    /* JADX INFO: renamed from: f */
    public final InterfaceC3704xp f16488f;

    /* JADX INFO: renamed from: h */
    public final boolean f16490h;

    /* JADX INFO: renamed from: i */
    public final boolean f16491i;

    /* JADX INFO: renamed from: j */
    public int f16492j;

    /* JADX INFO: renamed from: k */
    public InterfaceC3198k1 f16493k;

    /* JADX INFO: renamed from: l */
    public boolean f16494l;

    /* JADX INFO: renamed from: n */
    public float f16496n;

    /* JADX INFO: renamed from: o */
    public float f16497o;

    /* JADX INFO: renamed from: p */
    public float f16498p;

    /* JADX INFO: renamed from: q */
    public boolean f16499q;

    /* JADX INFO: renamed from: r */
    public boolean f16500r;

    /* JADX INFO: renamed from: s */
    public C3573u6 f16501s;

    /* JADX INFO: renamed from: g */
    public final Object f16489g = new Object();

    /* JADX INFO: renamed from: m */
    public boolean f16495m = true;

    public BinderC3263lt(InterfaceC3704xp interfaceC3704xp, float f, boolean z, boolean z2) {
        this.f16488f = interfaceC3704xp;
        this.f16496n = f;
        this.f16490h = z;
        this.f16491i = z2;
    }

    /* JADX INFO: renamed from: G6 */
    public final void m7613G6(C3310n2 c3310n2) {
        boolean z = c3310n2.f16998f;
        boolean z2 = c3310n2.f16999g;
        boolean z3 = c3310n2.f17000h;
        synchronized (this.f16489g) {
            this.f16499q = z2;
            this.f16500r = z3;
        }
        String str = true != z ? "0" : "1";
        String str2 = true != z2 ? "0" : "1";
        String str3 = true != z3 ? "0" : "1";
        ArrayMap arrayMap = new ArrayMap(3);
        arrayMap.put("muteStart", str);
        arrayMap.put("customControlsRequested", str2);
        arrayMap.put("clickToExpandRequested", str3);
        m7615I6("initialState", Collections.unmodifiableMap(arrayMap));
    }

    /* JADX INFO: renamed from: H6 */
    public final void m7614H6(float f, float f2, int i, boolean z, float f3) {
        boolean z2;
        boolean z3;
        int i2;
        synchronized (this.f16489g) {
            z2 = true;
            if (f2 == this.f16496n && f3 == this.f16498p) {
                z2 = false;
            }
            this.f16496n = f2;
            this.f16497o = f;
            z3 = this.f16495m;
            this.f16495m = z;
            i2 = this.f16492j;
            this.f16492j = i;
            float f4 = this.f16498p;
            this.f16498p = f3;
            if (Math.abs(f3 - f4) > 1.0E-4f) {
                this.f16488f.mo6468X().invalidate();
            }
        }
        if (z2) {
            try {
                C3573u6 c3573u6 = this.f16501s;
                if (c3573u6 != null) {
                    c3573u6.m7002T1(2, c3573u6.m7001E0());
                }
            } catch (RemoteException e) {
                C2622l.m5271J3("#007 Could not call remote method.", e);
            }
        }
        m7616J6(i2, i, z3, z);
    }

    /* JADX INFO: renamed from: I6 */
    public final void m7615I6(String str, Map<String, String> map) {
        final HashMap map2 = map == null ? new HashMap() : new HashMap(map);
        map2.put("action", str);
        C2962do.f13334e.execute(new Runnable(this, map2) { // from class: c.n.b.d.j.a.it

            /* JADX INFO: renamed from: f */
            public final BinderC3263lt f15376f;

            /* JADX INFO: renamed from: g */
            public final Map f15377g;

            {
                this.f15376f = this;
                this.f15377g = map2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                BinderC3263lt binderC3263lt = this.f15376f;
                binderC3263lt.f16488f.mo6501r0("pubVideoCmd", this.f15377g);
            }
        });
    }

    /* JADX INFO: renamed from: J6 */
    public final void m7616J6(final int i, final int i2, final boolean z, final boolean z2) {
        C2962do.f13334e.execute(new Runnable(this, i, i2, z, z2) { // from class: c.n.b.d.j.a.kt

            /* JADX INFO: renamed from: f */
            public final BinderC3263lt f16031f;

            /* JADX INFO: renamed from: g */
            public final int f16032g;

            /* JADX INFO: renamed from: h */
            public final int f16033h;

            /* JADX INFO: renamed from: i */
            public final boolean f16034i;

            /* JADX INFO: renamed from: j */
            public final boolean f16035j;

            {
                this.f16031f = this;
                this.f16032g = i;
                this.f16033h = i2;
                this.f16034i = z;
                this.f16035j = z2;
            }

            /* JADX WARN: Code duplicated, block: B:42:0x0059 A[Catch: RemoteException -> 0x0043, all -> 0x0076, TryCatch #0 {RemoteException -> 0x0043, blocks: (B:28:0x003b, B:30:0x003f, B:34:0x0047, B:36:0x004b, B:38:0x0050, B:40:0x0054, B:42:0x0059, B:44:0x005d, B:45:0x0060, B:47:0x0067, B:49:0x006b), top: B:57:0x003b, outer: #1 }] */
            /* JADX WARN: Code duplicated, block: B:44:0x005d A[Catch: RemoteException -> 0x0043, all -> 0x0076, TryCatch #0 {RemoteException -> 0x0043, blocks: (B:28:0x003b, B:30:0x003f, B:34:0x0047, B:36:0x004b, B:38:0x0050, B:40:0x0054, B:42:0x0059, B:44:0x005d, B:45:0x0060, B:47:0x0067, B:49:0x006b), top: B:57:0x003b, outer: #1 }] */
            @Override // java.lang.Runnable
            public final void run() {
                int i3;
                boolean z3;
                boolean z4;
                InterfaceC3198k1 interfaceC3198k1;
                InterfaceC3198k1 interfaceC3198k2;
                InterfaceC3198k1 interfaceC3198k3;
                InterfaceC3198k1 interfaceC3198k4;
                BinderC3263lt binderC3263lt = this.f16031f;
                int i4 = this.f16032g;
                int i5 = this.f16033h;
                boolean z5 = this.f16034i;
                boolean z6 = this.f16035j;
                synchronized (binderC3263lt.f16489g) {
                    boolean z7 = binderC3263lt.f16494l;
                    if (z7 || i5 != 1) {
                        i3 = i5;
                        z3 = false;
                    } else {
                        i3 = 1;
                        z3 = true;
                    }
                    if (i4 == i5 || i3 != 1) {
                        z4 = false;
                    } else {
                        i3 = 1;
                        z4 = true;
                    }
                    boolean z8 = i4 != i5 && i3 == 2;
                    boolean z9 = i4 != i5 && i3 == 3;
                    binderC3263lt.f16494l = z7 || z3;
                    if (z3) {
                        try {
                            InterfaceC3198k1 interfaceC3198k5 = binderC3263lt.f16493k;
                            if (interfaceC3198k5 != null) {
                                interfaceC3198k5.mo7187c();
                            }
                            if (z4 && (interfaceC3198k4 = binderC3263lt.f16493k) != null) {
                                interfaceC3198k4.mo7188d();
                            }
                            if (z8 && (interfaceC3198k3 = binderC3263lt.f16493k) != null) {
                                interfaceC3198k3.mo7189f();
                            }
                            if (z9) {
                                interfaceC3198k2 = binderC3263lt.f16493k;
                                if (interfaceC3198k2 != null) {
                                    interfaceC3198k2.mo7190g();
                                }
                                binderC3263lt.f16488f.mo6473b0();
                            }
                            if (z5 != z6 && (interfaceC3198k1 = binderC3263lt.f16493k) != null) {
                                interfaceC3198k1.mo7191j4(z6);
                            }
                        } catch (RemoteException e) {
                            C2622l.m5271J3("#007 Could not call remote method.", e);
                        }
                    } else {
                        if (z4) {
                            interfaceC3198k4.mo7188d();
                        }
                        if (z8) {
                            interfaceC3198k3.mo7189f();
                        }
                        if (z9) {
                            interfaceC3198k2 = binderC3263lt.f16493k;
                            if (interfaceC3198k2 != null) {
                                interfaceC3198k2.mo7190g();
                            }
                            binderC3263lt.f16488f.mo6473b0();
                        }
                        if (z5 != z6) {
                            interfaceC3198k1.mo7191j4(z6);
                        }
                    }
                    throw th;
                }
            }
        });
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3087h1
    /* JADX INFO: renamed from: a0 */
    public final void mo5771a0(boolean z) {
        m7615I6(true != z ? "unmute" : "mute", null);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3087h1
    /* JADX INFO: renamed from: c */
    public final void mo5772c() {
        m7615I6("play", null);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3087h1
    /* JADX INFO: renamed from: d */
    public final void mo5773d() {
        m7615I6("pause", null);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3087h1
    /* JADX INFO: renamed from: g */
    public final boolean mo5774g() {
        boolean z;
        synchronized (this.f16489g) {
            z = this.f16495m;
        }
        return z;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3087h1
    /* JADX INFO: renamed from: g4 */
    public final void mo5775g4(InterfaceC3198k1 interfaceC3198k1) {
        synchronized (this.f16489g) {
            this.f16493k = interfaceC3198k1;
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3087h1
    /* JADX INFO: renamed from: h */
    public final float mo5776h() {
        float f;
        synchronized (this.f16489g) {
            f = this.f16496n;
        }
        return f;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3087h1
    /* JADX INFO: renamed from: i */
    public final int mo5777i() {
        int i;
        synchronized (this.f16489g) {
            i = this.f16492j;
        }
        return i;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3087h1
    /* JADX INFO: renamed from: k */
    public final float mo5778k() {
        float f;
        synchronized (this.f16489g) {
            f = this.f16497o;
        }
        return f;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3087h1
    /* JADX INFO: renamed from: l */
    public final void mo5779l() {
        m7615I6("stop", null);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3087h1
    /* JADX INFO: renamed from: m */
    public final float mo5780m() {
        float f;
        synchronized (this.f16489g) {
            f = this.f16498p;
        }
        return f;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3087h1
    /* JADX INFO: renamed from: n */
    public final boolean mo5781n() {
        boolean z;
        boolean zMo5782p = mo5782p();
        synchronized (this.f16489g) {
            z = false;
            if (!zMo5782p) {
                try {
                    if (this.f16500r && this.f16491i) {
                        z = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return z;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3087h1
    /* JADX INFO: renamed from: p */
    public final boolean mo5782p() {
        boolean z;
        synchronized (this.f16489g) {
            z = false;
            if (this.f16490h && this.f16499q) {
                z = true;
            }
        }
        return z;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3087h1
    /* JADX INFO: renamed from: u */
    public final InterfaceC3198k1 mo5783u() throws RemoteException {
        InterfaceC3198k1 interfaceC3198k1;
        synchronized (this.f16489g) {
            interfaceC3198k1 = this.f16493k;
        }
        return interfaceC3198k1;
    }
}
