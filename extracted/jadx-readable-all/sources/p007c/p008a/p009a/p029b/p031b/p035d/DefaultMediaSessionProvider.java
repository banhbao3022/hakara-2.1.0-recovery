package p007c.p008a.p009a.p029b.p031b.p035d;

import android.app.PendingIntent;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
import com.devbrackets.android.playlistcore.components.mediasession.DefaultMediaSessionControlsReceiver;
import java.util.Objects;
import p007c.p008a.p009a.p029b.p030a.PlaylistItem;
import p007c.p008a.p009a.p029b.p038c.MediaInfo2;
import p007c.p008a.p009a.p029b.p038c.RemoteActions;
import p477d1.Lazy3;
import p477d1.LazyJVM;
import p477d1.p479b0.KProperty2;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p477d1.p493x.p495c.PropertyReference1Impl;
import p477d1.p493x.p495c.Reflection;

/* JADX INFO: renamed from: c.a.a.b.b.d.a, reason: use source file name */
/* JADX INFO: compiled from: DefaultMediaSessionProvider.kt */
/* JADX INFO: loaded from: classes.dex */
public class DefaultMediaSessionProvider extends MediaSessionCompat.AbstractC0032b implements MediaSessionProvider {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ KProperty2[] f1689f;

    /* JADX INFO: renamed from: g */
    public static final String f1690g;

    /* JADX INFO: renamed from: h */
    public static final String f1691h;

    /* JADX INFO: renamed from: i */
    public static final a f1692i;

    /* JADX INFO: renamed from: j */
    public PendingIntent f1693j;

    /* JADX INFO: renamed from: k */
    public PendingIntent f1694k;

    /* JADX INFO: renamed from: l */
    public PendingIntent f1695l;

    /* JADX INFO: renamed from: m */
    public final Lazy3 f1696m;

    /* JADX INFO: renamed from: n */
    public final Context f1697n;

    /* JADX INFO: renamed from: o */
    public final Class<? extends Service> f1698o;

    /* JADX INFO: renamed from: c.a.a.b.b.d.a$a */
    /* JADX INFO: compiled from: DefaultMediaSessionProvider.kt */
    public static final class a {
        public a() {
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: c.a.a.b.b.d.a$b */
    /* JADX INFO: compiled from: DefaultMediaSessionProvider.kt */
    public static final class b extends Lambda implements InterfaceC6153a<MediaSessionCompat> {
        public b() {
            super(0);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public MediaSessionCompat mo2c() {
            ComponentName componentName = new ComponentName(DefaultMediaSessionProvider.this.f1697n, DefaultMediaSessionControlsReceiver.class.getName());
            Context context = DefaultMediaSessionProvider.this.f1697n;
            Objects.requireNonNull(DefaultMediaSessionProvider.f1692i);
            String str = DefaultMediaSessionProvider.f1690g;
            DefaultMediaSessionProvider defaultMediaSessionProvider = DefaultMediaSessionProvider.this;
            Objects.requireNonNull(defaultMediaSessionProvider);
            Intrinsics2.m13090f(componentName, "componentName");
            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
            intent.setComponent(componentName);
            intent.putExtra(DefaultMediaSessionProvider.f1691h, defaultMediaSessionProvider.f1698o.getName());
            PendingIntent broadcast = PendingIntent.getBroadcast(defaultMediaSessionProvider.f1697n, 0, intent, 268435456);
            Intrinsics2.m13086b(broadcast, "PendingIntent.getBroadca…tent.FLAG_CANCEL_CURRENT)");
            return new MediaSessionCompat(context, str, componentName, broadcast);
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(Reflection.m13097a(DefaultMediaSessionProvider.class), "mediaSession", "getMediaSession()Landroid/support/v4/media/session/MediaSessionCompat;");
        Objects.requireNonNull(Reflection.f29605a);
        f1689f = new KProperty2[]{propertyReference1Impl};
        f1692i = new a(null);
        f1690g = "DefaultMediaSessionProvider.Session";
        f1691h = "com.devbrackets.android.playlistcore.RECEIVER_EXTRA_CLASS";
    }

    public DefaultMediaSessionProvider(Context context, Class<? extends Service> cls) {
        Intrinsics2.m13090f(context, "context");
        Intrinsics2.m13090f(cls, "serviceClass");
        this.f1697n = context;
        this.f1698o = cls;
        RemoteActions remoteActions = RemoteActions.f1769j;
        this.f1693j = m1235i(RemoteActions.f1761b, cls);
        this.f1694k = m1235i(RemoteActions.f1763d, cls);
        this.f1695l = m1235i(RemoteActions.f1762c, cls);
        this.f1696m = LazyJVM.m13021b(new b());
    }

    @Override // p007c.p008a.p009a.p029b.p031b.p035d.MediaSessionProvider
    /* JADX INFO: renamed from: a */
    public void mo1234a(MediaInfo2 mediaInfo2) {
        Intrinsics2.m13090f(mediaInfo2, "mediaInfo");
        m1236j().f77c.mo66h(3);
        m1236j().m45f(this, null);
        MediaMetadataCompat.C0023b c0023b = new MediaMetadataCompat.C0023b();
        PlaylistItem playlistItem = mediaInfo2.f1735a;
        String title = playlistItem != null ? playlistItem.getTitle() : null;
        if (title == null) {
            title = "";
        }
        c0023b.m28c("android.media.metadata.TITLE", title);
        PlaylistItem playlistItem2 = mediaInfo2.f1735a;
        String strMo1222c = playlistItem2 != null ? playlistItem2.mo1222c() : null;
        c0023b.m28c("android.media.metadata.ALBUM", strMo1222c != null ? strMo1222c : "");
        c0023b.m28c("android.media.metadata.ARTIST", mediaInfo2.m1265a());
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(this.f1697n.getResources(), mediaInfo2.f1738d);
        if (bitmapDecodeResource != null) {
            c0023b.m27b("android.media.metadata.DISPLAY_ICON", bitmapDecodeResource);
        }
        Bitmap bitmap = mediaInfo2.f1737c;
        if (bitmap != null) {
            c0023b.m27b("android.media.metadata.ALBUM_ART", bitmap);
        }
        m1236j().f77c.mo64f(c0023b.m26a());
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.AbstractC0032b
    /* JADX INFO: renamed from: d */
    public void mo50d() {
        m1237k(this.f1693j);
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.AbstractC0032b
    /* JADX INFO: renamed from: e */
    public void mo51e() {
        m1237k(this.f1693j);
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.AbstractC0032b
    /* JADX INFO: renamed from: f */
    public void mo52f() {
        m1237k(this.f1694k);
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.AbstractC0032b
    /* JADX INFO: renamed from: g */
    public void mo53g() {
        m1237k(this.f1695l);
    }

    @Override // p007c.p008a.p009a.p029b.p031b.p035d.MediaSessionProvider
    public MediaSessionCompat get() {
        return m1236j();
    }

    /* JADX INFO: renamed from: i */
    public PendingIntent m1235i(String str, Class<? extends Service> cls) {
        Intrinsics2.m13090f(str, "action");
        Intrinsics2.m13090f(cls, "serviceClass");
        Intent intent = new Intent(this.f1697n, cls);
        intent.setAction(str);
        PendingIntent service = PendingIntent.getService(this.f1697n, 0, intent, 134217728);
        Intrinsics2.m13086b(service, "PendingIntent.getService…tent.FLAG_UPDATE_CURRENT)");
        return service;
    }

    /* JADX INFO: renamed from: j */
    public final MediaSessionCompat m1236j() {
        Lazy3 lazy3 = this.f1696m;
        KProperty2 kProperty2 = f1689f[0];
        return (MediaSessionCompat) lazy3.getValue();
    }

    /* JADX INFO: renamed from: k */
    public void m1237k(PendingIntent pendingIntent) {
        Intrinsics2.m13090f(pendingIntent, "pi");
        try {
            pendingIntent.send();
        } catch (Exception e) {
            Log.d("DefaultMediaSessionPro", "Error sending media controls pending intent", e);
        }
    }
}
