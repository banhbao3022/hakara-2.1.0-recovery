package p007c.p190n.p385d.p390k;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p007c.p190n.p385d.p420s.Provider2;

/* JADX INFO: renamed from: c.n.d.k.z, reason: use source file name */
/* JADX INFO: compiled from: LazySet.java */
/* JADX INFO: loaded from: classes.dex */
public class LazySet<T> implements Provider2<Set<T>> {

    /* JADX INFO: renamed from: b */
    public volatile Set<T> f26412b = null;

    /* JADX INFO: renamed from: a */
    public volatile Set<Provider2<T>> f26411a = Collections.newSetFromMap(new ConcurrentHashMap());

    public LazySet(Collection<Provider2<T>> collection) {
        this.f26411a.addAll(collection);
    }

    @Override // p007c.p190n.p385d.p420s.Provider2
    public Object get() {
        if (this.f26412b == null) {
            synchronized (this) {
                if (this.f26412b == null) {
                    this.f26412b = Collections.newSetFromMap(new ConcurrentHashMap());
                    synchronized (this) {
                        Iterator<Provider2<T>> it = this.f26411a.iterator();
                        while (it.hasNext()) {
                            this.f26412b.add(it.next().get());
                        }
                        this.f26411a = null;
                    }
                }
            }
        }
        return Collections.unmodifiableSet(this.f26412b);
    }
}
