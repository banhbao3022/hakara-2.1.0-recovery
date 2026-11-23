package p007c.p190n.p194b.p266d.p314j.p325k;

/* JADX INFO: renamed from: c.n.b.d.j.k.jb */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4217jb implements InterfaceC4231kb {

    /* JADX INFO: renamed from: a */
    public static final AbstractC4292p2<Boolean> f23256a;

    /* JADX INFO: renamed from: b */
    public static final AbstractC4292p2<Double> f23257b;

    /* JADX INFO: renamed from: c */
    public static final AbstractC4292p2<Long> f23258c;

    /* JADX INFO: renamed from: d */
    public static final AbstractC4292p2<Long> f23259d;

    /* JADX INFO: renamed from: e */
    public static final AbstractC4292p2<String> f23260e;

    static {
        C4362u2 c4362u2 = new C4362u2(C4250m2.m10005a("com.google.android.gms.measurement"));
        f23256a = c4362u2.m10263c("measurement.test.boolean_flag", false);
        Object obj = AbstractC4292p2.f23392a;
        f23257b = new C4334s2(c4362u2, "measurement.test.double_flag", Double.valueOf(-3.0d));
        f23258c = c4362u2.m10261a("measurement.test.int_flag", -2L);
        f23259d = c4362u2.m10261a("measurement.test.long_flag", -1L);
        f23260e = c4362u2.m10262b("measurement.test.string_flag", "---");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4231kb
    /* JADX INFO: renamed from: a */
    public final double mo9908a() {
        return f23257b.m10137d().doubleValue();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4231kb
    /* JADX INFO: renamed from: b */
    public final long mo9909b() {
        return f23258c.m10137d().longValue();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4231kb
    /* JADX INFO: renamed from: c */
    public final String mo9910c() {
        return f23260e.m10137d();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4231kb
    /* JADX INFO: renamed from: e */
    public final long mo9911e() {
        return f23259d.m10137d().longValue();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4231kb
    public final boolean zza() {
        return f23256a.m10137d().booleanValue();
    }
}
