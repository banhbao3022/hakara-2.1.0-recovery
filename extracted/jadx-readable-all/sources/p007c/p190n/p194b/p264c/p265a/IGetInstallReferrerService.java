package p007c.p190n.p194b.p264c.p265a;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: c.n.b.c.a.a, reason: use source file name */
/* JADX INFO: compiled from: IGetInstallReferrerService.java */
/* JADX INFO: loaded from: classes.dex */
public interface IGetInstallReferrerService extends IInterface {

    /* JADX INFO: renamed from: c.n.b.c.a.a$a */
    /* JADX INFO: compiled from: IGetInstallReferrerService.java */
    public static abstract class a extends Binder implements IGetInstallReferrerService {

        /* JADX INFO: renamed from: f */
        public static final /* synthetic */ int f10441f = 0;

        /* JADX INFO: renamed from: c.n.b.c.a.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: IGetInstallReferrerService.java */
        public static class C8513a implements IGetInstallReferrerService {

            /* JADX INFO: renamed from: f */
            public IBinder f10442f;

            public C8513a(IBinder iBinder) {
                this.f10442f = iBinder;
            }

            @Override // p007c.p190n.p194b.p264c.p265a.IGetInstallReferrerService
            /* JADX INFO: renamed from: N2 */
            public Bundle mo4596N2(Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                    parcelObtain.writeInt(1);
                    bundle.writeToParcel(parcelObtain, 0);
                    this.f10442f.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f10442f;
            }
        }

        public a() {
            attachInterface(this, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                return true;
            }
            parcel.enforceInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            Bundle bundleMo4596N2 = mo4596N2(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
            parcel2.writeNoException();
            if (bundleMo4596N2 != null) {
                parcel2.writeInt(1);
                bundleMo4596N2.writeToParcel(parcel2, 1);
            } else {
                parcel2.writeInt(0);
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: N2 */
    Bundle mo4596N2(Bundle bundle) throws RemoteException;
}
