package p007c.p190n.p194b.p266d.p314j.p325k;

/* JADX INFO: renamed from: c.n.b.d.j.k.u8 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4368u8 implements InterfaceC4312q8 {

    /* JADX INFO: renamed from: a */
    public static final AbstractC4292p2<Boolean> f23504a;

    static {
        C4362u2 c4362u2 = new C4362u2(C4250m2.m10005a("com.google.android.gms.measurement"));
        f23504a = c4362u2.m10263c("measurement.service.directly_maybe_log_error_events", false);
        c4362u2.m10261a("measurement.id.service.directly_maybe_log_error_events", 0L);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4312q8
    /* JADX INFO: renamed from: a */
    public final boolean mo10172a() {
        return f23504a.m10137d().booleanValue();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4312q8
    public final boolean zza() {
        return true;
    }
}
