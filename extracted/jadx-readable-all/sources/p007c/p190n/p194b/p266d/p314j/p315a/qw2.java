package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class qw2 extends AbstractC2767a {
    public static final Parcelable.Creator<qw2> CREATOR = new rw2();

    /* JADX INFO: renamed from: f */
    public final int f18655f;

    public qw2(int i) {
        this.f18655f = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        int i2 = this.f18655f;
        parcel.writeInt(262146);
        parcel.writeInt(i2);
        C2622l.m5447v2(parcel, iM5239D1);
    }
}
