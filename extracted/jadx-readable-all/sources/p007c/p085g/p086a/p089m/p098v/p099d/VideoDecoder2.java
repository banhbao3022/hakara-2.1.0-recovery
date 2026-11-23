package p007c.p085g.p086a.p089m.p098v.p099d;

import android.media.MediaDataSource;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: c.g.a.m.v.d.e0, reason: use source file name */
/* JADX INFO: compiled from: VideoDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public class VideoDecoder2 extends MediaDataSource {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ByteBuffer f3541f;

    public VideoDecoder2(VideoDecoder.d dVar, ByteBuffer byteBuffer) {
        this.f3541f = byteBuffer;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // android.media.MediaDataSource
    public long getSize() {
        return this.f3541f.limit();
    }

    @Override // android.media.MediaDataSource
    public int readAt(long j2, byte[] bArr, int i, int i2) {
        if (j2 >= this.f3541f.limit()) {
            return -1;
        }
        this.f3541f.position((int) j2);
        int iMin = Math.min(i2, this.f3541f.remaining());
        this.f3541f.get(bArr, i, iMin);
        return iMin;
    }
}
