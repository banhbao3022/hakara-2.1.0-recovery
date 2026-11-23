package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p267a.C2103a;
import p007c.p190n.p194b.p266d.p267a.C2186m;
import p007c.p190n.p194b.p266d.p267a.C2192s;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class yv2 extends AbstractC2767a {
    public static final Parcelable.Creator<yv2> CREATOR = new zv2();

    /* JADX INFO: renamed from: f */
    public final int f22116f;

    /* JADX INFO: renamed from: g */
    public final String f22117g;

    /* JADX INFO: renamed from: h */
    public final String f22118h;

    /* JADX INFO: renamed from: i */
    public yv2 f22119i;

    /* JADX INFO: renamed from: j */
    public IBinder f22120j;

    public yv2(int i, String str, String str2, yv2 yv2Var, IBinder iBinder) {
        this.f22116f = i;
        this.f22117g = str;
        this.f22118h = str2;
        this.f22119i = yv2Var;
        this.f22120j = iBinder;
    }

    /* JADX INFO: renamed from: H */
    public final C2103a m8836H() {
        yv2 yv2Var = this.f22119i;
        return new C2103a(this.f22116f, this.f22117g, this.f22118h, yv2Var == null ? null : new C2103a(yv2Var.f22116f, yv2Var.f22117g, yv2Var.f22118h));
    }

    /* JADX INFO: renamed from: K */
    public final C2186m m8837K() {
        InterfaceC2976e1 c2902c1;
        yv2 yv2Var = this.f22119i;
        C2103a c2103a = yv2Var == null ? null : new C2103a(yv2Var.f22116f, yv2Var.f22117g, yv2Var.f22118h);
        int i = this.f22116f;
        String str = this.f22117g;
        String str2 = this.f22118h;
        IBinder iBinder = this.f22120j;
        if (iBinder == null) {
            c2902c1 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            c2902c1 = iInterfaceQueryLocalInterface instanceof InterfaceC2976e1 ? (InterfaceC2976e1) iInterfaceQueryLocalInterface : new C2902c1(iBinder);
        }
        return new C2186m(i, str, str2, c2103a, c2902c1 != null ? new C2192s(c2902c1) : null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        int i2 = this.f22116f;
        parcel.writeInt(262145);
        parcel.writeInt(i2);
        C2622l.m5315U(parcel, 2, this.f22117g, false);
        C2622l.m5315U(parcel, 3, this.f22118h, false);
        C2622l.m5311T(parcel, 4, this.f22119i, i, false);
        C2622l.m5303R(parcel, 5, this.f22120j, false);
        C2622l.m5447v2(parcel, iM5239D1);
    }
}
