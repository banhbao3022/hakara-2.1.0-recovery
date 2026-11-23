package p007c.p190n.p378c.p380b;

import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p007c.p190n.p194b.p334e.C4799a;

/* JADX INFO: renamed from: c.n.c.b.w, reason: use source file name */
/* JADX INFO: compiled from: ImmutableSet.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class ImmutableSet<E> extends ImmutableCollection<E> implements Set<E> {

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ int f26280g = 0;

    /* JADX INFO: renamed from: h */
    @RetainedWith
    @NullableDecl
    @LazyInit
    public transient ImmutableList2<E> f26281h;

    /* JADX INFO: renamed from: c.n.c.b.w$a */
    /* JADX INFO: compiled from: ImmutableSet.java */
    public static class a implements Serializable {

        /* JADX INFO: renamed from: f */
        public final Object[] f26282f;

        public a(Object[] objArr) {
            this.f26282f = objArr;
        }

        public Object readResolve() {
            return ImmutableSet.m11662x(this.f26282f);
        }
    }

    /* JADX INFO: renamed from: B */
    public static <E> ImmutableSet<E> m11658B(E e, E e2, E e3) {
        return m11660u(3, e, e2, e3);
    }

    /* JADX INFO: renamed from: t */
    public static int m11659t(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= 751619276) {
            C4799a.m10990h(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    /* JADX INFO: renamed from: u */
    public static <E> ImmutableSet<E> m11660u(int i, Object... objArr) {
        if (i == 0) {
            return RegularImmutableSet.f26240i;
        }
        if (i == 1) {
            return new SingletonImmutableSet(objArr[0]);
        }
        int iM11659t = m11659t(i);
        Object[] objArr2 = new Object[iM11659t];
        int i2 = iM11659t - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj = objArr[i5];
            C4799a.m10996k(obj, i5);
            int iHashCode = obj.hashCode();
            int iM11007p0 = C4799a.m11007p0(iHashCode);
            while (true) {
                int i6 = iM11007p0 & i2;
                Object obj2 = objArr2[i6];
                if (obj2 == null) {
                    objArr[i4] = obj;
                    objArr2[i6] = obj;
                    i3 += iHashCode;
                    i4++;
                    break;
                }
                if (obj2.equals(obj)) {
                    break;
                }
                iM11007p0++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            return new SingletonImmutableSet(objArr[0], i3);
        }
        if (m11659t(i4) < iM11659t / 2) {
            return m11660u(i4, objArr);
        }
        int length = objArr.length;
        if (i4 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new RegularImmutableSet(objArr, i3, objArr2, i2, i4);
    }

    /* JADX INFO: renamed from: v */
    public static <E> ImmutableSet<E> m11661v(Collection<? extends E> collection) {
        if ((collection instanceof ImmutableSet) && !(collection instanceof SortedSet)) {
            ImmutableSet<E> immutableSet = (ImmutableSet) collection;
            if (!immutableSet.mo11622q()) {
                return immutableSet;
            }
        }
        Object[] array = collection.toArray();
        return m11660u(array.length, array);
    }

    /* JADX INFO: renamed from: x */
    public static <E> ImmutableSet<E> m11662x(E[] eArr) {
        int length = eArr.length;
        if (length != 0) {
            return length != 1 ? m11660u(eArr.length, (Object[]) eArr.clone()) : new SingletonImmutableSet(eArr[0]);
        }
        return RegularImmutableSet.f26240i;
    }

    @Override // p007c.p190n.p378c.p380b.ImmutableCollection
    /* JADX INFO: renamed from: c */
    public ImmutableList2<E> mo11629c() {
        ImmutableList2<E> immutableList2 = this.f26281h;
        if (immutableList2 != null) {
            return immutableList2;
        }
        ImmutableList2<E> immutableList2Mo11628y = mo11628y();
        this.f26281h = immutableList2Mo11628y;
        return immutableList2Mo11628y;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof ImmutableSet) && mo11663z() && ((ImmutableSet) obj).mo11663z() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size() && containsAll(set)) {
                    return true;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return Collections2.m11603a(this);
    }

    @Override // p007c.p190n.p378c.p380b.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // p007c.p190n.p378c.p380b.ImmutableCollection
    public Object writeReplace() {
        return new a(toArray());
    }

    /* JADX INFO: renamed from: y */
    public ImmutableList2<E> mo11628y() {
        return ImmutableList2.m11639t(toArray());
    }

    /* JADX INFO: renamed from: z */
    public boolean mo11663z() {
        return this instanceof RegularImmutableSet;
    }
}
