package p007c.p190n.p378c.p380b;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: c.n.c.b.h, reason: use source file name */
/* JADX INFO: compiled from: Collections2.java */
/* JADX INFO: loaded from: classes.dex */
public final class Collections2 {

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: c.n.c.b.h$a */
    /* JADX INFO: compiled from: Sets.java */
    public static class a<E> extends Sets4<E> {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ Set f26189f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ Set f26190g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Set set, Set set2) {
            super(null);
            this.f26189f = set;
            this.f26190g = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f26189f.contains(obj) && this.f26190g.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return this.f26189f.containsAll(collection) && this.f26190g.containsAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return Collections.disjoint(this.f26190g, this.f26189f);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new Sets2(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Iterator<E> it = this.f26189f.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (this.f26190g.contains(it.next())) {
                    i++;
                }
            }
            return i;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m11603a(Set<?> set) {
        Iterator<?> it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    /* JADX INFO: renamed from: b */
    public static <E> Sets4<E> m11604b(Set<E> set, Set<?> set2) {
        Objects.requireNonNull(set, "set1");
        Objects.requireNonNull(set2, "set2");
        return new a(set, set2);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m11605c(Set<?> set, Iterator<?> it) {
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= set.remove(it.next());
        }
        return zRemove;
    }
}
