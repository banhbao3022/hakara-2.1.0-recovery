package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: renamed from: c.n.b.d.j.a.d1 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC2939d1 extends hg2 implements InterfaceC2976e1 {
    public AbstractBinderC2939d1() {
        super("com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hg2
    /* JADX INFO: renamed from: E6 */
    public final boolean mo4735E6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            String str = ((a60) this).f12023f;
            parcel2.writeNoException();
            parcel2.writeString(str);
        } else if (i == 2) {
            String str2 = ((a60) this).f12024g;
            parcel2.writeNoException();
            parcel2.writeString(str2);
        } else {
            if (i != 3) {
                return false;
            }
            List<ow2> listMo5695f = ((a60) this).mo5695f();
            parcel2.writeNoException();
            parcel2.writeTypedList(listMo5695f);
        }
        return true;
    }
}
