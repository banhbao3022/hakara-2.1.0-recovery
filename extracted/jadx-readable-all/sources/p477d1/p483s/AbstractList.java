package p477d1.p483s;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.RandomAccess;
import p007c.p071d.p078c.p079a.outline;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.p496v.KMarkers;

/* JADX INFO: renamed from: d1.s.c, reason: use source file name */
/* JADX INFO: compiled from: AbstractList.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractList<E> extends AbstractCollection<E> implements List<E>, KMarkers {

    /* JADX INFO: renamed from: f */
    public static final a f29508f = new a(null);

    /* JADX INFO: renamed from: d1.s.c$a */
    /* JADX INFO: compiled from: AbstractList.kt */
    public static final class a {
        public a() {
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: d1.s.c$b */
    /* JADX INFO: compiled from: AbstractList.kt */
    public class b implements Iterator<E>, KMarkers {

        /* JADX INFO: renamed from: f */
        public int f29509f;

        public b() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f29509f < AbstractList.this.mo13023c();
        }

        @Override // java.util.Iterator
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            AbstractList abstractList = AbstractList.this;
            int i = this.f29509f;
            this.f29509f = i + 1;
            return (E) abstractList.get(i);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: renamed from: d1.s.c$c */
    /* JADX INFO: compiled from: AbstractList.kt */
    public class c extends AbstractList<E>.b implements ListIterator<E>, KMarkers {
        public c(int i) {
            super();
            a aVar = AbstractList.f29508f;
            int iMo13023c = AbstractList.this.mo13023c();
            Objects.requireNonNull(aVar);
            if (i >= 0 && i <= iMo13023c) {
                this.f29509f = i;
                return;
            }
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + iMo13023c);
        }

        @Override // java.util.ListIterator
        public void add(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f29509f > 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f29509f;
        }

        @Override // java.util.ListIterator
        public E previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            AbstractList abstractList = AbstractList.this;
            int i = this.f29509f - 1;
            this.f29509f = i;
            return (E) abstractList.get(i);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f29509f - 1;
        }

        @Override // java.util.ListIterator
        public void set(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: renamed from: d1.s.c$d */
    /* JADX INFO: compiled from: AbstractList.kt */
    public static final class d<E> extends AbstractList<E> implements RandomAccess {

        /* JADX INFO: renamed from: g */
        public int f29512g;

        /* JADX INFO: renamed from: h */
        public final AbstractList<E> f29513h;

        /* JADX INFO: renamed from: i */
        public final int f29514i;

        /* JADX WARN: Multi-variable type inference failed */
        public d(AbstractList<? extends E> abstractList, int i, int i2) {
            Intrinsics2.m13089e(abstractList, "list");
            this.f29513h = abstractList;
            this.f29514i = i;
            a aVar = AbstractList.f29508f;
            int iMo13023c = abstractList.mo13023c();
            Objects.requireNonNull(aVar);
            if (i < 0 || i2 > iMo13023c) {
                StringBuilder sbM1559J = outline.m1559J("fromIndex: ", i, ", toIndex: ", i2, ", size: ");
                sbM1559J.append(iMo13023c);
                throw new IndexOutOfBoundsException(sbM1559J.toString());
            }
            if (i <= i2) {
                this.f29512g = i2 - i;
                return;
            }
            throw new IllegalArgumentException("fromIndex: " + i + " > toIndex: " + i2);
        }

        @Override // p477d1.p483s.AbstractCollection
        /* JADX INFO: renamed from: c */
        public int mo13023c() {
            return this.f29512g;
        }

        @Override // p477d1.p483s.AbstractList, java.util.List
        public E get(int i) {
            a aVar = AbstractList.f29508f;
            int i2 = this.f29512g;
            Objects.requireNonNull(aVar);
            if (i >= 0 && i < i2) {
                return this.f29513h.get(this.f29514i + i);
            }
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
        }
    }

    @Override // java.util.List
    public void add(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Collection collection = (Collection) obj;
        Objects.requireNonNull(f29508f);
        Intrinsics2.m13089e(this, "c");
        Intrinsics2.m13089e(collection, "other");
        if (size() == collection.size()) {
            Iterator<E> it = collection.iterator();
            Iterator<E> it2 = iterator();
            while (it2.hasNext()) {
                if (!Intrinsics2.m13085a(it2.next(), it.next())) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.List
    public abstract E get(int i);

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        Objects.requireNonNull(f29508f);
        Intrinsics2.m13089e(this, "c");
        Iterator<E> it = iterator();
        int iHashCode = 1;
        while (it.hasNext()) {
            E next = it.next();
            iHashCode = (iHashCode * 31) + (next != null ? next.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        b bVar = new b();
        int i = 0;
        while (bVar.hasNext()) {
            if (Intrinsics2.m13085a(bVar.next(), obj)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return new b();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        c cVar = new c(size());
        while (cVar.hasPrevious()) {
            if (Intrinsics2.m13085a(cVar.previous(), obj)) {
                return cVar.nextIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return new c(0);
    }

    @Override // java.util.List
    public E remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public E set(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List<E> subList(int i, int i2) {
        return new d(this, i, i2);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i) {
        return new c(i);
    }
}
