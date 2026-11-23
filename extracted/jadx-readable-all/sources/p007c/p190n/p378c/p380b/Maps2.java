package p007c.p190n.p378c.p380b;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import p007c.p190n.p194b.p334e.C4799a;

/* JADX INFO: renamed from: c.n.c.b.b0, reason: use source file name */
/* JADX INFO: compiled from: Maps.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class Maps2<K, V> extends Sets3<Map.Entry<K, V>> {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        AbstractMapBasedMultimap.b.this.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return AbstractMapBasedMultimap.b.this.isEmpty();
    }

    @Override // p007c.p190n.p378c.p380b.Sets3, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        try {
            Objects.requireNonNull(collection);
            return super.removeAll(collection);
        } catch (UnsupportedOperationException unused) {
            return Collections2.m11605c(this, collection.iterator());
        }
    }

    @Override // p007c.p190n.p378c.p380b.Sets3, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        int i;
        try {
            Objects.requireNonNull(collection);
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            int size = collection.size();
            if (size < 3) {
                C4799a.m11000m(size, "expectedSize");
                i = size + 1;
            } else {
                i = size < 1073741824 ? (int) ((size / 0.75f) + 1.0f) : Integer.MAX_VALUE;
            }
            HashSet hashSet = new HashSet(i);
            for (Object obj : collection) {
                if (contains(obj)) {
                    hashSet.add(((Map.Entry) obj).getKey());
                }
            }
            return AbstractMapBasedMultimap.b.this.keySet().retainAll(hashSet);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return AbstractMapBasedMultimap.b.this.size();
    }
}
