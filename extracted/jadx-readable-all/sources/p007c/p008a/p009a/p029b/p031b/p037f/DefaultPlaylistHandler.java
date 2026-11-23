package p007c.p008a.p009a.p029b.p031b.p037f;

import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.net.wifi.WifiManager;
import android.util.Log;
import java.util.Iterator;
import java.util.Objects;
import mtp.media.karaoke.R;
import p007c.p008a.p009a.p029b.p030a.MediaPlayerApi;
import p007c.p008a.p009a.p029b.p030a.PlaylistItem;
import p007c.p008a.p009a.p029b.p031b.p032a.AudioFocusProvider;
import p007c.p008a.p009a.p029b.p031b.p032a.DefaultAudioFocusProvider;
import p007c.p008a.p009a.p029b.p031b.p033b.ImageProvider;
import p007c.p008a.p009a.p029b.p031b.p034c.MediaControlsProvider;
import p007c.p008a.p009a.p029b.p031b.p035d.MediaSessionProvider;
import p007c.p008a.p009a.p029b.p031b.p036e.PlaylistNotificationProvider;
import p007c.p008a.p009a.p029b.p038c.MediaInfo2;
import p007c.p008a.p009a.p029b.p038c.MediaProgress;
import p007c.p008a.p009a.p029b.p038c.PlaybackState;
import p007c.p008a.p009a.p029b.p038c.PlaylistItemChange;
import p007c.p008a.p009a.p029b.p039d.MediaStatusListener;
import p007c.p008a.p009a.p029b.p039d.ProgressListener;
import p007c.p008a.p009a.p029b.p039d.ServiceCallbacks;
import p007c.p008a.p009a.p029b.p040e.BasePlaylistManager;
import p007c.p008a.p009a.p029b.p042g.MediaProgressPoll;
import p007c.p008a.p009a.p029b.p042g.SafeWifiLock;
import p477d1.Lazy3;
import p477d1.LazyJVM;
import p477d1.TypeCastException;
import p477d1.p479b0.KProperty2;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p477d1.p493x.p495c.PropertyReference1Impl;
import p477d1.p493x.p495c.Reflection;

/* JADX INFO: renamed from: c.a.a.b.b.f.a, reason: use source file name */
/* JADX INFO: compiled from: DefaultPlaylistHandler.kt */
/* JADX INFO: loaded from: classes.dex */
public class DefaultPlaylistHandler<I extends PlaylistItem, M extends BasePlaylistManager<I>> extends PlaylistHandler<I> implements ProgressListener, MediaStatusListener<I> {

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ KProperty2[] f1704k;

    /* JADX INFO: renamed from: A */
    public final PlaylistNotificationProvider f1705A;

    /* JADX INFO: renamed from: B */
    public final MediaSessionProvider f1706B;

    /* JADX INFO: renamed from: C */
    public final MediaControlsProvider f1707C;

    /* JADX INFO: renamed from: D */
    public final AudioFocusProvider<I> f1708D;

    /* JADX INFO: renamed from: E */
    public c<I> f1709E;

    /* JADX INFO: renamed from: l */
    public final MediaInfo2 f1710l;

    /* JADX INFO: renamed from: m */
    public final SafeWifiLock f1711m;

    /* JADX INFO: renamed from: n */
    public MediaProgressPoll<I> f1712n;

    /* JADX INFO: renamed from: o */
    public final Lazy3 f1713o;

    /* JADX INFO: renamed from: p */
    public ServiceCallbacks f1714p;

    /* JADX INFO: renamed from: q */
    public I f1715q;

    /* JADX INFO: renamed from: r */
    public boolean f1716r;

    /* JADX INFO: renamed from: s */
    public boolean f1717s;

    /* JADX INFO: renamed from: t */
    public boolean f1718t;

    /* JADX INFO: renamed from: u */
    public long f1719u;

    /* JADX INFO: renamed from: v */
    public int f1720v;

    /* JADX INFO: renamed from: w */
    public final Context f1721w;

    /* JADX INFO: renamed from: x */
    public final Class<? extends Service> f1722x;

    /* JADX INFO: renamed from: y */
    public final M f1723y;

    /* JADX INFO: renamed from: z */
    public final ImageProvider<I> f1724z;

    /* JADX INFO: renamed from: c.a.a.b.b.f.a$a */
    /* JADX INFO: compiled from: DefaultPlaylistHandler.kt */
    public static class a<I extends PlaylistItem, M extends BasePlaylistManager<I>> {

        /* JADX INFO: renamed from: a */
        public final Context f1725a;

        /* JADX INFO: renamed from: b */
        public final Class<? extends Service> f1726b;

        /* JADX INFO: renamed from: c */
        public final M f1727c;

        /* JADX INFO: renamed from: d */
        public final ImageProvider<I> f1728d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Context context, Class<? extends Service> cls, M m, ImageProvider<? super I> imageProvider) {
            Intrinsics2.m13090f(context, "context");
            Intrinsics2.m13090f(cls, "serviceClass");
            Intrinsics2.m13090f(m, "playlistManager");
            Intrinsics2.m13090f(imageProvider, "imageProvider");
            this.f1725a = context;
            this.f1726b = cls;
            this.f1727c = m;
            this.f1728d = imageProvider;
        }
    }

    /* JADX INFO: renamed from: c.a.a.b.b.f.a$b */
    /* JADX INFO: compiled from: DefaultPlaylistHandler.kt */
    public static final class b {
        public b() {
        }

        public b(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: c.a.a.b.b.f.a$c */
    /* JADX INFO: compiled from: DefaultPlaylistHandler.kt */
    public interface c<I extends PlaylistItem> {
        /* JADX INFO: renamed from: a */
        void m1263a(I i);

        /* JADX INFO: renamed from: b */
        void m1264b(MediaPlayerApi<I> mediaPlayerApi, MediaPlayerApi<I> mediaPlayerApi2);
    }

    /* JADX INFO: renamed from: c.a.a.b.b.f.a$d */
    /* JADX INFO: compiled from: DefaultPlaylistHandler.kt */
    public static final class d extends Lambda implements InterfaceC6153a<NotificationManager> {
        public d() {
            super(0);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public NotificationManager mo2c() {
            Object systemService = DefaultPlaylistHandler.this.f1721w.getSystemService("notification");
            if (systemService != null) {
                return (NotificationManager) systemService;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.app.NotificationManager");
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(Reflection.m13097a(DefaultPlaylistHandler.class), "notificationManager", "getNotificationManager()Landroid/app/NotificationManager;");
        Objects.requireNonNull(Reflection.f29605a);
        f1704k = new KProperty2[]{propertyReference1Impl};
        new b(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DefaultPlaylistHandler(Context context, Class<? extends Service> cls, M m, ImageProvider<? super I> imageProvider, PlaylistNotificationProvider playlistNotificationProvider, MediaSessionProvider mediaSessionProvider, MediaControlsProvider mediaControlsProvider, AudioFocusProvider<I> audioFocusProvider, c<I> cVar) {
        super(m.f1773i);
        Intrinsics2.m13090f(context, "context");
        Intrinsics2.m13090f(cls, "serviceClass");
        Intrinsics2.m13090f(m, "playlistManager");
        Intrinsics2.m13090f(imageProvider, "imageProvider");
        Intrinsics2.m13090f(playlistNotificationProvider, "notificationProvider");
        Intrinsics2.m13090f(mediaSessionProvider, "mediaSessionProvider");
        Intrinsics2.m13090f(mediaControlsProvider, "mediaControlsProvider");
        Intrinsics2.m13090f(audioFocusProvider, "audioFocusProvider");
        this.f1721w = context;
        this.f1722x = cls;
        this.f1723y = m;
        this.f1724z = imageProvider;
        this.f1705A = playlistNotificationProvider;
        this.f1706B = mediaSessionProvider;
        this.f1707C = mediaControlsProvider;
        this.f1708D = audioFocusProvider;
        this.f1709E = null;
        this.f1710l = new MediaInfo2();
        this.f1711m = new SafeWifiLock(context);
        this.f1712n = new MediaProgressPoll<>();
        this.f1713o = LazyJVM.m13021b(new d());
        this.f1719u = -1L;
        ((DefaultAudioFocusProvider) audioFocusProvider).m1228e(this);
    }

    @Override // p007c.p008a.p009a.p029b.p039d.MediaStatusListener
    /* JADX INFO: renamed from: a */
    public void mo1240a(MediaPlayerApi<I> mediaPlayerApi) {
        Intrinsics2.m13090f(mediaPlayerApi, "mediaPlayer");
        mo1245f();
        this.f1718t = false;
    }

    @Override // p007c.p008a.p009a.p029b.p039d.MediaStatusListener
    /* JADX INFO: renamed from: b */
    public void mo1241b(MediaPlayerApi<I> mediaPlayerApi) {
        Intrinsics2.m13090f(mediaPlayerApi, "mediaPlayer");
        Intrinsics2.m13090f(mediaPlayerApi, "mediaPlayer");
        long j2 = this.f1719u;
        boolean z = j2 > 0;
        if (z) {
            this.f1717s = m1259t();
            MediaPlayerApi<I> mediaPlayerApi2 = this.f1733i;
            if (mediaPlayerApi2 != null) {
                mediaPlayerApi2.mo1219x(j2);
            }
            this.f1719u = -1L;
        }
        this.f1712n.m1287b();
        if (mediaPlayerApi.isPlaying() || this.f1718t) {
            m1261v(PlaybackState.PAUSED);
        } else {
            this.f1716r = z;
            mo1247h();
            Objects.requireNonNull(this.f1723y);
        }
        this.f1708D.mo1225b();
        this.f1720v = 0;
    }

    @Override // p007c.p008a.p009a.p029b.p039d.MediaStatusListener
    /* JADX INFO: renamed from: c */
    public boolean mo1242c(MediaPlayerApi<I> mediaPlayerApi) {
        Intrinsics2.m13090f(mediaPlayerApi, "mediaPlayer");
        int i = this.f1720v + 1;
        this.f1720v = i;
        if (i <= 3) {
            mo1245f();
            return false;
        }
        m1261v(PlaybackState.ERROR);
        ServiceCallbacks serviceCallbacks = this.f1714p;
        if (serviceCallbacks == null) {
            Intrinsics2.m13096l("serviceCallbacks");
            throw null;
        }
        serviceCallbacks.mo1270a(true);
        this.f1711m.m1290a();
        this.f1712n.m1288c();
        this.f1708D.mo1226c();
        return false;
    }

    @Override // p007c.p008a.p009a.p029b.p039d.MediaStatusListener
    /* JADX INFO: renamed from: d */
    public void mo1243d(MediaPlayerApi<I> mediaPlayerApi, int i) {
        Intrinsics2.m13090f(mediaPlayerApi, "mediaPlayer");
        if (mediaPlayerApi.isPlaying()) {
            return;
        }
        MediaProgress mediaProgress = this.f1731g;
        if (mediaProgress.f1747c != i) {
            mediaProgress.m1267b(mediaPlayerApi.getCurrentPosition(), i, mediaPlayerApi.getDuration());
            mo1250k(this.f1731g);
        }
    }

    @Override // p007c.p008a.p009a.p029b.p039d.MediaStatusListener
    /* JADX INFO: renamed from: e */
    public void mo1244e(MediaPlayerApi<I> mediaPlayerApi) {
        Intrinsics2.m13090f(mediaPlayerApi, "mediaPlayer");
        if (!this.f1716r && !this.f1717s) {
            mo1246g(false);
            return;
        }
        mo1247h();
        this.f1716r = false;
        this.f1717s = false;
    }

    @Override // p007c.p008a.p009a.p029b.p031b.p037f.PlaylistHandler
    /* JADX INFO: renamed from: f */
    public void mo1245f() {
        this.f1723y.m1278g();
        mo1252m(0L, !m1259t());
    }

    @Override // p007c.p008a.p009a.p029b.p031b.p037f.PlaylistHandler
    /* JADX INFO: renamed from: g */
    public void mo1246g(boolean z) {
        MediaPlayerApi<I> mediaPlayerApi;
        if (m1259t() && (mediaPlayerApi = this.f1733i) != null) {
            mediaPlayerApi.pause();
        }
        this.f1712n.m1288c();
        m1261v(PlaybackState.PAUSED);
        ServiceCallbacks serviceCallbacks = this.f1714p;
        if (serviceCallbacks == null) {
            Intrinsics2.m13096l("serviceCallbacks");
            throw null;
        }
        serviceCallbacks.mo1270a(false);
        if (z) {
            return;
        }
        this.f1708D.mo1226c();
    }

    @Override // p007c.p008a.p009a.p029b.p031b.p037f.PlaylistHandler
    /* JADX INFO: renamed from: h */
    public void mo1247h() {
        MediaPlayerApi<I> mediaPlayerApi;
        if (!m1259t() && (mediaPlayerApi = this.f1733i) != null) {
            mediaPlayerApi.mo1214U();
        }
        this.f1712n.m1287b();
        m1261v(PlaybackState.PLAYING);
        m1262w();
        this.f1708D.mo1224a();
    }

    @Override // p007c.p008a.p009a.p029b.p031b.p037f.PlaylistHandler
    /* JADX INFO: renamed from: i */
    public void mo1248i() {
        M m = this.f1723y;
        int i = m.f1771g;
        if (i != -1) {
            m.m1282l(Math.max(0, i - 1));
        }
        m.m1273b();
        mo1252m(0L, !m1259t());
    }

    @Override // p007c.p008a.p009a.p029b.p031b.p037f.PlaylistHandler
    /* JADX INFO: renamed from: j */
    public void mo1249j(long j2) {
        this.f1717s = m1259t();
        MediaPlayerApi<I> mediaPlayerApi = this.f1733i;
        if (mediaPlayerApi != null) {
            mediaPlayerApi.mo1219x(j2);
        }
        m1261v(PlaybackState.SEEKING);
    }

    @Override // p007c.p008a.p009a.p029b.p039d.ProgressListener
    /* JADX INFO: renamed from: k */
    public boolean mo1250k(MediaProgress mediaProgress) {
        Intrinsics2.m13090f(mediaProgress, "mediaProgress");
        Intrinsics2.m13090f(mediaProgress, "<set-?>");
        this.f1731g = mediaProgress;
        return this.f1723y.mo1250k(mediaProgress);
    }

    @Override // p007c.p008a.p009a.p029b.p031b.p037f.PlaylistHandler
    /* JADX INFO: renamed from: l */
    public void mo1251l(ServiceCallbacks serviceCallbacks) {
        Intrinsics2.m13090f(serviceCallbacks, "serviceCallbacks");
        this.f1714p = serviceCallbacks;
        this.f1712n.f1796e = this;
        this.f1723y.f1772h = this;
    }

    @Override // p007c.p008a.p009a.p029b.p031b.p037f.PlaylistHandler
    /* JADX INFO: renamed from: m */
    public void mo1252m(long j2, boolean z) {
        this.f1719u = j2;
        this.f1718t = z;
        Objects.requireNonNull(this.f1723y);
        I i = (I) this.f1723y.m1273b();
        while (i != null && m1258s(i) == null) {
            c<I> cVar = this.f1709E;
            if (cVar != null) {
                cVar.m1263a(i);
            }
            i = (I) this.f1723y.m1278g();
        }
        if (i == null) {
            Objects.requireNonNull(this.f1723y);
        }
        this.f1715q = i;
        if (this.f1734j.isEmpty()) {
            Log.d("DefaultPlaylistHandler", "No media players available, stopping service");
            mo1254o();
        }
        MediaPlayerApi<I> mediaPlayerApiM1258s = i != null ? m1258s(i) : null;
        boolean z2 = true;
        if (!Intrinsics2.m13085a(mediaPlayerApiM1258s, this.f1733i)) {
            c<I> cVar2 = this.f1709E;
            if (cVar2 != null) {
                cVar2.m1264b(this.f1733i, mediaPlayerApiM1258s);
            }
            MediaPlayerApi<I> mediaPlayerApi = this.f1733i;
            if (mediaPlayerApi != null) {
                mediaPlayerApi.stop();
            }
        }
        this.f1733i = mediaPlayerApiM1258s;
        PlaylistItem playlistItemM1273b = this.f1723y.m1273b();
        if (!((i == null || playlistItemM1273b == null || i.mo1223w() != playlistItemM1273b.mo1223w()) ? false : true)) {
            Log.d("DefaultPlaylistHandler", "forcing currentPlaylistItem update");
            this.f1715q = (I) this.f1723y.m1273b();
        }
        if (i != null) {
            this.f1724z.mo1229a(i);
        }
        M m = this.f1723y;
        PlaylistItemChange<? extends I> playlistItemChange = new PlaylistItemChange<>(i, m.f1771g > 0, m.m1277f());
        this.f1723y.mo1269y(playlistItemChange.f1757a, playlistItemChange.f1759c, playlistItemChange.f1758b);
        this.f1730f = playlistItemChange;
        MediaPlayerApi<I> mediaPlayerApi2 = this.f1733i;
        if (mediaPlayerApi2 == null || i == null) {
            z2 = false;
        } else {
            Intrinsics2.m13090f(mediaPlayerApi2, "mediaPlayer");
            mediaPlayerApi2.reset();
            mediaPlayerApi2.mo1215c(this);
            MediaProgressPoll<I> mediaProgressPoll = this.f1712n;
            mediaProgressPoll.f1797f = mediaPlayerApi2;
            mediaProgressPoll.m1286a();
            this.f1712n.m1286a();
            this.f1708D.mo1224a();
            mediaPlayerApi2.mo1218i(i);
            m1262w();
            m1261v(PlaybackState.PREPARING);
            SafeWifiLock safeWifiLock = this.f1711m;
            I i2 = this.f1715q;
            if (!(i2 != null ? i2.mo1220a() : true)) {
                WifiManager.WifiLock wifiLock = safeWifiLock.f1808a;
                if (wifiLock != null && !wifiLock.isHeld()) {
                    wifiLock.acquire();
                }
            } else {
                safeWifiLock.m1290a();
            }
        }
        if (z2) {
            return;
        }
        if (this.f1723y.m1277f()) {
            mo1245f();
        } else {
            mo1254o();
        }
    }

    @Override // p007c.p008a.p009a.p029b.p031b.p037f.PlaylistHandler
    /* JADX INFO: renamed from: n */
    public void mo1253n() {
        if (m1259t()) {
            this.f1716r = true;
            mo1246g(true);
        }
    }

    @Override // p007c.p008a.p009a.p029b.p031b.p037f.PlaylistHandler
    /* JADX INFO: renamed from: o */
    public void mo1254o() {
        MediaPlayerApi<I> mediaPlayerApi = this.f1733i;
        if (mediaPlayerApi != null) {
            mediaPlayerApi.stop();
        }
        m1261v(PlaybackState.STOPPED);
        if (this.f1715q != null) {
            Objects.requireNonNull(this.f1723y);
        }
        m1260u();
        this.f1723y.m1282l(-1);
        ServiceCallbacks serviceCallbacks = this.f1714p;
        if (serviceCallbacks != null) {
            serviceCallbacks.stop();
        } else {
            Intrinsics2.m13096l("serviceCallbacks");
            throw null;
        }
    }

    @Override // p007c.p008a.p009a.p029b.p031b.p037f.PlaylistHandler
    /* JADX INFO: renamed from: p */
    public void mo1255p() {
        m1261v(PlaybackState.STOPPED);
        m1260u();
        this.f1723y.f1772h = null;
        MediaInfo2 mediaInfo2 = this.f1710l;
        mediaInfo2.f1738d = 0;
        mediaInfo2.f1739e = 0;
        mediaInfo2.f1735a = null;
        mediaInfo2.f1736b = null;
        mediaInfo2.f1737c = null;
    }

    @Override // p007c.p008a.p009a.p029b.p031b.p037f.PlaylistHandler
    /* JADX INFO: renamed from: q */
    public void mo1256q() {
        if (m1259t()) {
            mo1246g(false);
        } else {
            mo1247h();
        }
    }

    @Override // p007c.p008a.p009a.p029b.p031b.p037f.PlaylistHandler
    /* JADX INFO: renamed from: r */
    public void mo1257r() {
        if (this.f1715q == null) {
            return;
        }
        this.f1710l.f1740f.f1741a = m1259t();
        MediaInfo2.a aVar = this.f1710l.f1740f;
        PlaybackState playbackState = this.f1732h;
        aVar.f1742b = playbackState == PlaybackState.RETRIEVING || playbackState == PlaybackState.PREPARING || playbackState == PlaybackState.SEEKING;
        aVar.f1744d = this.f1723y.m1277f();
        MediaInfo2 mediaInfo2 = this.f1710l;
        mediaInfo2.f1740f.f1743c = this.f1723y.f1771g > 0;
        mediaInfo2.f1739e = R.id.playlistcore_default_notification_id;
        mediaInfo2.f1735a = this.f1715q;
        mediaInfo2.f1738d = this.f1724z.mo1231c();
        this.f1710l.f1737c = this.f1724z.mo1232d();
        this.f1710l.f1736b = this.f1724z.mo1230b();
        this.f1706B.mo1234a(this.f1710l);
        this.f1707C.mo1233a(this.f1710l, this.f1706B.get());
        Lazy3 lazy3 = this.f1713o;
        KProperty2 kProperty2 = f1704k[0];
        NotificationManager notificationManager = (NotificationManager) lazy3.getValue();
        MediaInfo2 mediaInfo3 = this.f1710l;
        notificationManager.notify(mediaInfo3.f1739e, this.f1705A.mo1238a(mediaInfo3, this.f1706B.get(), this.f1722x));
    }

    /* JADX INFO: renamed from: s */
    public MediaPlayerApi<I> m1258s(I i) {
        Object next;
        Intrinsics2.m13090f(i, "item");
        Iterator<T> it = this.f1734j.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((MediaPlayerApi) next).mo1217h(i)) {
                return (MediaPlayerApi) next;
            }
        }
        next = null;
        return (MediaPlayerApi) next;
    }

    /* JADX INFO: renamed from: t */
    public boolean m1259t() {
        MediaPlayerApi<I> mediaPlayerApi = this.f1733i;
        if (mediaPlayerApi != null) {
            return mediaPlayerApi.isPlaying();
        }
        return false;
    }

    /* JADX INFO: renamed from: u */
    public void m1260u() {
        MediaProgressPoll<I> mediaProgressPoll = this.f1712n;
        mediaProgressPoll.m1286a();
        mediaProgressPoll.f1797f = null;
        mediaProgressPoll.f1796e = null;
        this.f1733i = null;
        this.f1708D.mo1226c();
        this.f1711m.m1290a();
        ServiceCallbacks serviceCallbacks = this.f1714p;
        if (serviceCallbacks == null) {
            Intrinsics2.m13096l("serviceCallbacks");
            throw null;
        }
        serviceCallbacks.mo1270a(true);
        Lazy3 lazy3 = this.f1713o;
        KProperty2 kProperty2 = f1704k[0];
        ((NotificationManager) lazy3.getValue()).cancel(R.id.playlistcore_default_notification_id);
        this.f1706B.get().f77c.release();
    }

    /* JADX INFO: renamed from: v */
    public void m1261v(PlaybackState playbackState) {
        Intrinsics2.m13090f(playbackState, "state");
        Intrinsics2.m13090f(playbackState, "<set-?>");
        this.f1732h = playbackState;
        this.f1723y.mo1268n(playbackState);
        if (playbackState == PlaybackState.STOPPED || playbackState == PlaybackState.ERROR) {
            return;
        }
        mo1257r();
    }

    /* JADX INFO: renamed from: w */
    public void m1262w() {
        ServiceCallbacks serviceCallbacks = this.f1714p;
        if (serviceCallbacks != null) {
            serviceCallbacks.mo1271b(R.id.playlistcore_default_notification_id, this.f1705A.mo1238a(this.f1710l, this.f1706B.get(), this.f1722x));
        } else {
            Intrinsics2.m13096l("serviceCallbacks");
            throw null;
        }
    }
}
