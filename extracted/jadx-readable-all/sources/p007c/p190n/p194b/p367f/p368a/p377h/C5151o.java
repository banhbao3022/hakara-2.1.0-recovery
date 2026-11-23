package p007c.p190n.p194b.p367f.p368a.p377h;

/* JADX INFO: renamed from: c.n.b.f.a.h.o */
/* JADX INFO: loaded from: classes.dex */
public final class C5151o<ResultT> {

    /* JADX INFO: renamed from: a */
    public final C5155s<ResultT> f26116a = new C5155s<>();

    /* JADX INFO: renamed from: a */
    public final void m11572a(Exception exc) {
        C5155s<ResultT> c5155s = this.f26116a;
        synchronized (c5155s.f26118a) {
            if (c5155s.f26120c) {
                return;
            }
            c5155s.f26120c = true;
            c5155s.f26122e = exc;
            c5155s.f26119b.m11571b(c5155s);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m11573b(ResultT resultt) {
        C5155s<ResultT> c5155s = this.f26116a;
        synchronized (c5155s.f26118a) {
            if (c5155s.f26120c) {
                return;
            }
            c5155s.f26120c = true;
            c5155s.f26121d = resultt;
            c5155s.f26119b.m11571b(c5155s);
        }
    }
}
