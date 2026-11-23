package p007c.p190n.p194b.p209b.p212b2;

import java.util.Arrays;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.b2.f0, reason: use source file name */
/* JADX INFO: compiled from: TimedValueQueue.java */
/* JADX INFO: loaded from: classes.dex */
public final class TimedValueQueue<V> {

    /* JADX INFO: renamed from: a */
    public long[] f6296a;

    /* JADX INFO: renamed from: b */
    public V[] f6297b;

    /* JADX INFO: renamed from: c */
    public int f6298c;

    /* JADX INFO: renamed from: d */
    public int f6299d;

    public TimedValueQueue() {
        this(10);
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m3078a(long j2, V v) {
        int i = this.f6299d;
        if (i > 0) {
            if (j2 <= this.f6296a[((this.f6298c + i) - 1) % this.f6297b.length]) {
                m3079b();
            }
        }
        m3080c();
        int i2 = this.f6298c;
        int i3 = this.f6299d;
        V[] vArr = this.f6297b;
        int length = (i2 + i3) % vArr.length;
        this.f6296a[length] = j2;
        vArr[length] = v;
        this.f6299d = i3 + 1;
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m3079b() {
        this.f6298c = 0;
        this.f6299d = 0;
        Arrays.fill(this.f6297b, (Object) null);
    }

    /* JADX INFO: renamed from: c */
    public final void m3080c() {
        int length = this.f6297b.length;
        if (this.f6299d < length) {
            return;
        }
        int i = length * 2;
        long[] jArr = new long[i];
        V[] vArr = (V[]) new Object[i];
        int i2 = this.f6298c;
        int i3 = length - i2;
        System.arraycopy(this.f6296a, i2, jArr, 0, i3);
        System.arraycopy(this.f6297b, this.f6298c, vArr, 0, i3);
        int i4 = this.f6298c;
        if (i4 > 0) {
            System.arraycopy(this.f6296a, 0, jArr, i3, i4);
            System.arraycopy(this.f6297b, 0, vArr, i3, this.f6298c);
        }
        this.f6296a = jArr;
        this.f6297b = vArr;
        this.f6298c = 0;
    }

    /* JADX INFO: renamed from: d */
    public final V m3081d(long j2, boolean z) {
        V vM3083f = null;
        long j3 = Long.MAX_VALUE;
        while (this.f6299d > 0) {
            long j4 = j2 - this.f6296a[this.f6298c];
            if (j4 < 0 && (z || (-j4) >= j3)) {
                break;
            }
            vM3083f = m3083f();
            j3 = j4;
        }
        return vM3083f;
    }

    /* JADX INFO: renamed from: e */
    public synchronized V m3082e(long j2) {
        return m3081d(j2, true);
    }

    /* JADX INFO: renamed from: f */
    public final V m3083f() {
        C2096e.m4570f(this.f6299d > 0);
        V[] vArr = this.f6297b;
        int i = this.f6298c;
        V v = vArr[i];
        vArr[i] = null;
        this.f6298c = (i + 1) % vArr.length;
        this.f6299d--;
        return v;
    }

    public TimedValueQueue(int i) {
        this.f6296a = new long[i];
        this.f6297b = (V[]) new Object[i];
    }
}
