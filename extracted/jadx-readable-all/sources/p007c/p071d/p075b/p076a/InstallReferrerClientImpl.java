package p007c.p071d.p075b.p076a;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Objects;
import p007c.p071d.p075b.p077b.InstallReferrerCommons;
import p007c.p165l.p178k0.InstallReferrerUtil;
import p007c.p190n.p194b.p264c.p265a.IGetInstallReferrerService;

/* JADX INFO: renamed from: c.d.b.a.b, reason: use source file name */
/* JADX INFO: compiled from: InstallReferrerClientImpl.java */
/* JADX INFO: loaded from: classes.dex */
public class InstallReferrerClientImpl extends InstallReferrerClient {

    /* JADX INFO: renamed from: a */
    public int f2784a = 0;

    /* JADX INFO: renamed from: b */
    public final Context f2785b;

    /* JADX INFO: renamed from: c */
    public IGetInstallReferrerService f2786c;

    /* JADX INFO: renamed from: d */
    public ServiceConnection f2787d;

    /* JADX INFO: renamed from: c.d.b.a.b$b */
    /* JADX INFO: compiled from: InstallReferrerClientImpl.java */
    public final class b implements ServiceConnection {

        /* JADX INFO: renamed from: a */
        public final InstallReferrerStateListener f2788a;

        public b(InstallReferrerStateListener installReferrerStateListener, a aVar) {
            if (installReferrerStateListener == null) {
                throw new RuntimeException("Please specify a listener to know when setup is done.");
            }
            this.f2788a = installReferrerStateListener;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            IGetInstallReferrerService c8513a;
            InstallReferrerCommons.m1548a("InstallReferrerClient", "Install Referrer service connected.");
            InstallReferrerClientImpl installReferrerClientImpl = InstallReferrerClientImpl.this;
            int i = IGetInstallReferrerService.a.f10441f;
            if (iBinder == null) {
                c8513a = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                c8513a = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IGetInstallReferrerService)) ? new IGetInstallReferrerService.a.C8513a(iBinder) : (IGetInstallReferrerService) iInterfaceQueryLocalInterface;
            }
            installReferrerClientImpl.f2786c = c8513a;
            InstallReferrerClientImpl.this.f2784a = 2;
            ((InstallReferrerUtil) this.f2788a).m2531a(0);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            InstallReferrerCommons.m1549b("InstallReferrerClient", "Install Referrer service disconnected.");
            InstallReferrerClientImpl installReferrerClientImpl = InstallReferrerClientImpl.this;
            installReferrerClientImpl.f2786c = null;
            installReferrerClientImpl.f2784a = 0;
            Objects.requireNonNull((InstallReferrerUtil) this.f2788a);
        }
    }

    public InstallReferrerClientImpl(Context context) {
        this.f2785b = context.getApplicationContext();
    }

    @Override // p007c.p071d.p075b.p076a.InstallReferrerClient
    /* JADX INFO: renamed from: a */
    public ReferrerDetails mo1546a() throws RemoteException {
        if (!m1547b()) {
            throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", this.f2785b.getPackageName());
        try {
            return new ReferrerDetails(this.f2786c.mo4596N2(bundle));
        } catch (RemoteException e) {
            InstallReferrerCommons.m1549b("InstallReferrerClient", "RemoteException getting install referrer information");
            this.f2784a = 0;
            throw e;
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m1547b() {
        return (this.f2784a != 2 || this.f2786c == null || this.f2787d == null) ? false : true;
    }
}
