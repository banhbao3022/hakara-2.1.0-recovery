package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class rq1 extends AbstractC2767a {
    public static final Parcelable.Creator<rq1> CREATOR = new sq1();

    /* JADX INFO: renamed from: f */
    public final int f19032f;

    /* JADX INFO: renamed from: g */
    public final byte[] f19033g;

    public rq1(int i, byte[] bArr) {
        this.f19032f = i;
        this.f19033g = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        int i2 = this.f19032f;
        parcel.writeInt(262145);
        parcel.writeInt(i2);
        C2622l.m5299Q(parcel, 2, this.f19033g, false);
        C2622l.m5447v2(parcel, iM5239D1);
    }

    public rq1(byte[] bArr) {
        this.f19032f = 1;
        this.f19033g = bArr;
    }
}
