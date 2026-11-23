package p007c.p190n.p194b.p209b.p243w1.p245u0;

import java.io.IOException;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.p210a2.DataSource3;
import p007c.p190n.p194b.p209b.p210a2.DataSpec;
import p007c.p190n.p194b.p209b.p210a2.StatsDataSource;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p221s1.DefaultExtractorInput;

/* JADX INFO: renamed from: c.n.b.b.w1.u0.l, reason: use source file name */
/* JADX INFO: compiled from: InitializationChunk.java */
/* JADX INFO: loaded from: classes.dex */
public final class InitializationChunk extends Chunk {

    /* JADX INFO: renamed from: j */
    public final ChunkExtractor f9156j;

    /* JADX INFO: renamed from: k */
    public ChunkExtractor.a f9157k;

    /* JADX INFO: renamed from: l */
    public long f9158l;

    /* JADX INFO: renamed from: m */
    public volatile boolean f9159m;

    public InitializationChunk(DataSource3 dataSource3, DataSpec dataSpec, Format format, int i, Object obj, ChunkExtractor chunkExtractor) {
        super(dataSource3, dataSpec, 2, format, i, obj, -9223372036854775807L, -9223372036854775807L);
        this.f9156j = chunkExtractor;
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.Loader.e
    /* JADX INFO: renamed from: a */
    public void mo2909a() throws IOException {
        if (this.f9158l == 0) {
            ((BundledChunkExtractor) this.f9156j).m4199b(this.f9157k, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            DataSpec dataSpecM3003d = this.f9110b.m3003d(this.f9158l);
            StatsDataSource statsDataSource = this.f9117i;
            DefaultExtractorInput defaultExtractorInput = new DefaultExtractorInput(statsDataSource, dataSpecM3003d.f6142f, statsDataSource.mo2913h(dataSpecM3003d));
            while (!this.f9159m && ((BundledChunkExtractor) this.f9156j).m4200c(defaultExtractorInput)) {
                try {
                } catch (Throwable th) {
                    this.f9158l = defaultExtractorInput.f7573d - this.f9110b.f6142f;
                    throw th;
                }
            }
            this.f9158l = defaultExtractorInput.f7573d - this.f9110b.f6142f;
            StatsDataSource statsDataSource2 = this.f9117i;
            int i = Util6.f6307a;
            if (statsDataSource2 != null) {
                try {
                    statsDataSource2.close();
                } catch (IOException unused) {
                }
            }
        } catch (Throwable th2) {
            StatsDataSource statsDataSource3 = this.f9117i;
            int i2 = Util6.f6307a;
            if (statsDataSource3 != null) {
                try {
                    statsDataSource3.close();
                } catch (IOException unused2) {
                }
            }
            throw th2;
        }
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.Loader.e
    /* JADX INFO: renamed from: b */
    public void mo2910b() {
        this.f9159m = true;
    }
}
