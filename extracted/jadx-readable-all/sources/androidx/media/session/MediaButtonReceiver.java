package androidx.media.session;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.util.Log;
import android.view.KeyEvent;
import java.util.List;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: loaded from: classes.dex */
public class MediaButtonReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f809a = 0;

    /* JADX INFO: renamed from: androidx.media.session.MediaButtonReceiver$a */
    public static class C0131a extends MediaBrowserCompat.C0011b {

        /* JADX INFO: renamed from: c */
        public final Context f810c;

        /* JADX INFO: renamed from: d */
        public final Intent f811d;

        /* JADX INFO: renamed from: e */
        public final BroadcastReceiver.PendingResult f812e;

        /* JADX INFO: renamed from: f */
        public MediaBrowserCompat f813f;

        public C0131a(Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
            this.f810c = context;
            this.f811d = intent;
            this.f812e = pendingResult;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.C0011b
        /* JADX INFO: renamed from: a */
        public void mo13a() {
            MediaControllerCompat mediaControllerCompat = new MediaControllerCompat(this.f810c, this.f813f.f17b.mo18L());
            KeyEvent keyEvent = (KeyEvent) this.f811d.getParcelableExtra("android.intent.extra.KEY_EVENT");
            if (keyEvent == null) {
                throw new IllegalArgumentException("KeyEvent may not be null");
            }
            ((MediaControllerCompat.MediaControllerImplApi21) mediaControllerCompat.f64a).m30a(keyEvent);
            m445d();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.C0011b
        /* JADX INFO: renamed from: b */
        public void mo14b() {
            m445d();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.C0011b
        /* JADX INFO: renamed from: c */
        public void mo15c() {
            m445d();
        }

        /* JADX INFO: renamed from: d */
        public final void m445d() {
            this.f813f.f17b.mo16J();
            this.f812e.finish();
        }
    }

    /* JADX INFO: renamed from: a */
    public static ComponentName m444a(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (listQueryIntentServices.size() == 1) {
            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
            return new ComponentName(serviceInfo.packageName, serviceInfo.name);
        }
        if (listQueryIntentServices.isEmpty()) {
            return null;
        }
        StringBuilder sbM1562M = outline.m1562M("Expected 1 service that handles ", str, ", found ");
        sbM1562M.append(listQueryIntentServices.size());
        throw new IllegalStateException(sbM1562M.toString());
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            Log.d("MediaButtonReceiver", "Ignore unsupported intent: " + intent);
            return;
        }
        ComponentName componentNameM444a = m444a(context, "android.intent.action.MEDIA_BUTTON");
        if (componentNameM444a != null) {
            intent.setComponent(componentNameM444a);
            if (Build.VERSION.SDK_INT >= 26) {
                context.startForegroundService(intent);
                return;
            } else {
                context.startService(intent);
                return;
            }
        }
        ComponentName componentNameM444a2 = m444a(context, "android.media.browse.MediaBrowserService");
        if (componentNameM444a2 == null) {
            throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
        }
        BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
        Context applicationContext = context.getApplicationContext();
        C0131a c0131a = new C0131a(applicationContext, intent, pendingResultGoAsync);
        MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(applicationContext, componentNameM444a2, c0131a, null);
        c0131a.f813f = mediaBrowserCompat;
        Log.d("MediaBrowserCompat", "Connecting to a MediaBrowserService.");
        mediaBrowserCompat.f17b.mo17K();
    }
}
