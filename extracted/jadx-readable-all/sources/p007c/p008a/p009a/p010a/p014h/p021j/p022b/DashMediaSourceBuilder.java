package p007c.p008a.p009a.p010a.p014h.p021j.p022b;

import com.google.android.exoplayer2.source.dash.DashMediaSource;
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
import p007c.p190n.p194b.p209b.p243w1.p246v0.DefaultDashChunkSource;
import p007c.p190n.p194b.p209b.p243w1.p246v0.p247l.DashManifestParser;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: c.a.a.a.h.j.b.a, reason: use source file name */
/* JADX INFO: compiled from: DashMediaSourceBuilder.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DashMediaSourceBuilder extends MediaSourceBuilder {
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
        DashMediaSource.Factory factory = new DashMediaSource.Factory(new DefaultDashChunkSource.a(aVarM1162b2), aVarM1162b);
        final DrmSessionManager2 drmSessionManager2 = aVar.f1578e;
        if (drmSessionManager2 == null) {
            factory.f28347c = new DefaultDrmSessionManagerProvider();
        } else {
            factory.f28347c = new DrmSessionManagerProvider() { // from class: c.n.b.b.w1.v0.b
                @Override // p007c.p190n.p194b.p209b.p218q1.DrmSessionManagerProvider
                /* JADX INFO: renamed from: a */
                public final DrmSessionManager2 mo3685a(MediaItem2 mediaItem2) {
                    return drmSessionManager2;
                }
            };
        }
        Objects.requireNonNull(mediaItem2M3708a.f7466b);
        DashManifestParser dashManifestParser = new DashManifestParser();
        List<StreamKey> list = mediaItem2M3708a.f7466b.f7522e.isEmpty() ? factory.f28352h : mediaItem2M3708a.f7466b.f7522e;
        ParsingLoadable.a filteringManifestParser = !list.isEmpty() ? new FilteringManifestParser(dashManifestParser, list) : dashManifestParser;
        MediaItem2.g gVar = mediaItem2M3708a.f7466b;
        Object obj = gVar.f7525h;
        boolean z = gVar.f7522e.isEmpty() && !list.isEmpty();
        boolean z2 = mediaItem2M3708a.f7467c.f7513a == -9223372036854775807L && factory.f28350f != -9223372036854775807L;
        if (z || z2) {
            MediaItem2.c cVarM3707a = mediaItem2M3708a.m3707a();
            if (z) {
                cVarM3707a.m3709b(list);
            }
            if (z2) {
                cVarM3707a.f7497x = factory.f28350f;
            }
            mediaItem2M3708a = cVarM3707a.m3708a();
        }
        MediaItem2 mediaItem2 = mediaItem2M3708a;
        DashMediaSource dashMediaSource = new DashMediaSource(mediaItem2, null, factory.f28346b, filteringManifestParser, factory.f28345a, factory.f28348d, factory.f28347c.mo3685a(mediaItem2), factory.f28349e, factory.f28351g, null);
        Intrinsics2.m13088d(dashMediaSource, "DashMediaSource.Factory(…ateMediaSource(mediaItem)");
        return dashMediaSource;
    }
}
