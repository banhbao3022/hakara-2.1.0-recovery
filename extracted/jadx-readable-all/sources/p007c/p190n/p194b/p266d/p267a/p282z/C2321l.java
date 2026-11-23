package p007c.p190n.p194b.p266d.p267a.p282z;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;

/* JADX INFO: renamed from: c.n.b.d.a.z.l */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2321l extends AbstractC2767a {
    public static final Parcelable.Creator<C2321l> CREATOR = new C2322m();

    /* JADX INFO: renamed from: f */
    public final boolean f10857f;

    /* JADX INFO: renamed from: g */
    public final boolean f10858g;

    /* JADX INFO: renamed from: h */
    public final String f10859h;

    /* JADX INFO: renamed from: i */
    public final boolean f10860i;

    /* JADX INFO: renamed from: j */
    public final float f10861j;

    /* JADX INFO: renamed from: k */
    public final int f10862k;

    /* JADX INFO: renamed from: l */
    public final boolean f10863l;

    /* JADX INFO: renamed from: m */
    public final boolean f10864m;

    /* JADX INFO: renamed from: n */
    public final boolean f10865n;

    public C2321l(boolean z, boolean z2, String str, boolean z3, float f, int i, boolean z4, boolean z5, boolean z6) {
        this.f10857f = z;
        this.f10858g = z2;
        this.f10859h = str;
        this.f10860i = z3;
        this.f10861j = f;
        this.f10862k = i;
        this.f10863l = z4;
        this.f10864m = z5;
        this.f10865n = z6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        boolean z = this.f10857f;
        parcel.writeInt(262146);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.f10858g;
        parcel.writeInt(262147);
        parcel.writeInt(z2 ? 1 : 0);
        C2622l.m5315U(parcel, 4, this.f10859h, false);
        boolean z3 = this.f10860i;
        parcel.writeInt(262149);
        parcel.writeInt(z3 ? 1 : 0);
        float f = this.f10861j;
        parcel.writeInt(262150);
        parcel.writeFloat(f);
        int i2 = this.f10862k;
        parcel.writeInt(262151);
        parcel.writeInt(i2);
        boolean z4 = this.f10863l;
        parcel.writeInt(262152);
        parcel.writeInt(z4 ? 1 : 0);
        boolean z5 = this.f10864m;
        parcel.writeInt(262153);
        parcel.writeInt(z5 ? 1 : 0);
        boolean z6 = this.f10865n;
        parcel.writeInt(262154);
        parcel.writeInt(z6 ? 1 : 0);
        C2622l.m5447v2(parcel, iM5239D1);
    }

    public C2321l(boolean z, boolean z2, boolean z3, float f, int i, boolean z4, boolean z5, boolean z6) {
        this(z, z2, null, z3, f, -1, z4, z5, z6);
    }
}
