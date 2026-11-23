package p007c.p008a.p009a.p010a.p014h.p021j.p022b;

import com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource;
import java.util.List;
import java.util.Objects;
import p007c.p190n.p194b.p209b.MediaItem2;
import p007c.p190n.p194b.p209b.p210a2.DataSource3;
import p007c.p190n.p194b.p209b.p210a2.ParsingLoadable;
import p007c.p190n.p194b.p209b.p218q1.DefaultDrmSessionManagerProvider;
import p007c.p190n.p194b.p209b.p218q1.DrmSessionManager2;
import p007c.p190n.p194b.p209b.p218q1.DrmSessionManagerProvider;
import p007c.p190n.p194b.p209b.p242v1.FilteringManifestParser;
import p007c.p190n.p194b.p209b.p242v1.StreamKey;
import p007c.p190n.p194b.p209b.p243w1.MediaSource2;
import p007c.p190n.p194b.p209b.p243w1.p250x0.DefaultSsChunkSource;
import p007c.p190n.p194b.p209b.p243w1.p250x0.p251f.SsManifestParser;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: c.a.a.a.h.j.b.e, reason: use source file name */
/* JADX INFO: compiled from: SsMediaSourceBuilder.kt */
/* JADX INFO: loaded from: classes.dex */
public final class SsMediaSourceBuilder extends MediaSourceBuilder {
    @Override // p007c.p008a.p009a.p010a.p014h.p021j.p022b.MediaSourceBuilder
    /* JADX INFO: renamed from: a */
    public MediaSource2 mo1161a(MediaSourceBuilder.a aVar) {
        Intrinsics2.m13089e(aVar, "attributes");
        DataSource3.a aVarM1162b = m1162b(aVar.f1574a, aVar.f1579f, null);
        DataSource3.a aVarM1162b2 = m1162b(aVar.f1574a, aVar.f1579f, aVar.f1577d);
        MediaItem2.c cVar = new MediaItem2.c();
        cVar.f7475b = aVar.f1575b;
        MediaItem2 mediaItem2M3708a = cVar.m3708a();
        Intrinsics2.m13088d(mediaItem2M3708a, "MediaItem.Builder().setUri(attributes.uri).build()");
        SsMediaSource.Factory factory = new SsMediaSource.Factory(new DefaultSsChunkSource.a(aVarM1162b2), aVarM1162b);
        final DrmSessionManager2 drmSessionManager2 = aVar.f1578e;
        if (drmSessionManager2 == null) {
            factory.f28416d = new DefaultDrmSessionManagerProvider();
        } else {
            factory.f28416d = new DrmSessionManagerProvider() { // from class: c.n.b.b.w1.x0.a
                @Override // p007c.p190n.p194b.p209b.p218q1.DrmSessionManagerProvider
                /* JADX INFO: renamed from: a */
                public final DrmSessionManager2 mo3685a(MediaItem2 mediaItem2) {
                    return drmSessionManager2;
                }
            };
        }
        Objects.requireNonNull(mediaItem2M3708a.f7466b);
        SsManifestParser ssManifestParser = new SsManifestParser();
        List<StreamKey> list = !mediaItem2M3708a.f7466b.f7522e.isEmpty() ? mediaItem2M3708a.f7466b.f7522e : factory.f28419g;
        ParsingLoadable.a filteringManifestParser = !list.isEmpty() ? new FilteringManifestParser(ssManifestParser, list) : ssManifestParser;
        MediaItem2.g gVar = mediaItem2M3708a.f7466b;
        Object obj = gVar.f7525h;
        if (gVar.f7522e.isEmpty() && !list.isEmpty()) {
            MediaItem2.c cVarM3707a = mediaItem2M3708a.m3707a();
            cVarM3707a.m3709b(list);
            mediaItem2M3708a = cVarM3707a.m3708a();
        }
        MediaItem2 mediaItem2 = mediaItem2M3708a;
        SsMediaSource ssMediaSource = new SsMediaSource(mediaItem2, null, factory.f28414b, filteringManifestParser, factory.f28413a, factory.f28415c, factory.f28416d.mo3685a(mediaItem2), factory.f28417e, factory.f28418f, null);
        Intrinsics2.m13088d(ssMediaSource, "SsMediaSource.Factory(De…ateMediaSource(mediaItem)");
        return ssMediaSource;
    }
}
