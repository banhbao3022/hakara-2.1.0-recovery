package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p267a.C2191r;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;

/* JADX INFO: renamed from: c.n.b.d.j.a.i2 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3125i2 extends AbstractC2767a {
    public static final Parcelable.Creator<C3125i2> CREATOR = new C3162j2();

    /* JADX INFO: renamed from: f */
    public final int f15077f;

    /* JADX INFO: renamed from: g */
    public final int f15078g;

    public C3125i2(int i, int i2) {
        this.f15077f = i;
        this.f15078g = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        int i2 = this.f15077f;
        parcel.writeInt(262145);
        parcel.writeInt(i2);
        int i3 = this.f15078g;
        parcel.writeInt(262146);
        parcel.writeInt(i3);
        C2622l.m5447v2(parcel, iM5239D1);
    }

    public C3125i2(C2191r c2191r) {
        this.f15077f = c2191r.f10582b;
        this.f15078g = c2191r.f10583c;
    }
}
