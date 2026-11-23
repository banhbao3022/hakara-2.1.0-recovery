package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p283a.InterfaceC2218b;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2267h1;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zc1 extends AbstractBinderC3566u implements InterfaceC2218b, uq2, g80 {

    /* JADX INFO: renamed from: f */
    public final AbstractC3264lu f22232f;

    /* JADX INFO: renamed from: g */
    public final Context f22233g;

    /* JADX INFO: renamed from: h */
    public final ViewGroup f22234h;

    /* JADX INFO: renamed from: j */
    public final String f22236j;

    /* JADX INFO: renamed from: k */
    public final tc1 f22237k;

    /* JADX INFO: renamed from: l */
    public final ud1 f22238l;

    /* JADX INFO: renamed from: m */
    public final C3702xn f22239m;

    /* JADX INFO: renamed from: o */
    public C3306mz f22241o;

    /* JADX INFO: renamed from: p */
    public C3788zz f22242p;

    /* JADX INFO: renamed from: i */
    public AtomicBoolean f22235i = new AtomicBoolean();

    /* JADX INFO: renamed from: n */
    public long f22240n = -1;

    public zc1(AbstractC3264lu abstractC3264lu, Context context, String str, tc1 tc1Var, ud1 ud1Var, C3702xn c3702xn) {
        this.f22234h = new FrameLayout(context);
        this.f22232f = abstractC3264lu;
        this.f22233g = context;
        this.f22236j = str;
        this.f22237k = tc1Var;
        this.f22238l = ud1Var;
        ud1Var.f20286j.set(this);
        this.f22239m = c3702xn;
    }

    /* JADX INFO: renamed from: F6 */
    public static jw2 m8880F6(zc1 zc1Var) {
        return C2622l.m5279L1(zc1Var.f22233g, Collections.singletonList(zc1Var.f22242p.f16665b.f18826q.get(0)));
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: B */
    public final InterfaceC3122i mo4864B() {
        return null;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: C */
    public final InterfaceC2863b0 mo4865C() {
        return null;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: C6 */
    public final void mo4866C6(InterfaceC3177jh interfaceC3177jh) {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: D5 */
    public final void mo4867D5(InterfaceC2863b0 interfaceC2863b0) {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: E5 */
    public final void mo4868E5(ew2 ew2Var, InterfaceC3233l interfaceC3233l) {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: F2 */
    public final synchronized void mo4869F2(jw2 jw2Var) {
        C2622l.m5354d("setAdSize must be called on the main UI thread.");
    }

    /* JADX INFO: renamed from: G6 */
    public final synchronized void m8881G6(int i) {
        ar2 ar2Var;
        if (this.f22235i.compareAndSet(false, true)) {
            C3788zz c3788zz = this.f22242p;
            if (c3788zz != null && (ar2Var = c3788zz.f22455p) != null) {
                this.f22238l.f20284h.set(ar2Var);
            }
            this.f22238l.m8484c();
            this.f22234h.removeAllViews();
            C3306mz c3306mz = this.f22241o;
            if (c3306mz != null) {
                C2330u.f10884a.f10892g.m6423c(c3306mz);
            }
            if (this.f22242p != null) {
                long jMo5621a = -1;
                if (this.f22240n != -1) {
                    jMo5621a = C2330u.f10884a.f10896k.mo5621a() - this.f22240n;
                }
                this.f22242p.f22454o.m8373a(jMo5621a, i);
            }
            mo4886b();
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: H5 */
    public final void mo4872H5(C3235l1 c3235l1) {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: I4 */
    public final void mo4873I4(String str) {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: L0 */
    public final void mo4874L0(boolean z) {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: M */
    public final synchronized InterfaceC3087h1 mo4875M() {
        return null;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: P1 */
    public final void mo4876P1(InterfaceC3011f interfaceC3011f) {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: Q4 */
    public final void mo4877Q4(zq2 zq2Var) {
        this.f22238l.f20283g.set(zq2Var);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: R5 */
    public final synchronized void mo4878R5(C3012f0 c3012f0) {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: S4 */
    public final void mo4879S4(InterfaceC3123i0 interfaceC3123i0) {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g80
    /* JADX INFO: renamed from: T */
    public final void mo6949T() {
        if (this.f22242p == null) {
            return;
        }
        C2330u c2330u = C2330u.f10884a;
        this.f22240n = c2330u.f10896k.mo5621a();
        int i = this.f22242p.f22451l;
        if (i <= 0) {
            return;
        }
        C3306mz c3306mz = new C3306mz(this.f22232f.mo7625g(), c2330u.f10896k);
        this.f22241o = c3306mz;
        c3306mz.m7740a(i, new Runnable(this) { // from class: c.n.b.d.j.a.wc1

            /* JADX INFO: renamed from: f */
            public final zc1 f21033f;

            {
                this.f21033f = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zc1 zc1Var = this.f21033f;
                Objects.requireNonNull(zc1Var);
                C3331nn c3331nn = gx2.f14692a.f14693b;
                if (C3331nn.m7890h()) {
                    zc1Var.m8881G6(5);
                } else {
                    zc1Var.f22232f.mo7624f().execute(new Runnable(zc1Var) { // from class: c.n.b.d.j.a.vc1

                        /* JADX INFO: renamed from: f */
                        public final zc1 f20736f;

                        {
                            this.f20736f = zc1Var;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f20736f.m8881G6(5);
                        }
                    });
                }
            }
        });
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: T5 */
    public final void mo4880T5(InterfaceC2864b1 interfaceC2864b1) {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: U2 */
    public final void mo4881U2(InterfaceC3251lh interfaceC3251lh, String str) {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: U4 */
    public final void mo4882U4(InterfaceC3715y interfaceC3715y) {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: a */
    public final InterfaceC2799a mo4883a() {
        C2622l.m5354d("getAdFrame must be called on the main UI thread.");
        return new BinderC2800b(this.f22234h);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: a4 */
    public final void mo4884a4(InterfaceC2799a interfaceC2799a) {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: a6 */
    public final synchronized void mo4885a6(C3310n2 c3310n2) {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: b */
    public final synchronized void mo4886b() {
        C2622l.m5354d("destroy must be called on the main UI thread.");
        C3788zz c3788zz = this.f22242p;
        if (c3788zz != null) {
            c3788zz.mo7041b();
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: b0 */
    public final synchronized boolean mo4887b0() {
        return this.f22237k.mo6606a();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: b2 */
    public final boolean mo4888b2() {
        return false;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: d */
    public final synchronized void mo4889d() {
        C2622l.m5354d("pause must be called on the main UI thread.");
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p282z.p283a.InterfaceC2218b
    /* JADX INFO: renamed from: e */
    public final void mo4669e() {
        m8881G6(4);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: f */
    public final synchronized void mo4890f() {
        C2622l.m5354d("resume must be called on the main UI thread.");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: h4 */
    public final synchronized void mo4891h4(boolean z) {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: j */
    public final void mo4892j() {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: j5 */
    public final void mo4893j5(InterfaceC3122i interfaceC3122i) {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: k */
    public final Bundle mo4894k() {
        return new Bundle();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: m */
    public final synchronized void mo4895m() {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: n2 */
    public final void mo4896n2(String str) {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: o */
    public final synchronized InterfaceC2976e1 mo4897o() {
        return null;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: p */
    public final synchronized jw2 mo4898p() {
        C2622l.m5354d("getAdSize must be called on the main UI thread.");
        C3788zz c3788zz = this.f22242p;
        if (c3788zz == null) {
            return null;
        }
        return C2622l.m5279L1(this.f22233g, Collections.singletonList(c3788zz.f16665b.f18826q.get(0)));
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: p2 */
    public final void mo4899p2(InterfaceC3216kj interfaceC3216kj) {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: q */
    public final synchronized String mo4900q() {
        return null;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: r */
    public final synchronized String mo4901r() {
        return this.f22236j;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: u2 */
    public final synchronized void mo4902u2(InterfaceC3719y3 interfaceC3719y3) {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: x1 */
    public final void mo4903x1(qw2 qw2Var) {
        this.f22237k.f14540g.f14863i = qw2Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: y0 */
    public final synchronized boolean mo4904y0(ew2 ew2Var) throws RemoteException {
        C2622l.m5354d("loadAd must be called on the main UI thread.");
        C2267h1 c2267h1 = C2330u.f10884a.f10889d;
        if (C2267h1.m4749h(this.f22233g) && ew2Var.f13731x == null) {
            C2622l.m5408n3("Failed to load the ad because app ID is missing.");
            this.f22238l.mo6216o0(C2622l.m5285M2(4, null, null));
            return false;
        }
        synchronized (this) {
            if (this.f22237k.mo6606a()) {
                return false;
            }
            this.f22235i = new AtomicBoolean();
            return this.f22237k.mo6607b(ew2Var, this.f22236j, new xc1(), new yc1(this));
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: z */
    public final synchronized String mo4905z() {
        return null;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.uq2
    public final void zza() {
        m8881G6(3);
    }
}
