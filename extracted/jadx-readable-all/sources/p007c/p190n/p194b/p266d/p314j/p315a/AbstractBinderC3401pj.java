package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: renamed from: c.n.b.d.j.a.pj */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC3401pj extends hg2 implements InterfaceC3438qj {
    public AbstractBinderC3401pj() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    /* JADX INFO: renamed from: F6 */
    public static InterfaceC3438qj m8119F6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC3438qj ? (InterfaceC3438qj) iInterfaceQueryLocalInterface : new C3364oj(iBinder);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hg2
    /* JADX INFO: renamed from: E6 */
    public final boolean mo4735E6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                mo8030h0(InterfaceC2799a.a.m5638i1(parcel.readStrongBinder()));
                break;
            case 2:
                mo8211P2(InterfaceC2799a.a.m5638i1(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 3:
                mo8033q0(InterfaceC2799a.a.m5638i1(parcel.readStrongBinder()));
                break;
            case 4:
                mo8031k0(InterfaceC2799a.a.m5638i1(parcel.readStrongBinder()));
                break;
            case 5:
                mo8028R(InterfaceC2799a.a.m5638i1(parcel.readStrongBinder()));
                break;
            case 6:
                mo8027M4(InterfaceC2799a.a.m5638i1(parcel.readStrongBinder()));
                break;
            case 7:
                mo8029V0(InterfaceC2799a.a.m5638i1(parcel.readStrongBinder()), (C3475rj) ig2.m7250a(parcel, C3475rj.CREATOR));
                break;
            case 8:
                mo8032l6(InterfaceC2799a.a.m5638i1(parcel.readStrongBinder()));
                break;
            case 9:
                mo8026H2(InterfaceC2799a.a.m5638i1(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 10:
                mo8210H(InterfaceC2799a.a.m5638i1(parcel.readStrongBinder()));
                break;
            case 11:
                mo8034z1(InterfaceC2799a.a.m5638i1(parcel.readStrongBinder()));
                break;
            case 12:
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
