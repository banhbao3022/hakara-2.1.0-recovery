package p007c.p190n.p194b.p266d.p285b.p286a.p287d.p288d;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import p007c.p190n.p194b.p266d.p314j.p317c.BinderC3794b;
import p007c.p190n.p194b.p266d.p314j.p317c.C3795c;
import p007c.p190n.p194b.p266d.p314j.p317c.C3796d;

/* JADX INFO: renamed from: c.n.b.d.b.a.d.d.v */
/* JADX INFO: compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2358v extends C3795c implements InterfaceC2355s {
    public C2358v(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p007c.p190n.p194b.p266d.p285b.p286a.p287d.p288d.InterfaceC2355s
    /* JADX INFO: renamed from: W4 */
    public final void mo4935W4(InterfaceC2353q interfaceC2353q, GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f22465g);
        int i = C3796d.f22466a;
        parcelObtain.writeStrongBinder((BinderC3794b) interfaceC2353q);
        if (googleSignInOptions == null) {
            parcelObtain.writeInt(0);
        } else {
            parcelObtain.writeInt(1);
            googleSignInOptions.writeToParcel(parcelObtain, 0);
        }
        m8920E0(102, parcelObtain);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p007c.p190n.p194b.p266d.p285b.p286a.p287d.p288d.InterfaceC2355s
    /* JADX INFO: renamed from: d4 */
    public final void mo4936d4(InterfaceC2353q interfaceC2353q, GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f22465g);
        int i = C3796d.f22466a;
        parcelObtain.writeStrongBinder((BinderC3794b) interfaceC2353q);
        if (googleSignInOptions == null) {
            parcelObtain.writeInt(0);
        } else {
            parcelObtain.writeInt(1);
            googleSignInOptions.writeToParcel(parcelObtain, 0);
        }
        m8920E0(103, parcelObtain);
    }
}
