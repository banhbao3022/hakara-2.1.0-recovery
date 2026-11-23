package p007c.p190n.p194b.p209b.p221s1.p231n0;

import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;
import p007c.p190n.p194b.p209b.p215n1.MpegAudioUtil;
import p007c.p190n.p194b.p209b.p221s1.ExtractorOutput;
import p007c.p190n.p194b.p209b.p221s1.TrackOutput2;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.s1.n0.v, reason: use source file name */
/* JADX INFO: compiled from: MpegAudioReader.java */
/* JADX INFO: loaded from: classes.dex */
public final class MpegAudioReader implements ElementaryStreamReader {

    /* JADX INFO: renamed from: a */
    public final ParsableByteArray f8419a;

    /* JADX INFO: renamed from: b */
    public final MpegAudioUtil.a f8420b;

    /* JADX INFO: renamed from: c */
    public final String f8421c;

    /* JADX INFO: renamed from: d */
    public TrackOutput2 f8422d;

    /* JADX INFO: renamed from: e */
    public String f8423e;

    /* JADX INFO: renamed from: f */
    public int f8424f;

    /* JADX INFO: renamed from: g */
    public int f8425g;

    /* JADX INFO: renamed from: h */
    public boolean f8426h;

    /* JADX INFO: renamed from: i */
    public boolean f8427i;

    /* JADX INFO: renamed from: j */
    public long f8428j;

    /* JADX INFO: renamed from: k */
    public int f8429k;

    /* JADX INFO: renamed from: l */
    public long f8430l;

    public MpegAudioReader() {
        this(null);
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p231n0.ElementaryStreamReader
    /* JADX INFO: renamed from: b */
    public void mo3870b(ParsableByteArray parsableByteArray) {
        C2096e.m4572h(this.f8422d);
        while (parsableByteArray.m3196a() > 0) {
            int i = this.f8424f;
            if (i == 0) {
                byte[] bArr = parsableByteArray.f6392a;
                int i2 = parsableByteArray.f6393b;
                int i3 = parsableByteArray.f6394c;
                while (true) {
                    if (i2 >= i3) {
                        parsableByteArray.m3194D(i3);
                        break;
                    }
                    boolean z = (bArr[i2] & 255) == 255;
                    boolean z2 = this.f8427i && (bArr[i2] & 224) == 224;
                    this.f8427i = z;
                    if (z2) {
                        parsableByteArray.m3194D(i2 + 1);
                        this.f8427i = false;
                        this.f8419a.f6392a[1] = bArr[i2];
                        this.f8425g = 2;
                        this.f8424f = 1;
                        break;
                    }
                    i2++;
                }
            } else if (i == 1) {
                int iMin = Math.min(parsableByteArray.m3196a(), 4 - this.f8425g);
                parsableByteArray.m3200e(this.f8419a.f6392a, this.f8425g, iMin);
                int i4 = this.f8425g + iMin;
                this.f8425g = i4;
                if (i4 >= 4) {
                    this.f8419a.m3194D(0);
                    if (this.f8420b.m3532a(this.f8419a.m3201f())) {
                        MpegAudioUtil.a aVar = this.f8420b;
                        this.f8429k = aVar.f7002c;
                        if (!this.f8426h) {
                            this.f8428j = (((long) aVar.f7006g) * 1000000) / ((long) aVar.f7003d);
                            Format.b bVar = new Format.b();
                            bVar.f6948a = this.f8423e;
                            MpegAudioUtil.a aVar2 = this.f8420b;
                            bVar.f6958k = aVar2.f7001b;
                            bVar.f6959l = 4096;
                            bVar.f6971x = aVar2.f7004e;
                            bVar.f6972y = aVar2.f7003d;
                            bVar.f6950c = this.f8421c;
                            this.f8422d.mo3760e(bVar.m3519a());
                            this.f8426h = true;
                        }
                        this.f8419a.m3194D(0);
                        this.f8422d.mo3758c(this.f8419a, 4);
                        this.f8424f = 2;
                    } else {
                        this.f8425g = 0;
                        this.f8424f = 1;
                    }
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException();
                }
                int iMin2 = Math.min(parsableByteArray.m3196a(), this.f8429k - this.f8425g);
                this.f8422d.mo3758c(parsableByteArray, iMin2);
                int i5 = this.f8425g + iMin2;
                this.f8425g = i5;
                int i6 = this.f8429k;
                if (i5 >= i6) {
                    this.f8422d.mo3759d(this.f8430l, 1, i6, 0, null);
                    this.f8430l += this.f8428j;
                    this.f8425g = 0;
                    this.f8424f = 0;
                }
            }
        }
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p231n0.ElementaryStreamReader
    /* JADX INFO: renamed from: c */
    public void mo3871c() {
        this.f8424f = 0;
        this.f8425g = 0;
        this.f8427i = false;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p231n0.ElementaryStreamReader
    /* JADX INFO: renamed from: d */
    public void mo3872d() {
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p231n0.ElementaryStreamReader
    /* JADX INFO: renamed from: e */
    public void mo3873e(ExtractorOutput extractorOutput, TsPayloadReader.d dVar) {
        dVar.m3878a();
        this.f8423e = dVar.m3879b();
        this.f8422d = extractorOutput.mo3774o(dVar.m3880c(), 1);
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p231n0.ElementaryStreamReader
    /* JADX INFO: renamed from: f */
    public void mo3874f(long j2, int i) {
        this.f8430l = j2;
    }

    public MpegAudioReader(String str) {
        this.f8424f = 0;
        ParsableByteArray parsableByteArray = new ParsableByteArray(4);
        this.f8419a = parsableByteArray;
        parsableByteArray.f6392a[0] = -1;
        this.f8420b = new MpegAudioUtil.a();
        this.f8421c = str;
    }
}
