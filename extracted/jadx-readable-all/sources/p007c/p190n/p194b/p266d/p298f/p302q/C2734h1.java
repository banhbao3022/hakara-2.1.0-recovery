package p007c.p190n.p194b.p266d.p298f.p302q;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;
import p007c.p190n.p194b.p266d.p314j.p322h.C4062a;

/* JADX INFO: renamed from: c.n.b.d.f.q.h1 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2734h1 extends C4062a implements InterfaceC2740j1 {
    public C2734h1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.InterfaceC2740j1
    /* JADX INFO: renamed from: c */
    public final int mo5200c() throws RemoteException {
        Parcel parcelM9327E0 = m9327E0(2, m9328i1());
        int i = parcelM9327E0.readInt();
        parcelM9327E0.recycle();
        return i;
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.InterfaceC2740j1
    /* JADX INFO: renamed from: e */
    public final InterfaceC2799a mo5201e() throws RemoteException {
        return outline.m1583e(m9327E0(1, m9328i1()));
    }
}
