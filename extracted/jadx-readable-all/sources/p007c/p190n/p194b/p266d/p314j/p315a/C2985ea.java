package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: renamed from: c.n.b.d.j.a.ea */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2985ea extends gg2 implements InterfaceC3059ga {
    public C2985ea(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3059ga
    /* JADX INFO: renamed from: T4 */
    public final void mo6615T4(List<C3762z9> list) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        parcelM7001E0.writeTypedList(list);
        m7002T1(1, parcelM7001E0);
    }
}
