package p636z0.p767w.p768a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: z0.w.a.s, reason: use source file name */
/* JADX INFO: compiled from: RegisteredMediaRouteProvider.java */
/* JADX INFO: loaded from: classes.dex */
public final class RegisteredMediaRouteProvider2 extends MediaRouteProvider implements ServiceConnection {

    /* JADX INFO: renamed from: i */
    public static final boolean f38902i = Log.isLoggable("MediaRouteProviderProxy", 3);

    /* JADX INFO: renamed from: j */
    public final ComponentName f38903j;

    /* JADX INFO: renamed from: k */
    public final c f38904k;

    /* JADX INFO: renamed from: l */
    public final ArrayList<b> f38905l;

    /* JADX INFO: renamed from: m */
    public boolean f38906m;

    /* JADX INFO: renamed from: n */
    public boolean f38907n;

    /* JADX INFO: renamed from: o */
    public a f38908o;

    /* JADX INFO: renamed from: p */
    public boolean f38909p;

    /* JADX INFO: renamed from: z0.w.a.s$a */
    /* JADX INFO: compiled from: RegisteredMediaRouteProvider.java */
    public final class a implements IBinder.DeathRecipient {

        /* JADX INFO: renamed from: a */
        public final Messenger f38910a;

        /* JADX INFO: renamed from: b */
        public final d f38911b;

        /* JADX INFO: renamed from: c */
        public final Messenger f38912c;

        /* JADX INFO: renamed from: f */
        public int f38915f;

        /* JADX INFO: renamed from: g */
        public int f38916g;

        /* JADX INFO: renamed from: d */
        public int f38913d = 1;

        /* JADX INFO: renamed from: e */
        public int f38914e = 1;

        /* JADX INFO: renamed from: h */
        public final SparseArray<MediaRouter.c> f38917h = new SparseArray<>();

        /* JADX INFO: renamed from: z0.w.a.s$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: RegisteredMediaRouteProvider.java */
        public class RunnableC8573a implements Runnable {
            public RunnableC8573a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a aVar = a.this;
                RegisteredMediaRouteProvider2 registeredMediaRouteProvider2 = RegisteredMediaRouteProvider2.this;
                if (registeredMediaRouteProvider2.f38908o == aVar) {
                    if (RegisteredMediaRouteProvider2.f38902i) {
                        Log.d("MediaRouteProviderProxy", registeredMediaRouteProvider2 + ": Service connection died");
                    }
                    registeredMediaRouteProvider2.m16856s();
                }
            }
        }

        public a(Messenger messenger) {
            this.f38910a = messenger;
            d dVar = new d(this);
            this.f38911b = dVar;
            this.f38912c = new Messenger(dVar);
        }

        /* JADX INFO: renamed from: a */
        public final boolean m16862a(int i, int i2, int i3, Object obj, Bundle bundle) {
            Message messageObtain = Message.obtain();
            messageObtain.what = i;
            messageObtain.arg1 = i2;
            messageObtain.arg2 = i3;
            messageObtain.obj = obj;
            messageObtain.setData(bundle);
            messageObtain.replyTo = this.f38912c;
            try {
                this.f38910a.send(messageObtain);
                return true;
            } catch (DeadObjectException unused) {
                return false;
            } catch (RemoteException e) {
                if (i == 2) {
                    return false;
                }
                Log.e("MediaRouteProviderProxy", "Could not send message to service.", e);
                return false;
            }
        }

        /* JADX INFO: renamed from: b */
        public void m16863b(MediaRouteDiscoveryRequest mediaRouteDiscoveryRequest) {
            int i = this.f38913d;
            this.f38913d = i + 1;
            m16862a(10, i, 0, mediaRouteDiscoveryRequest != null ? mediaRouteDiscoveryRequest.f38810a : null, null);
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            RegisteredMediaRouteProvider2.this.f38904k.post(new RunnableC8573a());
        }

        /* JADX INFO: renamed from: c */
        public void m16864c(int i, int i2) {
            Bundle bundle = new Bundle();
            bundle.putInt("volume", i2);
            int i3 = this.f38913d;
            this.f38913d = i3 + 1;
            m16862a(7, i3, i, null, bundle);
        }

        /* JADX INFO: renamed from: d */
        public void m16865d(int i, int i2) {
            Bundle bundle = new Bundle();
            bundle.putInt("volume", i2);
            int i3 = this.f38913d;
            this.f38913d = i3 + 1;
            m16862a(8, i3, i, null, bundle);
        }
    }

    /* JADX INFO: renamed from: z0.w.a.s$b */
    /* JADX INFO: compiled from: RegisteredMediaRouteProvider.java */
    public final class b extends MediaRouteProvider.d {

        /* JADX INFO: renamed from: a */
        public final String f38920a;

        /* JADX INFO: renamed from: b */
        public final String f38921b;

        /* JADX INFO: renamed from: c */
        public boolean f38922c;

        /* JADX INFO: renamed from: d */
        public int f38923d = -1;

        /* JADX INFO: renamed from: e */
        public int f38924e;

        /* JADX INFO: renamed from: f */
        public a f38925f;

        /* JADX INFO: renamed from: g */
        public int f38926g;

        public b(String str, String str2) {
            this.f38920a = str;
            this.f38921b = str2;
        }

        @Override // p636z0.p767w.p768a.MediaRouteProvider.d
        /* JADX INFO: renamed from: a */
        public void mo16799a() {
            RegisteredMediaRouteProvider2 registeredMediaRouteProvider2 = RegisteredMediaRouteProvider2.this;
            registeredMediaRouteProvider2.f38905l.remove(this);
            m16867h();
            registeredMediaRouteProvider2.m16861x();
        }

        @Override // p636z0.p767w.p768a.MediaRouteProvider.d
        /* JADX INFO: renamed from: b */
        public void mo16800b() {
            this.f38922c = true;
            a aVar = this.f38925f;
            if (aVar != null) {
                int i = this.f38926g;
                int i2 = aVar.f38913d;
                aVar.f38913d = i2 + 1;
                aVar.m16862a(5, i2, i, null, null);
            }
        }

        @Override // p636z0.p767w.p768a.MediaRouteProvider.d
        /* JADX INFO: renamed from: c */
        public void mo16801c(int i) {
            a aVar = this.f38925f;
            if (aVar != null) {
                aVar.m16864c(this.f38926g, i);
            } else {
                this.f38923d = i;
                this.f38924e = 0;
            }
        }

        @Override // p636z0.p767w.p768a.MediaRouteProvider.d
        /* JADX INFO: renamed from: d */
        public void mo16802d() {
            mo16803e(0);
        }

        @Override // p636z0.p767w.p768a.MediaRouteProvider.d
        /* JADX INFO: renamed from: e */
        public void mo16803e(int i) {
            this.f38922c = false;
            a aVar = this.f38925f;
            if (aVar != null) {
                int i2 = this.f38926g;
                Objects.requireNonNull(aVar);
                Bundle bundle = new Bundle();
                bundle.putInt("unselectReason", i);
                int i3 = aVar.f38913d;
                aVar.f38913d = i3 + 1;
                aVar.m16862a(6, i3, i2, null, bundle);
            }
        }

        @Override // p636z0.p767w.p768a.MediaRouteProvider.d
        /* JADX INFO: renamed from: f */
        public void mo16804f(int i) {
            a aVar = this.f38925f;
            if (aVar != null) {
                aVar.m16865d(this.f38926g, i);
            } else {
                this.f38924e += i;
            }
        }

        /* JADX INFO: renamed from: g */
        public void m16866g(a aVar) {
            this.f38925f = aVar;
            String str = this.f38920a;
            String str2 = this.f38921b;
            int i = aVar.f38914e;
            aVar.f38914e = i + 1;
            Bundle bundle = new Bundle();
            bundle.putString("routeId", str);
            bundle.putString("routeGroupId", str2);
            int i2 = aVar.f38913d;
            aVar.f38913d = i2 + 1;
            aVar.m16862a(3, i2, i, null, bundle);
            this.f38926g = i;
            if (this.f38922c) {
                int i3 = aVar.f38913d;
                aVar.f38913d = i3 + 1;
                aVar.m16862a(5, i3, i, null, null);
                int i4 = this.f38923d;
                if (i4 >= 0) {
                    aVar.m16864c(this.f38926g, i4);
                    this.f38923d = -1;
                }
                int i5 = this.f38924e;
                if (i5 != 0) {
                    aVar.m16865d(this.f38926g, i5);
                    this.f38924e = 0;
                }
            }
        }

        /* JADX INFO: renamed from: h */
        public void m16867h() {
            a aVar = this.f38925f;
            if (aVar != null) {
                int i = this.f38926g;
                int i2 = aVar.f38913d;
                aVar.f38913d = i2 + 1;
                aVar.m16862a(4, i2, i, null, null);
                this.f38925f = null;
                this.f38926g = 0;
            }
        }
    }

    /* JADX INFO: renamed from: z0.w.a.s$c */
    /* JADX INFO: compiled from: RegisteredMediaRouteProvider.java */
    public static final class c extends Handler {
    }

    /* JADX INFO: renamed from: z0.w.a.s$d */
    /* JADX INFO: compiled from: RegisteredMediaRouteProvider.java */
    public static final class d extends Handler {

        /* JADX INFO: renamed from: a */
        public final WeakReference<a> f38928a;

        public d(a aVar) {
            this.f38928a = new WeakReference<>(aVar);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            a aVar = this.f38928a.get();
            if (aVar != null) {
                int i = message.what;
                int i2 = message.arg1;
                int i3 = message.arg2;
                Object obj = message.obj;
                Bundle bundlePeekData = message.peekData();
                int i4 = 0;
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    if (i == 5 && (obj == null || (obj instanceof Bundle))) {
                                        Bundle bundle = (Bundle) obj;
                                        if (aVar.f38915f != 0) {
                                            RegisteredMediaRouteProvider2.this.m16857t(aVar, bundle != null ? new MediaRouteProviderDescriptor(bundle, null) : null);
                                        }
                                    }
                                } else if (obj == null || (obj instanceof Bundle)) {
                                    if (bundlePeekData != null) {
                                        bundlePeekData.getString("error");
                                    }
                                    if (aVar.f38917h.get(i2) != null) {
                                        aVar.f38917h.remove(i2);
                                    }
                                }
                            } else if (obj == null || (obj instanceof Bundle)) {
                                if (aVar.f38917h.get(i2) != null) {
                                    aVar.f38917h.remove(i2);
                                }
                            }
                        } else if (obj == null || (obj instanceof Bundle)) {
                            Bundle bundle2 = (Bundle) obj;
                            if (aVar.f38915f == 0 && i2 == aVar.f38916g && i3 >= 1) {
                                aVar.f38916g = 0;
                                aVar.f38915f = i3;
                                RegisteredMediaRouteProvider2.this.m16857t(aVar, bundle2 != null ? new MediaRouteProviderDescriptor(bundle2, null) : null);
                                RegisteredMediaRouteProvider2 registeredMediaRouteProvider2 = RegisteredMediaRouteProvider2.this;
                                if (registeredMediaRouteProvider2.f38908o == aVar) {
                                    registeredMediaRouteProvider2.f38909p = true;
                                    int size = registeredMediaRouteProvider2.f38905l.size();
                                    while (i4 < size) {
                                        registeredMediaRouteProvider2.f38905l.get(i4).m16866g(registeredMediaRouteProvider2.f38908o);
                                        i4++;
                                    }
                                    MediaRouteDiscoveryRequest mediaRouteDiscoveryRequest = registeredMediaRouteProvider2.f38816e;
                                    if (mediaRouteDiscoveryRequest != null) {
                                        registeredMediaRouteProvider2.f38908o.m16863b(mediaRouteDiscoveryRequest);
                                    }
                                }
                            }
                        }
                    }
                    if (i4 == 0 || !RegisteredMediaRouteProvider2.f38902i) {
                    }
                    Log.d("MediaRouteProviderProxy", "Unhandled message from server: " + message);
                    return;
                }
                if (i2 == aVar.f38916g) {
                    aVar.f38916g = 0;
                    RegisteredMediaRouteProvider2 registeredMediaRouteProvider3 = RegisteredMediaRouteProvider2.this;
                    if (registeredMediaRouteProvider3.f38908o == aVar) {
                        if (RegisteredMediaRouteProvider2.f38902i) {
                            Log.d("MediaRouteProviderProxy", registeredMediaRouteProvider3 + ": Service connection error - Registration failed");
                        }
                        registeredMediaRouteProvider3.m16860w();
                    }
                }
                if (aVar.f38917h.get(i2) != null) {
                    aVar.f38917h.remove(i2);
                }
                i4 = 1;
                if (i4 == 0) {
                }
            }
        }
    }

    public RegisteredMediaRouteProvider2(Context context, ComponentName componentName) {
        super(context, new MediaRouteProvider.c(componentName));
        this.f38905l = new ArrayList<>();
        this.f38903j = componentName;
        this.f38904k = new c();
    }

    @Override // p636z0.p767w.p768a.MediaRouteProvider
    /* JADX INFO: renamed from: l */
    public MediaRouteProvider.d mo16793l(String str) {
        if (str != null) {
            return m16855r(str, null);
        }
        throw new IllegalArgumentException("routeId cannot be null");
    }

    @Override // p636z0.p767w.p768a.MediaRouteProvider
    /* JADX INFO: renamed from: m */
    public MediaRouteProvider.d mo16794m(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        }
        if (str2 != null) {
            return m16855r(str, str2);
        }
        throw new IllegalArgumentException("routeGroupId cannot be null");
    }

    @Override // p636z0.p767w.p768a.MediaRouteProvider
    /* JADX INFO: renamed from: n */
    public void mo16795n(MediaRouteDiscoveryRequest mediaRouteDiscoveryRequest) {
        if (this.f38909p) {
            this.f38908o.m16863b(mediaRouteDiscoveryRequest);
        }
        m16861x();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0036  */
    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        boolean z;
        if (f38902i) {
            Log.d("MediaRouteProviderProxy", this + ": Connected");
        }
        if (this.f38907n) {
            m16856s();
            Messenger messenger = iBinder != null ? new Messenger(iBinder) : null;
            boolean z2 = false;
            if (messenger != null) {
                try {
                    if (messenger.getBinder() != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                } catch (NullPointerException unused) {
                }
            } else {
                z = false;
            }
            if (!z) {
                Log.e("MediaRouteProviderProxy", this + ": Service returned invalid messenger binder");
                return;
            }
            a aVar = new a(messenger);
            int i = aVar.f38913d;
            aVar.f38913d = i + 1;
            aVar.f38916g = i;
            if (aVar.m16862a(1, i, 2, null, null)) {
                try {
                    aVar.f38910a.getBinder().linkToDeath(aVar, 0);
                    z2 = true;
                } catch (RemoteException unused2) {
                    aVar.binderDied();
                }
            }
            if (z2) {
                this.f38908o = aVar;
            } else if (f38902i) {
                Log.d("MediaRouteProviderProxy", this + ": Registration failed");
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (f38902i) {
            Log.d("MediaRouteProviderProxy", this + ": Service disconnected");
        }
        m16856s();
    }

    /* JADX INFO: renamed from: q */
    public final void m16854q() {
        if (this.f38907n) {
            return;
        }
        boolean z = f38902i;
        if (z) {
            Log.d("MediaRouteProviderProxy", this + ": Binding");
        }
        Intent intent = new Intent("android.media.MediaRouteProviderService");
        intent.setComponent(this.f38903j);
        try {
            boolean zBindService = this.f38812a.bindService(intent, this, 1);
            this.f38907n = zBindService;
            if (zBindService || !z) {
                return;
            }
            Log.d("MediaRouteProviderProxy", this + ": Bind failed");
        } catch (SecurityException e) {
            if (f38902i) {
                Log.d("MediaRouteProviderProxy", this + ": Bind failed", e);
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final MediaRouteProvider.d m16855r(String str, String str2) {
        MediaRouteProviderDescriptor mediaRouteProviderDescriptor = this.f38818g;
        if (mediaRouteProviderDescriptor == null) {
            return null;
        }
        mediaRouteProviderDescriptor.m16805a();
        List<MediaRouteDescriptor> list = mediaRouteProviderDescriptor.f38823b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i).m16777h().equals(str)) {
                b bVar = new b(str, str2);
                this.f38905l.add(bVar);
                if (this.f38909p) {
                    bVar.m16866g(this.f38908o);
                }
                m16861x();
                return bVar;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: s */
    public final void m16856s() {
        if (this.f38908o != null) {
            m16796o(null);
            this.f38909p = false;
            int size = this.f38905l.size();
            for (int i = 0; i < size; i++) {
                this.f38905l.get(i).m16867h();
            }
            a aVar = this.f38908o;
            aVar.m16862a(2, 0, 0, null, null);
            aVar.f38911b.f38928a.clear();
            aVar.f38910a.getBinder().unlinkToDeath(aVar, 0);
            RegisteredMediaRouteProvider2.this.f38904k.post(new RegisteredMediaRouteProvider(aVar));
            this.f38908o = null;
        }
    }

    /* JADX INFO: renamed from: t */
    public void m16857t(a aVar, MediaRouteProviderDescriptor mediaRouteProviderDescriptor) {
        if (this.f38908o == aVar) {
            if (f38902i) {
                Log.d("MediaRouteProviderProxy", this + ": Descriptor changed, descriptor=" + mediaRouteProviderDescriptor);
            }
            m16796o(mediaRouteProviderDescriptor);
        }
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("Service connection ");
        sbM1556G.append(this.f38903j.flattenToShortString());
        return sbM1556G.toString();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m16858u() {
        if (this.f38906m) {
            return (this.f38816e == null && this.f38905l.isEmpty()) ? false : true;
        }
        return false;
    }

    /* JADX INFO: renamed from: v */
    public void m16859v() {
        if (this.f38906m) {
            return;
        }
        if (f38902i) {
            Log.d("MediaRouteProviderProxy", this + ": Starting");
        }
        this.f38906m = true;
        m16861x();
    }

    /* JADX INFO: renamed from: w */
    public final void m16860w() {
        if (this.f38907n) {
            if (f38902i) {
                Log.d("MediaRouteProviderProxy", this + ": Unbinding");
            }
            this.f38907n = false;
            m16856s();
            this.f38812a.unbindService(this);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m16861x() {
        if (m16858u()) {
            m16854q();
        } else {
            m16860w();
        }
    }
}
