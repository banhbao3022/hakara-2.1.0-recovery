package p007c.p008a.p009a.p029b.p041f;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.util.Objects;
import p007c.p008a.p009a.p029b.p030a.PlaylistItem;
import p007c.p008a.p009a.p029b.p031b.p037f.PlaylistHandler;
import p007c.p008a.p009a.p029b.p038c.RemoteActions;
import p007c.p008a.p009a.p029b.p039d.ServiceCallbacks;
import p007c.p008a.p009a.p029b.p040e.BasePlaylistManager;
import p477d1.Lazy3;
import p477d1.LazyJVM;
import p477d1.p479b0.KProperty2;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p477d1.p493x.p495c.PropertyReference1Impl;
import p477d1.p493x.p495c.Reflection;

/* JADX INFO: renamed from: c.a.a.b.f.a, reason: use source file name */
/* JADX INFO: compiled from: BasePlaylistService.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class BasePlaylistService<I extends PlaylistItem, M extends BasePlaylistManager<I>> extends Service implements ServiceCallbacks {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ KProperty2[] f1787f;

    /* JADX INFO: renamed from: g */
    public static final String f1788g;

    /* JADX INFO: renamed from: h */
    public boolean f1789h;

    /* JADX INFO: renamed from: i */
    public final Lazy3 f1790i = LazyJVM.m13021b(new b());

    /* JADX INFO: renamed from: c.a.a.b.f.a$a */
    /* JADX INFO: compiled from: BasePlaylistService.kt */
    public static final class a {
        public a() {
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: c.a.a.b.f.a$b */
    /* JADX INFO: compiled from: BasePlaylistService.kt */
    public static final class b extends Lambda implements InterfaceC6153a<PlaylistHandler<I>> {
        public b() {
            super(0);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public Object mo2c() {
            return BasePlaylistService.this.mo1285d();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(Reflection.m13097a(BasePlaylistService.class), "playlistHandler", "getPlaylistHandler()Lcom/devbrackets/android/playlistcore/components/playlisthandler/PlaylistHandler;");
        Objects.requireNonNull(Reflection.f29605a);
        f1787f = new KProperty2[]{propertyReference1Impl};
        new a(null);
        f1788g = "BasePlaylistService";
    }

    @Override // p007c.p008a.p009a.p029b.p039d.ServiceCallbacks
    /* JADX INFO: renamed from: a */
    public void mo1270a(boolean z) {
        if (this.f1789h) {
            this.f1789h = false;
            stopForeground(z);
        }
    }

    @Override // p007c.p008a.p009a.p029b.p039d.ServiceCallbacks
    /* JADX INFO: renamed from: b */
    public void mo1271b(int i, Notification notification) {
        Intrinsics2.m13090f(notification, "notification");
        if (this.f1789h) {
            return;
        }
        this.f1789h = true;
        startForeground(i, notification);
    }

    /* JADX INFO: renamed from: c */
    public final PlaylistHandler<I> m1284c() {
        Lazy3 lazy3 = this.f1790i;
        KProperty2 kProperty2 = f1787f[0];
        return (PlaylistHandler) lazy3.getValue();
    }

    /* JADX INFO: renamed from: d */
    public abstract PlaylistHandler<I> mo1285d();

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        Intrinsics2.m13090f(intent, "intent");
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        m1284c().mo1251l(this);
    }

    @Override // android.app.Service
    public void onDestroy() {
        m1284c().mo1255p();
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        if ((intent != null ? intent.getAction() : null) == null) {
            Log.d(f1788g, "Ignoring empty playlist service intent action");
            return 2;
        }
        String action = intent.getAction();
        Bundle extras = intent.getExtras();
        if (action != null) {
            if (!(action.length() == 0)) {
                RemoteActions remoteActions = RemoteActions.f1769j;
                if (Intrinsics2.m13085a(action, RemoteActions.f1760a)) {
                    m1284c().mo1252m(extras != null ? extras.getLong(RemoteActions.f1767h, -1L) : -1L, extras != null ? extras.getBoolean(RemoteActions.f1768i, false) : false);
                } else if (Intrinsics2.m13085a(action, RemoteActions.f1761b)) {
                    m1284c().mo1256q();
                } else if (Intrinsics2.m13085a(action, RemoteActions.f1763d)) {
                    m1284c().mo1245f();
                } else if (Intrinsics2.m13085a(action, RemoteActions.f1762c)) {
                    m1284c().mo1248i();
                } else if (Intrinsics2.m13085a(action, RemoteActions.f1764e)) {
                    m1284c().mo1254o();
                } else if (Intrinsics2.m13085a(action, RemoteActions.f1765f)) {
                    m1284c().mo1253n();
                } else if (Intrinsics2.m13085a(action, RemoteActions.f1766g)) {
                    m1284c().mo1249j(extras != null ? extras.getLong(RemoteActions.f1767h, 0L) : 0L);
                }
            }
        }
        return 2;
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        Intrinsics2.m13090f(intent, "rootIntent");
        if (this.f1789h) {
            return;
        }
        onDestroy();
    }

    @Override // p007c.p008a.p009a.p029b.p039d.ServiceCallbacks
    public void stop() {
        stopSelf();
    }
}
