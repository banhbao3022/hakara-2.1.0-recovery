package p636z0.p663d.p664a;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import p629y0.p630a.p631a.ICustomTabsService;

/* JADX INFO: renamed from: z0.d.a.j, reason: use source file name */
/* JADX INFO: compiled from: CustomTabsServiceConnection.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class CustomTabsServiceConnection implements ServiceConnection {

    /* JADX INFO: renamed from: z0.d.a.j$a */
    /* JADX INFO: compiled from: CustomTabsServiceConnection.java */
    public class a extends CustomTabsClient7 {
        public a(CustomTabsServiceConnection customTabsServiceConnection, ICustomTabsService iCustomTabsService, ComponentName componentName) {
            super(iCustomTabsService, componentName);
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo7116a(ComponentName componentName, CustomTabsClient7 customTabsClient7);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ICustomTabsService c8555a;
        int i = ICustomTabsService.a.f34150f;
        if (iBinder == null) {
            c8555a = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
            c8555a = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ICustomTabsService)) ? new ICustomTabsService.a.C8555a(iBinder) : (ICustomTabsService) iInterfaceQueryLocalInterface;
        }
        mo7116a(componentName, new a(this, c8555a, componentName));
    }
}
