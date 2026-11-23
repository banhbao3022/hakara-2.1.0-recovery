package p007c.p190n.p194b.p266d.p298f;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: renamed from: c.n.b.d.f.i0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2617i0 extends AbstractC2767a {
    public static final Parcelable.Creator<C2617i0> CREATOR = new C2619j0();

    /* JADX INFO: renamed from: f */
    public final String f11578f;

    /* JADX INFO: renamed from: g */
    public final boolean f11579g;

    /* JADX INFO: renamed from: h */
    public final boolean f11580h;

    /* JADX INFO: renamed from: i */
    public final Context f11581i;

    /* JADX INFO: renamed from: j */
    public final boolean f11582j;

    public C2617i0(String str, boolean z, boolean z2, IBinder iBinder, boolean z3) {
        this.f11578f = str;
        this.f11579g = z;
        this.f11580h = z2;
        this.f11581i = (Context) BinderC2800b.m5639T1(InterfaceC2799a.a.m5638i1(iBinder));
        this.f11582j = z3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        C2622l.m5315U(parcel, 1, this.f11578f, false);
        boolean z = this.f11579g;
        parcel.writeInt(262146);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.f11580h;
        parcel.writeInt(262147);
        parcel.writeInt(z2 ? 1 : 0);
        C2622l.m5303R(parcel, 4, new BinderC2800b(this.f11581i), false);
        boolean z3 = this.f11582j;
        parcel.writeInt(262149);
        parcel.writeInt(z3 ? 1 : 0);
        C2622l.m5447v2(parcel, iM5239D1);
    }
}
