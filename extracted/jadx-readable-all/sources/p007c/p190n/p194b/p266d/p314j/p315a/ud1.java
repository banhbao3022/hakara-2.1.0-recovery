package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;
import p007c.p190n.p194b.p266d.p267a.p282z.p283a.InterfaceC2235r;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ud1 implements l60, g80, if1, InterfaceC2235r, r80 {

    /* JADX INFO: renamed from: f */
    public final jj1 f20282f;

    /* JADX INFO: renamed from: g */
    public final AtomicReference<zq2> f20283g = new AtomicReference<>();

    /* JADX INFO: renamed from: h */
    public final AtomicReference<ar2> f20284h = new AtomicReference<>();

    /* JADX INFO: renamed from: i */
    public final AtomicReference<cr2> f20285i = new AtomicReference<>();

    /* JADX INFO: renamed from: j */
    public final AtomicReference<g80> f20286j = new AtomicReference<>();

    /* JADX INFO: renamed from: k */
    public final AtomicReference<InterfaceC2235r> f20287k = new AtomicReference<>();

    /* JADX INFO: renamed from: l */
    public final AtomicReference<InterfaceC2864b1> f20288l = new AtomicReference<>();

    /* JADX INFO: renamed from: m */
    public ud1 f20289m = null;

    public ud1(jj1 jj1Var) {
        this.f20282f = jj1Var;
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p282z.p283a.InterfaceC2235r
    /* JADX INFO: renamed from: F3 */
    public final void mo4698F3() {
        ud1 ud1Var = this.f20289m;
        if (ud1Var != null) {
            ud1Var.mo4698F3();
            return;
        }
        cw0.m6234d(this.f20287k, rd1.f18746a);
        cw0.m6234d(this.f20285i, sd1.f19531a);
        cw0.m6234d(this.f20285i, td1.f19817a);
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p282z.p283a.InterfaceC2235r
    /* JADX INFO: renamed from: J3 */
    public final void mo4699J3(final int i) {
        ud1 ud1Var = this.f20289m;
        if (ud1Var != null) {
            ud1Var.mo4699J3(i);
        } else {
            cw0.m6234d(this.f20287k, new ze1(i) { // from class: c.n.b.d.j.a.jd1

                /* JADX INFO: renamed from: a */
                public final int f15569a;

                {
                    this.f15569a = i;
                }

                @Override // p007c.p190n.p194b.p266d.p314j.p315a.ze1
                /* JADX INFO: renamed from: a */
                public final void mo5685a(Object obj) {
                    ((InterfaceC2235r) obj).mo4699J3(this.f15569a);
                }
            });
        }
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p282z.p283a.InterfaceC2235r
    /* JADX INFO: renamed from: O5 */
    public final void mo4700O5() {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g80
    /* JADX INFO: renamed from: T */
    public final void mo6949T() {
        ud1 ud1Var = this.f20289m;
        if (ud1Var != null) {
            ud1Var.mo6949T();
        } else {
            cw0.m6234d(this.f20286j, qd1.f18251a);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.r80
    /* JADX INFO: renamed from: a */
    public final void mo6968a(final lw2 lw2Var) {
        ud1 ud1Var = this.f20289m;
        if (ud1Var != null) {
            ud1Var.mo6968a(lw2Var);
        } else {
            cw0.m6234d(this.f20288l, new ze1(lw2Var) { // from class: c.n.b.d.j.a.id1

                /* JADX INFO: renamed from: a */
                public final lw2 f15155a;

                {
                    this.f15155a = lw2Var;
                }

                @Override // p007c.p190n.p194b.p266d.p314j.p315a.ze1
                /* JADX INFO: renamed from: a */
                public final void mo5685a(Object obj) throws RemoteException {
                    ((InterfaceC2864b1) obj).mo5908o4(this.f15155a);
                }
            });
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m8483b(final xq2 xq2Var) {
        ud1 ud1Var = this.f20289m;
        if (ud1Var != null) {
            ud1Var.m8483b(xq2Var);
        } else {
            cw0.m6234d(this.f20283g, new ze1(xq2Var) { // from class: c.n.b.d.j.a.ld1

                /* JADX INFO: renamed from: a */
                public final xq2 f16320a;

                {
                    this.f16320a = xq2Var;
                }

                @Override // p007c.p190n.p194b.p266d.p314j.p315a.ze1
                /* JADX INFO: renamed from: a */
                public final void mo5685a(Object obj) throws RemoteException {
                    ((zq2) obj).mo8827M0(this.f16320a);
                }
            });
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m8484c() {
        ud1 ud1Var = this.f20289m;
        if (ud1Var != null) {
            ud1Var.m8484c();
            return;
        }
        this.f20282f.m7355a();
        cw0.m6234d(this.f20284h, od1.f17598a);
        cw0.m6234d(this.f20285i, pd1.f17929a);
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p282z.p283a.InterfaceC2235r
    /* JADX INFO: renamed from: i1 */
    public final void mo4701i1() {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.if1
    /* JADX INFO: renamed from: m */
    public final void mo7249m(if1 if1Var) {
        this.f20289m = (ud1) if1Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.l60
    /* JADX INFO: renamed from: o0 */
    public final void mo6216o0(final yv2 yv2Var) {
        ud1 ud1Var = this.f20289m;
        if (ud1Var != null) {
            ud1Var.mo6216o0(yv2Var);
        } else {
            cw0.m6234d(this.f20283g, new ze1(yv2Var) { // from class: c.n.b.d.j.a.md1

                /* JADX INFO: renamed from: a */
                public final yv2 f16728a;

                {
                    this.f16728a = yv2Var;
                }

                @Override // p007c.p190n.p194b.p266d.p314j.p315a.ze1
                /* JADX INFO: renamed from: a */
                public final void mo5685a(Object obj) throws RemoteException {
                    ((zq2) obj).mo8825D0(this.f16728a);
                }
            });
            cw0.m6234d(this.f20283g, new ze1(yv2Var) { // from class: c.n.b.d.j.a.nd1

                /* JADX INFO: renamed from: a */
                public final yv2 f17071a;

                {
                    this.f17071a = yv2Var;
                }

                @Override // p007c.p190n.p194b.p266d.p314j.p315a.ze1
                /* JADX INFO: renamed from: a */
                public final void mo5685a(Object obj) throws RemoteException {
                    ((zq2) obj).mo8826L(this.f17071a.f22116f);
                }
            });
        }
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p282z.p283a.InterfaceC2235r
    /* JADX INFO: renamed from: r0 */
    public final void mo4702r0() {
        ud1 ud1Var = this.f20289m;
        if (ud1Var != null) {
            ud1Var.mo4702r0();
        } else {
            cw0.m6234d(this.f20287k, kd1.f15919a);
        }
    }
}
