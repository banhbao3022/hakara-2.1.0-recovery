package p007c.p008a.p009a.p010a.p014h.p021j.p022b;

import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import java.util.List;
import java.util.Objects;
import p007c.p190n.p194b.p209b.MediaItem2;
import p007c.p190n.p194b.p209b.p210a2.DataSource3;
import p007c.p190n.p194b.p209b.p210a2.LoadErrorHandlingPolicy;
import p007c.p190n.p194b.p209b.p218q1.DefaultDrmSessionManagerProvider;
import p007c.p190n.p194b.p209b.p218q1.DrmSessionManager2;
import p007c.p190n.p194b.p209b.p218q1.DrmSessionManagerProvider;
import p007c.p190n.p194b.p209b.p242v1.StreamKey;
import p007c.p190n.p194b.p209b.p243w1.CompositeSequenceableLoaderFactory;
import p007c.p190n.p194b.p209b.p243w1.MediaSource2;
import p007c.p190n.p194b.p209b.p243w1.p248w0.HlsDataSourceFactory;
import p007c.p190n.p194b.p209b.p243w1.p248w0.HlsExtractorFactory;
import p007c.p190n.p194b.p209b.p243w1.p248w0.p249w.C1998b;
import p007c.p190n.p194b.p209b.p243w1.p248w0.p249w.DefaultHlsPlaylistTracker;
import p007c.p190n.p194b.p209b.p243w1.p248w0.p249w.FilteringHlsPlaylistParserFactory;
import p007c.p190n.p194b.p209b.p243w1.p248w0.p249w.HlsPlaylistParserFactory;
import p007c.p190n.p194b.p209b.p243w1.p248w0.p249w.HlsPlaylistTracker;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: c.a.a.a.h.j.b.c, reason: use source file name */
/* JADX INFO: compiled from: HlsMediaSourceBuilder.kt */
/* JADX INFO: loaded from: classes.dex */
public final class HlsMediaSourceBuilder extends MediaSourceBuilder {
    @Override // p007c.p008a.p009a.p010a.p014h.p021j.p022b.MediaSourceBuilder
    /* JADX INFO: renamed from: a */
    public MediaSource2 mo1161a(MediaSourceBuilder.a aVar) {
        Intrinsics2.m13089e(aVar, "attributes");
        DataSource3.a aVarM1162b = m1162b(aVar.f1574a, aVar.f1579f, aVar.f1577d);
        MediaItem2.c cVar = new MediaItem2.c();
        cVar.f7475b = aVar.f1575b;
        MediaItem2 mediaItem2M3708a = cVar.m3708a();
        Intrinsics2.m13088d(mediaItem2M3708a, "MediaItem.Builder().setUri(attributes.uri).build()");
        HlsMediaSource.Factory factory = new HlsMediaSource.Factory(aVarM1162b);
        final DrmSessionManager2 drmSessionManager2 = aVar.f1578e;
        if (drmSessionManager2 == null) {
            factory.f28388f = new DefaultDrmSessionManagerProvider();
        } else {
            factory.f28388f = new DrmSessionManagerProvider() { // from class: c.n.b.b.w1.w0.a
                @Override // p007c.p190n.p194b.p209b.p218q1.DrmSessionManagerProvider
                /* JADX INFO: renamed from: a */
                public final DrmSessionManager2 mo3685a(MediaItem2 mediaItem2) {
                    return drmSessionManager2;
                }
            };
        }
        Objects.requireNonNull(mediaItem2M3708a.f7466b);
        HlsPlaylistParserFactory filteringHlsPlaylistParserFactory = factory.f28385c;
        List<StreamKey> list = mediaItem2M3708a.f7466b.f7522e.isEmpty() ? factory.f28391i : mediaItem2M3708a.f7466b.f7522e;
        if (!list.isEmpty()) {
            filteringHlsPlaylistParserFactory = new FilteringHlsPlaylistParserFactory(filteringHlsPlaylistParserFactory, list);
        }
        MediaItem2.g gVar = mediaItem2M3708a.f7466b;
        Object obj = gVar.f7525h;
        if (gVar.f7522e.isEmpty() && !list.isEmpty()) {
            MediaItem2.c cVarM3707a = mediaItem2M3708a.m3707a();
            cVarM3707a.m3709b(list);
            mediaItem2M3708a = cVarM3707a.m3708a();
        }
        MediaItem2 mediaItem2 = mediaItem2M3708a;
        HlsDataSourceFactory hlsDataSourceFactory = factory.f28383a;
        HlsExtractorFactory hlsExtractorFactory = factory.f28384b;
        CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory = factory.f28387e;
        DrmSessionManager2 drmSessionManager2Mo3685a = factory.f28388f.mo3685a(mediaItem2);
        LoadErrorHandlingPolicy loadErrorHandlingPolicy = factory.f28389g;
        HlsPlaylistTracker.a aVar2 = factory.f28386d;
        HlsDataSourceFactory hlsDataSourceFactory2 = factory.f28383a;
        Objects.requireNonNull((C1998b) aVar2);
        HlsMediaSource hlsMediaSource = new HlsMediaSource(mediaItem2, hlsDataSourceFactory, hlsExtractorFactory, compositeSequenceableLoaderFactory, drmSessionManager2Mo3685a, loadErrorHandlingPolicy, new DefaultHlsPlaylistTracker(hlsDataSourceFactory2, loadErrorHandlingPolicy, filteringHlsPlaylistParserFactory), factory.f28392j, false, factory.f28390h, false, null);
        Intrinsics2.m13088d(hlsMediaSource, "HlsMediaSource.Factory(d…ateMediaSource(mediaItem)");
        return hlsMediaSource;
    }
}
