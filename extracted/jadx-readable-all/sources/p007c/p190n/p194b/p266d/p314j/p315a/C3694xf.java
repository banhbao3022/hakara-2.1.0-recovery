package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p007c.p190n.p194b.p266d.p267a.p269b0.C2125s;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;

/* JADX INFO: renamed from: c.n.b.d.j.a.xf */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3694xf extends AbstractC2767a {
    public static final Parcelable.Creator<C3694xf> CREATOR = new C3731yf();

    /* JADX INFO: renamed from: f */
    public final int f21497f;

    /* JADX INFO: renamed from: g */
    public final int f21498g;

    /* JADX INFO: renamed from: h */
    public final int f21499h;

    public C3694xf(int i, int i2, int i3) {
        this.f21497f = i;
        this.f21498g = i2;
        this.f21499h = i3;
    }

    /* JADX INFO: renamed from: H */
    public static C3694xf m8733H(C2125s c2125s) {
        return new C3694xf(c2125s.f10467a, c2125s.f10468b, c2125s.f10469c);
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C3694xf)) {
            C3694xf c3694xf = (C3694xf) obj;
            if (c3694xf.f21499h == this.f21499h && c3694xf.f21498g == this.f21498g && c3694xf.f21497f == this.f21497f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new int[]{this.f21497f, this.f21498g, this.f21499h});
    }

    public final String toString() {
        int i = this.f21497f;
        int i2 = this.f21498g;
        int i3 = this.f21499h;
        StringBuilder sb = new StringBuilder(35);
        sb.append(i);
        sb.append(".");
        sb.append(i2);
        sb.append(".");
        sb.append(i3);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        int i2 = this.f21497f;
        parcel.writeInt(262145);
        parcel.writeInt(i2);
        int i3 = this.f21498g;
        parcel.writeInt(262146);
        parcel.writeInt(i3);
        int i4 = this.f21499h;
        parcel.writeInt(262147);
        parcel.writeInt(i4);
        C2622l.m5447v2(parcel, iM5239D1);
    }
}
