package p007c.p190n.p378c.p380b;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p007c.p190n.p194b.p334e.C4799a;

/* JADX INFO: renamed from: c.n.c.b.d, reason: use source file name */
/* JADX INFO: compiled from: AbstractMapBasedMultimap.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractMapBasedMultimap<K, V> extends AbstractMultimap<K, V> implements Serializable {

    /* JADX INFO: renamed from: i */
    public transient Map<K, Collection<V>> f26149i;

    /* JADX INFO: renamed from: j */
    public transient int f26150j;

    /* JADX INFO: renamed from: c.n.c.b.d$a */
    /* JADX INFO: compiled from: AbstractMapBasedMultimap.java */
    public class a extends AbstractMapBasedMultimap<K, V>.c<V> {
        public a(AbstractMapBasedMultimap abstractMapBasedMultimap) {
            super();
        }
    }

    /* JADX INFO: renamed from: c.n.c.b.d$b */
    /* JADX INFO: compiled from: AbstractMapBasedMultimap.java */
    public class b extends Maps5<K, Collection<V>> {

        /* JADX INFO: renamed from: h */
        public final transient Map<K, Collection<V>> f26151h;

        /* JADX INFO: renamed from: c.n.c.b.d$b$a */
        /* JADX INFO: compiled from: AbstractMapBasedMultimap.java */
        public class a extends Maps2<K, Collection<V>> {
            public a() {
            }

            @Override // p007c.p190n.p378c.p380b.Maps2, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                Set<Map.Entry<K, Collection<V>>> setEntrySet = b.this.f26151h.entrySet();
                Objects.requireNonNull(setEntrySet);
                try {
                    return setEntrySet.contains(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return b.this.new C8520b();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                Collection<V> collectionRemove;
                if (!contains(obj)) {
                    return false;
                }
                AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
                Object key = ((Map.Entry) obj).getKey();
                Map<K, Collection<V>> map = abstractMapBasedMultimap.f26149i;
                Objects.requireNonNull(map);
                try {
                    collectionRemove = map.remove(key);
                } catch (ClassCastException | NullPointerException unused) {
                    collectionRemove = null;
                }
                Collection<V> collection = collectionRemove;
                if (collection == null) {
                    return true;
                }
                int size = collection.size();
                collection.clear();
                abstractMapBasedMultimap.f26150j -= size;
                return true;
            }
        }

        /* JADX INFO: renamed from: c.n.c.b.d$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: AbstractMapBasedMultimap.java */
        public class C8520b implements Iterator<Map.Entry<K, Collection<V>>> {

            /* JADX INFO: renamed from: f */
            public final Iterator<Map.Entry<K, Collection<V>>> f26154f;

            /* JADX INFO: renamed from: g */
            @NullableDecl
            public Collection<V> f26155g;

            public C8520b() {
                this.f26154f = b.this.f26151h.entrySet().iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f26154f.hasNext();
            }

            @Override // java.util.Iterator
            public Object next() {
                Map.Entry<K, Collection<V>> next = this.f26154f.next();
                this.f26155g = next.getValue();
                return b.this.m11586a(next);
            }

            @Override // java.util.Iterator
            public void remove() {
                C4799a.m11006p(this.f26155g != null);
                this.f26154f.remove();
                AbstractMapBasedMultimap.this.f26150j -= this.f26155g.size();
                this.f26155g.clear();
                this.f26155g = null;
            }
        }

        public b(Map<K, Collection<V>> map) {
            this.f26151h = map;
        }

        /* JADX INFO: renamed from: a */
        public Map.Entry<K, Collection<V>> m11586a(Map.Entry<K, Collection<V>> entry) {
            K key = entry.getKey();
            AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
            Collection<V> value = entry.getValue();
            AbstractListMultimap abstractListMultimap = (AbstractListMultimap) abstractMapBasedMultimap;
            Objects.requireNonNull(abstractListMultimap);
            List list = (List) value;
            return new ImmutableEntry(key, list instanceof RandomAccess ? new g(abstractListMultimap, key, list, null) : new k(key, list, null));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            Map<K, Collection<V>> map = this.f26151h;
            AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
            if (map == abstractMapBasedMultimap.f26149i) {
                abstractMapBasedMultimap.clear();
                return;
            }
            C8520b c8520b = new C8520b();
            while (c8520b.hasNext()) {
                c8520b.next();
                c8520b.remove();
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            Map<K, Collection<V>> map = this.f26151h;
            Objects.requireNonNull(map);
            try {
                return map.containsKey(obj);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(@NullableDecl Object obj) {
            return this == obj || this.f26151h.equals(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Object get(Object obj) {
            Collection<V> collection;
            Map<K, Collection<V>> map = this.f26151h;
            Objects.requireNonNull(map);
            try {
                collection = map.get(obj);
            } catch (ClassCastException | NullPointerException unused) {
                collection = null;
            }
            Collection<V> collection2 = collection;
            if (collection2 == null) {
                return null;
            }
            AbstractListMultimap abstractListMultimap = (AbstractListMultimap) AbstractMapBasedMultimap.this;
            Objects.requireNonNull(abstractListMultimap);
            List list = (List) collection2;
            return list instanceof RandomAccess ? new g(abstractListMultimap, obj, list, null) : new k(obj, list, null);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
            return this.f26151h.hashCode();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
            Set<K> set = abstractMapBasedMultimap.f26184f;
            if (set != null) {
                return set;
            }
            Set<K> setMo11602d = abstractMapBasedMultimap.mo11602d();
            abstractMapBasedMultimap.f26184f = setMo11602d;
            return setMo11602d;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Object remove(Object obj) {
            Collection<V> collectionRemove = this.f26151h.remove(obj);
            if (collectionRemove == null) {
                return null;
            }
            Collection<V> collectionMo11585h = AbstractMapBasedMultimap.this.mo11585h();
            collectionMo11585h.addAll(collectionRemove);
            AbstractMapBasedMultimap.this.f26150j -= collectionRemove.size();
            collectionRemove.clear();
            return collectionMo11585h;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f26151h.size();
        }

        @Override // java.util.AbstractMap
        public String toString() {
            return this.f26151h.toString();
        }
    }

    /* JADX INFO: renamed from: c.n.c.b.d$c */
    /* JADX INFO: compiled from: AbstractMapBasedMultimap.java */
    public abstract class c<T> implements Iterator<T> {

        /* JADX INFO: renamed from: f */
        public final Iterator<Map.Entry<K, Collection<V>>> f26157f;

        /* JADX INFO: renamed from: g */
        @NullableDecl
        public K f26158g = null;

        /* JADX INFO: renamed from: h */
        @MonotonicNonNullDecl
        public Collection<V> f26159h = null;

        /* JADX INFO: renamed from: i */
        public Iterator<V> f26160i = Iterators3.INSTANCE;

        public c() {
            this.f26157f = AbstractMapBasedMultimap.this.f26149i.entrySet().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f26157f.hasNext() || this.f26160i.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            if (!this.f26160i.hasNext()) {
                Map.Entry<K, Collection<V>> next = this.f26157f.next();
                this.f26158g = next.getKey();
                Collection<V> value = next.getValue();
                this.f26159h = value;
                this.f26160i = value.iterator();
            }
            return this.f26160i.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f26160i.remove();
            if (this.f26159h.isEmpty()) {
                this.f26157f.remove();
            }
            AbstractMapBasedMultimap.m11583g(AbstractMapBasedMultimap.this);
        }
    }

    /* JADX INFO: renamed from: c.n.c.b.d$d */
    /* JADX INFO: compiled from: AbstractMapBasedMultimap.java */
    public class d extends Maps3<K, Collection<V>> {

        /* JADX INFO: renamed from: c.n.c.b.d$d$a */
        /* JADX INFO: compiled from: AbstractMapBasedMultimap.java */
        public class a implements Iterator<K> {

            /* JADX INFO: renamed from: f */
            @NullableDecl
            public Map.Entry<K, Collection<V>> f26163f;

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ Iterator f26164g;

            public a(Iterator it) {
                this.f26164g = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f26164g.hasNext();
            }

            @Override // java.util.Iterator
            public K next() {
                Map.Entry<K, Collection<V>> entry = (Map.Entry) this.f26164g.next();
                this.f26163f = entry;
                return entry.getKey();
            }

            @Override // java.util.Iterator
            public void remove() {
                C4799a.m11006p(this.f26163f != null);
                Collection<V> value = this.f26163f.getValue();
                this.f26164g.remove();
                AbstractMapBasedMultimap.this.f26150j -= value.size();
                value.clear();
                this.f26163f = null;
            }
        }

        public d(Map<K, Collection<V>> map) {
            super(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            Iterator<K> it = iterator();
            while (true) {
                a aVar = (a) it;
                if (!aVar.hasNext()) {
                    return;
                }
                aVar.next();
                aVar.remove();
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return this.f26148f.keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(@NullableDecl Object obj) {
            return this == obj || this.f26148f.keySet().equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return this.f26148f.keySet().hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a(this.f26148f.entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int size;
            Collection collection = (Collection) this.f26148f.remove(obj);
            if (collection != null) {
                size = collection.size();
                collection.clear();
                AbstractMapBasedMultimap.this.f26150j -= size;
            } else {
                size = 0;
            }
            return size > 0;
        }
    }

    /* JADX INFO: renamed from: c.n.c.b.d$e */
    /* JADX INFO: compiled from: AbstractMapBasedMultimap.java */
    public class e extends AbstractMapBasedMultimap<K, V>.h implements NavigableMap<K, Collection<V>> {
        public e(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // p007c.p190n.p378c.p380b.AbstractMapBasedMultimap.h
        /* JADX INFO: renamed from: b */
        public SortedSet mo11587b() {
            return new f(mo11589d());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> ceilingEntry(K k) {
            Map.Entry<K, Collection<V>> entryCeilingEntry = mo11589d().ceilingEntry(k);
            if (entryCeilingEntry == null) {
                return null;
            }
            return m11586a(entryCeilingEntry);
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(K k) {
            return mo11589d().ceilingKey(k);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return ((e) descendingMap()).navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> descendingMap() {
            return new e(mo11589d().descendingMap());
        }

        @Override // p007c.p190n.p378c.p380b.AbstractMapBasedMultimap.h, p007c.p190n.p378c.p380b.AbstractMapBasedMultimap.b, java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public NavigableSet<K> keySet() {
            SortedSet<K> sortedSetMo11587b = this.f26168j;
            if (sortedSetMo11587b == null) {
                sortedSetMo11587b = mo11587b();
                this.f26168j = sortedSetMo11587b;
            }
            return (NavigableSet) sortedSetMo11587b;
        }

        /* JADX INFO: renamed from: f */
        public Map.Entry<K, Collection<V>> m11591f(Iterator<Map.Entry<K, Collection<V>>> it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry<K, Collection<V>> next = it.next();
            Collection<V> collectionMo11585h = AbstractMapBasedMultimap.this.mo11585h();
            collectionMo11585h.addAll(next.getValue());
            it.remove();
            K key = next.getKey();
            Objects.requireNonNull((AbstractListMultimap) AbstractMapBasedMultimap.this);
            return new ImmutableEntry(key, Collections.unmodifiableList((List) collectionMo11585h));
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry<K, Collection<V>> entryFirstEntry = mo11589d().firstEntry();
            if (entryFirstEntry == null) {
                return null;
            }
            return m11586a(entryFirstEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> floorEntry(K k) {
            Map.Entry<K, Collection<V>> entryFloorEntry = mo11589d().floorEntry(k);
            if (entryFloorEntry == null) {
                return null;
            }
            return m11586a(entryFloorEntry);
        }

        @Override // java.util.NavigableMap
        public K floorKey(K k) {
            return mo11589d().floorKey(k);
        }

        @Override // p007c.p190n.p378c.p380b.AbstractMapBasedMultimap.h
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> mo11589d() {
            return (NavigableMap) ((SortedMap) this.f26151h);
        }

        @Override // p007c.p190n.p378c.p380b.AbstractMapBasedMultimap.h, java.util.SortedMap, java.util.NavigableMap
        public SortedMap headMap(Object obj) {
            return headMap(obj, false);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> higherEntry(K k) {
            Map.Entry<K, Collection<V>> entryHigherEntry = mo11589d().higherEntry(k);
            if (entryHigherEntry == null) {
                return null;
            }
            return m11586a(entryHigherEntry);
        }

        @Override // java.util.NavigableMap
        public K higherKey(K k) {
            return mo11589d().higherKey(k);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry<K, Collection<V>> entryLastEntry = mo11589d().lastEntry();
            if (entryLastEntry == null) {
                return null;
            }
            return m11586a(entryLastEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> lowerEntry(K k) {
            Map.Entry<K, Collection<V>> entryLowerEntry = mo11589d().lowerEntry(k);
            if (entryLowerEntry == null) {
                return null;
            }
            return m11586a(entryLowerEntry);
        }

        @Override // java.util.NavigableMap
        public K lowerKey(K k) {
            return mo11589d().lowerKey(k);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return mo11588c();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> pollFirstEntry() {
            return m11591f(entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> pollLastEntry() {
            return m11591f(((Maps5) descendingMap()).entrySet().iterator());
        }

        @Override // p007c.p190n.p378c.p380b.AbstractMapBasedMultimap.h, java.util.SortedMap, java.util.NavigableMap
        public SortedMap subMap(Object obj, Object obj2) {
            return subMap(obj, true, obj2, false);
        }

        @Override // p007c.p190n.p378c.p380b.AbstractMapBasedMultimap.h, java.util.SortedMap, java.util.NavigableMap
        public SortedMap tailMap(Object obj) {
            return tailMap(obj, true);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> headMap(K k, boolean z) {
            return new e(mo11589d().headMap(k, z));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> subMap(K k, boolean z, K k2, boolean z2) {
            return new e(mo11589d().subMap(k, z, k2, z2));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> tailMap(K k, boolean z) {
            return new e(mo11589d().tailMap(k, z));
        }
    }

    /* JADX INFO: renamed from: c.n.c.b.d$f */
    /* JADX INFO: compiled from: AbstractMapBasedMultimap.java */
    public class f extends AbstractMapBasedMultimap<K, V>.i implements NavigableSet<K> {
        public f(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableSet
        public K ceiling(K k) {
            return mo11593c().ceilingKey(k);
        }

        @Override // java.util.NavigableSet
        public Iterator<K> descendingIterator() {
            return ((d) descendingSet()).iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> descendingSet() {
            return new f(mo11593c().descendingMap());
        }

        @Override // p007c.p190n.p378c.p380b.AbstractMapBasedMultimap.i
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> mo11593c() {
            return (NavigableMap) ((SortedMap) this.f26148f);
        }

        @Override // java.util.NavigableSet
        public K floor(K k) {
            return mo11593c().floorKey(k);
        }

        @Override // p007c.p190n.p378c.p380b.AbstractMapBasedMultimap.i, java.util.SortedSet, java.util.NavigableSet
        public SortedSet headSet(Object obj) {
            return headSet(obj, false);
        }

        @Override // java.util.NavigableSet
        public K higher(K k) {
            return mo11593c().higherKey(k);
        }

        @Override // java.util.NavigableSet
        public K lower(K k) {
            return mo11593c().lowerKey(k);
        }

        @Override // java.util.NavigableSet
        public K pollFirst() {
            d.a aVar = (d.a) iterator();
            if (!aVar.hasNext()) {
                return null;
            }
            K k = (K) aVar.next();
            aVar.remove();
            return k;
        }

        @Override // java.util.NavigableSet
        public K pollLast() {
            Iterator<K> itDescendingIterator = descendingIterator();
            if (!itDescendingIterator.hasNext()) {
                return null;
            }
            K next = itDescendingIterator.next();
            itDescendingIterator.remove();
            return next;
        }

        @Override // p007c.p190n.p378c.p380b.AbstractMapBasedMultimap.i, java.util.SortedSet, java.util.NavigableSet
        public SortedSet subSet(Object obj, Object obj2) {
            return subSet(obj, true, obj2, false);
        }

        @Override // p007c.p190n.p378c.p380b.AbstractMapBasedMultimap.i, java.util.SortedSet, java.util.NavigableSet
        public SortedSet tailSet(Object obj) {
            return tailSet(obj, true);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> headSet(K k, boolean z) {
            return new f(mo11593c().headMap(k, z));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> subSet(K k, boolean z, K k2, boolean z2) {
            return new f(mo11593c().subMap(k, z, k2, z2));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> tailSet(K k, boolean z) {
            return new f(mo11593c().tailMap(k, z));
        }
    }

    /* JADX INFO: renamed from: c.n.c.b.d$g */
    /* JADX INFO: compiled from: AbstractMapBasedMultimap.java */
    public class g extends AbstractMapBasedMultimap<K, V>.k implements RandomAccess {
        public g(@NullableDecl AbstractMapBasedMultimap abstractMapBasedMultimap, K k, @NullableDecl List<V> list, AbstractMapBasedMultimap<K, V>.j jVar) {
            super(k, list, jVar);
        }
    }

    /* JADX INFO: renamed from: c.n.c.b.d$h */
    /* JADX INFO: compiled from: AbstractMapBasedMultimap.java */
    public class h extends AbstractMapBasedMultimap<K, V>.b implements SortedMap<K, Collection<V>> {

        /* JADX INFO: renamed from: j */
        @MonotonicNonNullDecl
        public SortedSet<K> f26168j;

        public h(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        /* JADX INFO: renamed from: b */
        public SortedSet<K> mo11587b() {
            return new i(mo11589d());
        }

        @Override // p007c.p190n.p378c.p380b.AbstractMapBasedMultimap.b, java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: c */
        public SortedSet<K> keySet() {
            SortedSet<K> sortedSet = this.f26168j;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet<K> sortedSetMo11587b = mo11587b();
            this.f26168j = sortedSetMo11587b;
            return sortedSetMo11587b;
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            return mo11589d().comparator();
        }

        /* JADX INFO: renamed from: d */
        public SortedMap<K, Collection<V>> mo11589d() {
            return (SortedMap) this.f26151h;
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            return mo11589d().firstKey();
        }

        public SortedMap<K, Collection<V>> headMap(K k) {
            return new h(mo11589d().headMap(k));
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            return mo11589d().lastKey();
        }

        public SortedMap<K, Collection<V>> subMap(K k, K k2) {
            return new h(mo11589d().subMap(k, k2));
        }

        public SortedMap<K, Collection<V>> tailMap(K k) {
            return new h(mo11589d().tailMap(k));
        }
    }

    /* JADX INFO: renamed from: c.n.c.b.d$i */
    /* JADX INFO: compiled from: AbstractMapBasedMultimap.java */
    public class i extends AbstractMapBasedMultimap<K, V>.d implements SortedSet<K> {
        public i(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        /* JADX INFO: renamed from: c */
        public SortedMap<K, Collection<V>> mo11593c() {
            return (SortedMap) this.f26148f;
        }

        @Override // java.util.SortedSet
        public Comparator<? super K> comparator() {
            return mo11593c().comparator();
        }

        @Override // java.util.SortedSet
        public K first() {
            return mo11593c().firstKey();
        }

        public SortedSet<K> headSet(K k) {
            return new i(mo11593c().headMap(k));
        }

        @Override // java.util.SortedSet
        public K last() {
            return mo11593c().lastKey();
        }

        public SortedSet<K> subSet(K k, K k2) {
            return new i(mo11593c().subMap(k, k2));
        }

        public SortedSet<K> tailSet(K k) {
            return new i(mo11593c().tailMap(k));
        }
    }

    public AbstractMapBasedMultimap(Map<K, Collection<V>> map) {
        C4799a.m10988g(map.isEmpty());
        this.f26149i = map;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ int m11582f(AbstractMapBasedMultimap abstractMapBasedMultimap) {
        int i2 = abstractMapBasedMultimap.f26150j;
        abstractMapBasedMultimap.f26150j = i2 + 1;
        return i2;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ int m11583g(AbstractMapBasedMultimap abstractMapBasedMultimap) {
        int i2 = abstractMapBasedMultimap.f26150j;
        abstractMapBasedMultimap.f26150j = i2 - 1;
        return i2;
    }

    @Override // p007c.p190n.p378c.p380b.Multimap
    public void clear() {
        Iterator<Collection<V>> it = this.f26149i.values().iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        this.f26149i.clear();
        this.f26150j = 0;
    }

    @Override // p007c.p190n.p378c.p380b.AbstractMultimap
    /* JADX INFO: renamed from: e */
    public Iterator<V> mo11584e() {
        return new a(this);
    }

    /* JADX INFO: renamed from: h */
    public abstract Collection<V> mo11585h();

    @Override // p007c.p190n.p378c.p380b.Multimap
    public int size() {
        return this.f26150j;
    }

    /* JADX INFO: renamed from: c.n.c.b.d$k */
    /* JADX INFO: compiled from: AbstractMapBasedMultimap.java */
    public class k extends AbstractMapBasedMultimap<K, V>.j implements List<V> {

        /* JADX INFO: renamed from: c.n.c.b.d$k$a */
        /* JADX INFO: compiled from: AbstractMapBasedMultimap.java */
        public class a extends AbstractMapBasedMultimap<K, V>.j.a implements ListIterator<V> {
            public a() {
                super();
            }

            @Override // java.util.ListIterator
            public void add(V v) {
                boolean zIsEmpty = k.this.isEmpty();
                m11599b().add(v);
                AbstractMapBasedMultimap.m11582f(AbstractMapBasedMultimap.this);
                if (zIsEmpty) {
                    k.this.m11595c();
                }
            }

            /* JADX INFO: renamed from: b */
            public final ListIterator<V> m11599b() {
                m11598a();
                return (ListIterator) this.f26176f;
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return m11599b().hasPrevious();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return m11599b().nextIndex();
            }

            @Override // java.util.ListIterator
            public V previous() {
                return m11599b().previous();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return m11599b().previousIndex();
            }

            @Override // java.util.ListIterator
            public void set(V v) {
                m11599b().set(v);
            }

            public a(int i) {
                super(((List) k.this.f26172g).listIterator(i));
            }
        }

        public k(K k, @NullableDecl List<V> list, AbstractMapBasedMultimap<K, V>.j jVar) {
            super(k, list, jVar);
        }

        @Override // java.util.List
        public void add(int i, V v) {
            m11596f();
            boolean zIsEmpty = this.f26172g.isEmpty();
            ((List) this.f26172g).add(i, v);
            AbstractMapBasedMultimap.m11582f(AbstractMapBasedMultimap.this);
            if (zIsEmpty) {
                m11595c();
            }
        }

        @Override // java.util.List
        public boolean addAll(int i, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = ((List) this.f26172g).addAll(i, collection);
            if (zAddAll) {
                int size2 = this.f26172g.size();
                AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
                abstractMapBasedMultimap.f26150j = (size2 - size) + abstractMapBasedMultimap.f26150j;
                if (size == 0) {
                    m11595c();
                }
            }
            return zAddAll;
        }

        @Override // java.util.List
        public V get(int i) {
            m11596f();
            return (V) ((List) this.f26172g).get(i);
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            m11596f();
            return ((List) this.f26172g).indexOf(obj);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            m11596f();
            return ((List) this.f26172g).lastIndexOf(obj);
        }

        @Override // java.util.List
        public ListIterator<V> listIterator() {
            m11596f();
            return new a();
        }

        @Override // java.util.List
        public V remove(int i) {
            m11596f();
            V v = (V) ((List) this.f26172g).remove(i);
            AbstractMapBasedMultimap.m11583g(AbstractMapBasedMultimap.this);
            m11597h();
            return v;
        }

        @Override // java.util.List
        public V set(int i, V v) {
            m11596f();
            return (V) ((List) this.f26172g).set(i, v);
        }

        @Override // java.util.List
        public List<V> subList(int i, int i2) {
            m11596f();
            AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
            K k = this.f26171f;
            List listSubList = ((List) this.f26172g).subList(i, i2);
            AbstractMapBasedMultimap<K, V>.j jVar = this.f26173h;
            if (jVar == null) {
                jVar = this;
            }
            Objects.requireNonNull(abstractMapBasedMultimap);
            return listSubList instanceof RandomAccess ? new g(abstractMapBasedMultimap, k, listSubList, jVar) : new k(k, listSubList, jVar);
        }

        @Override // java.util.List
        public ListIterator<V> listIterator(int i) {
            m11596f();
            return new a(i);
        }
    }

    /* JADX INFO: renamed from: c.n.c.b.d$j */
    /* JADX INFO: compiled from: AbstractMapBasedMultimap.java */
    public class j extends AbstractCollection<V> {

        /* JADX INFO: renamed from: f */
        @NullableDecl
        public final K f26171f;

        /* JADX INFO: renamed from: g */
        public Collection<V> f26172g;

        /* JADX INFO: renamed from: h */
        @NullableDecl
        public final AbstractMapBasedMultimap<K, V>.j f26173h;

        /* JADX INFO: renamed from: i */
        @NullableDecl
        public final Collection<V> f26174i;

        public j(K k, @NullableDecl Collection<V> collection, AbstractMapBasedMultimap<K, V>.j jVar) {
            this.f26171f = k;
            this.f26172g = collection;
            this.f26173h = jVar;
            this.f26174i = jVar == null ? null : jVar.f26172g;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(V v) {
            m11596f();
            boolean zIsEmpty = this.f26172g.isEmpty();
            boolean zAdd = this.f26172g.add(v);
            if (zAdd) {
                AbstractMapBasedMultimap.m11582f(AbstractMapBasedMultimap.this);
                if (zIsEmpty) {
                    m11595c();
                }
            }
            return zAdd;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = this.f26172g.addAll(collection);
            if (zAddAll) {
                int size2 = this.f26172g.size();
                AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
                abstractMapBasedMultimap.f26150j = (size2 - size) + abstractMapBasedMultimap.f26150j;
                if (size == 0) {
                    m11595c();
                }
            }
            return zAddAll;
        }

        /* JADX INFO: renamed from: c */
        public void m11595c() {
            AbstractMapBasedMultimap<K, V>.j jVar = this.f26173h;
            if (jVar != null) {
                jVar.m11595c();
            } else {
                AbstractMapBasedMultimap.this.f26149i.put(this.f26171f, this.f26172g);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.f26172g.clear();
            AbstractMapBasedMultimap.this.f26150j -= size;
            m11597h();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            m11596f();
            return this.f26172g.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            m11596f();
            return this.f26172g.containsAll(collection);
        }

        @Override // java.util.Collection
        public boolean equals(@NullableDecl Object obj) {
            if (obj == this) {
                return true;
            }
            m11596f();
            return this.f26172g.equals(obj);
        }

        /* JADX INFO: renamed from: f */
        public void m11596f() {
            Collection<V> collection;
            AbstractMapBasedMultimap<K, V>.j jVar = this.f26173h;
            if (jVar != null) {
                jVar.m11596f();
                if (this.f26173h.f26172g != this.f26174i) {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (!this.f26172g.isEmpty() || (collection = AbstractMapBasedMultimap.this.f26149i.get(this.f26171f)) == null) {
                    return;
                }
                this.f26172g = collection;
            }
        }

        /* JADX INFO: renamed from: h */
        public void m11597h() {
            AbstractMapBasedMultimap<K, V>.j jVar = this.f26173h;
            if (jVar != null) {
                jVar.m11597h();
            } else if (this.f26172g.isEmpty()) {
                AbstractMapBasedMultimap.this.f26149i.remove(this.f26171f);
            }
        }

        @Override // java.util.Collection
        public int hashCode() {
            m11596f();
            return this.f26172g.hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            m11596f();
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            m11596f();
            boolean zRemove = this.f26172g.remove(obj);
            if (zRemove) {
                AbstractMapBasedMultimap.m11583g(AbstractMapBasedMultimap.this);
                m11597h();
            }
            return zRemove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zRemoveAll = this.f26172g.removeAll(collection);
            if (zRemoveAll) {
                int size2 = this.f26172g.size();
                AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
                abstractMapBasedMultimap.f26150j = (size2 - size) + abstractMapBasedMultimap.f26150j;
                m11597h();
            }
            return zRemoveAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            Objects.requireNonNull(collection);
            int size = size();
            boolean zRetainAll = this.f26172g.retainAll(collection);
            if (zRetainAll) {
                int size2 = this.f26172g.size();
                AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
                abstractMapBasedMultimap.f26150j = (size2 - size) + abstractMapBasedMultimap.f26150j;
                m11597h();
            }
            return zRetainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            m11596f();
            return this.f26172g.size();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            m11596f();
            return this.f26172g.toString();
        }

        /* JADX INFO: renamed from: c.n.c.b.d$j$a */
        /* JADX INFO: compiled from: AbstractMapBasedMultimap.java */
        public class a implements Iterator<V> {

            /* JADX INFO: renamed from: f */
            public final Iterator<V> f26176f;

            /* JADX INFO: renamed from: g */
            public final Collection<V> f26177g;

            public a() {
                Collection<V> collection = j.this.f26172g;
                this.f26177g = collection;
                this.f26176f = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
            }

            /* JADX INFO: renamed from: a */
            public void m11598a() {
                j.this.m11596f();
                if (j.this.f26172g != this.f26177g) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                m11598a();
                return this.f26176f.hasNext();
            }

            @Override // java.util.Iterator
            public V next() {
                m11598a();
                return this.f26176f.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f26176f.remove();
                AbstractMapBasedMultimap.m11583g(AbstractMapBasedMultimap.this);
                j.this.m11597h();
            }

            public a(Iterator<V> it) {
                this.f26177g = j.this.f26172g;
                this.f26176f = it;
            }
        }
    }
}
