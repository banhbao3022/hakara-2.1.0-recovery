package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class lw2 extends AbstractC2767a {
    public static final Parcelable.Creator<lw2> CREATOR = new nw2();

    /* JADX INFO: renamed from: f */
    public final int f16629f;

    /* JADX INFO: renamed from: g */
    public final int f16630g;

    /* JADX INFO: renamed from: h */
    public final String f16631h;

    /* JADX INFO: renamed from: i */
    public final long f16632i;

    public lw2(int i, int i2, String str, long j2) {
        this.f16629f = i;
        this.f16630g = i2;
        this.f16631h = str;
        this.f16632i = j2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        int i2 = this.f16629f;
        parcel.writeInt(262145);
        parcel.writeInt(i2);
        int i3 = this.f16630g;
        parcel.writeInt(262146);
        parcel.writeInt(i3);
        C2622l.m5315U(parcel, 3, this.f16631h, false);
        long j2 = this.f16632i;
        parcel.writeInt(524292);
        parcel.writeLong(j2);
        C2622l.m5447v2(parcel, iM5239D1);
    }
}
