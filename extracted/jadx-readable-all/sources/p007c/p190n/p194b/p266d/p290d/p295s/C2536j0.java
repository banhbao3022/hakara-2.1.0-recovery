package p007c.p190n.p194b.p266d.p290d.p295s;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p007c.p190n.p194b.p266d.p290d.C2380d;
import p007c.p190n.p194b.p266d.p290d.C2565x;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;

/* JADX INFO: renamed from: c.n.b.d.d.s.j0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2536j0 extends AbstractC2767a {
    public static final Parcelable.Creator<C2536j0> CREATOR = new C2538k0();

    /* JADX INFO: renamed from: f */
    public double f11424f;

    /* JADX INFO: renamed from: g */
    public boolean f11425g;

    /* JADX INFO: renamed from: h */
    public int f11426h;

    /* JADX INFO: renamed from: i */
    public C2380d f11427i;

    /* JADX INFO: renamed from: j */
    public int f11428j;

    /* JADX INFO: renamed from: k */
    public C2565x f11429k;

    /* JADX INFO: renamed from: l */
    public double f11430l;

    public C2536j0() {
        this.f11424f = Double.NaN;
        this.f11425g = false;
        this.f11426h = -1;
        this.f11427i = null;
        this.f11428j = -1;
        this.f11429k = null;
        this.f11430l = Double.NaN;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2536j0)) {
            return false;
        }
        C2536j0 c2536j0 = (C2536j0) obj;
        if (this.f11424f == c2536j0.f11424f && this.f11425g == c2536j0.f11425g && this.f11426h == c2536j0.f11426h && C2516a.m5114d(this.f11427i, c2536j0.f11427i) && this.f11428j == c2536j0.f11428j) {
            C2565x c2565x = this.f11429k;
            if (C2516a.m5114d(c2565x, c2565x) && this.f11430l == c2536j0.f11430l) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Double.valueOf(this.f11424f), Boolean.valueOf(this.f11425g), Integer.valueOf(this.f11426h), this.f11427i, Integer.valueOf(this.f11428j), this.f11429k, Double.valueOf(this.f11430l)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        double d = this.f11424f;
        parcel.writeInt(524290);
        parcel.writeDouble(d);
        boolean z = this.f11425g;
        parcel.writeInt(262147);
        parcel.writeInt(z ? 1 : 0);
        int i2 = this.f11426h;
        parcel.writeInt(262148);
        parcel.writeInt(i2);
        C2622l.m5311T(parcel, 5, this.f11427i, i, false);
        int i3 = this.f11428j;
        parcel.writeInt(262150);
        parcel.writeInt(i3);
        C2622l.m5311T(parcel, 7, this.f11429k, i, false);
        double d2 = this.f11430l;
        parcel.writeInt(524296);
        parcel.writeDouble(d2);
        C2622l.m5447v2(parcel, iM5239D1);
    }

    public C2536j0(double d, boolean z, int i, C2380d c2380d, int i2, C2565x c2565x, double d2) {
        this.f11424f = d;
        this.f11425g = z;
        this.f11426h = i;
        this.f11427i = c2380d;
        this.f11428j = i2;
        this.f11429k = c2565x;
        this.f11430l = d2;
    }
}
