package p007c.p190n.p378c.p380b;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: renamed from: c.n.c.b.q, reason: use source file name */
/* JADX INFO: compiled from: ImmutableEntry.java */
/* JADX INFO: loaded from: classes.dex */
public class ImmutableEntry<K, V> extends AbstractMapEntry<K, V> implements Serializable {

    /* JADX INFO: renamed from: f */
    @NullableDecl
    public final K f26253f;

    /* JADX INFO: renamed from: g */
    @NullableDecl
    public final V f26254g;

    public ImmutableEntry(@NullableDecl K k, @NullableDecl V v) {
        this.f26253f = k;
        this.f26254g = v;
    }

    @Override // p007c.p190n.p378c.p380b.AbstractMapEntry, java.util.Map.Entry
    @NullableDecl
    public final K getKey() {
        return this.f26253f;
    }

    @Override // p007c.p190n.p378c.p380b.AbstractMapEntry, java.util.Map.Entry
    @NullableDecl
    public final V getValue() {
        return this.f26254g;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        throw new UnsupportedOperationException();
    }
}
