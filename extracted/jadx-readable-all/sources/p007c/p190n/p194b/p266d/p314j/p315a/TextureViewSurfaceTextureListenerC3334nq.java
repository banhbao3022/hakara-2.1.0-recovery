package p007c.p190n.p194b.p266d.p314j.p315a;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2267h1;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.nq */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(16)
public final class TextureViewSurfaceTextureListenerC3334nq extends AbstractC3037fp implements TextureView.SurfaceTextureListener, InterfaceC2965dr {

    /* JADX INFO: renamed from: h */
    public final InterfaceC3704xp f17218h;

    /* JADX INFO: renamed from: i */
    public final C3741yp f17219i;

    /* JADX INFO: renamed from: j */
    public final boolean f17220j;

    /* JADX INFO: renamed from: k */
    public final C3667wp f17221k;

    /* JADX INFO: renamed from: l */
    public InterfaceC3000ep f17222l;

    /* JADX INFO: renamed from: m */
    public Surface f17223m;

    /* JADX INFO: renamed from: n */
    public C3002er f17224n;

    /* JADX INFO: renamed from: o */
    public String f17225o;

    /* JADX INFO: renamed from: p */
    public String[] f17226p;

    /* JADX INFO: renamed from: q */
    public boolean f17227q;

    /* JADX INFO: renamed from: r */
    public int f17228r;

    /* JADX INFO: renamed from: s */
    public C3630vp f17229s;

    /* JADX INFO: renamed from: t */
    public final boolean f17230t;

    /* JADX INFO: renamed from: u */
    public boolean f17231u;

    /* JADX INFO: renamed from: v */
    public boolean f17232v;

    /* JADX INFO: renamed from: w */
    public int f17233w;

    /* JADX INFO: renamed from: x */
    public int f17234x;

    /* JADX INFO: renamed from: y */
    public float f17235y;

    public TextureViewSurfaceTextureListenerC3334nq(Context context, C3741yp c3741yp, InterfaceC3704xp interfaceC3704xp, boolean z, boolean z2, C3667wp c3667wp) {
        super(context);
        this.f17228r = 1;
        this.f17220j = z2;
        this.f17218h = interfaceC3704xp;
        this.f17219i = c3741yp;
        this.f17230t = z;
        this.f17221k = c3667wp;
        setSurfaceTextureListener(this);
        c3741yp.m8817a(this);
    }

    /* JADX INFO: renamed from: I */
    public static String m7919I(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        StringBuilder sb = new StringBuilder(outline.m1578b(str.length(), 2, String.valueOf(canonicalName).length(), String.valueOf(message).length()));
        outline.m1572W(sb, str, "/", canonicalName, ":");
        sb.append(message);
        return sb.toString();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3037fp
    /* JADX INFO: renamed from: A */
    public final void mo6848A(int i) {
        C3002er c3002er = this.f17224n;
        if (c3002er != null) {
            C3556tq c3556tq = c3002er.f13653i;
            synchronized (c3556tq) {
                c3556tq.f19957e = ((long) i) * 1000;
            }
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3037fp
    /* JADX INFO: renamed from: B */
    public final void mo6849B(int i) {
        C3002er c3002er = this.f17224n;
        if (c3002er != null) {
            Iterator<WeakReference<C3408pq>> it = c3002er.f13670z.iterator();
            while (it.hasNext()) {
                C3408pq c3408pq = it.next().get();
                if (c3408pq != null) {
                    c3408pq.f18069q = i;
                    for (Socket socket : c3408pq.f18070r) {
                        if (!socket.isClosed()) {
                            try {
                                socket.setReceiveBufferSize(c3408pq.f18069q);
                            } catch (SocketException e) {
                                C2622l.m5241D3("Failed to update receive buffer size.", e);
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public final boolean m7920C() {
        C3002er c3002er = this.f17224n;
        return (c3002er == null || c3002er.f13658n == null || this.f17227q) ? false : true;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m7921D() {
        return m7920C() && this.f17228r != 1;
    }

    /* JADX INFO: renamed from: E */
    public final void m7922E() {
        String str;
        if (this.f17224n != null || (str = this.f17225o) == null || this.f17223m == null) {
            return;
        }
        if (str.startsWith("cache:")) {
            AbstractC3669wr abstractC3669wrMo6440F = this.f17218h.mo6440F(this.f17225o);
            if (abstractC3669wrMo6440F instanceof C3003es) {
                C3003es c3003es = (C3003es) abstractC3669wrMo6440F;
                synchronized (c3003es) {
                    c3003es.f13681m = true;
                    c3003es.notify();
                }
                C3002er c3002er = c3003es.f13677i;
                c3002er.f13662r = null;
                c3003es.f13677i = null;
                this.f17224n = c3002er;
                if (c3002er.f13658n == null) {
                    C2622l.m5226A3("Precached video player has been released.");
                    return;
                }
            } else {
                if (!(abstractC3669wrMo6440F instanceof C2929cs)) {
                    String strValueOf = String.valueOf(this.f17225o);
                    C2622l.m5226A3(strValueOf.length() != 0 ? "Stream cache miss: ".concat(strValueOf) : new String("Stream cache miss: "));
                    return;
                }
                C2929cs c2929cs = (C2929cs) abstractC3669wrMo6440F;
                String strM7928L = m7928L();
                synchronized (c2929cs.f13112p) {
                    ByteBuffer byteBuffer = c2929cs.f13110n;
                    if (byteBuffer != null && !c2929cs.f13111o) {
                        byteBuffer.flip();
                        c2929cs.f13111o = true;
                    }
                    c2929cs.f13107k = true;
                }
                ByteBuffer byteBuffer2 = c2929cs.f13110n;
                boolean z = c2929cs.f13115s;
                String str2 = c2929cs.f13105i;
                if (str2 == null) {
                    C2622l.m5226A3("Stream cache URL is null.");
                    return;
                } else {
                    C3002er c3002er2 = new C3002er(this.f17218h.getContext(), this.f17221k, this.f17218h);
                    this.f17224n = c3002er2;
                    c3002er2.m6671n(new Uri[]{Uri.parse(str2)}, strM7928L, byteBuffer2, z);
                }
            }
        } else {
            this.f17224n = new C3002er(this.f17218h.getContext(), this.f17221k, this.f17218h);
            String strM7928L2 = m7928L();
            Uri[] uriArr = new Uri[this.f17226p.length];
            int i = 0;
            while (true) {
                String[] strArr = this.f17226p;
                if (i >= strArr.length) {
                    break;
                }
                uriArr[i] = Uri.parse(strArr[i]);
                i++;
            }
            C3002er c3002er3 = this.f17224n;
            Objects.requireNonNull(c3002er3);
            c3002er3.m6671n(uriArr, strM7928L2, ByteBuffer.allocate(0), false);
        }
        this.f17224n.f13662r = this;
        m7923F(this.f17223m, false);
        tg2 tg2Var = this.f17224n.f13658n;
        if (tg2Var != null) {
            int i2 = ((vg2) tg2Var).f20775k;
            this.f17228r = i2;
            if (i2 == 3) {
                m7925H();
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m7923F(Surface surface, boolean z) {
        C3002er c3002er = this.f17224n;
        if (c3002er == null) {
            C2622l.m5226A3("Trying to set surface before player is initialized.");
            return;
        }
        if (c3002er.f13658n == null) {
            return;
        }
        sg2 sg2Var = new sg2(c3002er.f13654j, 1, surface);
        if (z) {
            ((vg2) c3002er.f13658n).m8555c(sg2Var);
        } else {
            ((vg2) c3002er.f13658n).m8554b(sg2Var);
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m7924G(float f, boolean z) {
        C3002er c3002er = this.f17224n;
        if (c3002er == null) {
            C2622l.m5226A3("Trying to set volume before player is initialized.");
            return;
        }
        if (c3002er.f13658n == null) {
            return;
        }
        sg2 sg2Var = new sg2(c3002er.f13655k, 2, Float.valueOf(f));
        if (z) {
            ((vg2) c3002er.f13658n).m8555c(sg2Var);
        } else {
            ((vg2) c3002er.f13658n).m8554b(sg2Var);
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m7925H() {
        if (this.f17231u) {
            return;
        }
        this.f17231u = true;
        C2267h1.f10713a.post(new Runnable(this) { // from class: c.n.b.d.j.a.cq

            /* JADX INFO: renamed from: f */
            public final TextureViewSurfaceTextureListenerC3334nq f13079f;

            {
                this.f13079f = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC3000ep interfaceC3000ep = this.f13079f.f17222l;
                if (interfaceC3000ep != null) {
                    ((C3333np) interfaceC3000ep).m7902e();
                }
            }
        });
        mo5839l();
        this.f17219i.m8818b();
        if (this.f17232v) {
            mo6409j();
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m7926J(int i, int i2) {
        float f = i2 > 0 ? i / i2 : 1.0f;
        if (this.f17235y != f) {
            this.f17235y = f;
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m7927K() {
        C3002er c3002er = this.f17224n;
        if (c3002er != null) {
            c3002er.m6668k(false);
        }
    }

    /* JADX INFO: renamed from: L */
    public final String m7928L() {
        return C2330u.f10884a.f10889d.m4766B(this.f17218h.getContext(), this.f17218h.mo6495o().f21615f);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2965dr
    /* JADX INFO: renamed from: a */
    public final void mo6426a(String str, Exception exc) {
        final String strM7919I = m7919I("onLoadException", exc);
        String strValueOf = String.valueOf(strM7919I);
        C2622l.m5226A3(strValueOf.length() != 0 ? "ExoPlayerAdapter exception: ".concat(strValueOf) : new String("ExoPlayerAdapter exception: "));
        C2267h1.f10713a.post(new Runnable(this, strM7919I) { // from class: c.n.b.d.j.a.dq

            /* JADX INFO: renamed from: f */
            public final TextureViewSurfaceTextureListenerC3334nq f13361f;

            /* JADX INFO: renamed from: g */
            public final String f13362g;

            {
                this.f13361f = this;
                this.f13362g = strM7919I;
            }

            @Override // java.lang.Runnable
            public final void run() {
                TextureViewSurfaceTextureListenerC3334nq textureViewSurfaceTextureListenerC3334nq = this.f13361f;
                String str2 = this.f13362g;
                InterfaceC3000ep interfaceC3000ep = textureViewSurfaceTextureListenerC3334nq.f17222l;
                if (interfaceC3000ep != null) {
                    ((C3333np) interfaceC3000ep).m7900c("exception", "what", "ExoPlayerAdapter exception", "extra", str2);
                }
            }
        });
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2965dr
    /* JADX INFO: renamed from: b */
    public final void mo6427b(String str, Exception exc) {
        final String strM7919I = m7919I(str, exc);
        String strValueOf = String.valueOf(strM7919I);
        C2622l.m5226A3(strValueOf.length() != 0 ? "ExoPlayerAdapter error: ".concat(strValueOf) : new String("ExoPlayerAdapter error: "));
        this.f17227q = true;
        if (this.f17221k.f21282a) {
            m7927K();
        }
        C2267h1.f10713a.post(new Runnable(this, strM7919I) { // from class: c.n.b.d.j.a.fq

            /* JADX INFO: renamed from: f */
            public final TextureViewSurfaceTextureListenerC3334nq f14092f;

            /* JADX INFO: renamed from: g */
            public final String f14093g;

            {
                this.f14092f = this;
                this.f14093g = strM7919I;
            }

            @Override // java.lang.Runnable
            public final void run() {
                TextureViewSurfaceTextureListenerC3334nq textureViewSurfaceTextureListenerC3334nq = this.f14092f;
                String str2 = this.f14093g;
                InterfaceC3000ep interfaceC3000ep = textureViewSurfaceTextureListenerC3334nq.f17222l;
                if (interfaceC3000ep != null) {
                    ((C3333np) interfaceC3000ep).m7905h("ExoPlayerAdapter error", str2);
                }
            }
        });
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2965dr
    /* JADX INFO: renamed from: c */
    public final void mo6428c(final boolean z, final long j2) {
        if (this.f17218h != null) {
            C2962do.f13334e.execute(new Runnable(this, z, j2) { // from class: c.n.b.d.j.a.mq

                /* JADX INFO: renamed from: f */
                public final TextureViewSurfaceTextureListenerC3334nq f16823f;

                /* JADX INFO: renamed from: g */
                public final boolean f16824g;

                /* JADX INFO: renamed from: h */
                public final long f16825h;

                {
                    this.f16823f = this;
                    this.f16824g = z;
                    this.f16825h = j2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    TextureViewSurfaceTextureListenerC3334nq textureViewSurfaceTextureListenerC3334nq = this.f16823f;
                    textureViewSurfaceTextureListenerC3334nq.f17218h.mo6441F0(this.f16824g, this.f16825h);
                }
            });
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2965dr
    /* JADX INFO: renamed from: d */
    public final void mo6429d(int i) {
        if (this.f17228r != i) {
            this.f17228r = i;
            if (i == 3) {
                m7925H();
                return;
            }
            if (i != 4) {
                return;
            }
            if (this.f17221k.f21282a) {
                m7927K();
            }
            this.f17219i.f21960m = false;
            this.f14088g.m6069a();
            C2267h1.f10713a.post(new Runnable(this) { // from class: c.n.b.d.j.a.eq

                /* JADX INFO: renamed from: f */
                public final TextureViewSurfaceTextureListenerC3334nq f13641f;

                {
                    this.f13641f = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC3000ep interfaceC3000ep = this.f13641f.f17222l;
                    if (interfaceC3000ep != null) {
                        C3333np c3333np = (C3333np) interfaceC3000ep;
                        c3333np.m7900c("ended", new String[0]);
                        c3333np.m7901d();
                    }
                }
            });
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3037fp
    /* JADX INFO: renamed from: e */
    public final String mo6405e() {
        String str = true != this.f17230t ? "" : " spherical";
        return str.length() != 0 ? "ExoPlayer/3".concat(str) : new String("ExoPlayer/3");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2965dr
    /* JADX INFO: renamed from: f */
    public final void mo6430f(int i, int i2) {
        this.f17233w = i;
        this.f17234x = i2;
        m7926J(i, i2);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3037fp
    /* JADX INFO: renamed from: g */
    public final void mo6406g(InterfaceC3000ep interfaceC3000ep) {
        this.f17222l = interfaceC3000ep;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3037fp
    /* JADX INFO: renamed from: h */
    public final void mo6407h(String str) {
        if (str != null) {
            this.f17225o = str;
            this.f17226p = new String[]{str};
            m7922E();
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3037fp
    /* JADX INFO: renamed from: i */
    public final void mo6408i() {
        if (m7920C()) {
            ((vg2) this.f17224n.f13658n).f20769e.f12150j.sendEmptyMessage(5);
            if (this.f17224n != null) {
                m7923F(null, true);
                C3002er c3002er = this.f17224n;
                if (c3002er != null) {
                    c3002er.f13662r = null;
                    c3002er.m6672o();
                    this.f17224n = null;
                }
                this.f17228r = 1;
                this.f17227q = false;
                this.f17231u = false;
                this.f17232v = false;
            }
        }
        this.f17219i.f21960m = false;
        this.f14088g.m6069a();
        this.f17219i.m8819c();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3037fp
    /* JADX INFO: renamed from: j */
    public final void mo6409j() {
        C3002er c3002er;
        if (!m7921D()) {
            this.f17232v = true;
            return;
        }
        if (this.f17221k.f21282a && (c3002er = this.f17224n) != null) {
            c3002er.m6668k(true);
        }
        ((vg2) this.f17224n.f13658n).m8553a(true);
        this.f17219i.m8821e();
        C2889bq c2889bq = this.f14088g;
        c2889bq.f12772d = true;
        c2889bq.m6070b();
        this.f14087f.f19018c = true;
        C2267h1.f10713a.post(new Runnable(this) { // from class: c.n.b.d.j.a.gq

            /* JADX INFO: renamed from: f */
            public final TextureViewSurfaceTextureListenerC3334nq f14636f;

            {
                this.f14636f = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC3000ep interfaceC3000ep = this.f14636f.f17222l;
                if (interfaceC3000ep != null) {
                    ((C3333np) interfaceC3000ep).m7903f();
                }
            }
        });
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3037fp
    /* JADX INFO: renamed from: k */
    public final void mo6410k() {
        if (m7921D()) {
            if (this.f17221k.f21282a) {
                m7927K();
            }
            ((vg2) this.f17224n.f13658n).m8553a(false);
            this.f17219i.f21960m = false;
            this.f14088g.m6069a();
            C2267h1.f10713a.post(new Runnable(this) { // from class: c.n.b.d.j.a.hq

                /* JADX INFO: renamed from: f */
                public final TextureViewSurfaceTextureListenerC3334nq f14936f;

                {
                    this.f14936f = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC3000ep interfaceC3000ep = this.f14936f.f17222l;
                    if (interfaceC3000ep != null) {
                        ((C3333np) interfaceC3000ep).m7904g();
                    }
                }
            });
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3037fp, p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2852aq
    /* JADX INFO: renamed from: l */
    public final void mo5839l() {
        C2889bq c2889bq = this.f14088g;
        m7924G(c2889bq.f12771c ? c2889bq.f12773e ? 0.0f : c2889bq.f12774f : 0.0f, false);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3037fp
    /* JADX INFO: renamed from: m */
    public final int mo6411m() {
        if (m7921D()) {
            return (int) ((vg2) this.f17224n.f13658n).m8556d();
        }
        return 0;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3037fp
    /* JADX INFO: renamed from: n */
    public final int mo6412n() {
        if (m7921D()) {
            return (int) ((vg2) this.f17224n.f13658n).m8557e();
        }
        return 0;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3037fp
    /* JADX INFO: renamed from: o */
    public final void mo6413o(int i) {
        if (m7921D()) {
            long j2 = i;
            vg2 vg2Var = (vg2) this.f17224n.f13658n;
            vg2Var.m8558f();
            if (!vg2Var.f20779o.m7863f() && vg2Var.f20779o.mo7495a() <= 0) {
                throw new eh2(vg2Var.f20779o, 0, j2);
            }
            vg2Var.f20776l++;
            if (!vg2Var.f20779o.m7863f()) {
                vg2Var.f20779o.m7864g(0, vg2Var.f20771g);
                og2.m8009b(j2);
                int i2 = (vg2Var.f20779o.mo7498d(0, vg2Var.f20772h, false).f16364c > (-9223372036854775807L) ? 1 : (vg2Var.f20779o.mo7498d(0, vg2Var.f20772h, false).f16364c == (-9223372036854775807L) ? 0 : -1));
            }
            vg2Var.f20785u = j2;
            vg2Var.f20769e.f12150j.obtainMessage(3, new yg2(vg2Var.f20779o, 0, og2.m8009b(j2))).sendToTarget();
            Iterator<qg2> it = vg2Var.f20770f.iterator();
            while (it.hasNext()) {
                it.next().mo6663d();
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f = this.f17235y;
        if (f != 0.0f && this.f17229s == null) {
            float f2 = measuredWidth;
            float f3 = f2 / measuredHeight;
            if (f > f3) {
                measuredHeight = (int) (f2 / f);
            }
            if (f < f3) {
                measuredWidth = (int) (measuredHeight * f);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        C3630vp c3630vp = this.f17229s;
        if (c3630vp != null) {
            c3630vp.m8579a(measuredWidth, measuredHeight);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C3002er c3002er;
        int i3;
        SurfaceTexture surfaceTexture2;
        if (this.f17230t) {
            C3630vp c3630vp = new C3630vp(getContext());
            this.f17229s = c3630vp;
            c3630vp.f20891s = i;
            c3630vp.f20890r = i2;
            c3630vp.f20893u = surfaceTexture;
            c3630vp.start();
            C3630vp c3630vp2 = this.f17229s;
            if (c3630vp2.f20893u == null) {
                surfaceTexture2 = null;
            } else {
                try {
                    c3630vp2.f20898z.await();
                } catch (InterruptedException unused) {
                }
                surfaceTexture2 = c3630vp2.f20892t;
            }
            if (surfaceTexture2 != null) {
                surfaceTexture = surfaceTexture2;
            } else {
                this.f17229s.m8580b();
                this.f17229s = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.f17223m = surface;
        if (this.f17224n == null) {
            m7922E();
        } else {
            m7923F(surface, true);
            if (!this.f17221k.f21282a && (c3002er = this.f17224n) != null) {
                c3002er.m6668k(true);
            }
        }
        int i4 = this.f17233w;
        if (i4 == 0 || (i3 = this.f17234x) == 0) {
            m7926J(i, i2);
        } else {
            m7926J(i4, i3);
        }
        C2267h1.f10713a.post(new Runnable(this) { // from class: c.n.b.d.j.a.iq

            /* JADX INFO: renamed from: f */
            public final TextureViewSurfaceTextureListenerC3334nq f15337f;

            {
                this.f15337f = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC3000ep interfaceC3000ep = this.f15337f.f17222l;
                if (interfaceC3000ep != null) {
                    C3333np c3333np = (C3333np) interfaceC3000ep;
                    c3333np.f17197i.m8898b();
                    C2267h1.f10713a.post(new RunnableC3222kp(c3333np));
                }
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        mo6410k();
        C3630vp c3630vp = this.f17229s;
        if (c3630vp != null) {
            c3630vp.m8580b();
            this.f17229s = null;
        }
        if (this.f17224n != null) {
            m7927K();
            Surface surface = this.f17223m;
            if (surface != null) {
                surface.release();
            }
            this.f17223m = null;
            m7923F(null, true);
        }
        C2267h1.f10713a.post(new Runnable(this) { // from class: c.n.b.d.j.a.kq

            /* JADX INFO: renamed from: f */
            public final TextureViewSurfaceTextureListenerC3334nq f16012f;

            {
                this.f16012f = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC3000ep interfaceC3000ep = this.f16012f.f17222l;
                if (interfaceC3000ep != null) {
                    ((C3333np) interfaceC3000ep).m7906i();
                }
            }
        });
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, final int i, final int i2) {
        C3630vp c3630vp = this.f17229s;
        if (c3630vp != null) {
            c3630vp.m8579a(i, i2);
        }
        C2267h1.f10713a.post(new Runnable(this, i, i2) { // from class: c.n.b.d.j.a.jq

            /* JADX INFO: renamed from: f */
            public final TextureViewSurfaceTextureListenerC3334nq f15702f;

            /* JADX INFO: renamed from: g */
            public final int f15703g;

            /* JADX INFO: renamed from: h */
            public final int f15704h;

            {
                this.f15702f = this;
                this.f15703g = i;
                this.f15704h = i2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                TextureViewSurfaceTextureListenerC3334nq textureViewSurfaceTextureListenerC3334nq = this.f15702f;
                int i3 = this.f15703g;
                int i4 = this.f15704h;
                InterfaceC3000ep interfaceC3000ep = textureViewSurfaceTextureListenerC3334nq.f17222l;
                if (interfaceC3000ep != null) {
                    ((C3333np) interfaceC3000ep).m7907j(i3, i4);
                }
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f17219i.m8820d(this);
        this.f14087f.m8317a(surfaceTexture, this.f17222l);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(final int i) {
        StringBuilder sb = new StringBuilder(57);
        sb.append("AdExoPlayerView3 window visibility changed to ");
        sb.append(i);
        C2096e.m4590z(sb.toString());
        C2267h1.f10713a.post(new Runnable(this, i) { // from class: c.n.b.d.j.a.lq

            /* JADX INFO: renamed from: f */
            public final TextureViewSurfaceTextureListenerC3334nq f16440f;

            /* JADX INFO: renamed from: g */
            public final int f16441g;

            {
                this.f16440f = this;
                this.f16441g = i;
            }

            @Override // java.lang.Runnable
            public final void run() {
                TextureViewSurfaceTextureListenerC3334nq textureViewSurfaceTextureListenerC3334nq = this.f16440f;
                int i2 = this.f16441g;
                InterfaceC3000ep interfaceC3000ep = textureViewSurfaceTextureListenerC3334nq.f17222l;
                if (interfaceC3000ep != null) {
                    ((C3333np) interfaceC3000ep).onWindowVisibilityChanged(i2);
                }
            }
        });
        super.onWindowVisibilityChanged(i);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3037fp
    /* JADX INFO: renamed from: p */
    public final void mo6414p(float f, float f2) {
        C3630vp c3630vp = this.f17229s;
        if (c3630vp != null) {
            c3630vp.m8581c(f, f2);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3037fp
    /* JADX INFO: renamed from: q */
    public final int mo6415q() {
        return this.f17233w;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3037fp
    /* JADX INFO: renamed from: r */
    public final int mo6416r() {
        return this.f17234x;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3037fp
    /* JADX INFO: renamed from: s */
    public final long mo6417s() {
        C3002er c3002er = this.f17224n;
        if (c3002er == null) {
            return -1L;
        }
        if (c3002er.m6670m()) {
            return 0L;
        }
        return c3002er.f13663s;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3037fp
    /* JADX INFO: renamed from: t */
    public final long mo6418t() {
        C3002er c3002er = this.f17224n;
        if (c3002er != null) {
            return c3002er.m6673p();
        }
        return -1L;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3037fp
    /* JADX INFO: renamed from: u */
    public final long mo6419u() {
        C3002er c3002er = this.f17224n;
        if (c3002er != null) {
            return c3002er.m6674q();
        }
        return -1L;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3037fp
    /* JADX INFO: renamed from: v */
    public final int mo6420v() {
        C3002er c3002er = this.f17224n;
        if (c3002er != null) {
            return c3002er.f13664t;
        }
        return -1;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3037fp
    /* JADX INFO: renamed from: w */
    public final void mo6850w(String str, String[] strArr) {
        if (str != null) {
            if (strArr == null) {
                this.f17225o = str;
                this.f17226p = new String[]{str};
                m7922E();
            }
            this.f17225o = str;
            this.f17226p = (String[]) Arrays.copyOf(strArr, strArr.length);
            m7922E();
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3037fp
    /* JADX INFO: renamed from: x */
    public final void mo6851x(int i) {
        C3002er c3002er = this.f17224n;
        if (c3002er != null) {
            C3556tq c3556tq = c3002er.f13653i;
            synchronized (c3556tq) {
                c3556tq.f19954b = ((long) i) * 1000;
            }
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3037fp
    /* JADX INFO: renamed from: y */
    public final void mo6852y(int i) {
        C3002er c3002er = this.f17224n;
        if (c3002er != null) {
            C3556tq c3556tq = c3002er.f13653i;
            synchronized (c3556tq) {
                c3556tq.f19955c = ((long) i) * 1000;
            }
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3037fp
    /* JADX INFO: renamed from: z */
    public final void mo6853z(int i) {
        C3002er c3002er = this.f17224n;
        if (c3002er != null) {
            C3556tq c3556tq = c3002er.f13653i;
            synchronized (c3556tq) {
                c3556tq.f19956d = ((long) i) * 1000;
            }
        }
    }
}
