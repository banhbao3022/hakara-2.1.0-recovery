package p007c.p190n.p194b.p266d.p297e;

import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: renamed from: c.n.b.d.e.r */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2591r {

    /* JADX INFO: renamed from: a */
    public final Messenger f11535a;

    /* JADX INFO: renamed from: b */
    public final C2577d f11536b;

    public C2591r(IBinder iBinder) throws RemoteException {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.f11535a = new Messenger(iBinder);
            this.f11536b = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.f11536b = new C2577d(iBinder);
            this.f11535a = null;
        } else {
            String strValueOf = String.valueOf(interfaceDescriptor);
            Log.w("MessengerIpcClient", strValueOf.length() != 0 ? "Invalid interface descriptor: ".concat(strValueOf) : new String("Invalid interface descriptor: "));
            throw new RemoteException();
        }
    }
}
