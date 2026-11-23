package p636z0.p691g;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: z0.g.f, reason: use source file name */
/* JADX INFO: compiled from: LruCache.java */
/* JADX INFO: loaded from: classes.dex */
public class LruCache2<K, V> {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap<K, V> f36639a;

    /* JADX INFO: renamed from: b */
    public int f36640b;

    /* JADX INFO: renamed from: c */
    public int f36641c;

    /* JADX INFO: renamed from: d */
    public int f36642d;

    /* JADX INFO: renamed from: e */
    public int f36643e;

    /* JADX INFO: renamed from: f */
    public int f36644f;

    /* JADX INFO: renamed from: g */
    public int f36645g;

    public LruCache2(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f36641c = i;
        this.f36639a = new LinkedHashMap<>(0, 0.75f, true);
    }

    /* JADX INFO: renamed from: a */
    public final V m15597a(K k) {
        Objects.requireNonNull(k, "key == null");
        synchronized (this) {
            V v = this.f36639a.get(k);
            if (v != null) {
                this.f36644f++;
                return v;
            }
            this.f36645g++;
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final V m15598b(K k, V v) {
        V vPut;
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f36642d++;
            this.f36640b++;
            vPut = this.f36639a.put(k, v);
            if (vPut != null) {
                this.f36640b--;
            }
        }
        m15599c(this.f36641c);
        return vPut;
    }

    /* JADX INFO: renamed from: c */
    public void m15599c(int i) {
        while (true) {
            synchronized (this) {
                if (this.f36640b < 0 || (this.f36639a.isEmpty() && this.f36640b != 0)) {
                    break;
                }
                if (this.f36640b > i && !this.f36639a.isEmpty()) {
                    Map.Entry<K, V> next = this.f36639a.entrySet().iterator().next();
                    K key = next.getKey();
                    next.getValue();
                    this.f36639a.remove(key);
                    this.f36640b--;
                    this.f36643e++;
                }
                return;
            }
        }
        throw new IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
    }

    public final synchronized String toString() {
        int i;
        int i2;
        i = this.f36644f;
        i2 = this.f36645g + i;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f36641c), Integer.valueOf(this.f36644f), Integer.valueOf(this.f36645g), Integer.valueOf(i2 != 0 ? (i * 100) / i2 : 0));
    }
}
