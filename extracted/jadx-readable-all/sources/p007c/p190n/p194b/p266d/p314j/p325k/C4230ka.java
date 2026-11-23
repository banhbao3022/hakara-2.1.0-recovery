package p007c.p190n.p194b.p266d.p314j.p325k;

/* JADX INFO: renamed from: c.n.b.d.j.k.ka */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4230ka implements InterfaceC4188ha {

    /* JADX INFO: renamed from: a */
    public static final AbstractC4292p2<Boolean> f23273a;

    /* JADX INFO: renamed from: b */
    public static final AbstractC4292p2<Boolean> f23274b;

    static {
        C4362u2 c4362u2 = new C4362u2(C4250m2.m10005a("com.google.android.gms.measurement"));
        f23273a = c4362u2.m10263c("measurement.collection.efficient_engagement_reporting_enabled_2", true);
        f23274b = c4362u2.m10263c("measurement.collection.redundant_engagement_removal_enabled", false);
        c4362u2.m10261a("measurement.id.collection.redundant_engagement_removal_enabled", 0L);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4188ha
    /* JADX INFO: renamed from: a */
    public final boolean mo9831a() {
        return f23274b.m10137d().booleanValue();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4188ha
    public final boolean zza() {
        return f23273a.m10137d().booleanValue();
    }
}
