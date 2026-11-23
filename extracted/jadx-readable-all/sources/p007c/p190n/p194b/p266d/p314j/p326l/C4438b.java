package p007c.p190n.p194b.p266d.p314j.p326l;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: renamed from: c.n.b.d.j.l.b */
/* JADX INFO: compiled from: com.android.billingclient:billing@@3.0.3 */
/* JADX INFO: loaded from: classes.dex */
public final class C4438b extends C4441e implements InterfaceC4440d {
    public C4438b(IBinder iBinder) {
        super(iBinder);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p326l.InterfaceC4440d
    /* JADX INFO: renamed from: J4 */
    public final Bundle mo10356J4(int i, String str, String str2, Bundle bundle) throws RemoteException {
        Parcel parcelM10367E0 = m10367E0();
        parcelM10367E0.writeInt(3);
        parcelM10367E0.writeString(str);
        parcelM10367E0.writeString(str2);
        int i2 = C4443g.f23686a;
        parcelM10367E0.writeInt(1);
        bundle.writeToParcel(parcelM10367E0, 0);
        Parcel parcelM10368i1 = m10368i1(2, parcelM10367E0);
        Bundle bundle2 = (Bundle) C4443g.m10369a(parcelM10368i1, Bundle.CREATOR);
        parcelM10368i1.recycle();
        return bundle2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p326l.InterfaceC4440d
    /* JADX INFO: renamed from: S2 */
    public final int mo10357S2(int i, String str, String str2, Bundle bundle) throws RemoteException {
        Parcel parcelM10367E0 = m10367E0();
        parcelM10367E0.writeInt(7);
        parcelM10367E0.writeString(str);
        parcelM10367E0.writeString(str2);
        int i2 = C4443g.f23686a;
        parcelM10367E0.writeInt(1);
        bundle.writeToParcel(parcelM10367E0, 0);
        Parcel parcelM10368i1 = m10368i1(10, parcelM10367E0);
        int i3 = parcelM10368i1.readInt();
        parcelM10368i1.recycle();
        return i3;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p326l.InterfaceC4440d
    /* JADX INFO: renamed from: c4 */
    public final int mo10358c4(int i, String str, String str2) throws RemoteException {
        Parcel parcelM10367E0 = m10367E0();
        parcelM10367E0.writeInt(3);
        parcelM10367E0.writeString(str);
        parcelM10367E0.writeString(str2);
        Parcel parcelM10368i1 = m10368i1(5, parcelM10367E0);
        int i2 = parcelM10368i1.readInt();
        parcelM10368i1.recycle();
        return i2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p326l.InterfaceC4440d
    /* JADX INFO: renamed from: k3 */
    public final Bundle mo10359k3(int i, String str, String str2, Bundle bundle, Bundle bundle2) throws RemoteException {
        Parcel parcelM10367E0 = m10367E0();
        parcelM10367E0.writeInt(10);
        parcelM10367E0.writeString(str);
        parcelM10367E0.writeString(str2);
        int i2 = C4443g.f23686a;
        parcelM10367E0.writeInt(1);
        bundle.writeToParcel(parcelM10367E0, 0);
        parcelM10367E0.writeInt(1);
        bundle2.writeToParcel(parcelM10367E0, 0);
        Parcel parcelM10368i1 = m10368i1(901, parcelM10367E0);
        Bundle bundle3 = (Bundle) C4443g.m10369a(parcelM10368i1, Bundle.CREATOR);
        parcelM10368i1.recycle();
        return bundle3;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p326l.InterfaceC4440d
    /* JADX INFO: renamed from: k4 */
    public final Bundle mo10360k4(int i, String str, List<String> list, String str2, String str3, String str4) throws RemoteException {
        Parcel parcelM10367E0 = m10367E0();
        parcelM10367E0.writeInt(5);
        parcelM10367E0.writeString(str);
        parcelM10367E0.writeStringList(list);
        parcelM10367E0.writeString(str2);
        parcelM10367E0.writeString("subs");
        parcelM10367E0.writeString(null);
        Parcel parcelM10368i1 = m10368i1(7, parcelM10367E0);
        Bundle bundle = (Bundle) C4443g.m10369a(parcelM10368i1, Bundle.CREATOR);
        parcelM10368i1.recycle();
        return bundle;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p326l.InterfaceC4440d
    /* JADX INFO: renamed from: k5 */
    public final Bundle mo10361k5(int i, String str, String str2, Bundle bundle) throws RemoteException {
        Parcel parcelM10367E0 = m10367E0();
        parcelM10367E0.writeInt(9);
        parcelM10367E0.writeString(str);
        parcelM10367E0.writeString(str2);
        int i2 = C4443g.f23686a;
        parcelM10367E0.writeInt(1);
        bundle.writeToParcel(parcelM10367E0, 0);
        Parcel parcelM10368i1 = m10368i1(12, parcelM10367E0);
        Bundle bundle2 = (Bundle) C4443g.m10369a(parcelM10368i1, Bundle.CREATOR);
        parcelM10368i1.recycle();
        return bundle2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p326l.InterfaceC4440d
    /* JADX INFO: renamed from: l4 */
    public final Bundle mo10362l4(int i, String str, String str2, String str3, String str4, Bundle bundle) throws RemoteException {
        Parcel parcelM10367E0 = m10367E0();
        parcelM10367E0.writeInt(i);
        parcelM10367E0.writeString(str);
        parcelM10367E0.writeString(str2);
        parcelM10367E0.writeString(str3);
        parcelM10367E0.writeString(null);
        int i2 = C4443g.f23686a;
        parcelM10367E0.writeInt(1);
        bundle.writeToParcel(parcelM10367E0, 0);
        Parcel parcelM10368i1 = m10368i1(8, parcelM10367E0);
        Bundle bundle2 = (Bundle) C4443g.m10369a(parcelM10368i1, Bundle.CREATOR);
        parcelM10368i1.recycle();
        return bundle2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p326l.InterfaceC4440d
    /* JADX INFO: renamed from: l5 */
    public final Bundle mo10363l5(int i, String str, String str2, String str3) throws RemoteException {
        Parcel parcelM10367E0 = m10367E0();
        parcelM10367E0.writeInt(3);
        parcelM10367E0.writeString(str);
        parcelM10367E0.writeString(str2);
        parcelM10367E0.writeString(str3);
        Parcel parcelM10368i1 = m10368i1(4, parcelM10367E0);
        Bundle bundle = (Bundle) C4443g.m10369a(parcelM10368i1, Bundle.CREATOR);
        parcelM10368i1.recycle();
        return bundle;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p326l.InterfaceC4440d
    /* JADX INFO: renamed from: n1 */
    public final int mo10364n1(int i, String str, String str2) throws RemoteException {
        Parcel parcelM10367E0 = m10367E0();
        parcelM10367E0.writeInt(i);
        parcelM10367E0.writeString(str);
        parcelM10367E0.writeString(str2);
        Parcel parcelM10368i1 = m10368i1(1, parcelM10367E0);
        int i2 = parcelM10368i1.readInt();
        parcelM10368i1.recycle();
        return i2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p326l.InterfaceC4440d
    /* JADX INFO: renamed from: u1 */
    public final Bundle mo10365u1(int i, String str, String str2, String str3, String str4) throws RemoteException {
        Parcel parcelM10367E0 = m10367E0();
        parcelM10367E0.writeInt(3);
        parcelM10367E0.writeString(str);
        parcelM10367E0.writeString(str2);
        parcelM10367E0.writeString(str3);
        parcelM10367E0.writeString(null);
        Parcel parcelM10368i1 = m10368i1(3, parcelM10367E0);
        Bundle bundle = (Bundle) C4443g.m10369a(parcelM10368i1, Bundle.CREATOR);
        parcelM10368i1.recycle();
        return bundle;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p326l.InterfaceC4440d
    /* JADX INFO: renamed from: x3 */
    public final Bundle mo10366x3(int i, String str, String str2, String str3, Bundle bundle) throws RemoteException {
        Parcel parcelM10367E0 = m10367E0();
        parcelM10367E0.writeInt(9);
        parcelM10367E0.writeString(str);
        parcelM10367E0.writeString(str2);
        parcelM10367E0.writeString(str3);
        int i2 = C4443g.f23686a;
        parcelM10367E0.writeInt(1);
        bundle.writeToParcel(parcelM10367E0, 0);
        Parcel parcelM10368i1 = m10368i1(11, parcelM10367E0);
        Bundle bundle2 = (Bundle) C4443g.m10369a(parcelM10368i1, Bundle.CREATOR);
        parcelM10368i1.recycle();
        return bundle2;
    }
}
