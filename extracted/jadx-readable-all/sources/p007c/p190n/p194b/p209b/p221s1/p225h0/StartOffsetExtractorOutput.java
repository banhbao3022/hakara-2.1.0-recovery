package p007c.p190n.p194b.p209b.p221s1.p225h0;

import p007c.p190n.p194b.p209b.p221s1.ExtractorOutput;
import p007c.p190n.p194b.p209b.p221s1.SeekMap;
import p007c.p190n.p194b.p209b.p221s1.SeekPoint;
import p007c.p190n.p194b.p209b.p221s1.TrackOutput2;

/* JADX INFO: renamed from: c.n.b.b.s1.h0.d, reason: use source file name */
/* JADX INFO: compiled from: StartOffsetExtractorOutput.java */
/* JADX INFO: loaded from: classes.dex */
public final class StartOffsetExtractorOutput implements ExtractorOutput {

    /* JADX INFO: renamed from: f */
    public final long f7669f;

    /* JADX INFO: renamed from: g */
    public final ExtractorOutput f7670g;

    /* JADX INFO: renamed from: c.n.b.b.s1.h0.d$a */
    /* JADX INFO: compiled from: StartOffsetExtractorOutput.java */
    public class a implements SeekMap {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SeekMap f7671a;

        public a(SeekMap seekMap) {
            this.f7671a = seekMap;
        }

        @Override // p007c.p190n.p194b.p209b.p221s1.SeekMap
        /* JADX INFO: renamed from: d */
        public boolean mo3716d() {
            return this.f7671a.mo3716d();
        }

        @Override // p007c.p190n.p194b.p209b.p221s1.SeekMap
        /* JADX INFO: renamed from: h */
        public SeekMap.a mo3717h(long j2) {
            SeekMap.a aVarMo3717h = this.f7671a.mo3717h(j2);
            SeekPoint seekPoint = aVarMo3717h.f8520a;
            SeekPoint seekPoint2 = new SeekPoint(seekPoint.f8525b, seekPoint.f8526c + StartOffsetExtractorOutput.this.f7669f);
            SeekPoint seekPoint3 = aVarMo3717h.f8521b;
            return new SeekMap.a(seekPoint2, new SeekPoint(seekPoint3.f8525b, seekPoint3.f8526c + StartOffsetExtractorOutput.this.f7669f));
        }

        @Override // p007c.p190n.p194b.p209b.p221s1.SeekMap
        /* JADX INFO: renamed from: i */
        public long mo3718i() {
            return this.f7671a.mo3718i();
        }
    }

    public StartOffsetExtractorOutput(long j2, ExtractorOutput extractorOutput) {
        this.f7669f = j2;
        this.f7670g = extractorOutput;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.ExtractorOutput
    /* JADX INFO: renamed from: a */
    public void mo3772a(SeekMap seekMap) {
        this.f7670g.mo3772a(new a(seekMap));
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.ExtractorOutput
    /* JADX INFO: renamed from: j */
    public void mo3773j() {
        this.f7670g.mo3773j();
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.ExtractorOutput
    /* JADX INFO: renamed from: o */
    public TrackOutput2 mo3774o(int i, int i2) {
        return this.f7670g.mo3774o(i, i2);
    }
}
