package p007c.p190n.p194b.p209b.p221s1.p224g0;

import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.ParserException;
import p007c.p190n.p194b.p209b.p212b2.NalUnitUtil;
import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;
import p007c.p190n.p194b.p209b.p213c2.AvcConfig;
import p007c.p190n.p194b.p209b.p221s1.TrackOutput2;

/* JADX INFO: renamed from: c.n.b.b.s1.g0.f, reason: use source file name */
/* JADX INFO: compiled from: VideoTagPayloadReader.java */
/* JADX INFO: loaded from: classes.dex */
public final class VideoTagPayloadReader extends TagPayloadReader {

    /* JADX INFO: renamed from: b */
    public final ParsableByteArray f7647b;

    /* JADX INFO: renamed from: c */
    public final ParsableByteArray f7648c;

    /* JADX INFO: renamed from: d */
    public int f7649d;

    /* JADX INFO: renamed from: e */
    public boolean f7650e;

    /* JADX INFO: renamed from: f */
    public boolean f7651f;

    /* JADX INFO: renamed from: g */
    public int f7652g;

    public VideoTagPayloadReader(TrackOutput2 trackOutput2) {
        super(trackOutput2);
        this.f7647b = new ParsableByteArray(NalUnitUtil.f6368a);
        this.f7648c = new ParsableByteArray(4);
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p224g0.TagPayloadReader
    /* JADX INFO: renamed from: b */
    public boolean mo3762b(ParsableByteArray parsableByteArray) throws TagPayloadReader.a {
        int iM3214s = parsableByteArray.m3214s();
        int i = (iM3214s >> 4) & 15;
        int i2 = iM3214s & 15;
        if (i2 != 7) {
            throw new TagPayloadReader.a(outline.m1590l("Video format not supported: ", i2));
        }
        this.f7652g = i;
        return i != 5;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p224g0.TagPayloadReader
    /* JADX INFO: renamed from: c */
    public boolean mo3763c(ParsableByteArray parsableByteArray, long j2) throws ParserException {
        int iM3214s = parsableByteArray.m3214s();
        byte[] bArr = parsableByteArray.f6392a;
        int i = parsableByteArray.f6393b;
        int i2 = i + 1;
        parsableByteArray.f6393b = i2;
        int i3 = ((bArr[i] & 255) << 24) >> 8;
        int i4 = i2 + 1;
        parsableByteArray.f6393b = i4;
        int i5 = i3 | ((bArr[i2] & 255) << 8);
        parsableByteArray.f6393b = i4 + 1;
        long j3 = (((long) ((bArr[i4] & 255) | i5)) * 1000) + j2;
        if (iM3214s == 0 && !this.f7650e) {
            ParsableByteArray parsableByteArray2 = new ParsableByteArray(new byte[parsableByteArray.m3196a()]);
            parsableByteArray.m3200e(parsableByteArray2.f6392a, 0, parsableByteArray.m3196a());
            AvcConfig avcConfigM3257b = AvcConfig.m3257b(parsableByteArray2);
            this.f7649d = avcConfigM3257b.f6435b;
            Format.b bVar = new Format.b();
            bVar.f6958k = "video/avc";
            bVar.f6955h = avcConfigM3257b.f6439f;
            bVar.f6963p = avcConfigM3257b.f6436c;
            bVar.f6964q = avcConfigM3257b.f6437d;
            bVar.f6967t = avcConfigM3257b.f6438e;
            bVar.f6960m = avcConfigM3257b.f6434a;
            this.f7646a.mo3760e(bVar.m3519a());
            this.f7650e = true;
            return false;
        }
        if (iM3214s != 1 || !this.f7650e) {
            return false;
        }
        int i6 = this.f7652g == 1 ? 1 : 0;
        if (!this.f7651f && i6 == 0) {
            return false;
        }
        byte[] bArr2 = this.f7648c.f6392a;
        bArr2[0] = 0;
        bArr2[1] = 0;
        bArr2[2] = 0;
        int i7 = 4 - this.f7649d;
        int i8 = 0;
        while (parsableByteArray.m3196a() > 0) {
            parsableByteArray.m3200e(this.f7648c.f6392a, i7, this.f7649d);
            this.f7648c.m3194D(0);
            int iM3217v = this.f7648c.m3217v();
            this.f7647b.m3194D(0);
            this.f7646a.mo3758c(this.f7647b, 4);
            this.f7646a.mo3758c(parsableByteArray, iM3217v);
            i8 = i8 + 4 + iM3217v;
        }
        this.f7646a.mo3759d(j3, i6, i8, 0, null);
        this.f7651f = true;
        return true;
    }
}
