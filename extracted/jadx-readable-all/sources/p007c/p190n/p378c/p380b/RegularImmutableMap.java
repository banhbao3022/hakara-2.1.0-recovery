package p007c.p190n.p378c.p380b;

import java.util.AbstractMap;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p007c.p190n.p194b.p334e.C4799a;

/* JADX INFO: renamed from: c.n.c.b.m0, reason: use source file name */
/* JADX INFO: compiled from: RegularImmutableMap.java */
/* JADX INFO: loaded from: classes.dex */
public final class RegularImmutableMap<K, V> extends ImmutableMap<K, V> {

    /* JADX INFO: renamed from: i */
    public static final ImmutableMap<Object, Object> f26222i = new RegularImmutableMap(null, new Object[0], 0);

    /* JADX INFO: renamed from: j */
    public final transient int[] f26223j;

    /* JADX INFO: renamed from: k */
    public final transient Object[] f26224k;

    /* JADX INFO: renamed from: l */
    public final transient int f26225l;

    /* JADX INFO: renamed from: c.n.c.b.m0$a */
    /* JADX INFO: compiled from: RegularImmutableMap.java */
    public static class a<K, V> extends ImmutableSet<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: i */
        public final transient ImmutableMap<K, V> f26226i;

        /* JADX INFO: renamed from: j */
        public final transient Object[] f26227j;

        /* JADX INFO: renamed from: k */
        public final transient int f26228k;

        /* JADX INFO: renamed from: l */
        public final transient int f26229l;

        /* JADX INFO: renamed from: c.n.c.b.m0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: RegularImmutableMap.java */
        public class C8521a extends ImmutableList2<Map.Entry<K, V>> {
            public C8521a() {
            }

            @Override // java.util.List
            public Object get(int i) {
                C4799a.m10994j(i, a.this.f26229l);
                a aVar = a.this;
                Object[] objArr = aVar.f26227j;
                int i2 = i * 2;
                int i3 = aVar.f26228k;
                return new AbstractMap.SimpleImmutableEntry(objArr[i2 + i3], objArr[i2 + (i3 ^ 1)]);
            }

            @Override // p007c.p190n.p378c.p380b.ImmutableCollection
            /* JADX INFO: renamed from: q */
            public boolean mo11622q() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return a.this.f26229l;
            }
        }

        public a(ImmutableMap<K, V> immutableMap, Object[] objArr, int i, int i2) {
            this.f26226i = immutableMap;
            this.f26227j = objArr;
            this.f26228k = i;
            this.f26229l = i2;
        }

        @Override // p007c.p190n.p378c.p380b.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            return value != null && value.equals(this.f26226i.get(key));
        }

        @Override // p007c.p190n.p378c.p380b.ImmutableCollection
        /* JADX INFO: renamed from: f */
        public int mo11618f(Object[] objArr, int i) {
            return mo11629c().mo11618f(objArr, i);
        }

        @Override // p007c.p190n.p378c.p380b.ImmutableCollection
        /* JADX INFO: renamed from: q */
        public boolean mo11622q() {
            return true;
        }

        @Override // p007c.p190n.p378c.p380b.ImmutableSet, p007c.p190n.p378c.p380b.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: s */
        public UnmodifiableIterator<Map.Entry<K, V>> iterator() {
            return mo11629c().listIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f26229l;
        }

        @Override // p007c.p190n.p378c.p380b.ImmutableSet
        /* JADX INFO: renamed from: y */
        public ImmutableList2<Map.Entry<K, V>> mo11628y() {
            return new C8521a();
        }
    }

    /* JADX INFO: renamed from: c.n.c.b.m0$b */
    /* JADX INFO: compiled from: RegularImmutableMap.java */
    public static final class b<K> extends ImmutableSet<K> {

        /* JADX INFO: renamed from: i */
        public final transient ImmutableMap<K, ?> f26231i;

        /* JADX INFO: renamed from: j */
        public final transient ImmutableList2<K> f26232j;

        public b(ImmutableMap<K, ?> immutableMap, ImmutableList2<K> immutableList2) {
            this.f26231i = immutableMap;
            this.f26232j = immutableList2;
        }

        @Override // p007c.p190n.p378c.p380b.ImmutableSet, p007c.p190n.p378c.p380b.ImmutableCollection
        /* JADX INFO: renamed from: c */
        public ImmutableList2<K> mo11629c() {
            return this.f26232j;
        }

        @Override // p007c.p190n.p378c.p380b.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
            return this.f26231i.get(obj) != null;
        }

        @Override // p007c.p190n.p378c.p380b.ImmutableCollection
        /* JADX INFO: renamed from: f */
        public int mo11618f(Object[] objArr, int i) {
            return this.f26232j.mo11618f(objArr, i);
        }

        @Override // p007c.p190n.p378c.p380b.ImmutableCollection
        /* JADX INFO: renamed from: q */
        public boolean mo11622q() {
            return true;
        }

        @Override // p007c.p190n.p378c.p380b.ImmutableSet, p007c.p190n.p378c.p380b.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: s */
        public UnmodifiableIterator<K> iterator() {
            return this.f26232j.listIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f26231i.size();
        }
    }

    /* JADX INFO: renamed from: c.n.c.b.m0$c */
    /* JADX INFO: compiled from: RegularImmutableMap.java */
    public static final class c extends ImmutableList2<Object> {

        /* JADX INFO: renamed from: h */
        public final transient Object[] f26233h;

        /* JADX INFO: renamed from: i */
        public final transient int f26234i;

        /* JADX INFO: renamed from: j */
        public final transient int f26235j;

        public c(Object[] objArr, int i, int i2) {
            this.f26233h = objArr;
            this.f26234i = i;
            this.f26235j = i2;
        }

        @Override // java.util.List
        public Object get(int i) {
            C4799a.m10994j(i, this.f26235j);
            return this.f26233h[(i * 2) + this.f26234i];
        }

        @Override // p007c.p190n.p378c.p380b.ImmutableCollection
        /* JADX INFO: renamed from: q */
        public boolean mo11622q() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f26235j;
        }
    }

    public RegularImmutableMap(int[] iArr, Object[] objArr, int i) {
        this.f26223j = iArr;
        this.f26224k = objArr;
        this.f26225l = i;
    }

    @Override // p007c.p190n.p378c.p380b.ImmutableMap
    /* JADX INFO: renamed from: b */
    public ImmutableSet<Map.Entry<K, V>> mo11623b() {
        return new a(this, this.f26224k, 0, this.f26225l);
    }

    @Override // p007c.p190n.p378c.p380b.ImmutableMap
    /* JADX INFO: renamed from: c */
    public ImmutableSet<K> mo11624c() {
        return new b(this, new c(this.f26224k, 0, this.f26225l));
    }

    @Override // p007c.p190n.p378c.p380b.ImmutableMap
    /* JADX INFO: renamed from: d */
    public ImmutableCollection<V> mo11625d() {
        return new c(this.f26224k, 1, this.f26225l);
    }

    @Override // p007c.p190n.p378c.p380b.ImmutableMap
    /* JADX INFO: renamed from: f */
    public boolean mo11626f() {
        return false;
    }

    @Override // p007c.p190n.p378c.p380b.ImmutableMap, java.util.Map
    @NullableDecl
    public V get(@NullableDecl Object obj) {
        int[] iArr = this.f26223j;
        Object[] objArr = this.f26224k;
        int i = this.f26225l;
        if (obj == null) {
            return null;
        }
        if (i == 1) {
            if (objArr[0].equals(obj)) {
                return (V) objArr[1];
            }
            return null;
        }
        if (iArr == null) {
            return null;
        }
        int length = iArr.length - 1;
        int iM11007p0 = C4799a.m11007p0(obj.hashCode());
        while (true) {
            int i2 = iM11007p0 & length;
            int i3 = iArr[i2];
            if (i3 == -1) {
                return null;
            }
            if (objArr[i3].equals(obj)) {
                return (V) objArr[i3 ^ 1];
            }
            iM11007p0 = i2 + 1;
        }
    }

    @Override // java.util.Map
    public int size() {
        return this.f26225l;
    }
}
