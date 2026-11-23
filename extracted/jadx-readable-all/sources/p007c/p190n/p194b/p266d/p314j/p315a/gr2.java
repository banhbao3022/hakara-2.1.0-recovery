package p007c.p190n.p194b.p266d.p314j.p315a;

import p007c.p190n.p194b.p266d.p298f.C2602b;
import p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class gr2 implements AbstractC2717c.b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ hr2 f14656a;

    public gr2(hr2 hr2Var) {
        this.f14656a = hr2Var;
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c.b
    /* JADX INFO: renamed from: W */
    public final void mo5565W(C2602b c2602b) {
        synchronized (this.f14656a.f14949b) {
            try {
                hr2 hr2Var = this.f14656a;
                hr2Var.f14952e = null;
                if (hr2Var.f14950c != null) {
                    hr2Var.f14950c = null;
                }
                hr2Var.f14949b.notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
