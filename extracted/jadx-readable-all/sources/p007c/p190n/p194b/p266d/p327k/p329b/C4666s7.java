package p007c.p190n.p194b.p266d.p327k.p329b;

/* JADX INFO: renamed from: c.n.b.d.k.b.s7 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4666s7 extends AbstractC4541i {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C4677t7 f24430e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4666s7(C4677t7 c4677t7, InterfaceC4697v5 interfaceC4697v5) {
        super(interfaceC4697v5);
        this.f24430e = c4677t7;
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.AbstractC4541i
    /* JADX INFO: renamed from: a */
    public final void mo10482a() {
        C4677t7 c4677t7 = this.f24430e;
        c4677t7.mo10381b();
        if (c4677t7.m10768B()) {
            c4677t7.mo10684l().f24426n.m10811a("Inactivity, disconnecting from the service");
            c4677t7.m10770D();
        }
    }
}
