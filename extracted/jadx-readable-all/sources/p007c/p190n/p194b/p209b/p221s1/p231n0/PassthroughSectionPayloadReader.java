package p007c.p190n.p194b.p209b.p221s1.p231n0;

import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;
import p007c.p190n.p194b.p209b.p212b2.TimestampAdjuster;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p221s1.ExtractorOutput;
import p007c.p190n.p194b.p209b.p221s1.TrackOutput2;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.s1.n0.x, reason: use source file name */
/* JADX INFO: compiled from: PassthroughSectionPayloadReader.java */
/* JADX INFO: loaded from: classes.dex */
public final class PassthroughSectionPayloadReader implements SectionPayloadReader {

    /* JADX INFO: renamed from: a */
    public Format f8436a;

    /* JADX INFO: renamed from: b */
    public TimestampAdjuster f8437b;

    /* JADX INFO: renamed from: c */
    public TrackOutput2 f8438c;

    public PassthroughSectionPayloadReader(String str) {
        Format.b bVar = new Format.b();
        bVar.f6958k = str;
        this.f8436a = bVar.m3519a();
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p231n0.SectionPayloadReader
    /* JADX INFO: renamed from: a */
    public void mo3864a(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, TsPayloadReader.d dVar) {
        this.f8437b = timestampAdjuster;
        dVar.m3878a();
        TrackOutput2 trackOutput2Mo3774o = extractorOutput.mo3774o(dVar.m3880c(), 5);
        this.f8438c = trackOutput2Mo3774o;
        trackOutput2Mo3774o.mo3760e(this.f8436a);
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p231n0.SectionPayloadReader
    /* JADX INFO: renamed from: b */
    public void mo3865b(ParsableByteArray parsableByteArray) {
        long j2;
        C2096e.m4572h(this.f8437b);
        int i = Util6.f6307a;
        long jM3087d = this.f8437b.m3087d();
        long j3 = -9223372036854775807L;
        if (jM3087d == -9223372036854775807L) {
            return;
        }
        Format format = this.f8436a;
        if (jM3087d != format.f6938u) {
            Format.b bVarM3515a = format.m3515a();
            bVarM3515a.f6962o = jM3087d;
            Format formatM3519a = bVarM3515a.m3519a();
            this.f8436a = formatM3519a;
            this.f8438c.mo3760e(formatM3519a);
        }
        int iM3196a = parsableByteArray.m3196a();
        this.f8438c.mo3758c(parsableByteArray, iM3196a);
        TrackOutput2 trackOutput2 = this.f8438c;
        TimestampAdjuster timestampAdjuster = this.f8437b;
        synchronized (timestampAdjuster) {
            long j4 = timestampAdjuster.f6304d;
            if (j4 != -9223372036854775807L) {
                j3 = timestampAdjuster.f6303c + j4;
            } else {
                long j5 = timestampAdjuster.f6302b;
                if (j5 != Long.MAX_VALUE) {
                    j2 = j5;
                }
            }
            j2 = j3;
        }
        trackOutput2.mo3759d(j2, 1, iM3196a, 0, null);
    }
}
