package p629y0.p630a.p631a;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p636z0.p663d.p664a.CustomTabsClient;
import p636z0.p663d.p664a.CustomTabsClient2;
import p636z0.p663d.p664a.CustomTabsClient3;
import p636z0.p663d.p664a.CustomTabsClient4;
import p636z0.p663d.p664a.CustomTabsClient5;
import p636z0.p663d.p664a.CustomTabsClient6;

/* JADX INFO: renamed from: y0.a.a.a, reason: use source file name */
/* JADX INFO: compiled from: ICustomTabsCallback.java */
/* JADX INFO: loaded from: classes.dex */
public interface ICustomTabsCallback extends IInterface {

    /* JADX INFO: renamed from: y0.a.a.a$a */
    /* JADX INFO: compiled from: ICustomTabsCallback.java */
    public static abstract class a extends Binder implements ICustomTabsCallback {

        /* JADX INFO: renamed from: y0.a.a.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ICustomTabsCallback.java */
        public static class C8554a implements ICustomTabsCallback {

            /* JADX INFO: renamed from: f */
            public IBinder f34149f;

            public C8554a(IBinder iBinder) {
                this.f34149f = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f34149f;
            }
        }

        public a() {
            attachInterface(this, "android.support.customtabs.ICustomTabsCallback");
        }

        /* JADX INFO: renamed from: E0 */
        public static ICustomTabsCallback m14479E0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ICustomTabsCallback)) ? new C8554a(iBinder) : (ICustomTabsCallback) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            Bundle bundle;
            if (i == 2) {
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                int i3 = parcel.readInt();
                bundle = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                CustomTabsClient6 customTabsClient6 = (CustomTabsClient6) this;
                if (customTabsClient6.f35366g != null) {
                    customTabsClient6.f35365f.post(new CustomTabsClient(customTabsClient6, i3, bundle));
                }
                parcel2.writeNoException();
                return true;
            }
            if (i == 3) {
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                String string = parcel.readString();
                bundle = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                CustomTabsClient6 customTabsClient7 = (CustomTabsClient6) this;
                if (customTabsClient7.f35366g != null) {
                    customTabsClient7.f35365f.post(new CustomTabsClient2(customTabsClient7, string, bundle));
                }
                parcel2.writeNoException();
                return true;
            }
            if (i == 4) {
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                bundle = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                CustomTabsClient6 customTabsClient8 = (CustomTabsClient6) this;
                if (customTabsClient8.f35366g != null) {
                    customTabsClient8.f35365f.post(new CustomTabsClient3(customTabsClient8, bundle));
                }
                parcel2.writeNoException();
                return true;
            }
            if (i == 5) {
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                String string2 = parcel.readString();
                bundle = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                CustomTabsClient6 customTabsClient9 = (CustomTabsClient6) this;
                if (customTabsClient9.f35366g != null) {
                    customTabsClient9.f35365f.post(new CustomTabsClient4(customTabsClient9, string2, bundle));
                }
                parcel2.writeNoException();
                return true;
            }
            if (i != 6) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString("android.support.customtabs.ICustomTabsCallback");
                return true;
            }
            parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
            int i4 = parcel.readInt();
            Uri uri = parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null;
            boolean z = parcel.readInt() != 0;
            Bundle bundle2 = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
            CustomTabsClient6 customTabsClient10 = (CustomTabsClient6) this;
            if (customTabsClient10.f35366g != null) {
                customTabsClient10.f35365f.post(new CustomTabsClient5(customTabsClient10, i4, uri, z, bundle2));
            }
            parcel2.writeNoException();
            return true;
        }
    }
}
