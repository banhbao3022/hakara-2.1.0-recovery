package p007c.p190n.p194b.p266d.p314j.p325k;

/* JADX INFO: renamed from: c.n.b.d.j.k.wa */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4396wa implements InterfaceC4356ta {

    /* JADX INFO: renamed from: a */
    public static final AbstractC4292p2<Boolean> f23592a;

    /* JADX INFO: renamed from: b */
    public static final AbstractC4292p2<Boolean> f23593b;

    /* JADX INFO: renamed from: c */
    public static final AbstractC4292p2<Boolean> f23594c;

    /* JADX INFO: renamed from: d */
    public static final AbstractC4292p2<Boolean> f23595d;

    static {
        C4362u2 c4362u2 = new C4362u2(C4250m2.m10005a("com.google.android.gms.measurement"));
        f23592a = c4362u2.m10263c("measurement.sdk.collection.enable_extend_user_property_size", true);
        f23593b = c4362u2.m10263c("measurement.sdk.collection.last_deep_link_referrer2", true);
        f23594c = c4362u2.m10263c("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        f23595d = c4362u2.m10263c("measurement.sdk.collection.last_gclid_from_referrer2", false);
        c4362u2.m10261a("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4356ta
    /* JADX INFO: renamed from: a */
    public final boolean mo10258a() {
        return f23593b.m10137d().booleanValue();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4356ta
    /* JADX INFO: renamed from: b */
    public final boolean mo10259b() {
        return f23594c.m10137d().booleanValue();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4356ta
    /* JADX INFO: renamed from: e */
    public final boolean mo10260e() {
        return f23595d.m10137d().booleanValue();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4356ta
    public final boolean zza() {
        return f23592a.m10137d().booleanValue();
    }
}
