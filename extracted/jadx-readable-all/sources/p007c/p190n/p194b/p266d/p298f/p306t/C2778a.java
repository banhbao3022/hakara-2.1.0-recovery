package p007c.p190n.p194b.p266d.p298f.p306t;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import p007c.p190n.p194b.p266d.p298f.p302q.ServiceConnectionC2716b1;
import p007c.p190n.p194b.p266d.p298f.p309v.C2794c;

/* JADX INFO: renamed from: c.n.b.d.f.t.a */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public class C2778a {

    /* JADX INFO: renamed from: a */
    public static final Object f11940a = new Object();

    /* JADX INFO: renamed from: b */
    public static volatile C2778a f11941b;

    /* JADX INFO: renamed from: c */
    @RecentlyNonNull
    public ConcurrentHashMap<ServiceConnection, ServiceConnection> f11942c = new ConcurrentHashMap<>();

    @RecentlyNonNull
    /* JADX INFO: renamed from: b */
    public static C2778a m5615b() {
        if (f11941b == null) {
            synchronized (f11940a) {
                if (f11941b == null) {
                    f11941b = new C2778a();
                }
            }
        }
        C2778a c2778a = f11941b;
        Objects.requireNonNull(c2778a, "null reference");
        return c2778a;
    }

    /* JADX INFO: renamed from: a */
    public boolean m5616a(@RecentlyNonNull Context context, @RecentlyNonNull Intent intent, @RecentlyNonNull ServiceConnection serviceConnection, int i) {
        return m5618d(context, context.getClass().getName(), intent, serviceConnection, i, true);
    }

    @SuppressLint({"UntrackedBindService"})
    /* JADX INFO: renamed from: c */
    public void m5617c(@RecentlyNonNull Context context, @RecentlyNonNull ServiceConnection serviceConnection) {
        if (!(!(serviceConnection instanceof ServiceConnectionC2716b1)) || !this.f11942c.containsKey(serviceConnection)) {
            try {
                context.unbindService(serviceConnection);
            } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
            }
        } else {
            try {
                try {
                    context.unbindService(this.f11942c.get(serviceConnection));
                } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused2) {
                }
            } finally {
                this.f11942c.remove(serviceConnection);
            }
        }
    }

    @SuppressLint({"UntrackedBindService"})
    /* JADX INFO: renamed from: d */
    public final boolean m5618d(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i, boolean z) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((C2794c.m5637a(context).m5633a(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (!(!(serviceConnection instanceof ServiceConnectionC2716b1))) {
            return context.bindService(intent, serviceConnection, i);
        }
        ServiceConnection serviceConnectionPutIfAbsent = this.f11942c.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnectionPutIfAbsent != null && serviceConnection != serviceConnectionPutIfAbsent) {
            Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
        }
        try {
            boolean zBindService = context.bindService(intent, serviceConnection, i);
            if (zBindService) {
                return zBindService;
            }
            this.f11942c.remove(serviceConnection, serviceConnection);
            return false;
        } catch (Throwable th) {
            this.f11942c.remove(serviceConnection, serviceConnection);
            throw th;
        }
    }
}
