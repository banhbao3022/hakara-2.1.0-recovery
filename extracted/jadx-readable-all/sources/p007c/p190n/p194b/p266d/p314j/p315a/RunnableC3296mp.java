package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: renamed from: c.n.b.d.j.a.mp */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3296mp implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ boolean f16817f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C3333np f16818g;

    public RunnableC3296mp(C3333np c3333np, boolean z) {
        this.f16818g = c3333np;
        this.f16817f = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16818g.m7900c("windowVisibilityChanged", "isVisible", String.valueOf(this.f16817f));
    }
}
