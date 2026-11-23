package p007c.p190n.p194b.p266d.p327k.p329b;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
import p007c.p190n.p194b.p266d.p314j.p325k.C4079a;
import p007c.p190n.p194b.p266d.p314j.p325k.C4385w;

/* JADX INFO: renamed from: c.n.b.d.k.b.m3 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4593m3 extends C4079a implements InterfaceC4569k3 {
    public C4593m3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.InterfaceC4569k3
    /* JADX INFO: renamed from: I1 */
    public final List<C4712w9> mo10390I1(String str, String str2, String str3, boolean z) throws RemoteException {
        Parcel parcelM9333E0 = m9333E0();
        parcelM9333E0.writeString(str);
        parcelM9333E0.writeString(str2);
        parcelM9333E0.writeString(str3);
        ClassLoader classLoader = C4385w.f23577a;
        parcelM9333E0.writeInt(z ? 1 : 0);
        Parcel parcelM9335i1 = m9335i1(15, parcelM9333E0);
        ArrayList arrayListCreateTypedArrayList = parcelM9335i1.createTypedArrayList(C4712w9.CREATOR);
        parcelM9335i1.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.InterfaceC4569k3
    /* JADX INFO: renamed from: W2 */
    public final void mo10393W2(long j2, String str, String str2, String str3) throws RemoteException {
        Parcel parcelM9333E0 = m9333E0();
        parcelM9333E0.writeLong(j2);
        parcelM9333E0.writeString(str);
        parcelM9333E0.writeString(str2);
        parcelM9333E0.writeString(str3);
        m9334T1(10, parcelM9333E0);
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.InterfaceC4569k3
    /* JADX INFO: renamed from: X0 */
    public final byte[] mo10394X0(C4625p c4625p, String str) throws RemoteException {
        Parcel parcelM9333E0 = m9333E0();
        C4385w.m10298c(parcelM9333E0, c4625p);
        parcelM9333E0.writeString(str);
        Parcel parcelM9335i1 = m9335i1(9, parcelM9333E0);
        byte[] bArrCreateByteArray = parcelM9335i1.createByteArray();
        parcelM9335i1.recycle();
        return bArrCreateByteArray;
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.InterfaceC4569k3
    /* JADX INFO: renamed from: X5 */
    public final void mo10395X5(C4712w9 c4712w9, C4480ca c4480ca) throws RemoteException {
        Parcel parcelM9333E0 = m9333E0();
        C4385w.m10298c(parcelM9333E0, c4712w9);
        C4385w.m10298c(parcelM9333E0, c4480ca);
        m9334T1(2, parcelM9333E0);
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.InterfaceC4569k3
    /* JADX INFO: renamed from: a3 */
    public final void mo10396a3(C4480ca c4480ca) throws RemoteException {
        Parcel parcelM9333E0 = m9333E0();
        C4385w.m10298c(parcelM9333E0, c4480ca);
        m9334T1(18, parcelM9333E0);
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.InterfaceC4569k3
    /* JADX INFO: renamed from: b3 */
    public final List<C4624oa> mo10397b3(String str, String str2, String str3) throws RemoteException {
        Parcel parcelM9333E0 = m9333E0();
        parcelM9333E0.writeString(str);
        parcelM9333E0.writeString(str2);
        parcelM9333E0.writeString(str3);
        Parcel parcelM9335i1 = m9335i1(17, parcelM9333E0);
        ArrayList arrayListCreateTypedArrayList = parcelM9335i1.createTypedArrayList(C4624oa.CREATOR);
        parcelM9335i1.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.InterfaceC4569k3
    /* JADX INFO: renamed from: d1 */
    public final void mo10398d1(C4480ca c4480ca) throws RemoteException {
        Parcel parcelM9333E0 = m9333E0();
        C4385w.m10298c(parcelM9333E0, c4480ca);
        m9334T1(20, parcelM9333E0);
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.InterfaceC4569k3
    /* JADX INFO: renamed from: g3 */
    public final List<C4624oa> mo10399g3(String str, String str2, C4480ca c4480ca) throws RemoteException {
        Parcel parcelM9333E0 = m9333E0();
        parcelM9333E0.writeString(str);
        parcelM9333E0.writeString(str2);
        C4385w.m10298c(parcelM9333E0, c4480ca);
        Parcel parcelM9335i1 = m9335i1(16, parcelM9333E0);
        ArrayList arrayListCreateTypedArrayList = parcelM9335i1.createTypedArrayList(C4624oa.CREATOR);
        parcelM9335i1.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.InterfaceC4569k3
    /* JADX INFO: renamed from: g6 */
    public final void mo10400g6(C4624oa c4624oa, C4480ca c4480ca) throws RemoteException {
        Parcel parcelM9333E0 = m9333E0();
        C4385w.m10298c(parcelM9333E0, c4624oa);
        C4385w.m10298c(parcelM9333E0, c4480ca);
        m9334T1(12, parcelM9333E0);
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.InterfaceC4569k3
    /* JADX INFO: renamed from: m2 */
    public final String mo10402m2(C4480ca c4480ca) throws RemoteException {
        Parcel parcelM9333E0 = m9333E0();
        C4385w.m10298c(parcelM9333E0, c4480ca);
        Parcel parcelM9335i1 = m9335i1(11, parcelM9333E0);
        String string = parcelM9335i1.readString();
        parcelM9335i1.recycle();
        return string;
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.InterfaceC4569k3
    /* JADX INFO: renamed from: q4 */
    public final void mo10404q4(C4480ca c4480ca) throws RemoteException {
        Parcel parcelM9333E0 = m9333E0();
        C4385w.m10298c(parcelM9333E0, c4480ca);
        m9334T1(6, parcelM9333E0);
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.InterfaceC4569k3
    /* JADX INFO: renamed from: r5 */
    public final void mo10405r5(C4625p c4625p, C4480ca c4480ca) throws RemoteException {
        Parcel parcelM9333E0 = m9333E0();
        C4385w.m10298c(parcelM9333E0, c4625p);
        C4385w.m10298c(parcelM9333E0, c4480ca);
        m9334T1(1, parcelM9333E0);
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.InterfaceC4569k3
    /* JADX INFO: renamed from: u5 */
    public final void mo10406u5(Bundle bundle, C4480ca c4480ca) throws RemoteException {
        Parcel parcelM9333E0 = m9333E0();
        C4385w.m10298c(parcelM9333E0, bundle);
        C4385w.m10298c(parcelM9333E0, c4480ca);
        m9334T1(19, parcelM9333E0);
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.InterfaceC4569k3
    /* JADX INFO: renamed from: v3 */
    public final List<C4712w9> mo10407v3(String str, String str2, boolean z, C4480ca c4480ca) throws RemoteException {
        Parcel parcelM9333E0 = m9333E0();
        parcelM9333E0.writeString(str);
        parcelM9333E0.writeString(str2);
        ClassLoader classLoader = C4385w.f23577a;
        parcelM9333E0.writeInt(z ? 1 : 0);
        C4385w.m10298c(parcelM9333E0, c4480ca);
        Parcel parcelM9335i1 = m9335i1(14, parcelM9333E0);
        ArrayList arrayListCreateTypedArrayList = parcelM9335i1.createTypedArrayList(C4712w9.CREATOR);
        parcelM9335i1.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.InterfaceC4569k3
    /* JADX INFO: renamed from: y3 */
    public final void mo10408y3(C4480ca c4480ca) throws RemoteException {
        Parcel parcelM9333E0 = m9333E0();
        C4385w.m10298c(parcelM9333E0, c4480ca);
        m9334T1(4, parcelM9333E0);
    }
}
