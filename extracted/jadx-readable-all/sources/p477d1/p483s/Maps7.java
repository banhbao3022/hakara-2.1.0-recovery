package p477d1.p483s;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.p496v.KMarkers;

/* JADX INFO: renamed from: d1.s.v, reason: use source file name */
/* JADX INFO: compiled from: Maps.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Maps7 implements Map, Serializable, KMarkers {

    /* JADX INFO: renamed from: f */
    public static final Maps7 f29520f = new Maps7();

    private final Object readResolve() {
        return f29520f;
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (obj instanceof Void) {
            Intrinsics2.m13089e((Void) obj, "value");
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry> entrySet() {
        return Sets5.f29521f;
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Object get(Object obj) {
        return null;
    }

    @Override // java.util.Map
    public int hashCode() {
        return 0;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Object> keySet() {
        return Sets5.f29521f;
    }

    @Override // java.util.Map
    public /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return 0;
    }

    public String toString() {
        return "{}";
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return Collections4.f29519f;
    }
}
