package p007c.p190n.p194b.p266d.p314j.p315a;

import android.app.Activity;
import android.content.ComponentName;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2249b1;
import p636z0.p663d.p664a.CustomTabsClient6;
import p636z0.p663d.p664a.CustomTabsClient7;
import p636z0.p663d.p664a.CustomTabsIntent;
import p636z0.p663d.p664a.CustomTabsServiceConnection;
import p636z0.p663d.p664a.CustomTabsSession;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class hd2 extends CustomTabsServiceConnection {

    /* JADX INFO: renamed from: a */
    public final WeakReference<C2830a4> f14824a;

    public hd2(C2830a4 c2830a4, byte[] bArr) {
        this.f14824a = new WeakReference<>(c2830a4);
    }

    @Override // p636z0.p663d.p664a.CustomTabsServiceConnection
    /* JADX INFO: renamed from: a */
    public final void mo7116a(ComponentName componentName, CustomTabsClient7 customTabsClient7) {
        CustomTabsSession customTabsSession;
        C2830a4 c2830a4 = this.f14824a.get();
        if (c2830a4 != null) {
            c2830a4.f12010b = customTabsClient7;
            try {
                customTabsClient7.f35367a.mo14482Y2(0L);
            } catch (RemoteException unused) {
            }
            InterfaceC3756z3 interfaceC3756z3 = c2830a4.f12012d;
            if (interfaceC3756z3 != null) {
                C2249b1 c2249b1 = (C2249b1) interfaceC3756z3;
                C2830a4 c2830a5 = c2249b1.f10691a;
                CustomTabsClient7 customTabsClient8 = c2830a5.f12010b;
                if (customTabsClient8 == null) {
                    c2830a5.f12009a = null;
                } else if (c2830a5.f12009a == null) {
                    CustomTabsClient6 customTabsClient6 = new CustomTabsClient6(customTabsClient8, null);
                    try {
                        customTabsSession = !customTabsClient8.f35367a.mo14483b4(customTabsClient6) ? null : new CustomTabsSession(customTabsClient8.f35367a, customTabsClient6, customTabsClient8.f35368b);
                    } catch (RemoteException unused2) {
                    }
                    c2830a5.f12009a = customTabsSession;
                }
                new CustomTabsIntent.a(c2830a5.f12009a).m15061a().m15060a(c2249b1.f10692b, c2249b1.f10693c);
                C2830a4 c2830a6 = c2249b1.f10691a;
                Activity activity = (Activity) c2249b1.f10692b;
                CustomTabsServiceConnection customTabsServiceConnection = c2830a6.f12011c;
                if (customTabsServiceConnection == null) {
                    return;
                }
                activity.unbindService(customTabsServiceConnection);
                c2830a6.f12010b = null;
                c2830a6.f12009a = null;
                c2830a6.f12011c = null;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C2830a4 c2830a4 = this.f14824a.get();
        if (c2830a4 != null) {
            c2830a4.f12010b = null;
            c2830a4.f12009a = null;
        }
    }
}
