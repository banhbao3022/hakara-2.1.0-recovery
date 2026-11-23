package p007c.p190n.p194b.p209b.p243w1;

import java.util.Arrays;
import java.util.Random;

/* JADX INFO: renamed from: c.n.b.b.w1.o0, reason: use source file name */
/* JADX INFO: compiled from: ShuffleOrder.java */
/* JADX INFO: loaded from: classes.dex */
public interface ShuffleOrder {

    /* JADX INFO: renamed from: c.n.b.b.w1.o0$a */
    /* JADX INFO: compiled from: ShuffleOrder.java */
    public static class a implements ShuffleOrder {

        /* JADX INFO: renamed from: a */
        public final Random f9036a;

        /* JADX INFO: renamed from: b */
        public final int[] f9037b;

        /* JADX INFO: renamed from: c */
        public final int[] f9038c;

        public a(int i) {
            this(i, new Random());
        }

        @Override // p007c.p190n.p194b.p209b.p243w1.ShuffleOrder
        /* JADX INFO: renamed from: a */
        public int mo4179a() {
            return this.f9037b.length;
        }

        @Override // p007c.p190n.p194b.p209b.p243w1.ShuffleOrder
        /* JADX INFO: renamed from: b */
        public ShuffleOrder mo4180b(int i, int i2) {
            int i3 = i2 - i;
            int[] iArr = new int[this.f9037b.length - i3];
            int i4 = 0;
            int i5 = 0;
            while (true) {
                int[] iArr2 = this.f9037b;
                if (i4 >= iArr2.length) {
                    return new a(iArr, new Random(this.f9036a.nextLong()));
                }
                if (iArr2[i4] < i || iArr2[i4] >= i2) {
                    iArr[i4 - i5] = iArr2[i4] >= i ? iArr2[i4] - i3 : iArr2[i4];
                } else {
                    i5++;
                }
                i4++;
            }
        }

        @Override // p007c.p190n.p194b.p209b.p243w1.ShuffleOrder
        /* JADX INFO: renamed from: c */
        public int mo4181c() {
            int[] iArr = this.f9037b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // p007c.p190n.p194b.p209b.p243w1.ShuffleOrder
        /* JADX INFO: renamed from: d */
        public int mo4182d(int i) {
            int i2 = this.f9038c[i] - 1;
            if (i2 >= 0) {
                return this.f9037b[i2];
            }
            return -1;
        }

        @Override // p007c.p190n.p194b.p209b.p243w1.ShuffleOrder
        /* JADX INFO: renamed from: e */
        public int mo4183e(int i) {
            int i2 = this.f9038c[i] + 1;
            int[] iArr = this.f9037b;
            if (i2 < iArr.length) {
                return iArr[i2];
            }
            return -1;
        }

        @Override // p007c.p190n.p194b.p209b.p243w1.ShuffleOrder
        /* JADX INFO: renamed from: f */
        public ShuffleOrder mo4184f(int i, int i2) {
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int i3 = 0;
            int i4 = 0;
            while (i4 < i2) {
                iArr[i4] = this.f9036a.nextInt(this.f9037b.length + 1);
                int i5 = i4 + 1;
                int iNextInt = this.f9036a.nextInt(i5);
                iArr2[i4] = iArr2[iNextInt];
                iArr2[iNextInt] = i4 + i;
                i4 = i5;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[this.f9037b.length + i2];
            int i6 = 0;
            int i7 = 0;
            while (true) {
                int[] iArr4 = this.f9037b;
                if (i3 >= iArr4.length + i2) {
                    return new a(iArr3, new Random(this.f9036a.nextLong()));
                }
                if (i6 >= i2 || i7 != iArr[i6]) {
                    int i8 = i7 + 1;
                    iArr3[i3] = iArr4[i7];
                    if (iArr3[i3] >= i) {
                        iArr3[i3] = iArr3[i3] + i2;
                    }
                    i7 = i8;
                } else {
                    iArr3[i3] = iArr2[i6];
                    i6++;
                }
                i3++;
            }
        }

        @Override // p007c.p190n.p194b.p209b.p243w1.ShuffleOrder
        /* JADX INFO: renamed from: g */
        public int mo4185g() {
            int[] iArr = this.f9037b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // p007c.p190n.p194b.p209b.p243w1.ShuffleOrder
        /* JADX INFO: renamed from: h */
        public ShuffleOrder mo4186h() {
            return new a(0, new Random(this.f9036a.nextLong()));
        }

        public a(int i, long j2) {
            this(i, new Random(j2));
        }

        public a(int[] iArr, long j2) {
            this(Arrays.copyOf(iArr, iArr.length), new Random(j2));
        }

        public a(int[] iArr, Random random) {
            this.f9037b = iArr;
            this.f9036a = random;
            this.f9038c = new int[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                this.f9038c[iArr[i]] = i;
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public a(int i, Random random) {
            int[] iArr = new int[i];
            int i2 = 0;
            while (i2 < i) {
                int i3 = i2 + 1;
                int iNextInt = random.nextInt(i3);
                iArr[i2] = iArr[iNextInt];
                iArr[iNextInt] = i2;
                i2 = i3;
            }
            this(iArr, random);
        }
    }

    /* JADX INFO: renamed from: a */
    int mo4179a();

    /* JADX INFO: renamed from: b */
    ShuffleOrder mo4180b(int i, int i2);

    /* JADX INFO: renamed from: c */
    int mo4181c();

    /* JADX INFO: renamed from: d */
    int mo4182d(int i);

    /* JADX INFO: renamed from: e */
    int mo4183e(int i);

    /* JADX INFO: renamed from: f */
    ShuffleOrder mo4184f(int i, int i2);

    /* JADX INFO: renamed from: g */
    int mo4185g();

    /* JADX INFO: renamed from: h */
    ShuffleOrder mo4186h();
}
