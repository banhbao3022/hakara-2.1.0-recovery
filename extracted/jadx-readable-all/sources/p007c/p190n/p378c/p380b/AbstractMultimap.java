package p007c.p190n.p378c.p380b;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: renamed from: c.n.c.b.f, reason: use source file name */
/* JADX INFO: compiled from: AbstractMultimap.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractMultimap<K, V> implements Multimap<K, V> {

    /* JADX INFO: renamed from: f */
    @MonotonicNonNullDecl
    public transient Set<K> f26184f;

    /* JADX INFO: renamed from: g */
    @MonotonicNonNullDecl
    public transient Collection<V> f26185g;

    /* JADX INFO: renamed from: h */
    @MonotonicNonNullDecl
    public transient Map<K, Collection<V>> f26186h;

    /* JADX INFO: renamed from: c.n.c.b.f$a */
    /* JADX INFO: compiled from: AbstractMultimap.java */
    public class a extends AbstractCollection<V> {
        public a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            AbstractMultimap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@NullableDecl Object obj) {
            return AbstractMultimap.this.mo11600b(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return AbstractMultimap.this.mo11584e();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return AbstractMultimap.this.size();
        }
    }

    @Override // p007c.p190n.p378c.p380b.Multimap
    /* JADX INFO: renamed from: a */
    public abstract Map<K, Collection<V>> mo11581a();

    /* JADX INFO: renamed from: b */
    public boolean mo11600b(@NullableDecl Object obj) {
        Iterator<Collection<V>> it = mo11581a().values().iterator();
        while (it.hasNext()) {
            if (it.next().contains(obj)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public abstract Map<K, Collection<V>> mo11601c();

    /* JADX INFO: renamed from: d */
    public abstract Set<K> mo11602d();

    /* JADX INFO: renamed from: e */
    public abstract Iterator<V> mo11584e();

    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Multimap) {
            return mo11581a().equals(((Multimap) obj).mo11581a());
        }
        return false;
    }

    public int hashCode() {
        return mo11581a().hashCode();
    }

    public String toString() {
        return mo11581a().toString();
    }
}
