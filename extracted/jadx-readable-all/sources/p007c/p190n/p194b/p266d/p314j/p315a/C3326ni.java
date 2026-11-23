package p007c.p190n.p194b.p266d.p314j.p315a;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: c.n.b.d.j.a.ni */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3326ni extends FilterInputStream {

    /* JADX INFO: renamed from: f */
    public final long f17108f;

    /* JADX INFO: renamed from: g */
    public long f17109g;

    public C3326ni(InputStream inputStream, long j2) {
        super(inputStream);
        this.f17108f = j2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i = super.read();
        if (i != -1) {
            this.f17109g++;
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = super.read(bArr, i, i2);
        if (i3 != -1) {
            this.f17109g += (long) i3;
        }
        return i3;
    }
}
