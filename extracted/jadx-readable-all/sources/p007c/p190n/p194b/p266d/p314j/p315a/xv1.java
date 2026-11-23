package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class xv1 extends jv1 {

    /* JADX INFO: renamed from: i */
    public final Callable f21701i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ yv1 f21702j;

    public xv1(yv1 yv1Var, Callable callable) {
        this.f21702j = yv1Var;
        Objects.requireNonNull(callable);
        this.f21701i = callable;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.jv1
    /* JADX INFO: renamed from: a */
    public final Object mo7401a() throws Exception {
        return this.f21701i.call();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.jv1
    /* JADX INFO: renamed from: b */
    public final String mo7402b() {
        return this.f21701i.toString();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.jv1
    /* JADX INFO: renamed from: c */
    public final boolean mo7403c() {
        return this.f21702j.isDone();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.jv1
    /* JADX INFO: renamed from: d */
    public final void mo7404d(Object obj, Throwable th) {
        if (th == null) {
            this.f21702j.mo6531l(obj);
        } else {
            this.f21702j.mo6532m(th);
        }
    }
}
