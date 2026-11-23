package p007c.p190n.p194b.p266d.p330l.p331b;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p298f.C2602b;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.C2759t;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;

/* JADX INFO: renamed from: c.n.b.d.l.b.l */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4758l extends AbstractC2767a {
    public static final Parcelable.Creator<C4758l> CREATOR = new C4757k();

    /* JADX INFO: renamed from: f */
    public final int f24648f;

    /* JADX INFO: renamed from: g */
    public final C2602b f24649g;

    /* JADX INFO: renamed from: h */
    public final C2759t f24650h;

    public C4758l(int i, C2602b c2602b, C2759t c2759t) {
        this.f24648f = i;
        this.f24649g = c2602b;
        this.f24650h = c2759t;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        int i2 = this.f24648f;
        parcel.writeInt(262145);
        parcel.writeInt(i2);
        C2622l.m5311T(parcel, 2, this.f24649g, i, false);
        C2622l.m5311T(parcel, 3, this.f24650h, i, false);
        C2622l.m5447v2(parcel, iM5239D1);
    }

    public C4758l(int i) {
        C2602b c2602b = new C2602b(8, null);
        this.f24648f = 1;
        this.f24649g = c2602b;
        this.f24650h = null;
    }
}
