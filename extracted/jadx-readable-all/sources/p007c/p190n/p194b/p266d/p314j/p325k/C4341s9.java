package p007c.p190n.p194b.p266d.p314j.p325k;

/* JADX INFO: renamed from: c.n.b.d.j.k.s9 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4341s9 implements InterfaceC4299p9 {

    /* JADX INFO: renamed from: a */
    public static final AbstractC4292p2<Boolean> f23454a;

    /* JADX INFO: renamed from: b */
    public static final AbstractC4292p2<Boolean> f23455b;

    /* JADX INFO: renamed from: c */
    public static final AbstractC4292p2<Boolean> f23456c;

    static {
        C4362u2 c4362u2 = new C4362u2(C4250m2.m10005a("com.google.android.gms.measurement"));
        c4362u2.m10263c("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f23454a = c4362u2.m10263c("measurement.audience.refresh_event_count_filters_timestamp", false);
        f23455b = c4362u2.m10263c("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f23456c = c4362u2.m10263c("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4299p9
    /* JADX INFO: renamed from: a */
    public final boolean mo10140a() {
        return f23454a.m10137d().booleanValue();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4299p9
    /* JADX INFO: renamed from: b */
    public final boolean mo10141b() {
        return f23455b.m10137d().booleanValue();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4299p9
    /* JADX INFO: renamed from: e */
    public final boolean mo10142e() {
        return f23456c.m10137d().booleanValue();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4299p9
    public final boolean zza() {
        return true;
    }
}
