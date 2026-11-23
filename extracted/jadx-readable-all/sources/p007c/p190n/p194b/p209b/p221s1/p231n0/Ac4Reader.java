package p007c.p190n.p194b.p209b.p221s1.p231n0;

import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.p212b2.ParsableBitArray;
import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;
import p007c.p190n.p194b.p209b.p215n1.Ac4Util;
import p007c.p190n.p194b.p209b.p221s1.ExtractorOutput;
import p007c.p190n.p194b.p209b.p221s1.TrackOutput2;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.s1.n0.i, reason: use source file name */
/* JADX INFO: compiled from: Ac4Reader.java */
/* JADX INFO: loaded from: classes.dex */
public final class Ac4Reader implements ElementaryStreamReader {

    /* JADX INFO: renamed from: a */
    public final ParsableBitArray f8189a;

    /* JADX INFO: renamed from: b */
    public final ParsableByteArray f8190b;

    /* JADX INFO: renamed from: c */
    public final String f8191c;

    /* JADX INFO: renamed from: d */
    public String f8192d;

    /* JADX INFO: renamed from: e */
    public TrackOutput2 f8193e;

    /* JADX INFO: renamed from: f */
    public int f8194f;

    /* JADX INFO: renamed from: g */
    public int f8195g;

    /* JADX INFO: renamed from: h */
    public boolean f8196h;

    /* JADX INFO: renamed from: i */
    public boolean f8197i;

    /* JADX INFO: renamed from: j */
    public long f8198j;

    /* JADX INFO: renamed from: k */
    public Format f8199k;

    /* JADX INFO: renamed from: l */
    public int f8200l;

    /* JADX INFO: renamed from: m */
    public long f8201m;

    public Ac4Reader() {
        this(null);
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p231n0.ElementaryStreamReader
    /* JADX INFO: renamed from: b */
    public void mo3870b(ParsableByteArray parsableByteArray) {
        boolean z;
        C2096e.m4572h(this.f8193e);
        while (parsableByteArray.m3196a() > 0) {
            int i = this.f8194f;
            if (i == 0) {
                while (true) {
                    if (parsableByteArray.m3196a() <= 0) {
                        z = false;
                        break;
                    }
                    if (this.f8196h) {
                        int iM3214s = parsableByteArray.m3214s();
                        this.f8196h = iM3214s == 172;
                        if (iM3214s == 64 || iM3214s == 65) {
                            this.f8197i = iM3214s == 65;
                            z = true;
                            break;
                        }
                    } else {
                        this.f8196h = parsableByteArray.m3214s() == 172;
                    }
                }
                if (z) {
                    this.f8194f = 1;
                    byte[] bArr = this.f8190b.f6392a;
                    bArr[0] = -84;
                    bArr[1] = (byte) (this.f8197i ? 65 : 64);
                    this.f8195g = 2;
                }
            } else if (i == 1) {
                byte[] bArr2 = this.f8190b.f6392a;
                int iMin = Math.min(parsableByteArray.m3196a(), 16 - this.f8195g);
                System.arraycopy(parsableByteArray.f6392a, parsableByteArray.f6393b, bArr2, this.f8195g, iMin);
                parsableByteArray.f6393b += iMin;
                int i2 = this.f8195g + iMin;
                this.f8195g = i2;
                if (i2 == 16) {
                    this.f8189a.m3187k(0);
                    Ac4Util.b bVarM3557b = Ac4Util.m3557b(this.f8189a);
                    Format format = this.f8199k;
                    if (format == null || 2 != format.f6915D || bVarM3557b.f7093a != format.f6916E || !"audio/ac4".equals(format.f6934q)) {
                        Format.b bVar = new Format.b();
                        bVar.f6948a = this.f8192d;
                        bVar.f6958k = "audio/ac4";
                        bVar.f6971x = 2;
                        bVar.f6972y = bVarM3557b.f7093a;
                        bVar.f6950c = this.f8191c;
                        Format formatM3519a = bVar.m3519a();
                        this.f8199k = formatM3519a;
                        this.f8193e.mo3760e(formatM3519a);
                    }
                    this.f8200l = bVarM3557b.f7094b;
                    this.f8198j = (((long) bVarM3557b.f7095c) * 1000000) / ((long) this.f8199k.f6916E);
                    this.f8190b.m3194D(0);
                    this.f8193e.mo3758c(this.f8190b, 16);
                    this.f8194f = 2;
                }
            } else if (i == 2) {
                int iMin2 = Math.min(parsableByteArray.m3196a(), this.f8200l - this.f8195g);
                this.f8193e.mo3758c(parsableByteArray, iMin2);
                int i3 = this.f8195g + iMin2;
                this.f8195g = i3;
                int i4 = this.f8200l;
                if (i3 == i4) {
                    this.f8193e.mo3759d(this.f8201m, 1, i4, 0, null);
                    this.f8201m += this.f8198j;
                    this.f8194f = 0;
                }
            }
        }
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p231n0.ElementaryStreamReader
    /* JADX INFO: renamed from: c */
    public void mo3871c() {
        this.f8194f = 0;
        this.f8195g = 0;
        this.f8196h = false;
        this.f8197i = false;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p231n0.ElementaryStreamReader
    /* JADX INFO: renamed from: d */
    public void mo3872d() {
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p231n0.ElementaryStreamReader
    /* JADX INFO: renamed from: e */
    public void mo3873e(ExtractorOutput extractorOutput, TsPayloadReader.d dVar) {
        dVar.m3878a();
        this.f8192d = dVar.m3879b();
        this.f8193e = extractorOutput.mo3774o(dVar.m3880c(), 1);
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p231n0.ElementaryStreamReader
    /* JADX INFO: renamed from: f */
    public void mo3874f(long j2, int i) {
        this.f8201m = j2;
    }

    public Ac4Reader(String str) {
        ParsableBitArray parsableBitArray = new ParsableBitArray(new byte[16]);
        this.f8189a = parsableBitArray;
        this.f8190b = new ParsableByteArray(parsableBitArray.f6388a);
        this.f8194f = 0;
        this.f8195g = 0;
        this.f8196h = false;
        this.f8197i = false;
        this.f8191c = str;
    }
}
