package p007c.p190n.p194b.p266d.p298f;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;

/* JADX INFO: renamed from: c.n.b.d.f.k0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2621k0 extends AbstractC2767a {
    public static final Parcelable.Creator<C2621k0> CREATOR = new C2623l0();

    /* JADX INFO: renamed from: f */
    public final boolean f11590f;

    /* JADX INFO: renamed from: g */
    public final String f11591g;

    /* JADX INFO: renamed from: h */
    public final int f11592h;

    public C2621k0(boolean z, String str, int i) {
        this.f11590f = z;
        this.f11591g = str;
        this.f11592h = C2622l.m5431s1(i) - 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        boolean z = this.f11590f;
        parcel.writeInt(262145);
        parcel.writeInt(z ? 1 : 0);
        C2622l.m5315U(parcel, 2, this.f11591g, false);
        int i2 = this.f11592h;
        parcel.writeInt(262147);
        parcel.writeInt(i2);
        C2622l.m5447v2(parcel, iM5239D1);
    }
}
