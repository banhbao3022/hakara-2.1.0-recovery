package p007c.p190n.p194b.p266d.p314j.p325k;

/* JADX INFO: renamed from: c.n.b.d.j.k.ea */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4146ea implements InterfaceC4104ba {

    /* JADX INFO: renamed from: a */
    public static final AbstractC4292p2<Boolean> f23134a;

    static {
        C4362u2 c4362u2 = new C4362u2(C4250m2.m10005a("com.google.android.gms.measurement"));
        f23134a = c4362u2.m10263c("measurement.client.sessions.check_on_reset_and_enable2", true);
        c4362u2.m10263c("measurement.client.sessions.check_on_startup", true);
        c4362u2.m10263c("measurement.client.sessions.start_session_before_view_screen", true);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4104ba
    /* JADX INFO: renamed from: a */
    public final boolean mo9490a() {
        return f23134a.m10137d().booleanValue();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4104ba
    public final boolean zza() {
        return true;
    }
}
