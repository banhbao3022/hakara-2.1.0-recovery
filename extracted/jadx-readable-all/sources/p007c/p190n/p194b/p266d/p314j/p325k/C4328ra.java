package p007c.p190n.p194b.p266d.p314j.p325k;

/* JADX INFO: renamed from: c.n.b.d.j.k.ra */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4328ra implements InterfaceC4342sa {

    /* JADX INFO: renamed from: a */
    public static final AbstractC4292p2<Boolean> f23438a;

    /* JADX INFO: renamed from: b */
    public static final AbstractC4292p2<Boolean> f23439b;

    /* JADX INFO: renamed from: c */
    public static final AbstractC4292p2<Boolean> f23440c;

    static {
        C4362u2 c4362u2 = new C4362u2(C4250m2.m10005a("com.google.android.gms.measurement"));
        f23438a = c4362u2.m10263c("measurement.client.global_params", true);
        f23439b = c4362u2.m10263c("measurement.service.global_params_in_payload", true);
        f23440c = c4362u2.m10263c("measurement.service.global_params", true);
        c4362u2.m10261a("measurement.id.service.global_params", 0L);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4342sa
    /* JADX INFO: renamed from: a */
    public final boolean mo10187a() {
        return f23438a.m10137d().booleanValue();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4342sa
    /* JADX INFO: renamed from: b */
    public final boolean mo10188b() {
        return f23439b.m10137d().booleanValue();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4342sa
    /* JADX INFO: renamed from: e */
    public final boolean mo10189e() {
        return f23440c.m10137d().booleanValue();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4342sa
    public final boolean zza() {
        return true;
    }
}
