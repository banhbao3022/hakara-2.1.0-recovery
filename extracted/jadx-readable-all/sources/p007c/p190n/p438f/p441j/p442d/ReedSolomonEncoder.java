package p007c.p190n.p438f.p441j.p442d;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: c.n.f.j.d.c, reason: use source file name */
/* JADX INFO: compiled from: ReedSolomonEncoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class ReedSolomonEncoder {

    /* JADX INFO: renamed from: a */
    public final GenericGF f27693a;

    /* JADX INFO: renamed from: b */
    public final List<GenericGFPoly> f27694b;

    public ReedSolomonEncoder(GenericGF genericGF) {
        this.f27693a = genericGF;
        ArrayList arrayList = new ArrayList();
        this.f27694b = arrayList;
        arrayList.add(new GenericGFPoly(genericGF, new int[]{1}));
    }

    /* JADX INFO: renamed from: a */
    public void m12357a(int[] iArr, int i) {
        GenericGFPoly genericGFPoly;
        if (i == 0) {
            throw new IllegalArgumentException("No error correction bytes");
        }
        int length = iArr.length - i;
        if (length <= 0) {
            throw new IllegalArgumentException("No data bytes provided");
        }
        int i2 = 2;
        char c2 = 0;
        int i3 = 1;
        if (i >= this.f27694b.size()) {
            List<GenericGFPoly> list = this.f27694b;
            GenericGFPoly genericGFPoly2 = list.get(list.size() - 1);
            int size = this.f27694b.size();
            while (size <= i) {
                GenericGF genericGF = this.f27693a;
                int[] iArr2 = new int[i2];
                iArr2[c2] = i3;
                iArr2[i3] = genericGF.f27685g[(size - 1) + genericGF.f27690l];
                GenericGFPoly genericGFPoly3 = new GenericGFPoly(genericGF, iArr2);
                if (!genericGFPoly2.f27691a.equals(genericGF)) {
                    throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
                }
                if (genericGFPoly2.m12355d() || genericGFPoly3.m12355d()) {
                    genericGFPoly2 = genericGFPoly2.f27691a.f27687i;
                } else {
                    int[] iArr3 = genericGFPoly2.f27692b;
                    int length2 = iArr3.length;
                    int[] iArr4 = genericGFPoly3.f27692b;
                    int length3 = iArr4.length;
                    int[] iArr5 = new int[(length2 + length3) - 1];
                    for (int i4 = 0; i4 < length2; i4++) {
                        int i5 = iArr3[i4];
                        int i6 = 0;
                        while (i6 < length3) {
                            int i7 = i4 + i6;
                            iArr5[i7] = genericGFPoly2.f27691a.m12351a(i5, iArr4[i6]) ^ iArr5[i7];
                            i6++;
                            iArr3 = iArr3;
                        }
                    }
                    genericGFPoly2 = new GenericGFPoly(genericGFPoly2.f27691a, iArr5);
                }
                this.f27694b.add(genericGFPoly2);
                size++;
                i2 = 2;
                c2 = 0;
                i3 = 1;
            }
        }
        GenericGFPoly genericGFPoly4 = this.f27694b.get(i);
        int[] iArr6 = new int[length];
        System.arraycopy(iArr, 0, iArr6, 0, length);
        GenericGFPoly genericGFPolyM12356e = new GenericGFPoly(this.f27693a, iArr6).m12356e(i, 1);
        if (!genericGFPolyM12356e.f27691a.equals(genericGFPoly4.f27691a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (genericGFPoly4.m12355d()) {
            throw new IllegalArgumentException("Divide by 0");
        }
        GenericGFPoly genericGFPolyM12352a = genericGFPolyM12356e.f27691a.f27687i;
        int iM12353b = genericGFPoly4.m12353b(genericGFPoly4.m12354c());
        GenericGF genericGF2 = genericGFPolyM12356e.f27691a;
        Objects.requireNonNull(genericGF2);
        if (iM12353b == 0) {
            throw new ArithmeticException();
        }
        int i8 = genericGF2.f27685g[(genericGF2.f27688j - genericGF2.f27686h[iM12353b]) - 1];
        GenericGFPoly genericGFPolyM12352a2 = genericGFPolyM12356e;
        while (genericGFPolyM12352a2.m12354c() >= genericGFPoly4.m12354c() && !genericGFPolyM12352a2.m12355d()) {
            int iM12354c = genericGFPolyM12352a2.m12354c() - genericGFPoly4.m12354c();
            int iM12351a = genericGFPolyM12356e.f27691a.m12351a(genericGFPolyM12352a2.m12353b(genericGFPolyM12352a2.m12354c()), i8);
            GenericGFPoly genericGFPolyM12356e2 = genericGFPoly4.m12356e(iM12354c, iM12351a);
            GenericGF genericGF3 = genericGFPolyM12356e.f27691a;
            Objects.requireNonNull(genericGF3);
            if (iM12354c < 0) {
                throw new IllegalArgumentException();
            }
            if (iM12351a == 0) {
                genericGFPoly = genericGF3.f27687i;
            } else {
                int[] iArr7 = new int[iM12354c + 1];
                iArr7[0] = iM12351a;
                genericGFPoly = new GenericGFPoly(genericGF3, iArr7);
            }
            genericGFPolyM12352a = genericGFPolyM12352a.m12352a(genericGFPoly);
            genericGFPolyM12352a2 = genericGFPolyM12352a2.m12352a(genericGFPolyM12356e2);
        }
        int[] iArr8 = new GenericGFPoly[]{genericGFPolyM12352a, genericGFPolyM12352a2}[1].f27692b;
        int length4 = i - iArr8.length;
        for (int i9 = 0; i9 < length4; i9++) {
            iArr[length + i9] = 0;
        }
        System.arraycopy(iArr8, 0, iArr, length + length4, iArr8.length);
    }
}
