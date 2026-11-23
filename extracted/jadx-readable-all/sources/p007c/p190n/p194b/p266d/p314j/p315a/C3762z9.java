package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;

/* JADX INFO: renamed from: c.n.b.d.j.a.z9 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3762z9 extends AbstractC2767a {
    public static final Parcelable.Creator<C3762z9> CREATOR = new C2836aa();

    /* JADX INFO: renamed from: f */
    public final String f22198f;

    /* JADX INFO: renamed from: g */
    public final boolean f22199g;

    /* JADX INFO: renamed from: h */
    public final int f22200h;

    /* JADX INFO: renamed from: i */
    public final String f22201i;

    public C3762z9(String str, boolean z, int i, String str2) {
        this.f22198f = str;
        this.f22199g = z;
        this.f22200h = i;
        this.f22201i = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        C2622l.m5315U(parcel, 1, this.f22198f, false);
        boolean z = this.f22199g;
        parcel.writeInt(262146);
        parcel.writeInt(z ? 1 : 0);
        int i2 = this.f22200h;
        parcel.writeInt(262147);
        parcel.writeInt(i2);
        C2622l.m5315U(parcel, 4, this.f22201i, false);
        C2622l.m5447v2(parcel, iM5239D1);
    }
}
