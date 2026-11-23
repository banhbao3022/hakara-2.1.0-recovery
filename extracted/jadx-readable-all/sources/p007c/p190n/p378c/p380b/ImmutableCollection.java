package p007c.p190n.p378c.p380b;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p007c.p190n.p194b.p334e.C4799a;

/* JADX INFO: renamed from: c.n.c.b.p, reason: use source file name */
/* JADX INFO: compiled from: ImmutableCollection.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class ImmutableCollection<E> extends AbstractCollection<E> implements Serializable {

    /* JADX INFO: renamed from: f */
    public static final Object[] f26248f = new Object[0];

    /* JADX INFO: renamed from: c.n.c.b.p$a */
    /* JADX INFO: compiled from: ImmutableCollection.java */
    public static abstract class a<E> extends b<E> {

        /* JADX INFO: renamed from: a */
        public Object[] f26249a;

        /* JADX INFO: renamed from: b */
        public int f26250b;

        /* JADX INFO: renamed from: c */
        public boolean f26251c;

        public a(int i) {
            C4799a.m11000m(i, "initialCapacity");
            this.f26249a = new Object[i];
            this.f26250b = 0;
        }
    }

    /* JADX INFO: renamed from: c.n.c.b.p$b */
    /* JADX INFO: compiled from: ImmutableCollection.java */
    public static abstract class b<E> {
        /* JADX INFO: renamed from: a */
        public static int m11636a(int i, int i2) {
            if (i2 < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int iHighestOneBit = i + (i >> 1) + 1;
            if (iHighestOneBit < i2) {
                iHighestOneBit = Integer.highestOneBit(i2 - 1) << 1;
            }
            if (iHighestOneBit < 0) {
                return Integer.MAX_VALUE;
            }
            return iHighestOneBit;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    @Deprecated
    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: c */
    public ImmutableList2<E> mo11629c() {
        if (!isEmpty()) {
            return ImmutableList2.m11639t(toArray());
        }
        AbstractIndexedListIterator<Object> abstractIndexedListIterator = ImmutableList2.f26255g;
        return (ImmutableList2<E>) RegularImmutableList.f26218h;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(@NullableDecl Object obj);

    @CanIgnoreReturnValue
    /* JADX INFO: renamed from: f */
    public int mo11618f(Object[] objArr, int i) {
        UnmodifiableIterator<E> it = iterator();
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: h */
    public Object[] mo11619h() {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public int mo11620j() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: m */
    public int mo11621m() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: q */
    public abstract boolean mo11622q();

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public abstract UnmodifiableIterator<E> iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f26248f);
    }

    public Object writeReplace() {
        return new ImmutableList2.c(toArray());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    public final <T> T[] toArray(T[] tArr) {
        Objects.requireNonNull(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] objArrMo11619h = mo11619h();
            if (objArrMo11619h != null) {
                return (T[]) Arrays.copyOfRange(objArrMo11619h, mo11621m(), mo11620j(), tArr.getClass());
            }
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        mo11618f(tArr, 0);
        return tArr;
    }
}
