package p007c.p190n.p378c.p380b;

import java.util.Collection;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: renamed from: c.n.c.b.c, reason: use source file name */
/* JADX INFO: compiled from: AbstractListMultimap.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractListMultimap<K, V> extends AbstractMapBasedMultimap<K, V> implements Multimap {
    public AbstractListMultimap(Map<K, Collection<V>> map) {
        super(map);
    }

    @Override // p007c.p190n.p378c.p380b.AbstractMultimap, p007c.p190n.p378c.p380b.Multimap
    /* JADX INFO: renamed from: a */
    public Map<K, Collection<V>> mo11581a() {
        Map<K, Collection<V>> map = this.f26186h;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> mapMo11601c = mo11601c();
        this.f26186h = mapMo11601c;
        return mapMo11601c;
    }

    @Override // p007c.p190n.p378c.p380b.AbstractMultimap
    public boolean equals(@NullableDecl Object obj) {
        return super.equals(obj);
    }
}
