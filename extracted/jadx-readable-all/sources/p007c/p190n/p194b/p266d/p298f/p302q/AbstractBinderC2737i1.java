package p007c.p190n.p194b.p266d.p298f.p302q;

import android.os.Parcel;
import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p298f.AbstractBinderC2607d0;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;
import p007c.p190n.p194b.p266d.p314j.p322h.BinderC4063b;
import p007c.p190n.p194b.p266d.p314j.p322h.C4064c;

/* JADX INFO: renamed from: c.n.b.d.f.q.i1 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC2737i1 extends BinderC4063b implements InterfaceC2740j1 {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ int f11880f = 0;

    public AbstractBinderC2737i1() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p322h.BinderC4063b
    /* JADX INFO: renamed from: E0 */
    public final boolean mo5598E0(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            InterfaceC2799a interfaceC2799aMo5201e = ((AbstractBinderC2607d0) this).mo5201e();
            parcel2.writeNoException();
            C4064c.m9330b(parcel2, interfaceC2799aMo5201e);
        } else {
            if (i != 2) {
                return false;
            }
            int i3 = ((AbstractBinderC2607d0) this).f11561g;
            parcel2.writeNoException();
            parcel2.writeInt(i3);
        }
        return true;
    }
}
