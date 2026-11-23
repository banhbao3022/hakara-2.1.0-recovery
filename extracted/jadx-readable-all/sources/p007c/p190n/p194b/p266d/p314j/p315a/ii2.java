package p007c.p190n.p194b.p266d.p314j.p315a;

import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ii2 {

    /* JADX INFO: renamed from: A */
    public int f15205A;

    /* JADX INFO: renamed from: B */
    public long f15206B;

    /* JADX INFO: renamed from: C */
    public int f15207C;

    /* JADX INFO: renamed from: D */
    public long f15208D;

    /* JADX INFO: renamed from: E */
    public int f15209E;

    /* JADX INFO: renamed from: F */
    public long f15210F;

    /* JADX INFO: renamed from: G */
    public long f15211G;

    /* JADX INFO: renamed from: H */
    public long f15212H;

    /* JADX INFO: renamed from: I */
    public float f15213I;

    /* JADX INFO: renamed from: J */
    public rh2[] f15214J;

    /* JADX INFO: renamed from: K */
    public ByteBuffer[] f15215K;

    /* JADX INFO: renamed from: L */
    public ByteBuffer f15216L;

    /* JADX INFO: renamed from: M */
    public ByteBuffer f15217M;

    /* JADX INFO: renamed from: N */
    public byte[] f15218N;

    /* JADX INFO: renamed from: O */
    public int f15219O;

    /* JADX INFO: renamed from: P */
    public int f15220P;

    /* JADX INFO: renamed from: Q */
    public boolean f15221Q;

    /* JADX INFO: renamed from: R */
    public boolean f15222R;

    /* JADX INFO: renamed from: S */
    public int f15223S;

    /* JADX INFO: renamed from: T */
    public boolean f15224T;

    /* JADX INFO: renamed from: U */
    public long f15225U;

    /* JADX INFO: renamed from: a */
    public final ki2 f15226a;

    /* JADX INFO: renamed from: b */
    public final pi2 f15227b;

    /* JADX INFO: renamed from: c */
    public final rh2[] f15228c;

    /* JADX INFO: renamed from: d */
    public final fi2 f15229d;

    /* JADX INFO: renamed from: e */
    public final ConditionVariable f15230e = new ConditionVariable(true);

    /* JADX INFO: renamed from: f */
    public final long[] f15231f;

    /* JADX INFO: renamed from: g */
    public final bi2 f15232g;

    /* JADX INFO: renamed from: h */
    public final LinkedList<gi2> f15233h;

    /* JADX INFO: renamed from: i */
    public AudioTrack f15234i;

    /* JADX INFO: renamed from: j */
    public int f15235j;

    /* JADX INFO: renamed from: k */
    public int f15236k;

    /* JADX INFO: renamed from: l */
    public int f15237l;

    /* JADX INFO: renamed from: m */
    public int f15238m;

    /* JADX INFO: renamed from: n */
    public int f15239n;

    /* JADX INFO: renamed from: o */
    public long f15240o;

    /* JADX INFO: renamed from: p */
    public gh2 f15241p;

    /* JADX INFO: renamed from: q */
    public gh2 f15242q;

    /* JADX INFO: renamed from: r */
    public long f15243r;

    /* JADX INFO: renamed from: s */
    public long f15244s;

    /* JADX INFO: renamed from: t */
    public int f15245t;

    /* JADX INFO: renamed from: u */
    public int f15246u;

    /* JADX INFO: renamed from: v */
    public long f15247v;

    /* JADX INFO: renamed from: w */
    public long f15248w;

    /* JADX INFO: renamed from: x */
    public boolean f15249x;

    /* JADX INFO: renamed from: y */
    public long f15250y;

    /* JADX INFO: renamed from: z */
    public Method f15251z;

    public ii2(ph2 ph2Var, rh2[] rh2VarArr, fi2 fi2Var) {
        this.f15229d = fi2Var;
        if (jo2.f15673a >= 18) {
            try {
                this.f15251z = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        if (jo2.f15673a >= 19) {
            this.f15232g = new ci2();
        } else {
            this.f15232g = new bi2();
        }
        ki2 ki2Var = new ki2();
        this.f15226a = ki2Var;
        pi2 pi2Var = new pi2();
        this.f15227b = pi2Var;
        rh2[] rh2VarArr2 = {new ni2(), ki2Var, pi2Var};
        this.f15228c = rh2VarArr2;
        System.arraycopy(rh2VarArr, 0, rh2VarArr2, 2, 0);
        this.f15231f = new long[10];
        this.f15213I = 1.0f;
        this.f15209E = 0;
        this.f15223S = 0;
        this.f15242q = gh2.f14588a;
        this.f15220P = -1;
        this.f15214J = new rh2[0];
        this.f15215K = new ByteBuffer[0];
        this.f15233h = new LinkedList<>();
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0086  */
    /* JADX INFO: renamed from: a */
    public final void m7256a(String str, int i, int i2, int i3, int i4, int[] iArr) throws di2 {
        int i5;
        this.f15205A = jo2.m7377i(i3, i);
        this.f15226a.f15955d = iArr;
        rh2[] rh2VarArr = this.f15228c;
        boolean zMo7510j = false;
        for (int i6 = 0; i6 < 3; i6++) {
            rh2 rh2Var = rh2VarArr[i6];
            try {
                zMo7510j |= rh2Var.mo7510j(i2, i, i3);
                if (rh2Var.mo7501a()) {
                    i = rh2Var.mo7502b();
                    rh2Var.mo7505e();
                    i3 = 2;
                }
            } catch (qh2 e) {
                throw new di2(e);
            }
        }
        if (zMo7510j) {
            m7262g();
        }
        int i7 = 252;
        switch (i) {
            case 1:
                i5 = 4;
                break;
            case 2:
                i5 = 12;
                break;
            case 3:
                i5 = 28;
                break;
            case 4:
                i5 = 204;
                break;
            case 5:
                i5 = 220;
                break;
            case 6:
                i5 = 252;
                break;
            case 7:
                i5 = 1276;
                break;
            case 8:
                i5 = og2.f17615a;
                break;
            default:
                throw new di2(outline.m1585g(38, "Unsupported channel count: ", i));
        }
        int i8 = jo2.f15673a;
        if (i8 > 23 || !"foster".equals(jo2.f15674b) || !"NVIDIA".equals(jo2.f15675c)) {
            i7 = i5;
        } else if (i != 3 && i != 5) {
            if (i != 7) {
                i7 = i5;
            } else {
                i7 = og2.f17615a;
            }
        }
        if (i8 <= 25) {
            "fugu".equals(jo2.f15674b);
        }
        if (!zMo7510j && m7267l() && this.f15237l == i3 && this.f15235j == i2 && this.f15236k == i7) {
            return;
        }
        m7261f();
        this.f15237l = i3;
        this.f15235j = i2;
        this.f15236k = i7;
        this.f15238m = 2;
        this.f15207C = jo2.m7377i(2, i);
        int minBufferSize = AudioTrack.getMinBufferSize(i2, i7, this.f15238m);
        C2622l.m5322V2(minBufferSize != -2);
        int i9 = minBufferSize * 4;
        int iM7269n = ((int) m7269n(250000L)) * this.f15207C;
        int iMax = (int) Math.max(minBufferSize, m7269n(750000L) * ((long) this.f15207C));
        if (i9 < iM7269n) {
            i9 = iM7269n;
        } else if (i9 > iMax) {
            i9 = iMax;
        }
        this.f15239n = i9;
        this.f15240o = m7268m(i9 / this.f15207C);
        m7260e(this.f15242q);
    }

    /* JADX INFO: renamed from: b */
    public final void m7257b() {
        this.f15222R = true;
        if (m7267l()) {
            this.f15211G = System.nanoTime() / 1000;
            this.f15234i.play();
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m7258c(ByteBuffer byteBuffer, long j2) throws ei2, hi2 {
        int i;
        ByteBuffer byteBuffer2 = this.f15216L;
        C2622l.m5366f1(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (!m7267l()) {
            this.f15230e.block();
            int i2 = this.f15223S;
            if (i2 == 0) {
                this.f15234i = new AudioTrack(3, this.f15235j, this.f15236k, this.f15238m, this.f15239n, 1);
            } else {
                this.f15234i = new AudioTrack(3, this.f15235j, this.f15236k, this.f15238m, this.f15239n, 1, i2);
            }
            int state = this.f15234i.getState();
            if (state != 1) {
                try {
                    this.f15234i.release();
                } catch (Exception unused) {
                } finally {
                    this.f15234i = null;
                }
                throw new ei2(state, this.f15235j, this.f15236k, this.f15239n);
            }
            int audioSessionId = this.f15234i.getAudioSessionId();
            if (this.f15223S != audioSessionId) {
                this.f15223S = audioSessionId;
                yh2 yh2Var = ((li2) this.f15229d).f16369a.f16767Q;
                yh2Var.f21886a.post(new xh2(yh2Var));
            }
            this.f15232g.mo6016a(this.f15234i, m7271p());
            m7266k();
            this.f15224T = false;
            if (this.f15222R) {
                m7257b();
            }
        }
        if (m7271p()) {
            if (this.f15234i.getPlayState() == 2) {
                this.f15224T = false;
                return false;
            }
            if (this.f15234i.getPlayState() == 1 && this.f15232g.m6017b() != 0) {
                return false;
            }
        }
        boolean z = this.f15224T;
        boolean zM7259d = m7259d();
        this.f15224T = zM7259d;
        if (z && !zM7259d && this.f15234i.getPlayState() != 1) {
            SystemClock.elapsedRealtime();
            fi2 fi2Var = this.f15229d;
            og2.m8008a(this.f15240o);
            yh2 yh2Var2 = ((li2) fi2Var).f16369a.f16767Q;
            yh2Var2.f21886a.post(new vh2(yh2Var2));
        }
        if (this.f15216L == null) {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (this.f15241p != null) {
                if (!m7265j()) {
                    return false;
                }
                this.f15233h.add(new gi2(this.f15241p, Math.max(0L, j2), m7268m(m7270o())));
                this.f15241p = null;
                m7262g();
            }
            if (this.f15209E == 0) {
                this.f15210F = Math.max(0L, j2);
                this.f15209E = 1;
            } else {
                long jM7268m = m7268m(this.f15206B / ((long) this.f15205A)) + this.f15210F;
                if (this.f15209E != 1 || Math.abs(jM7268m - j2) <= 200000) {
                    i = 2;
                } else {
                    StringBuilder sb = new StringBuilder(80);
                    sb.append("Discontinuity detected [expected ");
                    sb.append(jM7268m);
                    sb.append(", got ");
                    sb.append(j2);
                    sb.append("]");
                    Log.e("AudioTrack", sb.toString());
                    i = 2;
                    this.f15209E = 2;
                }
                if (this.f15209E == i) {
                    this.f15210F = (j2 - jM7268m) + this.f15210F;
                    this.f15209E = 1;
                    ((li2) this.f15229d).f16369a.f16773W = true;
                }
            }
            this.f15206B += (long) byteBuffer.remaining();
            this.f15216L = byteBuffer;
        }
        m7263h(j2);
        if (this.f15216L.hasRemaining()) {
            return false;
        }
        this.f15216L = null;
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m7259d() {
        if (m7267l()) {
            if (m7270o() > this.f15232g.m6017b()) {
                return true;
            }
            if (m7271p() && this.f15234i.getPlayState() == 2 && this.f15234i.getPlaybackHeadPosition() == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final gh2 m7260e(gh2 gh2Var) {
        pi2 pi2Var = this.f15227b;
        float f = gh2Var.f14589b;
        Objects.requireNonNull(pi2Var);
        int i = jo2.f15673a;
        float fMax = Math.max(0.1f, Math.min(f, 8.0f));
        pi2Var.f17987e = fMax;
        pi2 pi2Var2 = this.f15227b;
        Objects.requireNonNull(pi2Var2);
        pi2Var2.f17988f = Math.max(0.1f, Math.min(1.0f, 8.0f));
        gh2 gh2Var2 = new gh2(fMax, 1.0f);
        gh2 gh2Var3 = this.f15241p;
        if (gh2Var3 == null) {
            gh2Var3 = !this.f15233h.isEmpty() ? this.f15233h.getLast().f14592a : this.f15242q;
        }
        if (!gh2Var2.equals(gh2Var3)) {
            if (m7267l()) {
                this.f15241p = gh2Var2;
            } else {
                this.f15242q = gh2Var2;
            }
        }
        return this.f15242q;
    }

    /* JADX INFO: renamed from: f */
    public final void m7261f() {
        if (m7267l()) {
            this.f15206B = 0L;
            this.f15208D = 0L;
            gh2 gh2Var = this.f15241p;
            if (gh2Var != null) {
                this.f15242q = gh2Var;
                this.f15241p = null;
            } else if (!this.f15233h.isEmpty()) {
                this.f15242q = this.f15233h.getLast().f14592a;
            }
            this.f15233h.clear();
            this.f15243r = 0L;
            this.f15244s = 0L;
            this.f15216L = null;
            this.f15217M = null;
            int i = 0;
            while (true) {
                rh2[] rh2VarArr = this.f15214J;
                if (i >= rh2VarArr.length) {
                    break;
                }
                rh2 rh2Var = rh2VarArr[i];
                rh2Var.mo7509i();
                this.f15215K[i] = rh2Var.mo7506f();
                i++;
            }
            this.f15221Q = false;
            this.f15220P = -1;
            this.f15209E = 0;
            this.f15212H = 0L;
            this.f15247v = 0L;
            this.f15246u = 0;
            this.f15245t = 0;
            this.f15248w = 0L;
            this.f15249x = false;
            this.f15250y = 0L;
            if (this.f15234i.getPlayState() == 3) {
                this.f15234i.pause();
            }
            AudioTrack audioTrack = this.f15234i;
            this.f15234i = null;
            this.f15232g.mo6016a(null, false);
            this.f15230e.close();
            new ai2(this, audioTrack).start();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m7262g() {
        ArrayList arrayList = new ArrayList();
        rh2[] rh2VarArr = this.f15228c;
        for (int i = 0; i < 3; i++) {
            rh2 rh2Var = rh2VarArr[i];
            if (rh2Var.mo7501a()) {
                arrayList.add(rh2Var);
            } else {
                rh2Var.mo7509i();
            }
        }
        int size = arrayList.size();
        this.f15214J = (rh2[]) arrayList.toArray(new rh2[size]);
        this.f15215K = new ByteBuffer[size];
        for (int i2 = 0; i2 < size; i2++) {
            rh2 rh2Var2 = this.f15214J[i2];
            rh2Var2.mo7509i();
            this.f15215K[i2] = rh2Var2.mo7506f();
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m7263h(long j2) throws hi2 {
        ByteBuffer byteBuffer;
        int length = this.f15214J.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.f15215K[i - 1];
            } else {
                byteBuffer = this.f15216L;
                if (byteBuffer == null) {
                    byteBuffer = rh2.f18836a;
                }
            }
            if (i == length) {
                m7264i(byteBuffer, j2);
            } else {
                rh2 rh2Var = this.f15214J[i];
                rh2Var.mo7503c(byteBuffer);
                ByteBuffer byteBufferMo7506f = rh2Var.mo7506f();
                this.f15215K[i] = byteBufferMo7506f;
                if (byteBufferMo7506f.hasRemaining()) {
                    i++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i--;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m7264i(ByteBuffer byteBuffer, long j2) throws hi2 {
        int iWrite;
        if (!byteBuffer.hasRemaining()) {
            return true;
        }
        ByteBuffer byteBuffer2 = this.f15217M;
        if (byteBuffer2 != null) {
            C2622l.m5366f1(byteBuffer2 == byteBuffer);
        } else {
            this.f15217M = byteBuffer;
            if (jo2.f15673a < 21) {
                int iRemaining = byteBuffer.remaining();
                byte[] bArr = this.f15218N;
                if (bArr == null || bArr.length < iRemaining) {
                    this.f15218N = new byte[iRemaining];
                }
                int iPosition = byteBuffer.position();
                byteBuffer.get(this.f15218N, 0, iRemaining);
                byteBuffer.position(iPosition);
                this.f15219O = 0;
            }
        }
        int iRemaining2 = byteBuffer.remaining();
        if (jo2.f15673a < 21) {
            int iM6017b = this.f15239n - ((int) (this.f15208D - (this.f15232g.m6017b() * ((long) this.f15207C))));
            if (iM6017b > 0) {
                iWrite = this.f15234i.write(this.f15218N, this.f15219O, Math.min(iRemaining2, iM6017b));
                if (iWrite > 0) {
                    this.f15219O += iWrite;
                    byteBuffer.position(byteBuffer.position() + iWrite);
                }
            } else {
                iWrite = 0;
            }
        } else {
            iWrite = this.f15234i.write(byteBuffer, iRemaining2, 1);
        }
        this.f15225U = SystemClock.elapsedRealtime();
        if (iWrite < 0) {
            throw new hi2(iWrite);
        }
        this.f15208D += (long) iWrite;
        if (iWrite != iRemaining2) {
            return false;
        }
        this.f15217M = null;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001c  */
    /* JADX WARN: Code duplicated, block: B:14:0x0028 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:15:0x0029  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0029 -> B:5:0x0009). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: j */
    public final boolean m7265j() throws p007c.p190n.p194b.p266d.p314j.p315a.hi2 {
        /*
            r9 = this;
            int r0 = r9.f15220P
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto Lb
            r9.f15220P = r3
        L9:
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            int r4 = r9.f15220P
            c.n.b.d.j.a.rh2[] r5 = r9.f15214J
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L2f
            r4 = r5[r4]
            if (r0 == 0) goto L1f
            r4.mo7504d()
        L1f:
            r9.m7263h(r7)
            boolean r0 = r4.mo7507g()
            if (r0 != 0) goto L29
            return r3
        L29:
            int r0 = r9.f15220P
            int r0 = r0 + r2
            r9.f15220P = r0
            goto L9
        L2f:
            java.nio.ByteBuffer r0 = r9.f15217M
            if (r0 == 0) goto L3b
            r9.m7264i(r0, r7)
            java.nio.ByteBuffer r0 = r9.f15217M
            if (r0 == 0) goto L3b
            return r3
        L3b:
            r9.f15220P = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p007c.p190n.p194b.p266d.p314j.p315a.ii2.m7265j():boolean");
    }

    /* JADX INFO: renamed from: k */
    public final void m7266k() {
        if (m7267l()) {
            if (jo2.f15673a >= 21) {
                this.f15234i.setVolume(this.f15213I);
                return;
            }
            AudioTrack audioTrack = this.f15234i;
            float f = this.f15213I;
            audioTrack.setStereoVolume(f, f);
        }
    }

    /* JADX INFO: renamed from: l */
    public final boolean m7267l() {
        return this.f15234i != null;
    }

    /* JADX INFO: renamed from: m */
    public final long m7268m(long j2) {
        return (j2 * 1000000) / ((long) this.f15235j);
    }

    /* JADX INFO: renamed from: n */
    public final long m7269n(long j2) {
        return (j2 * ((long) this.f15235j)) / 1000000;
    }

    /* JADX INFO: renamed from: o */
    public final long m7270o() {
        return this.f15208D / ((long) this.f15207C);
    }

    /* JADX INFO: renamed from: p */
    public final boolean m7271p() {
        int i;
        return jo2.f15673a < 23 && ((i = this.f15238m) == 5 || i == 6);
    }
}
