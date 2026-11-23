package p007c.p190n.p194b.p209b.p243w1.p245u0;

import java.io.IOException;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.p210a2.DataSource3;
import p007c.p190n.p194b.p209b.p210a2.DataSpec;
import p007c.p190n.p194b.p209b.p210a2.StatsDataSource;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p221s1.DefaultExtractorInput;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.w1.u0.j, reason: use source file name */
/* JADX INFO: compiled from: ContainerMediaChunk.java */
/* JADX INFO: loaded from: classes.dex */
public class ContainerMediaChunk extends BaseMediaChunk {

    /* JADX INFO: renamed from: o */
    public final int f9148o;

    /* JADX INFO: renamed from: p */
    public final long f9149p;

    /* JADX INFO: renamed from: q */
    public final ChunkExtractor f9150q;

    /* JADX INFO: renamed from: r */
    public long f9151r;

    /* JADX INFO: renamed from: s */
    public volatile boolean f9152s;

    /* JADX INFO: renamed from: t */
    public boolean f9153t;

    public ContainerMediaChunk(DataSource3 dataSource3, DataSpec dataSpec, Format format, int i, Object obj, long j2, long j3, long j4, long j5, long j6, int i2, long j7, ChunkExtractor chunkExtractor) {
        super(dataSource3, dataSpec, format, i, obj, j2, j3, j4, j5, j6);
        this.f9148o = i2;
        this.f9149p = j7;
        this.f9150q = chunkExtractor;
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.Loader.e
    /* JADX INFO: renamed from: a */
    public final void mo2909a() throws IOException {
        if (this.f9151r == 0) {
            BaseMediaChunkOutput baseMediaChunkOutput = this.f9087m;
            C2096e.m4572h(baseMediaChunkOutput);
            baseMediaChunkOutput.m4197a(this.f9149p);
            ChunkExtractor chunkExtractor = this.f9150q;
            long j2 = this.f9085k;
            long j3 = j2 == -9223372036854775807L ? -9223372036854775807L : j2 - this.f9149p;
            long j4 = this.f9086l;
            ((BundledChunkExtractor) chunkExtractor).m4199b(baseMediaChunkOutput, j3, j4 == -9223372036854775807L ? -9223372036854775807L : j4 - this.f9149p);
        }
        try {
            DataSpec dataSpecM3003d = this.f9110b.m3003d(this.f9151r);
            StatsDataSource statsDataSource = this.f9117i;
            DefaultExtractorInput defaultExtractorInput = new DefaultExtractorInput(statsDataSource, dataSpecM3003d.f6142f, statsDataSource.mo2913h(dataSpecM3003d));
            do {
                try {
                    if (this.f9152s) {
                        break;
                    }
                } catch (Throwable th) {
                    this.f9151r = defaultExtractorInput.f7573d - this.f9110b.f6142f;
                    throw th;
                }
            } while (((BundledChunkExtractor) this.f9150q).m4200c(defaultExtractorInput));
            this.f9151r = defaultExtractorInput.f7573d - this.f9110b.f6142f;
            StatsDataSource statsDataSource2 = this.f9117i;
            int i = Util6.f6307a;
            if (statsDataSource2 != null) {
                try {
                    statsDataSource2.f5996a.close();
                } catch (IOException unused) {
                }
            }
            this.f9153t = !this.f9152s;
        } catch (Throwable th2) {
            StatsDataSource statsDataSource3 = this.f9117i;
            int i2 = Util6.f6307a;
            if (statsDataSource3 != null) {
                try {
                    statsDataSource3.f5996a.close();
                } catch (IOException unused2) {
                }
            }
            throw th2;
        }
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.Loader.e
    /* JADX INFO: renamed from: b */
    public final void mo2910b() {
        this.f9152s = true;
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.p245u0.MediaChunk
    /* JADX INFO: renamed from: c */
    public long mo4221c() {
        return this.f9160j + ((long) this.f9148o);
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.p245u0.MediaChunk
    /* JADX INFO: renamed from: d */
    public boolean mo4222d() {
        return this.f9153t;
    }
}
