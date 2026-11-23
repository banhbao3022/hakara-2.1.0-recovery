package p524h1;

import java.io.IOException;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: renamed from: h1.h, reason: use source file name */
/* JADX INFO: compiled from: BufferedSink.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface BufferedSink extends Sink, WritableByteChannel {
    /* JADX INFO: renamed from: F */
    BufferedSink mo13714F() throws IOException;

    /* JADX INFO: renamed from: P */
    BufferedSink mo13728P(String str) throws IOException;

    /* JADX INFO: renamed from: V */
    long mo13734V(Source source) throws IOException;

    /* JADX INFO: renamed from: W */
    BufferedSink mo13735W(long j2) throws IOException;

    /* JADX INFO: renamed from: b */
    Buffer3 mo13739b();

    @Override // p524h1.Sink, java.io.Flushable
    void flush() throws IOException;

    /* JADX INFO: renamed from: g */
    BufferedSink mo13743g(byte[] bArr, int i, int i2) throws IOException;

    /* JADX INFO: renamed from: l0 */
    BufferedSink mo13747l0(byte[] bArr) throws IOException;

    /* JADX INFO: renamed from: m0 */
    BufferedSink mo13749m0(ByteString3 byteString3) throws IOException;

    /* JADX INFO: renamed from: p */
    BufferedSink mo13751p(int i) throws IOException;

    /* JADX INFO: renamed from: s */
    BufferedSink mo13753s(int i) throws IOException;

    /* JADX INFO: renamed from: y0 */
    BufferedSink mo13760y0(long j2) throws IOException;

    /* JADX INFO: renamed from: z */
    BufferedSink mo13761z(int i) throws IOException;
}
