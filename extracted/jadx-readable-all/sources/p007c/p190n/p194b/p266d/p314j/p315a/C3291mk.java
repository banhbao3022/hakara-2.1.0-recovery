package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p267a.p276f0.C2176d;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;

/* JADX INFO: renamed from: c.n.b.d.j.a.mk */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3291mk extends AbstractC2767a {
    public static final Parcelable.Creator<C3291mk> CREATOR = new C3365ok();

    /* JADX INFO: renamed from: f */
    public final String f16781f;

    /* JADX INFO: renamed from: g */
    public final String f16782g;

    public C3291mk(C2176d c2176d) {
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        C2622l.m5315U(parcel, 1, this.f16781f, false);
        C2622l.m5315U(parcel, 2, this.f16782g, false);
        C2622l.m5447v2(parcel, iM5239D1);
    }

    public C3291mk(String str, String str2) {
        this.f16781f = str;
        this.f16782g = str2;
    }
}
