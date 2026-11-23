package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;

/* JADX INFO: renamed from: c.n.b.d.j.a.zk */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3773zk extends AbstractC2767a {
    public static final Parcelable.Creator<C3773zk> CREATOR = new C2847al();

    /* JADX INFO: renamed from: f */
    public final String f22310f;

    /* JADX INFO: renamed from: g */
    public final String f22311g;

    /* JADX INFO: renamed from: h */
    public final boolean f22312h;

    /* JADX INFO: renamed from: i */
    public final boolean f22313i;

    /* JADX INFO: renamed from: j */
    public final List<String> f22314j;

    /* JADX INFO: renamed from: k */
    public final boolean f22315k;

    /* JADX INFO: renamed from: l */
    public final boolean f22316l;

    /* JADX INFO: renamed from: m */
    public final List<String> f22317m;

    public C3773zk(String str, String str2, boolean z, boolean z2, List<String> list, boolean z3, boolean z4, List<String> list2) {
        this.f22310f = str;
        this.f22311g = str2;
        this.f22312h = z;
        this.f22313i = z2;
        this.f22314j = list;
        this.f22315k = z3;
        this.f22316l = z4;
        this.f22317m = list2 == null ? new ArrayList<>() : list2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        C2622l.m5315U(parcel, 2, this.f22310f, false);
        C2622l.m5315U(parcel, 3, this.f22311g, false);
        boolean z = this.f22312h;
        parcel.writeInt(262148);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.f22313i;
        parcel.writeInt(262149);
        parcel.writeInt(z2 ? 1 : 0);
        C2622l.m5323W(parcel, 6, this.f22314j, false);
        boolean z3 = this.f22315k;
        parcel.writeInt(262151);
        parcel.writeInt(z3 ? 1 : 0);
        boolean z4 = this.f22316l;
        parcel.writeInt(262152);
        parcel.writeInt(z4 ? 1 : 0);
        C2622l.m5323W(parcel, 9, this.f22317m, false);
        C2622l.m5447v2(parcel, iM5239D1);
    }
}
