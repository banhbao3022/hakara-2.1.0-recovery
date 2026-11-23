package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class kc1 implements j82 {

    /* JADX INFO: renamed from: a */
    public static final j82 f15916a = new kc1();

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.j82
    /* JADX INFO: renamed from: b */
    public final boolean mo5728b(int i) {
        hd1 hd1Var;
        if (i == 0) {
            hd1Var = hd1.ENUM_FALSE;
        } else if (i == 1) {
            hd1Var = hd1.ENUM_TRUE;
        } else if (i != 2) {
            hd1Var = i != 1000 ? null : hd1.ENUM_UNKNOWN;
        } else {
            hd1Var = hd1.ENUM_FAILURE;
        }
        return hd1Var != null;
    }
}
