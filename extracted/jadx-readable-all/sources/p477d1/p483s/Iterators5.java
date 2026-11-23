package p477d1.p483s;

import java.util.Iterator;
import p477d1.p493x.p495c.p496v.KMarkers;

/* JADX INFO: renamed from: d1.s.x, reason: use source file name */
/* JADX INFO: compiled from: Iterators.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class Iterators5 implements Iterator<Integer>, KMarkers {
    /* JADX INFO: renamed from: a */
    public abstract int mo12965a();

    @Override // java.util.Iterator
    public Integer next() {
        return Integer.valueOf(mo12965a());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
