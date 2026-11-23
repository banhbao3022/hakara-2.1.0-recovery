package p007c.p085g.p086a.p112s;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: c.g.a.s.g, reason: use source file name */
/* JADX INFO: compiled from: LruCache.java */
/* JADX INFO: loaded from: classes.dex */
public class LruCache<T, Y> {

    /* JADX INFO: renamed from: a */
    public final Map<T, Y> f3821a = new LinkedHashMap(100, 0.75f, true);

    /* JADX INFO: renamed from: b */
    public long f3822b;

    /* JADX INFO: renamed from: c */
    public long f3823c;

    public LruCache(long j2) {
        this.f3822b = j2;
    }

    /* JADX INFO: renamed from: a */
    public synchronized Y m2041a(T t) {
        return this.f3821a.get(t);
    }

    /* JADX INFO: renamed from: b */
    public int mo1781b(Y y) {
        return 1;
    }

    /* JADX INFO: renamed from: c */
    public void mo1782c(T t, Y y) {
    }

    /* JADX INFO: renamed from: d */
    public synchronized Y m2042d(T t, Y y) {
        long jMo1781b = mo1781b(y);
        if (jMo1781b >= this.f3822b) {
            mo1782c(t, y);
            return null;
        }
        if (y != null) {
            this.f3823c += jMo1781b;
        }
        Y yPut = this.f3821a.put(t, y);
        if (yPut != null) {
            this.f3823c -= (long) mo1781b(yPut);
            if (!yPut.equals(y)) {
                mo1782c(t, yPut);
            }
        }
        m2043e(this.f3822b);
        return yPut;
    }

    /* JADX INFO: renamed from: e */
    public synchronized void m2043e(long j2) {
        while (this.f3823c > j2) {
            Iterator<Map.Entry<T, Y>> it = this.f3821a.entrySet().iterator();
            Map.Entry<T, Y> next = it.next();
            Y value = next.getValue();
            this.f3823c -= (long) mo1781b(value);
            T key = next.getKey();
            it.remove();
            mo1782c(key, value);
        }
    }
}
