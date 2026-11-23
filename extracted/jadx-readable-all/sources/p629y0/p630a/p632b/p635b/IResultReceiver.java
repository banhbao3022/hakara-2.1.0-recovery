package p629y0.p630a.p632b.p635b;

import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p629y0.p630a.p632b.p635b.ResultReceiver.c;

/* JADX INFO: renamed from: y0.a.b.b.a, reason: use source file name */
/* JADX INFO: compiled from: IResultReceiver.java */
/* JADX INFO: loaded from: classes.dex */
public interface IResultReceiver extends IInterface {

    /* JADX INFO: renamed from: y0.a.b.b.a$a */
    /* JADX INFO: compiled from: IResultReceiver.java */
    public static abstract class a extends Binder implements IResultReceiver {

        /* JADX INFO: renamed from: f */
        public static final /* synthetic */ int f34156f = 0;

        /* JADX INFO: renamed from: y0.a.b.b.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: IResultReceiver.java */
        public static class C8558a implements IResultReceiver {

            /* JADX INFO: renamed from: f */
            public IBinder f34157f;

            public C8558a(IBinder iBinder) {
                this.f34157f = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f34157f;
            }
        }

        public a() {
            attachInterface(this, "android.support.v4.os.IResultReceiver");
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
                parcel2.writeString("android.support.v4.os.IResultReceiver");
                return true;
            }
            parcel.enforceInterface("android.support.v4.os.IResultReceiver");
            int i3 = parcel.readInt();
            Bundle bundle = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
            ResultReceiver resultReceiver = ResultReceiver.this;
            Handler handler = resultReceiver.f34158f;
            if (handler != null) {
                handler.post(resultReceiver.new c(i3, bundle));
            } else {
                resultReceiver.mo9a(i3, bundle);
            }
            return true;
        }
    }
}
