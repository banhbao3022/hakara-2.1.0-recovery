package p007c.p190n.p378c.p380b;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: renamed from: c.n.c.b.a0, reason: use source file name */
/* JADX INFO: compiled from: Maps.java */
/* JADX INFO: loaded from: classes.dex */
public final class Maps<K, V> extends TransformedIterator<Map.Entry<K, V>, V> {
    public Maps(Iterator it) {
        super(it);
    }
}
