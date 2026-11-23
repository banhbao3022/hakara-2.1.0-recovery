package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class xc2<T> implements zc2<T> {

    /* JADX INFO: renamed from: a */
    public gd2<T> f21485a;

    /* JADX INFO: renamed from: b */
    public static <T> void m8732b(gd2<T> gd2Var, gd2<T> gd2Var2) {
        xc2 xc2Var = (xc2) gd2Var;
        if (xc2Var.f21485a != null) {
            throw new IllegalStateException();
        }
        xc2Var.f21485a = gd2Var2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final T mo4613a() {
        gd2<T> gd2Var = this.f21485a;
        if (gd2Var != null) {
            return gd2Var.mo4613a();
        }
        throw new IllegalStateException();
    }
}
