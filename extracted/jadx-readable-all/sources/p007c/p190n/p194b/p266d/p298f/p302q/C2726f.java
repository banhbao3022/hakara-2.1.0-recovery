package p007c.p190n.p194b.p266d.p298f.p302q;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;

/* JADX INFO: renamed from: c.n.b.d.f.q.f */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public class C2726f extends AbstractC2767a {

    @RecentlyNonNull
    public static final Parcelable.Creator<C2726f> CREATOR = new C2772y0();

    /* JADX INFO: renamed from: f */
    public final C2761u f11850f;

    /* JADX INFO: renamed from: g */
    public final boolean f11851g;

    /* JADX INFO: renamed from: h */
    public final boolean f11852h;

    /* JADX INFO: renamed from: i */
    public final int[] f11853i;

    /* JADX INFO: renamed from: j */
    public final int f11854j;

    /* JADX INFO: renamed from: k */
    public final int[] f11855k;

    public C2726f(@RecentlyNonNull C2761u c2761u, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.f11850f = c2761u;
        this.f11851g = z;
        this.f11852h = z2;
        this.f11853i = iArr;
        this.f11854j = i;
        this.f11855k = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        C2622l.m5311T(parcel, 1, this.f11850f, i, false);
        boolean z = this.f11851g;
        parcel.writeInt(262146);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.f11852h;
        parcel.writeInt(262147);
        parcel.writeInt(z2 ? 1 : 0);
        C2622l.m5307S(parcel, 4, this.f11853i, false);
        int i2 = this.f11854j;
        parcel.writeInt(262149);
        parcel.writeInt(i2);
        C2622l.m5307S(parcel, 6, this.f11855k, false);
        C2622l.m5447v2(parcel, iM5239D1);
    }
}
