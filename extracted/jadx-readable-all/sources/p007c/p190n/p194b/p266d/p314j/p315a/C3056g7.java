package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: renamed from: c.n.b.d.j.a.g7 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3056g7 extends gg2 implements InterfaceC3130i7 {
    public C3056g7(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3130i7
    /* JADX INFO: renamed from: C */
    public final InterfaceC2799a mo6818C() throws RemoteException {
        return outline.m1583e(m7003i1(19, m7001E0()));
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3130i7
    /* JADX INFO: renamed from: c */
    public final String mo6828c() throws RemoteException {
        Parcel parcelM7003i1 = m7003i1(2, m7001E0());
        String string = parcelM7003i1.readString();
        parcelM7003i1.recycle();
        return string;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3130i7
    /* JADX INFO: renamed from: d */
    public final List mo6829d() throws RemoteException {
        Parcel parcelM7003i1 = m7003i1(3, m7001E0());
        ArrayList arrayList = parcelM7003i1.readArrayList(ig2.f15182a);
        parcelM7003i1.recycle();
        return arrayList;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3130i7
    /* JADX INFO: renamed from: f */
    public final String mo6830f() throws RemoteException {
        Parcel parcelM7003i1 = m7003i1(4, m7001E0());
        String string = parcelM7003i1.readString();
        parcelM7003i1.recycle();
        return string;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3130i7
    /* JADX INFO: renamed from: g */
    public final InterfaceC3610v5 mo6831g() throws RemoteException {
        InterfaceC3610v5 c3535t5;
        Parcel parcelM7003i1 = m7003i1(5, m7001E0());
        IBinder strongBinder = parcelM7003i1.readStrongBinder();
        if (strongBinder == null) {
            c3535t5 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            c3535t5 = iInterfaceQueryLocalInterface instanceof InterfaceC3610v5 ? (InterfaceC3610v5) iInterfaceQueryLocalInterface : new C3535t5(strongBinder);
        }
        parcelM7003i1.recycle();
        return c3535t5;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3130i7
    /* JADX INFO: renamed from: h */
    public final String mo6832h() throws RemoteException {
        Parcel parcelM7003i1 = m7003i1(7, m7001E0());
        String string = parcelM7003i1.readString();
        parcelM7003i1.recycle();
        return string;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3130i7
    /* JADX INFO: renamed from: i */
    public final String mo6833i() throws RemoteException {
        Parcel parcelM7003i1 = m7003i1(6, m7001E0());
        String string = parcelM7003i1.readString();
        parcelM7003i1.recycle();
        return string;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3130i7
    /* JADX INFO: renamed from: j */
    public final String mo6834j() throws RemoteException {
        Parcel parcelM7003i1 = m7003i1(9, m7001E0());
        String string = parcelM7003i1.readString();
        parcelM7003i1.recycle();
        return string;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3130i7
    /* JADX INFO: renamed from: k */
    public final double mo6835k() throws RemoteException {
        Parcel parcelM7003i1 = m7003i1(8, m7001E0());
        double d = parcelM7003i1.readDouble();
        parcelM7003i1.recycle();
        return d;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3130i7
    /* JADX INFO: renamed from: l */
    public final InterfaceC3350o5 mo6836l() throws RemoteException {
        InterfaceC3350o5 c3276m5;
        Parcel parcelM7003i1 = m7003i1(14, m7001E0());
        IBinder strongBinder = parcelM7003i1.readStrongBinder();
        if (strongBinder == null) {
            c3276m5 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            c3276m5 = iInterfaceQueryLocalInterface instanceof InterfaceC3350o5 ? (InterfaceC3350o5) iInterfaceQueryLocalInterface : new C3276m5(strongBinder);
        }
        parcelM7003i1.recycle();
        return c3276m5;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3130i7
    /* JADX INFO: renamed from: m */
    public final String mo6837m() throws RemoteException {
        Parcel parcelM7003i1 = m7003i1(10, m7001E0());
        String string = parcelM7003i1.readString();
        parcelM7003i1.recycle();
        return string;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3130i7
    /* JADX INFO: renamed from: p */
    public final InterfaceC3087h1 mo6838p() throws RemoteException {
        Parcel parcelM7003i1 = m7003i1(11, m7001E0());
        InterfaceC3087h1 interfaceC3087h1M6893F6 = AbstractBinderC3050g1.m6893F6(parcelM7003i1.readStrongBinder());
        parcelM7003i1.recycle();
        return interfaceC3087h1M6893F6;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3130i7
    /* JADX INFO: renamed from: v */
    public final List mo6839v() throws RemoteException {
        Parcel parcelM7003i1 = m7003i1(23, m7001E0());
        ArrayList arrayList = parcelM7003i1.readArrayList(ig2.f15182a);
        parcelM7003i1.recycle();
        return arrayList;
    }
}
