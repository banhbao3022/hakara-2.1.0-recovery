package p007c.p190n.p194b.p266d.p314j.p315a;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: renamed from: c.n.b.d.j.a.hm */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3108hm implements eb0 {

    /* JADX INFO: renamed from: a */
    public final ByteBuffer f14909a;

    public C3108hm(ByteBuffer byteBuffer) {
        this.f14909a = byteBuffer.slice();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.eb0
    /* JADX INFO: renamed from: a */
    public final void mo6579a(MessageDigest[] messageDigestArr, long j2, int i) throws IOException {
        ByteBuffer byteBufferSlice;
        synchronized (this.f14909a) {
            int i2 = (int) j2;
            this.f14909a.position(i2);
            this.f14909a.limit(i2 + i);
            byteBufferSlice = this.f14909a.slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            byteBufferSlice.position(0);
            messageDigest.update(byteBufferSlice);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.eb0
    public final long zza() {
        return this.f14909a.capacity();
    }
}
