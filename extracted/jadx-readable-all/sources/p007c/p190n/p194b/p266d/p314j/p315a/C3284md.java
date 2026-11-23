package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: c.n.b.d.j.a.md */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3284md extends gg2 implements InterfaceC3395pd {
    public C3284md(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3395pd
    /* JADX INFO: renamed from: E */
    public final boolean mo7583E(String str) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        parcelM7001E0.writeString(str);
        Parcel parcelM7003i1 = m7003i1(2, parcelM7001E0);
        ClassLoader classLoader = ig2.f15182a;
        boolean z = parcelM7003i1.readInt() != 0;
        parcelM7003i1.recycle();
        return z;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3395pd
    /* JADX INFO: renamed from: S */
    public final InterfaceC3249lf mo7584S(String str) throws RemoteException {
        InterfaceC3249lf c3175jf;
        Parcel parcelM7001E0 = m7001E0();
        parcelM7001E0.writeString(str);
        Parcel parcelM7003i1 = m7003i1(3, parcelM7001E0);
        IBinder strongBinder = parcelM7003i1.readStrongBinder();
        int i = AbstractBinderC3212kf.f15931f;
        if (strongBinder == null) {
            c3175jf = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
            c3175jf = iInterfaceQueryLocalInterface instanceof InterfaceC3249lf ? (InterfaceC3249lf) iInterfaceQueryLocalInterface : new C3175jf(strongBinder);
        }
        parcelM7003i1.recycle();
        return c3175jf;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3395pd
    /* JADX INFO: renamed from: o0 */
    public final boolean mo7585o0(String str) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        parcelM7001E0.writeString(str);
        Parcel parcelM7003i1 = m7003i1(4, parcelM7001E0);
        ClassLoader classLoader = ig2.f15182a;
        boolean z = parcelM7003i1.readInt() != 0;
        parcelM7003i1.recycle();
        return z;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3395pd
    /* JADX INFO: renamed from: t */
    public final InterfaceC3506sd mo7586t(String str) throws RemoteException {
        InterfaceC3506sd c3432qd;
        Parcel parcelM7001E0 = m7001E0();
        parcelM7001E0.writeString(str);
        Parcel parcelM7003i1 = m7003i1(1, parcelM7001E0);
        IBinder strongBinder = parcelM7003i1.readStrongBinder();
        if (strongBinder == null) {
            c3432qd = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            c3432qd = iInterfaceQueryLocalInterface instanceof InterfaceC3506sd ? (InterfaceC3506sd) iInterfaceQueryLocalInterface : new C3432qd(strongBinder);
        }
        parcelM7003i1.recycle();
        return c3432qd;
    }
}
