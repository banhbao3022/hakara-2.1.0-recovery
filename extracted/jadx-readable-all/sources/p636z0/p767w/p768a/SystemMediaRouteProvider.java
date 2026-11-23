package p636z0.p767w.p768a;

import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.media.MediaRouter;
import android.util.Log;
import android.view.Display;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import mtp.media.karaoke.R;
import p636z0.p752p.C8310a;

/* JADX INFO: renamed from: z0.w.a.v, reason: use source file name */
/* JADX INFO: compiled from: SystemMediaRouteProvider.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class SystemMediaRouteProvider extends MediaRouteProvider {

    /* JADX INFO: renamed from: z0.w.a.v$a */
    /* JADX INFO: compiled from: SystemMediaRouteProvider.java */
    public static class a extends d {
        public a(Context context, e eVar) {
            super(context, eVar);
        }

        @Override // p636z0.p767w.p768a.SystemMediaRouteProvider.d, p636z0.p767w.p768a.SystemMediaRouteProvider.c, p636z0.p767w.p768a.SystemMediaRouteProvider.b
        /* JADX INFO: renamed from: B */
        public void mo16874B(b.C8575b c8575b, MediaRouteDescriptor.a aVar) {
            super.mo16874B(c8575b, aVar);
            aVar.f38808a.putInt("deviceType", ((MediaRouter.RouteInfo) c8575b.f38966a).getDeviceType());
        }
    }

    /* JADX INFO: renamed from: z0.w.a.v$b */
    /* JADX INFO: compiled from: SystemMediaRouteProvider.java */
    public static class b extends SystemMediaRouteProvider implements MediaRouterJellybean, MediaRouterJellybean5 {

        /* JADX INFO: renamed from: i */
        public static final ArrayList<IntentFilter> f38951i;

        /* JADX INFO: renamed from: j */
        public static final ArrayList<IntentFilter> f38952j;

        /* JADX INFO: renamed from: k */
        public final e f38953k;

        /* JADX INFO: renamed from: l */
        public final Object f38954l;

        /* JADX INFO: renamed from: m */
        public final Object f38955m;

        /* JADX INFO: renamed from: n */
        public final Object f38956n;

        /* JADX INFO: renamed from: o */
        public final Object f38957o;

        /* JADX INFO: renamed from: p */
        public int f38958p;

        /* JADX INFO: renamed from: q */
        public boolean f38959q;

        /* JADX INFO: renamed from: r */
        public boolean f38960r;

        /* JADX INFO: renamed from: s */
        public final ArrayList<C8575b> f38961s;

        /* JADX INFO: renamed from: t */
        public final ArrayList<c> f38962t;

        /* JADX INFO: renamed from: u */
        public MediaRouterJellybean4 f38963u;

        /* JADX INFO: renamed from: v */
        public MediaRouterJellybean3 f38964v;

        /* JADX INFO: renamed from: z0.w.a.v$b$a */
        /* JADX INFO: compiled from: SystemMediaRouteProvider.java */
        public static final class a extends MediaRouteProvider.d {

            /* JADX INFO: renamed from: a */
            public final Object f38965a;

            public a(Object obj) {
                this.f38965a = obj;
            }

            @Override // p636z0.p767w.p768a.MediaRouteProvider.d
            /* JADX INFO: renamed from: c */
            public void mo16801c(int i) {
                ((MediaRouter.RouteInfo) this.f38965a).requestSetVolume(i);
            }

            @Override // p636z0.p767w.p768a.MediaRouteProvider.d
            /* JADX INFO: renamed from: f */
            public void mo16804f(int i) {
                ((MediaRouter.RouteInfo) this.f38965a).requestUpdateVolume(i);
            }
        }

        /* JADX INFO: renamed from: z0.w.a.v$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: SystemMediaRouteProvider.java */
        public static final class C8575b {

            /* JADX INFO: renamed from: a */
            public final Object f38966a;

            /* JADX INFO: renamed from: b */
            public final String f38967b;

            /* JADX INFO: renamed from: c */
            public MediaRouteDescriptor f38968c;

            public C8575b(Object obj, String str) {
                this.f38966a = obj;
                this.f38967b = str;
            }
        }

        /* JADX INFO: renamed from: z0.w.a.v$b$c */
        /* JADX INFO: compiled from: SystemMediaRouteProvider.java */
        public static final class c {

            /* JADX INFO: renamed from: a */
            public final MediaRouter.g f38969a;

            /* JADX INFO: renamed from: b */
            public final Object f38970b;

            public c(MediaRouter.g gVar, Object obj) {
                this.f38969a = gVar;
                this.f38970b = obj;
            }
        }

        static {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addCategory("android.media.intent.category.LIVE_AUDIO");
            ArrayList<IntentFilter> arrayList = new ArrayList<>();
            f38951i = arrayList;
            arrayList.add(intentFilter);
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addCategory("android.media.intent.category.LIVE_VIDEO");
            ArrayList<IntentFilter> arrayList2 = new ArrayList<>();
            f38952j = arrayList2;
            arrayList2.add(intentFilter2);
        }

        public b(Context context, e eVar) {
            super(context);
            this.f38961s = new ArrayList<>();
            this.f38962t = new ArrayList<>();
            this.f38953k = eVar;
            Object systemService = context.getSystemService("media_router");
            this.f38954l = systemService;
            this.f38955m = mo16883v();
            this.f38956n = new MediaRouterJellybean6(this);
            this.f38957o = ((MediaRouter) systemService).createRouteCategory((CharSequence) context.getResources().getString(R.string.mr_user_route_category_name), false);
            m16880G();
        }

        /* JADX INFO: renamed from: A */
        public c m16875A(Object obj) {
            Object tag = ((MediaRouter.RouteInfo) obj).getTag();
            if (tag instanceof c) {
                return (c) tag;
            }
            return null;
        }

        /* JADX INFO: renamed from: B */
        public void mo16874B(C8575b c8575b, MediaRouteDescriptor.a aVar) {
            int supportedTypes = ((MediaRouter.RouteInfo) c8575b.f38966a).getSupportedTypes();
            if ((supportedTypes & 1) != 0) {
                aVar.m16788a(f38951i);
            }
            if ((supportedTypes & 2) != 0) {
                aVar.m16788a(f38952j);
            }
            aVar.f38808a.putInt("playbackType", ((MediaRouter.RouteInfo) c8575b.f38966a).getPlaybackType());
            aVar.f38808a.putInt("playbackStream", ((MediaRouter.RouteInfo) c8575b.f38966a).getPlaybackStream());
            aVar.m16790c(((MediaRouter.RouteInfo) c8575b.f38966a).getVolume());
            aVar.f38808a.putInt("volumeMax", ((MediaRouter.RouteInfo) c8575b.f38966a).getVolumeMax());
            aVar.f38808a.putInt("volumeHandling", ((MediaRouter.RouteInfo) c8575b.f38966a).getVolumeHandling());
        }

        /* JADX INFO: renamed from: C */
        public void m16876C() {
            MediaRouteProviderDescriptor.a aVar = new MediaRouteProviderDescriptor.a();
            int size = this.f38961s.size();
            for (int i = 0; i < size; i++) {
                aVar.m16807a(this.f38961s.get(i).f38968c);
            }
            m16796o(aVar.m16808b());
        }

        /* JADX INFO: renamed from: D */
        public void mo16877D(Object obj) {
            if (this.f38963u == null) {
                this.f38963u = new MediaRouterJellybean4();
            }
            MediaRouterJellybean4 mediaRouterJellybean4 = this.f38963u;
            Object obj2 = this.f38954l;
            Objects.requireNonNull(mediaRouterJellybean4);
            MediaRouter mediaRouter = (MediaRouter) obj2;
            MediaRouter.RouteInfo routeInfo = (MediaRouter.RouteInfo) obj;
            if ((routeInfo.getSupportedTypes() & 8388608) == 0) {
                Log.w("MediaRouterJellybean", "Cannot programmatically select non-user route because the platform is missing the selectRouteInt() method.  Media routing may not work.");
            }
            mediaRouter.selectRoute(8388611, routeInfo);
        }

        /* JADX INFO: renamed from: E */
        public void mo16878E() {
            if (this.f38960r) {
                this.f38960r = false;
                ((MediaRouter) this.f38954l).removeCallback((MediaRouter.Callback) this.f38955m);
            }
            int i = this.f38958p;
            if (i != 0) {
                this.f38960r = true;
                ((MediaRouter) this.f38954l).addCallback(i, (MediaRouter.Callback) this.f38955m);
            }
        }

        /* JADX INFO: renamed from: F */
        public void m16879F(C8575b c8575b) {
            String str = c8575b.f38967b;
            CharSequence name = ((MediaRouter.RouteInfo) c8575b.f38966a).getName(this.f38812a);
            MediaRouteDescriptor.a aVar = new MediaRouteDescriptor.a(str, name != null ? name.toString() : "");
            mo16874B(c8575b, aVar);
            c8575b.f38968c = aVar.m16789b();
        }

        /* JADX INFO: renamed from: G */
        public final void m16880G() {
            mo16878E();
            MediaRouter mediaRouter = (MediaRouter) this.f38954l;
            int routeCount = mediaRouter.getRouteCount();
            ArrayList arrayList = new ArrayList(routeCount);
            boolean zM16882u = false;
            for (int i = 0; i < routeCount; i++) {
                arrayList.add(mediaRouter.getRouteAt(i));
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                zM16882u |= m16882u(it.next());
            }
            if (zM16882u) {
                m16876C();
            }
        }

        /* JADX INFO: renamed from: H */
        public void mo16881H(c cVar) {
            ((MediaRouter.UserRouteInfo) cVar.f38970b).setName(cVar.f38969a.f38876d);
            ((MediaRouter.UserRouteInfo) cVar.f38970b).setPlaybackType(cVar.f38969a.f38884l);
            ((MediaRouter.UserRouteInfo) cVar.f38970b).setPlaybackStream(cVar.f38969a.f38885m);
            ((MediaRouter.UserRouteInfo) cVar.f38970b).setVolume(cVar.f38969a.f38888p);
            ((MediaRouter.UserRouteInfo) cVar.f38970b).setVolumeMax(cVar.f38969a.f38889q);
            ((MediaRouter.UserRouteInfo) cVar.f38970b).setVolumeHandling(cVar.f38969a.f38887o);
        }

        @Override // p636z0.p767w.p768a.MediaRouterJellybean
        /* JADX INFO: renamed from: a */
        public void mo16843a(Object obj) {
            int iM16884w;
            if (m16875A(obj) != null || (iM16884w = m16884w(obj)) < 0) {
                return;
            }
            m16879F(this.f38961s.get(iM16884w));
            m16876C();
        }

        @Override // p636z0.p767w.p768a.MediaRouterJellybean
        /* JADX INFO: renamed from: b */
        public void mo16844b(int i, Object obj) {
        }

        @Override // p636z0.p767w.p768a.MediaRouterJellybean5
        /* JADX INFO: renamed from: c */
        public void mo16851c(Object obj, int i) {
            c cVarM16875A = m16875A(obj);
            if (cVarM16875A != null) {
                cVarM16875A.f38969a.m16839f(i);
            }
        }

        @Override // p636z0.p767w.p768a.MediaRouterJellybean
        /* JADX INFO: renamed from: d */
        public void mo16845d(Object obj) {
            int iM16884w;
            if (m16875A(obj) != null || (iM16884w = m16884w(obj)) < 0) {
                return;
            }
            this.f38961s.remove(iM16884w);
            m16876C();
        }

        @Override // p636z0.p767w.p768a.MediaRouterJellybean
        /* JADX INFO: renamed from: e */
        public void mo16846e(int i, Object obj) {
            MediaRouter.e eVar;
            int iM16833a;
            if (obj != ((MediaRouter) this.f38954l).getSelectedRoute(8388611)) {
                return;
            }
            c cVarM16875A = m16875A(obj);
            if (cVarM16875A != null) {
                cVarM16875A.f38969a.m16840g();
                return;
            }
            int iM16884w = m16884w(obj);
            if (iM16884w >= 0) {
                C8575b c8575b = this.f38961s.get(iM16884w);
                e eVar2 = this.f38953k;
                String str = c8575b.f38967b;
                MediaRouter.d dVar = (MediaRouter.d) eVar2;
                dVar.f38846i.removeMessages(262);
                int iM16818b = dVar.m16818b(dVar.f38847j);
                if (iM16818b < 0 || (iM16833a = (eVar = dVar.f38842e.get(iM16818b)).m16833a(str)) < 0) {
                    return;
                }
                eVar.f38869b.get(iM16833a).m16840g();
            }
        }

        @Override // p636z0.p767w.p768a.MediaRouterJellybean
        /* JADX INFO: renamed from: g */
        public void mo16847g(Object obj, Object obj2) {
        }

        @Override // p636z0.p767w.p768a.MediaRouterJellybean
        /* JADX INFO: renamed from: h */
        public void mo16848h(Object obj, Object obj2, int i) {
        }

        @Override // p636z0.p767w.p768a.MediaRouterJellybean
        /* JADX INFO: renamed from: i */
        public void mo16849i(Object obj) {
            if (m16882u(obj)) {
                m16876C();
            }
        }

        @Override // p636z0.p767w.p768a.MediaRouterJellybean5
        /* JADX INFO: renamed from: j */
        public void mo16852j(Object obj, int i) {
            c cVarM16875A = m16875A(obj);
            if (cVarM16875A != null) {
                cVarM16875A.f38969a.m16838e(i);
            }
        }

        @Override // p636z0.p767w.p768a.MediaRouterJellybean
        /* JADX INFO: renamed from: k */
        public void mo16850k(Object obj) {
            int iM16884w;
            if (m16875A(obj) != null || (iM16884w = m16884w(obj)) < 0) {
                return;
            }
            C8575b c8575b = this.f38961s.get(iM16884w);
            int volume = ((MediaRouter.RouteInfo) obj).getVolume();
            if (volume != c8575b.f38968c.m16782m()) {
                MediaRouteDescriptor.a aVar = new MediaRouteDescriptor.a(c8575b.f38968c);
                aVar.m16790c(volume);
                c8575b.f38968c = aVar.m16789b();
                m16876C();
            }
        }

        @Override // p636z0.p767w.p768a.MediaRouteProvider
        /* JADX INFO: renamed from: l */
        public MediaRouteProvider.d mo16793l(String str) {
            int iM16885x = m16885x(str);
            if (iM16885x >= 0) {
                return new a(this.f38961s.get(iM16885x).f38966a);
            }
            return null;
        }

        @Override // p636z0.p767w.p768a.MediaRouteProvider
        /* JADX INFO: renamed from: n */
        public void mo16795n(MediaRouteDiscoveryRequest mediaRouteDiscoveryRequest) {
            boolean zM16792b;
            int i = 0;
            if (mediaRouteDiscoveryRequest != null) {
                mediaRouteDiscoveryRequest.m16791a();
                MediaRouteSelector mediaRouteSelector = mediaRouteDiscoveryRequest.f38811b;
                mediaRouteSelector.m16810a();
                List<String> list = mediaRouteSelector.f38828c;
                int size = list.size();
                int i2 = 0;
                while (i < size) {
                    String str = list.get(i);
                    if (str.equals("android.media.intent.category.LIVE_AUDIO")) {
                        i2 |= 1;
                    } else {
                        i2 = str.equals("android.media.intent.category.LIVE_VIDEO") ? i2 | 2 : i2 | 8388608;
                    }
                    i++;
                }
                zM16792b = mediaRouteDiscoveryRequest.m16792b();
                i = i2;
            } else {
                zM16792b = false;
            }
            if (this.f38958p == i && this.f38959q == zM16792b) {
                return;
            }
            this.f38958p = i;
            this.f38959q = zM16792b;
            m16880G();
        }

        @Override // p636z0.p767w.p768a.SystemMediaRouteProvider
        /* JADX INFO: renamed from: q */
        public void mo16870q(MediaRouter.g gVar) {
            if (gVar.m16835a() == this) {
                int iM16884w = m16884w(((MediaRouter) this.f38954l).getSelectedRoute(8388611));
                if (iM16884w < 0 || !this.f38961s.get(iM16884w).f38967b.equals(gVar.f38874b)) {
                    return;
                }
                gVar.m16840g();
                return;
            }
            MediaRouter.UserRouteInfo userRouteInfoCreateUserRoute = ((MediaRouter) this.f38954l).createUserRoute((MediaRouter.RouteCategory) this.f38957o);
            c cVar = new c(gVar, userRouteInfoCreateUserRoute);
            userRouteInfoCreateUserRoute.setTag(cVar);
            C8310a.m16442g(userRouteInfoCreateUserRoute, this.f38956n);
            mo16881H(cVar);
            this.f38962t.add(cVar);
            ((MediaRouter) this.f38954l).addUserRoute(userRouteInfoCreateUserRoute);
        }

        @Override // p636z0.p767w.p768a.SystemMediaRouteProvider
        /* JADX INFO: renamed from: r */
        public void mo16871r(MediaRouter.g gVar) {
            int iM16886y;
            if (gVar.m16835a() == this || (iM16886y = m16886y(gVar)) < 0) {
                return;
            }
            mo16881H(this.f38962t.get(iM16886y));
        }

        @Override // p636z0.p767w.p768a.SystemMediaRouteProvider
        /* JADX INFO: renamed from: s */
        public void mo16872s(MediaRouter.g gVar) {
            int iM16886y;
            if (gVar.m16835a() == this || (iM16886y = m16886y(gVar)) < 0) {
                return;
            }
            c cVarRemove = this.f38962t.remove(iM16886y);
            ((MediaRouter.RouteInfo) cVarRemove.f38970b).setTag(null);
            C8310a.m16442g(cVarRemove.f38970b, null);
            ((MediaRouter) this.f38954l).removeUserRoute((MediaRouter.UserRouteInfo) cVarRemove.f38970b);
        }

        @Override // p636z0.p767w.p768a.SystemMediaRouteProvider
        /* JADX INFO: renamed from: t */
        public void mo16873t(MediaRouter.g gVar) {
            Objects.requireNonNull(gVar);
            MediaRouter.m16813a();
            if (MediaRouter.f38831b.m16821e() == gVar) {
                if (gVar.m16835a() != this) {
                    int iM16886y = m16886y(gVar);
                    if (iM16886y >= 0) {
                        mo16877D(this.f38962t.get(iM16886y).f38970b);
                        return;
                    }
                    return;
                }
                int iM16885x = m16885x(gVar.f38874b);
                if (iM16885x >= 0) {
                    mo16877D(this.f38961s.get(iM16885x).f38966a);
                }
            }
        }

        /* JADX INFO: renamed from: u */
        public final boolean m16882u(Object obj) {
            String str;
            String str2;
            if (m16875A(obj) != null || m16884w(obj) >= 0) {
                return false;
            }
            if (mo16887z() == obj) {
                str = "DEFAULT_ROUTE";
            } else {
                Locale locale = Locale.US;
                Object[] objArr = new Object[1];
                CharSequence name = ((MediaRouter.RouteInfo) obj).getName(this.f38812a);
                objArr[0] = Integer.valueOf((name != null ? name.toString() : "").hashCode());
                str = String.format(locale, "ROUTE_%08x", objArr);
            }
            if (m16885x(str) >= 0) {
                int i = 2;
                while (true) {
                    str2 = String.format(Locale.US, "%s_%d", str, Integer.valueOf(i));
                    if (m16885x(str2) < 0) {
                        break;
                    }
                    i++;
                }
                str = str2;
            }
            C8575b c8575b = new C8575b(obj, str);
            m16879F(c8575b);
            this.f38961s.add(c8575b);
            return true;
        }

        /* JADX INFO: renamed from: v */
        public Object mo16883v() {
            return new MediaRouterJellybean2(this);
        }

        /* JADX INFO: renamed from: w */
        public int m16884w(Object obj) {
            int size = this.f38961s.size();
            for (int i = 0; i < size; i++) {
                if (this.f38961s.get(i).f38966a == obj) {
                    return i;
                }
            }
            return -1;
        }

        /* JADX INFO: renamed from: x */
        public int m16885x(String str) {
            int size = this.f38961s.size();
            for (int i = 0; i < size; i++) {
                if (this.f38961s.get(i).f38967b.equals(str)) {
                    return i;
                }
            }
            return -1;
        }

        /* JADX INFO: renamed from: y */
        public int m16886y(MediaRouter.g gVar) {
            int size = this.f38962t.size();
            for (int i = 0; i < size; i++) {
                if (this.f38962t.get(i).f38969a == gVar) {
                    return i;
                }
            }
            return -1;
        }

        /* JADX INFO: renamed from: z */
        public Object mo16887z() {
            if (this.f38964v == null) {
                this.f38964v = new MediaRouterJellybean3();
            }
            MediaRouterJellybean3 mediaRouterJellybean3 = this.f38964v;
            Object obj = this.f38954l;
            Objects.requireNonNull(mediaRouterJellybean3);
            return ((MediaRouter) obj).getRouteAt(0);
        }
    }

    /* JADX INFO: renamed from: z0.w.a.v$c */
    /* JADX INFO: compiled from: SystemMediaRouteProvider.java */
    public static class c extends b implements MediaRouterJellybeanMr12 {

        /* JADX INFO: renamed from: w */
        public MediaRouterJellybeanMr1 f38971w;

        /* JADX INFO: renamed from: x */
        public MediaRouterJellybeanMr14 f38972x;

        public c(Context context, e eVar) {
            super(context, eVar);
        }

        @Override // p636z0.p767w.p768a.SystemMediaRouteProvider.b
        /* JADX INFO: renamed from: B */
        public void mo16874B(b.C8575b c8575b, MediaRouteDescriptor.a aVar) {
            Display presentationDisplay;
            super.mo16874B(c8575b, aVar);
            if (!((MediaRouter.RouteInfo) c8575b.f38966a).isEnabled()) {
                aVar.f38808a.putBoolean("enabled", false);
            }
            if (mo16888I(c8575b)) {
                aVar.f38808a.putBoolean("connecting", true);
            }
            try {
                presentationDisplay = ((MediaRouter.RouteInfo) c8575b.f38966a).getPresentationDisplay();
            } catch (NoSuchMethodError e) {
                Log.w("MediaRouterJellybeanMr1", "Cannot get presentation display for the route.", e);
                presentationDisplay = null;
            }
            if (presentationDisplay != null) {
                aVar.f38808a.putInt("presentationDisplayId", presentationDisplay.getDisplayId());
            }
        }

        @Override // p636z0.p767w.p768a.SystemMediaRouteProvider.b
        /* JADX INFO: renamed from: E */
        public void mo16878E() {
            super.mo16878E();
            if (this.f38971w == null) {
                this.f38971w = new MediaRouterJellybeanMr1(this.f38812a, this.f38814c);
            }
            MediaRouterJellybeanMr1 mediaRouterJellybeanMr1 = this.f38971w;
            if (((this.f38959q ? this.f38958p : 0) & 2) == 0) {
                Objects.requireNonNull(mediaRouterJellybeanMr1);
            } else {
                Objects.requireNonNull(mediaRouterJellybeanMr1);
                Log.w("MediaRouterJellybeanMr1", "Cannot scan for wifi displays because the DisplayManager.scanWifiDisplays() method is not available on this device.");
            }
        }

        /* JADX INFO: renamed from: I */
        public boolean mo16888I(b.C8575b c8575b) {
            if (this.f38972x == null) {
                this.f38972x = new MediaRouterJellybeanMr14();
            }
            MediaRouterJellybeanMr14 mediaRouterJellybeanMr14 = this.f38972x;
            Object obj = c8575b.f38966a;
            Objects.requireNonNull(mediaRouterJellybeanMr14);
            return false;
        }

        @Override // p636z0.p767w.p768a.MediaRouterJellybeanMr12
        /* JADX INFO: renamed from: f */
        public void mo16853f(Object obj) {
            Display presentationDisplay;
            int iM16884w = m16884w(obj);
            if (iM16884w >= 0) {
                b.C8575b c8575b = this.f38961s.get(iM16884w);
                try {
                    presentationDisplay = ((MediaRouter.RouteInfo) obj).getPresentationDisplay();
                } catch (NoSuchMethodError e) {
                    Log.w("MediaRouterJellybeanMr1", "Cannot get presentation display for the route.", e);
                    presentationDisplay = null;
                }
                int displayId = presentationDisplay != null ? presentationDisplay.getDisplayId() : -1;
                if (displayId != c8575b.f38968c.m16781l()) {
                    MediaRouteDescriptor.a aVar = new MediaRouteDescriptor.a(c8575b.f38968c);
                    aVar.f38808a.putInt("presentationDisplayId", displayId);
                    c8575b.f38968c = aVar.m16789b();
                    m16876C();
                }
            }
        }

        @Override // p636z0.p767w.p768a.SystemMediaRouteProvider.b
        /* JADX INFO: renamed from: v */
        public Object mo16883v() {
            return new MediaRouterJellybeanMr13(this);
        }
    }

    /* JADX INFO: renamed from: z0.w.a.v$d */
    /* JADX INFO: compiled from: SystemMediaRouteProvider.java */
    public static class d extends c {
        public d(Context context, e eVar) {
            super(context, eVar);
        }

        @Override // p636z0.p767w.p768a.SystemMediaRouteProvider.c, p636z0.p767w.p768a.SystemMediaRouteProvider.b
        /* JADX INFO: renamed from: B */
        public void mo16874B(b.C8575b c8575b, MediaRouteDescriptor.a aVar) {
            super.mo16874B(c8575b, aVar);
            CharSequence description = ((MediaRouter.RouteInfo) c8575b.f38966a).getDescription();
            if (description != null) {
                aVar.f38808a.putString("status", description.toString());
            }
        }

        @Override // p636z0.p767w.p768a.SystemMediaRouteProvider.b
        /* JADX INFO: renamed from: D */
        public void mo16877D(Object obj) {
            ((MediaRouter) this.f38954l).selectRoute(8388611, (MediaRouter.RouteInfo) obj);
        }

        @Override // p636z0.p767w.p768a.SystemMediaRouteProvider.c, p636z0.p767w.p768a.SystemMediaRouteProvider.b
        /* JADX INFO: renamed from: E */
        public void mo16878E() {
            if (this.f38960r) {
                ((MediaRouter) this.f38954l).removeCallback((MediaRouter.Callback) this.f38955m);
            }
            this.f38960r = true;
            Object obj = this.f38954l;
            MediaRouter mediaRouter = (MediaRouter) obj;
            mediaRouter.addCallback(this.f38958p, (MediaRouter.Callback) this.f38955m, (this.f38959q ? 1 : 0) | 2);
        }

        @Override // p636z0.p767w.p768a.SystemMediaRouteProvider.b
        /* JADX INFO: renamed from: H */
        public void mo16881H(b.c cVar) {
            super.mo16881H(cVar);
            ((MediaRouter.UserRouteInfo) cVar.f38970b).setDescription(cVar.f38969a.f38877e);
        }

        @Override // p636z0.p767w.p768a.SystemMediaRouteProvider.c
        /* JADX INFO: renamed from: I */
        public boolean mo16888I(b.C8575b c8575b) {
            return ((MediaRouter.RouteInfo) c8575b.f38966a).isConnecting();
        }

        @Override // p636z0.p767w.p768a.SystemMediaRouteProvider.b
        /* JADX INFO: renamed from: z */
        public Object mo16887z() {
            return ((MediaRouter) this.f38954l).getDefaultRoute();
        }
    }

    /* JADX INFO: renamed from: z0.w.a.v$e */
    /* JADX INFO: compiled from: SystemMediaRouteProvider.java */
    public interface e {
    }

    public SystemMediaRouteProvider(Context context) {
        super(context, new MediaRouteProvider.c(new ComponentName("android", SystemMediaRouteProvider.class.getName())));
    }

    /* JADX INFO: renamed from: q */
    public void mo16870q(MediaRouter.g gVar) {
    }

    /* JADX INFO: renamed from: r */
    public void mo16871r(MediaRouter.g gVar) {
    }

    /* JADX INFO: renamed from: s */
    public void mo16872s(MediaRouter.g gVar) {
    }

    /* JADX INFO: renamed from: t */
    public void mo16873t(MediaRouter.g gVar) {
    }
}
