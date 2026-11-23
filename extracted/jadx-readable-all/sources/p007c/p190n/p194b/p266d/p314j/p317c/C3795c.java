package p007c.p190n.p194b.p266d.p314j.p317c;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: c.n.b.d.j.c.c */
/* JADX INFO: compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class C3795c implements IInterface {

    /* JADX INFO: renamed from: f */
    public final IBinder f22464f;

    /* JADX INFO: renamed from: g */
    public final String f22465g;

    public C3795c(IBinder iBinder, String str) {
        this.f22464f = iBinder;
        this.f22465g = str;
    }

    /* JADX INFO: renamed from: E0 */
    public final void m8920E0(int i, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f22464f.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f22464f;
    }
}
