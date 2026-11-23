package p007c.p190n.p194b.p209b.p221s1.p231n0;

import java.util.Collections;
import java.util.List;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;
import p007c.p190n.p194b.p209b.p221s1.ExtractorOutput;
import p007c.p190n.p194b.p209b.p221s1.TrackOutput2;

/* JADX INFO: renamed from: c.n.b.b.s1.n0.n, reason: use source file name */
/* JADX INFO: compiled from: DvbSubtitleReader.java */
/* JADX INFO: loaded from: classes.dex */
public final class DvbSubtitleReader implements ElementaryStreamReader {

    /* JADX INFO: renamed from: a */
    public final List<TsPayloadReader.a> f8262a;

    /* JADX INFO: renamed from: b */
    public final TrackOutput2[] f8263b;

    /* JADX INFO: renamed from: c */
    public boolean f8264c;

    /* JADX INFO: renamed from: d */
    public int f8265d;

    /* JADX INFO: renamed from: e */
    public int f8266e;

    /* JADX INFO: renamed from: f */
    public long f8267f;

    public DvbSubtitleReader(List<TsPayloadReader.a> list) {
        this.f8262a = list;
        this.f8263b = new TrackOutput2[list.size()];
    }

    /* JADX INFO: renamed from: a */
    public final boolean m3890a(ParsableByteArray parsableByteArray, int i) {
        if (parsableByteArray.m3196a() == 0) {
            return false;
        }
        if (parsableByteArray.m3214s() != i) {
            this.f8264c = false;
        }
        this.f8265d--;
        return this.f8264c;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p231n0.ElementaryStreamReader
    /* JADX INFO: renamed from: b */
    public void mo3870b(ParsableByteArray parsableByteArray) {
        if (this.f8264c) {
            if (this.f8265d != 2 || m3890a(parsableByteArray, 32)) {
                if (this.f8265d != 1 || m3890a(parsableByteArray, 0)) {
                    int i = parsableByteArray.f6393b;
                    int iM3196a = parsableByteArray.m3196a();
                    for (TrackOutput2 trackOutput2 : this.f8263b) {
                        parsableByteArray.m3194D(i);
                        trackOutput2.mo3758c(parsableByteArray, iM3196a);
                    }
                    this.f8266e += iM3196a;
                }
            }
        }
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p231n0.ElementaryStreamReader
    /* JADX INFO: renamed from: c */
    public void mo3871c() {
        this.f8264c = false;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p231n0.ElementaryStreamReader
    /* JADX INFO: renamed from: d */
    public void mo3872d() {
        if (this.f8264c) {
            for (TrackOutput2 trackOutput2 : this.f8263b) {
                trackOutput2.mo3759d(this.f8267f, 1, this.f8266e, 0, null);
            }
            this.f8264c = false;
        }
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p231n0.ElementaryStreamReader
    /* JADX INFO: renamed from: e */
    public void mo3873e(ExtractorOutput extractorOutput, TsPayloadReader.d dVar) {
        for (int i = 0; i < this.f8263b.length; i++) {
            TsPayloadReader.a aVar = this.f8262a.get(i);
            dVar.m3878a();
            TrackOutput2 trackOutput2Mo3774o = extractorOutput.mo3774o(dVar.m3880c(), 3);
            Format.b bVar = new Format.b();
            bVar.f6948a = dVar.m3879b();
            bVar.f6958k = "application/dvbsubs";
            bVar.f6960m = Collections.singletonList(aVar.f8203b);
            bVar.f6950c = aVar.f8202a;
            trackOutput2Mo3774o.mo3760e(bVar.m3519a());
            this.f8263b[i] = trackOutput2Mo3774o;
        }
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p231n0.ElementaryStreamReader
    /* JADX INFO: renamed from: f */
    public void mo3874f(long j2, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.f8264c = true;
        this.f8267f = j2;
        this.f8266e = 0;
        this.f8265d = 2;
    }
}
