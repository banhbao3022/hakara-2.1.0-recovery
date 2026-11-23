package p007c.p190n.p194b.p209b.p221s1.p231n0;

import android.util.Log;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;
import p007c.p190n.p194b.p209b.p221s1.ExtractorOutput;
import p007c.p190n.p194b.p209b.p221s1.TrackOutput2;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.s1.n0.t, reason: use source file name */
/* JADX INFO: compiled from: Id3Reader.java */
/* JADX INFO: loaded from: classes.dex */
public final class Id3Reader implements ElementaryStreamReader {

    /* JADX INFO: renamed from: a */
    public final ParsableByteArray f8392a = new ParsableByteArray(10);

    /* JADX INFO: renamed from: b */
    public TrackOutput2 f8393b;

    /* JADX INFO: renamed from: c */
    public boolean f8394c;

    /* JADX INFO: renamed from: d */
    public long f8395d;

    /* JADX INFO: renamed from: e */
    public int f8396e;

    /* JADX INFO: renamed from: f */
    public int f8397f;

    @Override // p007c.p190n.p194b.p209b.p221s1.p231n0.ElementaryStreamReader
    /* JADX INFO: renamed from: b */
    public void mo3870b(ParsableByteArray parsableByteArray) {
        C2096e.m4572h(this.f8393b);
        if (this.f8394c) {
            int iM3196a = parsableByteArray.m3196a();
            int i = this.f8397f;
            if (i < 10) {
                int iMin = Math.min(iM3196a, 10 - i);
                System.arraycopy(parsableByteArray.f6392a, parsableByteArray.f6393b, this.f8392a.f6392a, this.f8397f, iMin);
                if (this.f8397f + iMin == 10) {
                    this.f8392a.m3194D(0);
                    if (73 != this.f8392a.m3214s() || 68 != this.f8392a.m3214s() || 51 != this.f8392a.m3214s()) {
                        Log.w("Id3Reader", "Discarding invalid ID3 tag");
                        this.f8394c = false;
                        return;
                    } else {
                        this.f8392a.m3195E(3);
                        this.f8396e = this.f8392a.m3213r() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iM3196a, this.f8396e - this.f8397f);
            this.f8393b.mo3758c(parsableByteArray, iMin2);
            this.f8397f += iMin2;
        }
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p231n0.ElementaryStreamReader
    /* JADX INFO: renamed from: c */
    public void mo3871c() {
        this.f8394c = false;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p231n0.ElementaryStreamReader
    /* JADX INFO: renamed from: d */
    public void mo3872d() {
        int i;
        C2096e.m4572h(this.f8393b);
        if (this.f8394c && (i = this.f8396e) != 0 && this.f8397f == i) {
            this.f8393b.mo3759d(this.f8395d, 1, i, 0, null);
            this.f8394c = false;
        }
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p231n0.ElementaryStreamReader
    /* JADX INFO: renamed from: e */
    public void mo3873e(ExtractorOutput extractorOutput, TsPayloadReader.d dVar) {
        dVar.m3878a();
        TrackOutput2 trackOutput2Mo3774o = extractorOutput.mo3774o(dVar.m3880c(), 5);
        this.f8393b = trackOutput2Mo3774o;
        Format.b bVar = new Format.b();
        bVar.f6948a = dVar.m3879b();
        bVar.f6958k = "application/id3";
        trackOutput2Mo3774o.mo3760e(bVar.m3519a());
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p231n0.ElementaryStreamReader
    /* JADX INFO: renamed from: f */
    public void mo3874f(long j2, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.f8394c = true;
        this.f8395d = j2;
        this.f8396e = 0;
        this.f8397f = 0;
    }
}
