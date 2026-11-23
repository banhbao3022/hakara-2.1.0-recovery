package p007c.p190n.p194b.p266d.p290d.p291r.p292l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
import p007c.p190n.p194b.p266d.p314j.p320f.C3988s;

/* JADX INFO: renamed from: c.n.b.d.d.r.l.a0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2445a0 extends C3988s implements InterfaceC2497y {
    public C2445a0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.media.INotificationActionsProvider");
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p291r.p292l.InterfaceC2497y
    /* JADX INFO: renamed from: O3 */
    public final int[] mo5037O3() throws RemoteException {
        Parcel parcelM9212i1 = m9212i1(4, m9209E0());
        int[] iArrCreateIntArray = parcelM9212i1.createIntArray();
        parcelM9212i1.recycle();
        return iArrCreateIntArray;
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p291r.p292l.InterfaceC2497y
    /* JADX INFO: renamed from: v1 */
    public final List<C2452e> mo5038v1() throws RemoteException {
        Parcel parcelM9212i1 = m9212i1(3, m9209E0());
        ArrayList arrayListCreateTypedArrayList = parcelM9212i1.createTypedArrayList(C2452e.CREATOR);
        parcelM9212i1.recycle();
        return arrayListCreateTypedArrayList;
    }
}
