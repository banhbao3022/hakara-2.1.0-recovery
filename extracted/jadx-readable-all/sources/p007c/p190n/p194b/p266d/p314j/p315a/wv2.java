package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class wv2 extends AbstractC2767a {
    public static final Parcelable.Creator<wv2> CREATOR = new xv2();

    /* JADX INFO: renamed from: f */
    public final String f21379f;

    /* JADX INFO: renamed from: g */
    public final String f21380g;

    public wv2(String str, String str2) {
        this.f21379f = str;
        this.f21380g = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        C2622l.m5315U(parcel, 1, this.f21379f, false);
        C2622l.m5315U(parcel, 2, this.f21380g, false);
        C2622l.m5447v2(parcel, iM5239D1);
    }
}
