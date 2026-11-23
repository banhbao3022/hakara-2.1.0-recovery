package p007c.p190n.p378c.p380b;

import com.google.j2objc.annotations.Weak;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p007c.p190n.p194b.p334e.C4799a;

/* JADX INFO: renamed from: c.n.c.b.d0, reason: use source file name */
/* JADX INFO: compiled from: Maps.java */
/* JADX INFO: loaded from: classes.dex */
public class Maps4<K, V> extends AbstractCollection<V> {

    /* JADX INFO: renamed from: f */
    @Weak
    public final Map<K, V> f26181f;

    public Maps4(Map<K, V> map) {
        this.f26181f = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f26181f.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(@NullableDecl Object obj) {
        return this.f26181f.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.f26181f.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<V> iterator() {
        return new Maps(this.f26181f.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        try {
            return super.remove(obj);
        } catch (UnsupportedOperationException unused) {
            for (Map.Entry<K, V> entry : this.f26181f.entrySet()) {
                if (C4799a.m10952C(obj, entry.getValue())) {
                    this.f26181f.remove(entry.getKey());
                    return true;
                }
            }
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        try {
            Objects.requireNonNull(collection);
            return super.removeAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet hashSet = new HashSet();
            for (Map.Entry<K, V> entry : this.f26181f.entrySet()) {
                if (collection.contains(entry.getValue())) {
                    hashSet.add(entry.getKey());
                }
            }
            return this.f26181f.keySet().removeAll(hashSet);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        try {
            Objects.requireNonNull(collection);
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet hashSet = new HashSet();
            for (Map.Entry<K, V> entry : this.f26181f.entrySet()) {
                if (collection.contains(entry.getValue())) {
                    hashSet.add(entry.getKey());
                }
            }
            return this.f26181f.keySet().retainAll(hashSet);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.f26181f.size();
    }
}
