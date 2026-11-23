package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class r62 {

    /* JADX INFO: renamed from: a */
    public final byte[] f18711a = new byte[256];

    /* JADX INFO: renamed from: b */
    public int f18712b;

    /* JADX INFO: renamed from: c */
    public int f18713c;

    public r62(byte[] bArr) {
        for (int i = 0; i < 256; i++) {
            this.f18711a[i] = (byte) i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 256; i3++) {
            byte[] bArr2 = this.f18711a;
            byte b = bArr2[i3];
            i2 = (i2 + b + bArr[i3 % bArr.length]) & 255;
            bArr2[i3] = bArr2[i2];
            bArr2[i2] = b;
        }
        this.f18712b = 0;
        this.f18713c = 0;
    }
}
