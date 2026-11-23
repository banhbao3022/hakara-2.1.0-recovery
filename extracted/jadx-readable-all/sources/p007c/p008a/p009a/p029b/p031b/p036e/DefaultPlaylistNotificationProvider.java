package p007c.p008a.p009a.p029b.p031b.p036e;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat;
import com.cgfay.media.CainMediaMetadataRetriever;
import java.util.Objects;
import mtp.media.karaoke.R;
import p007c.p008a.p009a.p029b.p030a.PlaylistItem;
import p007c.p008a.p009a.p029b.p038c.MediaInfo2;
import p007c.p008a.p009a.p029b.p038c.RemoteActions;
import p007c.p071d.p078c.p079a.outline;
import p477d1.Lazy3;
import p477d1.LazyJVM;
import p477d1.TypeCastException;
import p477d1.p479b0.KProperty2;
import p477d1.p481d0.StringsJVM;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p477d1.p493x.p495c.PropertyReference1Impl;
import p477d1.p493x.p495c.Reflection;
import p636z0.p725k.p726c.C8176m;
import p636z0.p765v.p766e.C8411a;

/* JADX INFO: renamed from: c.a.a.b.b.e.a, reason: use source file name */
/* JADX INFO: compiled from: DefaultPlaylistNotificationProvider.kt */
/* JADX INFO: loaded from: classes.dex */
public class DefaultPlaylistNotificationProvider implements PlaylistNotificationProvider {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ KProperty2[] f1700a;

    /* JADX INFO: renamed from: b */
    public final Lazy3 f1701b;

    /* JADX INFO: renamed from: c */
    public final Context f1702c;

    /* JADX INFO: renamed from: c.a.a.b.b.e.a$a */
    /* JADX INFO: compiled from: DefaultPlaylistNotificationProvider.kt */
    public static final class a {
        public a() {
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: c.a.a.b.b.e.a$b */
    /* JADX INFO: compiled from: DefaultPlaylistNotificationProvider.kt */
    public static final class b extends Lambda implements InterfaceC6153a<NotificationManager> {
        public b() {
            super(0);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public NotificationManager mo2c() {
            Object systemService = DefaultPlaylistNotificationProvider.this.f1702c.getApplicationContext().getSystemService("notification");
            if (systemService != null) {
                return (NotificationManager) systemService;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.app.NotificationManager");
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(Reflection.m13097a(DefaultPlaylistNotificationProvider.class), "notificationManager", "getNotificationManager()Landroid/app/NotificationManager;");
        Objects.requireNonNull(Reflection.f29605a);
        f1700a = new KProperty2[]{propertyReference1Impl};
        new a(null);
    }

    public DefaultPlaylistNotificationProvider(Context context) {
        Intrinsics2.m13090f(context, "context");
        this.f1702c = context;
        this.f1701b = LazyJVM.m13021b(new b());
    }

    @Override // p007c.p008a.p009a.p029b.p031b.p036e.PlaylistNotificationProvider
    /* JADX INFO: renamed from: a */
    public Notification mo1238a(MediaInfo2 mediaInfo2, MediaSessionCompat mediaSessionCompat, Class<? extends Service> cls) {
        String string;
        int i;
        String strM1265a;
        Intrinsics2.m13090f(mediaInfo2, "info");
        Intrinsics2.m13090f(mediaSessionCompat, "mediaSession");
        Intrinsics2.m13090f(cls, "serviceClass");
        if (Build.VERSION.SDK_INT >= 26) {
            Lazy3 lazy3 = this.f1701b;
            KProperty2[] kProperty2Arr = f1700a;
            KProperty2 kProperty2 = kProperty2Arr[0];
            if (((NotificationManager) lazy3.getValue()).getNotificationChannel("PlaylistCoreMediaNotificationChannel") == null) {
                String string2 = this.f1702c.getResources().getString(R.string.playlistcore_default_notification_channel_name);
                String string3 = this.f1702c.getResources().getString(R.string.playlistcore_default_notification_channel_description);
                Intrinsics2.m13086b(string2, "name");
                Intrinsics2.m13086b(string3, CainMediaMetadataRetriever.METADATA_KEY_DESCRIPTION);
                Intrinsics2.m13090f(string2, "name");
                Intrinsics2.m13090f(string3, CainMediaMetadataRetriever.METADATA_KEY_DESCRIPTION);
                NotificationChannel notificationChannel = new NotificationChannel("PlaylistCoreMediaNotificationChannel", string2, 2);
                notificationChannel.setDescription(string3);
                notificationChannel.setLockscreenVisibility(1);
                Lazy3 lazy4 = this.f1701b;
                KProperty2 kProperty3 = kProperty2Arr[0];
                ((NotificationManager) lazy4.getValue()).createNotificationChannel(notificationChannel);
            }
        }
        C8176m c8176m = new C8176m(this.f1702c, "PlaylistCoreMediaNotificationChannel");
        c8176m.f37736N.icon = mediaInfo2.f1738d;
        c8176m.m16111h(mediaInfo2.f1736b);
        PlaylistItem playlistItem = mediaInfo2.f1735a;
        String strMo1222c = playlistItem != null ? playlistItem.mo1222c() : null;
        if (strMo1222c == null) {
            strMo1222c = "";
        }
        if (!StringsJVM.m12990g(mediaInfo2.m1265a())) {
            StringBuilder sbM1556G = outline.m1556G(strMo1222c);
            if (!StringsJVM.m12990g(strMo1222c)) {
                StringBuilder sbM1556G2 = outline.m1556G(" - ");
                sbM1556G2.append(mediaInfo2.m1265a());
                strM1265a = sbM1556G2.toString();
            } else {
                strM1265a = mediaInfo2.m1265a();
            }
            sbM1556G.append(strM1265a);
            strMo1222c = sbM1556G.toString();
        }
        PlaylistItem playlistItem2 = mediaInfo2.f1735a;
        String title = playlistItem2 != null ? playlistItem2.getTitle() : null;
        c8176m.m16109f(title != null ? title : "");
        c8176m.m16108e(strMo1222c);
        c8176m.f37745g = null;
        RemoteActions remoteActions = RemoteActions.f1769j;
        String str = RemoteActions.f1764e;
        c8176m.f37736N.deleteIntent = m1239b(cls, str);
        boolean z = !mediaInfo2.f1740f.f1741a;
        c8176m.m16110g(16, z);
        c8176m.m16110g(2, !z);
        c8176m.f37724B = "transport";
        c8176m.f37727E = 1;
        Intrinsics2.m13090f(c8176m, "builder");
        Intrinsics2.m13090f(mediaInfo2, "info");
        Intrinsics2.m13090f(cls, "serviceClass");
        MediaInfo2.a aVar = mediaInfo2.f1740f;
        c8176m.m16105a(aVar.f1743c ? R.drawable.playlistcore_notification_previous : R.drawable.playlistcore_notification_previous_disabled, this.f1702c.getResources().getString(R.string.playlistcore_default_notification_previous), m1239b(cls, RemoteActions.f1762c));
        if (aVar.f1741a) {
            string = this.f1702c.getResources().getString(R.string.playlistcore_default_notification_pause);
            i = aVar.f1742b ? R.drawable.playlistcore_notification_pause_disabled : R.drawable.playlistcore_notification_pause;
        } else {
            string = this.f1702c.getResources().getString(R.string.playlistcore_default_notification_play);
            i = aVar.f1742b ? R.drawable.playlistcore_notification_play_disabled : R.drawable.playlistcore_notification_play;
        }
        c8176m.m16105a(i, string, m1239b(cls, RemoteActions.f1761b));
        c8176m.m16105a(aVar.f1744d ? R.drawable.playlistcore_notification_next : R.drawable.playlistcore_notification_next_disabled, this.f1702c.getResources().getString(R.string.playlistcore_default_notification_next), m1239b(cls, RemoteActions.f1763d));
        Intrinsics2.m13090f(mediaSessionCompat, "mediaSession");
        Intrinsics2.m13090f(cls, "serviceClass");
        C8411a c8411a = new C8411a();
        c8411a.f38804f = mediaSessionCompat.m42b();
        c8411a.f38803e = new int[]{0, 1, 2};
        c8411a.f38805g = m1239b(cls, str);
        Intrinsics2.m13086b(c8411a, "setCancelButtonIntent(cr…moteActions.ACTION_STOP))");
        Intrinsics2.m13086b(c8411a, "with(MediaStyle()) {\n   …s.ACTION_STOP))\n        }");
        c8176m.m16114k(c8411a);
        Notification notificationM16106b = c8176m.m16106b();
        Intrinsics2.m13086b(notificationM16106b, "NotificationCompat.Build…Class))\n        }.build()");
        return notificationM16106b;
    }

    /* JADX INFO: renamed from: b */
    public PendingIntent m1239b(Class<? extends Service> cls, String str) {
        Intrinsics2.m13090f(cls, "serviceClass");
        Intrinsics2.m13090f(str, "action");
        Intent intent = new Intent(this.f1702c, cls);
        intent.setAction(str);
        PendingIntent service = PendingIntent.getService(this.f1702c, 0, intent, 134217728);
        Intrinsics2.m13086b(service, "PendingIntent.getService…tent.FLAG_UPDATE_CURRENT)");
        return service;
    }
}
