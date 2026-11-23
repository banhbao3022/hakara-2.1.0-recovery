package p007c.p190n.p194b.p266d.p327k.p329b;

/* JADX INFO: renamed from: c.n.b.d.k.b.k */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4565k implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ InterfaceC4697v5 f24049f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ AbstractC4541i f24050g;

    public RunnableC4565k(AbstractC4541i abstractC4541i, InterfaceC4697v5 interfaceC4697v5) {
        this.f24050g = abstractC4541i;
        this.f24049f = interfaceC4697v5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f24049f.mo10687o();
        if (C4588la.m10646a()) {
            this.f24049f.mo10686n().m10758v(this);
            return;
        }
        boolean z = this.f24050g.f23988d != 0;
        this.f24050g.f23988d = 0L;
        if (z) {
            this.f24050g.mo10482a();
        }
    }
}
