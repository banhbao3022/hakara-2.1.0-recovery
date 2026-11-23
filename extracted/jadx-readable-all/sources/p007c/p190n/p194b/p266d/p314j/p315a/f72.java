package p007c.p190n.p194b.p266d.p314j.p315a;

import java.io.OutputStream;
import java.util.ArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class f72 extends OutputStream {

    /* JADX INFO: renamed from: f */
    public static final byte[] f13987f = new byte[0];

    /* JADX INFO: renamed from: i */
    public int f13990i;

    /* JADX INFO: renamed from: k */
    public int f13992k;

    /* JADX INFO: renamed from: g */
    public final int f13988g = 128;

    /* JADX INFO: renamed from: h */
    public final ArrayList<g72> f13989h = new ArrayList<>();

    /* JADX INFO: renamed from: j */
    public byte[] f13991j = new byte[128];

    public f72(int i) {
    }

    /* JADX INFO: renamed from: a */
    public final synchronized g72 m6780a() {
        int i = this.f13992k;
        byte[] bArr = this.f13991j;
        int length = bArr.length;
        if (i >= length) {
            this.f13989h.add(new e72(bArr));
            this.f13991j = f13987f;
        } else if (i > 0) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(length, i));
            this.f13989h.add(new e72(bArr2));
        }
        this.f13990i += this.f13992k;
        this.f13992k = 0;
        return g72.m6943M(this.f13989h);
    }

    /* JADX INFO: renamed from: c */
    public final void m6781c(int i) {
        this.f13989h.add(new e72(this.f13991j));
        int length = this.f13990i + this.f13991j.length;
        this.f13990i = length;
        this.f13991j = new byte[Math.max(this.f13988g, Math.max(i, length >>> 1))];
        this.f13992k = 0;
    }

    public final String toString() {
        int i;
        Object[] objArr = new Object[2];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        synchronized (this) {
            i = this.f13990i + this.f13992k;
        }
        objArr[1] = Integer.valueOf(i);
        return String.format("<ByteString.Output@%s size=%d>", objArr);
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i) {
        if (this.f13992k == this.f13991j.length) {
            m6781c(1);
        }
        byte[] bArr = this.f13991j;
        int i2 = this.f13992k;
        this.f13992k = i2 + 1;
        bArr[i2] = (byte) i;
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        byte[] bArr2 = this.f13991j;
        int length = bArr2.length;
        int i3 = this.f13992k;
        int i4 = length - i3;
        if (i2 <= i4) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.f13992k += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i4);
        int i5 = i2 - i4;
        m6781c(i5);
        System.arraycopy(bArr, i + i4, this.f13991j, 0, i5);
        this.f13992k = i5;
    }
}
