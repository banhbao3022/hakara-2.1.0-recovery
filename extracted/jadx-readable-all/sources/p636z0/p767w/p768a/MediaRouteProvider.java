package p636z0.p767w.p768a;

import android.content.ComponentName;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: z0.w.a.c, reason: use source file name */
/* JADX INFO: compiled from: MediaRouteProvider.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class MediaRouteProvider {

    /* JADX INFO: renamed from: a */
    public final Context f38812a;

    /* JADX INFO: renamed from: b */
    public final c f38813b;

    /* JADX INFO: renamed from: c */
    public final b f38814c;

    /* JADX INFO: renamed from: d */
    public a f38815d;

    /* JADX INFO: renamed from: e */
    public MediaRouteDiscoveryRequest f38816e;

    /* JADX INFO: renamed from: f */
    public boolean f38817f;

    /* JADX INFO: renamed from: g */
    public MediaRouteProviderDescriptor f38818g;

    /* JADX INFO: renamed from: h */
    public boolean f38819h;

    /* JADX INFO: renamed from: z0.w.a.c$a */
    /* JADX INFO: compiled from: MediaRouteProvider.java */
    public static abstract class a {
        /* JADX INFO: renamed from: a */
        public void mo16798a(MediaRouteProvider mediaRouteProvider, MediaRouteProviderDescriptor mediaRouteProviderDescriptor) {
        }
    }

    /* JADX INFO: renamed from: z0.w.a.c$b */
    /* JADX INFO: compiled from: MediaRouteProvider.java */
    public final class b extends Handler {
        public b() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                MediaRouteProvider mediaRouteProvider = MediaRouteProvider.this;
                mediaRouteProvider.f38817f = false;
                mediaRouteProvider.mo16795n(mediaRouteProvider.f38816e);
                return;
            }
            MediaRouteProvider mediaRouteProvider2 = MediaRouteProvider.this;
            mediaRouteProvider2.f38819h = false;
            a aVar = mediaRouteProvider2.f38815d;
            if (aVar != null) {
                aVar.mo16798a(mediaRouteProvider2, mediaRouteProvider2.f38818g);
            }
        }
    }

    /* JADX INFO: renamed from: z0.w.a.c$c */
    /* JADX INFO: compiled from: MediaRouteProvider.java */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public final ComponentName f38821a;

        public c(ComponentName componentName) {
            if (componentName == null) {
                throw new IllegalArgumentException("componentName must not be null");
            }
            this.f38821a = componentName;
        }

        public String toString() {
            StringBuilder sbM1556G = outline.m1556G("ProviderMetadata{ componentName=");
            sbM1556G.append(this.f38821a.flattenToShortString());
            sbM1556G.append(" }");
            return sbM1556G.toString();
        }
    }

    /* JADX INFO: renamed from: z0.w.a.c$d */
    /* JADX INFO: compiled from: MediaRouteProvider.java */
    public static abstract class d {
        /* JADX INFO: renamed from: a */
        public void mo16799a() {
        }

        /* JADX INFO: renamed from: b */
        public void mo16800b() {
        }

        /* JADX INFO: renamed from: c */
        public void mo16801c(int i) {
        }

        /* JADX INFO: renamed from: d */
        public void mo16802d() {
        }

        /* JADX INFO: renamed from: e */
        public void mo16803e(int i) {
            mo16802d();
        }

        /* JADX INFO: renamed from: f */
        public void mo16804f(int i) {
        }
    }

    public MediaRouteProvider(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: l */
    public d mo16793l(String str) {
        if (str != null) {
            return null;
        }
        throw new IllegalArgumentException("routeId cannot be null");
    }

    /* JADX INFO: renamed from: m */
    public d mo16794m(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        }
        if (str2 != null) {
            return mo16793l(str);
        }
        throw new IllegalArgumentException("routeGroupId cannot be null");
    }

    /* JADX INFO: renamed from: n */
    public void mo16795n(MediaRouteDiscoveryRequest mediaRouteDiscoveryRequest) {
    }

    /* JADX INFO: renamed from: o */
    public final void m16796o(MediaRouteProviderDescriptor mediaRouteProviderDescriptor) {
        MediaRouter.m16813a();
        if (this.f38818g != mediaRouteProviderDescriptor) {
            this.f38818g = mediaRouteProviderDescriptor;
            if (this.f38819h) {
                return;
            }
            this.f38819h = true;
            this.f38814c.sendEmptyMessage(1);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m16797p(MediaRouteDiscoveryRequest mediaRouteDiscoveryRequest) {
        MediaRouter.m16813a();
        if (Objects.equals(this.f38816e, mediaRouteDiscoveryRequest)) {
            return;
        }
        this.f38816e = mediaRouteDiscoveryRequest;
        if (this.f38817f) {
            return;
        }
        this.f38817f = true;
        this.f38814c.sendEmptyMessage(2);
    }

    public MediaRouteProvider(Context context, c cVar) {
        this.f38814c = new b();
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        this.f38812a = context;
        if (cVar == null) {
            this.f38813b = new c(new ComponentName(context, getClass()));
        } else {
            this.f38813b = cVar;
        }
    }
}
