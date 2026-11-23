package p007c.p190n.p194b.p209b.p243w1.p246v0;

import com.google.android.exoplayer2.source.dash.DashMediaSource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p007c.p165l.p175i0.C1095a;
import p007c.p190n.p194b.p209b.C;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.SeekParameters;
import p007c.p190n.p194b.p209b.p210a2.DataSource3;
import p007c.p190n.p194b.p209b.p210a2.HttpDataSource;
import p007c.p190n.p194b.p209b.p210a2.LoaderErrorThrower;
import p007c.p190n.p194b.p209b.p210a2.TransferListener;
import p007c.p190n.p194b.p209b.p212b2.MimeTypes;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p221s1.ChunkIndex;
import p007c.p190n.p194b.p209b.p221s1.Extractor;
import p007c.p190n.p194b.p209b.p221s1.SeekMap;
import p007c.p190n.p194b.p209b.p221s1.TrackOutput2;
import p007c.p190n.p194b.p209b.p221s1.p226i0.MatroskaExtractor;
import p007c.p190n.p194b.p209b.p221s1.p228k0.FragmentedMp4Extractor;
import p007c.p190n.p194b.p209b.p221s1.p230m0.RawCcExtractor;
import p007c.p190n.p194b.p209b.p243w1.BehindLiveWindowException;
import p007c.p190n.p194b.p209b.p243w1.p245u0.BaseMediaChunkIterator;
import p007c.p190n.p194b.p209b.p243w1.p245u0.BundledChunkExtractor;
import p007c.p190n.p194b.p209b.p243w1.p245u0.Chunk;
import p007c.p190n.p194b.p209b.p243w1.p245u0.ChunkExtractor;
import p007c.p190n.p194b.p209b.p243w1.p245u0.ChunkHolder;
import p007c.p190n.p194b.p209b.p243w1.p245u0.ContainerMediaChunk;
import p007c.p190n.p194b.p209b.p243w1.p245u0.InitializationChunk;
import p007c.p190n.p194b.p209b.p243w1.p245u0.MediaChunk;
import p007c.p190n.p194b.p209b.p243w1.p245u0.MediaChunkIterator;
import p007c.p190n.p194b.p209b.p243w1.p245u0.SingleSampleMediaChunk;
import p007c.p190n.p194b.p209b.p243w1.p246v0.p247l.AdaptationSet;
import p007c.p190n.p194b.p209b.p243w1.p246v0.p247l.DashManifest;
import p007c.p190n.p194b.p209b.p243w1.p246v0.p247l.RangedUri;
import p007c.p190n.p194b.p209b.p243w1.p246v0.p247l.Representation;
import p007c.p190n.p194b.p209b.p262y1.ExoTrackSelection2;

/* JADX INFO: renamed from: c.n.b.b.w1.v0.i, reason: use source file name */
/* JADX INFO: compiled from: DefaultDashChunkSource.java */
/* JADX INFO: loaded from: classes.dex */
public class DefaultDashChunkSource implements DashChunkSource {

    /* JADX INFO: renamed from: a */
    public final LoaderErrorThrower f9203a;

    /* JADX INFO: renamed from: b */
    public final int[] f9204b;

    /* JADX INFO: renamed from: c */
    public final int f9205c;

    /* JADX INFO: renamed from: d */
    public final DataSource3 f9206d;

    /* JADX INFO: renamed from: e */
    public final long f9207e;

    /* JADX INFO: renamed from: f */
    public final int f9208f;

    /* JADX INFO: renamed from: g */
    public final PlayerEmsgHandler.c f9209g;

    /* JADX INFO: renamed from: h */
    public final b[] f9210h;

    /* JADX INFO: renamed from: i */
    public ExoTrackSelection2 f9211i;

    /* JADX INFO: renamed from: j */
    public DashManifest f9212j;

    /* JADX INFO: renamed from: k */
    public int f9213k;

    /* JADX INFO: renamed from: l */
    public IOException f9214l;

    /* JADX INFO: renamed from: m */
    public boolean f9215m;

    /* JADX INFO: renamed from: c.n.b.b.w1.v0.i$a */
    /* JADX INFO: compiled from: DefaultDashChunkSource.java */
    public static final class a implements DashChunkSource.a {

        /* JADX INFO: renamed from: a */
        public final DataSource3.a f9216a;

        /* JADX INFO: renamed from: b */
        public final int f9217b;

        public a(DataSource3.a aVar) {
            this(aVar, 1);
        }

        @Override // p007c.p190n.p194b.p209b.p243w1.p246v0.DashChunkSource.a
        /* JADX INFO: renamed from: a */
        public DashChunkSource mo4226a(LoaderErrorThrower loaderErrorThrower, DashManifest dashManifest, int i, int[] iArr, ExoTrackSelection2 exoTrackSelection2, int i2, long j2, boolean z, List<Format> list, PlayerEmsgHandler.c cVar, TransferListener transferListener) {
            DataSource3 dataSource3Mo2953a = this.f9216a.mo2953a();
            if (transferListener != null) {
                dataSource3Mo2953a.mo2915c(transferListener);
            }
            return new DefaultDashChunkSource(loaderErrorThrower, dashManifest, i, iArr, exoTrackSelection2, i2, dataSource3Mo2953a, j2, this.f9217b, z, list, cVar);
        }

        public a(DataSource3.a aVar, int i) {
            this.f9216a = aVar;
            this.f9217b = i;
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.w1.v0.i$c */
    /* JADX INFO: compiled from: DefaultDashChunkSource.java */
    public static final class c extends BaseMediaChunkIterator {
        public c(b bVar, long j2, long j3, long j4) {
            super(j2, j3);
        }
    }

    public DefaultDashChunkSource(LoaderErrorThrower loaderErrorThrower, DashManifest dashManifest, int i, int[] iArr, ExoTrackSelection2 exoTrackSelection2, int i2, DataSource3 dataSource3, long j2, int i3, boolean z, List<Format> list, PlayerEmsgHandler.c cVar) {
        this.f9203a = loaderErrorThrower;
        this.f9212j = dashManifest;
        this.f9204b = iArr;
        this.f9211i = exoTrackSelection2;
        this.f9205c = i2;
        this.f9206d = dataSource3;
        this.f9213k = i;
        this.f9207e = j2;
        this.f9208f = i3;
        this.f9209g = cVar;
        long jM3236b = C.m3236b(dashManifest.m4255d(i));
        ArrayList<Representation> arrayListM4241l = m4241l();
        this.f9210h = new b[exoTrackSelection2.length()];
        for (int i4 = 0; i4 < this.f9210h.length; i4++) {
            this.f9210h[i4] = new b(jM3236b, i2, arrayListM4241l.get(exoTrackSelection2.mo4517i(i4)), z, list, cVar);
        }
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.p245u0.ChunkSource
    /* JADX INFO: renamed from: a */
    public void mo4214a() throws IOException {
        IOException iOException = this.f9214l;
        if (iOException != null) {
            throw iOException;
        }
        this.f9203a.mo2896a();
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.p246v0.DashChunkSource
    /* JADX INFO: renamed from: b */
    public void mo4224b(ExoTrackSelection2 exoTrackSelection2) {
        this.f9211i = exoTrackSelection2;
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.p245u0.ChunkSource
    /* JADX INFO: renamed from: c */
    public boolean mo4215c(long j2, Chunk chunk, List<? extends MediaChunk> list) {
        if (this.f9214l != null) {
            return false;
        }
        return this.f9211i.mo4514d(j2, chunk, list);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0032  */
    @Override // p007c.p190n.p194b.p209b.p243w1.p245u0.ChunkSource
    /* JADX INFO: renamed from: e */
    public boolean mo4216e(Chunk chunk, boolean z, Exception exc, long j2) {
        b bVar;
        int iM4246d;
        boolean z2;
        if (!z) {
            return false;
        }
        PlayerEmsgHandler.c cVar = this.f9209g;
        if (cVar != null) {
            long j3 = cVar.f9246d;
            boolean z3 = j3 != -9223372036854775807L && j3 < chunk.f9115g;
            PlayerEmsgHandler playerEmsgHandler = PlayerEmsgHandler.this;
            if (playerEmsgHandler.f9236k.f9257d) {
                if (!playerEmsgHandler.f9239n) {
                    if (z3) {
                        playerEmsgHandler.m4252a();
                    } else {
                        z2 = false;
                    }
                }
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                return true;
            }
        }
        if (!this.f9212j.f9257d && (chunk instanceof MediaChunk) && (exc instanceof HttpDataSource.f) && ((HttpDataSource.f) exc).f6242f == 404 && (iM4246d = (bVar = this.f9210h[this.f9211i.mo4518k(chunk.f9112d)]).m4246d()) != -1 && iM4246d != 0) {
            if (((MediaChunk) chunk).mo4221c() > ((bVar.f9220c.mo4237h() + bVar.f9222e) + ((long) iM4246d)) - 1) {
                this.f9215m = true;
                return true;
            }
        }
        if (j2 == -9223372036854775807L) {
            return false;
        }
        ExoTrackSelection2 exoTrackSelection2 = this.f9211i;
        return exoTrackSelection2.mo4513c(exoTrackSelection2.mo4518k(chunk.f9112d), j2);
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.p245u0.ChunkSource
    /* JADX INFO: renamed from: f */
    public long mo4217f(long j2, SeekParameters seekParameters) {
        for (b bVar : this.f9210h) {
            DashSegmentIndex dashSegmentIndex = bVar.f9220c;
            if (dashSegmentIndex != null) {
                long jMo4235f = dashSegmentIndex.mo4235f(j2, bVar.f9221d) + bVar.f9222e;
                long jM4248f = bVar.m4248f(jMo4235f);
                int iM4246d = bVar.m4246d();
                return seekParameters.m3454a(j2, jM4248f, (jM4248f >= j2 || (iM4246d != -1 && jMo4235f >= ((bVar.f9220c.mo4237h() + bVar.f9222e) + ((long) iM4246d)) - 1)) ? jM4248f : bVar.m4248f(jMo4235f + 1));
            }
        }
        return j2;
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.p246v0.DashChunkSource
    /* JADX INFO: renamed from: g */
    public void mo4225g(DashManifest dashManifest, int i) {
        try {
            this.f9212j = dashManifest;
            this.f9213k = i;
            long jM4256e = dashManifest.m4256e(i);
            ArrayList<Representation> arrayListM4241l = m4241l();
            for (int i2 = 0; i2 < this.f9210h.length; i2++) {
                Representation representation = arrayListM4241l.get(this.f9211i.mo4517i(i2));
                b[] bVarArr = this.f9210h;
                bVarArr[i2] = bVarArr[i2].m4243a(jM4256e, representation);
            }
        } catch (BehindLiveWindowException e) {
            this.f9214l = e;
        }
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.p245u0.ChunkSource
    /* JADX INFO: renamed from: h */
    public int mo4218h(long j2, List<? extends MediaChunk> list) {
        return (this.f9214l != null || this.f9211i.length() < 2) ? list.size() : this.f9211i.mo4508j(j2, list);
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.p245u0.ChunkSource
    /* JADX INFO: renamed from: i */
    public void mo4219i(Chunk chunk) {
        if (chunk instanceof InitializationChunk) {
            int iMo4518k = this.f9211i.mo4518k(((InitializationChunk) chunk).f9112d);
            b[] bVarArr = this.f9210h;
            b bVar = bVarArr[iMo4518k];
            if (bVar.f9220c == null) {
                SeekMap seekMap = ((BundledChunkExtractor) bVar.f9218a).f9100n;
                ChunkIndex chunkIndex = seekMap instanceof ChunkIndex ? (ChunkIndex) seekMap : null;
                if (chunkIndex != null) {
                    bVarArr[iMo4518k] = new b(bVar.f9221d, bVar.f9219b, bVar.f9218a, bVar.f9222e, new DashWrappingSegmentIndex(chunkIndex, bVar.f9219b.f9301c));
                }
            }
        }
        PlayerEmsgHandler.c cVar = this.f9209g;
        if (cVar != null) {
            long j2 = cVar.f9246d;
            if (j2 == -9223372036854775807L || chunk.f9116h > j2) {
                cVar.f9246d = chunk.f9116h;
            }
            PlayerEmsgHandler.this.f9238m = true;
        }
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.p245u0.ChunkSource
    /* JADX INFO: renamed from: j */
    public void mo4220j(long j2, long j3, List<? extends MediaChunk> list, ChunkHolder chunkHolder) {
        DataSource3 dataSource3;
        Chunk containerMediaChunk;
        ChunkHolder chunkHolder2;
        int i;
        MediaChunkIterator[] mediaChunkIteratorArr;
        int i2;
        long j4;
        long j5;
        long j6;
        boolean z;
        if (this.f9214l != null) {
            return;
        }
        long j7 = j3 - j2;
        long jM3236b = C.m3236b(this.f9212j.m4253b(this.f9213k).f9287b) + C.m3236b(this.f9212j.f9254a) + j3;
        PlayerEmsgHandler.c cVar = this.f9209g;
        if (cVar != null) {
            PlayerEmsgHandler playerEmsgHandler = PlayerEmsgHandler.this;
            DashManifest dashManifest = playerEmsgHandler.f9236k;
            if (!dashManifest.f9257d) {
                z = false;
            } else if (playerEmsgHandler.f9239n) {
                z = true;
            } else {
                Map.Entry<Long, Long> entryCeilingEntry = playerEmsgHandler.f9235j.ceilingEntry(Long.valueOf(dashManifest.f9261h));
                if (entryCeilingEntry == null || entryCeilingEntry.getValue().longValue() >= jM3236b) {
                    z = false;
                } else {
                    long jLongValue = entryCeilingEntry.getKey().longValue();
                    playerEmsgHandler.f9237l = jLongValue;
                    DashMediaSource dashMediaSource = DashMediaSource.this;
                    long j8 = dashMediaSource.f28328Q;
                    if (j8 == -9223372036854775807L || j8 < jLongValue) {
                        dashMediaSource.f28328Q = jLongValue;
                    }
                    z = true;
                }
                if (z) {
                    playerEmsgHandler.m4252a();
                }
            }
            if (z) {
                return;
            }
        }
        long jM3236b2 = C.m3236b(Util6.m3135w(this.f9207e));
        long jM4240k = m4240k(jM3236b2);
        MediaChunk mediaChunk = list.isEmpty() ? null : list.get(list.size() - 1);
        int length = this.f9211i.length();
        MediaChunkIterator[] mediaChunkIteratorArr2 = new MediaChunkIterator[length];
        int i3 = 0;
        while (i3 < length) {
            b bVar = this.f9210h[i3];
            if (bVar.f9220c == null) {
                mediaChunkIteratorArr2[i3] = MediaChunkIterator.f9161a;
                i = i3;
                mediaChunkIteratorArr = mediaChunkIteratorArr2;
                i2 = length;
                j4 = jM4240k;
                j5 = j7;
                j6 = jM3236b2;
            } else {
                long jM4244b = bVar.m4244b(jM3236b2);
                long jM4245c = bVar.m4245c(jM3236b2);
                i = i3;
                mediaChunkIteratorArr = mediaChunkIteratorArr2;
                i2 = length;
                j4 = jM4240k;
                j5 = j7;
                j6 = jM3236b2;
                long jM4242m = m4242m(bVar, mediaChunk, j3, jM4244b, jM4245c);
                if (jM4242m < jM4244b) {
                    mediaChunkIteratorArr[i] = MediaChunkIterator.f9161a;
                } else {
                    mediaChunkIteratorArr[i] = new c(bVar, jM4242m, jM4245c, j4);
                }
            }
            i3 = i + 1;
            jM3236b2 = j6;
            mediaChunkIteratorArr2 = mediaChunkIteratorArr;
            length = i2;
            jM4240k = j4;
            j7 = j5;
        }
        long j9 = jM4240k;
        long j10 = jM3236b2;
        this.f9211i.mo4303l(j2, j7, !this.f9212j.f9257d ? -9223372036854775807L : Math.max(0L, Math.min(m4240k(j10), this.f9210h[0].m4247e(this.f9210h[0].m4245c(j10))) - j2), list, mediaChunkIteratorArr2);
        b bVar2 = this.f9210h[this.f9211i.mo4302b()];
        ChunkExtractor chunkExtractor = bVar2.f9218a;
        if (chunkExtractor != null) {
            Representation representation = bVar2.f9219b;
            RangedUri rangedUri = ((BundledChunkExtractor) chunkExtractor).f9101o == null ? representation.f9303e : null;
            RangedUri rangedUriMo4285m = bVar2.f9220c == null ? representation.mo4285m() : null;
            if (rangedUri != null || rangedUriMo4285m != null) {
                DataSource3 dataSource4 = this.f9206d;
                Format formatMo4520n = this.f9211i.mo4520n();
                int iMo4304o = this.f9211i.mo4304o();
                Object objMo4305q = this.f9211i.mo4305q();
                Representation representation2 = bVar2.f9219b;
                if (rangedUri == null || (rangedUriMo4285m = rangedUri.m4282a(rangedUriMo4285m, representation2.f9300b)) != null) {
                    rangedUri = rangedUriMo4285m;
                }
                chunkHolder.f9118a = new InitializationChunk(dataSource4, C1095a.m2388d(representation2, rangedUri, 0), formatMo4520n, iMo4304o, objMo4305q, bVar2.f9218a);
                return;
            }
        }
        long j11 = bVar2.f9221d;
        boolean z2 = j11 != -9223372036854775807L;
        if (bVar2.m4246d() == 0) {
            chunkHolder.f9119b = z2;
            return;
        }
        long jM4244b2 = bVar2.m4244b(j10);
        long jM4245c2 = bVar2.m4245c(j10);
        long jM4242m2 = m4242m(bVar2, mediaChunk, j3, jM4244b2, jM4245c2);
        if (jM4242m2 < jM4244b2) {
            this.f9214l = new BehindLiveWindowException();
            return;
        }
        if (jM4242m2 > jM4245c2 || (this.f9215m && jM4242m2 >= jM4245c2)) {
            chunkHolder.f9119b = z2;
            return;
        }
        if (z2 && bVar2.m4248f(jM4242m2) >= j11) {
            chunkHolder.f9119b = true;
            return;
        }
        int iMin = (int) Math.min(this.f9208f, (jM4245c2 - jM4242m2) + 1);
        if (j11 != -9223372036854775807L) {
            while (iMin > 1 && bVar2.m4248f((((long) iMin) + jM4242m2) - 1) >= j11) {
                iMin--;
            }
        }
        long j12 = list.isEmpty() ? j3 : -9223372036854775807L;
        DataSource3 dataSource5 = this.f9206d;
        int i4 = this.f9205c;
        Format formatMo4520n2 = this.f9211i.mo4520n();
        int iMo4304o2 = this.f9211i.mo4304o();
        Object objMo4305q2 = this.f9211i.mo4305q();
        Representation representation3 = bVar2.f9219b;
        long jMo4230a = bVar2.f9220c.mo4230a(jM4242m2 - bVar2.f9222e);
        RangedUri rangedUriMo4234e = bVar2.f9220c.mo4234e(jM4242m2 - bVar2.f9222e);
        String str = representation3.f9300b;
        if (bVar2.f9218a == null) {
            containerMediaChunk = new SingleSampleMediaChunk(dataSource5, C1095a.m2388d(representation3, rangedUriMo4234e, bVar2.m4249g(jM4242m2, j9) ? 0 : 8), formatMo4520n2, iMo4304o2, objMo4305q2, jMo4230a, bVar2.m4247e(jM4242m2), jM4242m2, i4, formatMo4520n2);
            chunkHolder2 = chunkHolder;
        } else {
            int i5 = 1;
            int i6 = 1;
            while (true) {
                if (i5 >= iMin) {
                    dataSource3 = dataSource5;
                    break;
                }
                dataSource3 = dataSource5;
                int i7 = iMin;
                RangedUri rangedUriM4282a = rangedUriMo4234e.m4282a(bVar2.f9220c.mo4234e((((long) i5) + jM4242m2) - bVar2.f9222e), str);
                if (rangedUriM4282a == null) {
                    break;
                }
                i6++;
                i5++;
                rangedUriMo4234e = rangedUriM4282a;
                dataSource5 = dataSource3;
                iMin = i7;
            }
            long j13 = (((long) i6) + jM4242m2) - 1;
            long jM4247e = bVar2.m4247e(j13);
            long j14 = bVar2.f9221d;
            containerMediaChunk = new ContainerMediaChunk(dataSource3, C1095a.m2388d(representation3, rangedUriMo4234e, bVar2.m4249g(j13, j9) ? 0 : 8), formatMo4520n2, iMo4304o2, objMo4305q2, jMo4230a, jM4247e, j12, (j14 == -9223372036854775807L || j14 > jM4247e) ? -9223372036854775807L : j14, jM4242m2, i6, -representation3.f9301c, bVar2.f9218a);
            chunkHolder2 = chunkHolder;
        }
        chunkHolder2.f9118a = containerMediaChunk;
    }

    /* JADX INFO: renamed from: k */
    public final long m4240k(long j2) {
        DashManifest dashManifest = this.f9212j;
        long j3 = dashManifest.f9254a;
        if (j3 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j2 - C.m3236b(j3 + dashManifest.m4253b(this.f9213k).f9287b);
    }

    /* JADX INFO: renamed from: l */
    public final ArrayList<Representation> m4241l() {
        List<AdaptationSet> list = this.f9212j.m4253b(this.f9213k).f9288c;
        ArrayList<Representation> arrayList = new ArrayList<>();
        for (int i : this.f9204b) {
            arrayList.addAll(list.get(i).f9250c);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: m */
    public final long m4242m(b bVar, MediaChunk mediaChunk, long j2, long j3, long j4) {
        return mediaChunk != null ? mediaChunk.mo4221c() : Util6.m3122j(bVar.f9220c.mo4235f(j2, bVar.f9221d) + bVar.f9222e, j3, j4);
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.p245u0.ChunkSource
    public void release() {
        for (b bVar : this.f9210h) {
            ChunkExtractor chunkExtractor = bVar.f9218a;
            if (chunkExtractor != null) {
                ((BundledChunkExtractor) chunkExtractor).f9093g.release();
            }
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.w1.v0.i$b */
    /* JADX INFO: compiled from: DefaultDashChunkSource.java */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final ChunkExtractor f9218a;

        /* JADX INFO: renamed from: b */
        public final Representation f9219b;

        /* JADX INFO: renamed from: c */
        public final DashSegmentIndex f9220c;

        /* JADX INFO: renamed from: d */
        public final long f9221d;

        /* JADX INFO: renamed from: e */
        public final long f9222e;

        public b(long j2, Representation representation, ChunkExtractor chunkExtractor, long j3, DashSegmentIndex dashSegmentIndex) {
            this.f9221d = j2;
            this.f9219b = representation;
            this.f9222e = j3;
            this.f9218a = chunkExtractor;
            this.f9220c = dashSegmentIndex;
        }

        /* JADX INFO: renamed from: a */
        public b m4243a(long j2, Representation representation) throws BehindLiveWindowException {
            long jMo4235f;
            DashSegmentIndex dashSegmentIndexMo4284l = this.f9219b.mo4284l();
            DashSegmentIndex dashSegmentIndexMo4284l2 = representation.mo4284l();
            if (dashSegmentIndexMo4284l == null) {
                return new b(j2, representation, this.f9218a, this.f9222e, dashSegmentIndexMo4284l);
            }
            if (!dashSegmentIndexMo4284l.mo4236g()) {
                return new b(j2, representation, this.f9218a, this.f9222e, dashSegmentIndexMo4284l2);
            }
            int iMo4238i = dashSegmentIndexMo4284l.mo4238i(j2);
            if (iMo4238i == 0) {
                return new b(j2, representation, this.f9218a, this.f9222e, dashSegmentIndexMo4284l2);
            }
            long jMo4237h = dashSegmentIndexMo4284l.mo4237h();
            long jMo4230a = dashSegmentIndexMo4284l.mo4230a(jMo4237h);
            long j3 = (((long) iMo4238i) + jMo4237h) - 1;
            long jMo4231b = dashSegmentIndexMo4284l.mo4231b(j3, j2) + dashSegmentIndexMo4284l.mo4230a(j3);
            long jMo4237h2 = dashSegmentIndexMo4284l2.mo4237h();
            long jMo4230a2 = dashSegmentIndexMo4284l2.mo4230a(jMo4237h2);
            long j4 = this.f9222e;
            if (jMo4231b == jMo4230a2) {
                jMo4235f = ((j3 + 1) - jMo4237h2) + j4;
            } else {
                if (jMo4231b < jMo4230a2) {
                    throw new BehindLiveWindowException();
                }
                jMo4235f = jMo4230a2 < jMo4230a ? j4 - (dashSegmentIndexMo4284l2.mo4235f(jMo4230a, j2) - jMo4237h) : (dashSegmentIndexMo4284l.mo4235f(jMo4230a2, j2) - jMo4237h2) + j4;
            }
            return new b(j2, representation, this.f9218a, jMo4235f, dashSegmentIndexMo4284l2);
        }

        /* JADX INFO: renamed from: b */
        public long m4244b(long j2) {
            return this.f9220c.mo4232c(this.f9221d, j2) + this.f9222e;
        }

        /* JADX INFO: renamed from: c */
        public long m4245c(long j2) {
            return ((this.f9220c.mo4232c(this.f9221d, j2) + this.f9222e) + ((long) this.f9220c.mo4239j(this.f9221d, j2))) - 1;
        }

        /* JADX INFO: renamed from: d */
        public int m4246d() {
            return this.f9220c.mo4238i(this.f9221d);
        }

        /* JADX INFO: renamed from: e */
        public long m4247e(long j2) {
            return this.f9220c.mo4231b(j2 - this.f9222e, this.f9221d) + this.f9220c.mo4230a(j2 - this.f9222e);
        }

        /* JADX INFO: renamed from: f */
        public long m4248f(long j2) {
            return this.f9220c.mo4230a(j2 - this.f9222e);
        }

        /* JADX INFO: renamed from: g */
        public boolean m4249g(long j2, long j3) {
            return j3 == -9223372036854775807L || m4247e(j2) <= j3;
        }

        public b(long j2, int i, Representation representation, boolean z, List<Format> list, TrackOutput2 trackOutput2) {
            Extractor fragmentedMp4Extractor;
            BundledChunkExtractor bundledChunkExtractor;
            String str = representation.f9299a.f6933p;
            if (MimeTypes.m3170l(str)) {
                if ("application/x-rawcc".equals(str)) {
                    fragmentedMp4Extractor = new RawCcExtractor(representation.f9299a);
                } else {
                    bundledChunkExtractor = null;
                }
                DashSegmentIndex dashSegmentIndexMo4284l = representation.mo4284l();
                this.f9221d = j2;
                this.f9219b = representation;
                this.f9222e = 0L;
                this.f9218a = bundledChunkExtractor;
                this.f9220c = dashSegmentIndexMo4284l;
            }
            if (str != null && (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska"))) {
                fragmentedMp4Extractor = new MatroskaExtractor(1);
            } else {
                fragmentedMp4Extractor = new FragmentedMp4Extractor(z ? 4 : 0, null, null, list, trackOutput2);
            }
            bundledChunkExtractor = new BundledChunkExtractor(fragmentedMp4Extractor, i, representation.f9299a);
            DashSegmentIndex dashSegmentIndexMo4284l2 = representation.mo4284l();
            this.f9221d = j2;
            this.f9219b = representation;
            this.f9222e = 0L;
            this.f9218a = bundledChunkExtractor;
            this.f9220c = dashSegmentIndexMo4284l2;
        }
    }
}
