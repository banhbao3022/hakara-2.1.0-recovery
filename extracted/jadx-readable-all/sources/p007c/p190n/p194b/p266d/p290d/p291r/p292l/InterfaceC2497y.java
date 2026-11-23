package p007c.p190n.p194b.p266d.p290d.p291r.p292l;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;
import p007c.p190n.p194b.p266d.p314j.p320f.BinderC3808a;
import p007c.p190n.p194b.p266d.p314j.p320f.C4016v;

/* JADX INFO: renamed from: c.n.b.d.d.r.l.y */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2497y extends IInterface {

    /* JADX INFO: renamed from: c.n.b.d.d.r.l.y$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
    public static abstract class a extends BinderC3808a implements InterfaceC2497y {
        public a() {
            super("com.google.android.gms.cast.framework.media.INotificationActionsProvider");
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p320f.BinderC3808a
        /* JADX INFO: renamed from: E0 */
        public final boolean mo5103E0(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel2.writeNoException();
                parcel2.writeInt(12451009);
            } else if (i == 2) {
                BinderC2800b binderC2800b = new BinderC2800b(AbstractC2454f.this);
                parcel2.writeNoException();
                C4016v.m9268b(parcel2, binderC2800b);
            } else if (i == 3) {
                List<C2452e> listM5057b = AbstractC2454f.this.m5057b();
                parcel2.writeNoException();
                parcel2.writeTypedList(listM5057b);
            } else {
                if (i != 4) {
                    return false;
                }
                int[] iArrM5056a = AbstractC2454f.this.m5056a();
                parcel2.writeNoException();
                parcel2.writeIntArray(iArrM5056a);
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: O3 */
    int[] mo5037O3() throws RemoteException;

    /* JADX INFO: renamed from: v1 */
    List<C2452e> mo5038v1() throws RemoteException;
}
