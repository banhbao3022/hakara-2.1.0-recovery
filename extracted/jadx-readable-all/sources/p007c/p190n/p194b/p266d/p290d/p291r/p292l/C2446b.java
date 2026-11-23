package p007c.p190n.p194b.p266d.p290d.p291r.p292l;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;

/* JADX INFO: renamed from: c.n.b.d.d.r.l.b */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class C2446b extends AbstractC2767a {
    public static final Parcelable.Creator<C2446b> CREATOR = new C2447b0();

    /* JADX INFO: renamed from: f */
    public final int f11208f;

    /* JADX INFO: renamed from: g */
    public final int f11209g;

    /* JADX INFO: renamed from: h */
    public final int f11210h;

    public C2446b(int i, int i2, int i3) {
        this.f11208f = i;
        this.f11209g = i2;
        this.f11210h = i3;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        int i2 = this.f11208f;
        parcel.writeInt(262146);
        parcel.writeInt(i2);
        int i3 = this.f11209g;
        parcel.writeInt(262147);
        parcel.writeInt(i3);
        int i4 = this.f11210h;
        parcel.writeInt(262148);
        parcel.writeInt(i4);
        C2622l.m5447v2(parcel, iM5239D1);
    }
}
