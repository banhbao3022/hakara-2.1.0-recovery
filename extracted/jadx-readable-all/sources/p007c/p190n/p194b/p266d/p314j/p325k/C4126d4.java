package p007c.p190n.p194b.p266d.p314j.p325k;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.b.d.j.k.d4 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class C4126d4 extends AbstractC4402x3 {

    /* JADX INFO: renamed from: i */
    public final byte[] f23111i;

    public C4126d4(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.f23111i = bArr;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4402x3
    /* JADX INFO: renamed from: c */
    public byte mo9501c(int i) {
        return this.f23111i[i];
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4402x3
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC4402x3) || mo9502f() != ((AbstractC4402x3) obj).mo9502f()) {
            return false;
        }
        if (mo9502f() == 0) {
            return true;
        }
        if (!(obj instanceof C4126d4)) {
            return obj.equals(this);
        }
        C4126d4 c4126d4 = (C4126d4) obj;
        int i = this.f23616h;
        int i2 = c4126d4.f23616h;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        int iMo9502f = mo9502f();
        if (iMo9502f > c4126d4.mo9502f()) {
            int iMo9502f2 = mo9502f();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(iMo9502f);
            sb.append(iMo9502f2);
            throw new IllegalArgumentException(sb.toString());
        }
        if (iMo9502f > c4126d4.mo9502f()) {
            throw new IllegalArgumentException(outline.m1586h(59, "Ran off end of other: 0, ", iMo9502f, ", ", c4126d4.mo9502f()));
        }
        byte[] bArr = this.f23111i;
        byte[] bArr2 = c4126d4.f23111i;
        int iMo9504x = mo9504x() + iMo9502f;
        int iMo9504x2 = mo9504x();
        int iMo9504x3 = c4126d4.mo9504x();
        while (iMo9504x2 < iMo9504x) {
            if (bArr[iMo9504x2] != bArr2[iMo9504x3]) {
                return false;
            }
            iMo9504x2++;
            iMo9504x3++;
        }
        return true;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4402x3
    /* JADX INFO: renamed from: f */
    public int mo9502f() {
        return this.f23111i.length;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4402x3
    /* JADX INFO: renamed from: h */
    public final int mo9540h(int i, int i2, int i3) {
        byte[] bArr = this.f23111i;
        int iMo9504x = mo9504x();
        Charset charset = C4127d5.f23112a;
        for (int i4 = iMo9504x; i4 < iMo9504x + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4402x3
    /* JADX INFO: renamed from: j */
    public final AbstractC4402x3 mo9541j(int i, int i2) {
        int iM10332u = AbstractC4402x3.m10332u(0, i2, mo9502f());
        return iM10332u == 0 ? AbstractC4402x3.f23614f : new C4112c4(this.f23111i, mo9504x(), iM10332u);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4402x3
    /* JADX INFO: renamed from: q */
    public final String mo9542q(Charset charset) {
        return new String(this.f23111i, mo9504x(), mo9502f(), charset);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4402x3
    /* JADX INFO: renamed from: s */
    public final void mo9543s(AbstractC4415y3 abstractC4415y3) throws IOException {
        ((AbstractC4238l4.b) abstractC4415y3).m9994Z(this.f23111i, mo9504x(), mo9502f());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4402x3
    /* JADX INFO: renamed from: t */
    public byte mo9503t(int i) {
        return this.f23111i[i];
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4402x3
    /* JADX INFO: renamed from: v */
    public final boolean mo9544v() {
        int iMo9504x = mo9504x();
        return C4367u7.m10279b(this.f23111i, iMo9504x, mo9502f() + iMo9504x);
    }

    /* JADX INFO: renamed from: x */
    public int mo9504x() {
        return 0;
    }
}
