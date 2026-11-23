package p007c.p190n.p194b.p209b.p243w1.p245u0;

import java.io.IOException;
import java.util.List;
import p007c.p190n.p194b.p209b.SeekParameters;

/* JADX INFO: renamed from: c.n.b.b.w1.u0.i, reason: use source file name */
/* JADX INFO: compiled from: ChunkSource.java */
/* JADX INFO: loaded from: classes.dex */
public interface ChunkSource {
    /* JADX INFO: renamed from: a */
    void mo4214a() throws IOException;

    /* JADX INFO: renamed from: c */
    boolean mo4215c(long j2, Chunk chunk, List<? extends MediaChunk> list);

    /* JADX INFO: renamed from: e */
    boolean mo4216e(Chunk chunk, boolean z, Exception exc, long j2);

    /* JADX INFO: renamed from: f */
    long mo4217f(long j2, SeekParameters seekParameters);

    /* JADX INFO: renamed from: h */
    int mo4218h(long j2, List<? extends MediaChunk> list);

    /* JADX INFO: renamed from: i */
    void mo4219i(Chunk chunk);

    /* JADX INFO: renamed from: j */
    void mo4220j(long j2, long j3, List<? extends MediaChunk> list, ChunkHolder chunkHolder);

    void release();
}
