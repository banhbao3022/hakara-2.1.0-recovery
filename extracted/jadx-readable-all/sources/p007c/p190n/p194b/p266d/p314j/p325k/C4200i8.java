package p007c.p190n.p194b.p266d.p314j.p325k;

/* JADX INFO: renamed from: c.n.b.d.j.k.i8 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4200i8 implements InterfaceC4214j8 {

    /* JADX INFO: renamed from: a */
    public static final AbstractC4292p2<Boolean> f23237a;

    /* JADX INFO: renamed from: b */
    public static final AbstractC4292p2<Boolean> f23238b;

    /* JADX INFO: renamed from: c */
    public static final AbstractC4292p2<Boolean> f23239c;

    static {
        C4362u2 c4362u2 = new C4362u2(C4250m2.m10005a("com.google.android.gms.measurement"));
        f23237a = c4362u2.m10263c("measurement.client.ad_impression", true);
        f23238b = c4362u2.m10263c("measurement.service.separate_public_internal_event_blacklisting", true);
        f23239c = c4362u2.m10263c("measurement.service.ad_impression", true);
        c4362u2.m10261a("measurement.id.service.ad_impression", 0L);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4214j8
    /* JADX INFO: renamed from: a */
    public final boolean mo9836a() {
        return f23237a.m10137d().booleanValue();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4214j8
    /* JADX INFO: renamed from: b */
    public final boolean mo9837b() {
        return f23238b.m10137d().booleanValue();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4214j8
    /* JADX INFO: renamed from: e */
    public final boolean mo9838e() {
        return f23239c.m10137d().booleanValue();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4214j8
    public final boolean zza() {
        return true;
    }
}
