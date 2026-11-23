package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class nu1 extends lu1 {
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.lu1
    /* JADX INFO: renamed from: a */
    public final void mo7645a(ou1 ou1Var, Set<Throwable> set, Set<Throwable> set2) {
        synchronized (ou1Var) {
            if (ou1Var.f17739o == null) {
                ou1Var.f17739o = set2;
            }
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.lu1
    /* JADX INFO: renamed from: b */
    public final int mo7646b(ou1 ou1Var) {
        int i;
        synchronized (ou1Var) {
            i = ou1Var.f17740p - 1;
            ou1Var.f17740p = i;
        }
        return i;
    }
}
