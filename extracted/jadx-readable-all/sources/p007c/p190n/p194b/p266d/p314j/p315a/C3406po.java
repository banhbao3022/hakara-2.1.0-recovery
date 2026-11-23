package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: c.n.b.d.j.a.po */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class C3406po<T> {

    /* JADX INFO: renamed from: a */
    public final C3147io<T> f18041a;

    /* JADX INFO: renamed from: b */
    public final AtomicInteger f18042b;

    public C3406po() {
        C3147io<T> c3147io = new C3147io<>();
        this.f18041a = c3147io;
        this.f18042b = new AtomicInteger(0);
        C3332no c3332no = new C3332no(this);
        c3147io.mo6230f(new ev1(c3147io, c3332no), C2962do.f13335f);
    }

    @Deprecated
    /* JADX INFO: renamed from: a */
    public final void m8128a(InterfaceC3295mo<T> interfaceC3295mo, InterfaceC3221ko interfaceC3221ko) {
        C3147io<T> c3147io = this.f18041a;
        C3369oo c3369oo = new C3369oo(interfaceC3295mo, interfaceC3221ko);
        lv1 lv1Var = C2962do.f13335f;
        c3147io.f15328f.mo6230f(new ev1(c3147io, c3369oo), lv1Var);
    }

    @Deprecated
    /* JADX INFO: renamed from: b */
    public final void m8129b() {
        this.f18041a.m7287b(new Exception());
    }

    @Deprecated
    /* JADX INFO: renamed from: c */
    public final int m8130c() {
        return this.f18042b.get();
    }
}
