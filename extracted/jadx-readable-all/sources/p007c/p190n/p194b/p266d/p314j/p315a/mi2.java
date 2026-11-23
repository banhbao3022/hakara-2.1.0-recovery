package p007c.p190n.p194b.p266d.p314j.p315a;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(16)
public final class mi2 extends tk2 implements zn2 {

    /* JADX INFO: renamed from: Q */
    public final yh2 f16767Q;

    /* JADX INFO: renamed from: R */
    public final ii2 f16768R;

    /* JADX INFO: renamed from: S */
    public boolean f16769S;

    /* JADX INFO: renamed from: T */
    public int f16770T;

    /* JADX INFO: renamed from: U */
    public int f16771U;

    /* JADX INFO: renamed from: V */
    public long f16772V;

    /* JADX INFO: renamed from: W */
    public boolean f16773W;

    public mi2(vk2 vk2Var, zi2 zi2Var, boolean z, Handler handler, zh2 zh2Var) {
        super(1, vk2Var, null, true);
        this.f16768R = new ii2(null, new rh2[0], new li2(this));
        this.f16767Q = new yh2(handler, zh2Var);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.tk2, p007c.p190n.p194b.p266d.p314j.p315a.ng2
    /* JADX INFO: renamed from: A */
    public final void mo7701A() {
        ti2 ti2Var;
        try {
            ii2 ii2Var = this.f16768R;
            ii2Var.m7261f();
            rh2[] rh2VarArr = ii2Var.f15228c;
            for (int i = 0; i < 3; i++) {
                rh2VarArr[i].mo7508h();
            }
            ii2Var.f15223S = 0;
            ii2Var.f15222R = false;
            try {
                super.mo7701A();
                synchronized (this.f19887P) {
                }
            } finally {
                synchronized (this.f19887P) {
                    this.f16767Q.m8795a(this.f19887P);
                }
            }
        } catch (Throwable th) {
            try {
                super.mo7701A();
                synchronized (ti2Var) {
                    throw th;
                }
            } finally {
                synchronized (this.f19887P) {
                    this.f16767Q.m8795a(this.f19887P);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0060  */
    /* JADX WARN: Code duplicated, block: B:32:0x0064  */
    /* JADX WARN: Code duplicated, block: B:33:0x006a  */
    /* JADX WARN: Code duplicated, block: B:35:0x0070  */
    /* JADX WARN: Code duplicated, block: B:36:0x0076  */
    /* JADX WARN: Code duplicated, block: B:38:0x007c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0093  */
    /* JADX WARN: Code duplicated, block: B:41:0x0096  */
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.tk2
    /* JADX INFO: renamed from: B */
    public final int mo7702B(vk2 vk2Var, ch2 ch2Var) throws xk2 {
        int i;
        MediaCodecInfo.CodecCapabilities codecCapabilities;
        MediaCodecInfo.AudioCapabilities audioCapabilities;
        boolean z;
        String str = ch2Var.f13016k;
        boolean z2 = false;
        if (!C2622l.m5406n1(str)) {
            return 0;
        }
        int i2 = jo2.f15673a;
        int i3 = i2 >= 21 ? 16 : 0;
        rk2 rk2VarM6039a = bl2.m6039a(str, false);
        if (rk2VarM6039a == null) {
            return 1;
        }
        int i4 = 2;
        if (i2 < 21) {
            i4 = 3;
        } else {
            int i5 = ch2Var.f13029x;
            if (i5 == -1) {
                i = ch2Var.f13028w;
                if (i == -1) {
                    i4 = 3;
                } else {
                    codecCapabilities = rk2VarM6039a.f18919f;
                    if (codecCapabilities == null) {
                        rk2VarM6039a.m8295b("channelCount.caps");
                    } else {
                        audioCapabilities = codecCapabilities.getAudioCapabilities();
                        if (audioCapabilities == null) {
                            rk2VarM6039a.m8295b("channelCount.aCaps");
                        } else if (audioCapabilities.getMaxInputChannelCount() < i) {
                            StringBuilder sb = new StringBuilder(33);
                            sb.append("channelCount.support, ");
                            sb.append(i);
                            rk2VarM6039a.m8295b(sb.toString());
                        } else {
                            z2 = true;
                        }
                    }
                    if (z2) {
                        i4 = 3;
                    }
                }
            } else {
                MediaCodecInfo.CodecCapabilities codecCapabilities2 = rk2VarM6039a.f18919f;
                if (codecCapabilities2 == null) {
                    rk2VarM6039a.m8295b("sampleRate.caps");
                } else {
                    MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities2.getAudioCapabilities();
                    if (audioCapabilities2 == null) {
                        rk2VarM6039a.m8295b("sampleRate.aCaps");
                    } else {
                        if (audioCapabilities2.isSampleRateSupported(i5)) {
                            z = true;
                        } else {
                            StringBuilder sb2 = new StringBuilder(31);
                            sb2.append("sampleRate.support, ");
                            sb2.append(i5);
                            rk2VarM6039a.m8295b(sb2.toString());
                        }
                        if (z) {
                            i = ch2Var.f13028w;
                            if (i == -1) {
                                i4 = 3;
                            } else {
                                codecCapabilities = rk2VarM6039a.f18919f;
                                if (codecCapabilities == null) {
                                    rk2VarM6039a.m8295b("channelCount.caps");
                                } else {
                                    audioCapabilities = codecCapabilities.getAudioCapabilities();
                                    if (audioCapabilities == null) {
                                        rk2VarM6039a.m8295b("channelCount.aCaps");
                                    } else if (audioCapabilities.getMaxInputChannelCount() < i) {
                                        StringBuilder sb3 = new StringBuilder(33);
                                        sb3.append("channelCount.support, ");
                                        sb3.append(i);
                                        rk2VarM6039a.m8295b(sb3.toString());
                                    } else {
                                        z2 = true;
                                    }
                                }
                                if (z2) {
                                    i4 = 3;
                                }
                            }
                        }
                    }
                }
                z = false;
                if (z) {
                    i = ch2Var.f13028w;
                    if (i == -1) {
                        i4 = 3;
                    } else {
                        codecCapabilities = rk2VarM6039a.f18919f;
                        if (codecCapabilities == null) {
                            rk2VarM6039a.m8295b("channelCount.caps");
                        } else {
                            audioCapabilities = codecCapabilities.getAudioCapabilities();
                            if (audioCapabilities == null) {
                                rk2VarM6039a.m8295b("channelCount.aCaps");
                            } else if (audioCapabilities.getMaxInputChannelCount() < i) {
                                StringBuilder sb4 = new StringBuilder(33);
                                sb4.append("channelCount.support, ");
                                sb4.append(i);
                                rk2VarM6039a.m8295b(sb4.toString());
                            } else {
                                z2 = true;
                            }
                        }
                        if (z2) {
                            i4 = 3;
                        }
                    }
                }
            }
        }
        return i3 | 4 | i4;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.tk2
    /* JADX INFO: renamed from: C */
    public final rk2 mo7703C(vk2 vk2Var, ch2 ch2Var, boolean z) throws xk2 {
        return bl2.m6039a(ch2Var.f13016k, false);
    }

    /* JADX WARN: Code duplicated, block: B:68:0x01f2  */
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.zn2
    /* JADX INFO: renamed from: D */
    public final long mo7011D() {
        long jMax;
        long jM6017b;
        long jM7268m;
        long jM7373e;
        ii2 ii2Var = this.f16768R;
        boolean zMo7133q = mo7133q();
        if (!ii2Var.m7267l() || ii2Var.f15209E == 0) {
            jMax = Long.MIN_VALUE;
        } else {
            if (ii2Var.f15234i.getPlayState() == 3) {
                bi2 bi2Var = ii2Var.f15232g;
                long jM6017b2 = (bi2Var.m6017b() * 1000000) / ((long) bi2Var.f12699c);
                if (jM6017b2 != 0) {
                    long jNanoTime = System.nanoTime() / 1000;
                    if (jNanoTime - ii2Var.f15248w >= 30000) {
                        long[] jArr = ii2Var.f15231f;
                        int i = ii2Var.f15245t;
                        jArr[i] = jM6017b2 - jNanoTime;
                        ii2Var.f15245t = (i + 1) % 10;
                        int i2 = ii2Var.f15246u;
                        if (i2 < 10) {
                            ii2Var.f15246u = i2 + 1;
                        }
                        ii2Var.f15248w = jNanoTime;
                        ii2Var.f15247v = 0L;
                        int i3 = 0;
                        while (true) {
                            int i4 = ii2Var.f15246u;
                            if (i3 >= i4) {
                                break;
                            }
                            ii2Var.f15247v = (ii2Var.f15231f[i3] / ((long) i4)) + ii2Var.f15247v;
                            i3++;
                        }
                    }
                    if (!ii2Var.m7271p() && jNanoTime - ii2Var.f15250y >= 500000) {
                        boolean zMo6018c = ii2Var.f15232g.mo6018c();
                        ii2Var.f15249x = zMo6018c;
                        if (zMo6018c) {
                            long jMo6019d = ii2Var.f15232g.mo6019d() / 1000;
                            long jMo6020e = ii2Var.f15232g.mo6020e();
                            if (jMo6019d < ii2Var.f15211G) {
                                ii2Var.f15249x = false;
                            } else if (Math.abs(jMo6019d - jNanoTime) > 5000000) {
                                StringBuilder sb = new StringBuilder(136);
                                sb.append("Spurious audio timestamp (system clock mismatch): ");
                                sb.append(jMo6020e);
                                sb.append(", ");
                                sb.append(jMo6019d);
                                outline.m1570U(sb, ", ", jNanoTime, ", ");
                                outline.m1568S(sb, jM6017b2, "AudioTrack");
                                ii2Var.f15249x = false;
                            } else if (Math.abs(ii2Var.m7268m(jMo6020e) - jM6017b2) > 5000000) {
                                StringBuilder sb2 = new StringBuilder(138);
                                sb2.append("Spurious audio timestamp (frame position mismatch): ");
                                sb2.append(jMo6020e);
                                sb2.append(", ");
                                sb2.append(jMo6019d);
                                outline.m1570U(sb2, ", ", jNanoTime, ", ");
                                outline.m1568S(sb2, jM6017b2, "AudioTrack");
                                ii2Var.f15249x = false;
                            }
                        }
                        Method method = ii2Var.f15251z;
                        if (method != null) {
                            try {
                                long jIntValue = (((long) ((Integer) method.invoke(ii2Var.f15234i, null)).intValue()) * 1000) - ii2Var.f15240o;
                                ii2Var.f15212H = jIntValue;
                                long jMax2 = Math.max(jIntValue, 0L);
                                ii2Var.f15212H = jMax2;
                                if (jMax2 > 5000000) {
                                    StringBuilder sb3 = new StringBuilder(61);
                                    sb3.append("Ignoring impossibly large audio latency: ");
                                    sb3.append(jMax2);
                                    Log.w("AudioTrack", sb3.toString());
                                    ii2Var.f15212H = 0L;
                                }
                            } catch (Exception unused) {
                                ii2Var.f15251z = null;
                            }
                        }
                        ii2Var.f15250y = jNanoTime;
                    }
                }
            }
            long jNanoTime2 = System.nanoTime() / 1000;
            if (ii2Var.f15249x) {
                jM7268m = ii2Var.m7268m(ii2Var.f15232g.mo6020e() + ii2Var.m7269n(jNanoTime2 - (ii2Var.f15232g.mo6019d() / 1000)));
            } else {
                if (ii2Var.f15246u == 0) {
                    bi2 bi2Var2 = ii2Var.f15232g;
                    jM6017b = (bi2Var2.m6017b() * 1000000) / ((long) bi2Var2.f12699c);
                } else {
                    jM6017b = jNanoTime2 + ii2Var.f15247v;
                }
                jM7268m = !zMo7133q ? jM6017b - ii2Var.f15212H : jM6017b;
            }
            long j2 = ii2Var.f15210F;
            while (!ii2Var.f15233h.isEmpty() && jM7268m >= ii2Var.f15233h.getFirst().f14594c) {
                gi2 gi2VarRemove = ii2Var.f15233h.remove();
                ii2Var.f15242q = gi2VarRemove.f14592a;
                ii2Var.f15244s = gi2VarRemove.f14594c;
                ii2Var.f15243r = gi2VarRemove.f14593b - ii2Var.f15210F;
            }
            if (ii2Var.f15242q.f14589b == 1.0f) {
                jM7373e = (jM7268m + ii2Var.f15243r) - ii2Var.f15244s;
            } else if (ii2Var.f15233h.isEmpty()) {
                pi2 pi2Var = ii2Var.f15227b;
                long j3 = pi2Var.f17993k;
                if (j3 >= 1024) {
                    jM7373e = jo2.m7373e(jM7268m - ii2Var.f15244s, pi2Var.f17992j, j3) + ii2Var.f15243r;
                } else {
                    jM7373e = ((long) (((double) ii2Var.f15242q.f14589b) * (jM7268m - ii2Var.f15244s))) + ii2Var.f15243r;
                }
            } else {
                jM7373e = ((long) (((double) ii2Var.f15242q.f14589b) * (jM7268m - ii2Var.f15244s))) + ii2Var.f15243r;
            }
            jMax = j2 + jM7373e;
        }
        if (jMax != Long.MIN_VALUE) {
            if (!this.f16773W) {
                jMax = Math.max(this.f16772V, jMax);
            }
            this.f16772V = jMax;
            this.f16773W = false;
        }
        return this.f16772V;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0037  */
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.tk2
    /* JADX INFO: renamed from: E */
    public final void mo7704E(rk2 rk2Var, MediaCodec mediaCodec, ch2 ch2Var, MediaCrypto mediaCrypto) {
        String str = rk2Var.f18914a;
        boolean z = true;
        if (jo2.f15673a < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(jo2.f15675c)) {
            String str2 = jo2.f15674b;
            if (!str2.startsWith("zeroflte") && !str2.startsWith("herolte") && !str2.startsWith("heroqlte")) {
                z = false;
            }
        } else {
            z = false;
        }
        this.f16769S = z;
        mediaCodec.configure(ch2Var.m6188g(), (Surface) null, (MediaCrypto) null, 0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.tk2
    /* JADX INFO: renamed from: F */
    public final void mo7705F(String str, long j2, long j3) {
        yh2 yh2Var = this.f16767Q;
        yh2Var.f21886a.post(new th2(yh2Var, str));
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.tk2
    /* JADX INFO: renamed from: G */
    public final void mo7706G(ch2 ch2Var) throws pg2 {
        super.mo7706G(ch2Var);
        yh2 yh2Var = this.f16767Q;
        yh2Var.f21886a.post(new uh2(yh2Var, ch2Var));
        this.f16770T = "audio/raw".equals(ch2Var.f13016k) ? ch2Var.f13030y : 2;
        this.f16771U = ch2Var.f13028w;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.tk2
    /* JADX INFO: renamed from: H */
    public final void mo7707H(MediaCodec mediaCodec, MediaFormat mediaFormat) throws pg2 {
        int i;
        int[] iArr;
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        if (this.f16769S && integer == 6) {
            int i2 = this.f16771U;
            if (i2 < 6) {
                int[] iArr2 = new int[i2];
                for (int i3 = 0; i3 < this.f16771U; i3++) {
                    iArr2[i3] = i3;
                }
                iArr = iArr2;
            } else {
                iArr = null;
            }
            i = 6;
        } else {
            i = integer;
            iArr = null;
        }
        try {
            this.f16768R.m7256a("audio/raw", i, integer2, this.f16770T, 0, iArr);
        } catch (di2 e) {
            throw new pg2(e);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.tk2
    /* JADX INFO: renamed from: J */
    public final boolean mo7708J(long j2, long j3, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j4, boolean z) throws pg2 {
        if (z) {
            mediaCodec.releaseOutputBuffer(i, false);
            this.f19887P.f19849e++;
            ii2 ii2Var = this.f16768R;
            if (ii2Var.f15209E == 1) {
                ii2Var.f15209E = 2;
            }
            return true;
        }
        try {
            if (!this.f16768R.m7258c(byteBuffer, j4)) {
                return false;
            }
            mediaCodec.releaseOutputBuffer(i, false);
            this.f19887P.f19848d++;
            return true;
        } catch (ei2 | hi2 e) {
            throw new pg2(e);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.tk2
    /* JADX INFO: renamed from: K */
    public final void mo7709K() throws pg2 {
        try {
            ii2 ii2Var = this.f16768R;
            if (!ii2Var.f15221Q && ii2Var.m7267l() && ii2Var.m7265j()) {
                bi2 bi2Var = ii2Var.f15232g;
                long jM7270o = ii2Var.m7270o();
                bi2Var.f12704h = bi2Var.m6017b();
                bi2Var.f12703g = SystemClock.elapsedRealtime() * 1000;
                bi2Var.f12705i = jM7270o;
                bi2Var.f12697a.stop();
                ii2Var.f15221Q = true;
            }
        } catch (hi2 e) {
            throw new pg2(e);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.tk2, p007c.p190n.p194b.p266d.p314j.p315a.hh2
    /* JADX INFO: renamed from: M */
    public final boolean mo7119M() {
        return this.f16768R.m7259d() || super.mo7119M();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ng2, p007c.p190n.p194b.p266d.p314j.p315a.hh2
    /* JADX INFO: renamed from: e */
    public final zn2 mo7124e() {
        return this;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ng2, p007c.p190n.p194b.p266d.p314j.p315a.rg2
    /* JADX INFO: renamed from: g */
    public final void mo7710g(int i, Object obj) throws pg2 {
        if (i != 2) {
            return;
        }
        ii2 ii2Var = this.f16768R;
        float fFloatValue = ((Float) obj).floatValue();
        if (ii2Var.f15213I != fFloatValue) {
            ii2Var.f15213I = fFloatValue;
            ii2Var.m7266k();
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.zn2
    /* JADX INFO: renamed from: o */
    public final gh2 mo7014o(gh2 gh2Var) {
        return this.f16768R.m7260e(gh2Var);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.tk2, p007c.p190n.p194b.p266d.p314j.p315a.hh2
    /* JADX INFO: renamed from: q */
    public final boolean mo7133q() {
        if (this.f19885N) {
            ii2 ii2Var = this.f16768R;
            if (!ii2Var.m7267l() || (ii2Var.f15221Q && !ii2Var.m7259d())) {
                return true;
            }
        }
        return false;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.zn2
    /* JADX INFO: renamed from: r */
    public final gh2 mo7015r() {
        return this.f16768R.f15242q;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.tk2, p007c.p190n.p194b.p266d.p314j.p315a.ng2
    /* JADX INFO: renamed from: v */
    public final void mo7711v(boolean z) throws pg2 {
        super.mo7711v(z);
        yh2 yh2Var = this.f16767Q;
        yh2Var.f21886a.post(new sh2(yh2Var, this.f19887P));
        Objects.requireNonNull(this.f17094b);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.tk2, p007c.p190n.p194b.p266d.p314j.p315a.ng2
    /* JADX INFO: renamed from: x */
    public final void mo7712x(long j2, boolean z) throws pg2 {
        super.mo7712x(j2, z);
        this.f16768R.m7261f();
        this.f16772V = j2;
        this.f16773W = true;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ng2
    /* JADX INFO: renamed from: y */
    public final void mo7713y() {
        this.f16768R.m7257b();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ng2
    /* JADX INFO: renamed from: z */
    public final void mo7714z() {
        ii2 ii2Var = this.f16768R;
        ii2Var.f15222R = false;
        if (ii2Var.m7267l()) {
            ii2Var.f15247v = 0L;
            ii2Var.f15246u = 0;
            ii2Var.f15245t = 0;
            ii2Var.f15248w = 0L;
            ii2Var.f15249x = false;
            ii2Var.f15250y = 0L;
            bi2 bi2Var = ii2Var.f15232g;
            if (bi2Var.f12703g != -9223372036854775807L) {
                return;
            }
            bi2Var.f12697a.pause();
        }
    }
}
