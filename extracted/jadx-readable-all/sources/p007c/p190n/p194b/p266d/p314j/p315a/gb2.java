package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class gb2 implements j82 {

    /* JADX INFO: renamed from: a */
    public static final j82 f14531a = new gb2();

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.j82
    /* JADX INFO: renamed from: b */
    public final boolean mo5728b(int i) {
        hb2 hb2Var;
        if (i == 0) {
            hb2Var = hb2.SAFE;
        } else if (i == 1) {
            hb2Var = hb2.DANGEROUS;
        } else if (i == 2) {
            hb2Var = hb2.UNKNOWN;
        } else if (i != 3) {
            hb2Var = i != 4 ? null : hb2.DANGEROUS_HOST;
        } else {
            hb2Var = hb2.POTENTIALLY_UNWANTED;
        }
        return hb2Var != null;
    }
}
