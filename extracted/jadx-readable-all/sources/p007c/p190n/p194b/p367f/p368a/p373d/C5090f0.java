package p007c.p190n.p194b.p367f.p368a.p373d;

import java.util.Objects;

/* JADX INFO: renamed from: c.n.b.f.a.d.f0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5090f0<T> implements InterfaceC5094h0, InterfaceC5086d0 {

    /* JADX INFO: renamed from: a */
    public static final Object f26041a = new Object();

    /* JADX INFO: renamed from: b */
    public volatile InterfaceC5094h0<T> f26042b;

    /* JADX INFO: renamed from: c */
    public volatile Object f26043c = f26041a;

    public C5090f0(InterfaceC5094h0<T> interfaceC5094h0) {
        this.f26042b = interfaceC5094h0;
    }

    /* JADX INFO: renamed from: b */
    public static <P extends InterfaceC5094h0<T>, T> InterfaceC5094h0<T> m11534b(P p) {
        Objects.requireNonNull(p);
        return p instanceof C5090f0 ? p : new C5090f0(p);
    }

    /* JADX INFO: renamed from: c */
    public static <P extends InterfaceC5094h0<T>, T> InterfaceC5086d0<T> m11535c(P p) {
        if (p instanceof InterfaceC5086d0) {
            return (InterfaceC5086d0) p;
        }
        Objects.requireNonNull(p);
        return new C5090f0(p);
    }

    @Override // p007c.p190n.p194b.p367f.p368a.p373d.InterfaceC5094h0
    /* JADX INFO: renamed from: a */
    public final T mo11416a() {
        T tMo11416a = (T) this.f26043c;
        Object obj = f26041a;
        if (tMo11416a == obj) {
            synchronized (this) {
                tMo11416a = (T) this.f26043c;
                if (tMo11416a == obj) {
                    tMo11416a = this.f26042b.mo11416a();
                    Object obj2 = this.f26043c;
                    if (obj2 != obj && !(obj2 instanceof C5092g0) && obj2 != tMo11416a) {
                        String strValueOf = String.valueOf(obj2);
                        String strValueOf2 = String.valueOf(tMo11416a);
                        StringBuilder sb = new StringBuilder(strValueOf.length() + 118 + strValueOf2.length());
                        sb.append("Scoped provider was invoked recursively returning different results: ");
                        sb.append(strValueOf);
                        sb.append(" & ");
                        sb.append(strValueOf2);
                        sb.append(". This is likely due to a circular dependency.");
                        throw new IllegalStateException(sb.toString());
                    }
                    this.f26043c = tMo11416a;
                    this.f26042b = null;
                }
            }
        }
        return tMo11416a;
    }
}
