package p007c.p190n.p378c.p380b;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: c.n.c.b.x0, reason: use source file name */
/* JADX INFO: compiled from: TransformedIterator.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class TransformedIterator<F, T> implements Iterator<T> {

    /* JADX INFO: renamed from: f */
    public final Iterator<? extends F> f26287f;

    public TransformedIterator(Iterator<? extends F> it) {
        Objects.requireNonNull(it);
        this.f26287f = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f26287f.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        return (T) ((Map.Entry) this.f26287f.next()).getValue();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f26287f.remove();
    }
}
