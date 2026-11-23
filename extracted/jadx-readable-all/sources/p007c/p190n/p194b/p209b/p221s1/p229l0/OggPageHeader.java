package p007c.p190n.p194b.p209b.p221s1.p229l0;

import java.io.EOFException;
import java.io.IOException;
import p007c.p190n.p194b.p209b.ParserException;
import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;
import p007c.p190n.p194b.p209b.p221s1.ExtractorInput;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.s1.l0.f, reason: use source file name */
/* JADX INFO: compiled from: OggPageHeader.java */
/* JADX INFO: loaded from: classes.dex */
public final class OggPageHeader {

    /* JADX INFO: renamed from: a */
    public int f8048a;

    /* JADX INFO: renamed from: b */
    public int f8049b;

    /* JADX INFO: renamed from: c */
    public long f8050c;

    /* JADX INFO: renamed from: d */
    public int f8051d;

    /* JADX INFO: renamed from: e */
    public int f8052e;

    /* JADX INFO: renamed from: f */
    public int f8053f;

    /* JADX INFO: renamed from: g */
    public final int[] f8054g = new int[255];

    /* JADX INFO: renamed from: h */
    public final ParsableByteArray f8055h = new ParsableByteArray(255);

    /* JADX INFO: renamed from: a */
    public boolean m3853a(ExtractorInput extractorInput, boolean z) throws IOException {
        boolean zMo3731d;
        m3854b();
        this.f8055h.m3221z(27);
        try {
            zMo3731d = extractorInput.mo3731d(this.f8055h.f6392a, 0, 27, z);
        } catch (EOFException e) {
            if (!z) {
                throw e;
            }
            zMo3731d = false;
        }
        if (!zMo3731d || this.f8055h.m3215t() != 1332176723) {
            return false;
        }
        int iM3214s = this.f8055h.m3214s();
        this.f8048a = iM3214s;
        if (iM3214s != 0) {
            if (z) {
                return false;
            }
            throw new ParserException("unsupported bit stream revision");
        }
        this.f8049b = this.f8055h.m3214s();
        ParsableByteArray parsableByteArray = this.f8055h;
        byte[] bArr = parsableByteArray.f6392a;
        int i = parsableByteArray.f6393b;
        int i2 = i + 1;
        parsableByteArray.f6393b = i2;
        long j2 = ((long) bArr[i]) & 255;
        int i3 = i2 + 1;
        parsableByteArray.f6393b = i3;
        long j3 = j2 | ((((long) bArr[i2]) & 255) << 8);
        int i4 = i3 + 1;
        parsableByteArray.f6393b = i4;
        long j4 = j3 | ((((long) bArr[i3]) & 255) << 16);
        int i5 = i4 + 1;
        parsableByteArray.f6393b = i5;
        long j5 = j4 | ((((long) bArr[i4]) & 255) << 24);
        int i6 = i5 + 1;
        parsableByteArray.f6393b = i6;
        long j6 = j5 | ((((long) bArr[i5]) & 255) << 32);
        int i7 = i6 + 1;
        parsableByteArray.f6393b = i7;
        long j7 = j6 | ((((long) bArr[i6]) & 255) << 40);
        int i8 = i7 + 1;
        parsableByteArray.f6393b = i8;
        long j8 = j7 | ((((long) bArr[i7]) & 255) << 48);
        parsableByteArray.f6393b = i8 + 1;
        this.f8050c = ((((long) bArr[i8]) & 255) << 56) | j8;
        parsableByteArray.m3205j();
        this.f8055h.m3205j();
        this.f8055h.m3205j();
        int iM3214s2 = this.f8055h.m3214s();
        this.f8051d = iM3214s2;
        this.f8052e = iM3214s2 + 27;
        this.f8055h.m3221z(iM3214s2);
        extractorInput.mo3739o(this.f8055h.f6392a, 0, this.f8051d);
        for (int i9 = 0; i9 < this.f8051d; i9++) {
            this.f8054g[i9] = this.f8055h.m3214s();
            this.f8053f += this.f8054g[i9];
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public void m3854b() {
        this.f8048a = 0;
        this.f8049b = 0;
        this.f8050c = 0L;
        this.f8051d = 0;
        this.f8052e = 0;
        this.f8053f = 0;
    }

    /* JADX INFO: renamed from: c */
    public boolean m3855c(ExtractorInput extractorInput, long j2) throws IOException {
        boolean zMo3731d;
        C2096e.m4566b(extractorInput.mo3740p() == extractorInput.mo3732e());
        this.f8055h.m3221z(4);
        while (true) {
            if (j2 != -1 && extractorInput.mo3740p() + 4 >= j2) {
                break;
            }
            try {
                zMo3731d = extractorInput.mo3731d(this.f8055h.f6392a, 0, 4, true);
            } catch (EOFException unused) {
                zMo3731d = false;
            }
            if (!zMo3731d) {
                break;
            }
            this.f8055h.m3194D(0);
            if (this.f8055h.m3215t() == 1332176723) {
                extractorInput.mo3736k();
                return true;
            }
            extractorInput.mo3737l(1);
        }
        do {
            if (j2 != -1 && extractorInput.mo3740p() >= j2) {
                break;
            }
        } while (extractorInput.mo3734g(1) != -1);
        return false;
    }
}
