package p007c.p190n.p194b.p266d.p314j.p315a;

import p007c.p190n.p194b.p266d.p267a.p279w.InterfaceC2203f;

/* JADX INFO: renamed from: c.n.b.d.j.a.o7 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3352o7 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2203f.b f17546a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2203f.a f17547b;

    /* JADX INFO: renamed from: c */
    public InterfaceC2203f f17548c;

    public C3352o7(InterfaceC2203f.b bVar, InterfaceC2203f.a aVar) {
        this.f17546a = bVar;
        this.f17547b = aVar;
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC2203f m7965a(C3352o7 c3352o7, InterfaceC3129i6 interfaceC3129i6) {
        InterfaceC2203f c3166j6;
        synchronized (c3352o7) {
            c3166j6 = c3352o7.f17548c;
            if (c3166j6 == null) {
                c3166j6 = new C3166j6(interfaceC3129i6);
                c3352o7.f17548c = c3166j6;
            }
        }
        return c3166j6;
    }
}
