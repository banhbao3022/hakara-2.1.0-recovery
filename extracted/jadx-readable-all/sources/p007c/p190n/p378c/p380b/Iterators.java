package p007c.p190n.p378c.p380b;

import java.util.NoSuchElementException;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: renamed from: c.n.c.b.x, reason: use source file name */
/* JADX INFO: compiled from: Iterators.java */
/* JADX INFO: loaded from: classes.dex */
public final class Iterators<T> extends UnmodifiableIterator<T> {

    /* JADX INFO: renamed from: f */
    public boolean f26285f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f26286g;

    public Iterators(Object obj) {
        this.f26286g = obj;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return !this.f26285f;
    }

    @Override // java.util.Iterator
    public T next() {
        if (this.f26285f) {
            throw new NoSuchElementException();
        }
        this.f26285f = true;
        return (T) this.f26286g;
    }
}
