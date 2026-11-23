package p007c.p190n.p194b.p266d.p298f.p302q;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;

/* JADX INFO: renamed from: c.n.b.d.f.q.u */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public class C2761u extends AbstractC2767a {

    @RecentlyNonNull
    public static final Parcelable.Creator<C2761u> CREATOR = new C2750o0();

    /* JADX INFO: renamed from: f */
    public final int f11918f;

    /* JADX INFO: renamed from: g */
    public final boolean f11919g;

    /* JADX INFO: renamed from: h */
    public final boolean f11920h;

    /* JADX INFO: renamed from: i */
    public final int f11921i;

    /* JADX INFO: renamed from: j */
    public final int f11922j;

    public C2761u(int i, boolean z, boolean z2, int i2, int i3) {
        this.f11918f = i;
        this.f11919g = z;
        this.f11920h = z2;
        this.f11921i = i2;
        this.f11922j = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        int i2 = this.f11918f;
        parcel.writeInt(262145);
        parcel.writeInt(i2);
        boolean z = this.f11919g;
        parcel.writeInt(262146);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.f11920h;
        parcel.writeInt(262147);
        parcel.writeInt(z2 ? 1 : 0);
        int i3 = this.f11921i;
        parcel.writeInt(262148);
        parcel.writeInt(i3);
        int i4 = this.f11922j;
        parcel.writeInt(262149);
        parcel.writeInt(i4);
        C2622l.m5447v2(parcel, iM5239D1);
    }
}
