package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p267a.p279w.C2202e;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;

/* JADX INFO: renamed from: c.n.b.d.j.a.j5 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3165j5 extends AbstractC2767a {
    public static final Parcelable.Creator<C3165j5> CREATOR = new C3202k5();

    /* JADX INFO: renamed from: f */
    public final int f15475f;

    /* JADX INFO: renamed from: g */
    public final boolean f15476g;

    /* JADX INFO: renamed from: h */
    public final int f15477h;

    /* JADX INFO: renamed from: i */
    public final boolean f15478i;

    /* JADX INFO: renamed from: j */
    public final int f15479j;

    /* JADX INFO: renamed from: k */
    public final C3310n2 f15480k;

    /* JADX INFO: renamed from: l */
    public final boolean f15481l;

    /* JADX INFO: renamed from: m */
    public final int f15482m;

    public C3165j5(C2202e c2202e) {
        this(4, c2202e.f10598a, c2202e.f10599b, c2202e.f10601d, c2202e.f10602e, c2202e.f10603f != null ? new C3310n2(c2202e.f10603f) : null, c2202e.f10604g, c2202e.f10600c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        int i2 = this.f15475f;
        parcel.writeInt(262145);
        parcel.writeInt(i2);
        boolean z = this.f15476g;
        parcel.writeInt(262146);
        parcel.writeInt(z ? 1 : 0);
        int i3 = this.f15477h;
        parcel.writeInt(262147);
        parcel.writeInt(i3);
        boolean z2 = this.f15478i;
        parcel.writeInt(262148);
        parcel.writeInt(z2 ? 1 : 0);
        int i4 = this.f15479j;
        parcel.writeInt(262149);
        parcel.writeInt(i4);
        C2622l.m5311T(parcel, 6, this.f15480k, i, false);
        boolean z3 = this.f15481l;
        parcel.writeInt(262151);
        parcel.writeInt(z3 ? 1 : 0);
        int i5 = this.f15482m;
        parcel.writeInt(262152);
        parcel.writeInt(i5);
        C2622l.m5447v2(parcel, iM5239D1);
    }

    public C3165j5(int i, boolean z, int i2, boolean z2, int i3, C3310n2 c3310n2, boolean z3, int i4) {
        this.f15475f = i;
        this.f15476g = z;
        this.f15477h = i2;
        this.f15478i = z2;
        this.f15479j = i3;
        this.f15480k = c3310n2;
        this.f15481l = z3;
        this.f15482m = i4;
    }
}
