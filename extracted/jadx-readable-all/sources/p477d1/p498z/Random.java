package p477d1.p498z;

import p477d1.p489v.PlatformImplementations2;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: d1.z.c, reason: use source file name */
/* JADX INFO: compiled from: Random.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class Random {

    /* JADX INFO: renamed from: b */
    public static final a f29609b = new a(null);

    /* JADX INFO: renamed from: a */
    public static final Random f29608a = PlatformImplementations2.f29559a.mo13075b();

    /* JADX INFO: renamed from: d1.z.c$a */
    /* JADX INFO: compiled from: Random.kt */
    public static final class a extends Random {
        public a() {
        }

        @Override // p477d1.p498z.Random
        /* JADX INFO: renamed from: a */
        public int mo13103a(int i) {
            return Random.f29608a.mo13103a(i);
        }

        @Override // p477d1.p498z.Random
        /* JADX INFO: renamed from: b */
        public int mo13104b() {
            return Random.f29608a.mo13104b();
        }

        @Override // p477d1.p498z.Random
        /* JADX INFO: renamed from: c */
        public int mo13105c(int i) {
            return Random.f29608a.mo13105c(i);
        }

        @Override // p477d1.p498z.Random
        /* JADX INFO: renamed from: d */
        public int mo13107d(int i, int i2) {
            return Random.f29608a.mo13107d(i, i2);
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo13103a(int i);

    /* JADX INFO: renamed from: b */
    public int mo13104b() {
        return mo13103a(32);
    }

    /* JADX INFO: renamed from: c */
    public int mo13105c(int i) {
        return mo13107d(0, i);
    }

    /* JADX INFO: renamed from: d */
    public int mo13107d(int i, int i2) {
        int iMo13104b;
        int i3;
        int iMo13103a;
        if (!(i2 > i)) {
            Integer numValueOf = Integer.valueOf(i);
            Integer numValueOf2 = Integer.valueOf(i2);
            Intrinsics2.m13089e(numValueOf, "from");
            Intrinsics2.m13089e(numValueOf2, "until");
            throw new IllegalArgumentException(("Random range is empty: [" + numValueOf + ", " + numValueOf2 + ").").toString());
        }
        int i4 = i2 - i;
        if (i4 > 0 || i4 == Integer.MIN_VALUE) {
            if (((-i4) & i4) == i4) {
                iMo13103a = mo13103a(31 - Integer.numberOfLeadingZeros(i4));
            } else {
                do {
                    iMo13104b = mo13104b() >>> 1;
                    i3 = iMo13104b % i4;
                } while ((i4 - 1) + (iMo13104b - i3) < 0);
                iMo13103a = i3;
            }
            return i + iMo13103a;
        }
        while (true) {
            int iMo13104b2 = mo13104b();
            if (i <= iMo13104b2 && i2 > iMo13104b2) {
                return iMo13104b2;
            }
        }
    }
}
