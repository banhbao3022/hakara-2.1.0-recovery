package p007c.p190n.p194b.p209b.p233t1;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import p007c.p190n.p194b.p209b.p217p1.CryptoInfo;

/* JADX INFO: renamed from: c.n.b.b.t1.i, reason: use source file name */
/* JADX INFO: compiled from: MediaCodecAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public interface MediaCodecAdapter {

    /* JADX INFO: renamed from: c.n.b.b.t1.i$a */
    /* JADX INFO: compiled from: MediaCodecAdapter.java */
    public interface a {

        /* JADX INFO: renamed from: a */
        public static final a f8551a = new SynchronousMediaCodecAdapter.b();

        /* JADX INFO: renamed from: a */
        MediaCodecAdapter mo3949a(MediaCodec mediaCodec);
    }

    /* JADX INFO: renamed from: c.n.b.b.t1.i$b */
    /* JADX INFO: compiled from: MediaCodecAdapter.java */
    public interface b {
    }

    /* JADX INFO: renamed from: a */
    void mo3935a(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i);

    /* JADX INFO: renamed from: b */
    void mo3936b(int i, int i2, CryptoInfo cryptoInfo, long j2, int i3);

    /* JADX INFO: renamed from: c */
    MediaFormat mo3937c();

    /* JADX INFO: renamed from: d */
    void mo3938d(Bundle bundle);

    /* JADX INFO: renamed from: e */
    void mo3939e(int i, long j2);

    /* JADX INFO: renamed from: f */
    int mo3940f();

    void flush();

    /* JADX INFO: renamed from: g */
    int mo3941g(MediaCodec.BufferInfo bufferInfo);

    /* JADX INFO: renamed from: h */
    void mo3942h(b bVar, Handler handler);

    /* JADX INFO: renamed from: i */
    void mo3943i(int i, boolean z);

    /* JADX INFO: renamed from: j */
    void mo3944j(int i);

    /* JADX INFO: renamed from: k */
    ByteBuffer mo3945k(int i);

    /* JADX INFO: renamed from: l */
    void mo3946l(Surface surface);

    /* JADX INFO: renamed from: m */
    void mo3947m(int i, int i2, int i3, long j2, int i4);

    /* JADX INFO: renamed from: n */
    ByteBuffer mo3948n(int i);

    void release();

    void start();
}
