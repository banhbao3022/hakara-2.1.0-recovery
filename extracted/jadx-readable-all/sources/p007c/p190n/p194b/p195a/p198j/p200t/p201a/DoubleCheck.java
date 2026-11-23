package p007c.p190n.p194b.p195a.p198j.p200t.p201a;

import java.util.Objects;
import p005b1.p006a.Provider;

/* JADX INFO: renamed from: c.n.b.a.j.t.a.a, reason: use source file name */
/* JADX INFO: compiled from: DoubleCheck.java */
/* JADX INFO: loaded from: classes.dex */
public final class DoubleCheck<T> implements Provider<T> {

    /* JADX INFO: renamed from: a */
    public static final Object f5786a = new Object();

    /* JADX INFO: renamed from: b */
    public volatile Provider<T> f5787b;

    /* JADX INFO: renamed from: c */
    public volatile Object f5788c = f5786a;

    public DoubleCheck(Provider<T> provider) {
        this.f5787b = provider;
    }

    /* JADX INFO: renamed from: a */
    public static <P extends Provider<T>, T> Provider<T> m2834a(P p) {
        Objects.requireNonNull(p);
        return p instanceof DoubleCheck ? p : new DoubleCheck(p);
    }

    /* JADX INFO: renamed from: b */
    public static Object m2835b(Object obj, Object obj2) {
        if (!((obj == f5786a || (obj instanceof MemoizedSentinel)) ? false : true) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // p005b1.p006a.Provider
    public T get() {
        T t = (T) this.f5788c;
        Object obj = f5786a;
        if (t == obj) {
            synchronized (this) {
                t = (T) this.f5788c;
                if (t == obj) {
                    t = this.f5787b.get();
                    m2835b(this.f5788c, t);
                    this.f5788c = t;
                    this.f5787b = null;
                }
            }
        }
        return t;
    }
}
