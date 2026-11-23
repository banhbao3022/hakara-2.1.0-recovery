package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Parcel;
import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;

/* JADX INFO: renamed from: c.n.b.d.j.a.ca */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC2911ca extends hg2 implements InterfaceC2948da {
    public AbstractBinderC2911ca() {
        super("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hg2
    /* JADX INFO: renamed from: E6 */
    public final boolean mo4735E6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            kq0 kq0Var = (kq0) this;
            synchronized (kq0Var.f16013f) {
                lq0.m7601c(kq0Var.f16017j, kq0Var.f16014g, true, "", (int) (C2330u.f10884a.f10896k.mo5621a() - kq0Var.f16015h));
                kq0Var.f16017j.f16453l.m8812b(kq0Var.f16014g);
                kq0Var.f16017j.f16456o.m7108A0(new jb0(kq0Var.f16014g));
                kq0Var.f16016i.m7286a(Boolean.TRUE);
            }
        } else {
            if (i != 3) {
                return false;
            }
            ((kq0) this).mo5941S(parcel.readString());
        }
        parcel2.writeNoException();
        return true;
    }
}
