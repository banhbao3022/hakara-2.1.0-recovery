package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p267a.p277g0.C2178a;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;

/* JADX INFO: renamed from: c.n.b.d.j.a.k2 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3199k2 extends AbstractC2767a {
    public static final Parcelable.Creator<C3199k2> CREATOR = new C3236l2();

    /* JADX INFO: renamed from: f */
    public final String f15867f;

    public C3199k2(C2178a c2178a) {
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        C2622l.m5315U(parcel, 15, this.f15867f, false);
        C2622l.m5447v2(parcel, iM5239D1);
    }

    public C3199k2(String str) {
        this.f15867f = str;
    }
}
