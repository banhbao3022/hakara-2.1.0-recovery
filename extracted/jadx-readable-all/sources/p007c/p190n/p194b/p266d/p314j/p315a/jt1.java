package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jt1<F, T> implements ListIterator<T>, Iterator {

    /* JADX INFO: renamed from: f */
    public final Iterator<? extends F> f15722f;

    public jt1(ListIterator<? extends F> listIterator) {
        Objects.requireNonNull(listIterator);
        this.f15722f = listIterator;
    }

    @Override // java.util.ListIterator
    public final void add(T t) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f15722f.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f15722f.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return ((vs2) this.f15722f.next()).name();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f15722f.nextIndex();
    }

    @Override // java.util.ListIterator
    public final T previous() {
        return (T) ((vs2) this.f15722f.previous()).name();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f15722f.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        this.f15722f.remove();
    }

    @Override // java.util.ListIterator
    public final void set(T t) {
        throw new UnsupportedOperationException();
    }
}
