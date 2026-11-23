package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;

/* JADX INFO: renamed from: c.n.b.d.j.a.xn */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3702xn extends AbstractC2767a {
    public static final Parcelable.Creator<C3702xn> CREATOR = new C3739yn();

    /* JADX INFO: renamed from: f */
    public String f21615f;

    /* JADX INFO: renamed from: g */
    public int f21616g;

    /* JADX INFO: renamed from: h */
    public int f21617h;

    /* JADX INFO: renamed from: i */
    public boolean f21618i;

    /* JADX INFO: renamed from: j */
    public boolean f21619j;

    public C3702xn(int i, int i2, boolean z, boolean z2) {
        this(210890000, i2, true, false, false);
    }

    /* JADX INFO: renamed from: H */
    public static C3702xn m8742H() {
        return new C3702xn(12451000, 12451000, true, false, false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        C2622l.m5315U(parcel, 2, this.f21615f, false);
        int i2 = this.f21616g;
        parcel.writeInt(262147);
        parcel.writeInt(i2);
        int i3 = this.f21617h;
        parcel.writeInt(262148);
        parcel.writeInt(i3);
        boolean z = this.f21618i;
        parcel.writeInt(262149);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.f21619j;
        parcel.writeInt(262150);
        parcel.writeInt(z2 ? 1 : 0);
        C2622l.m5447v2(parcel, iM5239D1);
    }

    public C3702xn(int i, int i2, boolean z, boolean z2, boolean z3) {
        String str = z ? "0" : "1";
        StringBuilder sb = new StringBuilder(str.length() + 36);
        sb.append("afma-sdk-a-v");
        sb.append(i);
        sb.append(".");
        sb.append(i2);
        this.f21615f = outline.m1550A(sb, ".", str);
        this.f21616g = i;
        this.f21617h = i2;
        this.f21618i = z;
        this.f21619j = false;
    }

    public C3702xn(String str, int i, int i2, boolean z, boolean z2) {
        this.f21615f = str;
        this.f21616g = i;
        this.f21617h = i2;
        this.f21618i = z;
        this.f21619j = z2;
    }
}
