package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class z72 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ x82 f22195f;

    public z72(x82 x82Var) {
        this.f22195f = x82Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f22195f.f21465q) {
            if (this.f22195f.f21466r) {
                return;
            }
            this.f22195f.f21466r = true;
            try {
                x82.m8725k(this.f22195f);
            } catch (Exception e) {
                this.f22195f.f21460l.m7914c(2023, -1L, e);
            }
            synchronized (this.f22195f.f21465q) {
                this.f22195f.f21466r = false;
            }
        }
    }
}
