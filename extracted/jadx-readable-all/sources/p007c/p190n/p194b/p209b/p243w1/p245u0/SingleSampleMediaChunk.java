package p007c.p190n.p194b.p209b.p243w1.p245u0;

import java.io.IOException;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.p210a2.DataSource3;
import p007c.p190n.p194b.p209b.p210a2.DataSpec;
import p007c.p190n.p194b.p209b.p210a2.StatsDataSource;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p221s1.DefaultExtractorInput;
import p007c.p190n.p194b.p209b.p221s1.TrackOutput2;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.w1.u0.o, reason: use source file name */
/* JADX INFO: compiled from: SingleSampleMediaChunk.java */
/* JADX INFO: loaded from: classes.dex */
public final class SingleSampleMediaChunk extends BaseMediaChunk {

    /* JADX INFO: renamed from: o */
    public final int f9162o;

    /* JADX INFO: renamed from: p */
    public final Format f9163p;

    /* JADX INFO: renamed from: q */
    public long f9164q;

    /* JADX INFO: renamed from: r */
    public boolean f9165r;

    public SingleSampleMediaChunk(DataSource3 dataSource3, DataSpec dataSpec, Format format, int i, Object obj, long j2, long j3, long j4, int i2, Format format2) {
        super(dataSource3, dataSpec, format, i, obj, j2, j3, -9223372036854775807L, -9223372036854775807L, j4);
        this.f9162o = i2;
        this.f9163p = format2;
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.Loader.e
    /* JADX INFO: renamed from: a */
    public void mo2909a() throws IOException {
        BaseMediaChunkOutput baseMediaChunkOutput = this.f9087m;
        C2096e.m4572h(baseMediaChunkOutput);
        baseMediaChunkOutput.m4197a(0L);
        TrackOutput2 trackOutput2M4198b = baseMediaChunkOutput.m4198b(0, this.f9162o);
        trackOutput2M4198b.mo3760e(this.f9163p);
        try {
            long jMo2913h = this.f9117i.mo2913h(this.f9110b.m3003d(this.f9164q));
            if (jMo2913h != -1) {
                jMo2913h += this.f9164q;
            }
            DefaultExtractorInput defaultExtractorInput = new DefaultExtractorInput(this.f9117i, this.f9164q, jMo2913h);
            for (int iMo3757b = 0; iMo3757b != -1; iMo3757b = trackOutput2M4198b.mo3757b(defaultExtractorInput, Integer.MAX_VALUE, true)) {
                this.f9164q += (long) iMo3757b;
            }
            trackOutput2M4198b.mo3759d(this.f9115g, 1, (int) this.f9164q, 0, null);
            StatsDataSource statsDataSource = this.f9117i;
            int i = Util6.f6307a;
            if (statsDataSource != null) {
                try {
                    statsDataSource.f5996a.close();
                } catch (IOException unused) {
                }
            }
            this.f9165r = true;
        } catch (Throwable th) {
            StatsDataSource statsDataSource2 = this.f9117i;
            int i2 = Util6.f6307a;
            if (statsDataSource2 != null) {
                try {
                    statsDataSource2.f5996a.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.Loader.e
    /* JADX INFO: renamed from: b */
    public void mo2910b() {
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.p245u0.MediaChunk
    /* JADX INFO: renamed from: d */
    public boolean mo4222d() {
        return this.f9165r;
    }
}
