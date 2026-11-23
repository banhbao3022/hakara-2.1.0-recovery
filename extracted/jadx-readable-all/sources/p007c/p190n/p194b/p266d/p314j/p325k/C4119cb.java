package p007c.p190n.p194b.p266d.p314j.p325k;

/* JADX INFO: renamed from: c.n.b.d.j.k.cb */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4119cb implements InterfaceC4435za {

    /* JADX INFO: renamed from: a */
    public static final AbstractC4292p2<Boolean> f23106a;

    /* JADX INFO: renamed from: b */
    public static final AbstractC4292p2<Boolean> f23107b;

    static {
        C4362u2 c4362u2 = new C4362u2(C4250m2.m10005a("com.google.android.gms.measurement"));
        f23106a = c4362u2.m10263c("measurement.sdk.screen.manual_screen_view_logging", true);
        f23107b = c4362u2.m10263c("measurement.sdk.screen.disabling_automatic_reporting", true);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4435za
    /* JADX INFO: renamed from: a */
    public final boolean mo9506a() {
        return f23106a.m10137d().booleanValue();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4435za
    /* JADX INFO: renamed from: b */
    public final boolean mo9507b() {
        return f23107b.m10137d().booleanValue();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4435za
    public final boolean zza() {
        return true;
    }
}
