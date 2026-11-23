package p007c.p190n.p194b.p266d.p327k.p329b;

/* JADX INFO: renamed from: c.n.b.d.k.b.g8 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4526g8 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ boolean f23944f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C4625p f23945g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C4480ca f23946h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ String f23947i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C4677t7 f23948j;

    public RunnableC4526g8(C4677t7 c4677t7, boolean z, boolean z2, C4625p c4625p, C4480ca c4480ca, String str) {
        this.f23948j = c4677t7;
        this.f23944f = z2;
        this.f23945g = c4625p;
        this.f23946h = c4480ca;
        this.f23947i = str;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        C4677t7 c4677t7 = this.f23948j;
        InterfaceC4569k3 interfaceC4569k3 = c4677t7.f24455d;
        if (interfaceC4569k3 == null) {
            c4677t7.mo10684l().f24418f.m10811a("Discarding data. Failed to send event to service");
        } else {
            c4677t7.m10776w(interfaceC4569k3, this.f23944f ? null : this.f23945g, this.f23946h);
            this.f23948j.m10772F();
        }
    }
}
