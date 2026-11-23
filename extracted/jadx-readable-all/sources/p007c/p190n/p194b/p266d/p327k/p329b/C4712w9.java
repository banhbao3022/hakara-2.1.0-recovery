package p007c.p190n.p194b.p266d.p327k.p329b;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;

/* JADX INFO: renamed from: c.n.b.d.k.b.w9 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4712w9 extends AbstractC2767a {
    public static final Parcelable.Creator<C4712w9> CREATOR = new C4701v9();

    /* JADX INFO: renamed from: f */
    public final int f24561f;

    /* JADX INFO: renamed from: g */
    public final String f24562g;

    /* JADX INFO: renamed from: h */
    public final long f24563h;

    /* JADX INFO: renamed from: i */
    public final Long f24564i;

    /* JADX INFO: renamed from: j */
    public final String f24565j;

    /* JADX INFO: renamed from: k */
    public final String f24566k;

    /* JADX INFO: renamed from: l */
    public final Double f24567l;

    public C4712w9(C4734y9 c4734y9) {
        this(c4734y9.f24612c, c4734y9.f24613d, c4734y9.f24614e, c4734y9.f24611b);
    }

    /* JADX INFO: renamed from: H */
    public final Object m10847H() {
        Long l = this.f24564i;
        if (l != null) {
            return l;
        }
        Double d = this.f24567l;
        if (d != null) {
            return d;
        }
        String str = this.f24565j;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        int i2 = this.f24561f;
        parcel.writeInt(262145);
        parcel.writeInt(i2);
        C2622l.m5315U(parcel, 2, this.f24562g, false);
        long j2 = this.f24563h;
        parcel.writeInt(524291);
        parcel.writeLong(j2);
        Long l = this.f24564i;
        if (l != null) {
            parcel.writeInt(524292);
            parcel.writeLong(l.longValue());
        }
        C2622l.m5315U(parcel, 6, this.f24565j, false);
        C2622l.m5315U(parcel, 7, this.f24566k, false);
        Double d = this.f24567l;
        if (d != null) {
            parcel.writeInt(524296);
            parcel.writeDouble(d.doubleValue());
        }
        C2622l.m5447v2(parcel, iM5239D1);
    }

    public C4712w9(String str, long j2, Object obj, String str2) {
        C2622l.m5359e(str);
        this.f24561f = 2;
        this.f24562g = str;
        this.f24563h = j2;
        this.f24566k = str2;
        if (obj == null) {
            this.f24564i = null;
            this.f24567l = null;
            this.f24565j = null;
            return;
        }
        if (obj instanceof Long) {
            this.f24564i = (Long) obj;
            this.f24567l = null;
            this.f24565j = null;
        } else if (obj instanceof String) {
            this.f24564i = null;
            this.f24567l = null;
            this.f24565j = (String) obj;
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("User attribute given of un-supported type");
            }
            this.f24564i = null;
            this.f24567l = (Double) obj;
            this.f24565j = null;
        }
    }

    public C4712w9(int i, String str, long j2, Long l, Float f, String str2, String str3, Double d) {
        this.f24561f = i;
        this.f24562g = str;
        this.f24563h = j2;
        this.f24564i = l;
        if (i == 1) {
            this.f24567l = f != null ? Double.valueOf(f.doubleValue()) : null;
        } else {
            this.f24567l = d;
        }
        this.f24565j = str2;
        this.f24566k = str3;
    }
}
