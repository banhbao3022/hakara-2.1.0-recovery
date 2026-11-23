package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;

/* JADX INFO: renamed from: c.n.b.d.j.a.ja */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3170ja extends AbstractC2767a {
    public static final Parcelable.Creator<C3170ja> CREATOR = new C3207ka();

    /* JADX INFO: renamed from: f */
    public final int f15512f;

    /* JADX INFO: renamed from: g */
    public final int f15513g;

    /* JADX INFO: renamed from: h */
    public final String f15514h;

    /* JADX INFO: renamed from: i */
    public final int f15515i;

    public C3170ja(int i, int i2, String str, int i3) {
        this.f15512f = i;
        this.f15513g = i2;
        this.f15514h = str;
        this.f15515i = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        int i2 = this.f15513g;
        parcel.writeInt(262145);
        parcel.writeInt(i2);
        C2622l.m5315U(parcel, 2, this.f15514h, false);
        int i3 = this.f15515i;
        parcel.writeInt(262147);
        parcel.writeInt(i3);
        int i4 = this.f15512f;
        parcel.writeInt(263144);
        parcel.writeInt(i4);
        C2622l.m5447v2(parcel, iM5239D1);
    }
}
