package p007c.p190n.p194b.p266d.p267a.p282z.p284b;

import android.net.ConnectivityManager;
import android.net.Network;

/* JADX INFO: renamed from: c.n.b.d.a.z.b.e1 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2258e1 extends ConnectivityManager.NetworkCallback {
    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        synchronized (C2267h1.class) {
            C2267h1.f10714b = true;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        synchronized (C2267h1.class) {
            C2267h1.f10714b = false;
        }
    }
}
