package p007c.p165l.p176j0.p177a;

import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;

/* JADX INFO: renamed from: c.l.j0.a.a, reason: use source file name */
/* JADX INFO: compiled from: DeviceRequestsHelper.java */
/* JADX INFO: loaded from: classes.dex */
public final class DeviceRequestsHelper implements NsdManager.RegistrationListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f4869a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f4870b;

    public DeviceRequestsHelper(String str, String str2) {
        this.f4869a = str;
        this.f4870b = str2;
    }

    @Override // android.net.nsd.NsdManager.RegistrationListener
    public void onRegistrationFailed(NsdServiceInfo nsdServiceInfo, int i) {
        DeviceRequestsHelper2.m2411a(this.f4870b);
    }

    @Override // android.net.nsd.NsdManager.RegistrationListener
    public void onServiceRegistered(NsdServiceInfo nsdServiceInfo) {
        if (this.f4869a.equals(nsdServiceInfo.getServiceName())) {
            return;
        }
        DeviceRequestsHelper2.m2411a(this.f4870b);
    }

    @Override // android.net.nsd.NsdManager.RegistrationListener
    public void onServiceUnregistered(NsdServiceInfo nsdServiceInfo) {
    }

    @Override // android.net.nsd.NsdManager.RegistrationListener
    public void onUnregistrationFailed(NsdServiceInfo nsdServiceInfo, int i) {
    }
}
