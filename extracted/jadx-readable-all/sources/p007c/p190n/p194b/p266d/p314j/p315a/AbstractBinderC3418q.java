package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p267a.p279w.C2198a;
import p007c.p190n.p194b.p266d.p267a.p279w.C2204g;

/* JADX INFO: renamed from: c.n.b.d.j.a.q */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC3418q extends hg2 implements InterfaceC3455r {
    public AbstractBinderC3418q() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hg2
    /* JADX INFO: renamed from: E6 */
    public final boolean mo4735E6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        InterfaceC3536t6 c3462r6;
        InterfaceC3122i c3048g = null;
        InterfaceC3503sa c3466ra = null;
        InterfaceC3759z6 c3685x6 = null;
        InterfaceC3648w6 c3611v6 = null;
        C3012f0 c3012f0 = null;
        InterfaceC3425q6 c3351o6 = null;
        InterfaceC3314n6 c3277m6 = null;
        InterfaceC3240l6 c3203k6 = null;
        switch (i) {
            case 1:
                InterfaceC3344o interfaceC3344oMo5673c = mo5673c();
                parcel2.writeNoException();
                ig2.m7253d(parcel2, interfaceC3344oMo5673c);
                return true;
            case 2:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    c3048g = iInterfaceQueryLocalInterface instanceof InterfaceC3122i ? (InterfaceC3122i) iInterfaceQueryLocalInterface : new C3048g(strongBinder);
                }
                mo5670K0(c3048g);
                parcel2.writeNoException();
                return true;
            case 3:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
                    c3203k6 = iInterfaceQueryLocalInterface2 instanceof InterfaceC3240l6 ? (InterfaceC3240l6) iInterfaceQueryLocalInterface2 : new C3203k6(strongBinder2);
                }
                mo5668E1(c3203k6);
                parcel2.writeNoException();
                return true;
            case 4:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
                    c3277m6 = iInterfaceQueryLocalInterface3 instanceof InterfaceC3314n6 ? (InterfaceC3314n6) iInterfaceQueryLocalInterface3 : new C3277m6(strongBinder3);
                }
                mo5671L5(c3277m6);
                parcel2.writeNoException();
                return true;
            case 5:
                String string = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 == null) {
                    c3462r6 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
                    c3462r6 = iInterfaceQueryLocalInterface4 instanceof InterfaceC3536t6 ? (InterfaceC3536t6) iInterfaceQueryLocalInterface4 : new C3462r6(strongBinder4);
                }
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
                    c3351o6 = iInterfaceQueryLocalInterface5 instanceof InterfaceC3425q6 ? (InterfaceC3425q6) iInterfaceQueryLocalInterface5 : new C3351o6(strongBinder5);
                }
                mo5666B6(string, c3462r6, c3351o6);
                parcel2.writeNoException();
                return true;
            case 6:
                mo5667C5((C3165j5) ig2.m7250a(parcel, C3165j5.CREATOR));
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    c3012f0 = iInterfaceQueryLocalInterface6 instanceof C3012f0 ? (C3012f0) iInterfaceQueryLocalInterface6 : new C3012f0(strongBinder6);
                }
                mo5677s3(c3012f0);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
                    c3611v6 = iInterfaceQueryLocalInterface7 instanceof InterfaceC3648w6 ? (InterfaceC3648w6) iInterfaceQueryLocalInterface7 : new C3611v6(strongBinder7);
                }
                mo5678w2(c3611v6, (jw2) ig2.m7250a(parcel, jw2.CREATOR));
                parcel2.writeNoException();
                return true;
            case 9:
                mo5675p3((C2204g) ig2.m7250a(parcel, C2204g.CREATOR));
                parcel2.writeNoException();
                return true;
            case 10:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
                    c3685x6 = iInterfaceQueryLocalInterface8 instanceof InterfaceC3759z6 ? (InterfaceC3759z6) iInterfaceQueryLocalInterface8 : new C3685x6(strongBinder8);
                }
                mo5674c5(c3685x6);
                parcel2.writeNoException();
                return true;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                mo5676q5((C3170ja) ig2.m7250a(parcel, C3170ja.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
                    c3466ra = iInterfaceQueryLocalInterface9 instanceof InterfaceC3503sa ? (InterfaceC3503sa) iInterfaceQueryLocalInterface9 : new C3466ra(strongBinder9);
                }
                mo5672Q0(c3466ra);
                parcel2.writeNoException();
                return true;
            case 15:
                mo5669I2((C2198a) ig2.m7250a(parcel, C2198a.CREATOR));
                parcel2.writeNoException();
                return true;
        }
    }
}
