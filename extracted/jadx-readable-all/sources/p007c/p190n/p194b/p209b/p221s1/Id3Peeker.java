package p007c.p190n.p194b.p209b.p221s1;

import java.io.EOFException;
import java.io.IOException;
import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;
import p007c.p190n.p194b.p209b.p234u1.Metadata;
import p007c.p190n.p194b.p209b.p234u1.p239m.Id3Decoder;

/* JADX INFO: renamed from: c.n.b.b.s1.s, reason: use source file name */
/* JADX INFO: compiled from: Id3Peeker.java */
/* JADX INFO: loaded from: classes.dex */
public final class Id3Peeker {

    /* JADX INFO: renamed from: a */
    public final ParsableByteArray f8514a = new ParsableByteArray(10);

    /* JADX INFO: renamed from: a */
    public Metadata m3925a(ExtractorInput extractorInput, Id3Decoder.a aVar) throws IOException {
        Metadata metadataM4045d = null;
        int i = 0;
        while (true) {
            try {
                extractorInput.mo3739o(this.f8514a.f6392a, 0, 10);
                this.f8514a.m3194D(0);
                if (this.f8514a.m3216u() != 4801587) {
                    break;
                }
                this.f8514a.m3195E(3);
                int iM3213r = this.f8514a.m3213r();
                int i2 = iM3213r + 10;
                if (metadataM4045d == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.f8514a.f6392a, 0, bArr, 0, 10);
                    extractorInput.mo3739o(bArr, 10, iM3213r);
                    metadataM4045d = new Id3Decoder(aVar).m4045d(bArr, i2);
                } else {
                    extractorInput.mo3733f(iM3213r);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        extractorInput.mo3736k();
        extractorInput.mo3733f(i);
        return metadataM4045d;
    }
}
