package p007c.p085g.p086a.p089m.p092t.p093c0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p007c.p085g.p086a.p089m.p092t.p093c0.Poolable;

/* JADX INFO: renamed from: c.g.a.m.t.c0.g, reason: use source file name */
/* JADX INFO: compiled from: GroupedLinkedMap.java */
/* JADX INFO: loaded from: classes.dex */
public class GroupedLinkedMap<K extends Poolable, V> {

    /* JADX INFO: renamed from: a */
    public final a<K, V> f3105a = new a<>(null);

    /* JADX INFO: renamed from: b */
    public final Map<K, a<K, V>> f3106b = new HashMap();

    /* JADX INFO: renamed from: c.g.a.m.t.c0.g$a */
    /* JADX INFO: compiled from: GroupedLinkedMap.java */
    public static class a<K, V> {

        /* JADX INFO: renamed from: a */
        public final K f3107a;

        /* JADX INFO: renamed from: b */
        public List<V> f3108b;

        /* JADX INFO: renamed from: c */
        public a<K, V> f3109c;

        /* JADX INFO: renamed from: d */
        public a<K, V> f3110d;

        public a() {
            this(null);
        }

        /* JADX INFO: renamed from: a */
        public V m1757a() {
            List<V> list = this.f3108b;
            int size = list != null ? list.size() : 0;
            if (size > 0) {
                return this.f3108b.remove(size - 1);
            }
            return null;
        }

        public a(K k) {
            this.f3110d = this;
            this.f3109c = this;
            this.f3107a = k;
        }
    }

    /* JADX INFO: renamed from: a */
    public V m1754a(K k) {
        a<K, V> aVar = this.f3106b.get(k);
        if (aVar == null) {
            aVar = new a<>(k);
            this.f3106b.put(k, aVar);
        } else {
            k.mo1763a();
        }
        a<K, V> aVar2 = aVar.f3110d;
        aVar2.f3109c = aVar.f3109c;
        aVar.f3109c.f3110d = aVar2;
        a<K, V> aVar3 = this.f3105a;
        aVar.f3110d = aVar3;
        a<K, V> aVar4 = aVar3.f3109c;
        aVar.f3109c = aVar4;
        aVar4.f3110d = aVar;
        aVar.f3110d.f3109c = aVar;
        return aVar.m1757a();
    }

    /* JADX INFO: renamed from: b */
    public void m1755b(K k, V v) {
        a<K, V> aVar = this.f3106b.get(k);
        if (aVar == null) {
            aVar = new a<>(k);
            a<K, V> aVar2 = aVar.f3110d;
            aVar2.f3109c = aVar.f3109c;
            aVar.f3109c.f3110d = aVar2;
            a<K, V> aVar3 = this.f3105a;
            aVar.f3110d = aVar3.f3110d;
            aVar.f3109c = aVar3;
            aVar3.f3110d = aVar;
            aVar.f3110d.f3109c = aVar;
            this.f3106b.put(k, aVar);
        } else {
            k.mo1763a();
        }
        if (aVar.f3108b == null) {
            aVar.f3108b = new ArrayList();
        }
        aVar.f3108b.add(v);
    }

    /* JADX INFO: renamed from: c */
    public V m1756c() {
        for (a aVar = this.f3105a.f3110d; !aVar.equals(this.f3105a); aVar = aVar.f3110d) {
            V v = (V) aVar.m1757a();
            if (v != null) {
                return v;
            }
            a<K, V> aVar2 = aVar.f3110d;
            aVar2.f3109c = aVar.f3109c;
            aVar.f3109c.f3110d = aVar2;
            this.f3106b.remove(aVar.f3107a);
            ((Poolable) aVar.f3107a).mo1763a();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        boolean z = false;
        for (a aVar = this.f3105a.f3109c; !aVar.equals(this.f3105a); aVar = aVar.f3109c) {
            z = true;
            sb.append('{');
            sb.append(aVar.f3107a);
            sb.append(':');
            List<V> list = aVar.f3108b;
            sb.append(list != null ? list.size() : 0);
            sb.append("}, ");
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
