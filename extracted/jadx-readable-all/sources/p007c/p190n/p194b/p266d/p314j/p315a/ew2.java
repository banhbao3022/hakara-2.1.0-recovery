package p007c.p190n.p194b.p266d.p314j.p315a;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ew2 extends AbstractC2767a {
    public static final Parcelable.Creator<ew2> CREATOR = new gw2();

    /* JADX INFO: renamed from: A */
    public final List<String> f13711A;

    /* JADX INFO: renamed from: B */
    public final int f13712B;

    /* JADX INFO: renamed from: f */
    public final int f13713f;

    /* JADX INFO: renamed from: g */
    @Deprecated
    public final long f13714g;

    /* JADX INFO: renamed from: h */
    public final Bundle f13715h;

    /* JADX INFO: renamed from: i */
    @Deprecated
    public final int f13716i;

    /* JADX INFO: renamed from: j */
    public final List<String> f13717j;

    /* JADX INFO: renamed from: k */
    public final boolean f13718k;

    /* JADX INFO: renamed from: l */
    public final int f13719l;

    /* JADX INFO: renamed from: m */
    public final boolean f13720m;

    /* JADX INFO: renamed from: n */
    public final String f13721n;

    /* JADX INFO: renamed from: o */
    public final C3199k2 f13722o;

    /* JADX INFO: renamed from: p */
    public final Location f13723p;

    /* JADX INFO: renamed from: q */
    public final String f13724q;

    /* JADX INFO: renamed from: r */
    public final Bundle f13725r;

    /* JADX INFO: renamed from: s */
    public final Bundle f13726s;

    /* JADX INFO: renamed from: t */
    public final List<String> f13727t;

    /* JADX INFO: renamed from: u */
    public final String f13728u;

    /* JADX INFO: renamed from: v */
    public final String f13729v;

    /* JADX INFO: renamed from: w */
    @Deprecated
    public final boolean f13730w;

    /* JADX INFO: renamed from: x */
    public final wv2 f13731x;

    /* JADX INFO: renamed from: y */
    public final int f13732y;

    /* JADX INFO: renamed from: z */
    public final String f13733z;

    public ew2(int i, long j2, Bundle bundle, int i2, List<String> list, boolean z, int i3, boolean z2, String str, C3199k2 c3199k2, Location location, String str2, Bundle bundle2, Bundle bundle3, List<String> list2, String str3, String str4, boolean z3, wv2 wv2Var, int i4, String str5, List<String> list3, int i5) {
        this.f13713f = i;
        this.f13714g = j2;
        this.f13715h = bundle == null ? new Bundle() : bundle;
        this.f13716i = i2;
        this.f13717j = list;
        this.f13718k = z;
        this.f13719l = i3;
        this.f13720m = z2;
        this.f13721n = str;
        this.f13722o = c3199k2;
        this.f13723p = location;
        this.f13724q = str2;
        this.f13725r = bundle2 == null ? new Bundle() : bundle2;
        this.f13726s = bundle3;
        this.f13727t = list2;
        this.f13728u = str3;
        this.f13729v = str4;
        this.f13730w = z3;
        this.f13731x = wv2Var;
        this.f13732y = i4;
        this.f13733z = str5;
        this.f13711A = list3 == null ? new ArrayList<>() : list3;
        this.f13712B = i5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ew2)) {
            return false;
        }
        ew2 ew2Var = (ew2) obj;
        return this.f13713f == ew2Var.f13713f && this.f13714g == ew2Var.f13714g && C2622l.m5386j1(this.f13715h, ew2Var.f13715h) && this.f13716i == ew2Var.f13716i && C2622l.m5459y(this.f13717j, ew2Var.f13717j) && this.f13718k == ew2Var.f13718k && this.f13719l == ew2Var.f13719l && this.f13720m == ew2Var.f13720m && C2622l.m5459y(this.f13721n, ew2Var.f13721n) && C2622l.m5459y(this.f13722o, ew2Var.f13722o) && C2622l.m5459y(this.f13723p, ew2Var.f13723p) && C2622l.m5459y(this.f13724q, ew2Var.f13724q) && C2622l.m5386j1(this.f13725r, ew2Var.f13725r) && C2622l.m5386j1(this.f13726s, ew2Var.f13726s) && C2622l.m5459y(this.f13727t, ew2Var.f13727t) && C2622l.m5459y(this.f13728u, ew2Var.f13728u) && C2622l.m5459y(this.f13729v, ew2Var.f13729v) && this.f13730w == ew2Var.f13730w && this.f13732y == ew2Var.f13732y && C2622l.m5459y(this.f13733z, ew2Var.f13733z) && C2622l.m5459y(this.f13711A, ew2Var.f13711A) && this.f13712B == ew2Var.f13712B;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f13713f), Long.valueOf(this.f13714g), this.f13715h, Integer.valueOf(this.f13716i), this.f13717j, Boolean.valueOf(this.f13718k), Integer.valueOf(this.f13719l), Boolean.valueOf(this.f13720m), this.f13721n, this.f13722o, this.f13723p, this.f13724q, this.f13725r, this.f13726s, this.f13727t, this.f13728u, this.f13729v, Boolean.valueOf(this.f13730w), Integer.valueOf(this.f13732y), this.f13733z, this.f13711A, Integer.valueOf(this.f13712B)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        int i2 = this.f13713f;
        parcel.writeInt(262145);
        parcel.writeInt(i2);
        long j2 = this.f13714g;
        parcel.writeInt(524290);
        parcel.writeLong(j2);
        C2622l.m5295P(parcel, 3, this.f13715h, false);
        int i3 = this.f13716i;
        parcel.writeInt(262148);
        parcel.writeInt(i3);
        C2622l.m5323W(parcel, 5, this.f13717j, false);
        boolean z = this.f13718k;
        parcel.writeInt(262150);
        parcel.writeInt(z ? 1 : 0);
        int i4 = this.f13719l;
        parcel.writeInt(262151);
        parcel.writeInt(i4);
        boolean z2 = this.f13720m;
        parcel.writeInt(262152);
        parcel.writeInt(z2 ? 1 : 0);
        C2622l.m5315U(parcel, 9, this.f13721n, false);
        C2622l.m5311T(parcel, 10, this.f13722o, i, false);
        C2622l.m5311T(parcel, 11, this.f13723p, i, false);
        C2622l.m5315U(parcel, 12, this.f13724q, false);
        C2622l.m5295P(parcel, 13, this.f13725r, false);
        C2622l.m5295P(parcel, 14, this.f13726s, false);
        C2622l.m5323W(parcel, 15, this.f13727t, false);
        C2622l.m5315U(parcel, 16, this.f13728u, false);
        C2622l.m5315U(parcel, 17, this.f13729v, false);
        boolean z3 = this.f13730w;
        parcel.writeInt(262162);
        parcel.writeInt(z3 ? 1 : 0);
        C2622l.m5311T(parcel, 19, this.f13731x, i, false);
        int i5 = this.f13732y;
        parcel.writeInt(262164);
        parcel.writeInt(i5);
        C2622l.m5315U(parcel, 21, this.f13733z, false);
        C2622l.m5323W(parcel, 22, this.f13711A, false);
        int i6 = this.f13712B;
        parcel.writeInt(262167);
        parcel.writeInt(i6);
        C2622l.m5447v2(parcel, iM5239D1);
    }
}
