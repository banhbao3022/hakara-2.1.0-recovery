package p007c.p190n.p194b.p266d.p290d.p295s;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;

/* JADX INFO: renamed from: c.n.b.d.d.s.u */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2550u extends AbstractC2767a {
    public static final Parcelable.Creator<C2550u> CREATOR = new C2523d();

    /* JADX INFO: renamed from: f */
    public String f11467f;

    public C2550u() {
        this.f11467f = null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2550u) {
            return C2516a.m5114d(this.f11467f, ((C2550u) obj).f11467f);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11467f});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        C2622l.m5315U(parcel, 2, this.f11467f, false);
        C2622l.m5447v2(parcel, iM5239D1);
    }

    public C2550u(String str) {
        this.f11467f = str;
    }
}
