package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class i91 implements j82 {

    /* JADX INFO: renamed from: a */
    public static final j82 f15112a = new i91();

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.j82
    /* JADX INFO: renamed from: b */
    public final boolean mo5728b(int i) {
        ja1 ja1Var;
        if (i == 0) {
            ja1Var = ja1.UNKNOWN_ENCRYPTION_METHOD;
        } else if (i == 1) {
            ja1Var = ja1.BITSLICER;
        } else if (i == 2) {
            ja1Var = ja1.TINK_HYBRID;
        } else if (i == 3) {
            ja1Var = ja1.UNENCRYPTED;
        } else if (i != 4) {
            ja1Var = i != 5 ? null : ja1.DG_XTEA;
        } else {
            ja1Var = ja1.DG;
        }
        return ja1Var != null;
    }
}
