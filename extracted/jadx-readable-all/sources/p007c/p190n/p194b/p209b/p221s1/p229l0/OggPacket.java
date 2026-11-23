package p007c.p190n.p194b.p209b.p221s1.p229l0;

import java.io.IOException;
import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;
import p007c.p190n.p194b.p209b.p221s1.ExtractorInput;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.s1.l0.e, reason: use source file name */
/* JADX INFO: compiled from: OggPacket.java */
/* JADX INFO: loaded from: classes.dex */
public final class OggPacket {

    /* JADX INFO: renamed from: a */
    public final OggPageHeader f8043a = new OggPageHeader();

    /* JADX INFO: renamed from: b */
    public final ParsableByteArray f8044b = new ParsableByteArray(new byte[65025], 0);

    /* JADX INFO: renamed from: c */
    public int f8045c = -1;

    /* JADX INFO: renamed from: d */
    public int f8046d;

    /* JADX INFO: renamed from: e */
    public boolean f8047e;

    /* JADX INFO: renamed from: a */
    public final int m3851a(int i) {
        int i2;
        int i3 = 0;
        this.f8046d = 0;
        do {
            int i4 = this.f8046d;
            int i5 = i + i4;
            OggPageHeader oggPageHeader = this.f8043a;
            if (i5 >= oggPageHeader.f8051d) {
                break;
            }
            int[] iArr = oggPageHeader.f8054g;
            this.f8046d = i4 + 1;
            i2 = iArr[i4 + i];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    /* JADX INFO: renamed from: b */
    public boolean m3852b(ExtractorInput extractorInput) throws IOException {
        int i;
        C2096e.m4570f(extractorInput != null);
        if (this.f8047e) {
            this.f8047e = false;
            this.f8044b.m3221z(0);
        }
        while (!this.f8047e) {
            if (this.f8045c < 0) {
                if (!this.f8043a.m3855c(extractorInput, -1L) || !this.f8043a.m3853a(extractorInput, true)) {
                    return false;
                }
                OggPageHeader oggPageHeader = this.f8043a;
                int iM3851a = oggPageHeader.f8052e;
                if ((oggPageHeader.f8049b & 1) == 1 && this.f8044b.f6394c == 0) {
                    iM3851a += m3851a(0);
                    i = this.f8046d + 0;
                } else {
                    i = 0;
                }
                extractorInput.mo3737l(iM3851a);
                this.f8045c = i;
            }
            int iM3851a2 = m3851a(this.f8045c);
            int i2 = this.f8045c + this.f8046d;
            if (iM3851a2 > 0) {
                ParsableByteArray parsableByteArray = this.f8044b;
                parsableByteArray.m3197b(parsableByteArray.f6394c + iM3851a2);
                ParsableByteArray parsableByteArray2 = this.f8044b;
                extractorInput.readFully(parsableByteArray2.f6392a, parsableByteArray2.f6394c, iM3851a2);
                ParsableByteArray parsableByteArray3 = this.f8044b;
                parsableByteArray3.m3193C(parsableByteArray3.f6394c + iM3851a2);
                this.f8047e = this.f8043a.f8054g[i2 + (-1)] != 255;
            }
            if (i2 == this.f8043a.f8051d) {
                i2 = -1;
            }
            this.f8045c = i2;
        }
        return true;
    }
}
