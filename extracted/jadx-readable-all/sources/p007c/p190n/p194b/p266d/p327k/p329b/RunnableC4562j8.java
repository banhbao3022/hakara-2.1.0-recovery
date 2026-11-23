package p007c.p190n.p194b.p266d.p327k.p329b;

/* JADX INFO: renamed from: c.n.b.d.k.b.j8 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4562j8 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ boolean f24036f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C4624oa f24037g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C4480ca f24038h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C4624oa f24039i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C4677t7 f24040j;

    public RunnableC4562j8(C4677t7 c4677t7, boolean z, C4624oa c4624oa, C4480ca c4480ca, C4624oa c4624oa2) {
        this.f24040j = c4677t7;
        this.f24036f = z;
        this.f24037g = c4624oa;
        this.f24038h = c4480ca;
        this.f24039i = c4624oa2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        C4677t7 c4677t7 = this.f24040j;
        InterfaceC4569k3 interfaceC4569k3 = c4677t7.f24455d;
        if (interfaceC4569k3 == null) {
            c4677t7.mo10684l().f24418f.m10811a("Discarding data. Failed to send conditional user property to service");
        } else {
            c4677t7.m10776w(interfaceC4569k3, this.f24036f ? null : this.f24037g, this.f24038h);
            this.f24040j.m10772F();
        }
    }
}
