package p007c.p190n.p194b.p266d.p298f.p302q;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p298f.C2602b;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;

/* JADX INFO: renamed from: c.n.b.d.f.q.t */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class C2759t extends AbstractC2767a {
    public static final Parcelable.Creator<C2759t> CREATOR = new C2730g0();

    /* JADX INFO: renamed from: f */
    public final int f11911f;

    /* JADX INFO: renamed from: g */
    public IBinder f11912g;

    /* JADX INFO: renamed from: h */
    public C2602b f11913h;

    /* JADX INFO: renamed from: i */
    public boolean f11914i;

    /* JADX INFO: renamed from: j */
    public boolean f11915j;

    public C2759t(int i, IBinder iBinder, C2602b c2602b, boolean z, boolean z2) {
        this.f11911f = i;
        this.f11912g = iBinder;
        this.f11913h = c2602b;
        this.f11914i = z;
        this.f11915j = z2;
    }

    /* JADX INFO: renamed from: H */
    public InterfaceC2745m m5610H() {
        return InterfaceC2745m.a.m5605i1(this.f11912g);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2759t)) {
            return false;
        }
        C2759t c2759t = (C2759t) obj;
        return this.f11913h.equals(c2759t.f11913h) && m5610H().equals(c2759t.m5610H());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        int i2 = this.f11911f;
        parcel.writeInt(262145);
        parcel.writeInt(i2);
        C2622l.m5303R(parcel, 2, this.f11912g, false);
        C2622l.m5311T(parcel, 3, this.f11913h, i, false);
        boolean z = this.f11914i;
        parcel.writeInt(262148);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.f11915j;
        parcel.writeInt(262149);
        parcel.writeInt(z2 ? 1 : 0);
        C2622l.m5447v2(parcel, iM5239D1);
    }

    public C2759t(C2602b c2602b) {
        this.f11911f = 1;
        this.f11912g = null;
        this.f11913h = c2602b;
        this.f11914i = false;
        this.f11915j = false;
    }

    public C2759t(int i) {
        this(new C2602b(i, null));
    }
}
