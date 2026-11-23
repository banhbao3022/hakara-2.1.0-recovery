package p007c.p190n.p378c.p380b;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import p007c.p190n.p378c.p380b.AbstractMapBasedMultimap.b.a;

/* JADX INFO: renamed from: c.n.c.b.e0, reason: use source file name */
/* JADX INFO: compiled from: Maps.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class Maps5<K, V> extends AbstractMap<K, V> {

    /* JADX INFO: renamed from: f */
    @MonotonicNonNullDecl
    public transient Set<Map.Entry<K, V>> f26182f;

    /* JADX INFO: renamed from: g */
    @MonotonicNonNullDecl
    public transient Collection<V> f26183g;

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f26182f;
        if (set != null) {
            return set;
        }
        AbstractMapBasedMultimap.b.a aVar = ((AbstractMapBasedMultimap.b) this).new a();
        this.f26182f = aVar;
        return aVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.f26183g;
        if (collection != null) {
            return collection;
        }
        Maps4 maps4 = new Maps4(this);
        this.f26183g = maps4;
        return maps4;
    }
}
