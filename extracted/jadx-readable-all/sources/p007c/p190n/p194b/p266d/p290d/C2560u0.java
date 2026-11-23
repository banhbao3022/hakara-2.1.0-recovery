package p007c.p190n.p194b.p266d.p290d;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;

/* JADX INFO: renamed from: c.n.b.d.d.u0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2560u0 extends AbstractC2767a {
    public static final Parcelable.Creator<C2560u0> CREATOR = new C2558t0();

    /* JADX INFO: renamed from: f */
    public int f11480f;

    public C2560u0() {
        this.f11480f = 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C2560u0) && this.f11480f == ((C2560u0) obj).f11480f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f11480f)});
    }

    public final String toString() {
        String str;
        int i = this.f11480f;
        if (i != 0) {
            str = i != 2 ? "UNKNOWN" : "INVISIBLE";
        } else {
            str = "STRONG";
        }
        return String.format("joinOptions(connectionType=%s)", str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        int i2 = this.f11480f;
        parcel.writeInt(262146);
        parcel.writeInt(i2);
        C2622l.m5447v2(parcel, iM5239D1);
    }

    public C2560u0(int i) {
        this.f11480f = i;
    }
}
