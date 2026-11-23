package p007c.p190n.p194b.p266d.p314j.p320f;

import java.io.IOException;
import java.util.Objects;

/* JADX INFO: renamed from: c.n.b.d.j.f.m7 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3936m7 {

    /* JADX INFO: renamed from: a */
    public static final C3936m7 f22806a = new C3936m7(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: b */
    public int f22807b;

    /* JADX INFO: renamed from: c */
    public int[] f22808c;

    /* JADX INFO: renamed from: d */
    public Object[] f22809d;

    /* JADX INFO: renamed from: e */
    public int f22810e;

    public C3936m7() {
        this(0, new int[8], new Object[8], true);
    }

    /* JADX INFO: renamed from: a */
    public static void m9143a(int i, Object obj, InterfaceC3887h8 interfaceC3887h8) throws IOException {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            ((C3943n4) interfaceC3887h8).f22821a.mo9093b(i2, ((Long) obj).longValue());
            return;
        }
        if (i3 == 1) {
            ((C3943n4) interfaceC3887h8).f22821a.mo9104z(i2, ((Long) obj).longValue());
            return;
        }
        if (i3 == 2) {
            ((C3943n4) interfaceC3887h8).f22821a.mo9094c(i2, (AbstractC3823b4) obj);
            return;
        }
        if (i3 == 3) {
            C3943n4 c3943n4 = (C3943n4) interfaceC3887h8;
            c3943n4.f22821a.mo9086B(i2, 3);
            ((C3936m7) obj).m9144b(interfaceC3887h8);
            c3943n4.f22821a.mo9086B(i2, 4);
            return;
        }
        if (i3 != 5) {
            int i4 = C3884h5.f22692f;
            throw new RuntimeException(new C3914k5("Protocol message tag had invalid wire type."));
        }
        ((C3943n4) interfaceC3887h8).f22821a.mo9089I(i2, ((Integer) obj).intValue());
    }

    /* JADX INFO: renamed from: b */
    public final void m9144b(InterfaceC3887h8 interfaceC3887h8) throws IOException {
        if (this.f22807b == 0) {
            return;
        }
        Objects.requireNonNull(interfaceC3887h8);
        for (int i = 0; i < this.f22807b; i++) {
            m9143a(this.f22808c[i], this.f22809d[i], interfaceC3887h8);
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m9145c() {
        int iM9059C;
        int i = this.f22810e;
        if (i != -1) {
            return i;
        }
        int iM9145c = 0;
        for (int i2 = 0; i2 < this.f22807b; i2++) {
            int i3 = this.f22808c[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 == 0) {
                iM9059C = AbstractC3923l4.m9059C(i4, ((Long) this.f22809d[i2]).longValue());
            } else if (i5 == 1) {
                ((Long) this.f22809d[i2]).longValue();
                iM9059C = AbstractC3923l4.m9061G(i4);
            } else if (i5 != 2) {
                if (i5 == 3) {
                    iM9145c = ((C3936m7) this.f22809d[i2]).m9145c() + (AbstractC3923l4.m9073i(i4) << 1) + iM9145c;
                } else {
                    if (i5 != 5) {
                        int i6 = C3884h5.f22692f;
                        throw new IllegalStateException(new C3914k5("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.f22809d[i2]).intValue();
                    iM9059C = AbstractC3923l4.m9066N(i4);
                }
            } else {
                iM9059C = AbstractC3923l4.m9083v(i4, (AbstractC3823b4) this.f22809d[i2]);
            }
            iM9145c = iM9059C + iM9145c;
        }
        this.f22810e = iM9145c;
        return iM9145c;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0046 A[RETURN] */
    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C3936m7)) {
            return false;
        }
        C3936m7 c3936m7 = (C3936m7) obj;
        int i = this.f22807b;
        if (i == c3936m7.f22807b) {
            int[] iArr = this.f22808c;
            int[] iArr2 = c3936m7.f22808c;
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
                Object[] objArr = this.f22809d;
                Object[] objArr2 = c3936m7.f22809d;
                int i3 = this.f22807b;
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
        int i = this.f22807b;
        int i2 = (i + 527) * 31;
        int[] iArr = this.f22808c;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        Object[] objArr = this.f22809d;
        int i6 = this.f22807b;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }

    public C3936m7(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f22810e = -1;
        this.f22807b = i;
        this.f22808c = iArr;
        this.f22809d = objArr;
    }
}
