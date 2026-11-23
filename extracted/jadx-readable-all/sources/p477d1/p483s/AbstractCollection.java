package p477d1.p483s;

import java.util.Collection;
import java.util.Iterator;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.CollectionToArray;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p477d1.p493x.p495c.p496v.KMarkers;

/* JADX INFO: renamed from: d1.s.a, reason: use source file name */
/* JADX INFO: compiled from: AbstractCollection.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractCollection<E> implements Collection<E>, KMarkers {

    /* JADX INFO: renamed from: d1.s.a$a */
    /* JADX INFO: compiled from: AbstractCollection.kt */
    public static final class a extends Lambda implements InterfaceC6164l<E, CharSequence> {
        public a() {
            super(1);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6164l
        /* JADX INFO: renamed from: b */
        public CharSequence mo3b(Object obj) {
            return obj == AbstractCollection.this ? "(this Collection)" : String.valueOf(obj);
        }
    }

    @Override // java.util.Collection
    public boolean add(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: c */
    public abstract int mo13023c();

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        if (isEmpty()) {
            return false;
        }
        AbstractList.b bVar = new AbstractList.b();
        while (bVar.hasNext()) {
            if (Intrinsics2.m13085a(bVar.next(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        Intrinsics2.m13089e(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return mo13023c() == 0;
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return mo13023c();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.m13083a(this);
    }

    public String toString() {
        return _Collections.m13046k(this, ", ", "[", "]", 0, null, new a(), 24);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        Intrinsics2.m13089e(tArr, "array");
        return (T[]) CollectionToArray.m13084b(this, tArr);
    }
}
