package p007c.p190n.p194b.p266d.p314j.p320f;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Map;
import p007c.p190n.p194b.p266d.p290d.p291r.C2424b;
import p007c.p190n.p194b.p266d.p290d.p291r.C2425b0;
import p007c.p190n.p194b.p266d.p290d.p291r.C2433f0;
import p007c.p190n.p194b.p266d.p290d.p291r.C2439i0;
import p007c.p190n.p194b.p266d.p290d.p291r.C2514z;
import p007c.p190n.p194b.p266d.p290d.p291r.InterfaceC2423a0;
import p007c.p190n.p194b.p266d.p290d.p291r.InterfaceC2429d0;
import p007c.p190n.p194b.p266d.p290d.p291r.InterfaceC2435g0;
import p007c.p190n.p194b.p266d.p290d.p291r.InterfaceC2501m0;
import p007c.p190n.p194b.p266d.p290d.p291r.InterfaceC2510v;
import p007c.p190n.p194b.p266d.p290d.p291r.InterfaceC2512x;
import p007c.p190n.p194b.p266d.p290d.p291r.p292l.p293i.C2469j;
import p007c.p190n.p194b.p266d.p290d.p291r.p292l.p293i.InterfaceC2467h;
import p007c.p190n.p194b.p266d.p290d.p291r.p292l.p293i.InterfaceC2468i;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: renamed from: c.n.b.d.j.f.k */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3908k extends C3988s implements InterfaceC3878h {
    public C3908k(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.InterfaceC3878h
    /* JADX INFO: renamed from: D4 */
    public final InterfaceC2467h mo9030D4(InterfaceC2799a interfaceC2799a, InterfaceC2468i interfaceC2468i, int i, int i2, boolean z, long j2, int i3, int i4, int i5) throws RemoteException {
        InterfaceC2467h c2469j;
        Parcel parcelM9209E0 = m9209E0();
        C4016v.m9268b(parcelM9209E0, interfaceC2799a);
        C4016v.m9268b(parcelM9209E0, interfaceC2468i);
        parcelM9209E0.writeInt(i);
        parcelM9209E0.writeInt(i2);
        parcelM9209E0.writeInt(z ? 1 : 0);
        parcelM9209E0.writeLong(j2);
        parcelM9209E0.writeInt(i3);
        parcelM9209E0.writeInt(i4);
        parcelM9209E0.writeInt(i5);
        Parcel parcelM9212i1 = m9212i1(6, parcelM9209E0);
        IBinder strongBinder = parcelM9212i1.readStrongBinder();
        int i6 = InterfaceC2467h.a.f11321f;
        if (strongBinder == null) {
            c2469j = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
            c2469j = iInterfaceQueryLocalInterface instanceof InterfaceC2467h ? (InterfaceC2467h) iInterfaceQueryLocalInterface : new C2469j(strongBinder);
        }
        parcelM9212i1.recycle();
        return c2469j;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.InterfaceC3878h
    /* JADX INFO: renamed from: H1 */
    public final InterfaceC2435g0 mo9031H1(String str, String str2, InterfaceC2501m0 interfaceC2501m0) throws RemoteException {
        InterfaceC2435g0 c2439i0;
        Parcel parcelM9209E0 = m9209E0();
        parcelM9209E0.writeString(str);
        parcelM9209E0.writeString(str2);
        C4016v.m9268b(parcelM9209E0, interfaceC2501m0);
        Parcel parcelM9212i1 = m9212i1(2, parcelM9209E0);
        IBinder strongBinder = parcelM9212i1.readStrongBinder();
        int i = InterfaceC2435g0.a.f11186f;
        if (strongBinder == null) {
            c2439i0 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ISession");
            c2439i0 = iInterfaceQueryLocalInterface instanceof InterfaceC2435g0 ? (InterfaceC2435g0) iInterfaceQueryLocalInterface : new C2439i0(strongBinder);
        }
        parcelM9212i1.recycle();
        return c2439i0;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.InterfaceC3878h
    /* JADX INFO: renamed from: J0 */
    public final InterfaceC2423a0 mo9032J0(C2424b c2424b, InterfaceC2799a interfaceC2799a, InterfaceC2510v interfaceC2510v) throws RemoteException {
        InterfaceC2423a0 c2425b0;
        Parcel parcelM9209E0 = m9209E0();
        C4016v.m9269c(parcelM9209E0, c2424b);
        C4016v.m9268b(parcelM9209E0, interfaceC2799a);
        C4016v.m9268b(parcelM9209E0, interfaceC2510v);
        Parcel parcelM9212i1 = m9212i1(3, parcelM9209E0);
        IBinder strongBinder = parcelM9212i1.readStrongBinder();
        int i = InterfaceC2423a0.a.f11151f;
        if (strongBinder == null) {
            c2425b0 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastSession");
            c2425b0 = iInterfaceQueryLocalInterface instanceof InterfaceC2423a0 ? (InterfaceC2423a0) iInterfaceQueryLocalInterface : new C2425b0(strongBinder);
        }
        parcelM9212i1.recycle();
        return c2425b0;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.InterfaceC3878h
    /* JADX INFO: renamed from: e1 */
    public final InterfaceC2512x mo9033e1(InterfaceC2799a interfaceC2799a, C2424b c2424b, InterfaceC3898j interfaceC3898j, Map map) throws RemoteException {
        InterfaceC2512x c2514z;
        Parcel parcelM9209E0 = m9209E0();
        C4016v.m9268b(parcelM9209E0, interfaceC2799a);
        C4016v.m9269c(parcelM9209E0, c2424b);
        C4016v.m9268b(parcelM9209E0, interfaceC3898j);
        parcelM9209E0.writeMap(map);
        Parcel parcelM9212i1 = m9212i1(1, parcelM9209E0);
        IBinder strongBinder = parcelM9212i1.readStrongBinder();
        int i = InterfaceC2512x.a.f11368f;
        if (strongBinder == null) {
            c2514z = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastContext");
            c2514z = iInterfaceQueryLocalInterface instanceof InterfaceC2512x ? (InterfaceC2512x) iInterfaceQueryLocalInterface : new C2514z(strongBinder);
        }
        parcelM9212i1.recycle();
        return c2514z;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.InterfaceC3878h
    /* JADX INFO: renamed from: e4 */
    public final InterfaceC2429d0 mo9034e4(InterfaceC2799a interfaceC2799a, InterfaceC2799a interfaceC2799a2, InterfaceC2799a interfaceC2799a3) throws RemoteException {
        InterfaceC2429d0 c2433f0;
        Parcel parcelM9209E0 = m9209E0();
        C4016v.m9268b(parcelM9209E0, interfaceC2799a);
        C4016v.m9268b(parcelM9209E0, interfaceC2799a2);
        C4016v.m9268b(parcelM9209E0, interfaceC2799a3);
        Parcel parcelM9212i1 = m9212i1(5, parcelM9209E0);
        IBinder strongBinder = parcelM9212i1.readStrongBinder();
        int i = InterfaceC2429d0.a.f11184f;
        if (strongBinder == null) {
            c2433f0 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.cast.framework.IReconnectionService");
            c2433f0 = iInterfaceQueryLocalInterface instanceof InterfaceC2429d0 ? (InterfaceC2429d0) iInterfaceQueryLocalInterface : new C2433f0(strongBinder);
        }
        parcelM9212i1.recycle();
        return c2433f0;
    }
}
