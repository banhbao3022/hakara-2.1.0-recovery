package p007c.p190n.p194b.p266d.p290d.p291r;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p314j.p320f.BinderC3808a;

/* JADX INFO: renamed from: c.n.b.d.d.r.d0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2429d0 extends IInterface {

    /* JADX INFO: renamed from: c.n.b.d.d.r.d0$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
    public static abstract class a extends BinderC3808a implements InterfaceC2429d0 {

        /* JADX INFO: renamed from: f */
        public static final /* synthetic */ int f11184f = 0;
    }

    /* JADX INFO: renamed from: e2 */
    void mo5015e2() throws RemoteException;

    void onDestroy() throws RemoteException;

    /* JADX INFO: renamed from: y4 */
    IBinder mo5016y4(Intent intent) throws RemoteException;

    /* JADX INFO: renamed from: z5 */
    int mo5017z5(Intent intent, int i, int i2) throws RemoteException;
}
