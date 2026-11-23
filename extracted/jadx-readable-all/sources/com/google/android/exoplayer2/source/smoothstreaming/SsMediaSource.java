package com.google.android.exoplayer2.source.smoothstreaming;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import p007c.p190n.p194b.p209b.C;
import p007c.p190n.p194b.p209b.ExoPlayerLibraryInfo;
import p007c.p190n.p194b.p209b.MediaItem2;
import p007c.p190n.p194b.p209b.p210a2.Allocator;
import p007c.p190n.p194b.p209b.p210a2.DataSource3;
import p007c.p190n.p194b.p209b.p210a2.DataSpec;
import p007c.p190n.p194b.p209b.p210a2.DefaultLoadErrorHandlingPolicy;
import p007c.p190n.p194b.p209b.p210a2.LoadErrorHandlingPolicy;
import p007c.p190n.p194b.p209b.p210a2.Loader;
import p007c.p190n.p194b.p209b.p210a2.LoaderErrorThrower;
import p007c.p190n.p194b.p209b.p210a2.ParsingLoadable;
import p007c.p190n.p194b.p209b.p210a2.StatsDataSource;
import p007c.p190n.p194b.p209b.p210a2.TransferListener;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p218q1.DefaultDrmSessionManagerProvider;
import p007c.p190n.p194b.p209b.p218q1.DrmSessionManager2;
import p007c.p190n.p194b.p209b.p218q1.DrmSessionManagerProvider;
import p007c.p190n.p194b.p209b.p242v1.StreamKey;
import p007c.p190n.p194b.p209b.p243w1.BaseMediaSource;
import p007c.p190n.p194b.p209b.p243w1.CompositeSequenceableLoaderFactory;
import p007c.p190n.p194b.p209b.p243w1.DefaultCompositeSequenceableLoaderFactory;
import p007c.p190n.p194b.p209b.p243w1.LoadEventInfo;
import p007c.p190n.p194b.p209b.p243w1.MediaLoadData;
import p007c.p190n.p194b.p209b.p243w1.MediaPeriod;
import p007c.p190n.p194b.p209b.p243w1.MediaSource2;
import p007c.p190n.p194b.p209b.p243w1.MediaSourceEventListener;
import p007c.p190n.p194b.p209b.p243w1.MediaSourceFactory;
import p007c.p190n.p194b.p209b.p243w1.SinglePeriodTimeline;
import p007c.p190n.p194b.p209b.p243w1.p245u0.ChunkSampleStream;
import p007c.p190n.p194b.p209b.p243w1.p250x0.DefaultSsChunkSource;
import p007c.p190n.p194b.p209b.p243w1.p250x0.SsChunkSource;
import p007c.p190n.p194b.p209b.p243w1.p250x0.SsMediaPeriod;
import p007c.p190n.p194b.p209b.p243w1.p250x0.p251f.SsManifest;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: loaded from: classes.dex */
public final class SsMediaSource extends BaseMediaSource implements Loader.b<ParsingLoadable<SsManifest>> {

    /* JADX INFO: renamed from: A */
    public LoaderErrorThrower f28393A;

    /* JADX INFO: renamed from: B */
    public TransferListener f28394B;

    /* JADX INFO: renamed from: C */
    public long f28395C;

    /* JADX INFO: renamed from: D */
    public SsManifest f28396D;

    /* JADX INFO: renamed from: E */
    public Handler f28397E;

    /* JADX INFO: renamed from: l */
    public final boolean f28398l;

    /* JADX INFO: renamed from: m */
    public final Uri f28399m;

    /* JADX INFO: renamed from: n */
    public final MediaItem2.g f28400n;

    /* JADX INFO: renamed from: o */
    public final MediaItem2 f28401o;

    /* JADX INFO: renamed from: p */
    public final DataSource3.a f28402p;

    /* JADX INFO: renamed from: q */
    public final SsChunkSource.a f28403q;

    /* JADX INFO: renamed from: r */
    public final CompositeSequenceableLoaderFactory f28404r;

    /* JADX INFO: renamed from: s */
    public final DrmSessionManager2 f28405s;

    /* JADX INFO: renamed from: t */
    public final LoadErrorHandlingPolicy f28406t;

    /* JADX INFO: renamed from: u */
    public final long f28407u;

    /* JADX INFO: renamed from: v */
    public final MediaSourceEventListener.a f28408v;

    /* JADX INFO: renamed from: w */
    public final ParsingLoadable.a<? extends SsManifest> f28409w;

    /* JADX INFO: renamed from: x */
    public final ArrayList<SsMediaPeriod> f28410x;

    /* JADX INFO: renamed from: y */
    public DataSource3 f28411y;

    /* JADX INFO: renamed from: z */
    public Loader f28412z;

    public static final class Factory implements MediaSourceFactory {

        /* JADX INFO: renamed from: a */
        public final SsChunkSource.a f28413a;

        /* JADX INFO: renamed from: b */
        public final DataSource3.a f28414b;

        /* JADX INFO: renamed from: c */
        public CompositeSequenceableLoaderFactory f28415c;

        /* JADX INFO: renamed from: d */
        public DrmSessionManagerProvider f28416d;

        /* JADX INFO: renamed from: e */
        public LoadErrorHandlingPolicy f28417e;

        /* JADX INFO: renamed from: f */
        public long f28418f;

        /* JADX INFO: renamed from: g */
        public List<StreamKey> f28419g;

        public Factory(DataSource3.a aVar) {
            this(new DefaultSsChunkSource.a(aVar), aVar);
        }

        public Factory(SsChunkSource.a aVar, DataSource3.a aVar2) {
            Objects.requireNonNull(aVar);
            this.f28413a = aVar;
            this.f28414b = aVar2;
            this.f28416d = new DefaultDrmSessionManagerProvider();
            this.f28417e = new DefaultLoadErrorHandlingPolicy();
            this.f28418f = 30000L;
            this.f28415c = new DefaultCompositeSequenceableLoaderFactory();
            this.f28419g = Collections.emptyList();
        }
    }

    static {
        ExoPlayerLibraryInfo.m3455a("goog.exo.smoothstreaming");
    }

    public SsMediaSource(MediaItem2 mediaItem2, SsManifest ssManifest, DataSource3.a aVar, ParsingLoadable.a aVar2, SsChunkSource.a aVar3, CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory, DrmSessionManager2 drmSessionManager2, LoadErrorHandlingPolicy loadErrorHandlingPolicy, long j2, C5881a c5881a) {
        Uri uriWithAppendedPath;
        C2096e.m4570f(true);
        this.f28401o = mediaItem2;
        MediaItem2.g gVar = mediaItem2.f7466b;
        Objects.requireNonNull(gVar);
        this.f28400n = gVar;
        this.f28396D = null;
        if (gVar.f7518a.equals(Uri.EMPTY)) {
            uriWithAppendedPath = null;
        } else {
            uriWithAppendedPath = gVar.f7518a;
            int i = Util6.f6307a;
            String strM3111T = Util6.m3111T(uriWithAppendedPath.getPath());
            if (strM3111T != null) {
                Matcher matcher = Util6.f6316j.matcher(strM3111T);
                if (matcher.matches() && matcher.group(1) == null) {
                    uriWithAppendedPath = Uri.withAppendedPath(uriWithAppendedPath, "Manifest");
                }
            }
        }
        this.f28399m = uriWithAppendedPath;
        this.f28402p = aVar;
        this.f28409w = aVar2;
        this.f28403q = aVar3;
        this.f28404r = compositeSequenceableLoaderFactory;
        this.f28405s = drmSessionManager2;
        this.f28406t = loadErrorHandlingPolicy;
        this.f28407u = j2;
        this.f28408v = m4144q(null);
        this.f28398l = false;
        this.f28410x = new ArrayList<>();
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaSource2
    /* JADX INFO: renamed from: a */
    public MediaPeriod mo4084a(MediaSource2.a aVar, Allocator allocator, long j2) {
        MediaSourceEventListener.a aVarM4115r = this.f8982h.m4115r(0, aVar, 0L);
        SsMediaPeriod ssMediaPeriod = new SsMediaPeriod(this.f28396D, this.f28403q, this.f28394B, this.f28404r, this.f28405s, this.f8983i.m3701g(0, aVar), this.f28406t, aVarM4115r, this.f28393A, allocator);
        this.f28410x.add(ssMediaPeriod);
        return ssMediaPeriod;
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaSource2
    /* JADX INFO: renamed from: f */
    public MediaItem2 mo4089f() {
        return this.f28401o;
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaSource2
    /* JADX INFO: renamed from: h */
    public void mo4091h() throws IOException {
        this.f28393A.mo2896a();
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaSource2
    /* JADX INFO: renamed from: j */
    public void mo4093j(MediaPeriod mediaPeriod) {
        SsMediaPeriod ssMediaPeriod = (SsMediaPeriod) mediaPeriod;
        for (ChunkSampleStream<SsChunkSource> chunkSampleStream : ssMediaPeriod.f9696r) {
            chunkSampleStream.m4203B(null);
        }
        ssMediaPeriod.f9694p = null;
        this.f28410x.remove(mediaPeriod);
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.Loader.b
    /* JADX INFO: renamed from: k */
    public void mo2903k(Loader.e eVar, long j2, long j3, boolean z) {
        ParsingLoadable parsingLoadable = (ParsingLoadable) eVar;
        long j4 = parsingLoadable.f5978a;
        DataSpec dataSpec = parsingLoadable.f5979b;
        StatsDataSource statsDataSource = parsingLoadable.f5981d;
        LoadEventInfo loadEventInfo = new LoadEventInfo(j4, dataSpec, statsDataSource.f5998c, statsDataSource.f5999d, j2, j3, statsDataSource.f5997b);
        Objects.requireNonNull(this.f28406t);
        this.f28408v.m4101d(loadEventInfo, parsingLoadable.f5980c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p007c.p190n.p194b.p209b.p210a2.Loader.b
    /* JADX INFO: renamed from: l */
    public void mo2904l(Loader.e eVar, long j2, long j3) {
        ParsingLoadable parsingLoadable = (ParsingLoadable) eVar;
        long j4 = parsingLoadable.f5978a;
        DataSpec dataSpec = parsingLoadable.f5979b;
        StatsDataSource statsDataSource = parsingLoadable.f5981d;
        LoadEventInfo loadEventInfo = new LoadEventInfo(j4, dataSpec, statsDataSource.f5998c, statsDataSource.f5999d, j2, j3, statsDataSource.f5997b);
        Objects.requireNonNull(this.f28406t);
        this.f28408v.m4104g(loadEventInfo, parsingLoadable.f5980c);
        this.f28396D = (SsManifest) parsingLoadable.f5983f;
        this.f28395C = j2 - j3;
        m12629x();
        if (this.f28396D.f9701d) {
            this.f28397E.postDelayed(new Runnable() { // from class: c.n.b.b.w1.x0.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9674f.m12630y();
                }
            }, Math.max(0L, (this.f28395C + 5000) - SystemClock.elapsedRealtime()));
        }
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.Loader.b
    /* JADX INFO: renamed from: t */
    public Loader.c mo2905t(Loader.e eVar, long j2, long j3, IOException iOException, int i) {
        ParsingLoadable parsingLoadable = (ParsingLoadable) eVar;
        long j4 = parsingLoadable.f5978a;
        DataSpec dataSpec = parsingLoadable.f5979b;
        StatsDataSource statsDataSource = parsingLoadable.f5981d;
        LoadEventInfo loadEventInfo = new LoadEventInfo(j4, dataSpec, statsDataSource.f5998c, statsDataSource.f5999d, j2, j3, statsDataSource.f5997b);
        long jM3026c = ((DefaultLoadErrorHandlingPolicy) this.f28406t).m3026c(new LoadErrorHandlingPolicy.a(loadEventInfo, new MediaLoadData(parsingLoadable.f5980c), iOException, i));
        Loader.c cVarM2895c = jM3026c == -9223372036854775807L ? Loader.f5959c : Loader.m2895c(false, jM3026c);
        boolean z = !cVarM2895c.m2906a();
        this.f28408v.m4108k(loadEventInfo, parsingLoadable.f5980c, iOException, z);
        if (z) {
            Objects.requireNonNull(this.f28406t);
        }
        return cVarM2895c;
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.BaseMediaSource
    /* JADX INFO: renamed from: u */
    public void mo4132u(TransferListener transferListener) {
        this.f28394B = transferListener;
        this.f28405s.prepare();
        if (this.f28398l) {
            this.f28393A = new LoaderErrorThrower.a();
            m12629x();
            return;
        }
        this.f28411y = this.f28402p.mo2953a();
        Loader loader = new Loader("Loader:Manifest");
        this.f28412z = loader;
        this.f28393A = loader;
        this.f28397E = Util6.m3124l();
        m12630y();
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.BaseMediaSource
    /* JADX INFO: renamed from: w */
    public void mo4133w() {
        this.f28396D = this.f28398l ? this.f28396D : null;
        this.f28411y = null;
        this.f28395C = 0L;
        Loader loader = this.f28412z;
        if (loader != null) {
            loader.m2901g(null);
            this.f28412z = null;
        }
        Handler handler = this.f28397E;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f28397E = null;
        }
        this.f28405s.release();
    }

    /* JADX INFO: renamed from: x */
    public final void m12629x() {
        SinglePeriodTimeline singlePeriodTimeline;
        for (int i = 0; i < this.f28410x.size(); i++) {
            SsMediaPeriod ssMediaPeriod = this.f28410x.get(i);
            SsManifest ssManifest = this.f28396D;
            ssMediaPeriod.f9695q = ssManifest;
            for (ChunkSampleStream<SsChunkSource> chunkSampleStream : ssMediaPeriod.f9696r) {
                ((SsChunkSource) chunkSampleStream.f9126j).mo4369d(ssManifest);
            }
            ssMediaPeriod.f9694p.mo3428i(ssMediaPeriod);
        }
        long jMax = Long.MIN_VALUE;
        long jMax2 = Long.MAX_VALUE;
        for (SsManifest.b bVar : this.f28396D.f9703f) {
            if (bVar.f9719k > 0) {
                jMax2 = Math.min(jMax2, bVar.f9723o[0]);
                int i2 = bVar.f9719k;
                jMax = Math.max(jMax, bVar.m4372b(i2 - 1) + bVar.f9723o[i2 - 1]);
            }
        }
        if (jMax2 == Long.MAX_VALUE) {
            long j2 = this.f28396D.f9701d ? -9223372036854775807L : 0L;
            SsManifest ssManifest2 = this.f28396D;
            boolean z = ssManifest2.f9701d;
            singlePeriodTimeline = new SinglePeriodTimeline(j2, 0L, 0L, 0L, true, z, z, (Object) ssManifest2, this.f28401o);
        } else {
            SsManifest ssManifest3 = this.f28396D;
            if (ssManifest3.f9701d) {
                long j3 = ssManifest3.f9705h;
                if (j3 != -9223372036854775807L && j3 > 0) {
                    jMax2 = Math.max(jMax2, jMax - j3);
                }
                long j4 = jMax2;
                long j5 = jMax - j4;
                long jM3236b = j5 - C.m3236b(this.f28407u);
                if (jM3236b < 5000000) {
                    jM3236b = Math.min(5000000L, j5 / 2);
                }
                singlePeriodTimeline = new SinglePeriodTimeline(-9223372036854775807L, j5, j4, jM3236b, true, true, true, (Object) this.f28396D, this.f28401o);
            } else {
                long j6 = ssManifest3.f9704g;
                long j7 = j6 != -9223372036854775807L ? j6 : jMax - jMax2;
                singlePeriodTimeline = new SinglePeriodTimeline(jMax2 + j7, j7, jMax2, 0L, true, false, false, (Object) this.f28396D, this.f28401o);
            }
        }
        m4147v(singlePeriodTimeline);
    }

    /* JADX INFO: renamed from: y */
    public final void m12630y() {
        if (this.f28412z.m2898d()) {
            return;
        }
        ParsingLoadable parsingLoadable = new ParsingLoadable(this.f28411y, this.f28399m, 4, this.f28409w);
        this.f28408v.m4110m(new LoadEventInfo(parsingLoadable.f5978a, parsingLoadable.f5979b, this.f28412z.m2902h(parsingLoadable, this, ((DefaultLoadErrorHandlingPolicy) this.f28406t).m3025b(parsingLoadable.f5980c))), parsingLoadable.f5980c);
    }
}
