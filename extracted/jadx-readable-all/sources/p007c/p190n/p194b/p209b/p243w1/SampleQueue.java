package p007c.p190n.p194b.p209b.p243w1;

import android.media.MediaCodec;
import android.os.Looper;
import android.util.Log;
import com.facebook.stetho.websocket.CloseCodes;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.FormatHolder;
import p007c.p190n.p194b.p209b.p210a2.Allocator;
import p007c.p190n.p194b.p209b.p210a2.DataReader;
import p007c.p190n.p194b.p209b.p210a2.DefaultAllocator;
import p007c.p190n.p194b.p209b.p212b2.MimeTypes;
import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p217p1.CryptoInfo;
import p007c.p190n.p194b.p209b.p217p1.DecoderInputBuffer;
import p007c.p190n.p194b.p209b.p218q1.DrmInitData;
import p007c.p190n.p194b.p209b.p218q1.DrmSession;
import p007c.p190n.p194b.p209b.p218q1.DrmSessionEventListener2;
import p007c.p190n.p194b.p209b.p218q1.DrmSessionManager2;
import p007c.p190n.p194b.p209b.p221s1.TrackOutput;
import p007c.p190n.p194b.p209b.p221s1.TrackOutput2;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.w1.l0, reason: use source file name */
/* JADX INFO: compiled from: SampleQueue.java */
/* JADX INFO: loaded from: classes.dex */
public class SampleQueue implements TrackOutput2 {

    /* JADX INFO: renamed from: A */
    public boolean f8986A;

    /* JADX INFO: renamed from: B */
    public Format f8987B;

    /* JADX INFO: renamed from: C */
    public Format f8988C;

    /* JADX INFO: renamed from: D */
    public Format f8989D;

    /* JADX INFO: renamed from: E */
    public int f8990E;

    /* JADX INFO: renamed from: F */
    public boolean f8991F;

    /* JADX INFO: renamed from: G */
    public boolean f8992G;

    /* JADX INFO: renamed from: H */
    public long f8993H;

    /* JADX INFO: renamed from: I */
    public boolean f8994I;

    /* JADX INFO: renamed from: a */
    public final SampleDataQueue f8995a;

    /* JADX INFO: renamed from: c */
    public final DrmSessionManager2 f8997c;

    /* JADX INFO: renamed from: d */
    public final DrmSessionEventListener2.a f8998d;

    /* JADX INFO: renamed from: e */
    public final Looper f8999e;

    /* JADX INFO: renamed from: f */
    public b f9000f;

    /* JADX INFO: renamed from: g */
    public Format f9001g;

    /* JADX INFO: renamed from: h */
    public DrmSession f9002h;

    /* JADX INFO: renamed from: q */
    public int f9011q;

    /* JADX INFO: renamed from: r */
    public int f9012r;

    /* JADX INFO: renamed from: s */
    public int f9013s;

    /* JADX INFO: renamed from: t */
    public int f9014t;

    /* JADX INFO: renamed from: x */
    public boolean f9018x;

    /* JADX INFO: renamed from: b */
    public final a f8996b = new a();

    /* JADX INFO: renamed from: i */
    public int f9003i = CloseCodes.NORMAL_CLOSURE;

    /* JADX INFO: renamed from: j */
    public int[] f9004j = new int[CloseCodes.NORMAL_CLOSURE];

    /* JADX INFO: renamed from: k */
    public long[] f9005k = new long[CloseCodes.NORMAL_CLOSURE];

    /* JADX INFO: renamed from: n */
    public long[] f9008n = new long[CloseCodes.NORMAL_CLOSURE];

    /* JADX INFO: renamed from: m */
    public int[] f9007m = new int[CloseCodes.NORMAL_CLOSURE];

    /* JADX INFO: renamed from: l */
    public int[] f9006l = new int[CloseCodes.NORMAL_CLOSURE];

    /* JADX INFO: renamed from: o */
    public TrackOutput2.a[] f9009o = new TrackOutput2.a[CloseCodes.NORMAL_CLOSURE];

    /* JADX INFO: renamed from: p */
    public Format[] f9010p = new Format[CloseCodes.NORMAL_CLOSURE];

    /* JADX INFO: renamed from: u */
    public long f9015u = Long.MIN_VALUE;

    /* JADX INFO: renamed from: v */
    public long f9016v = Long.MIN_VALUE;

    /* JADX INFO: renamed from: w */
    public long f9017w = Long.MIN_VALUE;

    /* JADX INFO: renamed from: z */
    public boolean f9020z = true;

    /* JADX INFO: renamed from: y */
    public boolean f9019y = true;

    /* JADX INFO: renamed from: c.n.b.b.w1.l0$a */
    /* JADX INFO: compiled from: SampleQueue.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public int f9021a;

        /* JADX INFO: renamed from: b */
        public long f9022b;

        /* JADX INFO: renamed from: c */
        public TrackOutput2.a f9023c;
    }

    /* JADX INFO: renamed from: c.n.b.b.w1.l0$b */
    /* JADX INFO: compiled from: SampleQueue.java */
    public interface b {
        /* JADX INFO: renamed from: c */
        void mo4121c(Format format);
    }

    public SampleQueue(Allocator allocator, Looper looper, DrmSessionManager2 drmSessionManager2, DrmSessionEventListener2.a aVar) {
        this.f8999e = looper;
        this.f8997c = drmSessionManager2;
        this.f8998d = aVar;
        this.f8995a = new SampleDataQueue(allocator);
    }

    /* JADX INFO: renamed from: A */
    public void m4148A() {
        m4158i();
        DrmSession drmSession = this.f9002h;
        if (drmSession != null) {
            drmSession.mo3646b(this.f8998d);
            this.f9002h = null;
            this.f9001g = null;
        }
    }

    /* JADX INFO: renamed from: B */
    public int m4149B(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, boolean z, boolean z2) {
        int i;
        int i2;
        SampleDataQueue.a aVarM4136e;
        int iM3219x;
        SampleDataQueue.a aVar;
        a aVar2 = this.f8996b;
        synchronized (this) {
            decoderInputBuffer.f7288i = false;
            i2 = -5;
            if (m4170u()) {
                int iM4166q = m4166q(this.f9014t);
                if (z || this.f9010p[iM4166q] != this.f9001g) {
                    m4174y(this.f9010p[iM4166q], formatHolder);
                } else if (m4172w(iM4166q)) {
                    decoderInputBuffer.f7262f = this.f9007m[iM4166q];
                    long j2 = this.f9008n[iM4166q];
                    decoderInputBuffer.f7289j = j2;
                    if (j2 < this.f9015u) {
                        decoderInputBuffer.m3624m(Integer.MIN_VALUE);
                    }
                    aVar2.f9021a = this.f9006l[iM4166q];
                    aVar2.f9022b = this.f9005k[iM4166q];
                    aVar2.f9023c = this.f9009o[iM4166q];
                    i2 = -4;
                } else {
                    decoderInputBuffer.f7288i = true;
                    i2 = -3;
                }
            } else if (z2 || this.f9018x) {
                decoderInputBuffer.f7262f = 4;
                i2 = -4;
            } else {
                Format format = this.f8988C;
                if (format == null || (!z && format == this.f9001g)) {
                    i2 = -3;
                } else {
                    m4174y(format, formatHolder);
                }
            }
        }
        if (i2 == -4 && !decoderInputBuffer.m3628v()) {
            if (!(decoderInputBuffer.f7287h == null && decoderInputBuffer.f7291l == 0)) {
                SampleDataQueue sampleDataQueue = this.f8995a;
                a aVar3 = this.f8996b;
                SampleDataQueue.a aVar4 = sampleDataQueue.f8972e;
                ParsableByteArray parsableByteArray = sampleDataQueue.f8970c;
                if (decoderInputBuffer.m3634B()) {
                    long j3 = aVar3.f9022b;
                    parsableByteArray.m3221z(1);
                    SampleDataQueue.a aVarM4137f = SampleDataQueue.m4137f(aVar4, j3, parsableByteArray.f6392a, 1);
                    long j4 = j3 + 1;
                    byte b2 = parsableByteArray.f6392a[0];
                    boolean z3 = (b2 & 128) != 0;
                    int i3 = b2 & 127;
                    CryptoInfo cryptoInfo = decoderInputBuffer.f7286g;
                    byte[] bArr = cryptoInfo.f7263a;
                    if (bArr == null) {
                        cryptoInfo.f7263a = new byte[16];
                    } else {
                        Arrays.fill(bArr, (byte) 0);
                    }
                    SampleDataQueue.a aVarM4137f2 = SampleDataQueue.m4137f(aVarM4137f, j4, cryptoInfo.f7263a, i3);
                    long j5 = j4 + ((long) i3);
                    if (z3) {
                        parsableByteArray.m3221z(2);
                        aVarM4137f2 = SampleDataQueue.m4137f(aVarM4137f2, j5, parsableByteArray.f6392a, 2);
                        j5 += 2;
                        iM3219x = parsableByteArray.m3219x();
                    } else {
                        iM3219x = 1;
                    }
                    int[] iArr = cryptoInfo.f7266d;
                    if (iArr == null || iArr.length < iM3219x) {
                        iArr = new int[iM3219x];
                    }
                    int[] iArr2 = cryptoInfo.f7267e;
                    if (iArr2 == null || iArr2.length < iM3219x) {
                        iArr2 = new int[iM3219x];
                    }
                    if (z3) {
                        int i4 = iM3219x * 6;
                        parsableByteArray.m3221z(i4);
                        SampleDataQueue.a aVarM4137f3 = SampleDataQueue.m4137f(aVarM4137f2, j5, parsableByteArray.f6392a, i4);
                        j5 += (long) i4;
                        parsableByteArray.m3194D(0);
                        for (i = 0; i < iM3219x; i++) {
                            iArr[i] = parsableByteArray.m3219x();
                            iArr2[i] = parsableByteArray.m3217v();
                        }
                        aVar = aVarM4137f3;
                    } else {
                        iArr[0] = 0;
                        iArr2[0] = aVar3.f9021a - ((int) (j5 - aVar3.f9022b));
                        aVar = aVarM4137f2;
                    }
                    TrackOutput2.a aVar5 = aVar3.f9023c;
                    int i5 = Util6.f6307a;
                    byte[] bArr2 = aVar5.f8528b;
                    byte[] bArr3 = cryptoInfo.f7263a;
                    SampleDataQueue.a aVar6 = aVar;
                    int i6 = aVar5.f8527a;
                    int i7 = aVar5.f8529c;
                    int i8 = aVar5.f8530d;
                    cryptoInfo.f7268f = iM3219x;
                    cryptoInfo.f7266d = iArr;
                    cryptoInfo.f7267e = iArr2;
                    cryptoInfo.f7264b = bArr2;
                    cryptoInfo.f7263a = bArr3;
                    cryptoInfo.f7265c = i6;
                    cryptoInfo.f7269g = i7;
                    cryptoInfo.f7270h = i8;
                    MediaCodec.CryptoInfo cryptoInfo2 = cryptoInfo.f7271i;
                    cryptoInfo2.numSubSamples = iM3219x;
                    cryptoInfo2.numBytesOfClearData = iArr;
                    cryptoInfo2.numBytesOfEncryptedData = iArr2;
                    cryptoInfo2.key = bArr2;
                    cryptoInfo2.iv = bArr3;
                    cryptoInfo2.mode = i6;
                    if (Util6.f6307a >= 24) {
                        CryptoInfo.b bVar = cryptoInfo.f7272j;
                        Objects.requireNonNull(bVar);
                        bVar.f7274b.set(i7, i8);
                        bVar.f7273a.setPattern(bVar.f7274b);
                    }
                    long j6 = aVar3.f9022b;
                    int i9 = (int) (j5 - j6);
                    aVar3.f9022b = j6 + ((long) i9);
                    aVar3.f9021a -= i9;
                    aVar4 = aVar6;
                }
                if (decoderInputBuffer.m3626s()) {
                    parsableByteArray.m3221z(4);
                    SampleDataQueue.a aVarM4137f4 = SampleDataQueue.m4137f(aVar4, aVar3.f9022b, parsableByteArray.f6392a, 4);
                    int iM3217v = parsableByteArray.m3217v();
                    aVar3.f9022b += 4;
                    aVar3.f9021a -= 4;
                    decoderInputBuffer.m3637z(iM3217v);
                    SampleDataQueue.a aVarM4136e2 = SampleDataQueue.m4136e(aVarM4137f4, aVar3.f9022b, decoderInputBuffer.f7287h, iM3217v);
                    aVar3.f9022b += (long) iM3217v;
                    int i10 = aVar3.f9021a - iM3217v;
                    aVar3.f9021a = i10;
                    ByteBuffer byteBuffer = decoderInputBuffer.f7290k;
                    if (byteBuffer == null || byteBuffer.capacity() < i10) {
                        decoderInputBuffer.f7290k = ByteBuffer.allocate(i10);
                    } else {
                        decoderInputBuffer.f7290k.clear();
                    }
                    aVarM4136e = SampleDataQueue.m4136e(aVarM4136e2, aVar3.f9022b, decoderInputBuffer.f7290k, aVar3.f9021a);
                } else {
                    decoderInputBuffer.m3637z(aVar3.f9021a);
                    aVarM4136e = SampleDataQueue.m4136e(aVar4, aVar3.f9022b, decoderInputBuffer.f7287h, aVar3.f9021a);
                }
                sampleDataQueue.f8972e = aVarM4136e;
                this.f9014t++;
                return i2;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: C */
    public void m4150C() {
        m4151D(true);
        DrmSession drmSession = this.f9002h;
        if (drmSession != null) {
            drmSession.mo3646b(this.f8998d);
            this.f9002h = null;
            this.f9001g = null;
        }
    }

    /* JADX INFO: renamed from: D */
    public void m4151D(boolean z) {
        SampleDataQueue sampleDataQueue = this.f8995a;
        sampleDataQueue.m4138a(sampleDataQueue.f8971d);
        SampleDataQueue.a aVar = new SampleDataQueue.a(0L, sampleDataQueue.f8969b);
        sampleDataQueue.f8971d = aVar;
        sampleDataQueue.f8972e = aVar;
        sampleDataQueue.f8973f = aVar;
        sampleDataQueue.f8974g = 0L;
        ((DefaultAllocator) sampleDataQueue.f8968a).m3008c();
        this.f9011q = 0;
        this.f9012r = 0;
        this.f9013s = 0;
        this.f9014t = 0;
        this.f9019y = true;
        this.f9015u = Long.MIN_VALUE;
        this.f9016v = Long.MIN_VALUE;
        this.f9017w = Long.MIN_VALUE;
        this.f9018x = false;
        this.f8989D = null;
        if (z) {
            this.f8987B = null;
            this.f8988C = null;
            this.f9020z = true;
        }
    }

    /* JADX INFO: renamed from: E */
    public final synchronized void m4152E() {
        this.f9014t = 0;
        SampleDataQueue sampleDataQueue = this.f8995a;
        sampleDataQueue.f8972e = sampleDataQueue.f8971d;
    }

    /* JADX INFO: renamed from: F */
    public final synchronized boolean m4153F(long j2, boolean z) {
        m4152E();
        int iM4166q = m4166q(this.f9014t);
        if (m4170u() && j2 >= this.f9008n[iM4166q] && (j2 <= this.f9017w || z)) {
            int iM4161l = m4161l(iM4166q, this.f9011q - this.f9014t, j2, true);
            if (iM4161l == -1) {
                return false;
            }
            this.f9015u = j2;
            this.f9014t += iM4161l;
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: G */
    public final void m4154G(long j2) {
        if (this.f8993H != j2) {
            this.f8993H = j2;
            this.f8986A = true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x000e  */
    /* JADX INFO: renamed from: H */
    public final synchronized void m4155H(int i) {
        boolean z;
        if (i >= 0) {
            try {
                if (this.f9014t + i <= this.f9011q) {
                    z = true;
                } else {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        } else {
            z = false;
        }
        C2096e.m4566b(z);
        this.f9014t += i;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.TrackOutput2
    /* JADX INFO: renamed from: a */
    public final int mo3756a(DataReader dataReader, int i, boolean z, int i2) throws IOException {
        SampleDataQueue sampleDataQueue = this.f8995a;
        int iM4141d = sampleDataQueue.m4141d(i);
        SampleDataQueue.a aVar = sampleDataQueue.f8973f;
        int i3 = dataReader.read(aVar.f8978d.f5976a, aVar.m4142a(sampleDataQueue.f8974g), iM4141d);
        if (i3 != -1) {
            sampleDataQueue.m4140c(i3);
            return i3;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.TrackOutput2
    /* JADX INFO: renamed from: b */
    public /* synthetic */ int mo3757b(DataReader dataReader, int i, boolean z) {
        return TrackOutput.m3926a(this, dataReader, i, z);
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.TrackOutput2
    /* JADX INFO: renamed from: c */
    public /* synthetic */ void mo3758c(ParsableByteArray parsableByteArray, int i) {
        TrackOutput.m3927b(this, parsableByteArray, i);
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.TrackOutput2
    /* JADX INFO: renamed from: d */
    public void mo3759d(long j2, int i, int i2, int i3, TrackOutput2.a aVar) {
        boolean z;
        if (this.f8986A) {
            Format format = this.f8987B;
            C2096e.m4572h(format);
            mo3760e(format);
        }
        int i4 = i & 1;
        boolean z2 = i4 != 0;
        if (this.f9019y) {
            if (!z2) {
                return;
            } else {
                this.f9019y = false;
            }
        }
        long j3 = j2 + this.f8993H;
        if (this.f8991F) {
            if (j3 < this.f9015u) {
                return;
            }
            if (i4 == 0) {
                if (!this.f8992G) {
                    StringBuilder sbM1556G = outline.m1556G("Overriding unexpected non-sync sample for format: ");
                    sbM1556G.append(this.f8988C);
                    Log.w("SampleQueue", sbM1556G.toString());
                    this.f8992G = true;
                }
                i |= 1;
            }
        }
        if (this.f8994I) {
            if (!z2) {
                return;
            }
            synchronized (this) {
                if (this.f9011q == 0) {
                    z = j3 > this.f9016v;
                } else {
                    synchronized (this) {
                        long jMax = Math.max(this.f9016v, m4164o(this.f9014t));
                        if (jMax >= j3) {
                            z = false;
                        } else {
                            int i5 = this.f9011q;
                            int iM4166q = m4166q(i5 - 1);
                            while (i5 > this.f9014t && this.f9008n[iM4166q] >= j3) {
                                i5--;
                                iM4166q--;
                                if (iM4166q == -1) {
                                    iM4166q = this.f9003i - 1;
                                }
                            }
                            m4159j(this.f9012r + i5);
                            z = true;
                        }
                    }
                }
            }
            if (!z) {
                return;
            } else {
                this.f8994I = false;
            }
        }
        long j4 = (this.f8995a.f8974g - ((long) i2)) - ((long) i3);
        synchronized (this) {
            int i6 = this.f9011q;
            if (i6 > 0) {
                int iM4166q2 = m4166q(i6 - 1);
                C2096e.m4566b(this.f9005k[iM4166q2] + ((long) this.f9006l[iM4166q2]) <= j4);
            }
            this.f9018x = (536870912 & i) != 0;
            this.f9017w = Math.max(this.f9017w, j3);
            int iM4166q3 = m4166q(this.f9011q);
            this.f9008n[iM4166q3] = j3;
            long[] jArr = this.f9005k;
            jArr[iM4166q3] = j4;
            this.f9006l[iM4166q3] = i2;
            this.f9007m[iM4166q3] = i;
            this.f9009o[iM4166q3] = aVar;
            Format[] formatArr = this.f9010p;
            Format format2 = this.f8988C;
            formatArr[iM4166q3] = format2;
            this.f9004j[iM4166q3] = this.f8990E;
            this.f8989D = format2;
            int i7 = this.f9011q + 1;
            this.f9011q = i7;
            int i8 = this.f9003i;
            if (i7 == i8) {
                int i9 = i8 + CloseCodes.NORMAL_CLOSURE;
                int[] iArr = new int[i9];
                long[] jArr2 = new long[i9];
                long[] jArr3 = new long[i9];
                int[] iArr2 = new int[i9];
                int[] iArr3 = new int[i9];
                TrackOutput2.a[] aVarArr = new TrackOutput2.a[i9];
                Format[] formatArr2 = new Format[i9];
                int i10 = this.f9013s;
                int i11 = i8 - i10;
                System.arraycopy(jArr, i10, jArr2, 0, i11);
                System.arraycopy(this.f9008n, this.f9013s, jArr3, 0, i11);
                System.arraycopy(this.f9007m, this.f9013s, iArr2, 0, i11);
                System.arraycopy(this.f9006l, this.f9013s, iArr3, 0, i11);
                System.arraycopy(this.f9009o, this.f9013s, aVarArr, 0, i11);
                System.arraycopy(this.f9010p, this.f9013s, formatArr2, 0, i11);
                System.arraycopy(this.f9004j, this.f9013s, iArr, 0, i11);
                int i12 = this.f9013s;
                System.arraycopy(this.f9005k, 0, jArr2, i11, i12);
                System.arraycopy(this.f9008n, 0, jArr3, i11, i12);
                System.arraycopy(this.f9007m, 0, iArr2, i11, i12);
                System.arraycopy(this.f9006l, 0, iArr3, i11, i12);
                System.arraycopy(this.f9009o, 0, aVarArr, i11, i12);
                System.arraycopy(this.f9010p, 0, formatArr2, i11, i12);
                System.arraycopy(this.f9004j, 0, iArr, i11, i12);
                this.f9005k = jArr2;
                this.f9008n = jArr3;
                this.f9007m = iArr2;
                this.f9006l = iArr3;
                this.f9009o = aVarArr;
                this.f9010p = formatArr2;
                this.f9004j = iArr;
                this.f9013s = 0;
                this.f9003i = i9;
            }
        }
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.TrackOutput2
    /* JADX INFO: renamed from: e */
    public final void mo3760e(Format format) {
        Format formatMo4162m = mo4162m(format);
        boolean z = false;
        this.f8986A = false;
        this.f8987B = format;
        synchronized (this) {
            this.f9020z = false;
            if (!Util6.m3113a(formatMo4162m, this.f8988C)) {
                if (Util6.m3113a(formatMo4162m, this.f8989D)) {
                    this.f8988C = this.f8989D;
                } else {
                    this.f8988C = formatMo4162m;
                }
                Format format2 = this.f8988C;
                this.f8991F = MimeTypes.m3159a(format2.f6934q, format2.f6931n);
                this.f8992G = false;
                z = true;
            }
        }
        b bVar = this.f9000f;
        if (bVar == null || !z) {
            return;
        }
        bVar.mo4121c(formatMo4162m);
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.TrackOutput2
    /* JADX INFO: renamed from: f */
    public final void mo3761f(ParsableByteArray parsableByteArray, int i, int i2) {
        SampleDataQueue sampleDataQueue = this.f8995a;
        Objects.requireNonNull(sampleDataQueue);
        while (i > 0) {
            int iM4141d = sampleDataQueue.m4141d(i);
            SampleDataQueue.a aVar = sampleDataQueue.f8973f;
            parsableByteArray.m3200e(aVar.f8978d.f5976a, aVar.m4142a(sampleDataQueue.f8974g), iM4141d);
            i -= iM4141d;
            sampleDataQueue.m4140c(iM4141d);
        }
    }

    /* JADX INFO: renamed from: g */
    public final long m4156g(int i) {
        this.f9016v = Math.max(this.f9016v, m4164o(i));
        int i2 = this.f9011q - i;
        this.f9011q = i2;
        this.f9012r += i;
        int i3 = this.f9013s + i;
        this.f9013s = i3;
        int i4 = this.f9003i;
        if (i3 >= i4) {
            this.f9013s = i3 - i4;
        }
        int i5 = this.f9014t - i;
        this.f9014t = i5;
        if (i5 < 0) {
            this.f9014t = 0;
        }
        if (i2 != 0) {
            return this.f9005k[this.f9013s];
        }
        int i6 = this.f9013s;
        if (i6 != 0) {
            i4 = i6;
        }
        int i7 = i4 - 1;
        return this.f9005k[i7] + ((long) this.f9006l[i7]);
    }

    /* JADX INFO: renamed from: h */
    public final void m4157h(long j2, boolean z, boolean z2) {
        long jM4156g;
        int i;
        SampleDataQueue sampleDataQueue = this.f8995a;
        synchronized (this) {
            int i2 = this.f9011q;
            jM4156g = -1;
            if (i2 != 0) {
                long[] jArr = this.f9008n;
                int i3 = this.f9013s;
                if (j2 >= jArr[i3]) {
                    if (z2 && (i = this.f9014t) != i2) {
                        i2 = i + 1;
                    }
                    int iM4161l = m4161l(i3, i2, j2, z);
                    if (iM4161l != -1) {
                        jM4156g = m4156g(iM4161l);
                    }
                }
            }
        }
        sampleDataQueue.m4139b(jM4156g);
    }

    /* JADX INFO: renamed from: i */
    public final void m4158i() {
        long jM4156g;
        SampleDataQueue sampleDataQueue = this.f8995a;
        synchronized (this) {
            int i = this.f9011q;
            jM4156g = i == 0 ? -1L : m4156g(i);
        }
        sampleDataQueue.m4139b(jM4156g);
    }

    /* JADX INFO: renamed from: j */
    public final long m4159j(int i) {
        int iM4169t = m4169t() - i;
        boolean z = false;
        C2096e.m4566b(iM4169t >= 0 && iM4169t <= this.f9011q - this.f9014t);
        int i2 = this.f9011q - iM4169t;
        this.f9011q = i2;
        this.f9017w = Math.max(this.f9016v, m4164o(i2));
        if (iM4169t == 0 && this.f9018x) {
            z = true;
        }
        this.f9018x = z;
        int i3 = this.f9011q;
        if (i3 == 0) {
            return 0L;
        }
        int iM4166q = m4166q(i3 - 1);
        return this.f9005k[iM4166q] + ((long) this.f9006l[iM4166q]);
    }

    /* JADX INFO: renamed from: k */
    public final void m4160k(int i) {
        SampleDataQueue sampleDataQueue = this.f8995a;
        long jM4159j = m4159j(i);
        sampleDataQueue.f8974g = jM4159j;
        if (jM4159j != 0) {
            SampleDataQueue.a aVar = sampleDataQueue.f8971d;
            if (jM4159j != aVar.f8975a) {
                while (sampleDataQueue.f8974g > aVar.f8976b) {
                    aVar = aVar.f8979e;
                }
                SampleDataQueue.a aVar2 = aVar.f8979e;
                sampleDataQueue.m4138a(aVar2);
                SampleDataQueue.a aVar3 = new SampleDataQueue.a(aVar.f8976b, sampleDataQueue.f8969b);
                aVar.f8979e = aVar3;
                if (sampleDataQueue.f8974g == aVar.f8976b) {
                    aVar = aVar3;
                }
                sampleDataQueue.f8973f = aVar;
                if (sampleDataQueue.f8972e == aVar2) {
                    sampleDataQueue.f8972e = aVar3;
                    return;
                }
                return;
            }
        }
        sampleDataQueue.m4138a(sampleDataQueue.f8971d);
        SampleDataQueue.a aVar4 = new SampleDataQueue.a(sampleDataQueue.f8974g, sampleDataQueue.f8969b);
        sampleDataQueue.f8971d = aVar4;
        sampleDataQueue.f8972e = aVar4;
        sampleDataQueue.f8973f = aVar4;
    }

    /* JADX INFO: renamed from: l */
    public final int m4161l(int i, int i2, long j2, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long[] jArr = this.f9008n;
            if (jArr[i] > j2) {
                return i3;
            }
            if (!z || (this.f9007m[i] & 1) != 0) {
                if (jArr[i] == j2) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.f9003i) {
                i = 0;
            }
        }
        return i3;
    }

    /* JADX INFO: renamed from: m */
    public Format mo4162m(Format format) {
        if (this.f8993H == 0 || format.f6938u == Long.MAX_VALUE) {
            return format;
        }
        Format.b bVarM3515a = format.m3515a();
        bVarM3515a.f6962o = format.f6938u + this.f8993H;
        return bVarM3515a.m3519a();
    }

    /* JADX INFO: renamed from: n */
    public final synchronized long m4163n() {
        return this.f9017w;
    }

    /* JADX INFO: renamed from: o */
    public final long m4164o(int i) {
        long jMax = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int iM4166q = m4166q(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            jMax = Math.max(jMax, this.f9008n[iM4166q]);
            if ((this.f9007m[iM4166q] & 1) != 0) {
                break;
            }
            iM4166q--;
            if (iM4166q == -1) {
                iM4166q = this.f9003i - 1;
            }
        }
        return jMax;
    }

    /* JADX INFO: renamed from: p */
    public final int m4165p() {
        return this.f9012r + this.f9014t;
    }

    /* JADX INFO: renamed from: q */
    public final int m4166q(int i) {
        int i2 = this.f9013s + i;
        int i3 = this.f9003i;
        return i2 < i3 ? i2 : i2 - i3;
    }

    /* JADX INFO: renamed from: r */
    public final synchronized int m4167r(long j2, boolean z) {
        int iM4166q = m4166q(this.f9014t);
        if (m4170u() && j2 >= this.f9008n[iM4166q]) {
            if (j2 > this.f9017w && z) {
                return this.f9011q - this.f9014t;
            }
            int iM4161l = m4161l(iM4166q, this.f9011q - this.f9014t, j2, true);
            if (iM4161l == -1) {
                return 0;
            }
            return iM4161l;
        }
        return 0;
    }

    /* JADX INFO: renamed from: s */
    public final synchronized Format m4168s() {
        return this.f9020z ? null : this.f8988C;
    }

    /* JADX INFO: renamed from: t */
    public final int m4169t() {
        return this.f9012r + this.f9011q;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m4170u() {
        return this.f9014t != this.f9011q;
    }

    /* JADX INFO: renamed from: v */
    public synchronized boolean m4171v(boolean z) {
        Format format;
        boolean z2 = true;
        if (m4170u()) {
            int iM4166q = m4166q(this.f9014t);
            if (this.f9010p[iM4166q] != this.f9001g) {
                return true;
            }
            return m4172w(iM4166q);
        }
        if (!z && !this.f9018x && ((format = this.f8988C) == null || format == this.f9001g)) {
            z2 = false;
        }
        return z2;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m4172w(int i) {
        DrmSession drmSession = this.f9002h;
        return drmSession == null || drmSession.getState() == 4 || ((this.f9007m[i] & 1073741824) == 0 && this.f9002h.mo3648d());
    }

    /* JADX INFO: renamed from: x */
    public void m4173x() throws IOException {
        DrmSession drmSession = this.f9002h;
        if (drmSession == null || drmSession.getState() != 1) {
            return;
        }
        DrmSession.a aVarMo3650f = this.f9002h.mo3650f();
        Objects.requireNonNull(aVarMo3650f);
        throw aVarMo3650f;
    }

    /* JADX INFO: renamed from: y */
    public final void m4174y(Format format, FormatHolder formatHolder) {
        Format format2 = this.f9001g;
        boolean z = format2 == null;
        DrmInitData drmInitData = z ? null : format2.f6937t;
        this.f9001g = format;
        DrmInitData drmInitData2 = format.f6937t;
        DrmSessionManager2 drmSessionManager2 = this.f8997c;
        formatHolder.f7259b = drmSessionManager2 != null ? format.m3516b(drmSessionManager2.mo3680b(format)) : format;
        formatHolder.f7258a = this.f9002h;
        if (this.f8997c == null) {
            return;
        }
        if (z || !Util6.m3113a(drmInitData, drmInitData2)) {
            DrmSession drmSession = this.f9002h;
            DrmSessionManager2 drmSessionManager3 = this.f8997c;
            Looper looper = this.f8999e;
            Objects.requireNonNull(looper);
            DrmSession drmSessionMo3679a = drmSessionManager3.mo3679a(looper, this.f8998d, format);
            this.f9002h = drmSessionMo3679a;
            formatHolder.f7258a = drmSessionMo3679a;
            if (drmSession != null) {
                drmSession.mo3646b(this.f8998d);
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public final synchronized int m4175z() {
        return m4170u() ? this.f9004j[m4166q(this.f9014t)] : this.f8990E;
    }
}
