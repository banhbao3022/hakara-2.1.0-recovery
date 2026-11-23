package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;

/* JADX INFO: renamed from: c.n.b.d.j.a.tm */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3552tm extends AbstractC2767a {
    public static final Parcelable.Creator<C3552tm> CREATOR = new C3589um();

    /* JADX INFO: renamed from: f */
    @Deprecated
    public final String f19911f;

    /* JADX INFO: renamed from: g */
    public final String f19912g;

    /* JADX INFO: renamed from: h */
    @Deprecated
    public final jw2 f19913h;

    /* JADX INFO: renamed from: i */
    public final ew2 f19914i;

    public C3552tm(String str, String str2, jw2 jw2Var, ew2 ew2Var) {
        this.f19911f = str;
        this.f19912g = str2;
        this.f19913h = jw2Var;
        this.f19914i = ew2Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        C2622l.m5315U(parcel, 1, this.f19911f, false);
        C2622l.m5315U(parcel, 2, this.f19912g, false);
        C2622l.m5311T(parcel, 3, this.f19913h, i, false);
        C2622l.m5311T(parcel, 4, this.f19914i, i, false);
        C2622l.m5447v2(parcel, iM5239D1);
    }
}
