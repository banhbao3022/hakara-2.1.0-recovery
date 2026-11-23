package p007c.p190n.p194b.p266d.p314j.p325k;

/* JADX INFO: renamed from: c.n.b.d.j.k.g9 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4173g9 implements InterfaceC4131d9 {

    /* JADX INFO: renamed from: a */
    public static final AbstractC4292p2<Boolean> f23187a;

    /* JADX INFO: renamed from: b */
    public static final AbstractC4292p2<Boolean> f23188b;

    /* JADX INFO: renamed from: c */
    public static final AbstractC4292p2<Boolean> f23189c;

    /* JADX INFO: renamed from: d */
    public static final AbstractC4292p2<Long> f23190d;

    static {
        C4362u2 c4362u2 = new C4362u2(C4250m2.m10005a("com.google.android.gms.measurement"));
        f23187a = c4362u2.m10263c("measurement.client.consent_state_v1", false);
        f23188b = c4362u2.m10263c("measurement.client.3p_consent_state_v1", false);
        f23189c = c4362u2.m10263c("measurement.service.consent_state_v1_W36", false);
        c4362u2.m10261a("measurement.id.service.consent_state_v1_W36", 0L);
        f23190d = c4362u2.m10261a("measurement.service.storage_consent_support_version", 203590L);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4131d9
    /* JADX INFO: renamed from: a */
    public final boolean mo9548a() {
        return f23187a.m10137d().booleanValue();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4131d9
    /* JADX INFO: renamed from: b */
    public final boolean mo9549b() {
        return f23188b.m10137d().booleanValue();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4131d9
    /* JADX INFO: renamed from: c */
    public final long mo9550c() {
        return f23190d.m10137d().longValue();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4131d9
    /* JADX INFO: renamed from: e */
    public final boolean mo9551e() {
        return f23189c.m10137d().booleanValue();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4131d9
    public final boolean zza() {
        return true;
    }
}
