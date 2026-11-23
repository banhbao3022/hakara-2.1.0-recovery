package p007c.p190n.p194b.p266d.p298f.p302q;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: c.n.b.d.f.q.s0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC2758s0 implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    public final int f11909a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC2717c f11910b;

    public ServiceConnectionC2758s0(AbstractC2717c abstractC2717c, int i) {
        this.f11910b = abstractC2717c;
        this.f11909a = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            AbstractC2717c.m5568y(this.f11910b, 16);
            return;
        }
        synchronized (this.f11910b.f11807i) {
            AbstractC2717c abstractC2717c = this.f11910b;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            abstractC2717c.f11808j = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC2749o)) ? new C2739j0(iBinder) : (InterfaceC2749o) iInterfaceQueryLocalInterface;
        }
        AbstractC2717c abstractC2717c2 = this.f11910b;
        int i = this.f11909a;
        Handler handler = abstractC2717c2.f11805g;
        handler.sendMessage(handler.obtainMessage(7, i, -1, new C2762u0(abstractC2717c2, 0, null)));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        AbstractC2717c abstractC2717c;
        synchronized (this.f11910b.f11807i) {
            abstractC2717c = this.f11910b;
            abstractC2717c.f11808j = null;
        }
        Handler handler = abstractC2717c.f11805g;
        handler.sendMessage(handler.obtainMessage(6, this.f11909a, 1));
    }
}
