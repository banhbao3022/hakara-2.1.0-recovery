package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: c.n.b.d.j.a.c1 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2902c1 extends gg2 implements InterfaceC2976e1 {
    public C2902c1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2976e1
    /* JADX INFO: renamed from: c */
    public final String mo5693c() throws RemoteException {
        Parcel parcelM7003i1 = m7003i1(1, m7001E0());
        String string = parcelM7003i1.readString();
        parcelM7003i1.recycle();
        return string;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2976e1
    /* JADX INFO: renamed from: d */
    public final String mo5694d() throws RemoteException {
        Parcel parcelM7003i1 = m7003i1(2, m7001E0());
        String string = parcelM7003i1.readString();
        parcelM7003i1.recycle();
        return string;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2976e1
    /* JADX INFO: renamed from: f */
    public final List<ow2> mo5695f() throws RemoteException {
        Parcel parcelM7003i1 = m7003i1(3, m7001E0());
        ArrayList arrayListCreateTypedArrayList = parcelM7003i1.createTypedArrayList(ow2.CREATOR);
        parcelM7003i1.recycle();
        return arrayListCreateTypedArrayList;
    }
}
