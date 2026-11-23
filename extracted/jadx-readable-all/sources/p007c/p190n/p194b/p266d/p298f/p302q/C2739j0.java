package p007c.p190n.p194b.p266d.p298f.p302q;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p314j.p322h.BinderC4063b;

/* JADX INFO: renamed from: c.n.b.d.f.q.j0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2739j0 implements InterfaceC2749o {

    /* JADX INFO: renamed from: f */
    public final IBinder f11883f;

    public C2739j0(IBinder iBinder) {
        this.f11883f = iBinder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p007c.p190n.p194b.p266d.p298f.p302q.InterfaceC2749o
    /* JADX INFO: renamed from: S1 */
    public final void mo5600S1(InterfaceC2747n interfaceC2747n, C2732h c2732h) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder((BinderC4063b) interfaceC2747n);
            parcelObtain.writeInt(1);
            C2774z0.m5612a(c2732h, parcelObtain, 0);
            this.f11883f.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f11883f;
    }
}
