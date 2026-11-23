package p007c.p190n.p194b.p266d.p267a.p279w;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;
import p007c.p190n.p194b.p266d.p314j.p315a.AbstractBinderC2826a0;
import p007c.p190n.p194b.p266d.p314j.p315a.C3752z;
import p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2863b0;

/* JADX INFO: renamed from: c.n.b.d.a.w.g */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class C2204g extends AbstractC2767a {

    @RecentlyNonNull
    public static final Parcelable.Creator<C2204g> CREATOR = new C2209l();

    /* JADX INFO: renamed from: f */
    public final boolean f10612f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC2863b0 f10613g;

    /* JADX INFO: renamed from: h */
    public final IBinder f10614h;

    public C2204g(boolean z, IBinder iBinder, IBinder iBinder2) {
        InterfaceC2863b0 c3752z;
        this.f10612f = z;
        if (iBinder != null) {
            int i = AbstractBinderC2826a0.f11990f;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
            c3752z = iInterfaceQueryLocalInterface instanceof InterfaceC2863b0 ? (InterfaceC2863b0) iInterfaceQueryLocalInterface : new C3752z(iBinder);
        } else {
            c3752z = null;
        }
        this.f10613g = c3752z;
        this.f10614h = iBinder2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        boolean z = this.f10612f;
        parcel.writeInt(262145);
        parcel.writeInt(z ? 1 : 0);
        InterfaceC2863b0 interfaceC2863b0 = this.f10613g;
        C2622l.m5303R(parcel, 2, interfaceC2863b0 == null ? null : interfaceC2863b0.asBinder(), false);
        C2622l.m5303R(parcel, 3, this.f10614h, false);
        C2622l.m5447v2(parcel, iM5239D1);
    }
}
