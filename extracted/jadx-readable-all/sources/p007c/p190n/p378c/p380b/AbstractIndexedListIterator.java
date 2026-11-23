package p007c.p190n.p378c.p380b;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import p007c.p190n.p194b.p334e.C4799a;

/* JADX INFO: renamed from: c.n.c.b.a, reason: use source file name */
/* JADX INFO: compiled from: AbstractIndexedListIterator.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractIndexedListIterator<E> implements ListIterator {

    /* JADX INFO: renamed from: f */
    public final int f26144f;

    /* JADX INFO: renamed from: g */
    public int f26145g;

    public AbstractIndexedListIterator(int i, int i2) {
        C4799a.m11002n(i2, i);
        this.f26144f = i;
        this.f26145g = i2;
    }

    /* JADX INFO: renamed from: a */
    public abstract E mo11580a(int i);

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f26145g < this.f26144f;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f26145g > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f26145g;
        this.f26145g = i + 1;
        return mo11580a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f26145g;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f26145g - 1;
        this.f26145g = i;
        return mo11580a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f26145g - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
