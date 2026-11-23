package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class wq1 extends AbstractC2767a {
    public static final Parcelable.Creator<wq1> CREATOR = new xq1();

    /* JADX INFO: renamed from: f */
    public final int f21304f;

    /* JADX INFO: renamed from: g */
    public f31 f21305g = null;

    /* JADX INFO: renamed from: h */
    public byte[] f21306h;

    public wq1(int i, byte[] bArr) {
        this.f21304f = i;
        this.f21306h = bArr;
        m8667a();
    }

    /* JADX INFO: renamed from: a */
    public final void m8667a() {
        f31 f31Var = this.f21305g;
        if (f31Var != null || this.f21306h == null) {
            if (f31Var == null || this.f21306h != null) {
                if (f31Var != null && this.f21306h != null) {
                    throw new IllegalStateException("Invalid internal representation - full");
                }
                if (f31Var != null || this.f21306h != null) {
                    throw new IllegalStateException("Impossible");
                }
                throw new IllegalStateException("Invalid internal representation - empty");
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        int i2 = this.f21304f;
        parcel.writeInt(262145);
        parcel.writeInt(i2);
        byte[] bArrMo7574w = this.f21306h;
        if (bArrMo7574w == null) {
            bArrMo7574w = this.f21305g.mo7574w();
        }
        C2622l.m5299Q(parcel, 2, bArrMo7574w, false);
        C2622l.m5447v2(parcel, iM5239D1);
    }
}
