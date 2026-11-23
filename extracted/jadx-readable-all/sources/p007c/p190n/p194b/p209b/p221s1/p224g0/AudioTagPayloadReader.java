package p007c.p190n.p194b.p209b.p221s1.p224g0;

import java.util.Collections;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.ParserException;
import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;
import p007c.p190n.p194b.p209b.p215n1.AacUtil;
import p007c.p190n.p194b.p209b.p221s1.TrackOutput2;

/* JADX INFO: renamed from: c.n.b.b.s1.g0.b, reason: use source file name */
/* JADX INFO: compiled from: AudioTagPayloadReader.java */
/* JADX INFO: loaded from: classes.dex */
public final class AudioTagPayloadReader extends TagPayloadReader {

    /* JADX INFO: renamed from: b */
    public static final int[] f7623b = {5512, 11025, 22050, 44100};

    /* JADX INFO: renamed from: c */
    public boolean f7624c;

    /* JADX INFO: renamed from: d */
    public boolean f7625d;

    /* JADX INFO: renamed from: e */
    public int f7626e;

    public AudioTagPayloadReader(TrackOutput2 trackOutput2) {
        super(trackOutput2);
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p224g0.TagPayloadReader
    /* JADX INFO: renamed from: b */
    public boolean mo3762b(ParsableByteArray parsableByteArray) throws TagPayloadReader.a {
        if (this.f7624c) {
            parsableByteArray.m3195E(1);
        } else {
            int iM3214s = parsableByteArray.m3214s();
            int i = (iM3214s >> 4) & 15;
            this.f7626e = i;
            if (i == 2) {
                int i2 = f7623b[(iM3214s >> 2) & 3];
                Format.b bVar = new Format.b();
                bVar.f6958k = "audio/mpeg";
                bVar.f6971x = 1;
                bVar.f6972y = i2;
                this.f7646a.mo3760e(bVar.m3519a());
                this.f7625d = true;
            } else if (i == 7 || i == 8) {
                String str = i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                Format.b bVar2 = new Format.b();
                bVar2.f6958k = str;
                bVar2.f6971x = 1;
                bVar2.f6972y = 8000;
                this.f7646a.mo3760e(bVar2.m3519a());
                this.f7625d = true;
            } else if (i != 10) {
                StringBuilder sbM1556G = outline.m1556G("Audio format not supported: ");
                sbM1556G.append(this.f7626e);
                throw new TagPayloadReader.a(sbM1556G.toString());
            }
            this.f7624c = true;
        }
        return true;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p224g0.TagPayloadReader
    /* JADX INFO: renamed from: c */
    public boolean mo3763c(ParsableByteArray parsableByteArray, long j2) throws ParserException {
        if (this.f7626e == 2) {
            int iM3196a = parsableByteArray.m3196a();
            this.f7646a.mo3758c(parsableByteArray, iM3196a);
            this.f7646a.mo3759d(j2, 1, iM3196a, 0, null);
            return true;
        }
        int iM3214s = parsableByteArray.m3214s();
        if (iM3214s != 0 || this.f7625d) {
            if (this.f7626e == 10 && iM3214s != 1) {
                return false;
            }
            int iM3196a2 = parsableByteArray.m3196a();
            this.f7646a.mo3758c(parsableByteArray, iM3196a2);
            this.f7646a.mo3759d(j2, 1, iM3196a2, 0, null);
            return true;
        }
        int iM3196a3 = parsableByteArray.m3196a();
        byte[] bArr = new byte[iM3196a3];
        System.arraycopy(parsableByteArray.f6392a, parsableByteArray.f6393b, bArr, 0, iM3196a3);
        parsableByteArray.f6393b += iM3196a3;
        AacUtil.b bVarM3554e = AacUtil.m3554e(bArr);
        Format.b bVar = new Format.b();
        bVar.f6958k = "audio/mp4a-latm";
        bVar.f6955h = bVarM3554e.f7085c;
        bVar.f6971x = bVarM3554e.f7084b;
        bVar.f6972y = bVarM3554e.f7083a;
        bVar.f6960m = Collections.singletonList(bArr);
        this.f7646a.mo3760e(bVar.m3519a());
        this.f7625d = true;
        return false;
    }
}
