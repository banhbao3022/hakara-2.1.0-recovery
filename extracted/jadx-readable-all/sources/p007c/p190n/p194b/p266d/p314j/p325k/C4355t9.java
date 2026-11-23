package p007c.p190n.p194b.p266d.p314j.p325k;

/* JADX INFO: renamed from: c.n.b.d.j.k.t9 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4355t9 implements InterfaceC4369u9 {

    /* JADX INFO: renamed from: a */
    public static final AbstractC4292p2<Boolean> f23487a;

    static {
        C4362u2 c4362u2 = new C4362u2(C4250m2.m10005a("com.google.android.gms.measurement"));
        f23487a = c4362u2.m10263c("measurement.sdk.referrer.delayed_install_referrer_api", false);
        c4362u2.m10261a("measurement.id.sdk.referrer.delayed_install_referrer_api", 0L);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4369u9
    /* JADX INFO: renamed from: a */
    public final boolean mo10257a() {
        return f23487a.m10137d().booleanValue();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4369u9
    public final boolean zza() {
        return true;
    }
}
