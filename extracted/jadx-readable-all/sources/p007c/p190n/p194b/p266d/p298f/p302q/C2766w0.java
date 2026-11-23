package p007c.p190n.p194b.p266d.p298f.p302q;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p298f.C2606d;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;

/* JADX INFO: renamed from: c.n.b.d.f.q.w0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2766w0 extends AbstractC2767a {
    public static final Parcelable.Creator<C2766w0> CREATOR = new C2770x0();

    /* JADX INFO: renamed from: f */
    public Bundle f11927f;

    /* JADX INFO: renamed from: g */
    public C2606d[] f11928g;

    /* JADX INFO: renamed from: h */
    public int f11929h;

    /* JADX INFO: renamed from: i */
    public C2726f f11930i;

    public C2766w0() {
    }

    public C2766w0(Bundle bundle, C2606d[] c2606dArr, int i, C2726f c2726f) {
        this.f11927f = bundle;
        this.f11928g = c2606dArr;
        this.f11929h = i;
        this.f11930i = c2726f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        C2622l.m5295P(parcel, 1, this.f11927f, false);
        C2622l.m5327X(parcel, 2, this.f11928g, i, false);
        int i2 = this.f11929h;
        parcel.writeInt(262147);
        parcel.writeInt(i2);
        C2622l.m5311T(parcel, 4, this.f11930i, i, false);
        C2622l.m5447v2(parcel, iM5239D1);
    }
}
