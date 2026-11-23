package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;

/* JADX INFO: renamed from: c.n.b.d.j.a.lj */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3253lj extends AbstractC2767a {
    public static final Parcelable.Creator<C3253lj> CREATOR = new C3327nj();

    /* JADX INFO: renamed from: f */
    public final ew2 f16370f;

    /* JADX INFO: renamed from: g */
    public final String f16371g;

    public C3253lj(ew2 ew2Var, String str) {
        this.f16370f = ew2Var;
        this.f16371g = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        C2622l.m5311T(parcel, 2, this.f16370f, i, false);
        C2622l.m5315U(parcel, 3, this.f16371g, false);
        C2622l.m5447v2(parcel, iM5239D1);
    }
}
