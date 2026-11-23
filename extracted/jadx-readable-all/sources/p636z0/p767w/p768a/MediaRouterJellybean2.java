package p636z0.p767w.p768a;

import android.media.MediaRouter;
import p636z0.p767w.p768a.MediaRouterJellybean;

/* JADX INFO: renamed from: z0.w.a.i, reason: use source file name */
/* JADX INFO: compiled from: MediaRouterJellybean.java */
/* JADX INFO: loaded from: classes.dex */
public class MediaRouterJellybean2<T extends MediaRouterJellybean> extends MediaRouter.Callback {

    /* JADX INFO: renamed from: a */
    public final T f38899a;

    public MediaRouterJellybean2(T t) {
        this.f38899a = t;
    }

    @Override // android.media.MediaRouter.Callback
    public void onRouteAdded(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        this.f38899a.mo16849i(routeInfo);
    }

    @Override // android.media.MediaRouter.Callback
    public void onRouteChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        this.f38899a.mo16843a(routeInfo);
    }

    @Override // android.media.MediaRouter.Callback
    public void onRouteGrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup, int i) {
        this.f38899a.mo16848h(routeInfo, routeGroup, i);
    }

    @Override // android.media.MediaRouter.Callback
    public void onRouteRemoved(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        this.f38899a.mo16845d(routeInfo);
    }

    @Override // android.media.MediaRouter.Callback
    public void onRouteSelected(MediaRouter mediaRouter, int i, MediaRouter.RouteInfo routeInfo) {
        this.f38899a.mo16846e(i, routeInfo);
    }

    @Override // android.media.MediaRouter.Callback
    public void onRouteUngrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup) {
        this.f38899a.mo16847g(routeInfo, routeGroup);
    }

    @Override // android.media.MediaRouter.Callback
    public void onRouteUnselected(MediaRouter mediaRouter, int i, MediaRouter.RouteInfo routeInfo) {
        this.f38899a.mo16844b(i, routeInfo);
    }

    @Override // android.media.MediaRouter.Callback
    public void onRouteVolumeChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        this.f38899a.mo16850k(routeInfo);
    }
}
