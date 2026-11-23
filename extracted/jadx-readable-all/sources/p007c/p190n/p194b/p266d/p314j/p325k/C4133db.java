package p007c.p190n.p194b.p266d.p314j.p325k;

/* JADX INFO: renamed from: c.n.b.d.j.k.db */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4133db implements InterfaceC4147eb {

    /* JADX INFO: renamed from: a */
    public static final AbstractC4292p2<Long> f23118a;

    static {
        C4362u2 c4362u2 = new C4362u2(C4250m2.m10005a("com.google.android.gms.measurement"));
        c4362u2.m10261a("measurement.id.max_bundles_per_iteration", 0L);
        f23118a = c4362u2.m10261a("measurement.max_bundles_per_iteration", 2L);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4147eb
    public final long zza() {
        return f23118a.m10137d().longValue();
    }
}
