package p007c.p190n.p194b.p266d.p327k.p329b;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;

/* JADX INFO: renamed from: c.n.b.d.k.b.ca */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4480ca extends AbstractC2767a {
    public static final Parcelable.Creator<C4480ca> CREATOR = new C4504ea();

    /* JADX INFO: renamed from: A */
    public final String f23796A;

    /* JADX INFO: renamed from: B */
    public final String f23797B;

    /* JADX INFO: renamed from: f */
    public final String f23798f;

    /* JADX INFO: renamed from: g */
    public final String f23799g;

    /* JADX INFO: renamed from: h */
    public final String f23800h;

    /* JADX INFO: renamed from: i */
    public final String f23801i;

    /* JADX INFO: renamed from: j */
    public final long f23802j;

    /* JADX INFO: renamed from: k */
    public final long f23803k;

    /* JADX INFO: renamed from: l */
    public final String f23804l;

    /* JADX INFO: renamed from: m */
    public final boolean f23805m;

    /* JADX INFO: renamed from: n */
    public final boolean f23806n;

    /* JADX INFO: renamed from: o */
    public final long f23807o;

    /* JADX INFO: renamed from: p */
    public final String f23808p;

    /* JADX INFO: renamed from: q */
    public final long f23809q;

    /* JADX INFO: renamed from: r */
    public final long f23810r;

    /* JADX INFO: renamed from: s */
    public final int f23811s;

    /* JADX INFO: renamed from: t */
    public final boolean f23812t;

    /* JADX INFO: renamed from: u */
    public final boolean f23813u;

    /* JADX INFO: renamed from: v */
    public final boolean f23814v;

    /* JADX INFO: renamed from: w */
    public final String f23815w;

    /* JADX INFO: renamed from: x */
    public final Boolean f23816x;

    /* JADX INFO: renamed from: y */
    public final long f23817y;

    /* JADX INFO: renamed from: z */
    public final List<String> f23818z;

    public C4480ca(String str, String str2, String str3, long j2, String str4, long j3, long j4, String str5, boolean z, boolean z2, String str6, long j5, long j6, int i, boolean z3, boolean z4, boolean z5, String str7, Boolean bool, long j7, List<String> list, String str8, String str9) {
        C2622l.m5359e(str);
        this.f23798f = str;
        this.f23799g = TextUtils.isEmpty(str2) ? null : str2;
        this.f23800h = str3;
        this.f23807o = j2;
        this.f23801i = str4;
        this.f23802j = j3;
        this.f23803k = j4;
        this.f23804l = str5;
        this.f23805m = z;
        this.f23806n = z2;
        this.f23808p = str6;
        this.f23809q = j5;
        this.f23810r = j6;
        this.f23811s = i;
        this.f23812t = z3;
        this.f23813u = z4;
        this.f23814v = z5;
        this.f23815w = str7;
        this.f23816x = bool;
        this.f23817y = j7;
        this.f23818z = list;
        this.f23796A = str8;
        this.f23797B = str9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        C2622l.m5315U(parcel, 2, this.f23798f, false);
        C2622l.m5315U(parcel, 3, this.f23799g, false);
        C2622l.m5315U(parcel, 4, this.f23800h, false);
        C2622l.m5315U(parcel, 5, this.f23801i, false);
        long j2 = this.f23802j;
        parcel.writeInt(524294);
        parcel.writeLong(j2);
        long j3 = this.f23803k;
        parcel.writeInt(524295);
        parcel.writeLong(j3);
        C2622l.m5315U(parcel, 8, this.f23804l, false);
        boolean z = this.f23805m;
        parcel.writeInt(262153);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.f23806n;
        parcel.writeInt(262154);
        parcel.writeInt(z2 ? 1 : 0);
        long j4 = this.f23807o;
        parcel.writeInt(524299);
        parcel.writeLong(j4);
        C2622l.m5315U(parcel, 12, this.f23808p, false);
        long j5 = this.f23809q;
        parcel.writeInt(524301);
        parcel.writeLong(j5);
        long j6 = this.f23810r;
        parcel.writeInt(524302);
        parcel.writeLong(j6);
        int i2 = this.f23811s;
        parcel.writeInt(262159);
        parcel.writeInt(i2);
        boolean z3 = this.f23812t;
        parcel.writeInt(262160);
        parcel.writeInt(z3 ? 1 : 0);
        boolean z4 = this.f23813u;
        parcel.writeInt(262161);
        parcel.writeInt(z4 ? 1 : 0);
        boolean z5 = this.f23814v;
        parcel.writeInt(262162);
        parcel.writeInt(z5 ? 1 : 0);
        C2622l.m5315U(parcel, 19, this.f23815w, false);
        Boolean bool = this.f23816x;
        if (bool != null) {
            parcel.writeInt(262165);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        long j7 = this.f23817y;
        parcel.writeInt(524310);
        parcel.writeLong(j7);
        C2622l.m5323W(parcel, 23, this.f23818z, false);
        C2622l.m5315U(parcel, 24, this.f23796A, false);
        C2622l.m5315U(parcel, 25, this.f23797B, false);
        C2622l.m5447v2(parcel, iM5239D1);
    }

    public C4480ca(String str, String str2, String str3, String str4, long j2, long j3, String str5, boolean z, boolean z2, long j4, String str6, long j5, long j6, int i, boolean z3, boolean z4, boolean z5, String str7, Boolean bool, long j7, List<String> list, String str8, String str9) {
        this.f23798f = str;
        this.f23799g = str2;
        this.f23800h = str3;
        this.f23807o = j4;
        this.f23801i = str4;
        this.f23802j = j2;
        this.f23803k = j3;
        this.f23804l = str5;
        this.f23805m = z;
        this.f23806n = z2;
        this.f23808p = str6;
        this.f23809q = j5;
        this.f23810r = j6;
        this.f23811s = i;
        this.f23812t = z3;
        this.f23813u = z4;
        this.f23814v = z5;
        this.f23815w = str7;
        this.f23816x = bool;
        this.f23817y = j7;
        this.f23818z = list;
        this.f23796A = str8;
        this.f23797B = str9;
    }
}
