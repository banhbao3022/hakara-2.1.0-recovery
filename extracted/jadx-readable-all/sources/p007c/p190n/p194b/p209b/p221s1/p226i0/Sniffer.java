package p007c.p190n.p194b.p209b.p221s1.p226i0;

import java.io.IOException;
import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;
import p007c.p190n.p194b.p209b.p221s1.ExtractorInput;

/* JADX INFO: renamed from: c.n.b.b.s1.i0.f, reason: use source file name */
/* JADX INFO: compiled from: Sniffer.java */
/* JADX INFO: loaded from: classes.dex */
public final class Sniffer {

    /* JADX INFO: renamed from: a */
    public final ParsableByteArray f7803a = new ParsableByteArray(8);

    /* JADX INFO: renamed from: b */
    public int f7804b;

    /* JADX INFO: renamed from: a */
    public final long m3792a(ExtractorInput extractorInput) throws IOException {
        int i = 0;
        extractorInput.mo3739o(this.f7803a.f6392a, 0, 1);
        int i2 = this.f7803a.f6392a[0] & 255;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (~i3);
        extractorInput.mo3739o(this.f7803a.f6392a, 1, i4);
        while (i < i4) {
            i++;
            i5 = (this.f7803a.f6392a[i] & 255) + (i5 << 8);
        }
        this.f7804b = i4 + 1 + this.f7804b;
        return i5;
    }
}
