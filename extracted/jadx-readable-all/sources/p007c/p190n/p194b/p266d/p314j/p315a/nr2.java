package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class nr2 extends gg2 implements IInterface {
    public nr2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    /* JADX INFO: renamed from: K2 */
    public final ir2 m7932K2(lr2 lr2Var) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        ig2.m7251b(parcelM7001E0, lr2Var);
        Parcel parcelM7003i1 = m7003i1(1, parcelM7001E0);
        ir2 ir2Var = (ir2) ig2.m7250a(parcelM7003i1, ir2.CREATOR);
        parcelM7003i1.recycle();
        return ir2Var;
    }

    /* JADX INFO: renamed from: q3 */
    public final ir2 m7933q3(lr2 lr2Var) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        ig2.m7251b(parcelM7001E0, lr2Var);
        Parcel parcelM7003i1 = m7003i1(2, parcelM7001E0);
        ir2 ir2Var = (ir2) ig2.m7250a(parcelM7003i1, ir2.CREATOR);
        parcelM7003i1.recycle();
        return ir2Var;
    }
}
