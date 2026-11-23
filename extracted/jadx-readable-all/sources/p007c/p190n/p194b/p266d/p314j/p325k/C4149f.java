package p007c.p190n.p194b.p266d.p314j.p325k;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;

/* JADX INFO: renamed from: c.n.b.d.j.k.f */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4149f extends AbstractC2767a {
    public static final Parcelable.Creator<C4149f> CREATOR = new C4191i();

    /* JADX INFO: renamed from: f */
    public final long f23137f;

    /* JADX INFO: renamed from: g */
    public final long f23138g;

    /* JADX INFO: renamed from: h */
    public final boolean f23139h;

    /* JADX INFO: renamed from: i */
    public final String f23140i;

    /* JADX INFO: renamed from: j */
    public final String f23141j;

    /* JADX INFO: renamed from: k */
    public final String f23142k;

    /* JADX INFO: renamed from: l */
    public final Bundle f23143l;

    public C4149f(long j2, long j3, boolean z, String str, String str2, String str3, Bundle bundle) {
        this.f23137f = j2;
        this.f23138g = j3;
        this.f23139h = z;
        this.f23140i = str;
        this.f23141j = str2;
        this.f23142k = str3;
        this.f23143l = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        long j2 = this.f23137f;
        parcel.writeInt(524289);
        parcel.writeLong(j2);
        long j3 = this.f23138g;
        parcel.writeInt(524290);
        parcel.writeLong(j3);
        boolean z = this.f23139h;
        parcel.writeInt(262147);
        parcel.writeInt(z ? 1 : 0);
        C2622l.m5315U(parcel, 4, this.f23140i, false);
        C2622l.m5315U(parcel, 5, this.f23141j, false);
        C2622l.m5315U(parcel, 6, this.f23142k, false);
        C2622l.m5295P(parcel, 7, this.f23143l, false);
        C2622l.m5447v2(parcel, iM5239D1);
    }
}
