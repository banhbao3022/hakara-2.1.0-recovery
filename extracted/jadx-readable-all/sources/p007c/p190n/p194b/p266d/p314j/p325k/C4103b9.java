package p007c.p190n.p194b.p266d.p314j.p325k;

/* JADX INFO: renamed from: c.n.b.d.j.k.b9 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4103b9 implements InterfaceC4117c9 {

    /* JADX INFO: renamed from: a */
    public static final AbstractC4292p2<Boolean> f23093a;

    /* JADX INFO: renamed from: b */
    public static final AbstractC4292p2<Boolean> f23094b;

    static {
        C4362u2 c4362u2 = new C4362u2(C4250m2.m10005a("com.google.android.gms.measurement"));
        f23093a = c4362u2.m10263c("measurement.service.configurable_service_limits", true);
        f23094b = c4362u2.m10263c("measurement.client.configurable_service_limits", true);
        c4362u2.m10261a("measurement.id.service.configurable_service_limits", 0L);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4117c9
    /* JADX INFO: renamed from: a */
    public final boolean mo9488a() {
        return f23093a.m10137d().booleanValue();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4117c9
    /* JADX INFO: renamed from: b */
    public final boolean mo9489b() {
        return f23094b.m10137d().booleanValue();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4117c9
    public final boolean zza() {
        return true;
    }
}
