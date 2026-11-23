package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p007c.p190n.p194b.p209b.ExoPlayerLibraryInfo;
import p007c.p190n.p194b.p209b.MediaItem2;
import p007c.p190n.p194b.p209b.p210a2.Allocator;
import p007c.p190n.p194b.p209b.p210a2.DataSource3;
import p007c.p190n.p194b.p209b.p210a2.DefaultLoadErrorHandlingPolicy;
import p007c.p190n.p194b.p209b.p210a2.LoadErrorHandlingPolicy;
import p007c.p190n.p194b.p209b.p210a2.Loader;
import p007c.p190n.p194b.p209b.p210a2.ParsingLoadable;
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
import p007c.p190n.p194b.p209b.p243w1.MediaPeriod;
import p007c.p190n.p194b.p209b.p243w1.MediaSource2;
import p007c.p190n.p194b.p209b.p243w1.MediaSourceEventListener;
import p007c.p190n.p194b.p209b.p243w1.MediaSourceFactory;
import p007c.p190n.p194b.p209b.p243w1.p248w0.DefaultHlsDataSourceFactory;
import p007c.p190n.p194b.p209b.p243w1.p248w0.HlsDataSourceFactory;
import p007c.p190n.p194b.p209b.p243w1.p248w0.HlsExtractorFactory;
import p007c.p190n.p194b.p209b.p243w1.p248w0.HlsMediaPeriod;
import p007c.p190n.p194b.p209b.p243w1.p248w0.HlsSampleStreamWrapper;
import p007c.p190n.p194b.p209b.p243w1.p248w0.p249w.C1998b;
import p007c.p190n.p194b.p209b.p243w1.p248w0.p249w.DefaultHlsPlaylistParserFactory;
import p007c.p190n.p194b.p209b.p243w1.p248w0.p249w.DefaultHlsPlaylistTracker;
import p007c.p190n.p194b.p209b.p243w1.p248w0.p249w.HlsPlaylistParserFactory;
import p007c.p190n.p194b.p209b.p243w1.p248w0.p249w.HlsPlaylistTracker;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: loaded from: classes.dex */
public final class HlsMediaSource extends BaseMediaSource implements HlsPlaylistTracker.e {

    /* JADX INFO: renamed from: l */
    public final HlsExtractorFactory f28369l;

    /* JADX INFO: renamed from: m */
    public final MediaItem2.g f28370m;

    /* JADX INFO: renamed from: n */
    public final HlsDataSourceFactory f28371n;

    /* JADX INFO: renamed from: o */
    public final CompositeSequenceableLoaderFactory f28372o;

    /* JADX INFO: renamed from: p */
    public final DrmSessionManager2 f28373p;

    /* JADX INFO: renamed from: q */
    public final LoadErrorHandlingPolicy f28374q;

    /* JADX INFO: renamed from: r */
    public final boolean f28375r;

    /* JADX INFO: renamed from: s */
    public final int f28376s;

    /* JADX INFO: renamed from: t */
    public final boolean f28377t;

    /* JADX INFO: renamed from: u */
    public final HlsPlaylistTracker f28378u;

    /* JADX INFO: renamed from: v */
    public final long f28379v;

    /* JADX INFO: renamed from: w */
    public final MediaItem2 f28380w;

    /* JADX INFO: renamed from: x */
    public MediaItem2.f f28381x;

    /* JADX INFO: renamed from: y */
    public TransferListener f28382y;

    public static final class Factory implements MediaSourceFactory {

        /* JADX INFO: renamed from: a */
        public final HlsDataSourceFactory f28383a;

        /* JADX INFO: renamed from: b */
        public HlsExtractorFactory f28384b;

        /* JADX INFO: renamed from: c */
        public HlsPlaylistParserFactory f28385c;

        /* JADX INFO: renamed from: d */
        public HlsPlaylistTracker.a f28386d;

        /* JADX INFO: renamed from: e */
        public CompositeSequenceableLoaderFactory f28387e;

        /* JADX INFO: renamed from: f */
        public DrmSessionManagerProvider f28388f;

        /* JADX INFO: renamed from: g */
        public LoadErrorHandlingPolicy f28389g;

        /* JADX INFO: renamed from: h */
        public int f28390h;

        /* JADX INFO: renamed from: i */
        public List<StreamKey> f28391i;

        /* JADX INFO: renamed from: j */
        public long f28392j;

        public Factory(DataSource3.a aVar) {
            this(new DefaultHlsDataSourceFactory(aVar));
        }

        public Factory(HlsDataSourceFactory hlsDataSourceFactory) {
            Objects.requireNonNull(hlsDataSourceFactory);
            this.f28383a = hlsDataSourceFactory;
            this.f28388f = new DefaultDrmSessionManagerProvider();
            this.f28385c = new DefaultHlsPlaylistParserFactory();
            int i = DefaultHlsPlaylistTracker.f9523f;
            this.f28386d = C1998b.f9522a;
            this.f28384b = HlsExtractorFactory.f9388a;
            this.f28389g = new DefaultLoadErrorHandlingPolicy();
            this.f28387e = new DefaultCompositeSequenceableLoaderFactory();
            this.f28390h = 1;
            this.f28391i = Collections.emptyList();
            this.f28392j = -9223372036854775807L;
        }
    }

    static {
        ExoPlayerLibraryInfo.m3455a("goog.exo.hls");
    }

    public HlsMediaSource(MediaItem2 mediaItem2, HlsDataSourceFactory hlsDataSourceFactory, HlsExtractorFactory hlsExtractorFactory, CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory, DrmSessionManager2 drmSessionManager2, LoadErrorHandlingPolicy loadErrorHandlingPolicy, HlsPlaylistTracker hlsPlaylistTracker, long j2, boolean z, int i, boolean z2, C5880a c5880a) {
        MediaItem2.g gVar = mediaItem2.f7466b;
        Objects.requireNonNull(gVar);
        this.f28370m = gVar;
        this.f28380w = mediaItem2;
        this.f28381x = mediaItem2.f7467c;
        this.f28371n = hlsDataSourceFactory;
        this.f28369l = hlsExtractorFactory;
        this.f28372o = compositeSequenceableLoaderFactory;
        this.f28373p = drmSessionManager2;
        this.f28374q = loadErrorHandlingPolicy;
        this.f28378u = hlsPlaylistTracker;
        this.f28379v = j2;
        this.f28375r = z;
        this.f28376s = i;
        this.f28377t = z2;
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaSource2
    /* JADX INFO: renamed from: a */
    public MediaPeriod mo4084a(MediaSource2.a aVar, Allocator allocator, long j2) {
        MediaSourceEventListener.a aVarM4115r = this.f8982h.m4115r(0, aVar, 0L);
        return new HlsMediaPeriod(this.f28369l, this.f28378u, this.f28371n, this.f28382y, this.f28373p, this.f8983i.m3701g(0, aVar), this.f28374q, aVarM4115r, allocator, this.f28372o, this.f28375r, this.f28376s, this.f28377t);
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaSource2
    /* JADX INFO: renamed from: f */
    public MediaItem2 mo4089f() {
        return this.f28380w;
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaSource2
    /* JADX INFO: renamed from: h */
    public void mo4091h() throws IOException {
        DefaultHlsPlaylistTracker defaultHlsPlaylistTracker = (DefaultHlsPlaylistTracker) this.f28378u;
        Loader loader = defaultHlsPlaylistTracker.f9531n;
        if (loader != null) {
            loader.m2900f(Integer.MIN_VALUE);
        }
        Uri uri = defaultHlsPlaylistTracker.f9535r;
        if (uri != null) {
            defaultHlsPlaylistTracker.m4339f(uri);
        }
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaSource2
    /* JADX INFO: renamed from: j */
    public void mo4093j(MediaPeriod mediaPeriod) {
        HlsMediaPeriod hlsMediaPeriod = (HlsMediaPeriod) mediaPeriod;
        ((DefaultHlsPlaylistTracker) hlsMediaPeriod.f9419g).f9528k.remove(hlsMediaPeriod);
        for (HlsSampleStreamWrapper hlsSampleStreamWrapper : hlsMediaPeriod.f9436x) {
            if (hlsSampleStreamWrapper.f9451I) {
                for (HlsSampleStreamWrapper.d dVar : hlsSampleStreamWrapper.f9443A) {
                    dVar.m4148A();
                }
            }
            hlsSampleStreamWrapper.f9480o.m2901g(hlsSampleStreamWrapper);
            hlsSampleStreamWrapper.f9488w.removeCallbacksAndMessages(null);
            hlsSampleStreamWrapper.f9455M = true;
            hlsSampleStreamWrapper.f9489x.clear();
        }
        hlsMediaPeriod.f9433u = null;
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.BaseMediaSource
    /* JADX INFO: renamed from: u */
    public void mo4132u(TransferListener transferListener) {
        this.f28382y = transferListener;
        this.f28373p.prepare();
        MediaSourceEventListener.a aVarM4144q = m4144q(null);
        HlsPlaylistTracker hlsPlaylistTracker = this.f28378u;
        Uri uri = this.f28370m.f7518a;
        DefaultHlsPlaylistTracker defaultHlsPlaylistTracker = (DefaultHlsPlaylistTracker) hlsPlaylistTracker;
        Objects.requireNonNull(defaultHlsPlaylistTracker);
        defaultHlsPlaylistTracker.f9532o = Util6.m3124l();
        defaultHlsPlaylistTracker.f9530m = aVarM4144q;
        defaultHlsPlaylistTracker.f9533p = this;
        ParsingLoadable parsingLoadable = new ParsingLoadable(defaultHlsPlaylistTracker.f9524g.mo4296a(4), uri, 4, defaultHlsPlaylistTracker.f9525h.mo4333b());
        C2096e.m4570f(defaultHlsPlaylistTracker.f9531n == null);
        Loader loader = new Loader("DefaultHlsPlaylistTracker:MasterPlaylist");
        defaultHlsPlaylistTracker.f9531n = loader;
        aVarM4144q.m4110m(new LoadEventInfo(parsingLoadable.f5978a, parsingLoadable.f5979b, loader.m2902h(parsingLoadable, defaultHlsPlaylistTracker, ((DefaultLoadErrorHandlingPolicy) defaultHlsPlaylistTracker.f9526i).m3025b(parsingLoadable.f5980c))), parsingLoadable.f5980c);
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.BaseMediaSource
    /* JADX INFO: renamed from: w */
    public void mo4133w() {
        DefaultHlsPlaylistTracker defaultHlsPlaylistTracker = (DefaultHlsPlaylistTracker) this.f28378u;
        defaultHlsPlaylistTracker.f9535r = null;
        defaultHlsPlaylistTracker.f9536s = null;
        defaultHlsPlaylistTracker.f9534q = null;
        defaultHlsPlaylistTracker.f9538u = -9223372036854775807L;
        defaultHlsPlaylistTracker.f9531n.m2901g(null);
        defaultHlsPlaylistTracker.f9531n = null;
        Iterator<DefaultHlsPlaylistTracker.a> it = defaultHlsPlaylistTracker.f9527j.values().iterator();
        while (it.hasNext()) {
            it.next().f9540g.m2901g(null);
        }
        defaultHlsPlaylistTracker.f9532o.removeCallbacksAndMessages(null);
        defaultHlsPlaylistTracker.f9532o = null;
        defaultHlsPlaylistTracker.f9527j.clear();
        this.f28373p.release();
    }
}
