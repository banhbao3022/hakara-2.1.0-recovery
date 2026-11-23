package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;

/* JADX INFO: renamed from: c.n.b.d.j.a.m9 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3280m9 extends AbstractC2767a {
    public static final Parcelable.Creator<C3280m9> CREATOR = new C3317n9();

    /* JADX INFO: renamed from: f */
    public final String f16700f;

    /* JADX INFO: renamed from: g */
    public final String[] f16701g;

    /* JADX INFO: renamed from: h */
    public final String[] f16702h;

    public C3280m9(String str, String[] strArr, String[] strArr2) {
        this.f16700f = str;
        this.f16701g = strArr;
        this.f16702h = strArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        C2622l.m5315U(parcel, 1, this.f16700f, false);
        C2622l.m5319V(parcel, 2, this.f16701g, false);
        C2622l.m5319V(parcel, 3, this.f16702h, false);
        C2622l.m5447v2(parcel, iM5239D1);
    }
}
