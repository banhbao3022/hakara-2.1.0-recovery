package p007c.p190n.p194b.p209b.p233t1;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import com.facebook.stetho.dumpapp.Framer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.BaseRenderer;
import p007c.p190n.p194b.p209b.C;
import p007c.p190n.p194b.p209b.ExoPlaybackException;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.FormatHolder;
import p007c.p190n.p194b.p209b.p212b2.NalUnitUtil;
import p007c.p190n.p194b.p209b.p212b2.TimedValueQueue;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p215n1.MpegAudioUtil;
import p007c.p190n.p194b.p209b.p217p1.CryptoInfo;
import p007c.p190n.p194b.p209b.p217p1.DecoderCounters;
import p007c.p190n.p194b.p209b.p217p1.DecoderInputBuffer;
import p007c.p190n.p194b.p209b.p217p1.DecoderReuseEvaluation;
import p007c.p190n.p194b.p209b.p218q1.DrmSession;
import p007c.p190n.p194b.p209b.p218q1.ExoMediaCrypto;
import p007c.p190n.p194b.p209b.p218q1.FrameworkMediaCrypto;
import p007c.p190n.p194b.p209b.p243w1.SampleStream;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.t1.l, reason: use source file name */
/* JADX INFO: compiled from: MediaCodecRenderer.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class MediaCodecRenderer extends BaseRenderer {

    /* JADX INFO: renamed from: q */
    public static final byte[] f8559q = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, Framer.STDOUT_FRAME_PREFIX, -61, 39, 93, Framer.EXIT_FRAME_PREFIX};

    /* JADX INFO: renamed from: A */
    public final ArrayList<Long> f8560A;

    /* JADX INFO: renamed from: A0 */
    public boolean f8561A0;

    /* JADX INFO: renamed from: B */
    public final MediaCodec.BufferInfo f8562B;

    /* JADX INFO: renamed from: B0 */
    public boolean f8563B0;

    /* JADX INFO: renamed from: C */
    public final long[] f8564C;

    /* JADX INFO: renamed from: C0 */
    public boolean f8565C0;

    /* JADX INFO: renamed from: D */
    public final long[] f8566D;

    /* JADX INFO: renamed from: D0 */
    public boolean f8567D0;

    /* JADX INFO: renamed from: E */
    public final long[] f8568E;

    /* JADX INFO: renamed from: E0 */
    public ExoPlaybackException f8569E0;

    /* JADX INFO: renamed from: F */
    public Format f8570F;

    /* JADX INFO: renamed from: F0 */
    public DecoderCounters f8571F0;

    /* JADX INFO: renamed from: G */
    public Format f8572G;

    /* JADX INFO: renamed from: G0 */
    public long f8573G0;

    /* JADX INFO: renamed from: H */
    public DrmSession f8574H;

    /* JADX INFO: renamed from: H0 */
    public long f8575H0;

    /* JADX INFO: renamed from: I */
    public DrmSession f8576I;

    /* JADX INFO: renamed from: I0 */
    public int f8577I0;

    /* JADX INFO: renamed from: J */
    public MediaCrypto f8578J;

    /* JADX INFO: renamed from: K */
    public boolean f8579K;

    /* JADX INFO: renamed from: L */
    public long f8580L;

    /* JADX INFO: renamed from: M */
    public float f8581M;

    /* JADX INFO: renamed from: N */
    public float f8582N;

    /* JADX INFO: renamed from: O */
    public MediaCodecAdapter f8583O;

    /* JADX INFO: renamed from: P */
    public Format f8584P;

    /* JADX INFO: renamed from: Q */
    public MediaFormat f8585Q;

    /* JADX INFO: renamed from: R */
    public boolean f8586R;

    /* JADX INFO: renamed from: S */
    public float f8587S;

    /* JADX INFO: renamed from: T */
    public ArrayDeque<MediaCodecInfo> f8588T;

    /* JADX INFO: renamed from: U */
    public a f8589U;

    /* JADX INFO: renamed from: V */
    public MediaCodecInfo f8590V;

    /* JADX INFO: renamed from: W */
    public int f8591W;

    /* JADX INFO: renamed from: X */
    public boolean f8592X;

    /* JADX INFO: renamed from: Y */
    public boolean f8593Y;

    /* JADX INFO: renamed from: Z */
    public boolean f8594Z;

    /* JADX INFO: renamed from: a0 */
    public boolean f8595a0;

    /* JADX INFO: renamed from: b0 */
    public boolean f8596b0;

    /* JADX INFO: renamed from: c0 */
    public boolean f8597c0;

    /* JADX INFO: renamed from: d0 */
    public boolean f8598d0;

    /* JADX INFO: renamed from: e0 */
    public boolean f8599e0;

    /* JADX INFO: renamed from: f0 */
    public boolean f8600f0;

    /* JADX INFO: renamed from: g0 */
    public boolean f8601g0;

    /* JADX INFO: renamed from: h0 */
    public C2Mp3TimestampTracker f8602h0;

    /* JADX INFO: renamed from: i0 */
    public long f8603i0;

    /* JADX INFO: renamed from: j0 */
    public int f8604j0;

    /* JADX INFO: renamed from: k0 */
    public int f8605k0;

    /* JADX INFO: renamed from: l0 */
    public ByteBuffer f8606l0;

    /* JADX INFO: renamed from: m0 */
    public boolean f8607m0;

    /* JADX INFO: renamed from: n0 */
    public boolean f8608n0;

    /* JADX INFO: renamed from: o0 */
    public boolean f8609o0;

    /* JADX INFO: renamed from: p0 */
    public boolean f8610p0;

    /* JADX INFO: renamed from: q0 */
    public boolean f8611q0;

    /* JADX INFO: renamed from: r */
    public final MediaCodecAdapter.a f8612r;

    /* JADX INFO: renamed from: r0 */
    public boolean f8613r0;

    /* JADX INFO: renamed from: s */
    public final MediaCodecSelector f8614s;

    /* JADX INFO: renamed from: s0 */
    public int f8615s0;

    /* JADX INFO: renamed from: t */
    public final boolean f8616t;

    /* JADX INFO: renamed from: t0 */
    public int f8617t0;

    /* JADX INFO: renamed from: u */
    public final float f8618u;

    /* JADX INFO: renamed from: u0 */
    public int f8619u0;

    /* JADX INFO: renamed from: v */
    public final DecoderInputBuffer f8620v;

    /* JADX INFO: renamed from: v0 */
    public boolean f8621v0;

    /* JADX INFO: renamed from: w */
    public final DecoderInputBuffer f8622w;

    /* JADX INFO: renamed from: w0 */
    public boolean f8623w0;

    /* JADX INFO: renamed from: x */
    public final DecoderInputBuffer f8624x;

    /* JADX INFO: renamed from: x0 */
    public boolean f8625x0;

    /* JADX INFO: renamed from: y */
    public final BatchBuffer f8626y;

    /* JADX INFO: renamed from: y0 */
    public long f8627y0;

    /* JADX INFO: renamed from: z */
    public final TimedValueQueue<Format> f8628z;

    /* JADX INFO: renamed from: z0 */
    public long f8629z0;

    public MediaCodecRenderer(int i, MediaCodecAdapter.a aVar, MediaCodecSelector mediaCodecSelector, boolean z, float f) {
        super(i);
        this.f8612r = aVar;
        Objects.requireNonNull(mediaCodecSelector);
        this.f8614s = mediaCodecSelector;
        this.f8616t = z;
        this.f8618u = f;
        this.f8620v = new DecoderInputBuffer(0);
        this.f8622w = new DecoderInputBuffer(0);
        this.f8624x = new DecoderInputBuffer(2);
        BatchBuffer batchBuffer = new BatchBuffer();
        this.f8626y = batchBuffer;
        this.f8628z = new TimedValueQueue<>();
        this.f8560A = new ArrayList<>();
        this.f8562B = new MediaCodec.BufferInfo();
        this.f8581M = 1.0f;
        this.f8582N = 1.0f;
        this.f8580L = -9223372036854775807L;
        this.f8564C = new long[10];
        this.f8566D = new long[10];
        this.f8568E = new long[10];
        this.f8573G0 = -9223372036854775807L;
        this.f8575H0 = -9223372036854775807L;
        batchBuffer.m3637z(0);
        batchBuffer.f7287h.order(ByteOrder.nativeOrder());
        m3978q0();
    }

    /* JADX INFO: renamed from: y0 */
    public static boolean m3959y0(Format format) {
        Class<? extends ExoMediaCrypto> cls = format.f6921J;
        return cls == null || FrameworkMediaCrypto.class.equals(cls);
    }

    /* JADX INFO: renamed from: A0 */
    public final void m3960A0() throws ExoPlaybackException {
        try {
            this.f8578J.setMediaDrmSession(m3971Y(this.f8576I).f7326c);
            m3980s0(this.f8576I);
            this.f8617t0 = 0;
            this.f8619u0 = 0;
        } catch (MediaCryptoException e) {
            throw m3056z(e, this.f8570F, false);
        }
    }

    @Override // p007c.p190n.p194b.p209b.BaseRenderer
    /* JADX INFO: renamed from: B */
    public void mo3030B() {
        this.f8570F = null;
        this.f8573G0 = -9223372036854775807L;
        this.f8575H0 = -9223372036854775807L;
        this.f8577I0 = 0;
        if (this.f8576I == null && this.f8574H == null) {
            m3969T();
        } else {
            mo3033E();
        }
    }

    /* JADX INFO: renamed from: B0 */
    public final void m3961B0(long j2) throws ExoPlaybackException {
        boolean z;
        Format formatM3083f;
        Format formatM3082e = this.f8628z.m3082e(j2);
        if (formatM3082e == null && this.f8586R) {
            TimedValueQueue<Format> timedValueQueue = this.f8628z;
            synchronized (timedValueQueue) {
                formatM3083f = timedValueQueue.f6299d == 0 ? null : timedValueQueue.m3083f();
            }
            formatM3082e = formatM3083f;
        }
        if (formatM3082e != null) {
            this.f8572G = formatM3082e;
            z = true;
        } else {
            z = false;
        }
        if (z || (this.f8586R && this.f8572G != null)) {
            mo3301g0(this.f8572G, this.f8585Q);
            this.f8586R = false;
        }
    }

    @Override // p007c.p190n.p194b.p209b.BaseRenderer
    /* JADX INFO: renamed from: C */
    public void mo3031C(boolean z, boolean z2) throws ExoPlaybackException {
        this.f8571F0 = new DecoderCounters();
    }

    @Override // p007c.p190n.p194b.p209b.BaseRenderer
    /* JADX INFO: renamed from: D */
    public void mo3032D(long j2, boolean z) throws ExoPlaybackException {
        int i;
        this.f8561A0 = false;
        this.f8563B0 = false;
        this.f8567D0 = false;
        if (this.f8609o0) {
            this.f8626y.mo3635x();
            this.f8624x.mo3635x();
            this.f8610p0 = false;
        } else if (m3969T()) {
            m3973b0();
        }
        TimedValueQueue<Format> timedValueQueue = this.f8628z;
        synchronized (timedValueQueue) {
            i = timedValueQueue.f6299d;
        }
        if (i > 0) {
            this.f8565C0 = true;
        }
        this.f8628z.m3079b();
        int i2 = this.f8577I0;
        if (i2 != 0) {
            this.f8575H0 = this.f8566D[i2 - 1];
            this.f8573G0 = this.f8564C[i2 - 1];
            this.f8577I0 = 0;
        }
    }

    @Override // p007c.p190n.p194b.p209b.BaseRenderer
    /* JADX INFO: renamed from: E */
    public void mo3033E() {
        try {
            m3963N();
            m3977n0();
        } finally {
            m3981t0(null);
        }
    }

    @Override // p007c.p190n.p194b.p209b.BaseRenderer
    /* JADX INFO: renamed from: F */
    public void mo3034F() {
    }

    @Override // p007c.p190n.p194b.p209b.BaseRenderer
    /* JADX INFO: renamed from: G */
    public void mo3035G() {
    }

    @Override // p007c.p190n.p194b.p209b.BaseRenderer
    /* JADX INFO: renamed from: H */
    public void mo3036H(Format[] formatArr, long j2, long j3) throws ExoPlaybackException {
        if (this.f8575H0 == -9223372036854775807L) {
            C2096e.m4570f(this.f8573G0 == -9223372036854775807L);
            this.f8573G0 = j2;
            this.f8575H0 = j3;
            return;
        }
        int i = this.f8577I0;
        if (i == this.f8566D.length) {
            outline.m1568S(outline.m1556G("Too many stream changes, so dropping offset: "), this.f8566D[this.f8577I0 - 1], "MediaCodecRenderer");
        } else {
            this.f8577I0 = i + 1;
        }
        long[] jArr = this.f8564C;
        int i2 = this.f8577I0;
        jArr[i2 - 1] = j2;
        this.f8566D[i2 - 1] = j3;
        this.f8568E[i2 - 1] = this.f8627y0;
    }

    /* JADX INFO: renamed from: J */
    public final boolean m3962J(long j2, long j3) throws ExoPlaybackException {
        C2096e.m4570f(!this.f8563B0);
        if (this.f8626y.m3934D()) {
            BatchBuffer batchBuffer = this.f8626y;
            if (!mo3305l0(j2, j3, null, batchBuffer.f7287h, this.f8605k0, 0, batchBuffer.f8546o, batchBuffer.f7289j, batchBuffer.m3627u(), this.f8626y.m3628v(), this.f8572G)) {
                return false;
            }
            mo3302h0(this.f8626y.f8545n);
            this.f8626y.mo3635x();
        }
        if (this.f8561A0) {
            this.f8563B0 = true;
            return false;
        }
        if (this.f8610p0) {
            C2096e.m4570f(this.f8626y.m3933C(this.f8624x));
            this.f8610p0 = false;
        }
        if (this.f8611q0) {
            if (this.f8626y.m3934D()) {
                return true;
            }
            m3963N();
            this.f8611q0 = false;
            m3973b0();
            if (!this.f8609o0) {
                return false;
            }
        }
        C2096e.m4570f(!this.f8561A0);
        FormatHolder formatHolderM3029A = m3029A();
        this.f8624x.mo3635x();
        while (true) {
            this.f8624x.mo3635x();
            int iM3037I = m3037I(formatHolderM3029A, this.f8624x, false);
            if (iM3037I == -5) {
                mo3300f0(formatHolderM3029A);
                break;
            }
            if (iM3037I != -4) {
                if (iM3037I == -3) {
                    break;
                }
                throw new IllegalStateException();
            }
            if (this.f8624x.m3628v()) {
                this.f8561A0 = true;
                break;
            }
            if (this.f8565C0) {
                Format format = this.f8570F;
                Objects.requireNonNull(format);
                this.f8572G = format;
                mo3301g0(format, null);
                this.f8565C0 = false;
            }
            this.f8624x.m3633A();
            if (!this.f8626y.m3933C(this.f8624x)) {
                this.f8610p0 = true;
                break;
            }
        }
        if (this.f8626y.m3934D()) {
            this.f8626y.m3633A();
        }
        return this.f8626y.m3934D() || this.f8561A0 || this.f8611q0;
    }

    /* JADX INFO: renamed from: K */
    public DecoderReuseEvaluation mo3277K(MediaCodecInfo mediaCodecInfo, Format format, Format format2) {
        return new DecoderReuseEvaluation(mediaCodecInfo.f8552a, format, format2, 0, 1);
    }

    /* JADX INFO: renamed from: L */
    public abstract void mo3279L(MediaCodecInfo mediaCodecInfo, MediaCodecAdapter mediaCodecAdapter, Format format, MediaCrypto mediaCrypto, float f);

    /* JADX INFO: renamed from: M */
    public MediaCodecDecoderException mo3281M(Throwable th, MediaCodecInfo mediaCodecInfo) {
        return new MediaCodecDecoderException(th, mediaCodecInfo);
    }

    /* JADX INFO: renamed from: N */
    public final void m3963N() {
        this.f8611q0 = false;
        this.f8626y.mo3635x();
        this.f8624x.mo3635x();
        this.f8610p0 = false;
        this.f8609o0 = false;
    }

    /* JADX INFO: renamed from: O */
    public final void m3964O() throws ExoPlaybackException {
        if (this.f8621v0) {
            this.f8617t0 = 1;
            this.f8619u0 = 3;
        } else {
            m3977n0();
            m3973b0();
        }
    }

    @TargetApi(23)
    /* JADX INFO: renamed from: P */
    public final boolean m3965P() throws ExoPlaybackException {
        if (this.f8621v0) {
            this.f8617t0 = 1;
            if (this.f8593Y || this.f8595a0) {
                this.f8619u0 = 3;
                return false;
            }
            this.f8619u0 = 2;
        } else {
            m3960A0();
        }
        return true;
    }

    /* JADX INFO: renamed from: Q */
    public final boolean m3966Q(long j2, long j3) throws ExoPlaybackException {
        boolean z;
        boolean z2;
        boolean zMo3305l0;
        int iMo3941g;
        boolean z3;
        if (!(this.f8605k0 >= 0)) {
            if (this.f8596b0 && this.f8623w0) {
                try {
                    iMo3941g = this.f8583O.mo3941g(this.f8562B);
                } catch (IllegalStateException unused) {
                    m3975k0();
                    if (this.f8563B0) {
                        m3977n0();
                    }
                    return false;
                }
            } else {
                iMo3941g = this.f8583O.mo3941g(this.f8562B);
            }
            if (iMo3941g < 0) {
                if (iMo3941g != -2) {
                    if (this.f8601g0 && (this.f8561A0 || this.f8617t0 == 2)) {
                        m3975k0();
                    }
                    return false;
                }
                this.f8625x0 = true;
                MediaFormat mediaFormatMo3937c = this.f8583O.mo3937c();
                if (this.f8591W != 0 && mediaFormatMo3937c.getInteger("width") == 32 && mediaFormatMo3937c.getInteger("height") == 32) {
                    this.f8600f0 = true;
                } else {
                    if (this.f8598d0) {
                        mediaFormatMo3937c.setInteger("channel-count", 1);
                    }
                    this.f8585Q = mediaFormatMo3937c;
                    this.f8586R = true;
                }
                return true;
            }
            if (this.f8600f0) {
                this.f8600f0 = false;
                this.f8583O.mo3943i(iMo3941g, false);
                return true;
            }
            MediaCodec.BufferInfo bufferInfo = this.f8562B;
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                m3975k0();
                return false;
            }
            this.f8605k0 = iMo3941g;
            ByteBuffer byteBufferMo3948n = this.f8583O.mo3948n(iMo3941g);
            this.f8606l0 = byteBufferMo3948n;
            if (byteBufferMo3948n != null) {
                byteBufferMo3948n.position(this.f8562B.offset);
                ByteBuffer byteBuffer = this.f8606l0;
                MediaCodec.BufferInfo bufferInfo2 = this.f8562B;
                byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            if (this.f8597c0) {
                MediaCodec.BufferInfo bufferInfo3 = this.f8562B;
                if (bufferInfo3.presentationTimeUs == 0 && (bufferInfo3.flags & 4) != 0) {
                    long j4 = this.f8627y0;
                    if (j4 != -9223372036854775807L) {
                        bufferInfo3.presentationTimeUs = j4;
                    }
                }
            }
            long j5 = this.f8562B.presentationTimeUs;
            int size = this.f8560A.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z3 = false;
                    break;
                }
                if (this.f8560A.get(i).longValue() == j5) {
                    this.f8560A.remove(i);
                    z3 = true;
                    break;
                }
                i++;
            }
            this.f8607m0 = z3;
            long j6 = this.f8629z0;
            long j7 = this.f8562B.presentationTimeUs;
            this.f8608n0 = j6 == j7;
            m3961B0(j7);
        }
        if (this.f8596b0 && this.f8623w0) {
            try {
                MediaCodecAdapter mediaCodecAdapter = this.f8583O;
                ByteBuffer byteBuffer2 = this.f8606l0;
                int i2 = this.f8605k0;
                MediaCodec.BufferInfo bufferInfo4 = this.f8562B;
                z2 = false;
                z = true;
                try {
                    zMo3305l0 = mo3305l0(j2, j3, mediaCodecAdapter, byteBuffer2, i2, bufferInfo4.flags, 1, bufferInfo4.presentationTimeUs, this.f8607m0, this.f8608n0, this.f8572G);
                } catch (IllegalStateException unused2) {
                    m3975k0();
                    if (this.f8563B0) {
                        m3977n0();
                    }
                    return z2;
                }
            } catch (IllegalStateException unused3) {
                z2 = false;
            }
        } else {
            z = true;
            z2 = false;
            MediaCodecAdapter mediaCodecAdapter2 = this.f8583O;
            ByteBuffer byteBuffer3 = this.f8606l0;
            int i3 = this.f8605k0;
            MediaCodec.BufferInfo bufferInfo5 = this.f8562B;
            zMo3305l0 = mo3305l0(j2, j3, mediaCodecAdapter2, byteBuffer3, i3, bufferInfo5.flags, 1, bufferInfo5.presentationTimeUs, this.f8607m0, this.f8608n0, this.f8572G);
        }
        if (zMo3305l0) {
            mo3302h0(this.f8562B.presentationTimeUs);
            boolean z4 = (this.f8562B.flags & 4) != 0;
            this.f8605k0 = -1;
            this.f8606l0 = null;
            if (!z4) {
                return z;
            }
            m3975k0();
        }
        return z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX INFO: renamed from: R */
    public final boolean m3967R() throws ExoPlaybackException {
        MediaCodecAdapter mediaCodecAdapter = this.f8583O;
        boolean z = 0;
        if (mediaCodecAdapter == null || this.f8617t0 == 2 || this.f8561A0) {
            return false;
        }
        if (this.f8604j0 < 0) {
            int iMo3940f = mediaCodecAdapter.mo3940f();
            this.f8604j0 = iMo3940f;
            if (iMo3940f < 0) {
                return false;
            }
            this.f8622w.f7287h = this.f8583O.mo3945k(iMo3940f);
            this.f8622w.mo3635x();
        }
        if (this.f8617t0 == 1) {
            if (!this.f8601g0) {
                this.f8623w0 = true;
                this.f8583O.mo3947m(this.f8604j0, 0, 0, 0L, 4);
                m3979r0();
            }
            this.f8617t0 = 2;
            return false;
        }
        if (this.f8599e0) {
            this.f8599e0 = false;
            ByteBuffer byteBuffer = this.f8622w.f7287h;
            byte[] bArr = f8559q;
            byteBuffer.put(bArr);
            this.f8583O.mo3947m(this.f8604j0, 0, bArr.length, 0L, 0);
            m3979r0();
            this.f8621v0 = true;
            return true;
        }
        if (this.f8615s0 == 1) {
            for (int i = 0; i < this.f8584P.f6936s.size(); i++) {
                this.f8622w.f7287h.put(this.f8584P.f6936s.get(i));
            }
            this.f8615s0 = 2;
        }
        int iPosition = this.f8622w.f7287h.position();
        FormatHolder formatHolderM3029A = m3029A();
        int iM3037I = m3037I(formatHolderM3029A, this.f8622w, false);
        if (mo3041i()) {
            this.f8629z0 = this.f8627y0;
        }
        if (iM3037I == -3) {
            return false;
        }
        if (iM3037I == -5) {
            if (this.f8615s0 == 2) {
                this.f8622w.mo3635x();
                this.f8615s0 = 1;
            }
            mo3300f0(formatHolderM3029A);
            return true;
        }
        if (this.f8622w.m3628v()) {
            if (this.f8615s0 == 2) {
                this.f8622w.mo3635x();
                this.f8615s0 = 1;
            }
            this.f8561A0 = true;
            if (!this.f8621v0) {
                m3975k0();
                return false;
            }
            try {
                if (!this.f8601g0) {
                    this.f8623w0 = true;
                    this.f8583O.mo3947m(this.f8604j0, 0, 0, 0L, 4);
                    m3979r0();
                }
                return false;
            } catch (MediaCodec.CryptoException e) {
                throw m3056z(e, this.f8570F, false);
            }
        }
        if (!this.f8621v0 && !this.f8622w.m3629w()) {
            this.f8622w.mo3635x();
            if (this.f8615s0 == 2) {
                this.f8615s0 = 1;
            }
            return true;
        }
        boolean zM3634B = this.f8622w.m3634B();
        if (zM3634B) {
            CryptoInfo cryptoInfo = this.f8622w.f7286g;
            Objects.requireNonNull(cryptoInfo);
            if (iPosition != 0) {
                if (cryptoInfo.f7266d == null) {
                    int[] iArr = new int[1];
                    cryptoInfo.f7266d = iArr;
                    cryptoInfo.f7271i.numBytesOfClearData = iArr;
                }
                int[] iArr2 = cryptoInfo.f7266d;
                iArr2[0] = iArr2[0] + iPosition;
            }
        }
        if (this.f8592X && !zM3634B) {
            ByteBuffer byteBuffer2 = this.f8622w.f7287h;
            byte[] bArr2 = NalUnitUtil.f6368a;
            int iPosition2 = byteBuffer2.position();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int i4 = i2 + 1;
                if (i4 >= iPosition2) {
                    byteBuffer2.clear();
                    break;
                }
                int i5 = byteBuffer2.get(i2) & 255;
                if (i3 == 3) {
                    if (i5 == 1 && (byteBuffer2.get(i4) & 31) == 7) {
                        ByteBuffer byteBufferDuplicate = byteBuffer2.duplicate();
                        byteBufferDuplicate.position(i2 - 3);
                        byteBufferDuplicate.limit(iPosition2);
                        byteBuffer2.position(0);
                        byteBuffer2.put(byteBufferDuplicate);
                        break;
                    }
                } else if (i5 == 0) {
                    i3++;
                }
                if (i5 != 0) {
                    i3 = 0;
                }
                i2 = i4;
            }
            if (this.f8622w.f7287h.position() == 0) {
                return true;
            }
            this.f8592X = false;
        }
        DecoderInputBuffer decoderInputBuffer = this.f8622w;
        long j2 = decoderInputBuffer.f7289j;
        C2Mp3TimestampTracker c2Mp3TimestampTracker = this.f8602h0;
        if (c2Mp3TimestampTracker != null) {
            Format format = this.f8570F;
            if (!c2Mp3TimestampTracker.f8550c) {
                ByteBuffer byteBuffer3 = decoderInputBuffer.f7287h;
                Objects.requireNonNull(byteBuffer3);
                int i6 = 0;
                for (int i7 = 0; i7 < 4; i7++) {
                    i6 = (i6 << 8) | (byteBuffer3.get(i7) & 255);
                }
                int iM3531d = MpegAudioUtil.m3531d(i6);
                if (iM3531d == -1) {
                    c2Mp3TimestampTracker.f8550c = true;
                    Log.w("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
                    j2 = decoderInputBuffer.f7289j;
                } else {
                    long j3 = c2Mp3TimestampTracker.f8548a;
                    if (j3 == 0) {
                        long j4 = decoderInputBuffer.f7289j;
                        c2Mp3TimestampTracker.f8549b = j4;
                        c2Mp3TimestampTracker.f8548a = ((long) iM3531d) - 529;
                        j2 = j4;
                    } else {
                        long j5 = (1000000 * j3) / ((long) format.f6916E);
                        c2Mp3TimestampTracker.f8548a = j3 + ((long) iM3531d);
                        j2 = c2Mp3TimestampTracker.f8549b + j5;
                    }
                }
            }
        }
        long j6 = j2;
        if (this.f8622w.m3627u()) {
            this.f8560A.add(Long.valueOf(j6));
        }
        if (this.f8565C0) {
            this.f8628z.m3078a(j6, this.f8570F);
            this.f8565C0 = false;
        }
        if (this.f8602h0 != null) {
            this.f8627y0 = Math.max(this.f8627y0, this.f8622w.f7289j);
        } else {
            this.f8627y0 = Math.max(this.f8627y0, j6);
        }
        this.f8622w.m3633A();
        if (this.f8622w.m3626s()) {
            mo3296Z(this.f8622w);
        }
        mo3304j0(this.f8622w);
        try {
            if (zM3634B) {
                this.f8583O.mo3936b(this.f8604j0, 0, this.f8622w.f7286g, j6, 0);
            } else {
                this.f8583O.mo3947m(this.f8604j0, 0, this.f8622w.f7287h.limit(), j6, 0);
            }
            m3979r0();
            this.f8621v0 = true;
            this.f8615s0 = 0;
            DecoderCounters decoderCounters = this.f8571F0;
            z = decoderCounters.f7277c + 1;
            decoderCounters.f7277c = z;
            return true;
        } catch (MediaCodec.CryptoException e2) {
            throw m3056z(e2, this.f8570F, z);
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m3968S() {
        try {
            this.f8583O.flush();
        } finally {
            mo3306p0();
        }
    }

    /* JADX INFO: renamed from: T */
    public boolean m3969T() {
        if (this.f8583O == null) {
            return false;
        }
        if (this.f8619u0 == 3 || this.f8593Y || ((this.f8594Z && !this.f8625x0) || (this.f8595a0 && this.f8623w0))) {
            m3977n0();
            return true;
        }
        m3968S();
        return false;
    }

    /* JADX INFO: renamed from: U */
    public final List<MediaCodecInfo> m3970U(boolean z) throws MediaCodecUtil.c {
        List<MediaCodecInfo> listMo3295X = mo3295X(this.f8614s, this.f8570F, z);
        if (listMo3295X.isEmpty() && z) {
            listMo3295X = mo3295X(this.f8614s, this.f8570F, false);
            if (!listMo3295X.isEmpty()) {
                StringBuilder sbM1556G = outline.m1556G("Drm session requires secure decoder for ");
                sbM1556G.append(this.f8570F.f6934q);
                sbM1556G.append(", but no secure decoder available. Trying to proceed with ");
                sbM1556G.append(listMo3295X);
                sbM1556G.append(".");
                Log.w("MediaCodecRenderer", sbM1556G.toString());
            }
        }
        return listMo3295X;
    }

    /* JADX INFO: renamed from: V */
    public boolean mo3291V() {
        return false;
    }

    /* JADX INFO: renamed from: W */
    public float mo3293W(float f, Format format, Format[] formatArr) {
        return -1.0f;
    }

    /* JADX INFO: renamed from: X */
    public abstract List<MediaCodecInfo> mo3295X(MediaCodecSelector mediaCodecSelector, Format format, boolean z) throws MediaCodecUtil.c;

    /* JADX INFO: renamed from: Y */
    public final FrameworkMediaCrypto m3971Y(DrmSession drmSession) throws ExoPlaybackException {
        ExoMediaCrypto exoMediaCryptoMo3649e = drmSession.mo3649e();
        if (exoMediaCryptoMo3649e == null || (exoMediaCryptoMo3649e instanceof FrameworkMediaCrypto)) {
            return (FrameworkMediaCrypto) exoMediaCryptoMo3649e;
        }
        throw m3056z(new IllegalArgumentException("Expecting FrameworkMediaCrypto but found: " + exoMediaCryptoMo3649e), this.f8570F, false);
    }

    /* JADX INFO: renamed from: Z */
    public void mo3296Z(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException {
    }

    @Override // p007c.p190n.p194b.p209b.RendererCapabilities
    /* JADX INFO: renamed from: a */
    public final int mo3383a(Format format) throws ExoPlaybackException {
        try {
            return mo3308x0(this.f8614s, format);
        } catch (MediaCodecUtil.c e) {
            throw m3055y(e, format);
        }
    }

    /* JADX WARN: Code duplicated, block: B:113:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:86:0x017a  */
    /* JADX INFO: renamed from: a0 */
    public final void m3972a0(MediaCodecInfo mediaCodecInfo, MediaCrypto mediaCrypto) throws Exception {
        float fMo3293W;
        int i;
        boolean z;
        boolean z2;
        String str = mediaCodecInfo.f8552a;
        int i2 = Util6.f6307a;
        if (i2 < 23) {
            fMo3293W = -1.0f;
        } else {
            float f = this.f8582N;
            Format format = this.f8570F;
            Format[] formatArr = this.f6254l;
            Objects.requireNonNull(formatArr);
            fMo3293W = mo3293W(f, format, formatArr);
        }
        float f2 = fMo3293W <= this.f8618u ? -1.0f : fMo3293W;
        MediaCodecAdapter mediaCodecAdapter = null;
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            C2096e.m4565a("createCodec:" + str);
            MediaCodecAdapter mediaCodecAdapterMo3949a = this.f8612r.mo3949a(MediaCodec.createByCodecName(str));
            try {
                C2096e.m4574j();
                C2096e.m4565a("configureCodec");
                mo3279L(mediaCodecInfo, mediaCodecAdapterMo3949a, this.f8570F, mediaCrypto, f2);
                C2096e.m4574j();
                C2096e.m4565a("startCodec");
                mediaCodecAdapterMo3949a.start();
                C2096e.m4574j();
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                this.f8583O = mediaCodecAdapterMo3949a;
                this.f8590V = mediaCodecInfo;
                this.f8587S = f2;
                this.f8584P = this.f8570F;
                if (i2 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
                    String str2 = Util6.f6310d;
                    if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                        i = 2;
                    } else if (i2 < 24) {
                        i = 0;
                    } else {
                        i = 0;
                    }
                } else if (i2 < 24 || !("OMX.Nvidia.h264.decode".equals(str) || "OMX.Nvidia.h264.decode.secure".equals(str))) {
                    i = 0;
                } else {
                    String str3 = Util6.f6308b;
                    if ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                }
                this.f8591W = i;
                this.f8592X = i2 < 21 && this.f8584P.f6936s.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
                this.f8593Y = i2 < 18 || (i2 == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) || (i2 == 19 && Util6.f6310d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str)));
                this.f8594Z = i2 == 29 && "c2.android.aac.decoder".equals(str);
                if (i2 > 23 || !"OMX.google.vorbis.decoder".equals(str)) {
                    if (i2 <= 19) {
                        String str4 = Util6.f6308b;
                        z = ("hb2000".equals(str4) || "stvm8".equals(str4)) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str));
                    }
                }
                this.f8595a0 = z;
                this.f8596b0 = i2 == 21 && "OMX.google.aac.decoder".equals(str);
                if (i2 < 21 && "OMX.SEC.mp3.dec".equals(str) && "samsung".equals(Util6.f6309c)) {
                    String str5 = Util6.f6308b;
                    if (str5.startsWith("baffin") || str5.startsWith("grand") || str5.startsWith("fortuna") || str5.startsWith("gprimelte") || str5.startsWith("j2y18lte") || str5.startsWith("ms01")) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else {
                    z2 = false;
                }
                this.f8597c0 = z2;
                this.f8598d0 = i2 <= 18 && this.f8584P.f6915D == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
                String str6 = mediaCodecInfo.f8552a;
                this.f8601g0 = ((i2 <= 25 && "OMX.rk.video_decoder.avc".equals(str6)) || ((i2 <= 17 && "OMX.allwinner.video.decoder.avc".equals(str6)) || ((i2 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str6) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str6))) || ("Amazon".equals(Util6.f6309c) && "AFTS".equals(Util6.f6310d) && mediaCodecInfo.f8557f)))) || mo3291V();
                if ("c2.android.mp3.decoder".equals(mediaCodecInfo.f8552a)) {
                    this.f8602h0 = new C2Mp3TimestampTracker();
                }
                if (this.f6252j == 2) {
                    this.f8603i0 = SystemClock.elapsedRealtime() + 1000;
                }
                this.f8571F0.f7275a++;
                mo3298d0(str, jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
            } catch (Exception e) {
                e = e;
                mediaCodecAdapter = mediaCodecAdapterMo3949a;
                if (mediaCodecAdapter != null) {
                    mediaCodecAdapter.release();
                }
                throw e;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m3973b0() throws ExoPlaybackException {
        Format format;
        if (this.f8583O != null || this.f8609o0 || (format = this.f8570F) == null) {
            return;
        }
        if (this.f8576I == null && mo3527w0(format)) {
            Format format2 = this.f8570F;
            m3963N();
            String str = format2.f6934q;
            if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                BatchBuffer batchBuffer = this.f8626y;
                Objects.requireNonNull(batchBuffer);
                C2096e.m4566b(true);
                batchBuffer.f8547p = 32;
            } else {
                BatchBuffer batchBuffer2 = this.f8626y;
                Objects.requireNonNull(batchBuffer2);
                C2096e.m4566b(true);
                batchBuffer2.f8547p = 1;
            }
            this.f8609o0 = true;
            return;
        }
        m3980s0(this.f8576I);
        String str2 = this.f8570F.f6934q;
        DrmSession drmSession = this.f8574H;
        if (drmSession != null) {
            if (this.f8578J == null) {
                FrameworkMediaCrypto frameworkMediaCryptoM3971Y = m3971Y(drmSession);
                if (frameworkMediaCryptoM3971Y != null) {
                    try {
                        MediaCrypto mediaCrypto = new MediaCrypto(frameworkMediaCryptoM3971Y.f7325b, frameworkMediaCryptoM3971Y.f7326c);
                        this.f8578J = mediaCrypto;
                        this.f8579K = !frameworkMediaCryptoM3971Y.f7327d && mediaCrypto.requiresSecureDecoderComponent(str2);
                    } catch (MediaCryptoException e) {
                        throw m3056z(e, this.f8570F, false);
                    }
                } else if (this.f8574H.mo3650f() == null) {
                    return;
                }
            }
            if (FrameworkMediaCrypto.f7324a) {
                int state = this.f8574H.getState();
                if (state == 1) {
                    throw m3055y(this.f8574H.mo3650f(), this.f8570F);
                }
                if (state != 4) {
                    return;
                }
            }
        }
        try {
            m3974c0(this.f8578J, this.f8579K);
        } catch (a e2) {
            throw m3056z(e2, this.f8570F, false);
        }
    }

    @Override // p007c.p190n.p194b.p209b.Renderer2
    /* JADX INFO: renamed from: c */
    public boolean mo3297c() {
        boolean zMo4129c;
        if (this.f8570F == null) {
            return false;
        }
        if (mo3041i()) {
            zMo4129c = this.f6257o;
        } else {
            SampleStream sampleStream = this.f6253k;
            Objects.requireNonNull(sampleStream);
            zMo4129c = sampleStream.mo4129c();
        }
        if (!zMo4129c) {
            if (!(this.f8605k0 >= 0) && (this.f8603i0 == -9223372036854775807L || SystemClock.elapsedRealtime() >= this.f8603i0)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c0 */
    public final void m3974c0(MediaCrypto mediaCrypto, boolean z) throws a {
        if (this.f8588T == null) {
            try {
                List<MediaCodecInfo> listM3970U = m3970U(z);
                ArrayDeque<MediaCodecInfo> arrayDeque = new ArrayDeque<>();
                this.f8588T = arrayDeque;
                if (this.f8616t) {
                    arrayDeque.addAll(listM3970U);
                } else if (!listM3970U.isEmpty()) {
                    this.f8588T.add(listM3970U.get(0));
                }
                this.f8589U = null;
            } catch (MediaCodecUtil.c e) {
                throw new a(this.f8570F, e, z, -49998);
            }
        }
        if (this.f8588T.isEmpty()) {
            throw new a(this.f8570F, (Throwable) null, z, -49999);
        }
        while (this.f8583O == null) {
            MediaCodecInfo mediaCodecInfoPeekFirst = this.f8588T.peekFirst();
            if (!mo3307v0(mediaCodecInfoPeekFirst)) {
                return;
            }
            try {
                m3972a0(mediaCodecInfoPeekFirst, mediaCrypto);
            } catch (Exception e2) {
                p007c.p190n.p194b.p209b.p212b2.Log.m3156d("MediaCodecRenderer", "Failed to initialize decoder: " + mediaCodecInfoPeekFirst, e2);
                this.f8588T.removeFirst();
                a aVar = new a(this.f8570F, e2, z, mediaCodecInfoPeekFirst);
                if (this.f8589U == null) {
                    this.f8589U = aVar;
                } else {
                    a aVar2 = this.f8589U;
                    this.f8589U = new a(aVar2.getMessage(), aVar2.getCause(), aVar2.f8630f, aVar2.f8631g, aVar2.f8632h, aVar2.f8633i, aVar);
                }
                if (this.f8588T.isEmpty()) {
                    throw this.f8589U;
                }
            }
        }
        this.f8588T = null;
    }

    /* JADX INFO: renamed from: d0 */
    public void mo3298d0(String str, long j2, long j3) {
    }

    @Override // p007c.p190n.p194b.p209b.BaseRenderer, p007c.p190n.p194b.p209b.RendererCapabilities
    /* JADX INFO: renamed from: e */
    public final int mo3038e() {
        return 8;
    }

    /* JADX INFO: renamed from: e0 */
    public void mo3299e0(String str) {
    }

    /* JADX WARN: Code duplicated, block: B:90:0x0106  */
    /* JADX INFO: renamed from: f0 */
    public DecoderReuseEvaluation mo3300f0(FormatHolder formatHolder) throws ExoPlaybackException {
        boolean z;
        FrameworkMediaCrypto frameworkMediaCryptoM3971Y;
        boolean zRequiresSecureDecoderComponent;
        boolean z2 = true;
        this.f8565C0 = true;
        Format format = formatHolder.f7259b;
        Objects.requireNonNull(format);
        if (format.f6934q == null) {
            throw m3056z(new IllegalArgumentException(), format, false);
        }
        m3981t0(formatHolder.f7258a);
        this.f8570F = format;
        if (this.f8609o0) {
            this.f8611q0 = true;
            return null;
        }
        MediaCodecAdapter mediaCodecAdapter = this.f8583O;
        if (mediaCodecAdapter == null) {
            this.f8588T = null;
            m3973b0();
            return null;
        }
        MediaCodecInfo mediaCodecInfo = this.f8590V;
        Format format2 = this.f8584P;
        DrmSession drmSession = this.f8574H;
        DrmSession drmSession2 = this.f8576I;
        if (drmSession != drmSession2) {
            if (drmSession2 != null && drmSession != null && Util6.f6307a >= 23) {
                UUID uuid = C.f6407e;
                if (!uuid.equals(drmSession.mo3647c()) && !uuid.equals(drmSession2.mo3647c()) && (frameworkMediaCryptoM3971Y = m3971Y(drmSession2)) != null) {
                    if (!mediaCodecInfo.f8557f) {
                        if (frameworkMediaCryptoM3971Y.f7327d) {
                            zRequiresSecureDecoderComponent = false;
                        } else {
                            try {
                                MediaCrypto mediaCrypto = new MediaCrypto(frameworkMediaCryptoM3971Y.f7325b, frameworkMediaCryptoM3971Y.f7326c);
                                try {
                                    zRequiresSecureDecoderComponent = mediaCrypto.requiresSecureDecoderComponent(format.f6934q);
                                    mediaCrypto.release();
                                } catch (Throwable th) {
                                    mediaCrypto.release();
                                    throw th;
                                }
                            } catch (MediaCryptoException unused) {
                                zRequiresSecureDecoderComponent = true;
                            }
                        }
                        if (zRequiresSecureDecoderComponent) {
                        }
                    }
                    z = false;
                }
            }
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m3964O();
            return new DecoderReuseEvaluation(mediaCodecInfo.f8552a, format2, format, 0, 128);
        }
        boolean z3 = this.f8576I != this.f8574H;
        C2096e.m4570f(!z3 || Util6.f6307a >= 23);
        DecoderReuseEvaluation decoderReuseEvaluationMo3277K = mo3277K(mediaCodecInfo, format2, format);
        int i = decoderReuseEvaluationMo3277K.f7296d;
        int i2 = 2;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException();
                    }
                    if (m3983z0(format)) {
                        this.f8584P = format;
                        if (!z3 || m3965P()) {
                        }
                    } else {
                        i2 = 16;
                    }
                } else if (m3983z0(format)) {
                    this.f8613r0 = true;
                    this.f8615s0 = 1;
                    int i3 = this.f8591W;
                    if (i3 != 2 && (i3 != 1 || format.f6939v != format2.f6939v || format.f6940w != format2.f6940w)) {
                        z2 = false;
                    }
                    this.f8599e0 = z2;
                    this.f8584P = format;
                    if (!z3 || m3965P()) {
                    }
                } else {
                    i2 = 16;
                }
            } else if (m3983z0(format)) {
                this.f8584P = format;
                if (!z3) {
                    if (this.f8621v0) {
                        this.f8617t0 = 1;
                        if (this.f8593Y || this.f8595a0) {
                            this.f8619u0 = 3;
                            z2 = false;
                        } else {
                            this.f8619u0 = 1;
                        }
                    }
                    if (z2) {
                    }
                } else if (m3965P()) {
                }
            } else {
                i2 = 16;
            }
            return (decoderReuseEvaluationMo3277K.f7296d != 0 || (this.f8583O == mediaCodecAdapter && this.f8619u0 != 3)) ? decoderReuseEvaluationMo3277K : new DecoderReuseEvaluation(mediaCodecInfo.f8552a, format2, format, 0, i2);
        }
        m3964O();
        i2 = 0;
        if (decoderReuseEvaluationMo3277K.f7296d != 0) {
        }
    }

    @Override // p007c.p190n.p194b.p209b.Renderer2
    /* JADX INFO: renamed from: g */
    public boolean mo3368g() {
        return this.f8563B0;
    }

    /* JADX INFO: renamed from: g0 */
    public void mo3301g0(Format format, MediaFormat mediaFormat) throws ExoPlaybackException {
    }

    /* JADX INFO: renamed from: h0 */
    public void mo3302h0(long j2) {
        while (true) {
            int i = this.f8577I0;
            if (i == 0 || j2 < this.f8568E[0]) {
                return;
            }
            long[] jArr = this.f8564C;
            this.f8573G0 = jArr[0];
            this.f8575H0 = this.f8566D[0];
            int i2 = i - 1;
            this.f8577I0 = i2;
            System.arraycopy(jArr, 1, jArr, 0, i2);
            long[] jArr2 = this.f8566D;
            System.arraycopy(jArr2, 1, jArr2, 0, this.f8577I0);
            long[] jArr3 = this.f8568E;
            System.arraycopy(jArr3, 1, jArr3, 0, this.f8577I0);
            mo3303i0();
        }
    }

    /* JADX INFO: renamed from: i0 */
    public void mo3303i0() {
    }

    /* JADX INFO: renamed from: j0 */
    public void mo3304j0(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException {
    }

    @TargetApi(23)
    /* JADX INFO: renamed from: k0 */
    public final void m3975k0() throws ExoPlaybackException {
        int i = this.f8619u0;
        if (i == 1) {
            m3968S();
            return;
        }
        if (i == 2) {
            m3968S();
            m3960A0();
        } else if (i != 3) {
            this.f8563B0 = true;
            mo3526o0();
        } else {
            m3977n0();
            m3973b0();
        }
    }

    /* JADX INFO: renamed from: l0 */
    public abstract boolean mo3305l0(long j2, long j3, MediaCodecAdapter mediaCodecAdapter, ByteBuffer byteBuffer, int i, int i2, int i3, long j4, boolean z, boolean z2, Format format) throws ExoPlaybackException;

    @Override // p007c.p190n.p194b.p209b.BaseRenderer, p007c.p190n.p194b.p209b.Renderer2
    /* JADX INFO: renamed from: m */
    public void mo3045m(float f, float f2) throws ExoPlaybackException {
        this.f8581M = f;
        this.f8582N = f2;
        if (this.f8583O == null || this.f8619u0 == 3 || this.f6252j == 0) {
            return;
        }
        m3983z0(this.f8584P);
    }

    /* JADX INFO: renamed from: m0 */
    public final boolean m3976m0(boolean z) throws ExoPlaybackException {
        FormatHolder formatHolderM3029A = m3029A();
        this.f8620v.mo3635x();
        int iM3037I = m3037I(formatHolderM3029A, this.f8620v, z);
        if (iM3037I == -5) {
            mo3300f0(formatHolderM3029A);
            return true;
        }
        if (iM3037I != -4 || !this.f8620v.m3628v()) {
            return false;
        }
        this.f8561A0 = true;
        m3975k0();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n0 */
    public void m3977n0() {
        try {
            MediaCodecAdapter mediaCodecAdapter = this.f8583O;
            if (mediaCodecAdapter != null) {
                mediaCodecAdapter.release();
                this.f8571F0.f7276b++;
                mo3299e0(this.f8590V.f8552a);
            }
            this.f8583O = null;
            try {
                MediaCrypto mediaCrypto = this.f8578J;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
                this.f8578J = null;
                m3980s0(null);
                m3978q0();
            }
        } catch (Throwable th) {
            this.f8583O = null;
            try {
                MediaCrypto mediaCrypto2 = this.f8578J;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
                this.f8578J = null;
                m3980s0(null);
                m3978q0();
            }
        }
    }

    @Override // p007c.p190n.p194b.p209b.Renderer2
    /* JADX INFO: renamed from: o */
    public void mo3369o(long j2, long j3) throws ExoPlaybackException {
        boolean z = false;
        if (this.f8567D0) {
            this.f8567D0 = false;
            m3975k0();
        }
        ExoPlaybackException exoPlaybackException = this.f8569E0;
        if (exoPlaybackException != null) {
            this.f8569E0 = null;
            throw exoPlaybackException;
        }
        boolean z2 = true;
        try {
            if (this.f8563B0) {
                mo3526o0();
                return;
            }
            if (this.f8570F != null || m3976m0(true)) {
                m3973b0();
                if (this.f8609o0) {
                    C2096e.m4565a("bypassRender");
                    while (m3962J(j2, j3)) {
                    }
                    C2096e.m4574j();
                } else if (this.f8583O != null) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    C2096e.m4565a("drainAndFeed");
                    while (m3966Q(j2, j3) && m3982u0(jElapsedRealtime)) {
                    }
                    while (m3967R() && m3982u0(jElapsedRealtime)) {
                    }
                    C2096e.m4574j();
                } else {
                    DecoderCounters decoderCounters = this.f8571F0;
                    int i = decoderCounters.f7278d;
                    SampleStream sampleStream = this.f6253k;
                    Objects.requireNonNull(sampleStream);
                    decoderCounters.f7278d = i + sampleStream.mo4131o(j2 - this.f6255m);
                    m3976m0(false);
                }
                synchronized (this.f8571F0) {
                }
            }
        } catch (IllegalStateException e) {
            if (Util6.f6307a < 21 || !(e instanceof MediaCodec.CodecException)) {
                StackTraceElement[] stackTrace = e.getStackTrace();
                if (stackTrace.length > 0 && stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                    z = true;
                }
                z2 = z;
            }
            if (!z2) {
                throw e;
            }
            throw m3055y(mo3281M(e, this.f8590V), this.f8570F);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public void mo3526o0() throws ExoPlaybackException {
    }

    /* JADX INFO: renamed from: p0 */
    public void mo3306p0() {
        m3979r0();
        this.f8605k0 = -1;
        this.f8606l0 = null;
        this.f8603i0 = -9223372036854775807L;
        this.f8623w0 = false;
        this.f8621v0 = false;
        this.f8599e0 = false;
        this.f8600f0 = false;
        this.f8607m0 = false;
        this.f8608n0 = false;
        this.f8560A.clear();
        this.f8627y0 = -9223372036854775807L;
        this.f8629z0 = -9223372036854775807L;
        C2Mp3TimestampTracker c2Mp3TimestampTracker = this.f8602h0;
        if (c2Mp3TimestampTracker != null) {
            c2Mp3TimestampTracker.f8548a = 0L;
            c2Mp3TimestampTracker.f8549b = 0L;
            c2Mp3TimestampTracker.f8550c = false;
        }
        this.f8617t0 = 0;
        this.f8619u0 = 0;
        this.f8615s0 = this.f8613r0 ? 1 : 0;
    }

    /* JADX INFO: renamed from: q0 */
    public void m3978q0() {
        mo3306p0();
        this.f8569E0 = null;
        this.f8602h0 = null;
        this.f8588T = null;
        this.f8590V = null;
        this.f8584P = null;
        this.f8585Q = null;
        this.f8586R = false;
        this.f8625x0 = false;
        this.f8587S = -1.0f;
        this.f8591W = 0;
        this.f8592X = false;
        this.f8593Y = false;
        this.f8594Z = false;
        this.f8595a0 = false;
        this.f8596b0 = false;
        this.f8597c0 = false;
        this.f8598d0 = false;
        this.f8601g0 = false;
        this.f8613r0 = false;
        this.f8615s0 = 0;
        this.f8579K = false;
    }

    /* JADX INFO: renamed from: r0 */
    public final void m3979r0() {
        this.f8604j0 = -1;
        this.f8622w.f7287h = null;
    }

    /* JADX INFO: renamed from: s0 */
    public final void m3980s0(DrmSession drmSession) {
        DrmSession drmSession2 = this.f8574H;
        if (drmSession2 != drmSession) {
            if (drmSession != null) {
                drmSession.mo3645a(null);
            }
            if (drmSession2 != null) {
                drmSession2.mo3646b(null);
            }
        }
        this.f8574H = drmSession;
    }

    /* JADX INFO: renamed from: t0 */
    public final void m3981t0(DrmSession drmSession) {
        DrmSession drmSession2 = this.f8576I;
        if (drmSession2 != drmSession) {
            if (drmSession != null) {
                drmSession.mo3645a(null);
            }
            if (drmSession2 != null) {
                drmSession2.mo3646b(null);
            }
        }
        this.f8576I = drmSession;
    }

    /* JADX INFO: renamed from: u0 */
    public final boolean m3982u0(long j2) {
        return this.f8580L == -9223372036854775807L || SystemClock.elapsedRealtime() - j2 < this.f8580L;
    }

    /* JADX INFO: renamed from: v0 */
    public boolean mo3307v0(MediaCodecInfo mediaCodecInfo) {
        return true;
    }

    /* JADX INFO: renamed from: w0 */
    public boolean mo3527w0(Format format) {
        return false;
    }

    /* JADX INFO: renamed from: x0 */
    public abstract int mo3308x0(MediaCodecSelector mediaCodecSelector, Format format) throws MediaCodecUtil.c;

    /* JADX INFO: renamed from: z0 */
    public final boolean m3983z0(Format format) throws ExoPlaybackException {
        if (Util6.f6307a < 23) {
            return true;
        }
        float f = this.f8582N;
        Format[] formatArr = this.f6254l;
        Objects.requireNonNull(formatArr);
        float fMo3293W = mo3293W(f, format, formatArr);
        float f2 = this.f8587S;
        if (f2 == fMo3293W) {
            return true;
        }
        if (fMo3293W == -1.0f) {
            m3964O();
            return false;
        }
        if (f2 == -1.0f && fMo3293W <= this.f8618u) {
            return true;
        }
        Bundle bundle = new Bundle();
        bundle.putFloat("operating-rate", fMo3293W);
        this.f8583O.mo3938d(bundle);
        this.f8587S = fMo3293W;
        return true;
    }

    /* JADX INFO: renamed from: c.n.b.b.t1.l$a */
    /* JADX INFO: compiled from: MediaCodecRenderer.java */
    public static class a extends Exception {

        /* JADX INFO: renamed from: f */
        public final String f8630f;

        /* JADX INFO: renamed from: g */
        public final boolean f8631g;

        /* JADX INFO: renamed from: h */
        public final MediaCodecInfo f8632h;

        /* JADX INFO: renamed from: i */
        public final String f8633i;

        /* JADX WARN: Illegal instructions before constructor call */
        public a(Format format, Throwable th, boolean z, int i) {
            String str = "Decoder init failed: [" + i + "], " + format;
            String str2 = format.f6934q;
            StringBuilder sbM1561L = outline.m1561L("com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_", i < 0 ? "neg_" : "");
            sbM1561L.append(Math.abs(i));
            this(str, th, str2, z, null, sbM1561L.toString(), null);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public a(Format format, Throwable th, boolean z, MediaCodecInfo mediaCodecInfo) {
            StringBuilder sbM1556G = outline.m1556G("Decoder init failed: ");
            sbM1556G.append(mediaCodecInfo.f8552a);
            sbM1556G.append(", ");
            sbM1556G.append(format);
            this(sbM1556G.toString(), th, format.f6934q, z, mediaCodecInfo, (Util6.f6307a < 21 || !(th instanceof MediaCodec.CodecException)) ? null : ((MediaCodec.CodecException) th).getDiagnosticInfo(), null);
        }

        public a(String str, Throwable th, String str2, boolean z, MediaCodecInfo mediaCodecInfo, String str3, a aVar) {
            super(str, th);
            this.f8630f = str2;
            this.f8631g = z;
            this.f8632h = mediaCodecInfo;
            this.f8633i = str3;
        }
    }
}
