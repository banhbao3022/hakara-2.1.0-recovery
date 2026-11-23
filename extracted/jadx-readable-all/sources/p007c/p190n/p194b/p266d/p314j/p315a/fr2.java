package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Bundle;
import android.os.DeadObjectException;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class fr2 implements AbstractC2717c.a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ hr2 f14106a;

    public fr2(hr2 hr2Var) {
        this.f14106a = hr2Var;
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c.a
    /* JADX INFO: renamed from: Q */
    public final void mo5562Q(int i) {
        synchronized (this.f14106a.f14949b) {
            hr2 hr2Var = this.f14106a;
            hr2Var.f14952e = null;
            hr2Var.f14949b.notifyAll();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c.a
    /* JADX INFO: renamed from: c0 */
    public final void mo5563c0(Bundle bundle) {
        synchronized (this.f14106a.f14949b) {
            try {
                hr2 hr2Var = this.f14106a;
                kr2 kr2Var = hr2Var.f14950c;
                if (kr2Var != null) {
                    hr2Var.f14952e = (nr2) kr2Var.m5581u();
                }
            } catch (DeadObjectException e) {
                C2622l.m5438t3("Unable to obtain a cache service instance.", e);
                hr2.m7158c(this.f14106a);
            }
            this.f14106a.f14949b.notifyAll();
        }
    }
}
