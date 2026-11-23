package p636z0.p709j0.p710y.p715q.p717f;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import p636z0.p709j0.Logger9;
import p636z0.p709j0.p710y.p715q.NetworkState;
import p636z0.p709j0.p710y.p720t.p722t.TaskExecutor2;

/* JADX INFO: renamed from: z0.j0.y.q.f.e, reason: use source file name */
/* JADX INFO: compiled from: NetworkStateTracker.java */
/* JADX INFO: loaded from: classes.dex */
public class NetworkStateTracker extends ConstraintTracker<NetworkState> {

    /* JADX INFO: renamed from: g */
    public static final String f37470g = Logger9.m15886e("NetworkStateTracker");

    /* JADX INFO: renamed from: h */
    public final ConnectivityManager f37471h;

    /* JADX INFO: renamed from: i */
    public b f37472i;

    /* JADX INFO: renamed from: j */
    public a f37473j;

    /* JADX INFO: renamed from: z0.j0.y.q.f.e$a */
    /* JADX INFO: compiled from: NetworkStateTracker.java */
    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || intent.getAction() == null || !intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                return;
            }
            Logger9.m15885c().mo15887a(NetworkStateTracker.f37470g, "Network broadcast received", new Throwable[0]);
            NetworkStateTracker networkStateTracker = NetworkStateTracker.this;
            networkStateTracker.m15963c(networkStateTracker.m15965f());
        }
    }

    /* JADX INFO: renamed from: z0.j0.y.q.f.e$b */
    /* JADX INFO: compiled from: NetworkStateTracker.java */
    public class b extends ConnectivityManager.NetworkCallback {
        public b() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            Logger9.m15885c().mo15887a(NetworkStateTracker.f37470g, String.format("Network capabilities changed: %s", networkCapabilities), new Throwable[0]);
            NetworkStateTracker networkStateTracker = NetworkStateTracker.this;
            networkStateTracker.m15963c(networkStateTracker.m15965f());
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            Logger9.m15885c().mo15887a(NetworkStateTracker.f37470g, "Network connection lost", new Throwable[0]);
            NetworkStateTracker networkStateTracker = NetworkStateTracker.this;
            networkStateTracker.m15963c(networkStateTracker.m15965f());
        }
    }

    public NetworkStateTracker(Context context, TaskExecutor2 taskExecutor2) {
        super(context, taskExecutor2);
        this.f37471h = (ConnectivityManager) this.f37464c.getSystemService("connectivity");
        if (m15964g()) {
            this.f37472i = new b();
        } else {
            this.f37473j = new a();
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m15964g() {
        return Build.VERSION.SDK_INT >= 24;
    }

    @Override // p636z0.p709j0.p710y.p715q.p717f.ConstraintTracker
    /* JADX INFO: renamed from: a */
    public NetworkState mo15957a() {
        return m15965f();
    }

    @Override // p636z0.p709j0.p710y.p715q.p717f.ConstraintTracker
    /* JADX INFO: renamed from: d */
    public void mo15960d() {
        if (!m15964g()) {
            Logger9.m15885c().mo15887a(f37470g, "Registering broadcast receiver", new Throwable[0]);
            this.f37464c.registerReceiver(this.f37473j, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            return;
        }
        try {
            Logger9.m15885c().mo15887a(f37470g, "Registering network callback", new Throwable[0]);
            this.f37471h.registerDefaultNetworkCallback(this.f37472i);
        } catch (IllegalArgumentException | SecurityException e) {
            Logger9.m15885c().mo15888b(f37470g, "Received exception while registering network callback", e);
        }
    }

    @Override // p636z0.p709j0.p710y.p715q.p717f.ConstraintTracker
    /* JADX INFO: renamed from: e */
    public void mo15961e() {
        if (!m15964g()) {
            Logger9.m15885c().mo15887a(f37470g, "Unregistering broadcast receiver", new Throwable[0]);
            this.f37464c.unregisterReceiver(this.f37473j);
            return;
        }
        try {
            Logger9.m15885c().mo15887a(f37470g, "Unregistering network callback", new Throwable[0]);
            this.f37471h.unregisterNetworkCallback(this.f37472i);
        } catch (IllegalArgumentException | SecurityException e) {
            Logger9.m15885c().mo15888b(f37470g, "Received exception while unregistering network callback", e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0032  */
    /* JADX INFO: renamed from: f */
    public NetworkState m15965f() {
        boolean z;
        NetworkInfo activeNetworkInfo = this.f37471h.getActiveNetworkInfo();
        boolean z2 = false;
        boolean z3 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        if (Build.VERSION.SDK_INT < 23) {
            z = false;
        } else {
            try {
                NetworkCapabilities networkCapabilities = this.f37471h.getNetworkCapabilities(this.f37471h.getActiveNetwork());
                if (networkCapabilities == null || !networkCapabilities.hasCapability(16)) {
                    z = false;
                } else {
                    z = true;
                }
            } catch (SecurityException e) {
                Logger9.m15885c().mo15888b(f37470g, "Unable to validate active network", e);
            }
        }
        boolean zIsActiveNetworkMetered = this.f37471h.isActiveNetworkMetered();
        if (activeNetworkInfo != null && !activeNetworkInfo.isRoaming()) {
            z2 = true;
        }
        return new NetworkState(z3, z, zIsActiveNetworkMetered, z2);
    }
}
