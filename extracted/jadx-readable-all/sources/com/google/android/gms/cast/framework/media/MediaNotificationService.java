package com.google.android.gms.cast.framework.media;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p290d.C2395i;
import p007c.p190n.p194b.p266d.p290d.p291r.C2422a;
import p007c.p190n.p194b.p266d.p290d.p291r.p292l.C2444a;
import p007c.p190n.p194b.p266d.p290d.p291r.p292l.C2446b;
import p007c.p190n.p194b.p266d.p290d.p291r.p292l.C2448c;
import p007c.p190n.p194b.p266d.p290d.p291r.p292l.C2451d0;
import p007c.p190n.p194b.p266d.p290d.p291r.p292l.C2452e;
import p007c.p190n.p194b.p266d.p290d.p291r.p292l.C2453e0;
import p007c.p190n.p194b.p266d.p290d.p291r.p292l.C2456g;
import p007c.p190n.p194b.p266d.p290d.p291r.p292l.InterfaceC2497y;
import p007c.p190n.p194b.p266d.p290d.p291r.p292l.p293i.C2460a;
import p007c.p190n.p194b.p266d.p290d.p295s.C2516a;
import p007c.p190n.p194b.p266d.p290d.p295s.C2518b;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p301p.C2708a;
import p636z0.p725k.p726c.C8172i;
import p636z0.p725k.p726c.C8176m;
import p636z0.p765v.p766e.C8411a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class MediaNotificationService extends Service {

    /* JADX INFO: renamed from: f */
    public static final C2518b f28601f = new C2518b("MediaNotificationService");

    /* JADX INFO: renamed from: g */
    public C2456g f28602g;

    /* JADX INFO: renamed from: h */
    public C2448c f28603h;

    /* JADX INFO: renamed from: i */
    public ComponentName f28604i;

    /* JADX INFO: renamed from: j */
    public ComponentName f28605j;

    /* JADX INFO: renamed from: l */
    public int[] f28607l;

    /* JADX INFO: renamed from: m */
    public long f28608m;

    /* JADX INFO: renamed from: n */
    public C2460a f28609n;

    /* JADX INFO: renamed from: o */
    public C2446b f28610o;

    /* JADX INFO: renamed from: p */
    public Resources f28611p;

    /* JADX INFO: renamed from: q */
    public C5892a f28612q;

    /* JADX INFO: renamed from: r */
    public C5893b f28613r;

    /* JADX INFO: renamed from: s */
    public NotificationManager f28614s;

    /* JADX INFO: renamed from: t */
    public Notification f28615t;

    /* JADX INFO: renamed from: u */
    public C2422a f28616u;

    /* JADX INFO: renamed from: k */
    public List<C8172i> f28606k = new ArrayList();

    /* JADX INFO: renamed from: v */
    public final BroadcastReceiver f28617v = new C2451d0(this);

    /* JADX INFO: renamed from: com.google.android.gms.cast.framework.media.MediaNotificationService$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
    public static class C5892a {

        /* JADX INFO: renamed from: a */
        public final MediaSessionCompat.Token f28618a;

        /* JADX INFO: renamed from: b */
        public final boolean f28619b;

        /* JADX INFO: renamed from: c */
        public final int f28620c;

        /* JADX INFO: renamed from: d */
        public final String f28621d;

        /* JADX INFO: renamed from: e */
        public final String f28622e;

        /* JADX INFO: renamed from: f */
        public final boolean f28623f;

        /* JADX INFO: renamed from: g */
        public final boolean f28624g;

        public C5892a(boolean z, int i, String str, String str2, MediaSessionCompat.Token token, boolean z2, boolean z3) {
            this.f28619b = z;
            this.f28620c = i;
            this.f28621d = str;
            this.f28622e = str2;
            this.f28618a = token;
            this.f28623f = z2;
            this.f28624g = z3;
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.cast.framework.media.MediaNotificationService$b */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
    public static class C5893b {

        /* JADX INFO: renamed from: a */
        public final Uri f28625a;

        /* JADX INFO: renamed from: b */
        public Bitmap f28626b;

        public C5893b(C2708a c2708a) {
            this.f28625a = c2708a == null ? null : c2708a.f11776g;
        }
    }

    /* JADX INFO: renamed from: a */
    public static List<C2452e> m12649a(InterfaceC2497y interfaceC2497y) {
        try {
            return interfaceC2497y.mo5038v1();
        } catch (RemoteException e) {
            C2518b c2518b = f28601f;
            Log.e(c2518b.f11373a, c2518b.m5123e("Unable to call %s on %s.", "getNotificationActions", InterfaceC2497y.class.getSimpleName()), e);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static int[] m12650b(InterfaceC2497y interfaceC2497y) {
        try {
            return interfaceC2497y.mo5037O3();
        } catch (RemoteException e) {
            C2518b c2518b = f28601f;
            Log.e(c2518b.f11373a, c2518b.m5123e("Unable to call %s on %s.", "getCompactViewActionIndices", InterfaceC2497y.class.getSimpleName()), e);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m12651c() {
        C8172i c8172iM16087a;
        if (this.f28612q == null) {
            return;
        }
        C5893b c5893b = this.f28613r;
        PendingIntent broadcast = null;
        Bitmap bitmap = c5893b == null ? null : c5893b.f28626b;
        C8176m c8176m = new C8176m(this, "cast_media_notification");
        c8176m.m16111h(bitmap);
        c8176m.f37736N.icon = this.f28602g.f11255l;
        c8176m.m16109f(this.f28612q.f28621d);
        c8176m.m16108e(this.f28611p.getString(this.f28602g.f11269z, this.f28612q.f28622e));
        c8176m.m16110g(2, true);
        c8176m.f37751m = false;
        c8176m.f37727E = 1;
        if (this.f28605j != null) {
            Intent intent = new Intent();
            intent.putExtra("targetActivity", this.f28605j);
            intent.setAction(this.f28605j.flattenToString());
            broadcast = PendingIntent.getBroadcast(this, 1, intent, 134217728);
        }
        if (broadcast != null) {
            c8176m.f37745g = broadcast;
        }
        InterfaceC2497y interfaceC2497y = this.f28602g.f11250M;
        if (interfaceC2497y != null) {
            C2518b c2518b = f28601f;
            Log.i(c2518b.f11373a, c2518b.m5123e("actionsProvider != null", new Object[0]));
            this.f28607l = (int[]) m12650b(interfaceC2497y).clone();
            List<C2452e> listM12649a = m12649a(interfaceC2497y);
            this.f28606k = new ArrayList();
            for (C2452e c2452e : listM12649a) {
                String str = c2452e.f11228f;
                if (str.equals(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK) || str.equals(MediaIntentReceiver.ACTION_SKIP_NEXT) || str.equals(MediaIntentReceiver.ACTION_SKIP_PREV) || str.equals(MediaIntentReceiver.ACTION_FORWARD) || str.equals(MediaIntentReceiver.ACTION_REWIND) || str.equals(MediaIntentReceiver.ACTION_STOP_CASTING)) {
                    c8172iM16087a = m12652d(c2452e.f11228f);
                } else {
                    Intent intent2 = new Intent(c2452e.f11228f);
                    intent2.setComponent(this.f28604i);
                    c8172iM16087a = new C8172i.a(c2452e.f11229g, c2452e.f11230h, PendingIntent.getBroadcast(this, 0, intent2, 0)).m16087a();
                }
                this.f28606k.add(c8172iM16087a);
            }
        } else {
            C2518b c2518b2 = f28601f;
            Log.i(c2518b2.f11373a, c2518b2.m5123e("actionsProvider == null", new Object[0]));
            this.f28606k = new ArrayList();
            Iterator<String> it = this.f28602g.f11251h.iterator();
            while (it.hasNext()) {
                this.f28606k.add(m12652d(it.next()));
            }
            int[] iArr = this.f28602g.f11252i;
            this.f28607l = (int[]) Arrays.copyOf(iArr, iArr.length).clone();
        }
        for (C8172i c8172i : this.f28606k) {
            if (c8172i != null) {
                c8176m.f37740b.add(c8172i);
            }
        }
        C8411a c8411a = new C8411a();
        c8411a.f38803e = this.f28607l;
        c8411a.f38804f = this.f28612q.f28618a;
        c8176m.m16114k(c8411a);
        this.f28615t = c8176m.m16106b();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX INFO: renamed from: d */
    public final C8172i m12652d(String str) {
        byte b;
        int i;
        int i2;
        str.hashCode();
        switch (str) {
            case "com.google.android.gms.cast.framework.action.REWIND":
                b = 0;
                break;
            case "com.google.android.gms.cast.framework.action.SKIP_NEXT":
                b = 1;
                break;
            case "com.google.android.gms.cast.framework.action.SKIP_PREV":
                b = 2;
                break;
            case "com.google.android.gms.cast.framework.action.STOP_CASTING":
                b = 3;
                break;
            case "com.google.android.gms.cast.framework.action.DISCONNECT":
                b = 4;
                break;
            case "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK":
                b = 5;
                break;
            case "com.google.android.gms.cast.framework.action.FORWARD":
                b = 6;
                break;
            default:
                b = -1;
                break;
        }
        PendingIntent broadcast = null;
        switch (b) {
            case 0:
                long j2 = this.f28608m;
                Intent intent = new Intent(MediaIntentReceiver.ACTION_REWIND);
                intent.setComponent(this.f28604i);
                intent.putExtra(MediaIntentReceiver.EXTRA_SKIP_STEP_MS, j2);
                PendingIntent broadcast2 = PendingIntent.getBroadcast(this, 0, intent, 134217728);
                C2456g c2456g = this.f28602g;
                int i3 = c2456g.f11264u;
                int i4 = c2456g.f11246I;
                if (j2 == 10000) {
                    i3 = c2456g.f11265v;
                    i4 = c2456g.f11247J;
                } else if (j2 == 30000) {
                    i3 = c2456g.f11266w;
                    i4 = c2456g.f11248K;
                }
                return new C8172i.a(i3, this.f28611p.getString(i4), broadcast2).m16087a();
            case 1:
                if (this.f28612q.f28623f) {
                    Intent intent2 = new Intent(MediaIntentReceiver.ACTION_SKIP_NEXT);
                    intent2.setComponent(this.f28604i);
                    broadcast = PendingIntent.getBroadcast(this, 0, intent2, 0);
                }
                C2456g c2456g2 = this.f28602g;
                return new C8172i.a(c2456g2.f11259p, this.f28611p.getString(c2456g2.f11241D), broadcast).m16087a();
            case 2:
                if (this.f28612q.f28624g) {
                    Intent intent3 = new Intent(MediaIntentReceiver.ACTION_SKIP_PREV);
                    intent3.setComponent(this.f28604i);
                    broadcast = PendingIntent.getBroadcast(this, 0, intent3, 0);
                }
                C2456g c2456g3 = this.f28602g;
                return new C8172i.a(c2456g3.f11260q, this.f28611p.getString(c2456g3.f11242E), broadcast).m16087a();
            case 3:
            case 4:
                Intent intent4 = new Intent(MediaIntentReceiver.ACTION_STOP_CASTING);
                intent4.setComponent(this.f28604i);
                PendingIntent broadcast3 = PendingIntent.getBroadcast(this, 0, intent4, 0);
                C2456g c2456g4 = this.f28602g;
                return new C8172i.a(c2456g4.f11267x, this.f28611p.getString(c2456g4.f11249L), broadcast3).m16087a();
            case 5:
                C5892a c5892a = this.f28612q;
                int i5 = c5892a.f28620c;
                boolean z = c5892a.f28619b;
                if (i5 == 2) {
                    C2456g c2456g5 = this.f28602g;
                    i = c2456g5.f11256m;
                    i2 = c2456g5.f11238A;
                } else {
                    C2456g c2456g6 = this.f28602g;
                    i = c2456g6.f11257n;
                    i2 = c2456g6.f11239B;
                }
                if (!z) {
                    i = this.f28602g.f11258o;
                }
                if (!z) {
                    i2 = this.f28602g.f11240C;
                }
                Intent intent5 = new Intent(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK);
                intent5.setComponent(this.f28604i);
                return new C8172i.a(i, this.f28611p.getString(i2), PendingIntent.getBroadcast(this, 0, intent5, 0)).m16087a();
            case 6:
                long j3 = this.f28608m;
                Intent intent6 = new Intent(MediaIntentReceiver.ACTION_FORWARD);
                intent6.setComponent(this.f28604i);
                intent6.putExtra(MediaIntentReceiver.EXTRA_SKIP_STEP_MS, j3);
                PendingIntent broadcast4 = PendingIntent.getBroadcast(this, 0, intent6, 134217728);
                C2456g c2456g7 = this.f28602g;
                int i6 = c2456g7.f11261r;
                int i7 = c2456g7.f11243F;
                if (j3 == 10000) {
                    i6 = c2456g7.f11262s;
                    i7 = c2456g7.f11244G;
                } else if (j3 == 30000) {
                    i6 = c2456g7.f11263t;
                    i7 = c2456g7.f11245H;
                }
                return new C8172i.a(i6, this.f28611p.getString(i7), broadcast4).m16087a();
            default:
                C2518b c2518b = f28601f;
                Log.e(c2518b.f11373a, c2518b.m5123e("Action: %s is not a pre-defined action.", str));
                return null;
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f28614s = (NotificationManager) getSystemService("notification");
        C2422a c2422aM4995a = C2422a.m4995a(this);
        this.f28616u = c2422aM4995a;
        Objects.requireNonNull(c2422aM4995a);
        C2622l.m5354d("Must be called from the main thread.");
        C2444a c2444a = c2422aM4995a.f11147g.f11157k;
        this.f28602g = c2444a.f11202j;
        this.f28603h = c2444a.m5036H();
        this.f28611p = getResources();
        this.f28604i = new ComponentName(getApplicationContext(), c2444a.f11199g);
        if (TextUtils.isEmpty(this.f28602g.f11254k)) {
            this.f28605j = null;
        } else {
            this.f28605j = new ComponentName(getApplicationContext(), this.f28602g.f11254k);
        }
        C2456g c2456g = this.f28602g;
        this.f28608m = c2456g.f11253j;
        int dimensionPixelSize = this.f28611p.getDimensionPixelSize(c2456g.f11268y);
        this.f28610o = new C2446b(1, dimensionPixelSize, dimensionPixelSize);
        this.f28609n = new C2460a(getApplicationContext(), this.f28610o);
        if (this.f28605j != null) {
            registerReceiver(this.f28617v, new IntentFilter(this.f28605j.flattenToString()));
        }
        if (C2622l.m5464z()) {
            NotificationChannel notificationChannel = new NotificationChannel("cast_media_notification", "Cast", 2);
            notificationChannel.setShowBadge(false);
            this.f28614s.createNotificationChannel(notificationChannel);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        C2460a c2460a = this.f28609n;
        if (c2460a != null) {
            c2460a.m5089a();
        }
        if (this.f28605j != null) {
            try {
                unregisterReceiver(this.f28617v);
            } catch (IllegalArgumentException e) {
                C2518b c2518b = f28601f;
                Log.e(c2518b.f11373a, c2518b.m5123e("Unregistering trampoline BroadcastReceiver failed", new Object[0]), e);
            }
        }
        this.f28614s.cancel(1);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x008a  */
    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        C2708a c2708aM5039a;
        MediaInfo mediaInfo = (MediaInfo) intent.getParcelableExtra("extra_media_info");
        C2395i c2395i = mediaInfo.f28567i;
        boolean z = false;
        C5892a c5892a = new C5892a(intent.getIntExtra("extra_remote_media_client_player_state", 0) == 2, mediaInfo.f28565g, c2395i.m4963K("com.google.android.gms.cast.metadata.TITLE"), ((CastDevice) intent.getParcelableExtra("extra_cast_device")).f28548i, (MediaSessionCompat.Token) intent.getParcelableExtra("extra_media_session_token"), intent.getBooleanExtra("extra_can_skip_next", false), intent.getBooleanExtra("extra_can_skip_prev", false));
        if (intent.getBooleanExtra("extra_media_notification_force_update", false)) {
            this.f28612q = c5892a;
            m12651c();
        } else {
            C5892a c5892a2 = this.f28612q;
            if (!(c5892a2 != null && c5892a.f28619b == c5892a2.f28619b && c5892a.f28620c == c5892a2.f28620c && C2516a.m5114d(c5892a.f28621d, c5892a2.f28621d) && C2516a.m5114d(c5892a.f28622e, c5892a2.f28622e) && c5892a.f28623f == c5892a2.f28623f && c5892a.f28624g == c5892a2.f28624g)) {
                this.f28612q = c5892a;
                m12651c();
            }
        }
        C2448c c2448c = this.f28603h;
        if (c2448c != null) {
            int i3 = this.f28610o.f11208f;
            c2708aM5039a = c2448c.m5039a(c2395i);
        } else {
            c2708aM5039a = c2395i.m4964L() ? c2395i.f11047h.get(0) : null;
        }
        C5893b c5893b = new C5893b(c2708aM5039a);
        C5893b c5893b2 = this.f28613r;
        if (c5893b2 != null && C2516a.m5114d(c5893b.f28625a, c5893b2.f28625a)) {
            z = true;
        }
        if (!z) {
            C2460a c2460a = this.f28609n;
            c2460a.f11316g = new C2453e0(this, c5893b);
            c2460a.m5091c(c5893b.f28625a);
        }
        startForeground(1, this.f28615t);
        return 2;
    }
}
