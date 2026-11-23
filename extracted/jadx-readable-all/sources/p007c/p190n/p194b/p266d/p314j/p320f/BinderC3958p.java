package p007c.p190n.p194b.p266d.p314j.p320f;

import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p636z0.p767w.p768a.MediaRouteSelector;
import p636z0.p767w.p768a.MediaRouter;
import p636z0.p767w.p768a.MediaRouter.d.c;

/* JADX INFO: renamed from: c.n.b.d.j.f.p */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC3958p extends AbstractBinderC3928m {

    /* JADX INFO: renamed from: f */
    public final MediaRouter f22834f;

    /* JADX INFO: renamed from: g */
    public final Map<MediaRouteSelector, Set<MediaRouter.a>> f22835g = new HashMap();

    public BinderC3958p(MediaRouter mediaRouter) {
        this.f22834f = mediaRouter;
    }

    /* JADX INFO: renamed from: i1 */
    public final void m9182i1(MediaSessionCompat mediaSessionCompat) {
        Objects.requireNonNull(this.f22834f);
        if (MediaRouter.f38830a) {
            Log.d("MediaRouter", "addMediaSessionCompat: " + mediaSessionCompat);
        }
        MediaRouter.d dVar = MediaRouter.f38831b;
        MediaRouter.d.c cVar = mediaSessionCompat != null ? dVar.new c(mediaSessionCompat) : null;
        MediaRouter.d.c cVar2 = dVar.f38856s;
        if (cVar2 != null) {
            cVar2.m16832a();
        }
        dVar.f38856s = cVar;
        if (cVar != null) {
            dVar.m16826j();
        }
    }
}
