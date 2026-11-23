package p007c.p190n.p194b.p266d.p290d;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;

/* JADX INFO: renamed from: c.n.b.d.d.v */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2561v extends AbstractC2767a {
    public static final Parcelable.Creator<C2561v> CREATOR = new C2559u();

    /* JADX INFO: renamed from: f */
    public final float f11481f;

    /* JADX INFO: renamed from: g */
    public final float f11482g;

    /* JADX INFO: renamed from: h */
    public final float f11483h;

    public C2561v(float f, float f2, float f3) {
        this.f11481f = f;
        this.f11482g = f2;
        this.f11483h = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2561v)) {
            return false;
        }
        C2561v c2561v = (C2561v) obj;
        return this.f11481f == c2561v.f11481f && this.f11482g == c2561v.f11482g && this.f11483h == c2561v.f11483h;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f11481f), Float.valueOf(this.f11482g), Float.valueOf(this.f11483h)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        float f = this.f11481f;
        parcel.writeInt(262146);
        parcel.writeFloat(f);
        float f2 = this.f11482g;
        parcel.writeInt(262147);
        parcel.writeFloat(f2);
        float f3 = this.f11483h;
        parcel.writeInt(262148);
        parcel.writeFloat(f3);
        C2622l.m5447v2(parcel, iM5239D1);
    }
}
