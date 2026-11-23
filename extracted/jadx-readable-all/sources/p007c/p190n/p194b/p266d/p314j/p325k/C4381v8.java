package p007c.p190n.p194b.p266d.p314j.p325k;

/* JADX INFO: renamed from: c.n.b.d.j.k.v8 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4381v8 implements InterfaceC4394w8 {

    /* JADX INFO: renamed from: a */
    public static final AbstractC4292p2<Boolean> f23572a;

    /* JADX INFO: renamed from: b */
    public static final AbstractC4292p2<Long> f23573b;

    static {
        C4362u2 c4362u2 = new C4362u2(C4250m2.m10005a("com.google.android.gms.measurement"));
        f23572a = c4362u2.m10263c("measurement.sdk.attribution.cache", true);
        f23573b = c4362u2.m10261a("measurement.sdk.attribution.cache.ttl", 604800000L);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4394w8
    /* JADX INFO: renamed from: a */
    public final long mo10293a() {
        return f23573b.m10137d().longValue();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4394w8
    public final boolean zza() {
        return f23572a.m10137d().booleanValue();
    }
}
