package p007c.p082f.p083a.p084a;

import java.util.Random;

/* JADX INFO: renamed from: c.f.a.a.g, reason: use source file name */
/* JADX INFO: compiled from: RandomXS128.java */
/* JADX INFO: loaded from: classes.dex */
public class RandomXS128 extends Random {

    /* JADX INFO: renamed from: f */
    public long f2844f;

    /* JADX INFO: renamed from: g */
    public long f2845g;

    public RandomXS128() {
        setSeed(new Random().nextLong());
    }

    /* JADX INFO: renamed from: a */
    public static final long m1615a(long j2) {
        long j3 = (j2 ^ (j2 >>> 33)) * (-49064778989728563L);
        long j4 = (j3 ^ (j3 >>> 33)) * (-4265267296055464877L);
        return j4 ^ (j4 >>> 33);
    }

    @Override // java.util.Random
    public final int next(int i) {
        return (int) (nextLong() & ((1 << i) - 1));
    }

    @Override // java.util.Random
    public boolean nextBoolean() {
        return (nextLong() & 1) != 0;
    }

    @Override // java.util.Random
    public void nextBytes(byte[] bArr) {
        int length = bArr.length;
        while (length != 0) {
            int i = length < 8 ? length : 8;
            long jNextLong = nextLong();
            while (true) {
                int i2 = i - 1;
                if (i != 0) {
                    length--;
                    bArr[length] = (byte) jNextLong;
                    jNextLong >>= 8;
                    i = i2;
                }
            }
        }
    }

    @Override // java.util.Random
    public double nextDouble() {
        return (nextLong() >>> 11) * 1.1102230246251565E-16d;
    }

    @Override // java.util.Random
    public float nextFloat() {
        return (float) ((nextLong() >>> 40) * 5.960464477539063E-8d);
    }

    @Override // java.util.Random
    public int nextInt() {
        return (int) nextLong();
    }

    @Override // java.util.Random
    public long nextLong() {
        long j2 = this.f2844f;
        long j3 = this.f2845g;
        this.f2844f = j3;
        long j4 = j2 ^ (j2 << 23);
        long j5 = ((j4 >>> 17) ^ (j4 ^ j3)) ^ (j3 >>> 26);
        this.f2845g = j5;
        return j5 + j3;
    }

    @Override // java.util.Random
    public void setSeed(long j2) {
        if (j2 == 0) {
            j2 = Long.MIN_VALUE;
        }
        long jM1615a = m1615a(j2);
        long jM1615a2 = m1615a(jM1615a);
        this.f2844f = jM1615a;
        this.f2845g = jM1615a2;
    }

    @Override // java.util.Random
    public int nextInt(int i) {
        long jNextLong;
        long j2;
        long j3 = i;
        if (j3 <= 0) {
            throw new IllegalArgumentException("n must be positive");
        }
        do {
            jNextLong = nextLong() >>> 1;
            j2 = jNextLong % j3;
        } while ((j3 - 1) + (jNextLong - j2) < 0);
        return (int) j2;
    }

    public RandomXS128(long j2) {
        setSeed(j2);
    }

    public RandomXS128(long j2, long j3) {
        this.f2844f = j2;
        this.f2845g = j3;
    }
}
