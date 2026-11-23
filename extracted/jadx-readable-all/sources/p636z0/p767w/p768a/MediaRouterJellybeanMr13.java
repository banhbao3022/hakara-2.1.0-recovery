package p636z0.p767w.p768a;

import android.media.MediaRouter;
import p636z0.p767w.p768a.MediaRouterJellybeanMr12;

/* JADX INFO: renamed from: z0.w.a.p, reason: use source file name */
/* JADX INFO: compiled from: MediaRouterJellybeanMr1.java */
/* JADX INFO: loaded from: classes.dex */
public class MediaRouterJellybeanMr13<T extends MediaRouterJellybeanMr12> extends MediaRouterJellybean2<T> {
    public MediaRouterJellybeanMr13(T t) {
        super(t);
    }

    @Override // android.media.MediaRouter.Callback
    public void onRoutePresentationDisplayChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        ((MediaRouterJellybeanMr12) this.f38899a).mo16853f(routeInfo);
    }
}
