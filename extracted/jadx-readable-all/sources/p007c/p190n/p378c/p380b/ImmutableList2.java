package p007c.p190n.p378c.p380b;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p007c.p190n.p194b.p334e.C4799a;

/* JADX INFO: renamed from: c.n.c.b.r, reason: use source file name */
/* JADX INFO: compiled from: ImmutableList.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class ImmutableList2<E> extends ImmutableCollection<E> implements List<E>, RandomAccess {

    /* JADX INFO: renamed from: g */
    public static final AbstractIndexedListIterator<Object> f26255g = new b(RegularImmutableList.f26218h, 0);

    /* JADX INFO: renamed from: c.n.c.b.r$a */
    /* JADX INFO: compiled from: ImmutableList.java */
    public static final class a<E> extends ImmutableCollection.a<E> {
        public a() {
            super(4);
        }

        @CanIgnoreReturnValue
        /* JADX INFO: renamed from: b */
        public a<E> m11646b(E e) {
            Objects.requireNonNull(e);
            int i = this.f26250b + 1;
            Object[] objArr = this.f26249a;
            if (objArr.length < i) {
                this.f26249a = Arrays.copyOf(objArr, ImmutableCollection.b.m11636a(objArr.length, i));
                this.f26251c = false;
            } else if (this.f26251c) {
                this.f26249a = (Object[]) objArr.clone();
                this.f26251c = false;
            }
            Object[] objArr2 = this.f26249a;
            int i2 = this.f26250b;
            this.f26250b = i2 + 1;
            objArr2[i2] = e;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public ImmutableList2<E> m11647c() {
            this.f26251c = true;
            return ImmutableList2.m11640u(this.f26249a, this.f26250b);
        }
    }

    /* JADX INFO: renamed from: c.n.c.b.r$b */
    /* JADX INFO: compiled from: ImmutableList.java */
    public static class b<E> extends AbstractIndexedListIterator<E> {

        /* JADX INFO: renamed from: h */
        public final ImmutableList2<E> f26256h;

        public b(ImmutableList2<E> immutableList2, int i) {
            super(immutableList2.size(), i);
            this.f26256h = immutableList2;
        }

        @Override // p007c.p190n.p378c.p380b.AbstractIndexedListIterator
        /* JADX INFO: renamed from: a */
        public E mo11580a(int i) {
            return this.f26256h.get(i);
        }
    }

    /* JADX INFO: renamed from: c.n.c.b.r$c */
    /* JADX INFO: compiled from: ImmutableList.java */
    public static class c implements Serializable {

        /* JADX INFO: renamed from: f */
        public final Object[] f26257f;

        public c(Object[] objArr) {
            this.f26257f = objArr;
        }

        public Object readResolve() {
            Object[] objArr = this.f26257f;
            AbstractIndexedListIterator<Object> abstractIndexedListIterator = ImmutableList2.f26255g;
            return objArr.length == 0 ? RegularImmutableList.f26218h : ImmutableList2.m11641v((Object[]) objArr.clone());
        }
    }

    /* JADX INFO: renamed from: c.n.c.b.r$d */
    /* JADX INFO: compiled from: ImmutableList.java */
    public class d extends ImmutableList2<E> {

        /* JADX INFO: renamed from: h */
        public final transient int f26258h;

        /* JADX INFO: renamed from: i */
        public final transient int f26259i;

        public d(int i, int i2) {
            this.f26258h = i;
            this.f26259i = i2;
        }

        @Override // p007c.p190n.p378c.p380b.ImmutableList2, java.util.List
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
        public ImmutableList2<E> subList(int i, int i2) {
            C4799a.m11004o(i, i2, this.f26259i);
            ImmutableList2 immutableList2 = ImmutableList2.this;
            int i3 = this.f26258h;
            return immutableList2.subList(i + i3, i2 + i3);
        }

        @Override // java.util.List
        public E get(int i) {
            C4799a.m10994j(i, this.f26259i);
            return ImmutableList2.this.get(i + this.f26258h);
        }

        @Override // p007c.p190n.p378c.p380b.ImmutableCollection
        /* JADX INFO: renamed from: h */
        public Object[] mo11619h() {
            return ImmutableList2.this.mo11619h();
        }

        @Override // p007c.p190n.p378c.p380b.ImmutableList2, p007c.p190n.p378c.p380b.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return listIterator();
        }

        @Override // p007c.p190n.p378c.p380b.ImmutableCollection
        /* JADX INFO: renamed from: j */
        public int mo11620j() {
            return ImmutableList2.this.mo11621m() + this.f26258h + this.f26259i;
        }

        @Override // p007c.p190n.p378c.p380b.ImmutableList2, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return listIterator();
        }

        @Override // p007c.p190n.p378c.p380b.ImmutableCollection
        /* JADX INFO: renamed from: m */
        public int mo11621m() {
            return ImmutableList2.this.mo11621m() + this.f26258h;
        }

        @Override // p007c.p190n.p378c.p380b.ImmutableCollection
        /* JADX INFO: renamed from: q */
        public boolean mo11622q() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f26259i;
        }

        @Override // p007c.p190n.p378c.p380b.ImmutableList2, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return listIterator(i);
        }
    }

    /* JADX INFO: renamed from: B */
    public static <E> ImmutableList2<E> m11637B(E e) {
        return m11641v(e);
    }

    /* JADX INFO: renamed from: C */
    public static <E> ImmutableList2<E> m11638C(E e, E e2, E e3, E e4, E e5) {
        return m11641v(e, e2, e3, e4, e5);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    /* JADX INFO: renamed from: t */
    public static <E> ImmutableList2<E> m11639t(Object[] objArr) {
        return m11640u(objArr, objArr.length);
    }

    /* JADX INFO: renamed from: u */
    public static <E> ImmutableList2<E> m11640u(Object[] objArr, int i) {
        return i == 0 ? (ImmutableList2<E>) RegularImmutableList.f26218h : new RegularImmutableList(objArr, i);
    }

    /* JADX INFO: renamed from: v */
    public static <E> ImmutableList2<E> m11641v(Object... objArr) {
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            C4799a.m10996k(objArr[i], i);
        }
        return m11640u(objArr, objArr.length);
    }

    /* JADX INFO: renamed from: x */
    public static <E> ImmutableList2<E> m11642x(Collection<? extends E> collection) {
        if (!(collection instanceof ImmutableCollection)) {
            return m11641v(collection.toArray());
        }
        ImmutableList2<E> immutableList2Mo11629c = ((ImmutableCollection) collection).mo11629c();
        return immutableList2Mo11629c.mo11622q() ? m11639t(immutableList2Mo11629c.toArray()) : immutableList2Mo11629c;
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: D */
    public ImmutableList2<E> subList(int i, int i2) {
        C4799a.m11004o(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        return i3 == 0 ? (ImmutableList2<E>) RegularImmutableList.f26218h : new d(i, i3);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @CanIgnoreReturnValue
    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // p007c.p190n.p378c.p380b.ImmutableCollection
    /* JADX INFO: renamed from: c */
    public final ImmutableList2<E> mo11629c() {
        return this;
    }

    @Override // p007c.p190n.p378c.p380b.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@NullableDecl Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(@NullableDecl Object obj) {
        if (obj != this) {
            if (!(obj instanceof List)) {
                return false;
            }
            List list = (List) obj;
            int size = size();
            if (size != list.size()) {
                return false;
            }
            if (!(list instanceof RandomAccess)) {
                Iterator<E> it = iterator();
                Iterator<E> it2 = list.iterator();
                while (it.hasNext()) {
                    if (!it2.hasNext() || !C4799a.m10952C(it.next(), it2.next())) {
                        return false;
                    }
                }
                return !it2.hasNext();
            }
            for (int i = 0; i < size; i++) {
                if (!C4799a.m10952C(get(i), list.get(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // p007c.p190n.p378c.p380b.ImmutableCollection
    /* JADX INFO: renamed from: f */
    public int mo11618f(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~(get(i2).hashCode() + (i * 31)));
        }
        return i;
    }

    @Override // java.util.List
    public int indexOf(@NullableDecl Object obj) {
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

    @Override // p007c.p190n.p378c.p380b.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(@NullableDecl Object obj) {
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
    @CanIgnoreReturnValue
    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // p007c.p190n.p378c.p380b.ImmutableCollection
    /* JADX INFO: renamed from: s */
    public UnmodifiableIterator<E> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    @CanIgnoreReturnValue
    @Deprecated
    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Override // p007c.p190n.p378c.p380b.ImmutableCollection
    public Object writeReplace() {
        return new c(toArray());
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public AbstractIndexedListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public AbstractIndexedListIterator<E> listIterator(int i) {
        C4799a.m11002n(i, size());
        return isEmpty() ? (AbstractIndexedListIterator<E>) f26255g : new b(this, i);
    }
}
