package p007c.p190n.p194b.p266d.p333n;

import java.util.Objects;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.n.j */
/* JADX INFO: loaded from: classes.dex */
public class C4782j<TResult> {

    /* JADX INFO: renamed from: a */
    public final C4778g0<TResult> f24683a = new C4778g0<>();

    public C4782j() {
    }

    /* JADX INFO: renamed from: a */
    public boolean m10947a(Exception exc) {
        C4778g0<TResult> c4778g0 = this.f24683a;
        Objects.requireNonNull(c4778g0);
        C2622l.m5379i(exc, "Exception must not be null");
        synchronized (c4778g0.f24675a) {
            if (c4778g0.f24677c) {
                return false;
            }
            c4778g0.f24677c = true;
            c4778g0.f24680f = exc;
            c4778g0.f24676b.m10926a(c4778g0);
            return true;
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m10948b(TResult tresult) {
        C4778g0<TResult> c4778g0 = this.f24683a;
        synchronized (c4778g0.f24675a) {
            if (c4778g0.f24677c) {
                return false;
            }
            c4778g0.f24677c = true;
            c4778g0.f24679e = tresult;
            c4778g0.f24676b.m10926a(c4778g0);
            return true;
        }
    }

    public C4782j(AbstractC4765a abstractC4765a) {
        abstractC4765a.m10923a(new C4774e0(this));
    }
}
