package p007c.p190n.p194b.p209b.p212b2;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: c.n.b.b.b2.l, reason: use source file name */
/* JADX INFO: compiled from: CopyOnWriteMultiset.java */
/* JADX INFO: loaded from: classes.dex */
public final class CopyOnWriteMultiset<E> implements Iterable<E> {

    /* JADX INFO: renamed from: f */
    public final Object f6328f = new Object();

    /* JADX INFO: renamed from: g */
    public final Map<E, Integer> f6329g = new HashMap();

    /* JADX INFO: renamed from: h */
    public Set<E> f6330h = Collections.emptySet();

    /* JADX INFO: renamed from: i */
    public List<E> f6331i = Collections.emptyList();

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
        Iterator<E> it;
        synchronized (this.f6328f) {
            it = this.f6331i.iterator();
        }
        return it;
    }
}
