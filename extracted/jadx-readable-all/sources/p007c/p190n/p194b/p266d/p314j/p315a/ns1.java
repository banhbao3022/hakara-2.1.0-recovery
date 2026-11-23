package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ns1<E> implements ListIterator {

    /* JADX INFO: renamed from: f */
    public final int f17261f;

    /* JADX INFO: renamed from: g */
    public int f17262g;

    public ns1(int i, int i2) {
        C2622l.m5338Z2(i2, i, "index");
        this.f17261f = i;
        this.f17262g = i2;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f17262g < this.f17261f;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f17262g > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f17262g;
        this.f17262g = i + 1;
        return ((rs1) this).f19061h.get(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f17262g;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f17262g - 1;
        this.f17262g = i;
        return ((rs1) this).f19061h.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f17262g - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
