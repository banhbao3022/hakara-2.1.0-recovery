package p007c.p190n.p194b.p209b.p243w1;

import java.io.IOException;
import java.util.Objects;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.FormatHolder;
import p007c.p190n.p194b.p209b.SeekParameters;
import p007c.p190n.p194b.p209b.p212b2.MimeTypes;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p217p1.DecoderInputBuffer;
import p007c.p190n.p194b.p209b.p262y1.ExoTrackSelection2;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.w1.o, reason: use source file name */
/* JADX INFO: compiled from: ClippingMediaPeriod.java */
/* JADX INFO: loaded from: classes.dex */
public final class ClippingMediaPeriod implements MediaPeriod, MediaPeriod.a {

    /* JADX INFO: renamed from: f */
    public final MediaPeriod f9027f;

    /* JADX INFO: renamed from: g */
    public MediaPeriod.a f9028g;

    /* JADX INFO: renamed from: h */
    public a[] f9029h = new a[0];

    /* JADX INFO: renamed from: i */
    public long f9030i;

    /* JADX INFO: renamed from: j */
    public long f9031j;

    /* JADX INFO: renamed from: k */
    public long f9032k;

    /* JADX INFO: renamed from: c.n.b.b.w1.o$a */
    /* JADX INFO: compiled from: ClippingMediaPeriod.java */
    public final class a implements SampleStream {

        /* JADX INFO: renamed from: f */
        public final SampleStream f9033f;

        /* JADX INFO: renamed from: g */
        public boolean f9034g;

        public a(SampleStream sampleStream) {
            this.f9033f = sampleStream;
        }

        @Override // p007c.p190n.p194b.p209b.p243w1.SampleStream
        /* JADX INFO: renamed from: a */
        public void mo4128a() throws IOException {
            this.f9033f.mo4128a();
        }

        @Override // p007c.p190n.p194b.p209b.p243w1.SampleStream
        /* JADX INFO: renamed from: c */
        public boolean mo4129c() {
            return !ClippingMediaPeriod.this.m4178a() && this.f9033f.mo4129c();
        }

        @Override // p007c.p190n.p194b.p209b.p243w1.SampleStream
        /* JADX INFO: renamed from: j */
        public int mo4130j(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, boolean z) {
            if (ClippingMediaPeriod.this.m4178a()) {
                return -3;
            }
            if (this.f9034g) {
                decoderInputBuffer.f7262f = 4;
                return -4;
            }
            int iMo4130j = this.f9033f.mo4130j(formatHolder, decoderInputBuffer, z);
            if (iMo4130j != -5) {
                ClippingMediaPeriod clippingMediaPeriod = ClippingMediaPeriod.this;
                long j2 = clippingMediaPeriod.f9032k;
                if (j2 == Long.MIN_VALUE || ((iMo4130j != -4 || decoderInputBuffer.f7289j < j2) && !(iMo4130j == -3 && clippingMediaPeriod.mo4072g() == Long.MIN_VALUE && !decoderInputBuffer.f7288i))) {
                    return iMo4130j;
                }
                decoderInputBuffer.mo3635x();
                decoderInputBuffer.f7262f = 4;
                this.f9034g = true;
                return -4;
            }
            Format format = formatHolder.f7259b;
            Objects.requireNonNull(format);
            int i = format.f6918G;
            if (i != 0 || format.f6919H != 0) {
                ClippingMediaPeriod clippingMediaPeriod2 = ClippingMediaPeriod.this;
                if (clippingMediaPeriod2.f9031j != 0) {
                    i = 0;
                }
                int i2 = clippingMediaPeriod2.f9032k == Long.MIN_VALUE ? format.f6919H : 0;
                Format.b bVarM3515a = format.m3515a();
                bVarM3515a.f6944A = i;
                bVarM3515a.f6945B = i2;
                formatHolder.f7259b = bVarM3515a.m3519a();
            }
            return -5;
        }

        @Override // p007c.p190n.p194b.p209b.p243w1.SampleStream
        /* JADX INFO: renamed from: o */
        public int mo4131o(long j2) {
            if (ClippingMediaPeriod.this.m4178a()) {
                return -3;
            }
            return this.f9033f.mo4131o(j2);
        }
    }

    public ClippingMediaPeriod(MediaPeriod mediaPeriod, boolean z, long j2, long j3) {
        this.f9027f = mediaPeriod;
        this.f9030i = z ? j2 : -9223372036854775807L;
        this.f9031j = j2;
        this.f9032k = j3;
    }

    /* JADX INFO: renamed from: a */
    public boolean m4178a() {
        return this.f9030i != -9223372036854775807L;
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaPeriod, p007c.p190n.p194b.p209b.p243w1.SequenceableLoader
    /* JADX INFO: renamed from: b */
    public long mo4068b() {
        long jMo4068b = this.f9027f.mo4068b();
        if (jMo4068b != Long.MIN_VALUE) {
            long j2 = this.f9032k;
            if (j2 == Long.MIN_VALUE || jMo4068b < j2) {
                return jMo4068b;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaPeriod, p007c.p190n.p194b.p209b.p243w1.SequenceableLoader
    /* JADX INFO: renamed from: d */
    public boolean mo4069d(long j2) {
        return this.f9027f.mo4069d(j2);
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaPeriod, p007c.p190n.p194b.p209b.p243w1.SequenceableLoader
    /* JADX INFO: renamed from: e */
    public boolean mo4070e() {
        return this.f9027f.mo4070e();
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaPeriod
    /* JADX INFO: renamed from: f */
    public long mo4071f(long j2, SeekParameters seekParameters) {
        long j3 = this.f9031j;
        if (j2 == j3) {
            return j3;
        }
        long jM3122j = Util6.m3122j(seekParameters.f6738c, 0L, j2 - j3);
        long j4 = seekParameters.f6739d;
        long j5 = this.f9032k;
        long jM3122j2 = Util6.m3122j(j4, 0L, j5 == Long.MIN_VALUE ? Long.MAX_VALUE : j5 - j2);
        if (jM3122j != seekParameters.f6738c || jM3122j2 != seekParameters.f6739d) {
            seekParameters = new SeekParameters(jM3122j, jM3122j2);
        }
        return this.f9027f.mo4071f(j2, seekParameters);
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaPeriod, p007c.p190n.p194b.p209b.p243w1.SequenceableLoader
    /* JADX INFO: renamed from: g */
    public long mo4072g() {
        long jMo4072g = this.f9027f.mo4072g();
        if (jMo4072g != Long.MIN_VALUE) {
            long j2 = this.f9032k;
            if (j2 == Long.MIN_VALUE || jMo4072g < j2) {
                return jMo4072g;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaPeriod, p007c.p190n.p194b.p209b.p243w1.SequenceableLoader
    /* JADX INFO: renamed from: h */
    public void mo4073h(long j2) {
        this.f9027f.mo4073h(j2);
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.SequenceableLoader.a
    /* JADX INFO: renamed from: i */
    public void mo3428i(SequenceableLoader sequenceableLoader) {
        MediaPeriod.a aVar = this.f9028g;
        Objects.requireNonNull(aVar);
        aVar.mo3428i(this);
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaPeriod.a
    /* JADX INFO: renamed from: j */
    public void mo3429j(MediaPeriod mediaPeriod) {
        MediaPeriod.a aVar = this.f9028g;
        Objects.requireNonNull(aVar);
        aVar.mo3429j(this);
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaPeriod
    /* JADX INFO: renamed from: m */
    public void mo4074m() throws IOException {
        this.f9027f.mo4074m();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0033  */
    @Override // p007c.p190n.p194b.p209b.p243w1.MediaPeriod
    /* JADX INFO: renamed from: n */
    public long mo4075n(long j2) {
        this.f9030i = -9223372036854775807L;
        boolean z = false;
        for (a aVar : this.f9029h) {
            if (aVar != null) {
                aVar.f9034g = false;
            }
        }
        long jMo4075n = this.f9027f.mo4075n(j2);
        if (jMo4075n == j2) {
            z = true;
        } else if (jMo4075n >= this.f9031j) {
            long j3 = this.f9032k;
            if (j3 == Long.MIN_VALUE || jMo4075n <= j3) {
                z = true;
            }
        }
        C2096e.m4570f(z);
        return jMo4075n;
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaPeriod
    /* JADX INFO: renamed from: p */
    public long mo4076p() {
        if (m4178a()) {
            long j2 = this.f9030i;
            this.f9030i = -9223372036854775807L;
            long jMo4076p = mo4076p();
            return jMo4076p != -9223372036854775807L ? jMo4076p : j2;
        }
        long jMo4076p2 = this.f9027f.mo4076p();
        if (jMo4076p2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z = true;
        C2096e.m4570f(jMo4076p2 >= this.f9031j);
        long j3 = this.f9032k;
        if (j3 != Long.MIN_VALUE && jMo4076p2 > j3) {
            z = false;
        }
        C2096e.m4570f(z);
        return jMo4076p2;
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaPeriod
    /* JADX INFO: renamed from: q */
    public void mo4077q(MediaPeriod.a aVar, long j2) {
        this.f9028g = aVar;
        this.f9027f.mo4077q(this, j2);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0088  */
    @Override // p007c.p190n.p194b.p209b.p243w1.MediaPeriod
    /* JADX INFO: renamed from: r */
    public long mo4078r(ExoTrackSelection2[] exoTrackSelection2Arr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j2) {
        long j3;
        boolean z;
        this.f9029h = new a[sampleStreamArr.length];
        SampleStream[] sampleStreamArr2 = new SampleStream[sampleStreamArr.length];
        int i = 0;
        while (true) {
            SampleStream sampleStream = null;
            if (i >= sampleStreamArr.length) {
                break;
            }
            a[] aVarArr = this.f9029h;
            aVarArr[i] = (a) sampleStreamArr[i];
            if (aVarArr[i] != null) {
                sampleStream = aVarArr[i].f9033f;
            }
            sampleStreamArr2[i] = sampleStream;
            i++;
        }
        long jMo4078r = this.f9027f.mo4078r(exoTrackSelection2Arr, zArr, sampleStreamArr2, zArr2, j2);
        boolean z2 = true;
        if (m4178a()) {
            long j4 = this.f9031j;
            if (j2 != j4) {
                j3 = -9223372036854775807L;
            } else {
                if (j4 == 0) {
                    z = false;
                    break;
                }
                int length = exoTrackSelection2Arr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        z = false;
                        break;
                    }
                    ExoTrackSelection2 exoTrackSelection2 = exoTrackSelection2Arr[i2];
                    if (exoTrackSelection2 != null) {
                        Format formatMo4520n = exoTrackSelection2.mo4520n();
                        if (!MimeTypes.m3159a(formatMo4520n.f6934q, formatMo4520n.f6931n)) {
                            z = true;
                            break;
                        }
                    }
                    i2++;
                }
                if (z) {
                    j3 = jMo4078r;
                } else {
                    j3 = -9223372036854775807L;
                }
            }
        } else {
            j3 = -9223372036854775807L;
        }
        this.f9030i = j3;
        if (jMo4078r != j2) {
            if (jMo4078r >= this.f9031j) {
                long j5 = this.f9032k;
                if (j5 != Long.MIN_VALUE && jMo4078r > j5) {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
        }
        C2096e.m4570f(z2);
        for (int i3 = 0; i3 < sampleStreamArr.length; i3++) {
            if (sampleStreamArr2[i3] == null) {
                this.f9029h[i3] = null;
            } else {
                a[] aVarArr2 = this.f9029h;
                if (aVarArr2[i3] == null || aVarArr2[i3].f9033f != sampleStreamArr2[i3]) {
                    aVarArr2[i3] = new a(sampleStreamArr2[i3]);
                }
            }
            sampleStreamArr[i3] = this.f9029h[i3];
        }
        return jMo4078r;
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaPeriod
    /* JADX INFO: renamed from: s */
    public TrackGroupArray mo4079s() {
        return this.f9027f.mo4079s();
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaPeriod
    /* JADX INFO: renamed from: u */
    public void mo4080u(long j2, boolean z) {
        this.f9027f.mo4080u(j2, z);
    }
}
