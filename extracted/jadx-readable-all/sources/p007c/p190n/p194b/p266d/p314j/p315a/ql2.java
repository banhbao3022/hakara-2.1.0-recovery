package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ql2 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ tl2 f18377f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ vl2 f18378g;

    public ql2(vl2 vl2Var, tl2 tl2Var) {
        this.f18378g = vl2Var;
        this.f18377f = tl2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tl2 tl2Var = this.f18377f;
        if (tl2Var.f19910c != null) {
            tl2Var.f19910c = null;
        }
        int size = this.f18378g.f20853s.size();
        for (int i = 0; i < size; i++) {
            this.f18378g.f20853s.valueAt(i).m7520f();
        }
    }
}
