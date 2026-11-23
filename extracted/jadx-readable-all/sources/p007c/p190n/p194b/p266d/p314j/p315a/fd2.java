package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class fd2<T> implements gd2<T> {

    /* JADX INFO: renamed from: a */
    public static final Object f14018a = new Object();

    /* JADX INFO: renamed from: b */
    public volatile gd2<T> f14019b;

    /* JADX INFO: renamed from: c */
    public volatile Object f14020c = f14018a;

    public fd2(gd2<T> gd2Var) {
        this.f14019b = gd2Var;
    }

    /* JADX INFO: renamed from: b */
    public static <P extends gd2<T>, T> gd2<T> m6797b(P p) {
        return ((p instanceof fd2) || (p instanceof yc2)) ? p : new fd2(p);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final T mo4613a() {
        T t = (T) this.f14020c;
        if (t != f14018a) {
            return t;
        }
        gd2<T> gd2Var = this.f14019b;
        if (gd2Var == null) {
            return (T) this.f14020c;
        }
        T tMo4613a = gd2Var.mo4613a();
        this.f14020c = tMo4613a;
        this.f14019b = null;
        return tMo4613a;
    }
}
