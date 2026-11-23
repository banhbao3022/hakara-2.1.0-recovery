package p007c.p085g.p086a.p089m.p092t.p093c0;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Objects;
import java.util.TreeMap;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.g.a.m.t.c0.i, reason: use source file name */
/* JADX INFO: compiled from: LruArrayPool.java */
/* JADX INFO: loaded from: classes.dex */
public final class LruArrayPool implements ArrayPool {

    /* JADX INFO: renamed from: a */
    public final GroupedLinkedMap<a, Object> f3111a;

    /* JADX INFO: renamed from: b */
    public final b f3112b;

    /* JADX INFO: renamed from: c */
    public final Map<Class<?>, NavigableMap<Integer, Integer>> f3113c;

    /* JADX INFO: renamed from: d */
    public final Map<Class<?>, ArrayAdapterInterface<?>> f3114d;

    /* JADX INFO: renamed from: e */
    public final int f3115e;

    /* JADX INFO: renamed from: f */
    public int f3116f;

    /* JADX INFO: renamed from: c.g.a.m.t.c0.i$a */
    /* JADX INFO: compiled from: LruArrayPool.java */
    public static final class a implements Poolable {

        /* JADX INFO: renamed from: a */
        public final b f3117a;

        /* JADX INFO: renamed from: b */
        public int f3118b;

        /* JADX INFO: renamed from: c */
        public Class<?> f3119c;

        public a(b bVar) {
            this.f3117a = bVar;
        }

        @Override // p007c.p085g.p086a.p089m.p092t.p093c0.Poolable
        /* JADX INFO: renamed from: a */
        public void mo1763a() {
            this.f3117a.m1748c(this);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f3118b == aVar.f3118b && this.f3119c == aVar.f3119c;
        }

        public int hashCode() {
            int i = this.f3118b * 31;
            Class<?> cls = this.f3119c;
            return i + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sbM1556G = outline.m1556G("Key{size=");
            sbM1556G.append(this.f3118b);
            sbM1556G.append("array=");
            sbM1556G.append(this.f3119c);
            sbM1556G.append('}');
            return sbM1556G.toString();
        }
    }

    /* JADX INFO: renamed from: c.g.a.m.t.c0.i$b */
    /* JADX INFO: compiled from: LruArrayPool.java */
    public static final class b extends BaseKeyPool<a> {
        @Override // p007c.p085g.p086a.p089m.p092t.p093c0.BaseKeyPool
        /* JADX INFO: renamed from: a */
        public Poolable mo1746a() {
            return new a(this);
        }

        /* JADX INFO: renamed from: d */
        public a m1764d(int i, Class<?> cls) {
            a aVarM1747b = m1747b();
            aVarM1747b.f3118b = i;
            aVarM1747b.f3119c = cls;
            return aVarM1747b;
        }
    }

    public LruArrayPool() {
        this.f3111a = new GroupedLinkedMap<>();
        this.f3112b = new b();
        this.f3113c = new HashMap();
        this.f3114d = new HashMap();
        this.f3115e = 4194304;
    }

    @Override // p007c.p085g.p086a.p089m.p092t.p093c0.ArrayPool
    /* JADX INFO: renamed from: a */
    public synchronized void mo1741a(int i) {
        if (i >= 40) {
            synchronized (this) {
                m1759g(0);
            }
        } else if (i >= 20 || i == 15) {
            m1759g(this.f3115e / 2);
        }
    }

    @Override // p007c.p085g.p086a.p089m.p092t.p093c0.ArrayPool
    /* JADX INFO: renamed from: b */
    public synchronized void mo1742b() {
        m1759g(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p007c.p085g.p086a.p089m.p092t.p093c0.ArrayPool
    /* JADX INFO: renamed from: c */
    public synchronized <T> T mo1743c(int i, Class<T> cls) {
        a aVarM1747b;
        aVarM1747b = this.f3112b.m1747b();
        aVarM1747b.f3118b = i;
        aVarM1747b.f3119c = cls;
        return (T) m1761i(aVarM1747b, cls);
    }

    @Override // p007c.p085g.p086a.p089m.p092t.p093c0.ArrayPool
    /* JADX INFO: renamed from: d */
    public synchronized <T> void mo1744d(T t) {
        Class<?> cls = t.getClass();
        ArrayAdapterInterface<T> arrayAdapterInterfaceM1760h = m1760h(cls);
        int iMo1739b = arrayAdapterInterfaceM1760h.mo1739b(t);
        int iMo1738a = arrayAdapterInterfaceM1760h.mo1738a() * iMo1739b;
        int iIntValue = 1;
        if (iMo1738a <= this.f3115e / 2) {
            a aVarM1764d = this.f3112b.m1764d(iMo1739b, cls);
            this.f3111a.m1755b(aVarM1764d, t);
            NavigableMap<Integer, Integer> navigableMapM1762j = m1762j(cls);
            Integer num = (Integer) navigableMapM1762j.get(Integer.valueOf(aVarM1764d.f3118b));
            Integer numValueOf = Integer.valueOf(aVarM1764d.f3118b);
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapM1762j.put(numValueOf, Integer.valueOf(iIntValue));
            this.f3116f += iMo1738a;
            m1759g(this.f3115e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002c  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p007c.p085g.p086a.p089m.p092t.p093c0.ArrayPool
    /* JADX INFO: renamed from: e */
    public synchronized <T> T mo1745e(int i, Class<T> cls) {
        a aVarM1764d;
        Integer numCeilingKey = m1762j(cls).ceilingKey(Integer.valueOf(i));
        boolean z = true;
        if (numCeilingKey == null) {
            z = false;
        } else {
            int i2 = this.f3116f;
            if (!(i2 == 0 || this.f3115e / i2 >= 2) && numCeilingKey.intValue() > i * 8) {
                z = false;
            }
        }
        if (z) {
            aVarM1764d = this.f3112b.m1764d(numCeilingKey.intValue(), cls);
        } else {
            a aVarM1747b = this.f3112b.m1747b();
            aVarM1747b.f3118b = i;
            aVarM1747b.f3119c = cls;
            aVarM1764d = aVarM1747b;
        }
        return (T) m1761i(aVarM1764d, cls);
    }

    /* JADX INFO: renamed from: f */
    public final void m1758f(int i, Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMapM1762j = m1762j(cls);
        Integer num = (Integer) navigableMapM1762j.get(Integer.valueOf(i));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapM1762j.remove(Integer.valueOf(i));
                return;
            } else {
                navigableMapM1762j.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
    }

    /* JADX INFO: renamed from: g */
    public final void m1759g(int i) {
        while (this.f3116f > i) {
            Object objM1756c = this.f3111a.m1756c();
            Objects.requireNonNull(objM1756c, "Argument must not be null");
            ArrayAdapterInterface arrayAdapterInterfaceM1760h = m1760h(objM1756c.getClass());
            this.f3116f -= arrayAdapterInterfaceM1760h.mo1738a() * arrayAdapterInterfaceM1760h.mo1739b(objM1756c);
            m1758f(arrayAdapterInterfaceM1760h.mo1739b(objM1756c), objM1756c.getClass());
            if (Log.isLoggable(arrayAdapterInterfaceM1760h.mo1740w0(), 2)) {
                String strMo1740w0 = arrayAdapterInterfaceM1760h.mo1740w0();
                StringBuilder sbM1556G = outline.m1556G("evicted: ");
                sbM1556G.append(arrayAdapterInterfaceM1760h.mo1739b(objM1756c));
                Log.v(strMo1740w0, sbM1556G.toString());
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final <T> ArrayAdapterInterface<T> m1760h(Class<T> cls) {
        ArrayAdapterInterface<T> byteArrayAdapter = (ArrayAdapterInterface) this.f3114d.get(cls);
        if (byteArrayAdapter == null) {
            if (cls.equals(int[].class)) {
                byteArrayAdapter = new IntegerArrayAdapter();
            } else {
                if (!cls.equals(byte[].class)) {
                    StringBuilder sbM1556G = outline.m1556G("No array pool found for: ");
                    sbM1556G.append(cls.getSimpleName());
                    throw new IllegalArgumentException(sbM1556G.toString());
                }
                byteArrayAdapter = new ByteArrayAdapter();
            }
            this.f3114d.put(cls, byteArrayAdapter);
        }
        return byteArrayAdapter;
    }

    /* JADX INFO: renamed from: i */
    public final <T> T m1761i(a aVar, Class<T> cls) {
        ArrayAdapterInterface<T> arrayAdapterInterfaceM1760h = m1760h(cls);
        T t = (T) this.f3111a.m1754a(aVar);
        if (t != null) {
            this.f3116f -= arrayAdapterInterfaceM1760h.mo1738a() * arrayAdapterInterfaceM1760h.mo1739b(t);
            m1758f(arrayAdapterInterfaceM1760h.mo1739b(t), cls);
        }
        if (t != null) {
            return t;
        }
        if (Log.isLoggable(arrayAdapterInterfaceM1760h.mo1740w0(), 2)) {
            String strMo1740w0 = arrayAdapterInterfaceM1760h.mo1740w0();
            StringBuilder sbM1556G = outline.m1556G("Allocated ");
            sbM1556G.append(aVar.f3118b);
            sbM1556G.append(" bytes");
            Log.v(strMo1740w0, sbM1556G.toString());
        }
        return arrayAdapterInterfaceM1760h.newArray(aVar.f3118b);
    }

    /* JADX INFO: renamed from: j */
    public final NavigableMap<Integer, Integer> m1762j(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = this.f3113c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f3113c.put(cls, treeMap);
        return treeMap;
    }

    public LruArrayPool(int i) {
        this.f3111a = new GroupedLinkedMap<>();
        this.f3112b = new b();
        this.f3113c = new HashMap();
        this.f3114d = new HashMap();
        this.f3115e = i;
    }
}
