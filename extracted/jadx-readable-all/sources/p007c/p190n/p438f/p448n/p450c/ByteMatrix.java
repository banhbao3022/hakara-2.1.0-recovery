package p007c.p190n.p438f.p448n.p450c;

import java.lang.reflect.Array;

/* JADX INFO: renamed from: c.n.f.n.c.b, reason: use source file name */
/* JADX INFO: compiled from: ByteMatrix.java */
/* JADX INFO: loaded from: classes.dex */
public final class ByteMatrix {

    /* JADX INFO: renamed from: a */
    public final byte[][] f27799a;

    /* JADX INFO: renamed from: b */
    public final int f27800b;

    /* JADX INFO: renamed from: c */
    public final int f27801c;

    public ByteMatrix(int i, int i2) {
        this.f27799a = (byte[][]) Array.newInstance((Class<?>) byte.class, i2, i);
        this.f27800b = i;
        this.f27801c = i2;
    }

    /* JADX INFO: renamed from: a */
    public byte m12415a(int i, int i2) {
        return this.f27799a[i2][i];
    }

    /* JADX INFO: renamed from: b */
    public void m12416b(int i, int i2, int i3) {
        this.f27799a[i2][i] = (byte) i3;
    }

    /* JADX INFO: renamed from: c */
    public void m12417c(int i, int i2, boolean z) {
        this.f27799a[i2][i] = z ? (byte) 1 : (byte) 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((this.f27800b * 2 * this.f27801c) + 2);
        for (int i = 0; i < this.f27801c; i++) {
            byte[] bArr = this.f27799a[i];
            for (int i2 = 0; i2 < this.f27800b; i2++) {
                byte b = bArr[i2];
                if (b == 0) {
                    sb.append(" 0");
                } else if (b != 1) {
                    sb.append("  ");
                } else {
                    sb.append(" 1");
                }
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
