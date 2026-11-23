package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class sj1 extends AbstractC2767a {
    public static final Parcelable.Creator<sj1> CREATOR = new tj1();

    /* JADX INFO: renamed from: f */
    public final rj1[] f19580f;

    /* JADX INFO: renamed from: g */
    public final Context f19581g;

    /* JADX INFO: renamed from: h */
    public final int f19582h;

    /* JADX INFO: renamed from: i */
    public final rj1 f19583i;

    /* JADX INFO: renamed from: j */
    public final int f19584j;

    /* JADX INFO: renamed from: k */
    public final int f19585k;

    /* JADX INFO: renamed from: l */
    public final int f19586l;

    /* JADX INFO: renamed from: m */
    public final String f19587m;

    /* JADX INFO: renamed from: n */
    public final int f19588n;

    /* JADX INFO: renamed from: o */
    public final int f19589o;

    /* JADX INFO: renamed from: p */
    public final int[] f19590p;

    /* JADX INFO: renamed from: q */
    public final int[] f19591q;

    /* JADX INFO: renamed from: r */
    public final int f19592r;

    public sj1(int i, int i2, int i3, int i4, String str, int i5, int i6) {
        rj1[] rj1VarArrValues = rj1.values();
        this.f19580f = rj1VarArrValues;
        int[] iArr = {1, 2, 3};
        this.f19590p = iArr;
        int[] iArr2 = {1};
        this.f19591q = iArr2;
        this.f19581g = null;
        this.f19582h = i;
        this.f19583i = rj1VarArrValues[i];
        this.f19584j = i2;
        this.f19585k = i3;
        this.f19586l = i4;
        this.f19587m = str;
        this.f19588n = i5;
        this.f19592r = iArr[i5];
        this.f19589o = i6;
        int i7 = iArr2[i6];
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        int i2 = this.f19582h;
        parcel.writeInt(262145);
        parcel.writeInt(i2);
        int i3 = this.f19584j;
        parcel.writeInt(262146);
        parcel.writeInt(i3);
        int i4 = this.f19585k;
        parcel.writeInt(262147);
        parcel.writeInt(i4);
        int i5 = this.f19586l;
        parcel.writeInt(262148);
        parcel.writeInt(i5);
        C2622l.m5315U(parcel, 5, this.f19587m, false);
        int i6 = this.f19588n;
        parcel.writeInt(262150);
        parcel.writeInt(i6);
        int i7 = this.f19589o;
        parcel.writeInt(262151);
        parcel.writeInt(i7);
        C2622l.m5447v2(parcel, iM5239D1);
    }

    public sj1(Context context, rj1 rj1Var, int i, int i2, int i3, String str, String str2, String str3) {
        this.f19580f = rj1.values();
        int i4 = 3;
        this.f19590p = new int[]{1, 2, 3};
        this.f19591q = new int[]{1};
        this.f19581g = context;
        this.f19582h = rj1Var.ordinal();
        this.f19583i = rj1Var;
        this.f19584j = i;
        this.f19585k = i2;
        this.f19586l = i3;
        this.f19587m = str;
        if ("oldest".equals(str2)) {
            i4 = 1;
        } else if ("lru".equals(str2) || !"lfu".equals(str2)) {
            i4 = 2;
        }
        this.f19592r = i4;
        this.f19588n = i4 - 1;
        "onAdClosed".equals(str3);
        this.f19589o = 0;
    }
}
