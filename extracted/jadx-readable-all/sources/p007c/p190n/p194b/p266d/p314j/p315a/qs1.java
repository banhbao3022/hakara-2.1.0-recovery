package p007c.p190n.p194b.p266d.p314j.p315a;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class qs1<E> extends AbstractCollection<E> implements Serializable {

    /* JADX INFO: renamed from: f */
    public static final Object[] f18431f = new Object[0];

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public abstract kt1<E> iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(@NullableDecl Object obj);

    @NullableDecl
    /* JADX INFO: renamed from: f */
    public Object[] mo6091f() {
        return null;
    }

    /* JADX INFO: renamed from: h */
    public int mo6092h() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: j */
    public int mo6093j() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: m */
    public ts1<E> mo6685m() {
        throw null;
    }

    /* JADX INFO: renamed from: q */
    public abstract boolean mo6094q();

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: s */
    public int mo6095s(Object[] objArr, int i) {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f18431f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        Objects.requireNonNull(tArr);
        int size = size();
        int length = tArr.length;
        if (length < size) {
            Object[] objArrMo6091f = mo6091f();
            if (objArrMo6091f != null) {
                return (T[]) Arrays.copyOfRange(objArrMo6091f, mo6092h(), mo6093j(), tArr.getClass());
            }
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
        } else if (length > size) {
            tArr[size] = null;
        }
        mo6095s(tArr, 0);
        return tArr;
    }
}
