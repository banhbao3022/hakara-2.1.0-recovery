package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class xt1<V> implements Runnable {

    /* JADX INFO: renamed from: f */
    public final du1<V> f21672f;

    /* JADX INFO: renamed from: g */
    public final kv1<? extends V> f21673g;

    public xt1(du1<V> du1Var, kv1<? extends V> kv1Var) {
        this.f21672f = du1Var;
        this.f21673g = kv1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f21672f.f13393j != this) {
            return;
        }
        if (du1.f13391h.mo6104e(this.f21672f, this, du1.m6523e(this.f21673g))) {
            du1.m6525q(this.f21672f);
        }
    }
}
