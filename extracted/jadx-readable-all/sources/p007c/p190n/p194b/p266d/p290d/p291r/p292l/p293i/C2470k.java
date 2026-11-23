package p007c.p190n.p194b.p266d.p290d.p291r.p292l.p293i;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.framework.ReconnectionService;
import com.google.android.gms.cast.framework.media.MediaNotificationService;
import java.util.List;
import mtp.media.karaoke.R;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p290d.C2395i;
import p007c.p190n.p194b.p266d.p290d.C2404l;
import p007c.p190n.p194b.p266d.p290d.C2410n;
import p007c.p190n.p194b.p266d.p290d.p291r.C2424b;
import p007c.p190n.p194b.p266d.p290d.p291r.p292l.AbstractC2454f;
import p007c.p190n.p194b.p266d.p290d.p291r.p292l.C2444a;
import p007c.p190n.p194b.p266d.p290d.p291r.p292l.C2452e;
import p007c.p190n.p194b.p266d.p290d.p291r.p292l.C2456g;
import p007c.p190n.p194b.p266d.p290d.p291r.p292l.C2458h;
import p007c.p190n.p194b.p266d.p290d.p291r.p292l.InterfaceC2497y;
import p007c.p190n.p194b.p266d.p290d.p295s.C2518b;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p301p.C2708a;
import p007c.p190n.p194b.p266d.p314j.p320f.BinderC3958p;
import p007c.p190n.p194b.p266d.p314j.p320f.HandlerC4025w;
import p636z0.p691g.ArrayMap;

/* JADX INFO: renamed from: c.n.b.d.d.r.l.i.k */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2470k implements C2458h.b {

    /* JADX INFO: renamed from: a */
    public static final C2518b f11322a = new C2518b("MediaSessionManager");

    /* JADX INFO: renamed from: b */
    public final Context f11323b;

    /* JADX INFO: renamed from: c */
    public final C2424b f11324c;

    /* JADX INFO: renamed from: d */
    public final BinderC3958p f11325d;

    /* JADX INFO: renamed from: e */
    public final ComponentName f11326e;

    /* JADX INFO: renamed from: f */
    public final C2460a f11327f;

    /* JADX INFO: renamed from: g */
    public final C2460a f11328g;

    /* JADX INFO: renamed from: h */
    public final Handler f11329h;

    /* JADX INFO: renamed from: i */
    public final Runnable f11330i;

    /* JADX INFO: renamed from: j */
    public C2458h f11331j;

    /* JADX INFO: renamed from: k */
    public CastDevice f11332k;

    /* JADX INFO: renamed from: l */
    public MediaSessionCompat f11333l;

    /* JADX INFO: renamed from: m */
    public MediaSessionCompat.AbstractC0032b f11334m;

    /* JADX INFO: renamed from: n */
    public boolean f11335n;

    public C2470k(Context context, C2424b c2424b, BinderC3958p binderC3958p) {
        this.f11323b = context;
        this.f11324c = c2424b;
        this.f11325d = binderC3958p;
        C2444a c2444a = c2424b.f11157k;
        if (c2444a == null || TextUtils.isEmpty(c2444a.f11200h)) {
            this.f11326e = null;
        } else {
            this.f11326e = new ComponentName(context, c2424b.f11157k.f11200h);
        }
        C2460a c2460a = new C2460a(context);
        this.f11327f = c2460a;
        c2460a.f11316g = new C2472m(this);
        C2460a c2460a2 = new C2460a(context);
        this.f11328g = c2460a2;
        c2460a2.f11316g = new C2475p(this);
        this.f11329h = new HandlerC4025w(Looper.getMainLooper());
        this.f11330i = new Runnable(this) { // from class: c.n.b.d.d.r.l.i.n

            /* JADX INFO: renamed from: f */
            public final C2470k f11337f;

            {
                this.f11337f = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f11337f.m5102o(false);
            }
        };
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p291r.p292l.C2458h.b
    /* JADX INFO: renamed from: a */
    public final void mo5080a() {
        m5101n(false);
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p291r.p292l.C2458h.b
    /* JADX INFO: renamed from: b */
    public final void mo5081b() {
        m5101n(false);
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p291r.p292l.C2458h.b
    /* JADX INFO: renamed from: c */
    public final void mo5082c() {
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p291r.p292l.C2458h.b
    /* JADX INFO: renamed from: d */
    public final void mo5083d() {
        m5101n(false);
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p291r.p292l.C2458h.b
    /* JADX INFO: renamed from: e */
    public final void mo5084e() {
        m5101n(false);
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p291r.p292l.C2458h.b
    /* JADX INFO: renamed from: f */
    public final void mo5085f() {
        m5101n(false);
    }

    /* JADX INFO: renamed from: g */
    public final Uri m5094g(C2395i c2395i, int i) {
        C2708a c2708aM5039a;
        if (this.f11324c.f11157k.m5036H() != null) {
            c2708aM5039a = this.f11324c.f11157k.m5036H().m5039a(c2395i);
        } else {
            c2708aM5039a = c2395i.m4964L() ? c2395i.f11047h.get(0) : null;
        }
        if (c2708aM5039a == null) {
            return null;
        }
        return c2708aM5039a.f11776g;
    }

    /* JADX INFO: renamed from: h */
    public final void m5095h(int i, MediaInfo mediaInfo) {
        PendingIntent activity;
        MediaSessionCompat mediaSessionCompat = this.f11333l;
        if (mediaSessionCompat == null) {
            return;
        }
        if (i == 0) {
            PlaybackStateCompat.C0041b c0041b = new PlaybackStateCompat.C0041b();
            c0041b.m120b(0, 0L, 1.0f);
            mediaSessionCompat.f77c.mo69k(c0041b.m119a());
            this.f11333l.f77c.mo64f(new MediaMetadataCompat.C0023b().m26a());
            return;
        }
        PlaybackStateCompat.C0041b c0041b2 = new PlaybackStateCompat.C0041b();
        c0041b2.m120b(i, 0L, 1.0f);
        c0041b2.f132f = 512L;
        mediaSessionCompat.f77c.mo69k(c0041b2.m119a());
        MediaSessionCompat mediaSessionCompat2 = this.f11333l;
        if (this.f11326e == null) {
            activity = null;
        } else {
            Intent intent = new Intent();
            intent.setComponent(this.f11326e);
            activity = PendingIntent.getActivity(this.f11323b, 0, intent, 134217728);
        }
        mediaSessionCompat2.f77c.mo60b(activity);
        if (this.f11333l != null) {
            C2395i c2395i = mediaInfo.f28567i;
            MediaMetadataCompat.C0023b c0023bM5098k = m5098k();
            c0023bM5098k.m28c("android.media.metadata.TITLE", c2395i.m4963K("com.google.android.gms.cast.metadata.TITLE"));
            c0023bM5098k.m28c("android.media.metadata.DISPLAY_TITLE", c2395i.m4963K("com.google.android.gms.cast.metadata.TITLE"));
            c0023bM5098k.m28c("android.media.metadata.DISPLAY_SUBTITLE", c2395i.m4963K("com.google.android.gms.cast.metadata.SUBTITLE"));
            ArrayMap<String, Integer> arrayMap = MediaMetadataCompat.f57f;
            if ((arrayMap.m15608e("android.media.metadata.DURATION") >= 0) && arrayMap.getOrDefault("android.media.metadata.DURATION", null).intValue() != 0) {
                throw new IllegalArgumentException(outline.m1600v("The ", "android.media.metadata.DURATION", " key cannot be used to put a long"));
            }
            c0023bM5098k.f60a.putLong("android.media.metadata.DURATION", 0L);
            this.f11333l.f77c.mo64f(c0023bM5098k.m26a());
            Uri uriM5094g = m5094g(c2395i, 0);
            if (uriM5094g != null) {
                this.f11327f.m5091c(uriM5094g);
            } else {
                m5096i(null, 0);
            }
            Uri uriM5094g2 = m5094g(c2395i, 3);
            if (uriM5094g2 != null) {
                this.f11328g.m5091c(uriM5094g2);
            } else {
                m5096i(null, 3);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m5096i(Bitmap bitmap, int i) {
        MediaSessionCompat mediaSessionCompat = this.f11333l;
        if (mediaSessionCompat == null) {
            return;
        }
        if (i != 0) {
            if (i == 3) {
                MediaMetadataCompat.C0023b c0023bM5098k = m5098k();
                c0023bM5098k.m27b("android.media.metadata.ALBUM_ART", bitmap);
                mediaSessionCompat.f77c.mo64f(c0023bM5098k.m26a());
                return;
            }
            return;
        }
        if (bitmap != null) {
            MediaMetadataCompat.C0023b c0023bM5098k2 = m5098k();
            c0023bM5098k2.m27b("android.media.metadata.DISPLAY_ICON", bitmap);
            mediaSessionCompat.f77c.mo64f(c0023bM5098k2.m26a());
            return;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.eraseColor(0);
        MediaSessionCompat mediaSessionCompat2 = this.f11333l;
        MediaMetadataCompat.C0023b c0023bM5098k3 = m5098k();
        c0023bM5098k3.m27b("android.media.metadata.DISPLAY_ICON", bitmapCreateBitmap);
        mediaSessionCompat2.f77c.mo64f(c0023bM5098k3.m26a());
    }

    /* JADX INFO: renamed from: j */
    public final void m5097j(C2458h c2458h, CastDevice castDevice) {
        C2424b c2424b;
        if (this.f11335n || (c2424b = this.f11324c) == null || c2424b.f11157k == null || c2458h == null || castDevice == null) {
            return;
        }
        this.f11331j = c2458h;
        C2622l.m5354d("Must be called from the main thread.");
        c2458h.f11294h.add(this);
        this.f11332k = castDevice;
        ComponentName componentName = new ComponentName(this.f11323b, this.f11324c.f11157k.f11199g);
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setComponent(componentName);
        PendingIntent broadcast = PendingIntent.getBroadcast(this.f11323b, 0, intent, 0);
        if (this.f11324c.f11157k.f11204l) {
            this.f11333l = new MediaSessionCompat(this.f11323b, "CastMediaSession", componentName, broadcast);
            m5095h(0, null);
            CastDevice castDevice2 = this.f11332k;
            if (castDevice2 != null && !TextUtils.isEmpty(castDevice2.f28548i)) {
                MediaSessionCompat mediaSessionCompat = this.f11333l;
                MediaMetadataCompat.C0023b c0023b = new MediaMetadataCompat.C0023b();
                c0023b.m28c("android.media.metadata.ALBUM_ARTIST", this.f11323b.getResources().getString(R.string.cast_casting_to_device, this.f11332k.f28548i));
                mediaSessionCompat.f77c.mo64f(c0023b.m26a());
            }
            C2474o c2474o = new C2474o(this);
            this.f11334m = c2474o;
            this.f11333l.m45f(c2474o, null);
            this.f11333l.m44e(true);
            this.f11325d.m9182i1(this.f11333l);
        }
        this.f11335n = true;
        m5101n(false);
    }

    /* JADX INFO: renamed from: k */
    public final MediaMetadataCompat.C0023b m5098k() {
        MediaMetadata metadata;
        MediaSessionCompat mediaSessionCompat = this.f11333l;
        MediaMetadataCompat mediaMetadataCompatM25a = null;
        if (mediaSessionCompat != null && (metadata = ((MediaControllerCompat.MediaControllerImplApi21) mediaSessionCompat.f78d.f64a).f66a.getMetadata()) != null) {
            mediaMetadataCompatM25a = MediaMetadataCompat.m25a(metadata);
        }
        return mediaMetadataCompatM25a == null ? new MediaMetadataCompat.C0023b() : new MediaMetadataCompat.C0023b(mediaMetadataCompatM25a);
    }

    /* JADX INFO: renamed from: l */
    public final void m5099l() {
        if (this.f11324c.f11157k.f11202j == null) {
            return;
        }
        f11322a.m5119a("Stopping notification service.", new Object[0]);
        Intent intent = new Intent(this.f11323b, (Class<?>) MediaNotificationService.class);
        intent.setPackage(this.f11323b.getPackageName());
        intent.setAction("com.google.android.gms.cast.framework.action.UPDATE_NOTIFICATION");
        this.f11323b.stopService(intent);
    }

    /* JADX INFO: renamed from: m */
    public final void m5100m() {
        if (this.f11324c.f11158l) {
            this.f11329h.removeCallbacks(this.f11330i);
            Intent intent = new Intent(this.f11323b, (Class<?>) ReconnectionService.class);
            intent.setPackage(this.f11323b.getPackageName());
            this.f11323b.stopService(intent);
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e1  */
    /* JADX INFO: renamed from: n */
    public final void m5101n(boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        C2404l c2404lM5062c;
        MediaInfo mediaInfo;
        C2458h c2458h = this.f11331j;
        if (c2458h == null) {
            return;
        }
        MediaInfo mediaInfoM5063d = c2458h.m5063d();
        int i = 6;
        if (!this.f11331j.m5068i()) {
            if (this.f11331j.m5072m()) {
                i = 3;
            } else if (this.f11331j.m5071l()) {
                i = 2;
            } else if (!this.f11331j.m5070k() || (c2404lM5062c = this.f11331j.m5062c()) == null || (mediaInfo = c2404lM5062c.f11073f) == null) {
                i = 0;
            } else {
                mediaInfoM5063d = mediaInfo;
            }
        }
        if (mediaInfoM5063d == null || mediaInfoM5063d.f28567i == null) {
            i = 0;
        }
        m5095h(i, mediaInfoM5063d);
        if (!this.f11331j.m5067h()) {
            m5099l();
            m5100m();
            return;
        }
        if (i != 0) {
            if (this.f11332k != null) {
                C2424b c2424b = this.f11324c;
                C2518b c2518b = MediaNotificationService.f28601f;
                C2456g c2456g = c2424b.f11157k.f11202j;
                if (c2456g != null) {
                    InterfaceC2497y interfaceC2497y = c2456g.f11250M;
                    if (interfaceC2497y != null) {
                        List<C2452e> listM12649a = MediaNotificationService.m12649a(interfaceC2497y);
                        int[] iArrM12650b = MediaNotificationService.m12650b(interfaceC2497y);
                        if (listM12649a == null || listM12649a.isEmpty()) {
                            MediaNotificationService.f28601f.m5121c(AbstractC2454f.class.getSimpleName().concat(" doesn't provide any action."), new Object[0]);
                        } else {
                            if (listM12649a.size() > 5) {
                                MediaNotificationService.f28601f.m5121c(AbstractC2454f.class.getSimpleName().concat(" provides more than 5 actions."), new Object[0]);
                            } else {
                                z5 = true;
                            }
                            if (z5) {
                                int size = listM12649a.size();
                                if (iArrM12650b == null || iArrM12650b.length == 0) {
                                    MediaNotificationService.f28601f.m5121c(AbstractC2454f.class.getSimpleName().concat(" doesn't provide any actions for compact view."), new Object[0]);
                                } else {
                                    int length = iArrM12650b.length;
                                    int i2 = 0;
                                    while (true) {
                                        if (i2 >= length) {
                                            z6 = true;
                                            break;
                                        }
                                        int i3 = iArrM12650b[i2];
                                        if (i3 < 0 || i3 >= size) {
                                            MediaNotificationService.f28601f.m5121c(AbstractC2454f.class.getSimpleName().concat("provides a compact view action whose index is out of bounds."), new Object[0]);
                                        } else {
                                            i2++;
                                        }
                                    }
                                    if (z6) {
                                    }
                                }
                                z6 = false;
                                if (z6) {
                                }
                            }
                            z2 = false;
                        }
                        z5 = false;
                        if (z5) {
                            int size2 = listM12649a.size();
                            if (iArrM12650b == null) {
                                MediaNotificationService.f28601f.m5121c(AbstractC2454f.class.getSimpleName().concat(" doesn't provide any actions for compact view."), new Object[0]);
                                z6 = false;
                                break;
                            } else {
                                MediaNotificationService.f28601f.m5121c(AbstractC2454f.class.getSimpleName().concat(" doesn't provide any actions for compact view."), new Object[0]);
                                z6 = false;
                                break;
                            }
                            if (z6) {
                            }
                        }
                        z2 = false;
                    }
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    Intent intent = new Intent(this.f11323b, (Class<?>) MediaNotificationService.class);
                    intent.putExtra("extra_media_notification_force_update", z);
                    intent.setPackage(this.f11323b.getPackageName());
                    intent.setAction("com.google.android.gms.cast.framework.action.UPDATE_NOTIFICATION");
                    intent.putExtra("extra_media_info", this.f11331j.m5063d());
                    intent.putExtra("extra_remote_media_client_player_state", this.f11331j.m5065f());
                    intent.putExtra("extra_cast_device", this.f11332k);
                    MediaSessionCompat mediaSessionCompat = this.f11333l;
                    if (mediaSessionCompat != null) {
                        intent.putExtra("extra_media_session_token", mediaSessionCompat.m42b());
                    }
                    C2410n c2410nM5064e = this.f11331j.m5064e();
                    int i4 = c2410nM5064e.f11110u;
                    if (i4 == 1 || i4 == 2 || i4 == 3) {
                        z3 = true;
                        z4 = true;
                    } else {
                        Integer num = c2410nM5064e.f11094B.get(c2410nM5064e.f11097h);
                        if (num != null) {
                            z4 = num.intValue() > 0;
                            z3 = num.intValue() < c2410nM5064e.f11111v.size() - 1;
                        } else {
                            z3 = false;
                            z4 = false;
                        }
                    }
                    intent.putExtra("extra_can_skip_next", z3);
                    intent.putExtra("extra_can_skip_prev", z4);
                    f11322a.m5119a("Starting notification service.", new Object[0]);
                    if (Build.VERSION.SDK_INT >= 26) {
                        this.f11323b.startForegroundService(intent);
                    } else {
                        this.f11323b.startService(intent);
                    }
                }
            }
            if (this.f11331j.m5070k()) {
                return;
            }
            m5102o(true);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m5102o(boolean z) {
        if (this.f11324c.f11158l) {
            this.f11329h.removeCallbacks(this.f11330i);
            Intent intent = new Intent(this.f11323b, (Class<?>) ReconnectionService.class);
            intent.setPackage(this.f11323b.getPackageName());
            try {
                this.f11323b.startService(intent);
            } catch (IllegalStateException unused) {
                if (z) {
                    this.f11329h.postDelayed(this.f11330i, 1000L);
                }
            }
        }
    }
}
