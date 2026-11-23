package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class er1 extends AbstractC2767a {
    public static final Parcelable.Creator<er1> CREATOR = new fr1();

    /* JADX INFO: renamed from: f */
    public final int f13673f;

    /* JADX INFO: renamed from: g */
    public final byte[] f13674g;

    /* JADX INFO: renamed from: h */
    public final int f13675h;

    public er1(int i, byte[] bArr, int i2) {
        this.f13673f = i;
        this.f13674g = bArr == null ? null : Arrays.copyOf(bArr, bArr.length);
        this.f13675h = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        int i2 = this.f13673f;
        parcel.writeInt(262145);
        parcel.writeInt(i2);
        C2622l.m5299Q(parcel, 2, this.f13674g, false);
        int i3 = this.f13675h;
        parcel.writeInt(262147);
        parcel.writeInt(i3);
        C2622l.m5447v2(parcel, iM5239D1);
    }

    public er1(byte[] bArr, int i) {
        this(1, null, 1);
    }
}
