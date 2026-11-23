package p007c.p190n.p194b.p266d.p314j.p325k;

/* JADX INFO: renamed from: c.n.b.d.j.k.o8 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4284o8 implements InterfaceC4298p8 {

    /* JADX INFO: renamed from: a */
    public static final AbstractC4292p2<Boolean> f23386a;

    static {
        C4362u2 c4362u2 = new C4362u2(C4250m2.m10005a("com.google.android.gms.measurement"));
        f23386a = c4362u2.m10263c("measurement.androidId.delete_feature", true);
        c4362u2.m10263c("measurement.log_androidId_enabled", false);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4298p8
    public final boolean zza() {
        return f23386a.m10137d().booleanValue();
    }
}
