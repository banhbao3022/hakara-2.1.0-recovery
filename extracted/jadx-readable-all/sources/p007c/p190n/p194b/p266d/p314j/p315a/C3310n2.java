package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p267a.C2194u;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;

/* JADX INFO: renamed from: c.n.b.d.j.a.n2 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3310n2 extends AbstractC2767a {
    public static final Parcelable.Creator<C3310n2> CREATOR = new C3347o2();

    /* JADX INFO: renamed from: f */
    public final boolean f16998f;

    /* JADX INFO: renamed from: g */
    public final boolean f16999g;

    /* JADX INFO: renamed from: h */
    public final boolean f17000h;

    public C3310n2(C2194u c2194u) {
        this(c2194u.f10593a, c2194u.f10594b, c2194u.f10595c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        boolean z = this.f16998f;
        parcel.writeInt(262146);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.f16999g;
        parcel.writeInt(262147);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z3 = this.f17000h;
        parcel.writeInt(262148);
        parcel.writeInt(z3 ? 1 : 0);
        C2622l.m5447v2(parcel, iM5239D1);
    }

    public C3310n2(boolean z, boolean z2, boolean z3) {
        this.f16998f = z;
        this.f16999g = z2;
        this.f17000h = z3;
    }
}
