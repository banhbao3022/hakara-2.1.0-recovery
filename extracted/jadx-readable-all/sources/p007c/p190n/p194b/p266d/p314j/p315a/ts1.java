package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ts1<E> extends qs1<E> implements List<E>, RandomAccess {

    /* JADX INFO: renamed from: g */
    public static final ns1<Object> f19979g = new rs1(bt1.f12860h, 0);

    /* JADX INFO: renamed from: u */
    public static <E> ts1<E> m8449u(Collection<? extends E> collection) {
        if (!(collection instanceof qs1)) {
            Object[] array = collection.toArray();
            int length = array.length;
            C2622l.m5421q1(array, length);
            return m8450v(array, length);
        }
        ts1<E> ts1VarMo6685m = ((qs1) collection).mo6685m();
        if (!ts1VarMo6685m.mo6094q()) {
            return ts1VarMo6685m;
        }
        Object[] array2 = ts1VarMo6685m.toArray();
        return m8450v(array2, array2.length);
    }

    /* JADX INFO: renamed from: v */
    public static <E> ts1<E> m8450v(Object[] objArr, int i) {
        return i == 0 ? (ts1<E>) bt1.f12860h : new bt1(objArr, i);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.qs1
    /* JADX INFO: renamed from: c */
    public final kt1<E> iterator() {
        return listIterator(0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.qs1, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@NullableDecl Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        if (C2622l.m5401m1(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator<E> it2 = list.iterator();
                while (it.hasNext()) {
                    if (it2.hasNext() && C2622l.m5401m1(it.next(), it2.next())) {
                    }
                }
                if (!it2.hasNext()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i = 0; i < size; i++) {
            iHashCode = (iHashCode * 31) + get(i).hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.List
    public final int indexOf(@NullableDecl Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.qs1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(@NullableDecl Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.qs1
    /* JADX INFO: renamed from: m */
    public final ts1<E> mo6685m() {
        return this;
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.qs1
    /* JADX INFO: renamed from: s */
    public int mo6095s(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: t */
    public ts1<E> subList(int i, int i2) {
        C2622l.m5403m3(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        return i3 == 0 ? (ts1<E>) bt1.f12860h : new ss1(this, i, i3);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public final ns1<E> listIterator(int i) {
        C2622l.m5338Z2(i, size(), "index");
        return isEmpty() ? (ns1<E>) f19979g : new rs1(this, i);
    }
}
