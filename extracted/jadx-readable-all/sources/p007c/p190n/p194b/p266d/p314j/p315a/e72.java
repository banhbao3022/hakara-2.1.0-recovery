package p007c.p190n.p194b.p266d.p314j.p315a;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class e72 extends d72 {

    /* JADX INFO: renamed from: h */
    public final byte[] f13527h;

    public e72(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.f13527h = bArr;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g72
    /* JADX INFO: renamed from: B */
    public final int mo5713B(int i, int i2, int i3) {
        int iMo5932Q = mo5932Q() + i2;
        return cb2.f12972a.m5727a(i, this.f13527h, iMo5932Q, i3 + iMo5932Q);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g72
    /* JADX INFO: renamed from: C */
    public final int mo5714C(int i, int i2, int i3) {
        byte[] bArr = this.f13527h;
        int iMo5932Q = mo5932Q() + i2;
        Charset charset = p82.f17879a;
        for (int i4 = iMo5932Q; i4 < iMo5932Q + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g72
    /* JADX INFO: renamed from: D */
    public final j72 mo5715D() {
        byte[] bArr = this.f13527h;
        int iMo5932Q = mo5932Q();
        int iMo5719m = mo5719m();
        h72 h72Var = new h72(bArr, iMo5932Q, iMo5719m);
        try {
            h72Var.mo7099z(iMo5719m);
            return h72Var;
        } catch (r82 e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.d72
    /* JADX INFO: renamed from: P */
    public final boolean mo6292P(g72 g72Var, int i, int i2) {
        if (i2 > g72Var.mo5719m()) {
            int iMo5719m = mo5719m();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(iMo5719m);
            throw new IllegalArgumentException(sb.toString());
        }
        int i3 = i + i2;
        if (i3 > g72Var.mo5719m()) {
            int iMo5719m2 = g72Var.mo5719m();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(iMo5719m2);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (!(g72Var instanceof e72)) {
            return g72Var.mo5723v(i, i3).equals(mo5723v(0, i2));
        }
        e72 e72Var = (e72) g72Var;
        byte[] bArr = this.f13527h;
        byte[] bArr2 = e72Var.f13527h;
        int iMo5932Q = mo5932Q() + i2;
        int iMo5932Q2 = mo5932Q();
        int iMo5932Q3 = e72Var.mo5932Q() + i;
        while (iMo5932Q2 < iMo5932Q) {
            if (bArr[iMo5932Q2] != bArr2[iMo5932Q3]) {
                return false;
            }
            iMo5932Q2++;
            iMo5932Q3++;
        }
        return true;
    }

    /* JADX INFO: renamed from: Q */
    public int mo5932Q() {
        return 0;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g72
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g72) || mo5719m() != ((g72) obj).mo5719m()) {
            return false;
        }
        if (mo5719m() == 0) {
            return true;
        }
        if (!(obj instanceof e72)) {
            return obj.equals(this);
        }
        e72 e72Var = (e72) obj;
        int i = this.f14514g;
        int i2 = e72Var.f14514g;
        if (i == 0 || i2 == 0 || i == i2) {
            return mo6292P(e72Var, 0, mo5719m());
        }
        return false;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g72
    /* JADX INFO: renamed from: h */
    public byte mo5717h(int i) {
        return this.f13527h[i];
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g72
    /* JADX INFO: renamed from: j */
    public byte mo5718j(int i) {
        return this.f13527h[i];
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g72
    /* JADX INFO: renamed from: m */
    public int mo5719m() {
        return this.f13527h.length;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g72
    /* JADX INFO: renamed from: s */
    public void mo5720s(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f13527h, i, bArr, i2, i3);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g72
    /* JADX INFO: renamed from: v */
    public final g72 mo5723v(int i, int i2) {
        int iM6945f = g72.m6945f(i, i2, mo5719m());
        return iM6945f == 0 ? g72.f14513f : new b72(this.f13527h, mo5932Q() + i, iM6945f);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g72
    /* JADX INFO: renamed from: x */
    public final void mo5724x(y62 y62Var) throws IOException {
        ((m72) y62Var).m7676x(this.f13527h, mo5932Q(), mo5719m());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g72
    /* JADX INFO: renamed from: y */
    public final String mo5725y(Charset charset) {
        return new String(this.f13527h, mo5932Q(), mo5719m(), charset);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g72
    /* JADX INFO: renamed from: z */
    public final boolean mo5726z() {
        int iMo5932Q = mo5932Q();
        return cb2.m6157a(this.f13527h, iMo5932Q, mo5719m() + iMo5932Q);
    }
}
