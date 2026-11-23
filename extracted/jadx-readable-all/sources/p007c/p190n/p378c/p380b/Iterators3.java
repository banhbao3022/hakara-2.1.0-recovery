package p007c.p190n.p378c.p380b;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p007c.p190n.p194b.p334e.C4799a;

/* JADX INFO: renamed from: c.n.c.b.z, reason: use source file name */
/* JADX INFO: compiled from: Iterators.java */
/* JADX INFO: loaded from: classes.dex */
public enum Iterators3 implements Iterator<Object> {
    INSTANCE;

    @Override // java.util.Iterator
    public boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        C4799a.m11006p(false);
    }
}
