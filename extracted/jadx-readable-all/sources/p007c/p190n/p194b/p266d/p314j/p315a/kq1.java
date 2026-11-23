package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class kq1 implements j82 {

    /* JADX INFO: renamed from: a */
    public static final j82 f16018a = new kq1();

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.j82
    /* JADX INFO: renamed from: b */
    public final boolean mo5728b(int i) {
        lq1 lq1Var;
        if (i != 0) {
            lq1Var = i != 1 ? null : lq1.BLOCKED_IMPRESSION;
        } else {
            lq1Var = lq1.EVENT_TYPE_UNKNOWN;
        }
        return lq1Var != null;
    }
}
