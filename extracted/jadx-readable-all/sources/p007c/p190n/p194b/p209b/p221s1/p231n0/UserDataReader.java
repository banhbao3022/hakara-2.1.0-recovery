package p007c.p190n.p194b.p209b.p221s1.p231n0;

import java.util.List;
import p007c.p165l.p175i0.C1095a;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;
import p007c.p190n.p194b.p209b.p221s1.ExtractorOutput;
import p007c.p190n.p194b.p209b.p221s1.TrackOutput2;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.s1.n0.j0, reason: use source file name */
/* JADX INFO: compiled from: UserDataReader.java */
/* JADX INFO: loaded from: classes.dex */
public final class UserDataReader {

    /* JADX INFO: renamed from: a */
    public final List<Format> f8225a;

    /* JADX INFO: renamed from: b */
    public final TrackOutput2[] f8226b;

    public UserDataReader(List<Format> list) {
        this.f8225a = list;
        this.f8226b = new TrackOutput2[list.size()];
    }

    /* JADX INFO: renamed from: a */
    public void m3882a(long j2, ParsableByteArray parsableByteArray) {
        if (parsableByteArray.m3196a() < 9) {
            return;
        }
        int iM3201f = parsableByteArray.m3201f();
        int iM3201f2 = parsableByteArray.m3201f();
        int iM3214s = parsableByteArray.m3214s();
        if (iM3201f == 434 && iM3201f2 == 1195456820 && iM3214s == 3) {
            C1095a.m2395k(j2, parsableByteArray, this.f8226b);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m3883b(ExtractorOutput extractorOutput, TsPayloadReader.d dVar) {
        for (int i = 0; i < this.f8226b.length; i++) {
            dVar.m3878a();
            TrackOutput2 trackOutput2Mo3774o = extractorOutput.mo3774o(dVar.m3880c(), 3);
            Format format = this.f8225a.get(i);
            String str = format.f6934q;
            C2096e.m4567c("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption mime type provided: " + str);
            Format.b bVar = new Format.b();
            bVar.f6948a = dVar.m3879b();
            bVar.f6958k = str;
            bVar.f6951d = format.f6926i;
            bVar.f6950c = format.f6925h;
            bVar.f6946C = format.f6920I;
            bVar.f6960m = format.f6936s;
            trackOutput2Mo3774o.mo3760e(bVar.m3519a());
            this.f8226b[i] = trackOutput2Mo3774o;
        }
    }
}
