package p007c.p085g.p086a.p105n;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import java.util.ArrayList;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p007c.p085g.p086a.RequestManager;
import p007c.p085g.p086a.p108q.Request2;
import p007c.p085g.p086a.p112s.Util4;

/* JADX INFO: renamed from: c.g.a.n.e, reason: use source file name */
/* JADX INFO: compiled from: DefaultConnectivityMonitor.java */
/* JADX INFO: loaded from: classes.dex */
public final class DefaultConnectivityMonitor implements ConnectivityMonitor {

    /* JADX INFO: renamed from: f */
    public final Context f3672f;

    /* JADX INFO: renamed from: g */
    public final ConnectivityMonitor.a f3673g;

    /* JADX INFO: renamed from: h */
    public boolean f3674h;

    /* JADX INFO: renamed from: i */
    public boolean f3675i;

    /* JADX INFO: renamed from: j */
    public final BroadcastReceiver f3676j = new a();

    /* JADX INFO: renamed from: c.g.a.n.e$a */
    /* JADX INFO: compiled from: DefaultConnectivityMonitor.java */
    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            DefaultConnectivityMonitor defaultConnectivityMonitor = DefaultConnectivityMonitor.this;
            boolean z = defaultConnectivityMonitor.f3674h;
            defaultConnectivityMonitor.f3674h = defaultConnectivityMonitor.m1942k(context);
            if (z != DefaultConnectivityMonitor.this.f3674h) {
                if (Log.isLoggable("ConnectivityMonitor", 3)) {
                    StringBuilder sbM1556G = outline.m1556G("connectivity changed, isConnected: ");
                    sbM1556G.append(DefaultConnectivityMonitor.this.f3674h);
                    Log.d("ConnectivityMonitor", sbM1556G.toString());
                }
                DefaultConnectivityMonitor defaultConnectivityMonitor2 = DefaultConnectivityMonitor.this;
                ConnectivityMonitor.a aVar = defaultConnectivityMonitor2.f3673g;
                boolean z2 = defaultConnectivityMonitor2.f3674h;
                RequestManager.b bVar = (RequestManager.b) aVar;
                Objects.requireNonNull(bVar);
                if (z2) {
                    synchronized (RequestManager.this) {
                        RequestTracker requestTracker = bVar.f2929a;
                        for (Request2 request2 : (ArrayList) Util4.m2050e(requestTracker.f3691a)) {
                            if (!request2.mo1995d() && !request2.mo1993b()) {
                                request2.clear();
                                if (requestTracker.f3693c) {
                                    requestTracker.f3692b.add(request2);
                                } else {
                                    request2.mo1994c();
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public DefaultConnectivityMonitor(Context context, ConnectivityMonitor.a aVar) {
        this.f3672f = context.getApplicationContext();
        this.f3673g = aVar;
    }

    @Override // p007c.p085g.p086a.p105n.LifecycleListener
    /* JADX INFO: renamed from: e */
    public void mo1649e() {
        if (this.f3675i) {
            this.f3672f.unregisterReceiver(this.f3676j);
            this.f3675i = false;
        }
    }

    @Override // p007c.p085g.p086a.p105n.LifecycleListener
    /* JADX INFO: renamed from: j */
    public void mo1650j() {
        if (this.f3675i) {
            return;
        }
        this.f3674h = m1942k(this.f3672f);
        try {
            this.f3672f.registerReceiver(this.f3676j, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f3675i = true;
        } catch (SecurityException e) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to register", e);
            }
        }
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: k */
    public boolean m1942k(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        Objects.requireNonNull(connectivityManager, "Argument must not be null");
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (RuntimeException e) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e);
            }
            return true;
        }
    }

    @Override // p007c.p085g.p086a.p105n.LifecycleListener
    public void onDestroy() {
    }
}
