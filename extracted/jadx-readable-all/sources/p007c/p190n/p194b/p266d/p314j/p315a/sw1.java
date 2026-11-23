package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class sw1 implements Comparable<sw1> {

    /* JADX INFO: renamed from: f */
    public final byte[] f19726f;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(sw1 sw1Var) {
        sw1 sw1Var2 = sw1Var;
        int length = this.f19726f.length;
        int length2 = sw1Var2.f19726f.length;
        if (length != length2) {
            return length - length2;
        }
        int i = 0;
        while (true) {
            byte[] bArr = this.f19726f;
            if (i >= bArr.length) {
                return 0;
            }
            byte b = bArr[i];
            byte b2 = sw1Var2.f19726f[i];
            if (b != b2) {
                return b - b2;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof sw1) {
            return Arrays.equals(this.f19726f, ((sw1) obj).f19726f);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f19726f);
    }

    public final String toString() {
        byte[] bArr = this.f19726f;
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b : bArr) {
            int i = b & 255;
            sb.append("0123456789abcdef".charAt(i >> 4));
            sb.append("0123456789abcdef".charAt(i & 15));
        }
        return sb.toString();
    }
}
