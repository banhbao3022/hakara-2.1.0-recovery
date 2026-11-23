package p007c.p190n.p194b.p266d.p327k.p329b;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;

/* JADX INFO: renamed from: c.n.b.d.k.b.p */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4625p extends AbstractC2767a {
    public static final Parcelable.Creator<C4625p> CREATOR = new C4658s();

    /* JADX INFO: renamed from: f */
    public final String f24249f;

    /* JADX INFO: renamed from: g */
    public final C4613o f24250g;

    /* JADX INFO: renamed from: h */
    public final String f24251h;

    /* JADX INFO: renamed from: i */
    public final long f24252i;

    public C4625p(String str, C4613o c4613o, String str2, long j2) {
        this.f24249f = str;
        this.f24250g = c4613o;
        this.f24251h = str2;
        this.f24252i = j2;
    }

    public final String toString() {
        String str = this.f24251h;
        String str2 = this.f24249f;
        String strValueOf = String.valueOf(this.f24250g);
        StringBuilder sb = new StringBuilder(strValueOf.length() + outline.m1558I(str2, outline.m1558I(str, 21)));
        sb.append("origin=");
        sb.append(str);
        sb.append(",name=");
        sb.append(str2);
        return outline.m1550A(sb, ",params=", strValueOf);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        C2622l.m5315U(parcel, 2, this.f24249f, false);
        C2622l.m5311T(parcel, 3, this.f24250g, i, false);
        C2622l.m5315U(parcel, 4, this.f24251h, false);
        long j2 = this.f24252i;
        parcel.writeInt(524293);
        parcel.writeLong(j2);
        C2622l.m5447v2(parcel, iM5239D1);
    }

    public C4625p(C4625p c4625p, long j2) {
        Objects.requireNonNull(c4625p, "null reference");
        this.f24249f = c4625p.f24249f;
        this.f24250g = c4625p.f24250g;
        this.f24251h = c4625p.f24251h;
        this.f24252i = j2;
    }
}
