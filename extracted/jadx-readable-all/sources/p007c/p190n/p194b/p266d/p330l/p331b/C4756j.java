package p007c.p190n.p194b.p266d.p330l.p331b;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.C2757s;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;

/* JADX INFO: renamed from: c.n.b.d.l.b.j */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4756j extends AbstractC2767a {
    public static final Parcelable.Creator<C4756j> CREATOR = new C4755i();

    /* JADX INFO: renamed from: f */
    public final int f24646f;

    /* JADX INFO: renamed from: g */
    public final C2757s f24647g;

    public C4756j(int i, C2757s c2757s) {
        this.f24646f = i;
        this.f24647g = c2757s;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        int i2 = this.f24646f;
        parcel.writeInt(262145);
        parcel.writeInt(i2);
        C2622l.m5311T(parcel, 2, this.f24647g, i, false);
        C2622l.m5447v2(parcel, iM5239D1);
    }

    public C4756j(C2757s c2757s) {
        this.f24646f = 1;
        this.f24647g = c2757s;
    }
}
