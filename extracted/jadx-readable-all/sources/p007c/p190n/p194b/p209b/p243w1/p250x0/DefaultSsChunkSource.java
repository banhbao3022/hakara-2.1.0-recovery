package p007c.p190n.p194b.p209b.p243w1.p250x0;

import java.io.IOException;
import java.util.List;
import java.util.Objects;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.SeekParameters;
import p007c.p190n.p194b.p209b.p210a2.DataSource3;
import p007c.p190n.p194b.p209b.p210a2.DataSpec;
import p007c.p190n.p194b.p209b.p210a2.LoaderErrorThrower;
import p007c.p190n.p194b.p209b.p210a2.TransferListener;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p221s1.p228k0.FragmentedMp4Extractor;
import p007c.p190n.p194b.p209b.p221s1.p228k0.Track;
import p007c.p190n.p194b.p209b.p221s1.p228k0.TrackEncryptionBox;
import p007c.p190n.p194b.p209b.p243w1.BehindLiveWindowException;
import p007c.p190n.p194b.p209b.p243w1.p245u0.BaseMediaChunkIterator;
import p007c.p190n.p194b.p209b.p243w1.p245u0.BundledChunkExtractor;
import p007c.p190n.p194b.p209b.p243w1.p245u0.Chunk;
import p007c.p190n.p194b.p209b.p243w1.p245u0.ChunkExtractor;
import p007c.p190n.p194b.p209b.p243w1.p245u0.ChunkHolder;
import p007c.p190n.p194b.p209b.p243w1.p245u0.ContainerMediaChunk;
import p007c.p190n.p194b.p209b.p243w1.p245u0.MediaChunk;
import p007c.p190n.p194b.p209b.p243w1.p245u0.MediaChunkIterator;
import p007c.p190n.p194b.p209b.p243w1.p250x0.p251f.SsManifest;
import p007c.p190n.p194b.p209b.p262y1.ExoTrackSelection2;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.w1.x0.c, reason: use source file name */
/* JADX INFO: compiled from: DefaultSsChunkSource.java */
/* JADX INFO: loaded from: classes.dex */
public class DefaultSsChunkSource implements SsChunkSource {

    /* JADX INFO: renamed from: a */
    public final LoaderErrorThrower f9675a;

    /* JADX INFO: renamed from: b */
    public final int f9676b;

    /* JADX INFO: renamed from: c */
    public final ChunkExtractor[] f9677c;

    /* JADX INFO: renamed from: d */
    public final DataSource3 f9678d;

    /* JADX INFO: renamed from: e */
    public ExoTrackSelection2 f9679e;

    /* JADX INFO: renamed from: f */
    public SsManifest f9680f;

    /* JADX INFO: renamed from: g */
    public int f9681g;

    /* JADX INFO: renamed from: h */
    public IOException f9682h;

    /* JADX INFO: renamed from: c.n.b.b.w1.x0.c$a */
    /* JADX INFO: compiled from: DefaultSsChunkSource.java */
    public static final class a implements SsChunkSource.a {

        /* JADX INFO: renamed from: a */
        public final DataSource3.a f9683a;

        public a(DataSource3.a aVar) {
            this.f9683a = aVar;
        }

        @Override // p007c.p190n.p194b.p209b.p243w1.p250x0.SsChunkSource.a
        /* JADX INFO: renamed from: a */
        public SsChunkSource mo4370a(LoaderErrorThrower loaderErrorThrower, SsManifest ssManifest, int i, ExoTrackSelection2 exoTrackSelection2, TransferListener transferListener) {
            DataSource3 dataSource3Mo2953a = this.f9683a.mo2953a();
            if (transferListener != null) {
                dataSource3Mo2953a.mo2915c(transferListener);
            }
            return new DefaultSsChunkSource(loaderErrorThrower, ssManifest, i, exoTrackSelection2, dataSource3Mo2953a);
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.w1.x0.c$b */
    /* JADX INFO: compiled from: DefaultSsChunkSource.java */
    public static final class b extends BaseMediaChunkIterator {
        public b(SsManifest.b bVar, int i, int i2) {
            super(i2, bVar.f9719k - 1);
        }
    }

    public DefaultSsChunkSource(LoaderErrorThrower loaderErrorThrower, SsManifest ssManifest, int i, ExoTrackSelection2 exoTrackSelection2, DataSource3 dataSource3) {
        TrackEncryptionBox[] trackEncryptionBoxArr;
        this.f9675a = loaderErrorThrower;
        this.f9680f = ssManifest;
        this.f9676b = i;
        this.f9679e = exoTrackSelection2;
        this.f9678d = dataSource3;
        SsManifest.b bVar = ssManifest.f9703f[i];
        this.f9677c = new ChunkExtractor[exoTrackSelection2.length()];
        int i2 = 0;
        while (i2 < this.f9677c.length) {
            int iMo4517i = exoTrackSelection2.mo4517i(i2);
            Format format = bVar.f9718j[iMo4517i];
            if (format.f6937t != null) {
                SsManifest.a aVar = ssManifest.f9702e;
                Objects.requireNonNull(aVar);
                trackEncryptionBoxArr = aVar.f9708c;
            } else {
                trackEncryptionBoxArr = null;
            }
            int i3 = bVar.f9709a;
            int i4 = i2;
            this.f9677c[i4] = new BundledChunkExtractor(new FragmentedMp4Extractor(3, null, new Track(iMo4517i, i3, bVar.f9711c, -9223372036854775807L, ssManifest.f9704g, format, 0, trackEncryptionBoxArr, i3 == 2 ? 4 : 0, null, null)), bVar.f9709a, format);
            i2 = i4 + 1;
        }
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.p245u0.ChunkSource
    /* JADX INFO: renamed from: a */
    public void mo4214a() throws IOException {
        IOException iOException = this.f9682h;
        if (iOException != null) {
            throw iOException;
        }
        this.f9675a.mo2896a();
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.p250x0.SsChunkSource
    /* JADX INFO: renamed from: b */
    public void mo4368b(ExoTrackSelection2 exoTrackSelection2) {
        this.f9679e = exoTrackSelection2;
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.p245u0.ChunkSource
    /* JADX INFO: renamed from: c */
    public boolean mo4215c(long j2, Chunk chunk, List<? extends MediaChunk> list) {
        if (this.f9682h != null) {
            return false;
        }
        return this.f9679e.mo4514d(j2, chunk, list);
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.p250x0.SsChunkSource
    /* JADX INFO: renamed from: d */
    public void mo4369d(SsManifest ssManifest) {
        SsManifest.b[] bVarArr = this.f9680f.f9703f;
        int i = this.f9676b;
        SsManifest.b bVar = bVarArr[i];
        int i2 = bVar.f9719k;
        SsManifest.b bVar2 = ssManifest.f9703f[i];
        if (i2 == 0 || bVar2.f9719k == 0) {
            this.f9681g += i2;
        } else {
            int i3 = i2 - 1;
            long jM4372b = bVar.m4372b(i3) + bVar.f9723o[i3];
            long j2 = bVar2.f9723o[0];
            if (jM4372b <= j2) {
                this.f9681g += i2;
            } else {
                this.f9681g = bVar.m4373c(j2) + this.f9681g;
            }
        }
        this.f9680f = ssManifest;
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.p245u0.ChunkSource
    /* JADX INFO: renamed from: e */
    public boolean mo4216e(Chunk chunk, boolean z, Exception exc, long j2) {
        if (z && j2 != -9223372036854775807L) {
            ExoTrackSelection2 exoTrackSelection2 = this.f9679e;
            if (exoTrackSelection2.mo4513c(exoTrackSelection2.mo4518k(chunk.f9112d), j2)) {
                return true;
            }
        }
        return false;
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.p245u0.ChunkSource
    /* JADX INFO: renamed from: f */
    public long mo4217f(long j2, SeekParameters seekParameters) {
        SsManifest.b bVar = this.f9680f.f9703f[this.f9676b];
        int iM3118f = Util6.m3118f(bVar.f9723o, j2, true, true);
        long[] jArr = bVar.f9723o;
        long j3 = jArr[iM3118f];
        return seekParameters.m3454a(j2, j3, (j3 >= j2 || iM3118f >= bVar.f9719k - 1) ? j3 : jArr[iM3118f + 1]);
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.p245u0.ChunkSource
    /* JADX INFO: renamed from: h */
    public int mo4218h(long j2, List<? extends MediaChunk> list) {
        return (this.f9682h != null || this.f9679e.length() < 2) ? list.size() : this.f9679e.mo4508j(j2, list);
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.p245u0.ChunkSource
    /* JADX INFO: renamed from: i */
    public void mo4219i(Chunk chunk) {
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.p245u0.ChunkSource
    /* JADX INFO: renamed from: j */
    public final void mo4220j(long j2, long j3, List<? extends MediaChunk> list, ChunkHolder chunkHolder) {
        int iMo4221c;
        long jM4372b;
        if (this.f9682h != null) {
            return;
        }
        SsManifest ssManifest = this.f9680f;
        SsManifest.b bVar = ssManifest.f9703f[this.f9676b];
        if (bVar.f9719k == 0) {
            chunkHolder.f9119b = !ssManifest.f9701d;
            return;
        }
        if (list.isEmpty()) {
            iMo4221c = Util6.m3118f(bVar.f9723o, j3, true, true);
        } else {
            iMo4221c = (int) (list.get(list.size() - 1).mo4221c() - ((long) this.f9681g));
            if (iMo4221c < 0) {
                this.f9682h = new BehindLiveWindowException();
                return;
            }
        }
        int i = iMo4221c;
        if (i >= bVar.f9719k) {
            chunkHolder.f9119b = !this.f9680f.f9701d;
            return;
        }
        long j4 = j3 - j2;
        SsManifest ssManifest2 = this.f9680f;
        if (ssManifest2.f9701d) {
            SsManifest.b bVar2 = ssManifest2.f9703f[this.f9676b];
            int i2 = bVar2.f9719k - 1;
            jM4372b = (bVar2.m4372b(i2) + bVar2.f9723o[i2]) - j2;
        } else {
            jM4372b = -9223372036854775807L;
        }
        int length = this.f9679e.length();
        MediaChunkIterator[] mediaChunkIteratorArr = new MediaChunkIterator[length];
        for (int i3 = 0; i3 < length; i3++) {
            mediaChunkIteratorArr[i3] = new b(bVar, this.f9679e.mo4517i(i3), i);
        }
        this.f9679e.mo4303l(j2, j4, jM4372b, list, mediaChunkIteratorArr);
        long j5 = bVar.f9723o[i];
        long jM4372b2 = bVar.m4372b(i) + j5;
        long j6 = list.isEmpty() ? j3 : -9223372036854775807L;
        int i4 = i + this.f9681g;
        int iMo4302b = this.f9679e.mo4302b();
        ChunkExtractor chunkExtractor = this.f9677c[iMo4302b];
        int iMo4517i = this.f9679e.mo4517i(iMo4302b);
        C2096e.m4570f(bVar.f9718j != null);
        C2096e.m4570f(bVar.f9722n != null);
        C2096e.m4570f(i < bVar.f9722n.size());
        String string = Integer.toString(bVar.f9718j[iMo4517i].f6930m);
        String string2 = bVar.f9722n.get(i).toString();
        chunkHolder.f9118a = new ContainerMediaChunk(this.f9678d, new DataSpec(C2096e.m4586v(bVar.f9720l, bVar.f9721m.replace("{bitrate}", string).replace("{Bitrate}", string).replace("{start time}", string2).replace("{start_time}", string2))), this.f9679e.mo4520n(), this.f9679e.mo4304o(), this.f9679e.mo4305q(), j5, jM4372b2, j6, -9223372036854775807L, i4, 1, j5, chunkExtractor);
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.p245u0.ChunkSource
    public void release() {
        for (ChunkExtractor chunkExtractor : this.f9677c) {
            ((BundledChunkExtractor) chunkExtractor).f9093g.release();
        }
    }
}
