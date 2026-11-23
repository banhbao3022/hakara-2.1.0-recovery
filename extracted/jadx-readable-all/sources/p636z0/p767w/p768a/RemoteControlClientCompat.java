package p636z0.p767w.p768a;

import android.content.Context;
import android.media.MediaRouter;
import android.media.RemoteControlClient;
import java.lang.ref.WeakReference;
import p636z0.p752p.C8310a;

/* JADX INFO: renamed from: z0.w.a.u, reason: use source file name */
/* JADX INFO: compiled from: RemoteControlClientCompat.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class RemoteControlClientCompat {

    /* JADX INFO: renamed from: a */
    public final Object f38939a;

    /* JADX INFO: renamed from: b */
    public c f38940b;

    /* JADX INFO: renamed from: z0.w.a.u$a */
    /* JADX INFO: compiled from: RemoteControlClientCompat.java */
    public static class a extends RemoteControlClientCompat {

        /* JADX INFO: renamed from: c */
        public final Object f38941c;

        /* JADX INFO: renamed from: d */
        public final Object f38942d;

        /* JADX INFO: renamed from: e */
        public final Object f38943e;

        /* JADX INFO: renamed from: f */
        public boolean f38944f;

        /* JADX INFO: renamed from: z0.w.a.u$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: RemoteControlClientCompat.java */
        public static final class C8574a implements MediaRouterJellybean5 {

            /* JADX INFO: renamed from: a */
            public final WeakReference<a> f38945a;

            public C8574a(a aVar) {
                this.f38945a = new WeakReference<>(aVar);
            }

            @Override // p636z0.p767w.p768a.MediaRouterJellybean5
            /* JADX INFO: renamed from: c */
            public void mo16851c(Object obj, int i) {
                c cVar;
                MediaRouter.g gVar;
                a aVar = this.f38945a.get();
                if (aVar == null || (cVar = aVar.f38940b) == null) {
                    return;
                }
                MediaRouter.d.e eVar = (MediaRouter.d.e) cVar;
                if (eVar.f38866b || (gVar = MediaRouter.d.this.f38852o) == null) {
                    return;
                }
                gVar.m16839f(i);
            }

            @Override // p636z0.p767w.p768a.MediaRouterJellybean5
            /* JADX INFO: renamed from: j */
            public void mo16852j(Object obj, int i) {
                c cVar;
                MediaRouter.g gVar;
                a aVar = this.f38945a.get();
                if (aVar == null || (cVar = aVar.f38940b) == null) {
                    return;
                }
                MediaRouter.d.e eVar = (MediaRouter.d.e) cVar;
                if (eVar.f38866b || (gVar = MediaRouter.d.this.f38852o) == null) {
                    return;
                }
                gVar.m16838e(i);
            }
        }

        public a(Context context, Object obj) {
            super(context, obj);
            Object systemService = context.getSystemService("media_router");
            this.f38941c = systemService;
            MediaRouter mediaRouter = (MediaRouter) systemService;
            MediaRouter.RouteCategory routeCategoryCreateRouteCategory = mediaRouter.createRouteCategory((CharSequence) "", false);
            this.f38942d = routeCategoryCreateRouteCategory;
            this.f38943e = mediaRouter.createUserRoute(routeCategoryCreateRouteCategory);
        }

        @Override // p636z0.p767w.p768a.RemoteControlClientCompat
        /* JADX INFO: renamed from: a */
        public void mo16869a(b bVar) {
            ((MediaRouter.UserRouteInfo) this.f38943e).setVolume(bVar.f38946a);
            ((MediaRouter.UserRouteInfo) this.f38943e).setVolumeMax(bVar.f38947b);
            ((MediaRouter.UserRouteInfo) this.f38943e).setVolumeHandling(bVar.f38948c);
            ((MediaRouter.UserRouteInfo) this.f38943e).setPlaybackStream(bVar.f38949d);
            ((MediaRouter.UserRouteInfo) this.f38943e).setPlaybackType(bVar.f38950e);
            if (this.f38944f) {
                return;
            }
            this.f38944f = true;
            C8310a.m16442g(this.f38943e, new MediaRouterJellybean6(new C8574a(this)));
            ((MediaRouter.UserRouteInfo) this.f38943e).setRemoteControlClient((RemoteControlClient) this.f38939a);
        }
    }

    /* JADX INFO: renamed from: z0.w.a.u$b */
    /* JADX INFO: compiled from: RemoteControlClientCompat.java */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public int f38946a;

        /* JADX INFO: renamed from: b */
        public int f38947b;

        /* JADX INFO: renamed from: c */
        public int f38948c = 0;

        /* JADX INFO: renamed from: d */
        public int f38949d = 3;

        /* JADX INFO: renamed from: e */
        public int f38950e = 1;
    }

    /* JADX INFO: renamed from: z0.w.a.u$c */
    /* JADX INFO: compiled from: RemoteControlClientCompat.java */
    public interface c {
    }

    public RemoteControlClientCompat(Context context, Object obj) {
        this.f38939a = obj;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo16869a(b bVar);
}
