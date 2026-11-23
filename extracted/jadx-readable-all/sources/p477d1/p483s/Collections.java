package p477d1.p483s;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import p477d1.p493x.p495c.ArrayIterator;
import p477d1.p493x.p495c.CollectionToArray;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.p496v.KMarkers;

/* JADX INFO: renamed from: d1.s.d, reason: use source file name */
/* JADX INFO: compiled from: Collections.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Collections<T> implements Collection<T>, KMarkers {

    /* JADX INFO: renamed from: f */
    public final T[] f29515f;

    /* JADX INFO: renamed from: g */
    public final boolean f29516g;

    public Collections(T[] tArr, boolean z) {
        Intrinsics2.m13089e(tArr, "values");
        this.f29515f = tArr;
        this.f29516g = z;
    }

    @Override // java.util.Collection
    public boolean add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        int i;
        T[] tArr = this.f29515f;
        Intrinsics2.m13089e(tArr, "$this$contains");
        Intrinsics2.m13089e(tArr, "$this$indexOf");
        if (obj == null) {
            int length = tArr.length;
            i = 0;
            while (i < length) {
                if (tArr[i] != null) {
                    i++;
                }
            }
            i = -1;
        } else {
            int length2 = tArr.length;
            for (int i2 = 0; i2 < length2; i2++) {
                if (Intrinsics2.m13085a(obj, tArr[i2])) {
                    i = i2;
                }
            }
            i = -1;
        }
        return i >= 0;
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
        return this.f29515f.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        T[] tArr = this.f29515f;
        Intrinsics2.m13089e(tArr, "array");
        return new ArrayIterator(tArr);
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
    public final int size() {
        return this.f29515f.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        T[] tArr = this.f29515f;
        boolean z = this.f29516g;
        Intrinsics2.m13089e(tArr, "$this$copyToArrayOfAny");
        if (z && Intrinsics2.m13085a(tArr.getClass(), Object[].class)) {
            return tArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
        Intrinsics2.m13088d(objArrCopyOf, "java.util.Arrays.copyOf(… Array<Any?>::class.java)");
        return objArrCopyOf;
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) CollectionToArray.m13084b(this, tArr);
    }
}
