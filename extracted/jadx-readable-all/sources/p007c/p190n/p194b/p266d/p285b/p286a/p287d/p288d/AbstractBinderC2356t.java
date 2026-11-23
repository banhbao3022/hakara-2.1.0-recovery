package p007c.p190n.p194b.p266d.p285b.p286a.p287d.p288d;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import p007c.p190n.p194b.p266d.p314j.p317c.BinderC3794b;
import p007c.p190n.p194b.p266d.p314j.p317c.C3796d;

/* JADX INFO: renamed from: c.n.b.d.b.a.d.d.t */
/* JADX INFO: compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC2356t extends BinderC3794b implements InterfaceC2353q {
    public AbstractBinderC2356t() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p317c.BinderC3794b
    /* JADX INFO: renamed from: E0 */
    public final boolean mo4934E0(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 101:
                throw new UnsupportedOperationException();
            case 102:
                mo4920k1((Status) C3796d.m8921a(parcel, Status.CREATOR));
                break;
            case 103:
                mo4919R1((Status) C3796d.m8921a(parcel, Status.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
