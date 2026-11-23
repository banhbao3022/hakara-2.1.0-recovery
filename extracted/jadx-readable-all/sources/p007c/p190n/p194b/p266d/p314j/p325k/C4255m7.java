package p007c.p190n.p194b.p266d.p314j.p325k;

import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: renamed from: c.n.b.d.j.k.m7 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4255m7 {

    /* JADX INFO: renamed from: a */
    public static final C4255m7 f23317a = new C4255m7(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: b */
    public int f23318b;

    /* JADX INFO: renamed from: c */
    public int[] f23319c;

    /* JADX INFO: renamed from: d */
    public Object[] f23320d;

    /* JADX INFO: renamed from: e */
    public int f23321e;

    /* JADX INFO: renamed from: f */
    public boolean f23322f;

    public C4255m7() {
        this(0, new int[8], new Object[8], true);
    }

    /* JADX INFO: renamed from: b */
    public static void m10009b(int i, Object obj, InterfaceC4158f8 interfaceC4158f8) throws IOException {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            ((C4266n4) interfaceC4158f8).f23336a.mo9979g(i2, ((Long) obj).longValue());
            return;
        }
        if (i3 == 1) {
            ((C4266n4) interfaceC4158f8).f23336a.mo9990z(i2, ((Long) obj).longValue());
            return;
        }
        if (i3 == 2) {
            ((C4266n4) interfaceC4158f8).f23336a.mo9980h(i2, (AbstractC4402x3) obj);
        } else {
            if (i3 != 3) {
                if (i3 != 5) {
                    throw new RuntimeException(C4239l5.m10000f());
                }
                ((C4266n4) interfaceC4158f8).f23336a.mo9974G(i2, ((Integer) obj).intValue());
                return;
            }
            C4266n4 c4266n4 = (C4266n4) interfaceC4158f8;
            c4266n4.f23336a.mo9978f(i2, 3);
            ((C4255m7) obj).m10012d(interfaceC4158f8);
            c4266n4.f23336a.mo9978f(i2, 4);
        }
    }

    /* JADX INFO: renamed from: c */
    public static C4255m7 m10010c() {
        return new C4255m7(0, new int[8], new Object[8], true);
    }

    /* JADX INFO: renamed from: a */
    public final void m10011a(int i, Object obj) {
        if (!this.f23322f) {
            throw new UnsupportedOperationException();
        }
        int i2 = this.f23318b;
        int[] iArr = this.f23319c;
        if (i2 == iArr.length) {
            int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
            this.f23319c = Arrays.copyOf(iArr, i3);
            this.f23320d = Arrays.copyOf(this.f23320d, i3);
        }
        int[] iArr2 = this.f23319c;
        int i4 = this.f23318b;
        iArr2[i4] = i;
        this.f23320d[i4] = obj;
        this.f23318b = i4 + 1;
    }

    /* JADX INFO: renamed from: d */
    public final void m10012d(InterfaceC4158f8 interfaceC4158f8) throws IOException {
        if (this.f23318b == 0) {
            return;
        }
        Objects.requireNonNull(interfaceC4158f8);
        for (int i = 0; i < this.f23318b; i++) {
            m10009b(this.f23319c[i], this.f23320d[i], interfaceC4158f8);
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m10013e() {
        int iM9945E;
        int i = this.f23321e;
        if (i != -1) {
            return i;
        }
        int iM10013e = 0;
        for (int i2 = 0; i2 < this.f23318b; i2++) {
            int i3 = this.f23319c[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 == 0) {
                iM9945E = AbstractC4238l4.m9945E(i4, ((Long) this.f23320d[i2]).longValue());
            } else if (i5 == 1) {
                ((Long) this.f23320d[i2]).longValue();
                iM9945E = AbstractC4238l4.m9953N(i4);
            } else if (i5 != 2) {
                if (i5 == 3) {
                    iM10013e = ((C4255m7) this.f23320d[i2]).m10013e() + (AbstractC4238l4.m9944D(i4) << 1) + iM10013e;
                } else {
                    if (i5 != 5) {
                        throw new IllegalStateException(C4239l5.m10000f());
                    }
                    ((Integer) this.f23320d[i2]).intValue();
                    iM9945E = AbstractC4238l4.m9958S(i4);
                }
            } else {
                iM9945E = AbstractC4238l4.m9970w(i4, (AbstractC4402x3) this.f23320d[i2]);
            }
            iM10013e = iM9945E + iM10013e;
        }
        this.f23321e = iM10013e;
        return iM10013e;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0046 A[RETURN] */
    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C4255m7)) {
            return false;
        }
        C4255m7 c4255m7 = (C4255m7) obj;
        int i = this.f23318b;
        if (i == c4255m7.f23318b) {
            int[] iArr = this.f23319c;
            int[] iArr2 = c4255m7.f23319c;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    z = true;
                    break;
                }
                if (iArr[i2] != iArr2[i2]) {
                    z = false;
                    break;
                }
                i2++;
            }
            if (z) {
                Object[] objArr = this.f23320d;
                Object[] objArr2 = c4255m7.f23320d;
                int i3 = this.f23318b;
                for (int i4 = 0; i4 < i3; i4++) {
                    if (!objArr[i4].equals(objArr2[i4])) {
                        z2 = false;
                        if (!z2) {
                            return true;
                        }
                    }
                }
                z2 = true;
                if (!z2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f23318b;
        int i2 = (i + 527) * 31;
        int[] iArr = this.f23319c;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        Object[] objArr = this.f23320d;
        int i6 = this.f23318b;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }

    public C4255m7(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f23321e = -1;
        this.f23318b = i;
        this.f23319c = iArr;
        this.f23320d = objArr;
        this.f23322f = z;
    }
}
