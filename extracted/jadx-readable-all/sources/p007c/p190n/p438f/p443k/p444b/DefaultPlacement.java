package p007c.p190n.p438f.p443k.p444b;

import java.util.Arrays;

/* JADX INFO: renamed from: c.n.f.k.b.e, reason: use source file name */
/* JADX INFO: compiled from: DefaultPlacement.java */
/* JADX INFO: loaded from: classes.dex */
public class DefaultPlacement {

    /* JADX INFO: renamed from: a */
    public final CharSequence f27695a;

    /* JADX INFO: renamed from: b */
    public final int f27696b;

    /* JADX INFO: renamed from: c */
    public final int f27697c;

    /* JADX INFO: renamed from: d */
    public final byte[] f27698d;

    public DefaultPlacement(CharSequence charSequence, int i, int i2) {
        this.f27695a = charSequence;
        this.f27697c = i;
        this.f27696b = i2;
        byte[] bArr = new byte[i * i2];
        this.f27698d = bArr;
        Arrays.fill(bArr, (byte) -1);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m12366a(int i, int i2) {
        return this.f27698d[(i2 * this.f27697c) + i] >= 0;
    }

    /* JADX INFO: renamed from: b */
    public final void m12367b(int i, int i2, int i3, int i4) {
        if (i < 0) {
            int i5 = this.f27696b;
            i += i5;
            i2 += 4 - ((i5 + 4) % 8);
        }
        if (i2 < 0) {
            int i6 = this.f27697c;
            i2 += i6;
            i += 4 - ((i6 + 4) % 8);
        }
        m12368c(i2, i, (this.f27695a.charAt(i3) & (1 << (8 - i4))) != 0);
    }

    /* JADX INFO: renamed from: c */
    public final void m12368c(int i, int i2, boolean z) {
        this.f27698d[(i2 * this.f27697c) + i] = z ? (byte) 1 : (byte) 0;
    }

    /* JADX INFO: renamed from: d */
    public final void m12369d(int i, int i2, int i3) {
        int i4 = i - 2;
        int i5 = i2 - 2;
        m12367b(i4, i5, i3, 1);
        int i6 = i2 - 1;
        m12367b(i4, i6, i3, 2);
        int i7 = i - 1;
        m12367b(i7, i5, i3, 3);
        m12367b(i7, i6, i3, 4);
        m12367b(i7, i2, i3, 5);
        m12367b(i, i5, i3, 6);
        m12367b(i, i6, i3, 7);
        m12367b(i, i2, i3, 8);
    }
}
