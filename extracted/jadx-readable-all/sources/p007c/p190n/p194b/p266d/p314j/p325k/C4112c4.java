package p007c.p190n.p194b.p266d.p314j.p325k;

import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.b.d.j.k.c4 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4112c4 extends C4126d4 {

    /* JADX INFO: renamed from: j */
    public final int f23101j;

    /* JADX INFO: renamed from: k */
    public final int f23102k;

    public C4112c4(byte[] bArr, int i, int i2) {
        super(bArr);
        AbstractC4402x3.m10332u(i, i + i2, bArr.length);
        this.f23101j = i;
        this.f23102k = i2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.C4126d4, p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4402x3
    /* JADX INFO: renamed from: c */
    public final byte mo9501c(int i) {
        int i2 = this.f23102k;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.f23111i[this.f23101j + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(outline.m1585g(22, "Index < 0: ", i));
        }
        throw new ArrayIndexOutOfBoundsException(outline.m1586h(40, "Index > length: ", i, ", ", i2));
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.C4126d4, p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4402x3
    /* JADX INFO: renamed from: f */
    public final int mo9502f() {
        return this.f23102k;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.C4126d4, p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4402x3
    /* JADX INFO: renamed from: t */
    public final byte mo9503t(int i) {
        return this.f23111i[this.f23101j + i];
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.C4126d4
    /* JADX INFO: renamed from: x */
    public final int mo9504x() {
        return this.f23101j;
    }
}
