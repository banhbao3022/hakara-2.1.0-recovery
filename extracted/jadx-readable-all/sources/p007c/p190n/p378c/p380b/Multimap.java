package p007c.p190n.p378c.p380b;

import java.util.Collection;
import java.util.Map;

/* JADX INFO: renamed from: c.n.c.b.f0, reason: use source file name */
/* JADX INFO: compiled from: Multimap.java */
/* JADX INFO: loaded from: classes.dex */
public interface Multimap<K, V> {
    /* JADX INFO: renamed from: a */
    Map<K, Collection<V>> mo11581a();

    void clear();

    int size();
}
