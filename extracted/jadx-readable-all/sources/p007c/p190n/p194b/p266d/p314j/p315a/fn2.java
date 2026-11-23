package p007c.p190n.p194b.p266d.p314j.p315a;

import android.net.Uri;
import java.io.IOException;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class fn2 implements hn2 {

    /* JADX INFO: renamed from: a */
    public final byte[] f14076a;

    /* JADX INFO: renamed from: b */
    public Uri f14077b;

    /* JADX INFO: renamed from: c */
    public int f14078c;

    /* JADX INFO: renamed from: d */
    public int f14079d;

    public fn2(byte[] bArr) {
        C2622l.m5366f1(bArr.length > 0);
        this.f14076a = bArr;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hn2
    /* JADX INFO: renamed from: a */
    public final long mo6843a(jn2 jn2Var) throws IOException {
        this.f14077b = jn2Var.f15667a;
        long j2 = jn2Var.f15669c;
        int i = (int) j2;
        this.f14078c = i;
        long j3 = jn2Var.f15670d;
        int length = (int) (j3 == -1 ? ((long) this.f14076a.length) - j2 : j3);
        this.f14079d = length;
        if (length > 0 && i + length <= this.f14076a.length) {
            return length;
        }
        byte[] bArr = this.f14076a;
        StringBuilder sb = new StringBuilder(77);
        sb.append("Unsatisfiable range: [");
        sb.append(i);
        sb.append(", ");
        sb.append(j3);
        sb.append("], length: ");
        sb.append(bArr.length);
        throw new IOException(sb.toString());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hn2
    /* JADX INFO: renamed from: b */
    public final Uri mo6844b() {
        return this.f14077b;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hn2
    /* JADX INFO: renamed from: d */
    public final int mo6845d(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f14079d;
        if (i3 == 0) {
            return -1;
        }
        int iMin = Math.min(i2, i3);
        System.arraycopy(this.f14076a, this.f14078c, bArr, i, iMin);
        this.f14078c += iMin;
        this.f14079d -= iMin;
        return iMin;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hn2
    /* JADX INFO: renamed from: e */
    public final void mo6846e() throws IOException {
        this.f14077b = null;
    }
}
