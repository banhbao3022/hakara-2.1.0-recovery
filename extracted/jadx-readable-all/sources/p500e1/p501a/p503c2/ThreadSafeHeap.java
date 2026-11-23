package p500e1.p501a.p503c2;

import java.lang.Comparable;
import java.util.Arrays;
import p477d1.p493x.p495c.Intrinsics2;
import p500e1.p501a.AbstractC6293p0;
import p500e1.p501a.p503c2.ThreadSafeHeap2;

/* JADX INFO: renamed from: e1.a.c2.v, reason: use source file name */
/* JADX INFO: compiled from: ThreadSafeHeap.kt */
/* JADX INFO: loaded from: classes.dex */
public class ThreadSafeHeap<T extends ThreadSafeHeap2 & Comparable<? super T>> {
    private volatile /* synthetic */ int _size = 0;

    /* JADX INFO: renamed from: a */
    public T[] f29682a;

    /* JADX INFO: renamed from: a */
    public final void m13167a(T t) {
        AbstractC6293p0.b bVar = (AbstractC6293p0.b) t;
        bVar.mo13175h(this);
        T[] tArr = this.f29682a;
        if (tArr == null) {
            tArr = (T[]) new ThreadSafeHeap2[4];
            this.f29682a = tArr;
        } else if (this._size >= tArr.length) {
            Object[] objArrCopyOf = Arrays.copyOf(tArr, this._size * 2);
            Intrinsics2.m13088d(objArrCopyOf, "java.util.Arrays.copyOf(this, newSize)");
            tArr = (T[]) ((ThreadSafeHeap2[]) objArrCopyOf);
            this.f29682a = tArr;
        }
        int i = this._size;
        this._size = i + 1;
        tArr[i] = t;
        bVar.f29788g = i;
        m13172f(i);
    }

    /* JADX INFO: renamed from: b */
    public final T m13168b() {
        T[] tArr = this.f29682a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m13169c() {
        return this._size == 0;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003c  */
    /* JADX WARN: Code duplicated, block: B:14:0x0047  */
    /* JADX WARN: Code duplicated, block: B:16:0x0059  */
    /* JADX WARN: Code duplicated, block: B:20:0x006d A[LOOP:0: B:9:0x0033->B:20:0x006d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x0072 A[EDGE_INSN: B:23:0x0072->B:21:0x0072 BREAK  A[LOOP:0: B:9:0x0033->B:20:0x006d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x0072 A[EDGE_INSN: B:24:0x0072->B:21:0x0072 BREAK  A[LOOP:0: B:9:0x0033->B:20:0x006d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:? A[SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public final T m13170d(int i) {
        int i2;
        T[] tArr;
        int i3;
        T t;
        T t2;
        T t3;
        T t4;
        T[] tArr2 = this.f29682a;
        Intrinsics2.m13087c(tArr2);
        this._size--;
        if (i < this._size) {
            m13173g(i, this._size);
            int i4 = (i - 1) / 2;
            if (i > 0) {
                T t5 = tArr2[i];
                Intrinsics2.m13087c(t5);
                T t6 = tArr2[i4];
                Intrinsics2.m13087c(t6);
                if (((Comparable) t5).compareTo(t6) < 0) {
                    m13173g(i, i4);
                    m13172f(i4);
                } else {
                    while (true) {
                        i2 = (i * 2) + 1;
                        if (i2 >= this._size) {
                            break;
                        }
                        tArr = this.f29682a;
                        Intrinsics2.m13087c(tArr);
                        i3 = i2 + 1;
                        if (i3 < this._size) {
                            t3 = tArr[i3];
                            Intrinsics2.m13087c(t3);
                            t4 = tArr[i2];
                            Intrinsics2.m13087c(t4);
                            if (((Comparable) t3).compareTo(t4) < 0) {
                                i2 = i3;
                            }
                        }
                        t = tArr[i];
                        Intrinsics2.m13087c(t);
                        t2 = tArr[i2];
                        Intrinsics2.m13087c(t2);
                        if (((Comparable) t).compareTo(t2) <= 0) {
                            break;
                        }
                        m13173g(i, i2);
                        i = i2;
                    }
                }
            } else {
                while (true) {
                    i2 = (i * 2) + 1;
                    if (i2 >= this._size) {
                        break;
                        break;
                    }
                    tArr = this.f29682a;
                    Intrinsics2.m13087c(tArr);
                    i3 = i2 + 1;
                    if (i3 < this._size) {
                        t3 = tArr[i3];
                        Intrinsics2.m13087c(t3);
                        t4 = tArr[i2];
                        Intrinsics2.m13087c(t4);
                        if (((Comparable) t3).compareTo(t4) < 0) {
                            i2 = i3;
                        }
                    }
                    t = tArr[i];
                    Intrinsics2.m13087c(t);
                    t2 = tArr[i2];
                    Intrinsics2.m13087c(t2);
                    if (((Comparable) t).compareTo(t2) <= 0) {
                        break;
                        break;
                    }
                    m13173g(i, i2);
                    i = i2;
                }
            }
        }
        T t7 = tArr2[this._size];
        Intrinsics2.m13087c(t7);
        t7.mo13175h(null);
        t7.mo13174f(-1);
        tArr2[this._size] = null;
        return t7;
    }

    /* JADX INFO: renamed from: e */
    public final T m13171e() {
        T t;
        synchronized (this) {
            t = this._size > 0 ? (T) m13170d(0) : null;
        }
        return t;
    }

    /* JADX INFO: renamed from: f */
    public final void m13172f(int i) {
        while (i > 0) {
            T[] tArr = this.f29682a;
            Intrinsics2.m13087c(tArr);
            int i2 = (i - 1) / 2;
            T t = tArr[i2];
            Intrinsics2.m13087c(t);
            T t2 = tArr[i];
            Intrinsics2.m13087c(t2);
            if (((Comparable) t).compareTo(t2) <= 0) {
                return;
            }
            m13173g(i, i2);
            i = i2;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m13173g(int i, int i2) {
        T[] tArr = this.f29682a;
        Intrinsics2.m13087c(tArr);
        T t = tArr[i2];
        Intrinsics2.m13087c(t);
        T t2 = tArr[i];
        Intrinsics2.m13087c(t2);
        tArr[i] = t;
        tArr[i2] = t2;
        t.mo13174f(i);
        t2.mo13174f(i2);
    }
}
