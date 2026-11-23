package p636z0.p767w.p768a;

import android.app.ActivityManager;
import android.content.Context;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.media.VolumeProvider;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p725k.p731f.p732a.DisplayManagerCompat;
import p636z0.p725k.p738k.Pair;
import p636z0.p765v.VolumeProviderCompat;

/* JADX INFO: renamed from: z0.w.a.f, reason: use source file name */
/* JADX INFO: compiled from: MediaRouter.java */
/* JADX INFO: loaded from: classes.dex */
public final class MediaRouter {

    /* JADX INFO: renamed from: a */
    public static final boolean f38830a = Log.isLoggable("MediaRouter", 3);

    /* JADX INFO: renamed from: b */
    public static d f38831b;

    /* JADX INFO: renamed from: c */
    public final Context f38832c;

    /* JADX INFO: renamed from: d */
    public final ArrayList<b> f38833d = new ArrayList<>();

    /* JADX INFO: renamed from: z0.w.a.f$a */
    /* JADX INFO: compiled from: MediaRouter.java */
    public static abstract class a {
        /* JADX INFO: renamed from: a */
        public void mo9166a(MediaRouter mediaRouter, g gVar) {
        }

        /* JADX INFO: renamed from: b */
        public void mo9167b(MediaRouter mediaRouter, g gVar) {
        }

        /* JADX INFO: renamed from: c */
        public void mo9168c(MediaRouter mediaRouter, g gVar) {
        }

        /* JADX INFO: renamed from: d */
        public void mo9169d(MediaRouter mediaRouter, g gVar) {
        }

        /* JADX INFO: renamed from: e */
        public void mo9170e(MediaRouter mediaRouter, g gVar, int i) {
        }
    }

    /* JADX INFO: renamed from: z0.w.a.f$b */
    /* JADX INFO: compiled from: MediaRouter.java */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final MediaRouter f38834a;

        /* JADX INFO: renamed from: b */
        public final a f38835b;

        /* JADX INFO: renamed from: c */
        public MediaRouteSelector f38836c = MediaRouteSelector.f38826a;

        /* JADX INFO: renamed from: d */
        public int f38837d;

        public b(MediaRouter mediaRouter, a aVar) {
            this.f38834a = mediaRouter;
            this.f38835b = aVar;
        }
    }

    /* JADX INFO: renamed from: z0.w.a.f$c */
    /* JADX INFO: compiled from: MediaRouter.java */
    public static abstract class c {
    }

    /* JADX INFO: renamed from: z0.w.a.f$d */
    /* JADX INFO: compiled from: MediaRouter.java */
    public static final class d implements SystemMediaRouteProvider.e, RegisteredMediaRouteProviderWatcher.c {

        /* JADX INFO: renamed from: a */
        public final Context f38838a;

        /* JADX INFO: renamed from: j */
        public final SystemMediaRouteProvider f38847j;

        /* JADX INFO: renamed from: k */
        public final boolean f38848k;

        /* JADX INFO: renamed from: l */
        public RegisteredMediaRouteProviderWatcher f38849l;

        /* JADX INFO: renamed from: m */
        public g f38850m;

        /* JADX INFO: renamed from: n */
        public g f38851n;

        /* JADX INFO: renamed from: o */
        public g f38852o;

        /* JADX INFO: renamed from: p */
        public MediaRouteProvider.d f38853p;

        /* JADX INFO: renamed from: r */
        public MediaRouteDiscoveryRequest f38855r;

        /* JADX INFO: renamed from: s */
        public c f38856s;

        /* JADX INFO: renamed from: b */
        public final ArrayList<WeakReference<MediaRouter>> f38839b = new ArrayList<>();

        /* JADX INFO: renamed from: c */
        public final ArrayList<g> f38840c = new ArrayList<>();

        /* JADX INFO: renamed from: d */
        public final Map<Pair<String, String>, String> f38841d = new HashMap();

        /* JADX INFO: renamed from: e */
        public final ArrayList<e> f38842e = new ArrayList<>();

        /* JADX INFO: renamed from: f */
        public final ArrayList<e> f38843f = new ArrayList<>();

        /* JADX INFO: renamed from: g */
        public final RemoteControlClientCompat.b f38844g = new RemoteControlClientCompat.b();

        /* JADX INFO: renamed from: h */
        public final C8572d f38845h = new C8572d();

        /* JADX INFO: renamed from: i */
        public final b f38846i = new b();

        /* JADX INFO: renamed from: q */
        public final Map<String, MediaRouteProvider.d> f38854q = new HashMap();

        /* JADX INFO: renamed from: t */
        public MediaSessionCompat.InterfaceC0037g f38857t = new a();

        /* JADX INFO: renamed from: z0.w.a.f$d$a */
        /* JADX INFO: compiled from: MediaRouter.java */
        public class a implements MediaSessionCompat.InterfaceC0037g {
            public a() {
            }

            @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC0037g
            /* JADX INFO: renamed from: a */
            public void mo118a() {
                Objects.requireNonNull(d.this);
            }
        }

        /* JADX INFO: renamed from: z0.w.a.f$d$b */
        /* JADX INFO: compiled from: MediaRouter.java */
        public final class b extends Handler {

            /* JADX INFO: renamed from: a */
            public final ArrayList<b> f38859a = new ArrayList<>();

            public b() {
            }

            /* JADX INFO: renamed from: a */
            public final void m16830a(b bVar, int i, Object obj, int i2) {
                MediaRouter mediaRouter = bVar.f38834a;
                a aVar = bVar.f38835b;
                int i3 = 65280 & i;
                if (i3 != 256) {
                    if (i3 != 512) {
                        return;
                    }
                    switch (i) {
                        case 513:
                            Objects.requireNonNull(aVar);
                            break;
                        case 514:
                            Objects.requireNonNull(aVar);
                            break;
                        case 515:
                            Objects.requireNonNull(aVar);
                            break;
                    }
                }
                g gVar = (g) obj;
                if ((bVar.f38837d & 2) != 0 || gVar.m16837c(bVar.f38836c)) {
                    switch (i) {
                        case 257:
                            aVar.mo9166a(mediaRouter, gVar);
                            break;
                        case 258:
                            aVar.mo9168c(mediaRouter, gVar);
                            break;
                        case 259:
                            aVar.mo9167b(mediaRouter, gVar);
                            break;
                        case 260:
                            Objects.requireNonNull(aVar);
                            break;
                        case 261:
                            Objects.requireNonNull(aVar);
                            break;
                        case 262:
                            aVar.mo9169d(mediaRouter, gVar);
                            break;
                        case 263:
                            aVar.mo9170e(mediaRouter, gVar, i2);
                            break;
                    }
                }
            }

            /* JADX INFO: renamed from: b */
            public void m16831b(int i, Object obj) {
                obtainMessage(i, obj).sendToTarget();
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i = message.what;
                Object obj = message.obj;
                int i2 = message.arg1;
                if (i == 259 && d.this.m16821e().f38875c.equals(((g) obj).f38875c)) {
                    d.this.m16829m(true);
                }
                if (i != 262) {
                    switch (i) {
                        case 257:
                            d.this.f38847j.mo16870q((g) obj);
                            break;
                        case 258:
                            d.this.f38847j.mo16872s((g) obj);
                            break;
                        case 259:
                            d.this.f38847j.mo16871r((g) obj);
                            break;
                    }
                } else {
                    d.this.f38847j.mo16873t((g) obj);
                }
                try {
                    int size = d.this.f38839b.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            int size2 = this.f38859a.size();
                            for (int i3 = 0; i3 < size2; i3++) {
                                m16830a(this.f38859a.get(i3), i, obj, i2);
                            }
                            return;
                        }
                        MediaRouter mediaRouter = d.this.f38839b.get(size).get();
                        if (mediaRouter == null) {
                            d.this.f38839b.remove(size);
                        } else {
                            this.f38859a.addAll(mediaRouter.f38833d);
                        }
                    }
                } finally {
                    this.f38859a.clear();
                }
            }
        }

        /* JADX INFO: renamed from: z0.w.a.f$d$c */
        /* JADX INFO: compiled from: MediaRouter.java */
        public final class c {

            /* JADX INFO: renamed from: a */
            public final MediaSessionCompat f38861a;

            /* JADX INFO: renamed from: b */
            public VolumeProviderCompat f38862b;

            public c(MediaSessionCompat mediaSessionCompat) {
                this.f38861a = mediaSessionCompat;
            }

            /* JADX INFO: renamed from: a */
            public void m16832a() {
                MediaSessionCompat mediaSessionCompat = this.f38861a;
                if (mediaSessionCompat != null) {
                    mediaSessionCompat.f77c.mo62d(d.this.f38844g.f38949d);
                    this.f38862b = null;
                }
            }
        }

        /* JADX INFO: renamed from: z0.w.a.f$d$d, reason: collision with other inner class name */
        /* JADX INFO: compiled from: MediaRouter.java */
        public final class C8572d extends MediaRouteProvider.a {
            public C8572d() {
            }

            @Override // p636z0.p767w.p768a.MediaRouteProvider.a
            /* JADX INFO: renamed from: a */
            public void mo16798a(MediaRouteProvider mediaRouteProvider, MediaRouteProviderDescriptor mediaRouteProviderDescriptor) {
                d dVar = d.this;
                int iM16818b = dVar.m16818b(mediaRouteProvider);
                if (iM16818b >= 0) {
                    dVar.m16827k(dVar.f38842e.get(iM16818b), mediaRouteProviderDescriptor);
                }
            }
        }

        /* JADX INFO: renamed from: z0.w.a.f$d$e */
        /* JADX INFO: compiled from: MediaRouter.java */
        public final class e implements RemoteControlClientCompat.c {

            /* JADX INFO: renamed from: a */
            public final RemoteControlClientCompat f38865a;

            /* JADX INFO: renamed from: b */
            public boolean f38866b;

            public e(Object obj) {
                RemoteControlClientCompat.a aVar = new RemoteControlClientCompat.a(d.this.f38838a, obj);
                this.f38865a = aVar;
                aVar.f38940b = this;
                aVar.mo16869a(d.this.f38844g);
            }
        }

        public d(Context context) {
            this.f38838a = context;
            WeakHashMap<Context, DisplayManagerCompat> weakHashMap = DisplayManagerCompat.f37889a;
            synchronized (weakHashMap) {
                if (weakHashMap.get(context) == null) {
                    weakHashMap.put(context, new DisplayManagerCompat(context));
                }
            }
            this.f38848k = ((ActivityManager) context.getSystemService("activity")).isLowRamDevice();
            this.f38847j = Build.VERSION.SDK_INT >= 24 ? new SystemMediaRouteProvider.a(context, this) : new SystemMediaRouteProvider.d(context, this);
        }

        /* JADX INFO: renamed from: a */
        public void m16817a(MediaRouteProvider mediaRouteProvider) {
            if (m16818b(mediaRouteProvider) < 0) {
                e eVar = new e(mediaRouteProvider);
                this.f38842e.add(eVar);
                if (MediaRouter.f38830a) {
                    Log.d("MediaRouter", "Provider added: " + eVar);
                }
                this.f38846i.m16831b(513, eVar);
                m16827k(eVar, mediaRouteProvider.f38818g);
                C8572d c8572d = this.f38845h;
                MediaRouter.m16813a();
                mediaRouteProvider.f38815d = c8572d;
                mediaRouteProvider.m16797p(this.f38855r);
            }
        }

        /* JADX INFO: renamed from: b */
        public final int m16818b(MediaRouteProvider mediaRouteProvider) {
            int size = this.f38842e.size();
            for (int i = 0; i < size; i++) {
                if (this.f38842e.get(i).f38868a == mediaRouteProvider) {
                    return i;
                }
            }
            return -1;
        }

        /* JADX INFO: renamed from: c */
        public final int m16819c(String str) {
            int size = this.f38840c.size();
            for (int i = 0; i < size; i++) {
                if (this.f38840c.get(i).f38875c.equals(str)) {
                    return i;
                }
            }
            return -1;
        }

        /* JADX INFO: renamed from: d */
        public g m16820d() {
            g gVar = this.f38850m;
            if (gVar != null) {
                return gVar;
            }
            throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
        }

        /* JADX INFO: renamed from: e */
        public g m16821e() {
            g gVar = this.f38852o;
            if (gVar != null) {
                return gVar;
            }
            throw new IllegalStateException("There is no currently selected route.  The media router has not yet been fully initialized.");
        }

        /* JADX INFO: renamed from: f */
        public final boolean m16822f(g gVar) {
            return gVar.m16835a() == this.f38847j && gVar.m16841h("android.media.intent.category.LIVE_AUDIO") && !gVar.m16841h("android.media.intent.category.LIVE_VIDEO");
        }

        /* JADX INFO: renamed from: g */
        public void m16823g(g gVar) {
            if (!this.f38840c.contains(gVar)) {
                Log.w("MediaRouter", "Ignoring attempt to select removed route: " + gVar);
                return;
            }
            if (gVar.f38879g) {
                m16824h(gVar, 3);
                return;
            }
            Log.w("MediaRouter", "Ignoring attempt to select disabled route: " + gVar);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x001d  */
        /* JADX WARN: Code duplicated, block: B:14:0x002e A[LOOP:2: B:12:0x002b->B:14:0x002e, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:17:0x005d  */
        /* JADX WARN: Code duplicated, block: B:18:0x007e  */
        /* JADX INFO: renamed from: h */
        public final void m16824h(g gVar, int i) {
            StackTraceElement[] stackTrace;
            StringBuilder sb;
            int i2;
            if (MediaRouter.f38831b == null) {
                stackTrace = Thread.currentThread().getStackTrace();
                sb = new StringBuilder();
                for (i2 = 3; i2 < stackTrace.length; i2++) {
                    StackTraceElement stackTraceElement = stackTrace[i2];
                    sb.append(stackTraceElement.getClassName());
                    sb.append(".");
                    sb.append(stackTraceElement.getMethodName());
                    sb.append(":");
                    sb.append(stackTraceElement.getLineNumber());
                    sb.append("  ");
                }
                if (MediaRouter.f38831b == null) {
                    StringBuilder sbM1556G = outline.m1556G("setSelectedRouteInternal is called while sGlobal is null: pkgName=");
                    sbM1556G.append(this.f38838a.getPackageName());
                    sbM1556G.append(", callers=");
                    sbM1556G.append(sb.toString());
                    Log.w("MediaRouter", sbM1556G.toString());
                } else {
                    StringBuilder sbM1556G2 = outline.m1556G("Default route is selected while a BT route is available: pkgName=");
                    sbM1556G2.append(this.f38838a.getPackageName());
                    sbM1556G2.append(", callers=");
                    sbM1556G2.append(sb.toString());
                    Log.w("MediaRouter", sbM1556G2.toString());
                }
            } else if (this.f38851n != null) {
                Objects.requireNonNull(gVar);
                MediaRouter.m16813a();
                if (MediaRouter.f38831b.m16820d() == gVar) {
                    stackTrace = Thread.currentThread().getStackTrace();
                    sb = new StringBuilder();
                    while (i2 < stackTrace.length) {
                        StackTraceElement stackTraceElement2 = stackTrace[i2];
                        sb.append(stackTraceElement2.getClassName());
                        sb.append(".");
                        sb.append(stackTraceElement2.getMethodName());
                        sb.append(":");
                        sb.append(stackTraceElement2.getLineNumber());
                        sb.append("  ");
                    }
                    if (MediaRouter.f38831b == null) {
                        StringBuilder sbM1556G3 = outline.m1556G("setSelectedRouteInternal is called while sGlobal is null: pkgName=");
                        sbM1556G3.append(this.f38838a.getPackageName());
                        sbM1556G3.append(", callers=");
                        sbM1556G3.append(sb.toString());
                        Log.w("MediaRouter", sbM1556G3.toString());
                    } else {
                        StringBuilder sbM1556G4 = outline.m1556G("Default route is selected while a BT route is available: pkgName=");
                        sbM1556G4.append(this.f38838a.getPackageName());
                        sbM1556G4.append(", callers=");
                        sbM1556G4.append(sb.toString());
                        Log.w("MediaRouter", sbM1556G4.toString());
                    }
                }
            }
            g gVar2 = this.f38852o;
            if (gVar2 != gVar) {
                if (gVar2 != null) {
                    if (MediaRouter.f38830a) {
                        StringBuilder sbM1556G5 = outline.m1556G("Route unselected: ");
                        sbM1556G5.append(this.f38852o);
                        sbM1556G5.append(" reason: ");
                        sbM1556G5.append(i);
                        Log.d("MediaRouter", sbM1556G5.toString());
                    }
                    Message messageObtainMessage = this.f38846i.obtainMessage(263, this.f38852o);
                    messageObtainMessage.arg1 = i;
                    messageObtainMessage.sendToTarget();
                    MediaRouteProvider.d dVar = this.f38853p;
                    if (dVar != null) {
                        dVar.mo16803e(i);
                        this.f38853p.mo16799a();
                        this.f38853p = null;
                    }
                    if (!this.f38854q.isEmpty()) {
                        for (MediaRouteProvider.d dVar2 : this.f38854q.values()) {
                            dVar2.mo16803e(i);
                            dVar2.mo16799a();
                        }
                        this.f38854q.clear();
                    }
                }
                this.f38852o = gVar;
                MediaRouteProvider.d dVarMo16793l = gVar.m16835a().mo16793l(gVar.f38874b);
                this.f38853p = dVarMo16793l;
                if (dVarMo16793l != null) {
                    dVarMo16793l.mo16800b();
                }
                if (MediaRouter.f38830a) {
                    StringBuilder sbM1556G6 = outline.m1556G("Route selected: ");
                    sbM1556G6.append(this.f38852o);
                    Log.d("MediaRouter", sbM1556G6.toString());
                }
                this.f38846i.m16831b(262, this.f38852o);
                g gVar3 = this.f38852o;
                if (gVar3 instanceof f) {
                    List<g> list = ((f) gVar3).f38872v;
                    this.f38854q.clear();
                    for (g gVar4 : list) {
                        MediaRouteProvider.d dVarMo16794m = gVar4.m16835a().mo16794m(gVar4.f38874b, this.f38852o.f38874b);
                        dVarMo16794m.mo16800b();
                        this.f38854q.put(gVar4.f38874b, dVarMo16794m);
                    }
                }
                m16826j();
            }
        }

        /* JADX INFO: renamed from: i */
        public void m16825i() {
            MediaRouteSelector.a aVar = new MediaRouteSelector.a();
            int size = this.f38839b.size();
            boolean z = false;
            boolean z2 = false;
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                MediaRouter mediaRouter = this.f38839b.get(size).get();
                if (mediaRouter == null) {
                    this.f38839b.remove(size);
                } else {
                    int size2 = mediaRouter.f38833d.size();
                    for (int i = 0; i < size2; i++) {
                        b bVar = mediaRouter.f38833d.get(i);
                        aVar.m16811a(bVar.f38836c);
                        int i2 = bVar.f38837d;
                        if ((i2 & 1) != 0) {
                            z = true;
                            z2 = true;
                        }
                        if ((i2 & 4) != 0 && !this.f38848k) {
                            z = true;
                        }
                        if ((i2 & 8) != 0) {
                            z = true;
                        }
                    }
                }
            }
            MediaRouteSelector mediaRouteSelectorM16812b = z ? aVar.m16812b() : MediaRouteSelector.f38826a;
            MediaRouteDiscoveryRequest mediaRouteDiscoveryRequest = this.f38855r;
            if (mediaRouteDiscoveryRequest != null) {
                mediaRouteDiscoveryRequest.m16791a();
                if (mediaRouteDiscoveryRequest.f38811b.equals(mediaRouteSelectorM16812b) && this.f38855r.m16792b() == z2) {
                    return;
                }
            }
            mediaRouteSelectorM16812b.m16810a();
            if (!mediaRouteSelectorM16812b.f38828c.isEmpty() || z2) {
                this.f38855r = new MediaRouteDiscoveryRequest(mediaRouteSelectorM16812b, z2);
            } else if (this.f38855r == null) {
                return;
            } else {
                this.f38855r = null;
            }
            if (MediaRouter.f38830a) {
                StringBuilder sbM1556G = outline.m1556G("Updated discovery request: ");
                sbM1556G.append(this.f38855r);
                Log.d("MediaRouter", sbM1556G.toString());
            }
            if (z && !z2 && this.f38848k) {
                Log.i("MediaRouter", "Forcing passive route discovery on a low-RAM device, system performance may be affected.  Please consider using CALLBACK_FLAG_REQUEST_DISCOVERY instead of CALLBACK_FLAG_FORCE_DISCOVERY.");
            }
            int size3 = this.f38842e.size();
            for (int i3 = 0; i3 < size3; i3++) {
                this.f38842e.get(i3).f38868a.m16797p(this.f38855r);
            }
        }

        /* JADX INFO: renamed from: j */
        public final void m16826j() {
            g gVar = this.f38852o;
            if (gVar == null) {
                c cVar = this.f38856s;
                if (cVar != null) {
                    cVar.m16832a();
                    return;
                }
                return;
            }
            RemoteControlClientCompat.b bVar = this.f38844g;
            bVar.f38946a = gVar.f38888p;
            bVar.f38947b = gVar.f38889q;
            bVar.f38948c = gVar.f38887o;
            bVar.f38949d = gVar.f38885m;
            bVar.f38950e = gVar.f38884l;
            int size = this.f38843f.size();
            for (int i = 0; i < size; i++) {
                e eVar = this.f38843f.get(i);
                eVar.f38865a.mo16869a(d.this.f38844g);
            }
            if (this.f38856s != null) {
                if (this.f38852o == m16820d() || this.f38852o == this.f38851n) {
                    this.f38856s.m16832a();
                    return;
                }
                RemoteControlClientCompat.b bVar2 = this.f38844g;
                int i2 = bVar2.f38948c == 1 ? 2 : 0;
                c cVar2 = this.f38856s;
                int i3 = bVar2.f38947b;
                int i4 = bVar2.f38946a;
                if (cVar2.f38861a != null) {
                    VolumeProviderCompat volumeProviderCompat = cVar2.f38862b;
                    if (volumeProviderCompat == null || i2 != 0 || i3 != 0) {
                        MediaRouter2 mediaRouter2 = new MediaRouter2(cVar2, i2, i3, i4);
                        cVar2.f38862b = mediaRouter2;
                        MediaSessionCompat mediaSessionCompat = cVar2.f38861a;
                        Objects.requireNonNull(mediaSessionCompat);
                        mediaSessionCompat.f77c.mo70l(mediaRouter2);
                        return;
                    }
                    volumeProviderCompat.f38798d = i4;
                    ((VolumeProvider) volumeProviderCompat.m16766a()).setCurrentVolume(i4);
                    VolumeProviderCompat.c cVar3 = volumeProviderCompat.f38799e;
                    if (cVar3 != null) {
                        cVar3.m16769a(volumeProviderCompat);
                    }
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: k */
        public final void m16827k(e eVar, MediaRouteProviderDescriptor mediaRouteProviderDescriptor) {
            boolean z;
            boolean z2;
            int i;
            int i2;
            String str;
            if (eVar.f38871d != mediaRouteProviderDescriptor) {
                eVar.f38871d = mediaRouteProviderDescriptor;
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (mediaRouteProviderDescriptor == null) {
                    z2 = false;
                    i = 0;
                } else if (mediaRouteProviderDescriptor.m16806b()) {
                    mediaRouteProviderDescriptor.m16805a();
                    List<MediaRouteDescriptor> list = mediaRouteProviderDescriptor.f38823b;
                    int size = list.size();
                    ArrayList<Pair> arrayList = new ArrayList();
                    ArrayList<Pair> arrayList2 = new ArrayList();
                    int i3 = 0;
                    boolean z3 = false;
                    i = 0;
                    while (i3 < size) {
                        MediaRouteDescriptor mediaRouteDescriptor = list.get(i3);
                        String strM16777h = mediaRouteDescriptor.m16777h();
                        int iM16833a = eVar.m16833a(strM16777h);
                        boolean z4 = mediaRouteDescriptor.m16775f() != null;
                        if (iM16833a < 0) {
                            String strFlattenToShortString = eVar.f38870c.f38821a.flattenToShortString();
                            String strM1600v = outline.m1600v(strFlattenToShortString, ":", strM16777h);
                            if (m16819c(strM1600v) < 0) {
                                this.f38841d.put(new Pair<>(strFlattenToShortString, strM16777h), strM1600v);
                            } else {
                                Log.w("MediaRouter", "Either " + strM16777h + " isn't unique in " + strFlattenToShortString + " or we're trying to assign a unique ID for an already added route");
                                int i4 = 2;
                                int i5 = 2;
                                while (true) {
                                    Locale locale = Locale.US;
                                    Object[] objArr = new Object[i4];
                                    objArr[0] = strM1600v;
                                    objArr[1] = Integer.valueOf(i5);
                                    String str2 = strM1600v;
                                    str = String.format(locale, "%s_%d", objArr);
                                    if (m16819c(str) < 0) {
                                        break;
                                    }
                                    i5++;
                                    i4 = 2;
                                    strM1600v = str2;
                                }
                                this.f38841d.put(new Pair<>(strFlattenToShortString, strM16777h), str);
                                strM1600v = str;
                            }
                            g fVar = z4 ? new f(eVar, strM16777h, strM1600v) : new g(eVar, strM16777h, strM1600v);
                            i2 = i + 1;
                            eVar.f38869b.add(i, fVar);
                            this.f38840c.add(fVar);
                            if (z4) {
                                arrayList.add(new Pair(fVar, mediaRouteDescriptor));
                            } else {
                                fVar.mo16834d(mediaRouteDescriptor);
                                if (MediaRouter.f38830a) {
                                    Log.d("MediaRouter", "Route added: " + fVar);
                                }
                                this.f38846i.m16831b(257, fVar);
                            }
                        } else {
                            list = list;
                            size = size;
                            z3 = z3;
                            if (iM16833a < i) {
                                Log.w("MediaRouter", "Ignoring route descriptor with duplicate id: " + mediaRouteDescriptor);
                                z3 = z3;
                            } else {
                                g fVar2 = eVar.f38869b.get(iM16833a);
                                if ((fVar2 instanceof f) != z4) {
                                    fVar2 = z4 ? new f(eVar, strM16777h, fVar2.f38875c) : new g(eVar, strM16777h, fVar2.f38875c);
                                    eVar.f38869b.set(iM16833a, fVar2);
                                }
                                i2 = i + 1;
                                Collections.swap(eVar.f38869b, iM16833a, i);
                                if (fVar2 instanceof f) {
                                    arrayList2.add(new Pair(fVar2, mediaRouteDescriptor));
                                } else if (m16828l(fVar2, mediaRouteDescriptor) != 0 && fVar2 == this.f38852o) {
                                    i = i2;
                                    z3 = true;
                                }
                            }
                            i3++;
                            size = size;
                            list = list;
                        }
                        i = i2;
                        z3 = z3;
                        i3++;
                        size = size;
                        list = list;
                    }
                    boolean z5 = z3;
                    for (Pair pair : arrayList) {
                        g gVar = (g) pair.f37971a;
                        gVar.mo16834d((MediaRouteDescriptor) pair.f37972b);
                        if (MediaRouter.f38830a) {
                            Log.d("MediaRouter", "Route added: " + gVar);
                        }
                        this.f38846i.m16831b(257, gVar);
                    }
                    z2 = z5;
                    for (Pair pair2 : arrayList2) {
                        g gVar2 = (g) pair2.f37971a;
                        if (m16828l(gVar2, (MediaRouteDescriptor) pair2.f37972b) != 0 && gVar2 == this.f38852o) {
                            z2 = true;
                        }
                    }
                } else {
                    Log.w("MediaRouter", "Ignoring invalid provider descriptor: " + mediaRouteProviderDescriptor);
                    z2 = false;
                    i = 0;
                }
                for (int size2 = eVar.f38869b.size() - 1; size2 >= i; size2--) {
                    g gVar3 = eVar.f38869b.get(size2);
                    gVar3.mo16834d(null);
                    this.f38840c.remove(gVar3);
                }
                m16829m(z2);
                for (int size3 = eVar.f38869b.size() - 1; size3 >= i; size3--) {
                    g gVarRemove = eVar.f38869b.remove(size3);
                    if (MediaRouter.f38830a) {
                        Log.d("MediaRouter", "Route removed: " + gVarRemove);
                    }
                    this.f38846i.m16831b(258, gVarRemove);
                }
                if (MediaRouter.f38830a) {
                    Log.d("MediaRouter", "Provider changed: " + eVar);
                }
                this.f38846i.m16831b(515, eVar);
            }
        }

        /* JADX INFO: renamed from: l */
        public final int m16828l(g gVar, MediaRouteDescriptor mediaRouteDescriptor) {
            int iMo16834d = gVar.mo16834d(mediaRouteDescriptor);
            if (iMo16834d != 0) {
                if ((iMo16834d & 1) != 0) {
                    if (MediaRouter.f38830a) {
                        Log.d("MediaRouter", "Route changed: " + gVar);
                    }
                    this.f38846i.m16831b(259, gVar);
                }
                if ((iMo16834d & 2) != 0) {
                    if (MediaRouter.f38830a) {
                        Log.d("MediaRouter", "Route volume changed: " + gVar);
                    }
                    this.f38846i.m16831b(260, gVar);
                }
                if ((iMo16834d & 4) != 0) {
                    if (MediaRouter.f38830a) {
                        Log.d("MediaRouter", "Route presentation display changed: " + gVar);
                    }
                    this.f38846i.m16831b(261, gVar);
                }
            }
            return iMo16834d;
        }

        /* JADX INFO: renamed from: m */
        public void m16829m(boolean z) {
            g gVar = this.f38850m;
            if (gVar != null && !gVar.m16836b()) {
                StringBuilder sbM1556G = outline.m1556G("Clearing the default route because it is no longer selectable: ");
                sbM1556G.append(this.f38850m);
                Log.i("MediaRouter", sbM1556G.toString());
                this.f38850m = null;
            }
            if (this.f38850m == null && !this.f38840c.isEmpty()) {
                for (g gVar2 : this.f38840c) {
                    if ((gVar2.m16835a() == this.f38847j && gVar2.f38874b.equals("DEFAULT_ROUTE")) && gVar2.m16836b()) {
                        this.f38850m = gVar2;
                        StringBuilder sbM1556G2 = outline.m1556G("Found default route: ");
                        sbM1556G2.append(this.f38850m);
                        Log.i("MediaRouter", sbM1556G2.toString());
                        break;
                    }
                }
            }
            g gVar3 = this.f38851n;
            if (gVar3 != null && !gVar3.m16836b()) {
                StringBuilder sbM1556G3 = outline.m1556G("Clearing the bluetooth route because it is no longer selectable: ");
                sbM1556G3.append(this.f38851n);
                Log.i("MediaRouter", sbM1556G3.toString());
                this.f38851n = null;
            }
            if (this.f38851n == null && !this.f38840c.isEmpty()) {
                for (g gVar4 : this.f38840c) {
                    if (m16822f(gVar4) && gVar4.m16836b()) {
                        this.f38851n = gVar4;
                        StringBuilder sbM1556G4 = outline.m1556G("Found bluetooth route: ");
                        sbM1556G4.append(this.f38851n);
                        Log.i("MediaRouter", sbM1556G4.toString());
                        break;
                    }
                }
            }
            g gVar5 = this.f38852o;
            if (gVar5 == null || !gVar5.m16836b()) {
                StringBuilder sbM1556G5 = outline.m1556G("Unselecting the current route because it is no longer selectable: ");
                sbM1556G5.append(this.f38852o);
                Log.i("MediaRouter", sbM1556G5.toString());
                for (g gVar6 : this.f38840c) {
                    if (gVar6 != this.f38850m && m16822f(gVar6) && gVar6.m16836b()) {
                        m16824h(gVar6, 0);
                        return;
                    }
                }
                gVar6 = this.f38850m;
                m16824h(gVar6, 0);
                return;
            }
            if (z) {
                g gVar7 = this.f38852o;
                if (gVar7 instanceof f) {
                    List<g> list = ((f) gVar7).f38872v;
                    HashSet hashSet = new HashSet();
                    Iterator<g> it = list.iterator();
                    while (it.hasNext()) {
                        hashSet.add(it.next().f38874b);
                    }
                    Iterator<Map.Entry<String, MediaRouteProvider.d>> it2 = this.f38854q.entrySet().iterator();
                    while (it2.hasNext()) {
                        Map.Entry<String, MediaRouteProvider.d> next = it2.next();
                        if (!hashSet.contains(next.getKey())) {
                            MediaRouteProvider.d value = next.getValue();
                            value.mo16802d();
                            value.mo16799a();
                            it2.remove();
                        }
                    }
                    for (g gVar8 : list) {
                        if (!this.f38854q.containsKey(gVar8.f38874b)) {
                            MediaRouteProvider.d dVarMo16794m = gVar8.m16835a().mo16794m(gVar8.f38874b, this.f38852o.f38874b);
                            dVarMo16794m.mo16800b();
                            this.f38854q.put(gVar8.f38874b, dVarMo16794m);
                        }
                    }
                }
                m16826j();
            }
        }
    }

    /* JADX INFO: renamed from: z0.w.a.f$e */
    /* JADX INFO: compiled from: MediaRouter.java */
    public static final class e {

        /* JADX INFO: renamed from: a */
        public final MediaRouteProvider f38868a;

        /* JADX INFO: renamed from: b */
        public final List<g> f38869b = new ArrayList();

        /* JADX INFO: renamed from: c */
        public final MediaRouteProvider.c f38870c;

        /* JADX INFO: renamed from: d */
        public MediaRouteProviderDescriptor f38871d;

        public e(MediaRouteProvider mediaRouteProvider) {
            this.f38868a = mediaRouteProvider;
            this.f38870c = mediaRouteProvider.f38813b;
        }

        /* JADX INFO: renamed from: a */
        public int m16833a(String str) {
            int size = this.f38869b.size();
            for (int i = 0; i < size; i++) {
                if (this.f38869b.get(i).f38874b.equals(str)) {
                    return i;
                }
            }
            return -1;
        }

        public String toString() {
            StringBuilder sbM1556G = outline.m1556G("MediaRouter.RouteProviderInfo{ packageName=");
            sbM1556G.append(this.f38870c.f38821a.getPackageName());
            sbM1556G.append(" }");
            return sbM1556G.toString();
        }
    }

    /* JADX INFO: renamed from: z0.w.a.f$f */
    /* JADX INFO: compiled from: MediaRouter.java */
    public static class f extends g {

        /* JADX INFO: renamed from: v */
        public List<g> f38872v;

        public f(e eVar, String str, String str2) {
            super(eVar, str, str2);
            this.f38872v = new ArrayList();
        }

        @Override // p636z0.p767w.p768a.MediaRouter.g
        /* JADX INFO: renamed from: d */
        public int mo16834d(MediaRouteDescriptor mediaRouteDescriptor) {
            g next;
            int i = 0;
            if (this.f38893u != mediaRouteDescriptor) {
                this.f38893u = mediaRouteDescriptor;
                if (mediaRouteDescriptor != null) {
                    List<String> listM16775f = mediaRouteDescriptor.m16775f();
                    ArrayList arrayList = new ArrayList();
                    if (listM16775f == null) {
                        Log.w("MediaRouter", "groupMemberIds shouldn't be null.");
                        i = 1;
                    } else {
                        i = listM16775f.size() != this.f38872v.size() ? 1 : 0;
                        for (String str : listM16775f) {
                            d dVar = MediaRouter.f38831b;
                            e eVar = this.f38873a;
                            Objects.requireNonNull(dVar);
                            String str2 = dVar.f38841d.get(new Pair(eVar.f38870c.f38821a.flattenToShortString(), str));
                            Iterator<g> it = MediaRouter.f38831b.f38840c.iterator();
                            do {
                                if (!it.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it.next();
                            } while (!next.f38875c.equals(str2));
                            if (next != null) {
                                arrayList.add(next);
                                if (i == 0 && !this.f38872v.contains(next)) {
                                    i = 1;
                                }
                            }
                        }
                    }
                    if (i != 0) {
                        this.f38872v = arrayList;
                    }
                }
            }
            return m16842i(mediaRouteDescriptor) | i;
        }

        @Override // p636z0.p767w.p768a.MediaRouter.g
        public String toString() {
            StringBuilder sb = new StringBuilder(super.toString());
            sb.append('[');
            int size = this.f38872v.size();
            for (int i = 0; i < size; i++) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(this.f38872v.get(i));
            }
            sb.append(']');
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: z0.w.a.f$g */
    /* JADX INFO: compiled from: MediaRouter.java */
    public static class g {

        /* JADX INFO: renamed from: a */
        public final e f38873a;

        /* JADX INFO: renamed from: b */
        public final String f38874b;

        /* JADX INFO: renamed from: c */
        public final String f38875c;

        /* JADX INFO: renamed from: d */
        public String f38876d;

        /* JADX INFO: renamed from: e */
        public String f38877e;

        /* JADX INFO: renamed from: f */
        public Uri f38878f;

        /* JADX INFO: renamed from: g */
        public boolean f38879g;

        /* JADX INFO: renamed from: h */
        public boolean f38880h;

        /* JADX INFO: renamed from: i */
        public int f38881i;

        /* JADX INFO: renamed from: j */
        public boolean f38882j;

        /* JADX INFO: renamed from: l */
        public int f38884l;

        /* JADX INFO: renamed from: m */
        public int f38885m;

        /* JADX INFO: renamed from: n */
        public int f38886n;

        /* JADX INFO: renamed from: o */
        public int f38887o;

        /* JADX INFO: renamed from: p */
        public int f38888p;

        /* JADX INFO: renamed from: q */
        public int f38889q;

        /* JADX INFO: renamed from: s */
        public Bundle f38891s;

        /* JADX INFO: renamed from: t */
        public IntentSender f38892t;

        /* JADX INFO: renamed from: u */
        public MediaRouteDescriptor f38893u;

        /* JADX INFO: renamed from: k */
        public final ArrayList<IntentFilter> f38883k = new ArrayList<>();

        /* JADX INFO: renamed from: r */
        public int f38890r = -1;

        public g(e eVar, String str, String str2) {
            this.f38873a = eVar;
            this.f38874b = str;
            this.f38875c = str2;
        }

        /* JADX INFO: renamed from: a */
        public MediaRouteProvider m16835a() {
            e eVar = this.f38873a;
            Objects.requireNonNull(eVar);
            MediaRouter.m16813a();
            return eVar.f38868a;
        }

        /* JADX INFO: renamed from: b */
        public boolean m16836b() {
            return this.f38893u != null && this.f38879g;
        }

        /* JADX INFO: renamed from: c */
        public boolean m16837c(MediaRouteSelector mediaRouteSelector) {
            if (mediaRouteSelector == null) {
                throw new IllegalArgumentException("selector must not be null");
            }
            MediaRouter.m16813a();
            ArrayList<IntentFilter> arrayList = this.f38883k;
            if (arrayList == null) {
                return false;
            }
            mediaRouteSelector.m16810a();
            int size = mediaRouteSelector.f38828c.size();
            if (size == 0) {
                return false;
            }
            int size2 = arrayList.size();
            for (int i = 0; i < size2; i++) {
                IntentFilter intentFilter = arrayList.get(i);
                if (intentFilter != null) {
                    for (int i2 = 0; i2 < size; i2++) {
                        if (intentFilter.hasCategory(mediaRouteSelector.f38828c.get(i2))) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: d */
        public int mo16834d(MediaRouteDescriptor mediaRouteDescriptor) {
            if (this.f38893u != mediaRouteDescriptor) {
                return m16842i(mediaRouteDescriptor);
            }
            return 0;
        }

        /* JADX INFO: renamed from: e */
        public void m16838e(int i) {
            MediaRouteProvider.d dVar;
            MediaRouteProvider.d dVar2;
            MediaRouter.m16813a();
            d dVar3 = MediaRouter.f38831b;
            int iMin = Math.min(this.f38889q, Math.max(0, i));
            if (this == dVar3.f38852o && (dVar2 = dVar3.f38853p) != null) {
                dVar2.mo16801c(iMin);
            } else {
                if (dVar3.f38854q.isEmpty() || (dVar = dVar3.f38854q.get(this.f38874b)) == null) {
                    return;
                }
                dVar.mo16801c(iMin);
            }
        }

        /* JADX INFO: renamed from: f */
        public void m16839f(int i) {
            MediaRouteProvider.d dVar;
            MediaRouter.m16813a();
            if (i != 0) {
                d dVar2 = MediaRouter.f38831b;
                if (this != dVar2.f38852o || (dVar = dVar2.f38853p) == null) {
                    return;
                }
                dVar.mo16804f(i);
            }
        }

        /* JADX INFO: renamed from: g */
        public void m16840g() {
            MediaRouter.m16813a();
            MediaRouter.f38831b.m16823g(this);
        }

        /* JADX INFO: renamed from: h */
        public boolean m16841h(String str) {
            MediaRouter.m16813a();
            int size = this.f38883k.size();
            for (int i = 0; i < size; i++) {
                if (this.f38883k.get(i).hasCategory(str)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: i */
        public int m16842i(MediaRouteDescriptor mediaRouteDescriptor) {
            int i;
            this.f38893u = mediaRouteDescriptor;
            if (mediaRouteDescriptor == null) {
                return 0;
            }
            if (Objects.equals(this.f38876d, mediaRouteDescriptor.m16778i())) {
                i = 0;
            } else {
                this.f38876d = mediaRouteDescriptor.m16778i();
                i = 1;
            }
            if (!Objects.equals(this.f38877e, mediaRouteDescriptor.m16772c())) {
                this.f38877e = mediaRouteDescriptor.m16772c();
                i |= 1;
            }
            if (!Objects.equals(this.f38878f, mediaRouteDescriptor.m16776g())) {
                this.f38878f = mediaRouteDescriptor.m16776g();
                i |= 1;
            }
            if (this.f38879g != mediaRouteDescriptor.m16786q()) {
                this.f38879g = mediaRouteDescriptor.m16786q();
                i |= 1;
            }
            if (this.f38880h != mediaRouteDescriptor.m16785p()) {
                this.f38880h = mediaRouteDescriptor.m16785p();
                i |= 1;
            }
            if (this.f38881i != mediaRouteDescriptor.m16771b()) {
                this.f38881i = mediaRouteDescriptor.m16771b();
                i |= 1;
            }
            ArrayList<IntentFilter> arrayList = this.f38883k;
            mediaRouteDescriptor.m16770a();
            if (!arrayList.equals(mediaRouteDescriptor.f38807b)) {
                this.f38883k.clear();
                ArrayList<IntentFilter> arrayList2 = this.f38883k;
                mediaRouteDescriptor.m16770a();
                arrayList2.addAll(mediaRouteDescriptor.f38807b);
                i |= 1;
            }
            if (this.f38884l != mediaRouteDescriptor.m16780k()) {
                this.f38884l = mediaRouteDescriptor.m16780k();
                i |= 1;
            }
            if (this.f38885m != mediaRouteDescriptor.m16779j()) {
                this.f38885m = mediaRouteDescriptor.m16779j();
                i |= 1;
            }
            if (this.f38886n != mediaRouteDescriptor.m16773d()) {
                this.f38886n = mediaRouteDescriptor.m16773d();
                i |= 1;
            }
            if (this.f38887o != mediaRouteDescriptor.m16783n()) {
                this.f38887o = mediaRouteDescriptor.m16783n();
                i |= 3;
            }
            if (this.f38888p != mediaRouteDescriptor.m16782m()) {
                this.f38888p = mediaRouteDescriptor.m16782m();
                i |= 3;
            }
            if (this.f38889q != mediaRouteDescriptor.m16784o()) {
                this.f38889q = mediaRouteDescriptor.m16784o();
                i |= 3;
            }
            if (this.f38890r != mediaRouteDescriptor.m16781l()) {
                this.f38890r = mediaRouteDescriptor.m16781l();
                i |= 5;
            }
            if (!Objects.equals(this.f38891s, mediaRouteDescriptor.m16774e())) {
                this.f38891s = mediaRouteDescriptor.m16774e();
                i |= 1;
            }
            if (!Objects.equals(this.f38892t, (IntentSender) mediaRouteDescriptor.f38806a.getParcelable("settingsIntent"))) {
                this.f38892t = (IntentSender) mediaRouteDescriptor.f38806a.getParcelable("settingsIntent");
                i |= 1;
            }
            if (this.f38882j == mediaRouteDescriptor.f38806a.getBoolean("canDisconnect", false)) {
                return i;
            }
            this.f38882j = mediaRouteDescriptor.f38806a.getBoolean("canDisconnect", false);
            return i | 5;
        }

        public String toString() {
            StringBuilder sbM1556G = outline.m1556G("MediaRouter.RouteInfo{ uniqueId=");
            sbM1556G.append(this.f38875c);
            sbM1556G.append(", name=");
            sbM1556G.append(this.f38876d);
            sbM1556G.append(", description=");
            sbM1556G.append(this.f38877e);
            sbM1556G.append(", iconUri=");
            sbM1556G.append(this.f38878f);
            sbM1556G.append(", enabled=");
            sbM1556G.append(this.f38879g);
            sbM1556G.append(", connecting=");
            sbM1556G.append(this.f38880h);
            sbM1556G.append(", connectionState=");
            sbM1556G.append(this.f38881i);
            sbM1556G.append(", canDisconnect=");
            sbM1556G.append(this.f38882j);
            sbM1556G.append(", playbackType=");
            sbM1556G.append(this.f38884l);
            sbM1556G.append(", playbackStream=");
            sbM1556G.append(this.f38885m);
            sbM1556G.append(", deviceType=");
            sbM1556G.append(this.f38886n);
            sbM1556G.append(", volumeHandling=");
            sbM1556G.append(this.f38887o);
            sbM1556G.append(", volume=");
            sbM1556G.append(this.f38888p);
            sbM1556G.append(", volumeMax=");
            sbM1556G.append(this.f38889q);
            sbM1556G.append(", presentationDisplayId=");
            sbM1556G.append(this.f38890r);
            sbM1556G.append(", extras=");
            sbM1556G.append(this.f38891s);
            sbM1556G.append(", settingsIntent=");
            sbM1556G.append(this.f38892t);
            sbM1556G.append(", providerPackageName=");
            sbM1556G.append(this.f38873a.f38870c.f38821a.getPackageName());
            sbM1556G.append(" }");
            return sbM1556G.toString();
        }
    }

    public MediaRouter(Context context) {
        this.f38832c = context;
    }

    /* JADX INFO: renamed from: a */
    public static void m16813a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("The media router service must only be accessed on the application's main thread.");
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m16814b(a aVar) {
        int size = this.f38833d.size();
        for (int i = 0; i < size; i++) {
            if (this.f38833d.get(i).f38835b == aVar) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: c */
    public void m16815c(a aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        m16813a();
        if (f38830a) {
            Log.d("MediaRouter", "removeCallback: callback=" + aVar);
        }
        int iM16814b = m16814b(aVar);
        if (iM16814b >= 0) {
            this.f38833d.remove(iM16814b);
            f38831b.m16825i();
        }
    }

    /* JADX INFO: renamed from: d */
    public void m16816d(g gVar) {
        if (gVar == null) {
            throw new IllegalArgumentException("route must not be null");
        }
        m16813a();
        if (f38830a) {
            Log.d("MediaRouter", "selectRoute: " + gVar);
        }
        f38831b.m16823g(gVar);
    }
}
