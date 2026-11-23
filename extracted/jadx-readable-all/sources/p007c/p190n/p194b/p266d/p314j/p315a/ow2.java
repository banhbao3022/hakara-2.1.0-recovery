package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ow2 extends AbstractC2767a {
    public static final Parcelable.Creator<ow2> CREATOR = new pw2();

    /* JADX INFO: renamed from: f */
    public final String f17774f;

    /* JADX INFO: renamed from: g */
    public long f17775g;

    /* JADX INFO: renamed from: h */
    public yv2 f17776h;

    /* JADX INFO: renamed from: i */
    public final Bundle f17777i;

    public ow2(String str, long j2, yv2 yv2Var, Bundle bundle) {
        this.f17774f = str;
        this.f17775g = j2;
        this.f17776h = yv2Var;
        this.f17777i = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        C2622l.m5315U(parcel, 1, this.f17774f, false);
        long j2 = this.f17775g;
        parcel.writeInt(524290);
        parcel.writeLong(j2);
        C2622l.m5311T(parcel, 3, this.f17776h, i, false);
        C2622l.m5295P(parcel, 4, this.f17777i, false);
        C2622l.m5447v2(parcel, iM5239D1);
    }
}
