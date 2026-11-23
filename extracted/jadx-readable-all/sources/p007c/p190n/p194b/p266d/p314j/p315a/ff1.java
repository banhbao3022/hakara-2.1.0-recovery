package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ff1 implements j82 {

    /* JADX INFO: renamed from: a */
    public static final j82 f14030a = new ff1();

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.j82
    /* JADX INFO: renamed from: b */
    public final boolean mo5728b(int i) {
        dg1 dg1Var;
        if (i == 0) {
            dg1Var = dg1.UNKNOWN_PROTO;
        } else if (i == 1) {
            dg1Var = dg1.AFMA_SIGNALS;
        } else if (i != 2) {
            dg1Var = i != 3 ? null : dg1.PARTNER_SIGNALS;
        } else {
            dg1Var = dg1.UNITY_SIGNALS;
        }
        return dg1Var != null;
    }
}
