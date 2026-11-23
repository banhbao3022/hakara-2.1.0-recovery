package p636z0.p641a0;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: z0.a0.l, reason: use source file name */
/* JADX INFO: compiled from: IMultiInstanceInvalidationCallback.java */
/* JADX INFO: loaded from: classes.dex */
public interface IMultiInstanceInvalidationCallback extends IInterface {

    /* JADX INFO: renamed from: z0.a0.l$a */
    /* JADX INFO: compiled from: IMultiInstanceInvalidationCallback.java */
    public static abstract class a extends Binder implements IMultiInstanceInvalidationCallback {

        /* JADX INFO: renamed from: f */
        public static final /* synthetic */ int f34257f = 0;

        /* JADX INFO: renamed from: z0.a0.l$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: IMultiInstanceInvalidationCallback.java */
        public static class C8559a implements IMultiInstanceInvalidationCallback {

            /* JADX INFO: renamed from: f */
            public IBinder f34258f;

            public C8559a(IBinder iBinder) {
                this.f34258f = iBinder;
            }

            @Override // p636z0.p641a0.IMultiInstanceInvalidationCallback
            /* JADX INFO: renamed from: L1 */
            public void mo14514L1(String[] strArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                    parcelObtain.writeStringArray(strArr);
                    if (!this.f34258f.transact(1, parcelObtain, null, 1)) {
                        int i = a.f34257f;
                    }
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f34258f;
            }
        }

        public a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationCallback");
        }

        /* JADX INFO: renamed from: E0 */
        public static IMultiInstanceInvalidationCallback m14515E0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IMultiInstanceInvalidationCallback)) ? new C8559a(iBinder) : (IMultiInstanceInvalidationCallback) iInterfaceQueryLocalInterface;
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
                parcel2.writeString("androidx.room.IMultiInstanceInvalidationCallback");
                return true;
            }
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationCallback");
            ((MultiInstanceInvalidationClient.a) this).mo14514L1(parcel.createStringArray());
            return true;
        }
    }

    /* JADX INFO: renamed from: L1 */
    void mo14514L1(String[] strArr) throws RemoteException;
}
