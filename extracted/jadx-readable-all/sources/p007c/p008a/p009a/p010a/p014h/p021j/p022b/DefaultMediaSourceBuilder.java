package p007c.p008a.p009a.p010a.p014h.p021j.p022b;

import java.util.Objects;
import p007c.p190n.p194b.p209b.MediaItem2;
import p007c.p190n.p194b.p209b.p210a2.DataSource3;
import p007c.p190n.p194b.p209b.p218q1.DefaultDrmSessionManagerProvider;
import p007c.p190n.p194b.p209b.p218q1.DrmSessionManager2;
import p007c.p190n.p194b.p209b.p218q1.DrmSessionManagerProvider;
import p007c.p190n.p194b.p209b.p221s1.DefaultExtractorsFactory;
import p007c.p190n.p194b.p209b.p243w1.MediaSource2;
import p007c.p190n.p194b.p209b.p243w1.ProgressiveMediaSource;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: c.a.a.a.h.j.b.b, reason: use source file name */
/* JADX INFO: compiled from: DefaultMediaSourceBuilder.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DefaultMediaSourceBuilder extends MediaSourceBuilder {
    @Override // p007c.p008a.p009a.p010a.p014h.p021j.p022b.MediaSourceBuilder
    /* JADX INFO: renamed from: a */
    public MediaSource2 mo1161a(MediaSourceBuilder.a aVar) {
        Intrinsics2.m13089e(aVar, "attributes");
        DataSource3.a aVarM1162b = m1162b(aVar.f1574a, aVar.f1579f, aVar.f1577d);
        MediaItem2.c cVar = new MediaItem2.c();
        cVar.f7475b = aVar.f1575b;
        MediaItem2 mediaItem2M3708a = cVar.m3708a();
        Intrinsics2.m13088d(mediaItem2M3708a, "MediaItem.Builder().setUri(attributes.uri).build()");
        ProgressiveMediaSource.b bVar = new ProgressiveMediaSource.b(aVarM1162b, new DefaultExtractorsFactory());
        final DrmSessionManager2 drmSessionManager2 = aVar.f1578e;
        if (drmSessionManager2 == null) {
            bVar.f8964c = new DefaultDrmSessionManagerProvider();
        } else {
            bVar.f8964c = new DrmSessionManagerProvider() { // from class: c.n.b.b.w1.k
                @Override // p007c.p190n.p194b.p209b.p218q1.DrmSessionManagerProvider
                /* JADX INFO: renamed from: a */
                public final DrmSessionManager2 mo3685a(MediaItem2 mediaItem2) {
                    return drmSessionManager2;
                }
            };
        }
        Objects.requireNonNull(mediaItem2M3708a.f7466b);
        Object obj = mediaItem2M3708a.f7466b.f7525h;
        ProgressiveMediaSource progressiveMediaSource = new ProgressiveMediaSource(mediaItem2M3708a, bVar.f8962a, bVar.f8963b, bVar.f8964c.mo3685a(mediaItem2M3708a), bVar.f8965d, bVar.f8966e);
        Intrinsics2.m13088d(progressiveMediaSource, "ProgressiveMediaSource.F…ateMediaSource(mediaItem)");
        return progressiveMediaSource;
    }
}
