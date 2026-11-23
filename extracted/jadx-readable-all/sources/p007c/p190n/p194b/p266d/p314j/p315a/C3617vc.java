package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: renamed from: c.n.b.d.j.a.vc */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3617vc<I, O> implements InterfaceC3098hc<I, O> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC3172jc<O> f20731a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC3209kc<I> f20732b;

    /* JADX INFO: renamed from: c */
    public final C2950dc f20733c;

    /* JADX INFO: renamed from: d */
    public final String f20734d;

    public C3617vc(C2950dc c2950dc, String str, InterfaceC3209kc<I> interfaceC3209kc, InterfaceC3172jc<O> interfaceC3172jc) {
        this.f20733c = c2950dc;
        this.f20734d = str;
        this.f20732b = interfaceC3209kc;
        this.f20731a = interfaceC3172jc;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.qu1
    /* JADX INFO: renamed from: a */
    public final kv1<O> mo4612a(I i) throws Exception {
        return m8544b(i);
    }

    /* JADX INFO: renamed from: b */
    public final kv1<O> m8544b(I i) {
        C3147io c3147io = new C3147io();
        C3690xb c3690xbM6350b = this.f20733c.m6350b(null);
        c3690xbM6350b.m8128a(new C3505sc(this, c3690xbM6350b, i, c3147io), new C3542tc(c3147io, c3690xbM6350b));
        return c3147io;
    }
}
