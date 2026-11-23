package p007c.p190n.p194b.p266d.p314j.p315a;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: c.n.b.d.j.a.gr */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3076gr implements nc2 {

    /* JADX INFO: renamed from: f */
    public final ByteBuffer f14647f;

    public C3076gr(ByteBuffer byteBuffer) {
        this.f14647f = byteBuffer.duplicate();
    }

    /* JADX INFO: renamed from: a */
    public final int m7016a(ByteBuffer byteBuffer) throws IOException {
        if (this.f14647f.remaining() == 0 && byteBuffer.remaining() > 0) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), this.f14647f.remaining());
        byte[] bArr = new byte[iMin];
        this.f14647f.get(bArr);
        byteBuffer.put(bArr);
        return iMin;
    }

    /* JADX INFO: renamed from: c */
    public final long m7017c() throws IOException {
        return this.f14647f.position();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    /* JADX INFO: renamed from: f */
    public final void m7018f(long j2) throws IOException {
        this.f14647f.position((int) j2);
    }

    /* JADX INFO: renamed from: h */
    public final ByteBuffer m7019h(long j2, long j3) throws IOException {
        int iPosition = this.f14647f.position();
        this.f14647f.position((int) j2);
        ByteBuffer byteBufferSlice = this.f14647f.slice();
        byteBufferSlice.limit((int) j3);
        this.f14647f.position(iPosition);
        return byteBufferSlice;
    }
}
