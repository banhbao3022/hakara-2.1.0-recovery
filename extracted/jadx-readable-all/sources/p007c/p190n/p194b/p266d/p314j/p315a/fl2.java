package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class fl2 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AbstractC3679x0 f14055f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ fm2 f14056g;

    public fl2(fm2 fm2Var, AbstractC3679x0 abstractC3679x0) {
        this.f14056g = fm2Var;
        this.f14055f = abstractC3679x0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f14056g.f14061h.put(this.f14055f);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
