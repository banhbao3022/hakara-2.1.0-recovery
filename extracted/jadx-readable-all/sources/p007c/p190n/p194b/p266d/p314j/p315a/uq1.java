package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class uq1 extends AbstractC2767a {
    public static final Parcelable.Creator<uq1> CREATOR = new vq1();

    /* JADX INFO: renamed from: f */
    public final int f20404f;

    /* JADX INFO: renamed from: g */
    public final String f20405g;

    /* JADX INFO: renamed from: h */
    public final String f20406h;

    public uq1(int i, String str, String str2) {
        this.f20404f = i;
        this.f20405g = str;
        this.f20406h = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        int i2 = this.f20404f;
        parcel.writeInt(262145);
        parcel.writeInt(i2);
        C2622l.m5315U(parcel, 2, this.f20405g, false);
        C2622l.m5315U(parcel, 3, this.f20406h, false);
        C2622l.m5447v2(parcel, iM5239D1);
    }

    public uq1(String str, String str2) {
        this.f20404f = 1;
        this.f20405g = str;
        this.f20406h = str2;
    }
}
