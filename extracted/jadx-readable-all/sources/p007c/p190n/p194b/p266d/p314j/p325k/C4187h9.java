package p007c.p190n.p194b.p266d.p314j.p325k;

/* JADX INFO: renamed from: c.n.b.d.j.k.h9 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4187h9 implements InterfaceC4201i9 {

    /* JADX INFO: renamed from: a */
    public static final AbstractC4292p2<Boolean> f23226a;

    static {
        C4362u2 c4362u2 = new C4362u2(C4250m2.m10005a("com.google.android.gms.measurement"));
        f23226a = c4362u2.m10263c("measurement.sdk.dynamite.allow_remote_dynamite3", true);
        c4362u2.m10263c("measurement.collection.init_params_control_enabled", true);
        c4362u2.m10263c("measurement.sdk.dynamite.use_dynamite3", true);
        c4362u2.m10261a("measurement.id.sdk.dynamite.use_dynamite", 0L);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4201i9
    public final boolean zza() {
        return f23226a.m10137d().booleanValue();
    }
}
