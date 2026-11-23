package p007c.p190n.p385d.p428w;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import p007c.p190n.p385d.p418r.C5491q;

/* JADX INFO: renamed from: c.n.d.w.d0 */
/* JADX INFO: compiled from: com.google.firebase:firebase-messaging@@21.0.1 */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC5539d0 implements Runnable {

    /* JADX INFO: renamed from: f */
    public static final Object f27253f = new Object();

    /* JADX INFO: renamed from: g */
    public static Boolean f27254g;

    /* JADX INFO: renamed from: h */
    public static Boolean f27255h;

    /* JADX INFO: renamed from: i */
    public final Context f27256i;

    /* JADX INFO: renamed from: j */
    public final C5491q f27257j;

    /* JADX INFO: renamed from: k */
    public final PowerManager.WakeLock f27258k;

    /* JADX INFO: renamed from: l */
    public final C5537c0 f27259l;

    /* JADX INFO: renamed from: m */
    public final long f27260m;

    /* JADX INFO: renamed from: c.n.d.w.d0$a */
    /* JADX INFO: compiled from: com.google.firebase:firebase-messaging@@21.0.1 */
    public class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a */
        public RunnableC5539d0 f27261a;

        public a(RunnableC5539d0 runnableC5539d0) {
            this.f27261a = runnableC5539d0;
        }

        /* JADX INFO: renamed from: a */
        public void m12180a() {
            if (RunnableC5539d0.m12175a()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            RunnableC5539d0.this.f27256i.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(Context context, Intent intent) {
            RunnableC5539d0 runnableC5539d0 = this.f27261a;
            if (runnableC5539d0 == null) {
                return;
            }
            Object obj = RunnableC5539d0.f27253f;
            if (runnableC5539d0.m12179e()) {
                if (RunnableC5539d0.m12175a()) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                RunnableC5539d0 runnableC5539d1 = this.f27261a;
                runnableC5539d1.f27259l.f27247h.schedule(runnableC5539d1, 0L, TimeUnit.SECONDS);
                context.unregisterReceiver(this);
                this.f27261a = null;
            }
        }
    }

    public RunnableC5539d0(C5537c0 c5537c0, Context context, C5491q c5491q, long j2) {
        this.f27259l = c5537c0;
        this.f27256i = context;
        this.f27260m = j2;
        this.f27257j = c5491q;
        this.f27258k = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    /* JADX INFO: renamed from: a */
    public static boolean m12175a() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    /* JADX INFO: renamed from: b */
    public static boolean m12176b(Context context) {
        boolean zBooleanValue;
        synchronized (f27253f) {
            Boolean bool = f27255h;
            Boolean boolValueOf = Boolean.valueOf(bool == null ? m12177c(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
            f27255h = boolValueOf;
            zBooleanValue = boolValueOf.booleanValue();
        }
        return zBooleanValue;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m12177c(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = context.checkCallingOrSelfPermission(str) == 0;
        if (z || !Log.isLoggable("FirebaseMessaging", 3)) {
            return z;
        }
        StringBuilder sb = new StringBuilder(str.length() + 142);
        sb.append("Missing Permission: ");
        sb.append(str);
        sb.append(". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        Log.d("FirebaseMessaging", sb.toString());
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m12178d(Context context) {
        boolean zBooleanValue;
        synchronized (f27253f) {
            Boolean bool = f27254g;
            Boolean boolValueOf = Boolean.valueOf(bool == null ? m12177c(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
            f27254g = boolValueOf;
            zBooleanValue = boolValueOf.booleanValue();
        }
        return zBooleanValue;
    }

    /* JADX INFO: renamed from: e */
    public final synchronized boolean m12179e() {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f27256i.getSystemService("connectivity");
        activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override // java.lang.Runnable
    @SuppressLint({"Wakelock"})
    public void run() {
        if (m12178d(this.f27256i)) {
            this.f27258k.acquire(C5534b.f27231a);
        }
        try {
            this.f27259l.m12172e(true);
            if (!this.f27257j.m12076d()) {
                this.f27259l.m12172e(false);
            } else if (m12176b(this.f27256i) && !m12179e()) {
                new a(this).m12180a();
            } else {
                if (this.f27259l.m12173f()) {
                    this.f27259l.m12172e(false);
                } else {
                    this.f27259l.m12174g(this.f27260m);
                }
            }
        } catch (IOException e) {
            String strValueOf = String.valueOf(e.getMessage());
            Log.e("FirebaseMessaging", strValueOf.length() != 0 ? "Failed to sync topics. Won't retry sync. ".concat(strValueOf) : new String("Failed to sync topics. Won't retry sync. "));
            this.f27259l.m12172e(false);
        } finally {
            if (m12178d(this.f27256i)) {
                try {
                    this.f27258k.release();
                } catch (RuntimeException unused) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            }
        }
    }
}
