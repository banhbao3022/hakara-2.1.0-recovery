package p007c.p190n.p194b.p266d.p314j.p325k;

/* JADX INFO: renamed from: c.n.b.d.j.k.xa */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4409xa implements InterfaceC4422ya {

    /* JADX INFO: renamed from: a */
    public static final AbstractC4292p2<Boolean> f23629a;

    /* JADX INFO: renamed from: b */
    public static final AbstractC4292p2<Boolean> f23630b;

    static {
        C4362u2 c4362u2 = new C4362u2(C4250m2.m10005a("com.google.android.gms.measurement"));
        c4362u2.m10261a("measurement.id.lifecycle.app_in_background_parameter", 0L);
        f23629a = c4362u2.m10263c("measurement.lifecycle.app_backgrounded_engagement", false);
        c4362u2.m10263c("measurement.lifecycle.app_backgrounded_tracking", true);
        f23630b = c4362u2.m10263c("measurement.lifecycle.app_in_background_parameter", false);
        c4362u2.m10261a("measurement.id.lifecycle.app_backgrounded_tracking", 0L);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4422ya
    /* JADX INFO: renamed from: a */
    public final boolean mo10335a() {
        return f23630b.m10137d().booleanValue();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4422ya
    public final boolean zza() {
        return f23629a.m10137d().booleanValue();
    }
}
