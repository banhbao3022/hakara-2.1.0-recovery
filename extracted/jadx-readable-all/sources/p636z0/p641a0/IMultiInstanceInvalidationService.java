package p636z0.p641a0;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.room.MultiInstanceInvalidationService;

/* JADX INFO: renamed from: z0.a0.m, reason: use source file name */
/* JADX INFO: compiled from: IMultiInstanceInvalidationService.java */
/* JADX INFO: loaded from: classes.dex */
public interface IMultiInstanceInvalidationService extends IInterface {

    /* JADX INFO: renamed from: z0.a0.m$a */
    /* JADX INFO: compiled from: IMultiInstanceInvalidationService.java */
    public static abstract class a extends Binder implements IMultiInstanceInvalidationService {

        /* JADX INFO: renamed from: f */
        public static final /* synthetic */ int f34259f = 0;

        /* JADX INFO: renamed from: z0.a0.m$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: IMultiInstanceInvalidationService.java */
        public static class C8560a implements IMultiInstanceInvalidationService {

            /* JADX INFO: renamed from: f */
            public IBinder f34260f;

            public C8560a(IBinder iBinder) {
                this.f34260f = iBinder;
            }

            @Override // p636z0.p641a0.IMultiInstanceInvalidationService
            /* JADX INFO: renamed from: S5 */
            public void mo865S5(int i, String[] strArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStringArray(strArr);
                    if (!this.f34260f.transact(3, parcelObtain, null, 1)) {
                        int i2 = a.f34259f;
                    }
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f34260f;
            }

            @Override // p636z0.p641a0.IMultiInstanceInvalidationService
            /* JADX INFO: renamed from: j2 */
            public int mo866j2(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    parcelObtain.writeStrongBinder(iMultiInstanceInvalidationCallback != null ? iMultiInstanceInvalidationCallback.asBinder() : null);
                    parcelObtain.writeString(str);
                    if (!this.f34260f.transact(1, parcelObtain, parcelObtain2, 0)) {
                        int i = a.f34259f;
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                int iMo866j2 = ((MultiInstanceInvalidationService.BinderC0181b) this).mo866j2(IMultiInstanceInvalidationCallback.a.m14515E0(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(iMo866j2);
                return true;
            }
            if (i != 2) {
                if (i != 3) {
                    if (i != 1598968902) {
                        return super.onTransact(i, parcel, parcel2, i2);
                    }
                    parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
                    return true;
                }
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                ((MultiInstanceInvalidationService.BinderC0181b) this).mo865S5(parcel.readInt(), parcel.createStringArray());
                return true;
            }
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallbackM14515E0 = IMultiInstanceInvalidationCallback.a.m14515E0(parcel.readStrongBinder());
            int i3 = parcel.readInt();
            MultiInstanceInvalidationService.BinderC0181b binderC0181b = (MultiInstanceInvalidationService.BinderC0181b) this;
            synchronized (MultiInstanceInvalidationService.this.f1164h) {
                MultiInstanceInvalidationService.this.f1164h.unregister(iMultiInstanceInvalidationCallbackM14515E0);
                MultiInstanceInvalidationService.this.f1163g.remove(Integer.valueOf(i3));
            }
            parcel2.writeNoException();
            return true;
        }
    }

    /* JADX INFO: renamed from: S5 */
    void mo865S5(int i, String[] strArr) throws RemoteException;

    /* JADX INFO: renamed from: j2 */
    int mo866j2(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, String str) throws RemoteException;
}
