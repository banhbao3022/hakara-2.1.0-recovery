package p007c.p190n.p194b.p266d.p290d;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p007c.p190n.p194b.p266d.p290d.p295s.C2518b;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;

/* JADX INFO: renamed from: c.n.b.d.d.q */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2419q extends AbstractC2767a {

    /* JADX INFO: renamed from: g */
    public int f11136g;

    /* JADX INFO: renamed from: h */
    public int f11137h;

    /* JADX INFO: renamed from: i */
    public int f11138i;

    /* JADX INFO: renamed from: f */
    public static final C2518b f11135f = new C2518b("VideoInfo");
    public static final Parcelable.Creator<C2419q> CREATOR = new C2409m1();

    public C2419q(int i, int i2, int i3) {
        this.f11136g = i;
        this.f11137h = i2;
        this.f11138i = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2419q)) {
            return false;
        }
        C2419q c2419q = (C2419q) obj;
        return this.f11137h == c2419q.f11137h && this.f11136g == c2419q.f11136g && this.f11138i == c2419q.f11138i;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f11137h), Integer.valueOf(this.f11136g), Integer.valueOf(this.f11138i)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        int i2 = this.f11136g;
        parcel.writeInt(262146);
        parcel.writeInt(i2);
        int i3 = this.f11137h;
        parcel.writeInt(262147);
        parcel.writeInt(i3);
        int i4 = this.f11138i;
        parcel.writeInt(262148);
        parcel.writeInt(i4);
        C2622l.m5447v2(parcel, iM5239D1);
    }
}
