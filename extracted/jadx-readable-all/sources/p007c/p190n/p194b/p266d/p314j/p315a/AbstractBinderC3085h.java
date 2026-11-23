package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: c.n.b.d.j.a.h */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC3085h extends hg2 implements InterfaceC3122i {
    public AbstractBinderC3085h() {
        super("com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hg2
    /* JADX INFO: renamed from: E6 */
    public final boolean mo4735E6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                mo5872a();
                break;
            case 2:
                mo5871L(parcel.readInt());
                break;
            case 3:
                break;
            case 4:
                mo5874d();
                break;
            case 5:
                mo5875f();
                break;
            case 6:
                mo5876g();
                break;
            case 7:
                mo5877i();
                break;
            case 8:
                mo5870D0((yv2) ig2.m7250a(parcel, yv2.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
