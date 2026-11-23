package p007c.p190n.p194b.p266d.p290d;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p007c.p190n.p194b.p266d.p290d.p295s.C2516a;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;

/* JADX INFO: renamed from: c.n.b.d.d.x */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2565x extends AbstractC2767a {
    public static final Parcelable.Creator<C2565x> CREATOR = new C2563w();

    /* JADX INFO: renamed from: f */
    public final C2561v f11484f;

    /* JADX INFO: renamed from: g */
    public final C2561v f11485g;

    public C2565x(C2561v c2561v, C2561v c2561v2) {
        this.f11484f = c2561v;
        this.f11485g = c2561v2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2565x)) {
            return false;
        }
        C2565x c2565x = (C2565x) obj;
        return C2516a.m5114d(this.f11484f, c2565x.f11484f) && C2516a.m5114d(this.f11485g, c2565x.f11485g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11484f, this.f11485g});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        C2622l.m5311T(parcel, 2, this.f11484f, i, false);
        C2622l.m5311T(parcel, 3, this.f11485g, i, false);
        C2622l.m5447v2(parcel, iM5239D1);
    }
}
