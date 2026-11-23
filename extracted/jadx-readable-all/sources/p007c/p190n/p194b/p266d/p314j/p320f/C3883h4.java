package p007c.p190n.p194b.p266d.p314j.p320f;

import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.b.d.j.f.h4 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3883h4 extends C3893i4 {

    /* JADX INFO: renamed from: j */
    public final int f22690j;

    /* JADX INFO: renamed from: k */
    public final int f22691k;

    public C3883h4(byte[] bArr, int i, int i2) {
        super(bArr);
        AbstractC3823b4.m8945s(i, i + i2, bArr.length);
        this.f22690j = i;
        this.f22691k = i2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.C3893i4, p007c.p190n.p194b.p266d.p314j.p320f.AbstractC3823b4
    /* JADX INFO: renamed from: h */
    public final byte mo8948h(int i) {
        int i2 = this.f22691k;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.f22705i[this.f22690j + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(outline.m1585g(22, "Index < 0: ", i));
        }
        throw new ArrayIndexOutOfBoundsException(outline.m1586h(40, "Index > length: ", i, ", ", i2));
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.C3893i4, p007c.p190n.p194b.p266d.p314j.p320f.AbstractC3823b4
    /* JADX INFO: renamed from: j */
    public final byte mo8949j(int i) {
        return this.f22705i[this.f22690j + i];
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.C3893i4, p007c.p190n.p194b.p266d.p314j.p320f.AbstractC3823b4
    public final int size() {
        return this.f22691k;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.C3893i4
    /* JADX INFO: renamed from: u */
    public final int mo9037u() {
        return this.f22690j;
    }
}
