package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicBoolean;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p283a.InterfaceC2235r;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2267h1;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ce1 extends AbstractBinderC3566u implements InterfaceC2235r, uq2 {

    /* JADX INFO: renamed from: f */
    public final AbstractC3264lu f12984f;

    /* JADX INFO: renamed from: g */
    public final Context f12985g;

    /* JADX INFO: renamed from: i */
    public final String f12987i;

    /* JADX INFO: renamed from: j */
    public final wd1 f12988j;

    /* JADX INFO: renamed from: k */
    public final ud1 f12989k;

    /* JADX INFO: renamed from: m */
    public C3306mz f12991m;

    /* JADX INFO: renamed from: n */
    public h00 f12992n;

    /* JADX INFO: renamed from: h */
    public AtomicBoolean f12986h = new AtomicBoolean();

    /* JADX INFO: renamed from: l */
    public long f12990l = -1;

    public ce1(AbstractC3264lu abstractC3264lu, Context context, String str, wd1 wd1Var, ud1 ud1Var) {
        this.f12984f = abstractC3264lu;
        this.f12985g = context;
        this.f12987i = str;
        this.f12988j = wd1Var;
        this.f12989k = ud1Var;
        ud1Var.f20287k.set(this);
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

    @Override // p007c.p190n.p194b.p266d.p267a.p282z.p283a.InterfaceC2235r
    /* JADX INFO: renamed from: F3 */
    public final synchronized void mo4698F3() {
        if (this.f12992n == null) {
            return;
        }
        C2330u c2330u = C2330u.f10884a;
        this.f12990l = c2330u.f10896k.mo5621a();
        int i = this.f12992n.f14712j;
        if (i <= 0) {
            return;
        }
        C3306mz c3306mz = new C3306mz(this.f12984f.mo7625g(), c2330u.f10896k);
        this.f12991m = c3306mz;
        c3306mz.m7740a(i, new Runnable(this) { // from class: c.n.b.d.j.a.zd1

            /* JADX INFO: renamed from: f */
            public final ce1 f22243f;

            {
                this.f22243f = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ce1 ce1Var = this.f22243f;
                ce1Var.f12984f.mo7624f().execute(new Runnable(ce1Var) { // from class: c.n.b.d.j.a.yd1

                    /* JADX INFO: renamed from: f */
                    public final ce1 f21856f;

                    {
                        this.f21856f = ce1Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f21856f.m6172F6(5);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: F6 */
    public final synchronized void m6172F6(int i) {
        if (this.f12986h.compareAndSet(false, true)) {
            this.f12989k.m8484c();
            C3306mz c3306mz = this.f12991m;
            if (c3306mz != null) {
                C2330u.f10884a.f10892g.m6423c(c3306mz);
            }
            if (this.f12992n != null) {
                long jMo5621a = -1;
                if (this.f12990l != -1) {
                    jMo5621a = C2330u.f10884a.f10896k.mo5621a() - this.f12990l;
                }
                this.f12992n.f14714l.m8373a(jMo5621a, i);
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

    @Override // p007c.p190n.p194b.p266d.p267a.p282z.p283a.InterfaceC2235r
    /* JADX INFO: renamed from: J3 */
    public final void mo4699J3(int i) {
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            m6172F6(2);
            return;
        }
        if (i2 == 1) {
            m6172F6(4);
        } else if (i2 == 2) {
            m6172F6(3);
        } else {
            if (i2 != 3) {
                return;
            }
            m6172F6(6);
        }
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

    @Override // p007c.p190n.p194b.p266d.p267a.p282z.p283a.InterfaceC2235r
    /* JADX INFO: renamed from: O5 */
    public final void mo4700O5() {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: P1 */
    public final void mo4876P1(InterfaceC3011f interfaceC3011f) {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: Q4 */
    public final void mo4877Q4(zq2 zq2Var) {
        this.f12989k.f20283g.set(zq2Var);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: R5 */
    public final synchronized void mo4878R5(C3012f0 c3012f0) {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: S4 */
    public final void mo4879S4(InterfaceC3123i0 interfaceC3123i0) {
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
        return null;
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
        h00 h00Var = this.f12992n;
        if (h00Var != null) {
            h00Var.mo7041b();
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: b0 */
    public final synchronized boolean mo4887b0() {
        return this.f12988j.mo6606a();
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

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: f */
    public final synchronized void mo4890f() {
        C2622l.m5354d("resume must be called on the main UI thread.");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: h4 */
    public final synchronized void mo4891h4(boolean z) {
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p282z.p283a.InterfaceC2235r
    /* JADX INFO: renamed from: i1 */
    public final void mo4701i1() {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: j */
    public final synchronized void mo4892j() {
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
        return null;
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
        return this.f12987i;
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p282z.p283a.InterfaceC2235r
    /* JADX INFO: renamed from: r0 */
    public final synchronized void mo4702r0() {
        h00 h00Var = this.f12992n;
        if (h00Var != null) {
            h00Var.f14714l.m8373a(C2330u.f10884a.f10896k.mo5621a() - this.f12990l, 1);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: u2 */
    public final synchronized void mo4902u2(InterfaceC3719y3 interfaceC3719y3) {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: x1 */
    public final void mo4903x1(qw2 qw2Var) {
        this.f12988j.f14540g.f14863i = qw2Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: y0 */
    public final synchronized boolean mo4904y0(ew2 ew2Var) throws RemoteException {
        C2622l.m5354d("loadAd must be called on the main UI thread.");
        C2267h1 c2267h1 = C2330u.f10884a.f10889d;
        if (C2267h1.m4749h(this.f12985g) && ew2Var.f13731x == null) {
            C2622l.m5408n3("Failed to load the ad because app ID is missing.");
            this.f12989k.mo6216o0(C2622l.m5285M2(4, null, null));
            return false;
        }
        synchronized (this) {
            if (this.f12988j.mo6606a()) {
                return false;
            }
            this.f12986h = new AtomicBoolean();
            return this.f12988j.mo6607b(ew2Var, this.f12987i, new ae1(), new be1(this));
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: z */
    public final synchronized String mo4905z() {
        return null;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.uq2
    public final void zza() {
        m6172F6(3);
    }
}
