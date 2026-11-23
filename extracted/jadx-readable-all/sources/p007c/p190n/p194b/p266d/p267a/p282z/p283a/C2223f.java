package p007c.p190n.p194b.p266d.p267a.p282z.p283a;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: renamed from: c.n.b.d.a.z.a.f */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2223f extends AbstractC2767a {
    public static final Parcelable.Creator<C2223f> CREATOR = new C2222e();

    /* JADX INFO: renamed from: f */
    public final String f10632f;

    /* JADX INFO: renamed from: g */
    public final String f10633g;

    /* JADX INFO: renamed from: h */
    public final String f10634h;

    /* JADX INFO: renamed from: i */
    public final String f10635i;

    /* JADX INFO: renamed from: j */
    public final String f10636j;

    /* JADX INFO: renamed from: k */
    public final String f10637k;

    /* JADX INFO: renamed from: l */
    public final String f10638l;

    /* JADX INFO: renamed from: m */
    public final Intent f10639m;

    /* JADX INFO: renamed from: n */
    public final InterfaceC2240w f10640n;

    /* JADX INFO: renamed from: o */
    public final boolean f10641o;

    public C2223f(Intent intent, InterfaceC2240w interfaceC2240w) {
        this(null, null, null, null, null, null, null, intent, new BinderC2800b(interfaceC2240w), false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        C2622l.m5315U(parcel, 2, this.f10632f, false);
        C2622l.m5315U(parcel, 3, this.f10633g, false);
        C2622l.m5315U(parcel, 4, this.f10634h, false);
        C2622l.m5315U(parcel, 5, this.f10635i, false);
        C2622l.m5315U(parcel, 6, this.f10636j, false);
        C2622l.m5315U(parcel, 7, this.f10637k, false);
        C2622l.m5315U(parcel, 8, this.f10638l, false);
        C2622l.m5311T(parcel, 9, this.f10639m, i, false);
        C2622l.m5303R(parcel, 10, new BinderC2800b(this.f10640n), false);
        boolean z = this.f10641o;
        parcel.writeInt(262155);
        parcel.writeInt(z ? 1 : 0);
        C2622l.m5447v2(parcel, iM5239D1);
    }

    public C2223f(String str, String str2, String str3, String str4, String str5, String str6, String str7, InterfaceC2240w interfaceC2240w) {
        this(str, str2, str3, str4, str5, str6, str7, null, new BinderC2800b(interfaceC2240w), false);
    }

    public C2223f(String str, String str2, String str3, String str4, String str5, String str6, String str7, Intent intent, IBinder iBinder, boolean z) {
        this.f10632f = str;
        this.f10633g = str2;
        this.f10634h = str3;
        this.f10635i = str4;
        this.f10636j = str5;
        this.f10637k = str6;
        this.f10638l = str7;
        this.f10639m = intent;
        this.f10640n = (InterfaceC2240w) BinderC2800b.m5639T1(InterfaceC2799a.a.m5638i1(iBinder));
        this.f10641o = z;
    }
}
