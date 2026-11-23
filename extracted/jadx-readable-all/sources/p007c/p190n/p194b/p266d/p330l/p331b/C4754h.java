package p007c.p190n.p194b.p266d.p330l.p331b;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p314j.p319e.BinderC3805a;
import p007c.p190n.p194b.p266d.p314j.p319e.C3806b;

/* JADX INFO: renamed from: c.n.b.d.l.b.h */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4754h implements InterfaceC4752f, IInterface {

    /* JADX INFO: renamed from: f */
    public final IBinder f24644f;

    /* JADX INFO: renamed from: g */
    public final String f24645g = "com.google.android.gms.signin.internal.ISignInService";

    public C4754h(IBinder iBinder) {
        this.f24644f = iBinder;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f24644f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p007c.p190n.p194b.p266d.p330l.p331b.InterfaceC4752f
    /* JADX INFO: renamed from: j6 */
    public final void mo10918j6(C4756j c4756j, InterfaceC4750d interfaceC4750d) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f24645g);
        int i = C3806b.f22470a;
        parcelObtain.writeInt(1);
        c4756j.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder((BinderC3805a) interfaceC4750d);
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            this.f24644f.transact(12, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain.recycle();
            parcelObtain2.recycle();
        }
    }
}
