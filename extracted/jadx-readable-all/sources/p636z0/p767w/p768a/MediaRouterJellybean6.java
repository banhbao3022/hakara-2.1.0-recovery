package p636z0.p767w.p768a;

import android.media.MediaRouter;
import p636z0.p767w.p768a.MediaRouterJellybean5;

/* JADX INFO: renamed from: z0.w.a.m, reason: use source file name */
/* JADX INFO: compiled from: MediaRouterJellybean.java */
/* JADX INFO: loaded from: classes.dex */
public class MediaRouterJellybean6<T extends MediaRouterJellybean5> extends MediaRouter.VolumeCallback {

    /* JADX INFO: renamed from: a */
    public final T f38900a;

    public MediaRouterJellybean6(T t) {
        this.f38900a = t;
    }

    @Override // android.media.MediaRouter.VolumeCallback
    public void onVolumeSetRequest(MediaRouter.RouteInfo routeInfo, int i) {
        this.f38900a.mo16852j(routeInfo, i);
    }

    @Override // android.media.MediaRouter.VolumeCallback
    public void onVolumeUpdateRequest(MediaRouter.RouteInfo routeInfo, int i) {
        this.f38900a.mo16851c(routeInfo, i);
    }
}
