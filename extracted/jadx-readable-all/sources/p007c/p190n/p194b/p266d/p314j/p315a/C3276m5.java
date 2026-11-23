package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: c.n.b.d.j.a.m5 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3276m5 extends gg2 implements InterfaceC3350o5 {
    public C3276m5(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3350o5
    /* JADX INFO: renamed from: a */
    public final String mo6604a() throws RemoteException {
        Parcel parcelM7003i1 = m7003i1(2, m7001E0());
        String string = parcelM7003i1.readString();
        parcelM7003i1.recycle();
        return string;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3350o5
    /* JADX INFO: renamed from: b */
    public final List<InterfaceC3610v5> mo6605b() throws RemoteException {
        Parcel parcelM7003i1 = m7003i1(3, m7001E0());
        ArrayList arrayList = parcelM7003i1.readArrayList(ig2.f15182a);
        parcelM7003i1.recycle();
        return arrayList;
    }
}
