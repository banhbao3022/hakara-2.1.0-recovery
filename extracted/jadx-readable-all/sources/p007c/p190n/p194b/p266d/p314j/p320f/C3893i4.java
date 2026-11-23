package p007c.p190n.p194b.p266d.p314j.p320f;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.b.d.j.f.i4 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class C3893i4 extends AbstractC3823b4 {

    /* JADX INFO: renamed from: i */
    public final byte[] f22705i;

    public C3893i4(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.f22705i = bArr;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC3823b4
    /* JADX INFO: renamed from: c */
    public final String mo8946c(Charset charset) {
        return new String(this.f22705i, mo9037u(), size(), charset);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC3823b4
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC3823b4) || size() != ((AbstractC3823b4) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C3893i4)) {
            return obj.equals(this);
        }
        C3893i4 c3893i4 = (C3893i4) obj;
        int i = this.f22521h;
        int i2 = c3893i4.f22521h;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        int size = size();
        if (size > c3893i4.size()) {
            int size2 = size();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(size);
            sb.append(size2);
            throw new IllegalArgumentException(sb.toString());
        }
        if (size > c3893i4.size()) {
            throw new IllegalArgumentException(outline.m1586h(59, "Ran off end of other: 0, ", size, ", ", c3893i4.size()));
        }
        byte[] bArr = this.f22705i;
        byte[] bArr2 = c3893i4.f22705i;
        int iMo9037u = mo9037u() + size;
        int iMo9037u2 = mo9037u();
        int iMo9037u3 = c3893i4.mo9037u();
        while (iMo9037u2 < iMo9037u) {
            if (bArr[iMo9037u2] != bArr2[iMo9037u3]) {
                return false;
            }
            iMo9037u2++;
            iMo9037u3++;
        }
        return true;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC3823b4
    /* JADX INFO: renamed from: f */
    public final void mo8947f(AbstractC3833c4 abstractC3833c4) throws IOException {
        ((AbstractC3923l4.b) abstractC3833c4).m9105V(this.f22705i, mo9037u(), size());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC3823b4
    /* JADX INFO: renamed from: h */
    public byte mo8948h(int i) {
        return this.f22705i[i];
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC3823b4
    /* JADX INFO: renamed from: j */
    public byte mo8949j(int i) {
        return this.f22705i[i];
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC3823b4
    /* JADX INFO: renamed from: m */
    public final int mo8950m(int i, int i2, int i3) {
        byte[] bArr = this.f22705i;
        int iMo9037u = mo9037u();
        Charset charset = C3814a5.f22506a;
        for (int i4 = iMo9037u; i4 < iMo9037u + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC3823b4
    /* JADX INFO: renamed from: q */
    public final AbstractC3823b4 mo8951q(int i, int i2) {
        int iM8945s = AbstractC3823b4.m8945s(0, i2, size());
        return iM8945s == 0 ? AbstractC3823b4.f22519f : new C3883h4(this.f22705i, mo9037u(), iM8945s);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC3823b4
    public int size() {
        return this.f22705i.length;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC3823b4
    /* JADX INFO: renamed from: t */
    public final boolean mo8952t() {
        int iMo9037u = mo9037u();
        return C4033w7.f22982a.mo8943b(0, this.f22705i, iMo9037u, size() + iMo9037u) == 0;
    }

    /* JADX INFO: renamed from: u */
    public int mo9037u() {
        return 0;
    }
}
