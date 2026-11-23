package p007c.p190n.p378c.p380b;

import com.google.j2objc.annotations.Weak;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: c.n.c.b.c0, reason: use source file name */
/* JADX INFO: compiled from: Maps.java */
/* JADX INFO: loaded from: classes.dex */
public class Maps3<K, V> extends Sets3<K> {

    /* JADX INFO: renamed from: f */
    @Weak
    public final Map<K, V> f26148f;

    public Maps3(Map<K, V> map) {
        Objects.requireNonNull(map);
        this.f26148f = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f26148f.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f26148f.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f26148f.size();
    }
}
