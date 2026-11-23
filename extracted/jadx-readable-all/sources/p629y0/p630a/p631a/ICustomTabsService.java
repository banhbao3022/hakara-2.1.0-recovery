package p629y0.p630a.p631a;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: renamed from: y0.a.a.b, reason: use source file name */
/* JADX INFO: compiled from: ICustomTabsService.java */
/* JADX INFO: loaded from: classes.dex */
public interface ICustomTabsService extends IInterface {

    /* JADX INFO: renamed from: y0.a.a.b$a */
    /* JADX INFO: compiled from: ICustomTabsService.java */
    public static abstract class a extends Binder implements ICustomTabsService {

        /* JADX INFO: renamed from: f */
        public static final /* synthetic */ int f34150f = 0;

        /* JADX INFO: renamed from: y0.a.a.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ICustomTabsService.java */
        public static class C8555a implements ICustomTabsService {

            /* JADX INFO: renamed from: f */
            public IBinder f34151f;

            public C8555a(IBinder iBinder) {
                this.f34151f = iBinder;
            }

            @Override // p629y0.p630a.p631a.ICustomTabsService
            /* JADX INFO: renamed from: Y2 */
            public boolean mo14482Y2(long j2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    parcelObtain.writeLong(j2);
                    this.f34151f.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f34151f;
            }

            @Override // p629y0.p630a.p631a.ICustomTabsService
            /* JADX INFO: renamed from: b4 */
            public boolean mo14483b4(ICustomTabsCallback iCustomTabsCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    parcelObtain.writeStrongBinder((ICustomTabsCallback.a) iCustomTabsCallback);
                    this.f34151f.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "android.support.customtabs.ICustomTabsService");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1598968902) {
                parcel2.writeString("android.support.customtabs.ICustomTabsService");
                return true;
            }
            switch (i) {
                case 2:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    boolean zMo14482Y2 = mo14482Y2(parcel.readLong());
                    parcel2.writeNoException();
                    parcel2.writeInt(zMo14482Y2 ? 1 : 0);
                    return true;
                case 3:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    boolean zMo14483b4 = mo14483b4(ICustomTabsCallback.a.m14479E0(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(zMo14483b4 ? 1 : 0);
                    return true;
                case 4:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    boolean zM14485t1 = m14485t1(ICustomTabsCallback.a.m14479E0(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.createTypedArrayList(Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zM14485t1 ? 1 : 0);
                    return true;
                case 5:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    Bundle bundleM14486t2 = m14486t2(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    if (bundleM14486t2 != null) {
                        parcel2.writeInt(1);
                        bundleM14486t2.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 6:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    boolean zM14480O4 = m14480O4(ICustomTabsCallback.a.m14479E0(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(zM14480O4 ? 1 : 0);
                    return true;
                case 7:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    boolean zM14484p5 = m14484p5(ICustomTabsCallback.a.m14479E0(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(zM14484p5 ? 1 : 0);
                    return true;
                case 8:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    int iM14481P3 = m14481P3(ICustomTabsCallback.a.m14479E0(parcel.readStrongBinder()), parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(iM14481P3);
                    return true;
                case 9:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    boolean zM14487w1 = m14487w1(ICustomTabsCallback.a.m14479E0(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(zM14487w1 ? 1 : 0);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* JADX INFO: renamed from: O4 */
    boolean m14480O4(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: P3 */
    int m14481P3(ICustomTabsCallback iCustomTabsCallback, String str, Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: Y2 */
    boolean mo14482Y2(long j2) throws RemoteException;

    /* JADX INFO: renamed from: b4 */
    boolean mo14483b4(ICustomTabsCallback iCustomTabsCallback) throws RemoteException;

    /* JADX INFO: renamed from: p5 */
    boolean m14484p5(ICustomTabsCallback iCustomTabsCallback, Uri uri) throws RemoteException;

    /* JADX INFO: renamed from: t1 */
    boolean m14485t1(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle, List<Bundle> list) throws RemoteException;

    /* JADX INFO: renamed from: t2 */
    Bundle m14486t2(String str, Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: w1 */
    boolean m14487w1(ICustomTabsCallback iCustomTabsCallback, int i, Uri uri, Bundle bundle) throws RemoteException;
}
