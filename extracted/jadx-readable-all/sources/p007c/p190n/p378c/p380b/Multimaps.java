package p007c.p190n.p378c.p380b;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;
import p007c.p190n.p194b.p334e.C4799a;
import p007c.p190n.p378c.p379a.Supplier;

/* JADX INFO: renamed from: c.n.c.b.h0, reason: use source file name */
/* JADX INFO: compiled from: Multimaps.java */
/* JADX INFO: loaded from: classes.dex */
public class Multimaps<K, V> extends AbstractListMultimap<K, V> {

    /* JADX INFO: renamed from: k */
    public transient Supplier<? extends List<V>> f26191k;

    public Multimaps(Map<K, Collection<V>> map, Supplier<? extends List<V>> supplier) {
        super(map);
        Objects.requireNonNull(supplier);
        this.f26191k = supplier;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f26191k = (Supplier) objectInputStream.readObject();
        Map<K, Collection<V>> map = (Map) objectInputStream.readObject();
        this.f26149i = map;
        this.f26150j = 0;
        for (Collection<V> collection : map.values()) {
            C4799a.m10988g(!collection.isEmpty());
            this.f26150j = collection.size() + this.f26150j;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f26191k);
        objectOutputStream.writeObject(this.f26149i);
    }

    @Override // p007c.p190n.p378c.p380b.AbstractMultimap
    /* JADX INFO: renamed from: c */
    public Map<K, Collection<V>> mo11601c() {
        Map<K, Collection<V>> map = this.f26149i;
        if (map instanceof NavigableMap) {
            return new AbstractMapBasedMultimap.e((NavigableMap) this.f26149i);
        }
        return map instanceof SortedMap ? new AbstractMapBasedMultimap.h((SortedMap) this.f26149i) : new AbstractMapBasedMultimap.b(this.f26149i);
    }

    @Override // p007c.p190n.p378c.p380b.AbstractMultimap
    /* JADX INFO: renamed from: d */
    public Set<K> mo11602d() {
        Map<K, Collection<V>> map = this.f26149i;
        if (map instanceof NavigableMap) {
            return new AbstractMapBasedMultimap.f((NavigableMap) this.f26149i);
        }
        return map instanceof SortedMap ? new AbstractMapBasedMultimap.i((SortedMap) this.f26149i) : new AbstractMapBasedMultimap.d(this.f26149i);
    }

    @Override // p007c.p190n.p378c.p380b.AbstractMapBasedMultimap
    /* JADX INFO: renamed from: h */
    public Collection mo11585h() {
        return this.f26191k.get();
    }
}
