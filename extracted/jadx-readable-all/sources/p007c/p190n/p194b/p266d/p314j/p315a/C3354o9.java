package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;

/* JADX INFO: renamed from: c.n.b.d.j.a.o9 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3354o9 extends AbstractC2767a {
    public static final Parcelable.Creator<C3354o9> CREATOR = new C3391p9();

    /* JADX INFO: renamed from: f */
    public final boolean f17556f;

    /* JADX INFO: renamed from: g */
    public final String f17557g;

    /* JADX INFO: renamed from: h */
    public final int f17558h;

    /* JADX INFO: renamed from: i */
    public final byte[] f17559i;

    /* JADX INFO: renamed from: j */
    public final String[] f17560j;

    /* JADX INFO: renamed from: k */
    public final String[] f17561k;

    /* JADX INFO: renamed from: l */
    public final boolean f17562l;

    /* JADX INFO: renamed from: m */
    public final long f17563m;

    public C3354o9(boolean z, String str, int i, byte[] bArr, String[] strArr, String[] strArr2, boolean z2, long j2) {
        this.f17556f = z;
        this.f17557g = str;
        this.f17558h = i;
        this.f17559i = bArr;
        this.f17560j = strArr;
        this.f17561k = strArr2;
        this.f17562l = z2;
        this.f17563m = j2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        boolean z = this.f17556f;
        parcel.writeInt(262145);
        parcel.writeInt(z ? 1 : 0);
        C2622l.m5315U(parcel, 2, this.f17557g, false);
        int i2 = this.f17558h;
        parcel.writeInt(262147);
        parcel.writeInt(i2);
        C2622l.m5299Q(parcel, 4, this.f17559i, false);
        C2622l.m5319V(parcel, 5, this.f17560j, false);
        C2622l.m5319V(parcel, 6, this.f17561k, false);
        boolean z2 = this.f17562l;
        parcel.writeInt(262151);
        parcel.writeInt(z2 ? 1 : 0);
        long j2 = this.f17563m;
        parcel.writeInt(524296);
        parcel.writeLong(j2);
        C2622l.m5447v2(parcel, iM5239D1);
    }
}
