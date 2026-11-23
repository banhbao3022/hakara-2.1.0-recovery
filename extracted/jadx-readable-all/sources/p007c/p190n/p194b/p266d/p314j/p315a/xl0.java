package p007c.p190n.p194b.p266d.p314j.p315a;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import p007c.p190n.p194b.p266d.p267a.p282z.C2313d;
import p007c.p190n.p194b.p266d.p267a.p282z.p283a.InterfaceC2242y;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class xl0 {

    /* JADX INFO: renamed from: a */
    public final g60 f21582a;

    /* JADX INFO: renamed from: b */
    public final o70 f21583b;

    /* JADX INFO: renamed from: c */
    public final a80 f21584c;

    /* JADX INFO: renamed from: d */
    public final m80 f21585d;

    /* JADX INFO: renamed from: e */
    public final t90 f21586e;

    /* JADX INFO: renamed from: f */
    public final Executor f21587f;

    /* JADX INFO: renamed from: g */
    public final dc0 f21588g;

    /* JADX INFO: renamed from: h */
    public final C3787zy f21589h;

    /* JADX INFO: renamed from: i */
    public final C2313d f21590i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC2884bl f21591j;

    /* JADX INFO: renamed from: k */
    public final rd2 f21592k;

    /* JADX INFO: renamed from: l */
    public final k90 f21593l;

    /* JADX INFO: renamed from: m */
    public final pw0 f21594m;

    /* JADX INFO: renamed from: n */
    public final bn1 f21595n;

    /* JADX INFO: renamed from: o */
    public final po0 f21596o;

    /* JADX INFO: renamed from: p */
    public final im1 f21597p;

    public xl0(g60 g60Var, o70 o70Var, a80 a80Var, m80 m80Var, t90 t90Var, Executor executor, dc0 dc0Var, C3787zy c3787zy, C2313d c2313d, InterfaceC2884bl interfaceC2884bl, rd2 rd2Var, k90 k90Var, pw0 pw0Var, bn1 bn1Var, po0 po0Var, im1 im1Var) {
        this.f21582a = g60Var;
        this.f21583b = o70Var;
        this.f21584c = a80Var;
        this.f21585d = m80Var;
        this.f21586e = t90Var;
        this.f21587f = executor;
        this.f21588g = dc0Var;
        this.f21589h = c3787zy;
        this.f21590i = c2313d;
        this.f21591j = interfaceC2884bl;
        this.f21592k = rd2Var;
        this.f21593l = k90Var;
        this.f21594m = pw0Var;
        this.f21595n = bn1Var;
        this.f21596o = po0Var;
        this.f21597p = im1Var;
    }

    /* JADX INFO: renamed from: b */
    public static final kv1<?> m8740b(InterfaceC3410ps interfaceC3410ps, String str, String str2) {
        final C3147io c3147io = new C3147io();
        C2967dt c2967dt = (C2967dt) interfaceC3410ps;
        ((C3670ws) c2967dt.mo6459O0()).f21331m = new InterfaceC2856au(c3147io) { // from class: c.n.b.d.j.a.vl0

            /* JADX INFO: renamed from: f */
            public final C3147io f20825f;

            {
                this.f20825f = c3147io;
            }

            @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2856au
            /* JADX INFO: renamed from: B */
            public final void mo4670B(boolean z) {
                C3147io c3147io2 = this.f20825f;
                if (z) {
                    c3147io2.m7286a(null);
                } else {
                    c3147io2.m7287b(new Exception("Ad Web View failed to load."));
                }
            }
        };
        c2967dt.f13378f.mo6455M0(str, str2, null);
        return c3147io;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final void m8741a(final InterfaceC3410ps interfaceC3410ps, boolean z, C3575u8 c3575u8) {
        tb2 tb2Var;
        C2967dt c2967dt = (C2967dt) interfaceC3410ps;
        ((C3670ws) c2967dt.mo6459O0()).m8676b(new uv2(this) { // from class: c.n.b.d.j.a.ol0

            /* JADX INFO: renamed from: f */
            public final xl0 f17668f;

            {
                this.f17668f = this;
            }

            @Override // p007c.p190n.p194b.p266d.p314j.p315a.uv2
            /* JADX INFO: renamed from: i0 */
            public final void mo2739i0() {
                this.f17668f.f21582a.m7108A0(f60.f13980a);
            }
        }, this.f21584c, this.f21585d, new InterfaceC3537t7(this) { // from class: c.n.b.d.j.a.pl0

            /* JADX INFO: renamed from: f */
            public final xl0 f18023f;

            {
                this.f18023f = this;
            }

            @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3537t7
            /* JADX INFO: renamed from: M */
            public final void mo8124M(String str, String str2) {
                this.f18023f.f21586e.mo8124M(str, str2);
            }
        }, new InterfaceC2242y(this) { // from class: c.n.b.d.j.a.ql0

            /* JADX INFO: renamed from: f */
            public final xl0 f18376f;

            {
                this.f18376f = this;
            }

            @Override // p007c.p190n.p194b.p266d.p267a.p282z.p283a.InterfaceC2242y
            /* JADX INFO: renamed from: d */
            public final void mo4706d() {
                this.f18376f.f21583b.m7108A0(j70.f15502a);
            }
        }, z, c3575u8, this.f21590i, new wl0(this), this.f21591j, this.f21594m, this.f21595n, this.f21596o, this.f21597p, null);
        c2967dt.setOnTouchListener(new View.OnTouchListener(this) { // from class: c.n.b.d.j.a.rl0

            /* JADX INFO: renamed from: f */
            public final xl0 f18921f;

            {
                this.f18921f = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                this.f18921f.f21590i.f10833b = true;
                return false;
            }
        });
        c2967dt.setOnClickListener(new View.OnClickListener(this) { // from class: c.n.b.d.j.a.sl0

            /* JADX INFO: renamed from: f */
            public final xl0 f19604f;

            {
                this.f19604f = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f19604f.f21590i.f10833b = true;
            }
        });
        if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14466w1)).booleanValue() && (tb2Var = this.f21592k.f18750d) != null) {
            tb2Var.mo4858g((View) interfaceC3410ps);
        }
        this.f21588g.m7109u0(interfaceC3410ps, this.f21587f);
        this.f21588g.m7109u0(new ip2(interfaceC3410ps) { // from class: c.n.b.d.j.a.tl0

            /* JADX INFO: renamed from: f */
            public final InterfaceC3410ps f19907f;

            {
                this.f19907f = interfaceC3410ps;
            }

            @Override // p007c.p190n.p194b.p266d.p314j.p315a.ip2
            /* JADX INFO: renamed from: q0 */
            public final void mo6352q0(hp2 hp2Var) {
                InterfaceC2931cu interfaceC2931cuMo6459O0 = this.f19907f.mo6459O0();
                Rect rect = hp2Var.f14928d;
                ((C3670ws) interfaceC2931cuMo6459O0).m8680i(rect.left, rect.top, false);
            }
        }, this.f21587f);
        this.f21588g.m6351B0((View) interfaceC3410ps);
        c2967dt.f13378f.mo6479f0("/trackActiveViewUnit", new InterfaceC3464r8(this, interfaceC3410ps) { // from class: c.n.b.d.j.a.ul0

            /* JADX INFO: renamed from: a */
            public final xl0 f20370a;

            /* JADX INFO: renamed from: b */
            public final InterfaceC3410ps f20371b;

            {
                this.f20370a = this;
                this.f20371b = interfaceC3410ps;
            }

            @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3464r8
            /* JADX INFO: renamed from: a */
            public final void mo6148a(Object obj, Map map) {
                xl0 xl0Var = this.f20370a;
                InterfaceC3410ps interfaceC3410ps2 = this.f20371b;
                C3787zy c3787zy = xl0Var.f21589h;
                synchronized (c3787zy) {
                    c3787zy.f22437h.add(interfaceC3410ps2);
                    C3602uy c3602uy = c3787zy.f22435f;
                    interfaceC3410ps2.mo6479f0("/updateActiveView", c3602uy.f20675e);
                    interfaceC3410ps2.mo6479f0("/untrackActiveViewUnit", c3602uy.f20676f);
                }
            }
        });
        C3787zy c3787zy = this.f21589h;
        Objects.requireNonNull(c3787zy);
        c3787zy.f22444o = new WeakReference<>(interfaceC3410ps);
    }
}
