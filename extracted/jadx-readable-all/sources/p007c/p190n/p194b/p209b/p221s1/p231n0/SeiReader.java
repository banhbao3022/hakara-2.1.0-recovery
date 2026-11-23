package p007c.p190n.p194b.p209b.p221s1.p231n0;

import java.util.List;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.p221s1.ExtractorOutput;
import p007c.p190n.p194b.p209b.p221s1.TrackOutput2;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.s1.n0.e0, reason: use source file name */
/* JADX INFO: compiled from: SeiReader.java */
/* JADX INFO: loaded from: classes.dex */
public final class SeiReader {

    /* JADX INFO: renamed from: a */
    public final List<Format> f8130a;

    /* JADX INFO: renamed from: b */
    public final TrackOutput2[] f8131b;

    public SeiReader(List<Format> list) {
        this.f8130a = list;
        this.f8131b = new TrackOutput2[list.size()];
    }

    /* JADX INFO: renamed from: a */
    public void m3869a(ExtractorOutput extractorOutput, TsPayloadReader.d dVar) {
        for (int i = 0; i < this.f8131b.length; i++) {
            dVar.m3878a();
            TrackOutput2 trackOutput2Mo3774o = extractorOutput.mo3774o(dVar.m3880c(), 3);
            Format format = this.f8130a.get(i);
            String str = format.f6934q;
            C2096e.m4567c("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption mime type provided: " + str);
            String strM3879b = format.f6923f;
            if (strM3879b == null) {
                strM3879b = dVar.m3879b();
            }
            Format.b bVar = new Format.b();
            bVar.f6948a = strM3879b;
            bVar.f6958k = str;
            bVar.f6951d = format.f6926i;
            bVar.f6950c = format.f6925h;
            bVar.f6946C = format.f6920I;
            bVar.f6960m = format.f6936s;
            trackOutput2Mo3774o.mo3760e(bVar.m3519a());
            this.f8131b[i] = trackOutput2Mo3774o;
        }
    }
}
