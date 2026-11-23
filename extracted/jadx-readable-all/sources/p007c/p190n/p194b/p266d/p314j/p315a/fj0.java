package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class fj0 implements j82 {

    /* JADX INFO: renamed from: a */
    public static final j82 f14041a = new fj0();

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.j82
    /* JADX INFO: renamed from: b */
    public final boolean mo5728b(int i) {
        gk0 gk0Var;
        if (i == 0) {
            gk0Var = gk0.ENUM_SIGNAL_SOURCE_UNKNOWN;
        } else if (i == 1) {
            gk0Var = gk0.ENUM_SIGNAL_SOURCE_DISABLE;
        } else if (i == 2) {
            gk0Var = gk0.ENUM_SIGNAL_SOURCE_ADSHIELD;
        } else if (i != 3) {
            gk0Var = i != 4 ? null : gk0.ENUM_SIGNAL_SOURCE_CALLER_PROVIDED;
        } else {
            gk0Var = gk0.ENUM_SIGNAL_SOURCE_GASS;
        }
        return gk0Var != null;
    }
}
