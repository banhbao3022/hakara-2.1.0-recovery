package p007c.p190n.p194b.p266d.p327k.p329b;

/* JADX INFO: renamed from: c.n.b.d.k.b.u7 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4688u7 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ boolean f24479f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C4712w9 f24480g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C4480ca f24481h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C4677t7 f24482i;

    public RunnableC4688u7(C4677t7 c4677t7, boolean z, C4712w9 c4712w9, C4480ca c4480ca) {
        this.f24482i = c4677t7;
        this.f24479f = z;
        this.f24480g = c4712w9;
        this.f24481h = c4480ca;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        C4677t7 c4677t7 = this.f24482i;
        InterfaceC4569k3 interfaceC4569k3 = c4677t7.f24455d;
        if (interfaceC4569k3 == null) {
            c4677t7.mo10684l().f24418f.m10811a("Discarding data. Failed to set user property");
        } else {
            c4677t7.m10776w(interfaceC4569k3, this.f24479f ? null : this.f24480g, this.f24481h);
            this.f24482i.m10772F();
        }
    }
}
