package p007c.p190n.p194b.p266d.p314j.p315a;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(19)
public abstract class tk2 extends ng2 {

    /* JADX INFO: renamed from: i */
    public static final byte[] f19871i;

    /* JADX INFO: renamed from: A */
    public boolean f19872A;

    /* JADX INFO: renamed from: B */
    public ByteBuffer[] f19873B;

    /* JADX INFO: renamed from: C */
    public ByteBuffer[] f19874C;

    /* JADX INFO: renamed from: D */
    public long f19875D;

    /* JADX INFO: renamed from: E */
    public int f19876E;

    /* JADX INFO: renamed from: F */
    public int f19877F;

    /* JADX INFO: renamed from: G */
    public boolean f19878G;

    /* JADX INFO: renamed from: H */
    public boolean f19879H;

    /* JADX INFO: renamed from: I */
    public int f19880I;

    /* JADX INFO: renamed from: J */
    public int f19881J;

    /* JADX INFO: renamed from: K */
    public boolean f19882K;

    /* JADX INFO: renamed from: L */
    public boolean f19883L;

    /* JADX INFO: renamed from: M */
    public boolean f19884M;

    /* JADX INFO: renamed from: N */
    public boolean f19885N;

    /* JADX INFO: renamed from: O */
    public boolean f19886O;

    /* JADX INFO: renamed from: P */
    public ti2 f19887P;

    /* JADX INFO: renamed from: j */
    public final vk2 f19888j;

    /* JADX INFO: renamed from: k */
    public final ui2 f19889k;

    /* JADX INFO: renamed from: l */
    public final ui2 f19890l;

    /* JADX INFO: renamed from: m */
    public final dh2 f19891m;

    /* JADX INFO: renamed from: n */
    public final List<Long> f19892n;

    /* JADX INFO: renamed from: o */
    public final MediaCodec.BufferInfo f19893o;

    /* JADX INFO: renamed from: p */
    public ch2 f19894p;

    /* JADX INFO: renamed from: q */
    public MediaCodec f19895q;

    /* JADX INFO: renamed from: r */
    public rk2 f19896r;

    /* JADX INFO: renamed from: s */
    public boolean f19897s;

    /* JADX INFO: renamed from: t */
    public boolean f19898t;

    /* JADX INFO: renamed from: u */
    public boolean f19899u;

    /* JADX INFO: renamed from: v */
    public boolean f19900v;

    /* JADX INFO: renamed from: w */
    public boolean f19901w;

    /* JADX INFO: renamed from: x */
    public boolean f19902x;

    /* JADX INFO: renamed from: y */
    public boolean f19903y;

    /* JADX INFO: renamed from: z */
    public boolean f19904z;

    static {
        int i = jo2.f15673a;
        byte[] bArr = new byte[38];
        for (int i2 = 0; i2 < 38; i2++) {
            int i3 = i2 + i2;
            bArr[i2] = (byte) (Character.digit("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78".charAt(i3 + 1), 16) + (Character.digit("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78".charAt(i3), 16) << 4));
        }
        f19871i = bArr;
    }

    public tk2(int i, vk2 vk2Var, zi2 zi2Var, boolean z) {
        super(i);
        C2622l.m5322V2(jo2.f15673a >= 16);
        this.f19888j = vk2Var;
        this.f19889k = new ui2(0);
        this.f19890l = new ui2(0);
        this.f19891m = new dh2();
        this.f19892n = new ArrayList();
        this.f19893o = new MediaCodec.BufferInfo();
        this.f19880I = 0;
        this.f19881J = 0;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ng2
    /* JADX INFO: renamed from: A */
    public void mo7701A() {
        this.f19894p = null;
        mo8306P();
    }

    /* JADX INFO: renamed from: B */
    public abstract int mo7702B(vk2 vk2Var, ch2 ch2Var) throws xk2;

    /* JADX INFO: renamed from: C */
    public rk2 mo7703C(vk2 vk2Var, ch2 ch2Var, boolean z) throws xk2 {
        return bl2.m6039a(ch2Var.f13016k, false);
    }

    /* JADX INFO: renamed from: E */
    public abstract void mo7704E(rk2 rk2Var, MediaCodec mediaCodec, ch2 ch2Var, MediaCrypto mediaCrypto) throws xk2;

    /* JADX INFO: renamed from: F */
    public void mo7705F(String str, long j2, long j3) {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004f  */
    /* JADX INFO: renamed from: G */
    public void mo7706G(ch2 ch2Var) throws pg2 {
        boolean z;
        ch2 ch2Var2 = this.f19894p;
        this.f19894p = ch2Var;
        if (!jo2.m7369a(ch2Var.f13019n, ch2Var2 == null ? null : ch2Var2.f13019n) && this.f19894p.f13019n != null) {
            throw new pg2(new IllegalStateException("Media requires a DrmSessionManager"));
        }
        MediaCodec mediaCodec = this.f19895q;
        if (mediaCodec == null || !mo8308R(mediaCodec, this.f19896r.f18915b, ch2Var2, this.f19894p)) {
            if (this.f19882K) {
                this.f19881J = 1;
                return;
            } else {
                mo8306P();
                m8421N();
                return;
            }
        }
        this.f19879H = true;
        this.f19880I = 1;
        if (this.f19899u) {
            ch2 ch2Var3 = this.f19894p;
            z = ch2Var3.f13020o == ch2Var2.f13020o && ch2Var3.f13021p == ch2Var2.f13021p;
        }
        this.f19904z = z;
    }

    /* JADX INFO: renamed from: H */
    public void mo7707H(MediaCodec mediaCodec, MediaFormat mediaFormat) throws pg2 {
        throw null;
    }

    /* JADX INFO: renamed from: I */
    public final void m8420I() throws pg2 {
        if (this.f19881J == 2) {
            mo8306P();
            m8421N();
        } else {
            this.f19885N = true;
            mo7709K();
        }
    }

    /* JADX INFO: renamed from: J */
    public abstract boolean mo7708J(long j2, long j3, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j4, boolean z) throws pg2;

    /* JADX INFO: renamed from: K */
    public void mo7709K() throws pg2 {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hh2
    /* JADX INFO: renamed from: M */
    public boolean mo7119M() {
        boolean z;
        if (this.f19894p != null) {
            if (this.f17099g) {
                z = this.f17100h;
            } else {
                ul2 ul2Var = this.f17097e;
                vl2 vl2Var = ul2Var.f20374b;
                z = vl2Var.f20837J || (!vl2Var.m8569n() && vl2Var.f20853s.valueAt(ul2Var.f20373a).f15982a.m7281a());
            }
            if (z || this.f19877F >= 0) {
                return true;
            }
            if (this.f19875D != -9223372036854775807L && SystemClock.elapsedRealtime() < this.f19875D) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:60:0x00d7  */
    /* JADX INFO: renamed from: N */
    public final void m8421N() throws pg2 {
        ch2 ch2Var;
        boolean z;
        if (this.f19895q != null || (ch2Var = this.f19894p) == null) {
            return;
        }
        rk2 rk2VarMo7703C = this.f19896r;
        if (rk2VarMo7703C == null) {
            try {
                rk2VarMo7703C = mo7703C(this.f19888j, ch2Var, false);
                this.f19896r = rk2VarMo7703C;
                if (rk2VarMo7703C == null) {
                    throw new pg2(new sk2(this.f19894p, (Throwable) null, false, -49999));
                }
            } catch (xk2 e) {
                throw new pg2(new sk2(this.f19894p, (Throwable) e, false, -49998));
            }
        }
        if (mo8305O(rk2VarMo7703C)) {
            String str = this.f19896r.f18914a;
            ch2 ch2Var2 = this.f19894p;
            int i = jo2.f15673a;
            this.f19897s = i < 21 && ch2Var2.f13018m.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
            this.f19898t = i < 18 || (i == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) || (i == 19 && jo2.f15676d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str)));
            if (i >= 24 || !("OMX.Nvidia.h264.decode".equals(str) || "OMX.Nvidia.h264.decode.secure".equals(str))) {
                z = false;
            } else {
                String str2 = jo2.f15674b;
                if ("flounder".equals(str2) || "flounder_lte".equals(str2) || "grouper".equals(str2) || "tilapia".equals(str2)) {
                    z = true;
                } else {
                    z = false;
                }
            }
            this.f19899u = z;
            this.f19900v = i <= 17 && ("OMX.rk.video_decoder.avc".equals(str) || "OMX.allwinner.video.decoder.avc".equals(str));
            this.f19901w = (i <= 23 && "OMX.google.vorbis.decoder".equals(str)) || (i <= 19 && "hb2000".equals(jo2.f15674b) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str)));
            this.f19902x = i == 21 && "OMX.google.aac.decoder".equals(str);
            this.f19903y = i <= 18 && this.f19894p.f13028w == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
            try {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                String strValueOf = String.valueOf(str);
                C2622l.m5441u1(strValueOf.length() != 0 ? "createCodec:".concat(strValueOf) : new String("createCodec:"));
                this.f19895q = MediaCodec.createByCodecName(str);
                C2622l.m5305R1();
                C2622l.m5441u1("configureCodec");
                mo7704E(this.f19896r, this.f19895q, this.f19894p, null);
                C2622l.m5305R1();
                C2622l.m5441u1("startCodec");
                this.f19895q.start();
                C2622l.m5305R1();
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                mo7705F(str, jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
                this.f19873B = this.f19895q.getInputBuffers();
                this.f19874C = this.f19895q.getOutputBuffers();
                this.f19875D = this.f17096d == 2 ? SystemClock.elapsedRealtime() + 1000 : -9223372036854775807L;
                this.f19876E = -1;
                this.f19877F = -1;
                this.f19886O = true;
                this.f19887P.f19845a++;
            } catch (Exception e2) {
                throw new pg2(new sk2(this.f19894p, (Throwable) e2, false, str));
            }
        }
    }

    /* JADX INFO: renamed from: O */
    public boolean mo8305O(rk2 rk2Var) {
        return true;
    }

    /* JADX INFO: renamed from: P */
    public void mo8306P() {
        this.f19875D = -9223372036854775807L;
        this.f19876E = -1;
        this.f19877F = -1;
        this.f19878G = false;
        this.f19892n.clear();
        this.f19873B = null;
        this.f19874C = null;
        this.f19896r = null;
        this.f19879H = false;
        this.f19882K = false;
        this.f19897s = false;
        this.f19898t = false;
        this.f19899u = false;
        this.f19900v = false;
        this.f19901w = false;
        this.f19903y = false;
        this.f19904z = false;
        this.f19872A = false;
        this.f19883L = false;
        this.f19880I = 0;
        this.f19881J = 0;
        this.f19889k.f20358c = null;
        MediaCodec mediaCodec = this.f19895q;
        if (mediaCodec != null) {
            this.f19887P.f19846b++;
            try {
                mediaCodec.stop();
                try {
                    this.f19895q.release();
                } finally {
                    this.f19895q = null;
                }
            } catch (Throwable th) {
                try {
                    this.f19895q.release();
                    throw th;
                } finally {
                    this.f19895q = null;
                }
            }
        }
    }

    /* JADX INFO: renamed from: Q */
    public void mo8307Q(ui2 ui2Var) {
    }

    /* JADX INFO: renamed from: R */
    public boolean mo8308R(MediaCodec mediaCodec, boolean z, ch2 ch2Var, ch2 ch2Var2) {
        return false;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ng2, p007c.p190n.p194b.p266d.p314j.p315a.ih2
    /* JADX INFO: renamed from: l */
    public final int mo7254l() {
        return 4;
    }

    /* JADX WARN: Code duplicated, block: B:173:0x0321 A[Catch: CryptoException -> 0x038c, TryCatch #4 {CryptoException -> 0x038c, blocks: (B:171:0x0315, B:173:0x0321, B:174:0x032a, B:176:0x0338, B:183:0x0350, B:185:0x037d, B:179:0x0341, B:181:0x0345, B:182:0x0349, B:184:0x0364), top: B:233:0x0315 }] */
    /* JADX WARN: Code duplicated, block: B:176:0x0338 A[Catch: CryptoException -> 0x038c, TryCatch #4 {CryptoException -> 0x038c, blocks: (B:171:0x0315, B:173:0x0321, B:174:0x032a, B:176:0x0338, B:183:0x0350, B:185:0x037d, B:179:0x0341, B:181:0x0345, B:182:0x0349, B:184:0x0364), top: B:233:0x0315 }] */
    /* JADX WARN: Code duplicated, block: B:178:0x0340  */
    /* JADX WARN: Code duplicated, block: B:179:0x0341 A[Catch: CryptoException -> 0x038c, TryCatch #4 {CryptoException -> 0x038c, blocks: (B:171:0x0315, B:173:0x0321, B:174:0x032a, B:176:0x0338, B:183:0x0350, B:185:0x037d, B:179:0x0341, B:181:0x0345, B:182:0x0349, B:184:0x0364), top: B:233:0x0315 }] */
    /* JADX WARN: Code duplicated, block: B:181:0x0345 A[Catch: CryptoException -> 0x038c, TryCatch #4 {CryptoException -> 0x038c, blocks: (B:171:0x0315, B:173:0x0321, B:174:0x032a, B:176:0x0338, B:183:0x0350, B:185:0x037d, B:179:0x0341, B:181:0x0345, B:182:0x0349, B:184:0x0364), top: B:233:0x0315 }] */
    /* JADX WARN: Code duplicated, block: B:184:0x0364 A[Catch: CryptoException -> 0x038c, TryCatch #4 {CryptoException -> 0x038c, blocks: (B:171:0x0315, B:173:0x0321, B:174:0x032a, B:176:0x0338, B:183:0x0350, B:185:0x037d, B:179:0x0341, B:181:0x0345, B:182:0x0349, B:184:0x0364), top: B:233:0x0315 }] */
    /* JADX WARN: Code duplicated, block: B:194:0x039f A[LOOP:1: B:86:0x0198->B:194:0x039f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:257:0x039a A[EDGE_INSN: B:257:0x039a->B:193:0x039a BREAK  A[LOOP:1: B:86:0x0198->B:194:0x039f], SYNTHETIC] */
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hh2
    /* JADX INFO: renamed from: p */
    public final void mo7132p(long j2, long j3) throws pg2 {
        long j4;
        int i;
        int i2;
        boolean zMo7708J;
        boolean z;
        ui2 ui2Var;
        long j5;
        MediaCodec.CryptoInfo cryptoInfo;
        int iDequeueOutputBuffer;
        boolean z2;
        if (this.f19885N) {
            mo7709K();
            return;
        }
        if (this.f19894p == null) {
            this.f19890l.m8506c();
            int iM7860t = m7860t(this.f19891m, this.f19890l, true);
            if (iM7860t != -5) {
                if (iM7860t == -4) {
                    C2622l.m5322V2(this.f19890l.m8208a());
                    this.f19884M = true;
                    m8420I();
                    return;
                }
                return;
            }
            mo7706G(this.f19891m.f13276a);
        }
        m8421N();
        boolean z3 = false;
        if (this.f19895q != null) {
            C2622l.m5441u1("drainAndFeed");
            while (true) {
                if (this.f19877F < 0) {
                    if (this.f19902x && this.f19883L) {
                        try {
                            iDequeueOutputBuffer = this.f19895q.dequeueOutputBuffer(this.f19893o, 0L);
                            this.f19877F = iDequeueOutputBuffer;
                        } catch (IllegalStateException unused) {
                            m8420I();
                            if (this.f19885N) {
                                mo8306P();
                            }
                        }
                    } else {
                        iDequeueOutputBuffer = this.f19895q.dequeueOutputBuffer(this.f19893o, 0L);
                        this.f19877F = iDequeueOutputBuffer;
                    }
                    if (iDequeueOutputBuffer < 0) {
                        if (iDequeueOutputBuffer != -2) {
                            if (iDequeueOutputBuffer != -3) {
                                if (this.f19900v && (this.f19884M || this.f19881J == 2)) {
                                    m8420I();
                                }
                                i = 2;
                                i2 = -1;
                                break;
                            }
                            this.f19874C = this.f19895q.getOutputBuffers();
                        } else {
                            MediaFormat outputFormat = this.f19895q.getOutputFormat();
                            if (this.f19899u && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
                                this.f19872A = true;
                            } else {
                                if (this.f19903y) {
                                    outputFormat.setInteger("channel-count", 1);
                                }
                                mo7707H(this.f19895q, outputFormat);
                            }
                        }
                    } else if (this.f19872A) {
                        this.f19872A = z3;
                        this.f19895q.releaseOutputBuffer(iDequeueOutputBuffer, z3);
                        this.f19877F = -1;
                    } else {
                        MediaCodec.BufferInfo bufferInfo = this.f19893o;
                        if ((bufferInfo.flags & 4) != 0) {
                            m8420I();
                            this.f19877F = -1;
                            i = 2;
                            i2 = -1;
                            break;
                        }
                        ByteBuffer byteBuffer = this.f19874C[this.f19877F];
                        if (byteBuffer != null) {
                            byteBuffer.position(bufferInfo.offset);
                            MediaCodec.BufferInfo bufferInfo2 = this.f19893o;
                            byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
                        }
                        long j6 = this.f19893o.presentationTimeUs;
                        int size = this.f19892n.size();
                        int i3 = 0;
                        while (true) {
                            if (i3 >= size) {
                                z2 = false;
                                break;
                            } else {
                                if (this.f19892n.get(i3).longValue() == j6) {
                                    this.f19892n.remove(i3);
                                    z2 = true;
                                    break;
                                }
                                i3++;
                            }
                        }
                        this.f19878G = z2;
                    }
                }
                if (this.f19902x && this.f19883L) {
                    try {
                        MediaCodec mediaCodec = this.f19895q;
                        ByteBuffer[] byteBufferArr = this.f19874C;
                        int i4 = this.f19877F;
                        ByteBuffer byteBuffer2 = byteBufferArr[i4];
                        MediaCodec.BufferInfo bufferInfo3 = this.f19893o;
                        i2 = -1;
                        i = 2;
                        try {
                            zMo7708J = mo7708J(j2, j3, mediaCodec, byteBuffer2, i4, bufferInfo3.flags, bufferInfo3.presentationTimeUs, this.f19878G);
                        } catch (IllegalStateException unused2) {
                            m8420I();
                            if (this.f19885N) {
                                mo8306P();
                            }
                        }
                    } catch (IllegalStateException unused3) {
                        i = 2;
                        i2 = -1;
                    }
                } else {
                    i = 2;
                    i2 = -1;
                    MediaCodec mediaCodec2 = this.f19895q;
                    ByteBuffer[] byteBufferArr2 = this.f19874C;
                    int i5 = this.f19877F;
                    ByteBuffer byteBuffer3 = byteBufferArr2[i5];
                    MediaCodec.BufferInfo bufferInfo4 = this.f19893o;
                    zMo7708J = mo7708J(j2, j3, mediaCodec2, byteBuffer3, i5, bufferInfo4.flags, bufferInfo4.presentationTimeUs, this.f19878G);
                }
                if (!zMo7708J) {
                    break;
                }
                long j7 = this.f19893o.presentationTimeUs;
                this.f19877F = i2;
                z3 = false;
            }
            while (true) {
                MediaCodec mediaCodec3 = this.f19895q;
                if (mediaCodec3 != null && this.f19881J != i && !this.f19884M) {
                    if (this.f19876E < 0) {
                        int iDequeueInputBuffer = mediaCodec3.dequeueInputBuffer(0L);
                        this.f19876E = iDequeueInputBuffer;
                        if (iDequeueInputBuffer >= 0) {
                            ui2 ui2Var2 = this.f19889k;
                            ui2Var2.f20358c = this.f19873B[iDequeueInputBuffer];
                            ui2Var2.m8506c();
                        }
                        z = false;
                        if (!z) {
                            break;
                        } else {
                            i = 2;
                        }
                    }
                    if (this.f19881J == 1) {
                        if (!this.f19900v) {
                            this.f19883L = true;
                            this.f19895q.queueInputBuffer(this.f19876E, 0, 0, 0L, 4);
                            this.f19876E = i2;
                        }
                        this.f19881J = i;
                    } else {
                        if (this.f19904z) {
                            this.f19904z = false;
                            ByteBuffer byteBuffer4 = this.f19889k.f20358c;
                            byte[] bArr = f19871i;
                            byteBuffer4.put(bArr);
                            MediaCodec mediaCodec4 = this.f19895q;
                            int i6 = this.f19876E;
                            int length = bArr.length;
                            mediaCodec4.queueInputBuffer(i6, 0, 38, 0L, 0);
                            this.f19876E = i2;
                            this.f19882K = true;
                        } else {
                            if (this.f19880I == 1) {
                                for (int i7 = 0; i7 < this.f19894p.f13018m.size(); i7++) {
                                    this.f19889k.f20358c.put(this.f19894p.f13018m.get(i7));
                                }
                                this.f19880I = i;
                            }
                            int iPosition = this.f19889k.f20358c.position();
                            int iM7860t2 = m7860t(this.f19891m, this.f19889k, false);
                            if (iM7860t2 != -3) {
                                if (iM7860t2 == -5) {
                                    if (this.f19880I == i) {
                                        this.f19889k.m8506c();
                                        this.f19880I = 1;
                                    }
                                    mo7706G(this.f19891m.f13276a);
                                } else if (this.f19889k.m8208a()) {
                                    if (this.f19880I == i) {
                                        this.f19889k.m8506c();
                                        this.f19880I = 1;
                                    }
                                    this.f19884M = true;
                                    if (this.f19882K) {
                                        try {
                                            if (!this.f19900v) {
                                                this.f19883L = true;
                                                this.f19895q.queueInputBuffer(this.f19876E, 0, 0, 0L, 4);
                                                this.f19876E = i2;
                                            }
                                        } catch (MediaCodec.CryptoException e) {
                                            throw new pg2(e);
                                        }
                                    } else {
                                        m8420I();
                                    }
                                } else if (!this.f19886O || this.f19889k.m8209b(1)) {
                                    this.f19886O = false;
                                    boolean zM8209b = this.f19889k.m8209b(1073741824);
                                    if (!this.f19897s || zM8209b) {
                                        try {
                                            ui2Var = this.f19889k;
                                            j5 = ui2Var.f20359d;
                                            if (ui2Var.m8209b(Integer.MIN_VALUE)) {
                                                this.f19892n.add(Long.valueOf(j5));
                                            }
                                            this.f19889k.f20358c.flip();
                                            mo8307Q(this.f19889k);
                                            if (zM8209b) {
                                                cryptoInfo = this.f19889k.f20357b.f19575g;
                                                if (iPosition != 0) {
                                                    if (cryptoInfo.numBytesOfClearData == null) {
                                                        cryptoInfo.numBytesOfClearData = new int[1];
                                                    }
                                                    int[] iArr = cryptoInfo.numBytesOfClearData;
                                                    iArr[0] = iArr[0] + iPosition;
                                                }
                                                this.f19895q.queueSecureInputBuffer(this.f19876E, 0, cryptoInfo, j5, 0);
                                            } else {
                                                this.f19895q.queueInputBuffer(this.f19876E, 0, this.f19889k.f20358c.limit(), j5, 0);
                                            }
                                            this.f19876E = i2;
                                            this.f19882K = true;
                                            this.f19880I = 0;
                                            this.f19887P.f19847c++;
                                        } catch (MediaCodec.CryptoException e2) {
                                            throw new pg2(e2);
                                        }
                                    } else {
                                        ByteBuffer byteBuffer5 = this.f19889k.f20358c;
                                        int iPosition2 = byteBuffer5.position();
                                        int i8 = 0;
                                        int i9 = 0;
                                        while (true) {
                                            int i10 = i9 + 1;
                                            if (i10 >= iPosition2) {
                                                byteBuffer5.clear();
                                                break;
                                            }
                                            int i11 = byteBuffer5.get(i9) & 255;
                                            if (i8 == 3) {
                                                if (i11 == 1) {
                                                    if ((byteBuffer5.get(i10) & 31) == 7) {
                                                        ByteBuffer byteBufferDuplicate = byteBuffer5.duplicate();
                                                        byteBufferDuplicate.position(i9 - 3);
                                                        byteBufferDuplicate.limit(iPosition2);
                                                        byteBuffer5.position(0);
                                                        byteBuffer5.put(byteBufferDuplicate);
                                                        break;
                                                    }
                                                    i11 = 1;
                                                }
                                            } else if (i11 == 0) {
                                                i8++;
                                            }
                                            if (i11 != 0) {
                                                i8 = 0;
                                            }
                                            i9 = i10;
                                        }
                                        if (this.f19889k.f20358c.position() != 0) {
                                            this.f19897s = false;
                                            ui2Var = this.f19889k;
                                            j5 = ui2Var.f20359d;
                                            if (ui2Var.m8209b(Integer.MIN_VALUE)) {
                                                this.f19892n.add(Long.valueOf(j5));
                                            }
                                            this.f19889k.f20358c.flip();
                                            mo8307Q(this.f19889k);
                                            if (zM8209b) {
                                                cryptoInfo = this.f19889k.f20357b.f19575g;
                                                if (iPosition != 0) {
                                                    if (cryptoInfo.numBytesOfClearData == null) {
                                                        cryptoInfo.numBytesOfClearData = new int[1];
                                                    }
                                                    int[] iArr2 = cryptoInfo.numBytesOfClearData;
                                                    iArr2[0] = iArr2[0] + iPosition;
                                                }
                                                this.f19895q.queueSecureInputBuffer(this.f19876E, 0, cryptoInfo, j5, 0);
                                            } else {
                                                this.f19895q.queueInputBuffer(this.f19876E, 0, this.f19889k.f20358c.limit(), j5, 0);
                                            }
                                            this.f19876E = i2;
                                            this.f19882K = true;
                                            this.f19880I = 0;
                                            this.f19887P.f19847c++;
                                        }
                                    }
                                } else {
                                    this.f19889k.m8506c();
                                    if (this.f19880I == i) {
                                        this.f19880I = 1;
                                    }
                                }
                            }
                            z = false;
                        }
                        z = true;
                    }
                    if (!z) {
                        break;
                        break;
                    }
                    i = 2;
                }
                z = false;
                if (!z) {
                    break;
                    break;
                }
                i = 2;
            }
            C2622l.m5305R1();
        } else {
            ul2 ul2Var = this.f17097e;
            long j8 = j2 - this.f17098f;
            vl2 vl2Var = ul2Var.f20374b;
            km2 km2VarValueAt = vl2Var.f20853s.valueAt(ul2Var.f20373a);
            if (!vl2Var.f20837J || j8 <= km2VarValueAt.m7522h()) {
                km2VarValueAt.m7523i(j8, true);
            } else {
                im2 im2Var = km2VarValueAt.f15982a;
                synchronized (im2Var) {
                    if (im2Var.m7281a()) {
                        int i12 = im2Var.f15312k;
                        int i13 = im2Var.f15310i;
                        int i14 = i12 + i13;
                        int i15 = im2Var.f15302a;
                        int i16 = (i14 - 1) % i15;
                        im2Var.f15312k = i14 % i15;
                        im2Var.f15311j += i13;
                        im2Var.f15310i = 0;
                        j4 = im2Var.f15304c[i16] + ((long) im2Var.f15305d[i16]);
                    } else {
                        j4 = -1;
                    }
                }
                if (j4 != -1) {
                    km2VarValueAt.m7525k(j4);
                }
            }
            this.f19890l.m8506c();
            int iM7860t3 = m7860t(this.f19891m, this.f19890l, false);
            if (iM7860t3 == -5) {
                mo7706G(this.f19891m.f13276a);
            } else if (iM7860t3 == -4) {
                C2622l.m5322V2(this.f19890l.m8208a());
                this.f19884M = true;
                m8420I();
            }
        }
        synchronized (this.f19887P) {
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hh2
    /* JADX INFO: renamed from: q */
    public boolean mo7133q() {
        return this.f19885N;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ng2
    /* JADX INFO: renamed from: v */
    public void mo7711v(boolean z) throws pg2 {
        this.f19887P = new ti2();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ng2
    /* JADX INFO: renamed from: x */
    public void mo7712x(long j2, boolean z) throws pg2 {
        this.f19884M = false;
        this.f19885N = false;
        if (this.f19895q != null) {
            this.f19875D = -9223372036854775807L;
            this.f19876E = -1;
            this.f19877F = -1;
            this.f19886O = true;
            this.f19878G = false;
            this.f19892n.clear();
            this.f19904z = false;
            this.f19872A = false;
            if (this.f19898t || ((this.f19901w && this.f19883L) || this.f19881J != 0)) {
                mo8306P();
                m8421N();
            } else {
                this.f19895q.flush();
                this.f19882K = false;
            }
            if (!this.f19879H || this.f19894p == null) {
                return;
            }
            this.f19880I = 1;
        }
    }
}
