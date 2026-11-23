package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;

/* JADX INFO: renamed from: c.n.b.d.j.a.ha */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3096ha extends AbstractC2767a {
    public static final Parcelable.Creator<C3096ha> CREATOR = new C3133ia();

    /* JADX INFO: renamed from: f */
    public final String f14794f;

    /* JADX INFO: renamed from: g */
    public final Bundle f14795g;

    public C3096ha(String str, Bundle bundle) {
        this.f14794f = str;
        this.f14795g = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        C2622l.m5315U(parcel, 1, this.f14794f, false);
        C2622l.m5295P(parcel, 2, this.f14795g, false);
        C2622l.m5447v2(parcel, iM5239D1);
    }
}
