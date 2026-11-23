package p007c.p190n.p385d.p390k;

import p007c.p190n.p385d.p420s.Provider2;

/* JADX INFO: renamed from: c.n.d.k.y, reason: use source file name */
/* JADX INFO: compiled from: Lazy.java */
/* JADX INFO: loaded from: classes.dex */
public class Lazy<T> implements Provider2<T> {

    /* JADX INFO: renamed from: a */
    public static final Object f26408a = new Object();

    /* JADX INFO: renamed from: b */
    public volatile Object f26409b = f26408a;

    /* JADX INFO: renamed from: c */
    public volatile Provider2<T> f26410c;

    public Lazy(Provider2<T> provider2) {
        this.f26410c = provider2;
    }

    @Override // p007c.p190n.p385d.p420s.Provider2
    public T get() {
        T t = (T) this.f26409b;
        Object obj = f26408a;
        if (t == obj) {
            synchronized (this) {
                t = (T) this.f26409b;
                if (t == obj) {
                    t = this.f26410c.get();
                    this.f26409b = t;
                    this.f26410c = null;
                }
            }
        }
        return t;
    }
}
