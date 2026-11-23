package p007c.p190n.p194b.p266d.p298f;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import p007c.p190n.p194b.p266d.p298f.p302q.AbstractBinderC2737i1;
import p007c.p190n.p194b.p266d.p298f.p302q.C2734h1;
import p007c.p190n.p194b.p266d.p298f.p302q.InterfaceC2740j1;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: renamed from: c.n.b.d.f.m0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2625m0 extends AbstractC2767a {
    public static final Parcelable.Creator<C2625m0> CREATOR = new C2627n0();

    /* JADX INFO: renamed from: f */
    public final String f11601f;

    /* JADX INFO: renamed from: g */
    public final AbstractBinderC2607d0 f11602g;

    /* JADX INFO: renamed from: h */
    public final boolean f11603h;

    /* JADX INFO: renamed from: i */
    public final boolean f11604i;

    public C2625m0(String str, IBinder iBinder, boolean z, boolean z2) {
        this.f11601f = str;
        BinderC2609e0 binderC2609e0 = null;
        if (iBinder != null) {
            try {
                int i = AbstractBinderC2737i1.f11880f;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
                InterfaceC2799a interfaceC2799aMo5201e = (iInterfaceQueryLocalInterface instanceof InterfaceC2740j1 ? (InterfaceC2740j1) iInterfaceQueryLocalInterface : new C2734h1(iBinder)).mo5201e();
                byte[] bArr = interfaceC2799aMo5201e == null ? null : (byte[]) BinderC2800b.m5639T1(interfaceC2799aMo5201e);
                if (bArr != null) {
                    binderC2609e0 = new BinderC2609e0(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e);
            }
        }
        this.f11602g = binderC2609e0;
        this.f11603h = z;
        this.f11604i = z2;
    }

    public C2625m0(String str, AbstractBinderC2607d0 abstractBinderC2607d0, boolean z, boolean z2) {
        this.f11601f = str;
        this.f11602g = abstractBinderC2607d0;
        this.f11603h = z;
        this.f11604i = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        C2622l.m5315U(parcel, 1, this.f11601f, false);
        AbstractBinderC2607d0 abstractBinderC2607d0 = this.f11602g;
        if (abstractBinderC2607d0 == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            abstractBinderC2607d0 = null;
        }
        C2622l.m5303R(parcel, 2, abstractBinderC2607d0, false);
        boolean z = this.f11603h;
        parcel.writeInt(262147);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.f11604i;
        parcel.writeInt(262148);
        parcel.writeInt(z2 ? 1 : 0);
        C2622l.m5447v2(parcel, iM5239D1);
    }
}
