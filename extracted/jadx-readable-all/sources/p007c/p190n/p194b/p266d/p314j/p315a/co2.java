package p007c.p190n.p194b.p266d.p314j.p315a;

import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class co2 {

    /* JADX INFO: renamed from: a */
    public byte[] f13068a;

    /* JADX INFO: renamed from: b */
    public int f13069b;

    /* JADX INFO: renamed from: c */
    public int f13070c;

    /* JADX INFO: renamed from: d */
    public int f13071d;

    public co2() {
    }

    public co2(byte[] bArr, int i) {
        this.f13068a = bArr;
        this.f13071d = i;
    }

    /* JADX INFO: renamed from: a */
    public final int m6217a(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = i >> 3;
        boolean z = false;
        int i7 = 0;
        for (int i8 = 0; i8 < i6; i8++) {
            int i9 = this.f13070c;
            if (i9 != 0) {
                byte[] bArr = this.f13068a;
                int i10 = this.f13069b;
                i5 = ((bArr[i10 + 1] & 255) >>> (8 - i9)) | ((bArr[i10] & 255) << i9);
            } else {
                i5 = this.f13068a[this.f13069b];
            }
            i -= 8;
            i7 |= (255 & i5) << i;
            this.f13069b++;
        }
        if (i > 0) {
            int i11 = this.f13070c + i;
            byte b = (byte) (255 >> (8 - i));
            if (i11 > 8) {
                byte[] bArr2 = this.f13068a;
                int i12 = this.f13069b;
                int i13 = i12 + 1;
                i4 = (b & (((255 & bArr2[i13]) >> (16 - i11)) | ((bArr2[i12] & 255) << (i11 - 8)))) | i7;
                this.f13069b = i13;
            } else {
                byte[] bArr3 = this.f13068a;
                int i14 = this.f13069b;
                i4 = (b & ((255 & bArr3[i14]) >> (8 - i11))) | i7;
                if (i11 == 8) {
                    this.f13069b = i14 + 1;
                }
            }
            i7 = i4;
            this.f13070c = i11 % 8;
        }
        int i15 = this.f13069b;
        if (i15 >= 0 && (i2 = this.f13070c) >= 0 && (i15 < (i3 = this.f13071d) || (i15 == i3 && i2 == 0))) {
            z = true;
        }
        C2622l.m5322V2(z);
        return i7;
    }
}
