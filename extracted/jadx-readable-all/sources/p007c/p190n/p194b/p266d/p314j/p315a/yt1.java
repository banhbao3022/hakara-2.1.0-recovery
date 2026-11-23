package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class yt1 extends st1 {
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.st1
    /* JADX INFO: renamed from: a */
    public final void mo6100a(cu1 cu1Var, Thread thread) {
        cu1Var.f13121b = thread;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.st1
    /* JADX INFO: renamed from: b */
    public final void mo6101b(cu1 cu1Var, cu1 cu1Var2) {
        cu1Var.f13122c = cu1Var2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.st1
    /* JADX INFO: renamed from: c */
    public final boolean mo6102c(du1<?> du1Var, cu1 cu1Var, cu1 cu1Var2) {
        synchronized (du1Var) {
            if (du1Var.f13395l != cu1Var) {
                return false;
            }
            du1Var.f13395l = cu1Var2;
            return true;
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.st1
    /* JADX INFO: renamed from: d */
    public final boolean mo6103d(du1<?> du1Var, vt1 vt1Var, vt1 vt1Var2) {
        synchronized (du1Var) {
            if (du1Var.f13394k != vt1Var) {
                return false;
            }
            du1Var.f13394k = vt1Var2;
            return true;
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.st1
    /* JADX INFO: renamed from: e */
    public final boolean mo6104e(du1<?> du1Var, Object obj, Object obj2) {
        synchronized (du1Var) {
            if (du1Var.f13393j != obj) {
                return false;
            }
            du1Var.f13393j = obj2;
            return true;
        }
    }
}
