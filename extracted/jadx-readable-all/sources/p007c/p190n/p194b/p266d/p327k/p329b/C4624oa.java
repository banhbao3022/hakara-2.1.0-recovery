package p007c.p190n.p194b.p266d.p327k.p329b;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;

/* JADX INFO: renamed from: c.n.b.d.k.b.oa */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4624oa extends AbstractC2767a {
    public static final Parcelable.Creator<C4624oa> CREATOR = new C4612na();

    /* JADX INFO: renamed from: f */
    public String f24238f;

    /* JADX INFO: renamed from: g */
    public String f24239g;

    /* JADX INFO: renamed from: h */
    public C4712w9 f24240h;

    /* JADX INFO: renamed from: i */
    public long f24241i;

    /* JADX INFO: renamed from: j */
    public boolean f24242j;

    /* JADX INFO: renamed from: k */
    public String f24243k;

    /* JADX INFO: renamed from: l */
    public C4625p f24244l;

    /* JADX INFO: renamed from: m */
    public long f24245m;

    /* JADX INFO: renamed from: n */
    public C4625p f24246n;

    /* JADX INFO: renamed from: o */
    public long f24247o;

    /* JADX INFO: renamed from: p */
    public C4625p f24248p;

    public C4624oa(C4624oa c4624oa) {
        this.f24238f = c4624oa.f24238f;
        this.f24239g = c4624oa.f24239g;
        this.f24240h = c4624oa.f24240h;
        this.f24241i = c4624oa.f24241i;
        this.f24242j = c4624oa.f24242j;
        this.f24243k = c4624oa.f24243k;
        this.f24244l = c4624oa.f24244l;
        this.f24245m = c4624oa.f24245m;
        this.f24246n = c4624oa.f24246n;
        this.f24247o = c4624oa.f24247o;
        this.f24248p = c4624oa.f24248p;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        C2622l.m5315U(parcel, 2, this.f24238f, false);
        C2622l.m5315U(parcel, 3, this.f24239g, false);
        C2622l.m5311T(parcel, 4, this.f24240h, i, false);
        long j2 = this.f24241i;
        parcel.writeInt(524293);
        parcel.writeLong(j2);
        boolean z = this.f24242j;
        parcel.writeInt(262150);
        parcel.writeInt(z ? 1 : 0);
        C2622l.m5315U(parcel, 7, this.f24243k, false);
        C2622l.m5311T(parcel, 8, this.f24244l, i, false);
        long j3 = this.f24245m;
        parcel.writeInt(524297);
        parcel.writeLong(j3);
        C2622l.m5311T(parcel, 10, this.f24246n, i, false);
        long j4 = this.f24247o;
        parcel.writeInt(524299);
        parcel.writeLong(j4);
        C2622l.m5311T(parcel, 12, this.f24248p, i, false);
        C2622l.m5447v2(parcel, iM5239D1);
    }

    public C4624oa(String str, String str2, C4712w9 c4712w9, long j2, boolean z, String str3, C4625p c4625p, long j3, C4625p c4625p2, long j4, C4625p c4625p3) {
        this.f24238f = str;
        this.f24239g = str2;
        this.f24240h = c4712w9;
        this.f24241i = j2;
        this.f24242j = z;
        this.f24243k = str3;
        this.f24244l = c4625p;
        this.f24245m = j3;
        this.f24246n = c4625p2;
        this.f24247o = j4;
        this.f24248p = c4625p3;
    }
}
