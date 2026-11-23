package p007c.p190n.p438f.p446m.p447b;

import java.lang.reflect.Array;

/* JADX INFO: renamed from: c.n.f.m.b.a, reason: use source file name */
/* JADX INFO: compiled from: BarcodeMatrix.java */
/* JADX INFO: loaded from: classes.dex */
public final class BarcodeMatrix {

    /* JADX INFO: renamed from: a */
    public final BarcodeRow[] f27745a;

    /* JADX INFO: renamed from: b */
    public int f27746b;

    /* JADX INFO: renamed from: c */
    public final int f27747c;

    /* JADX INFO: renamed from: d */
    public final int f27748d;

    public BarcodeMatrix(int i, int i2) {
        BarcodeRow[] barcodeRowArr = new BarcodeRow[i];
        this.f27745a = barcodeRowArr;
        int length = barcodeRowArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            this.f27745a[i3] = new BarcodeRow(((i2 + 4) * 17) + 1);
        }
        this.f27748d = i2 * 17;
        this.f27747c = i;
        this.f27746b = -1;
    }

    /* JADX INFO: renamed from: a */
    public BarcodeRow m12399a() {
        return this.f27745a[this.f27746b];
    }

    /* JADX INFO: renamed from: b */
    public byte[][] m12400b(int i, int i2) {
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) byte.class, this.f27747c * i2, this.f27748d * i);
        int i3 = this.f27747c * i2;
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = (i3 - i4) - 1;
            BarcodeRow barcodeRow = this.f27745a[i4 / i2];
            int length = barcodeRow.f27749a.length * i;
            byte[] bArr2 = new byte[length];
            for (int i6 = 0; i6 < length; i6++) {
                bArr2[i6] = barcodeRow.f27749a[i6 / i];
            }
            bArr[i5] = bArr2;
        }
        return bArr;
    }
}
