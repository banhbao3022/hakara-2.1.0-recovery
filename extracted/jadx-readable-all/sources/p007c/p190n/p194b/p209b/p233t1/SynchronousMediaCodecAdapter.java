package p007c.p190n.p194b.p209b.p233t1;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.Objects;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p213c2.MediaCodecVideoRenderer;
import p007c.p190n.p194b.p209b.p217p1.CryptoInfo;

/* JADX INFO: renamed from: c.n.b.b.t1.o, reason: use source file name */
/* JADX INFO: compiled from: SynchronousMediaCodecAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public final class SynchronousMediaCodecAdapter implements MediaCodecAdapter {

    /* JADX INFO: renamed from: a */
    public final MediaCodec f8642a;

    /* JADX INFO: renamed from: b */
    public ByteBuffer[] f8643b;

    /* JADX INFO: renamed from: c */
    public ByteBuffer[] f8644c;

    /* JADX INFO: renamed from: c.n.b.b.t1.o$b */
    /* JADX INFO: compiled from: SynchronousMediaCodecAdapter.java */
    public static final class b implements MediaCodecAdapter.a {
        @Override // p007c.p190n.p194b.p209b.p233t1.MediaCodecAdapter.a
        /* JADX INFO: renamed from: a */
        public MediaCodecAdapter mo3949a(MediaCodec mediaCodec) {
            return new SynchronousMediaCodecAdapter(mediaCodec, null);
        }
    }

    public SynchronousMediaCodecAdapter(MediaCodec mediaCodec, a aVar) {
        this.f8642a = mediaCodec;
    }

    @Override // p007c.p190n.p194b.p209b.p233t1.MediaCodecAdapter
    /* JADX INFO: renamed from: a */
    public void mo3935a(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        this.f8642a.configure(mediaFormat, surface, mediaCrypto, i);
    }

    @Override // p007c.p190n.p194b.p209b.p233t1.MediaCodecAdapter
    /* JADX INFO: renamed from: b */
    public void mo3936b(int i, int i2, CryptoInfo cryptoInfo, long j2, int i3) {
        this.f8642a.queueSecureInputBuffer(i, i2, cryptoInfo.f7271i, j2, i3);
    }

    @Override // p007c.p190n.p194b.p209b.p233t1.MediaCodecAdapter
    /* JADX INFO: renamed from: c */
    public MediaFormat mo3937c() {
        return this.f8642a.getOutputFormat();
    }

    @Override // p007c.p190n.p194b.p209b.p233t1.MediaCodecAdapter
    /* JADX INFO: renamed from: d */
    public void mo3938d(Bundle bundle) {
        this.f8642a.setParameters(bundle);
    }

    @Override // p007c.p190n.p194b.p209b.p233t1.MediaCodecAdapter
    /* JADX INFO: renamed from: e */
    public void mo3939e(int i, long j2) {
        this.f8642a.releaseOutputBuffer(i, j2);
    }

    @Override // p007c.p190n.p194b.p209b.p233t1.MediaCodecAdapter
    /* JADX INFO: renamed from: f */
    public int mo3940f() {
        return this.f8642a.dequeueInputBuffer(0L);
    }

    @Override // p007c.p190n.p194b.p209b.p233t1.MediaCodecAdapter
    public void flush() {
        this.f8642a.flush();
    }

    @Override // p007c.p190n.p194b.p209b.p233t1.MediaCodecAdapter
    /* JADX INFO: renamed from: g */
    public int mo3941g(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.f8642a.dequeueOutputBuffer(bufferInfo, 0L);
            if (iDequeueOutputBuffer == -3 && Util6.f6307a < 21) {
                this.f8644c = this.f8642a.getOutputBuffers();
            }
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // p007c.p190n.p194b.p209b.p233t1.MediaCodecAdapter
    /* JADX INFO: renamed from: h */
    public void mo3942h(final MediaCodecAdapter.b bVar, Handler handler) {
        this.f8642a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: c.n.b.b.t1.e
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j2, long j3) {
                SynchronousMediaCodecAdapter synchronousMediaCodecAdapter = this.f8542a;
                MediaCodecAdapter.b bVar2 = bVar;
                Objects.requireNonNull(synchronousMediaCodecAdapter);
                ((MediaCodecVideoRenderer.b) bVar2).m3310b(synchronousMediaCodecAdapter, j2, j3);
            }
        }, handler);
    }

    @Override // p007c.p190n.p194b.p209b.p233t1.MediaCodecAdapter
    /* JADX INFO: renamed from: i */
    public void mo3943i(int i, boolean z) {
        this.f8642a.releaseOutputBuffer(i, z);
    }

    @Override // p007c.p190n.p194b.p209b.p233t1.MediaCodecAdapter
    /* JADX INFO: renamed from: j */
    public void mo3944j(int i) {
        this.f8642a.setVideoScalingMode(i);
    }

    @Override // p007c.p190n.p194b.p209b.p233t1.MediaCodecAdapter
    /* JADX INFO: renamed from: k */
    public ByteBuffer mo3945k(int i) {
        return Util6.f6307a >= 21 ? this.f8642a.getInputBuffer(i) : this.f8643b[i];
    }

    @Override // p007c.p190n.p194b.p209b.p233t1.MediaCodecAdapter
    /* JADX INFO: renamed from: l */
    public void mo3946l(Surface surface) {
        this.f8642a.setOutputSurface(surface);
    }

    @Override // p007c.p190n.p194b.p209b.p233t1.MediaCodecAdapter
    /* JADX INFO: renamed from: m */
    public void mo3947m(int i, int i2, int i3, long j2, int i4) {
        this.f8642a.queueInputBuffer(i, i2, i3, j2, i4);
    }

    @Override // p007c.p190n.p194b.p209b.p233t1.MediaCodecAdapter
    /* JADX INFO: renamed from: n */
    public ByteBuffer mo3948n(int i) {
        return Util6.f6307a >= 21 ? this.f8642a.getOutputBuffer(i) : this.f8644c[i];
    }

    @Override // p007c.p190n.p194b.p209b.p233t1.MediaCodecAdapter
    public void release() {
        this.f8643b = null;
        this.f8644c = null;
        this.f8642a.release();
    }

    @Override // p007c.p190n.p194b.p209b.p233t1.MediaCodecAdapter
    public void start() {
        this.f8642a.start();
        if (Util6.f6307a < 21) {
            this.f8643b = this.f8642a.getInputBuffers();
            this.f8644c = this.f8642a.getOutputBuffers();
        }
    }
}
