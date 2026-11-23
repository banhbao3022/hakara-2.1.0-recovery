package p524h1;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: h1.i, reason: use source file name */
/* JADX INFO: compiled from: BufferedSource.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface BufferedSource extends Source, ReadableByteChannel {
    /* JADX INFO: renamed from: B0 */
    long mo13709B0() throws IOException;

    /* JADX INFO: renamed from: C0 */
    InputStream mo13710C0();

    /* JADX INFO: renamed from: E */
    long mo13712E(ByteString3 byteString3) throws IOException;

    /* JADX INFO: renamed from: E0 */
    int mo13713E0(Options2 options2) throws IOException;

    /* JADX INFO: renamed from: G */
    long mo13716G() throws IOException;

    /* JADX INFO: renamed from: I */
    String mo13719I(long j2) throws IOException;

    /* JADX INFO: renamed from: S */
    String mo13733S(Charset charset) throws IOException;

    /* JADX INFO: renamed from: Y */
    ByteString3 mo13736Y() throws IOException;

    /* JADX INFO: renamed from: a0 */
    boolean mo13738a0(long j2) throws IOException;

    /* JADX INFO: renamed from: b */
    Buffer3 mo13739b();

    /* JADX INFO: renamed from: e0 */
    String mo13741e0() throws IOException;

    /* JADX INFO: renamed from: h0 */
    byte[] mo13745h0(long j2) throws IOException;

    /* JADX INFO: renamed from: l */
    Buffer3 mo13746l();

    /* JADX INFO: renamed from: m */
    ByteString3 mo13748m(long j2) throws IOException;

    /* JADX INFO: renamed from: r0 */
    long mo13752r0(Sink sink) throws IOException;

    byte readByte() throws IOException;

    int readInt() throws IOException;

    short readShort() throws IOException;

    void skip(long j2) throws IOException;

    /* JADX INFO: renamed from: w */
    byte[] mo13756w() throws IOException;

    /* JADX INFO: renamed from: w0 */
    void mo13757w0(long j2) throws IOException;

    /* JADX INFO: renamed from: y */
    boolean mo13759y() throws IOException;
}
