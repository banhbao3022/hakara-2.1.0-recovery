package p007c.p190n.p194b.p266d.p290d;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p007c.p190n.p194b.p266d.p290d.p295s.C2516a;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;

/* JADX INFO: renamed from: c.n.b.d.d.b */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class C2374b extends AbstractC2767a {
    public static final Parcelable.Creator<C2374b> CREATOR = new C2411n0();

    /* JADX INFO: renamed from: f */
    public final long f10993f;

    /* JADX INFO: renamed from: g */
    public final String f10994g;

    /* JADX INFO: renamed from: h */
    public final long f10995h;

    /* JADX INFO: renamed from: i */
    public final boolean f10996i;

    /* JADX INFO: renamed from: j */
    public String[] f10997j;

    /* JADX INFO: renamed from: k */
    public final boolean f10998k;

    public C2374b(long j2, String str, long j3, boolean z, String[] strArr, boolean z2) {
        this.f10993f = j2;
        this.f10994g = str;
        this.f10995h = j3;
        this.f10996i = z;
        this.f10997j = strArr;
        this.f10998k = z2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2374b)) {
            return false;
        }
        C2374b c2374b = (C2374b) obj;
        return C2516a.m5114d(this.f10994g, c2374b.f10994g) && this.f10993f == c2374b.f10993f && this.f10995h == c2374b.f10995h && this.f10996i == c2374b.f10996i && Arrays.equals(this.f10997j, c2374b.f10997j) && this.f10998k == c2374b.f10998k;
    }

    public int hashCode() {
        return this.f10994g.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        long j2 = this.f10993f;
        parcel.writeInt(524290);
        parcel.writeLong(j2);
        C2622l.m5315U(parcel, 3, this.f10994g, false);
        long j3 = this.f10995h;
        parcel.writeInt(524292);
        parcel.writeLong(j3);
        boolean z = this.f10996i;
        parcel.writeInt(262149);
        parcel.writeInt(z ? 1 : 0);
        C2622l.m5319V(parcel, 6, this.f10997j, false);
        boolean z2 = this.f10998k;
        parcel.writeInt(262151);
        parcel.writeInt(z2 ? 1 : 0);
        C2622l.m5447v2(parcel, iM5239D1);
    }
}
