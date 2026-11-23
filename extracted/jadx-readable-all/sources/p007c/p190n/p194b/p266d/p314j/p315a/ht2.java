package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ht2 implements j82 {

    /* JADX INFO: renamed from: a */
    public static final j82 f15014a = new ht2();

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.j82
    /* JADX INFO: renamed from: b */
    public final boolean mo5728b(int i) {
        it2 it2Var;
        if (i == 0) {
            it2Var = it2.PLATFORM_UNSPECIFIED;
        } else if (i != 1) {
            it2Var = i != 2 ? null : it2.ANDROID;
        } else {
            it2Var = it2.IOS;
        }
        return it2Var != null;
    }
}
