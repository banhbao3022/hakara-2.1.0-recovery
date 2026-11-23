package p007c.p190n.p385d.p391l.p392e.p397m;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: c.n.d.l.e.m.w, reason: use source file name */
/* JADX INFO: compiled from: ImmutableList.java */
/* JADX INFO: loaded from: classes.dex */
public final class ImmutableList3<E> implements List<E>, RandomAccess {

    /* JADX INFO: renamed from: f */
    public final List<E> f26869f;

    public ImmutableList3(List<E> list) {
        this.f26869f = Collections.unmodifiableList(list);
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(E e) {
        return this.f26869f.add(e);
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        return this.f26869f.addAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        this.f26869f.clear();
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return this.f26869f.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return this.f26869f.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        return this.f26869f.equals(obj);
    }

    @Override // java.util.List
    public E get(int i) {
        return this.f26869f.get(i);
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.f26869f.hashCode();
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return this.f26869f.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f26869f.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return this.f26869f.iterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return this.f26869f.lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return this.f26869f.listIterator();
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        return this.f26869f.remove(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        return this.f26869f.removeAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        return this.f26869f.retainAll(collection);
    }

    @Override // java.util.List
    public E set(int i, E e) {
        return this.f26869f.set(i, e);
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        return this.f26869f.size();
    }

    @Override // java.util.List
    public List<E> subList(int i, int i2) {
        return this.f26869f.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return this.f26869f.toArray();
    }

    @Override // java.util.List
    public void add(int i, E e) {
        this.f26869f.add(i, e);
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends E> collection) {
        return this.f26869f.addAll(i, collection);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i) {
        return this.f26869f.listIterator(i);
    }

    @Override // java.util.List
    public E remove(int i) {
        return this.f26869f.remove(i);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) this.f26869f.toArray(tArr);
    }
}
