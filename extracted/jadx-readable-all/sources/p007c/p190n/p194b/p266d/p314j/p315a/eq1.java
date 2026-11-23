package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class eq1 implements j82 {

    /* JADX INFO: renamed from: a */
    public static final j82 f13647a = new eq1();

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.j82
    /* JADX INFO: renamed from: b */
    public final boolean mo5728b(int i) {
        fq1 fq1Var;
        if (i != 1) {
            fq1Var = i != 2 ? null : fq1.BLOCKED_REASON_BACKGROUND;
        } else {
            fq1Var = fq1.BLOCKED_REASON_UNKNOWN;
        }
        return fq1Var != null;
    }
}
