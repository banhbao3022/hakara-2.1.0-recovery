package p007c.p190n.p378c.p380b;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p334e.C4799a;

/* JADX INFO: renamed from: c.n.c.b.v, reason: use source file name */
/* JADX INFO: compiled from: ImmutableMultimap.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class ImmutableMultimap2<K, V> extends BaseImmutableMultimap<K, V> implements Serializable {

    /* JADX INFO: renamed from: i */
    public final transient ImmutableMap<K, ? extends ImmutableCollection<V>> f26275i;

    /* JADX INFO: renamed from: j */
    public final transient int f26276j;

    /* JADX INFO: renamed from: c.n.c.b.v$a */
    /* JADX INFO: compiled from: ImmutableMultimap.java */
    public static class a<K, V> {

        /* JADX INFO: renamed from: a */
        public Map<K, Collection<V>> f26277a = new CompactHashMap4();

        @CanIgnoreReturnValue
        /* JADX INFO: renamed from: a */
        public a<K, V> m11657a(K k, Iterable<? extends V> iterable) {
            if (k == null) {
                StringBuilder sbM1556G = outline.m1556G("null key in entry: null=");
                Iterator<? extends V> it = iterable.iterator();
                StringBuilder sbM1555F = outline.m1555F('[');
                boolean z = true;
                while (it.hasNext()) {
                    if (!z) {
                        sbM1555F.append(", ");
                    }
                    z = false;
                    sbM1555F.append(it.next());
                }
                sbM1555F.append(']');
                sbM1556G.append(sbM1555F.toString());
                throw new NullPointerException(sbM1556G.toString());
            }
            Collection<V> collection = this.f26277a.get(k);
            if (collection != null) {
                for (V v : iterable) {
                    C4799a.m10998l(k, v);
                    collection.add(v);
                }
                return this;
            }
            Iterator<? extends V> it2 = iterable.iterator();
            if (!it2.hasNext()) {
                return this;
            }
            ArrayList arrayList = new ArrayList();
            while (it2.hasNext()) {
                V next = it2.next();
                C4799a.m10998l(k, next);
                arrayList.add(next);
            }
            this.f26277a.put(k, arrayList);
            return this;
        }
    }

    /* JADX INFO: renamed from: c.n.c.b.v$b */
    /* JADX INFO: compiled from: ImmutableMultimap.java */
    public static class b {

        /* JADX INFO: renamed from: a */
        public static final Serialization2<ImmutableMultimap2> f26278a;

        /* JADX INFO: renamed from: b */
        public static final Serialization2<ImmutableMultimap2> f26279b;

        static {
            try {
                f26278a = new Serialization2<>(ImmutableMultimap2.class.getDeclaredField("i"), null);
                try {
                    f26279b = new Serialization2<>(ImmutableMultimap2.class.getDeclaredField("j"), null);
                } catch (NoSuchFieldException e) {
                    throw new AssertionError(e);
                }
            } catch (NoSuchFieldException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    public ImmutableMultimap2(ImmutableMap<K, ? extends ImmutableCollection<V>> immutableMap, int i) {
        this.f26275i = immutableMap;
        this.f26276j = i;
    }

    @Override // p007c.p190n.p378c.p380b.AbstractMultimap, p007c.p190n.p378c.p380b.Multimap
    /* JADX INFO: renamed from: a */
    public Map mo11581a() {
        return this.f26275i;
    }

    @Override // p007c.p190n.p378c.p380b.AbstractMultimap
    /* JADX INFO: renamed from: b */
    public boolean mo11600b(@NullableDecl Object obj) {
        return obj != null && super.mo11600b(obj);
    }

    @Override // p007c.p190n.p378c.p380b.AbstractMultimap
    /* JADX INFO: renamed from: c */
    public Map<K, Collection<V>> mo11601c() {
        throw new AssertionError("should never be called");
    }

    @Override // p007c.p190n.p378c.p380b.Multimap
    @Deprecated
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // p007c.p190n.p378c.p380b.AbstractMultimap
    /* JADX INFO: renamed from: d */
    public Set<K> mo11602d() {
        throw new AssertionError("unreachable");
    }

    @Override // p007c.p190n.p378c.p380b.AbstractMultimap
    /* JADX INFO: renamed from: e */
    public Iterator mo11584e() {
        return new ImmutableMultimap(this);
    }

    @Override // p007c.p190n.p378c.p380b.Multimap
    public int size() {
        return this.f26276j;
    }
}
