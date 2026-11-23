package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class iu1 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ kv1 f15389f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f15390g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ ku1 f15391h;

    public iu1(ku1 ku1Var, kv1 kv1Var, int i) {
        this.f15391h = ku1Var;
        this.f15389f = kv1Var;
        this.f15390g = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.f15389f.isCancelled()) {
                ku1 ku1Var = this.f15391h;
                ku1Var.f16040r = null;
                ku1Var.cancel(false);
            } else {
                this.f15391h.m7557w(this.f15390g, this.f15389f);
            }
        } finally {
            ku1.m7550s(this.f15391h, null);
        }
    }
}
