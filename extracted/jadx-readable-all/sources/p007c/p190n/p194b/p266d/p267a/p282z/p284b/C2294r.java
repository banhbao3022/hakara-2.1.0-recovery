package p007c.p190n.p194b.p266d.p267a.p282z.p284b;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;

/* JADX INFO: renamed from: c.n.b.d.a.z.b.r */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2294r extends AbstractC2767a {
    public static final Parcelable.Creator<C2294r> CREATOR = new C2296s();

    /* JADX INFO: renamed from: f */
    public final String f10767f;

    /* JADX INFO: renamed from: g */
    public final int f10768g;

    public C2294r(String str, int i) {
        this.f10767f = str == null ? "" : str;
        this.f10768g = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        C2622l.m5315U(parcel, 1, this.f10767f, false);
        int i2 = this.f10768g;
        parcel.writeInt(262146);
        parcel.writeInt(i2);
        C2622l.m5447v2(parcel, iM5239D1);
    }
}
