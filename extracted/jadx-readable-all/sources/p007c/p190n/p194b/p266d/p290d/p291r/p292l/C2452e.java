package p007c.p190n.p194b.p266d.p290d.p291r.p292l;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;

/* JADX INFO: renamed from: c.n.b.d.d.r.l.e */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class C2452e extends AbstractC2767a {
    public static final Parcelable.Creator<C2452e> CREATOR = new C2478j0();

    /* JADX INFO: renamed from: f */
    public final String f11228f;

    /* JADX INFO: renamed from: g */
    public final int f11229g;

    /* JADX INFO: renamed from: h */
    public final String f11230h;

    public C2452e(String str, int i, String str2) {
        this.f11228f = str;
        this.f11229g = i;
        this.f11230h = str2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        C2622l.m5315U(parcel, 2, this.f11228f, false);
        int i2 = this.f11229g;
        parcel.writeInt(262147);
        parcel.writeInt(i2);
        C2622l.m5315U(parcel, 4, this.f11230h, false);
        C2622l.m5447v2(parcel, iM5239D1);
    }
}
