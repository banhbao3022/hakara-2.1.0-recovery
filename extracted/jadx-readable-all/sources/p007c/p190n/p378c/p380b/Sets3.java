package p007c.p190n.p378c.p380b;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: c.n.c.b.u0, reason: use source file name */
/* JADX INFO: compiled from: Sets.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class Sets3<E> extends AbstractSet<E> {
    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        Objects.requireNonNull(collection);
        if (collection instanceof Multiset) {
            collection = ((Multiset) collection).m11607k();
        }
        if (!(collection instanceof Set) || collection.size() <= size()) {
            return Collections2.m11605c(this, collection.iterator());
        }
        Iterator<E> it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        Objects.requireNonNull(collection);
        return super.retainAll(collection);
    }
}
