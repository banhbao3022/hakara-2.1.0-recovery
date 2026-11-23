package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ea0 implements j82 {

    /* JADX INFO: renamed from: a */
    public static final j82 f13535a = new ea0();

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.j82
    /* JADX INFO: renamed from: b */
    public final boolean mo5728b(int i) {
        fb0 fb0Var;
        if (i == 0) {
            fb0Var = fb0.UNKNOWN;
        } else if (i != 1) {
            fb0Var = i != 2 ? null : fb0.DISABLED;
        } else {
            fb0Var = fb0.ENABLED;
        }
        return fb0Var != null;
    }
}
