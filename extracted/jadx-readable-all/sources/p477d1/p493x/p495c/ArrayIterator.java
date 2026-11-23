package p477d1.p493x.p495c;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p477d1.p493x.p495c.p496v.KMarkers;

/* JADX INFO: renamed from: d1.x.c.a, reason: use source file name */
/* JADX INFO: compiled from: ArrayIterator.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ArrayIterator<T> implements Iterator<T>, KMarkers {

    /* JADX INFO: renamed from: f */
    public int f29582f;

    /* JADX INFO: renamed from: g */
    public final T[] f29583g;

    public ArrayIterator(T[] tArr) {
        Intrinsics2.m13089e(tArr, "array");
        this.f29583g = tArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f29582f < this.f29583g.length;
    }

    @Override // java.util.Iterator
    public T next() {
        try {
            T[] tArr = this.f29583g;
            int i = this.f29582f;
            this.f29582f = i + 1;
            return tArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f29582f--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
