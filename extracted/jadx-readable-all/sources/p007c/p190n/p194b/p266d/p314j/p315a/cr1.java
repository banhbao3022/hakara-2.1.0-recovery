package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class cr1 extends AbstractC2767a {
    public static final Parcelable.Creator<cr1> CREATOR = new dr1();

    /* JADX INFO: renamed from: f */
    public final int f13100f;

    /* JADX INFO: renamed from: g */
    public final int f13101g;

    /* JADX INFO: renamed from: h */
    public final String f13102h;

    /* JADX INFO: renamed from: i */
    public final String f13103i;

    /* JADX INFO: renamed from: j */
    public final int f13104j;

    public cr1(int i, zf2 zf2Var, String str, String str2) {
        int i2 = zf2Var.f22263m;
        this.f13100f = 1;
        this.f13101g = 1;
        this.f13102h = str;
        this.f13103i = str2;
        this.f13104j = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        int i2 = this.f13100f;
        parcel.writeInt(262145);
        parcel.writeInt(i2);
        int i3 = this.f13101g;
        parcel.writeInt(262146);
        parcel.writeInt(i3);
        C2622l.m5315U(parcel, 3, this.f13102h, false);
        C2622l.m5315U(parcel, 4, this.f13103i, false);
        int i4 = this.f13104j;
        parcel.writeInt(262149);
        parcel.writeInt(i4);
        C2622l.m5447v2(parcel, iM5239D1);
    }

    public cr1(int i, int i2, int i3, String str, String str2) {
        this.f13100f = i;
        this.f13101g = i2;
        this.f13102h = str;
        this.f13103i = str2;
        this.f13104j = i3;
    }
}
