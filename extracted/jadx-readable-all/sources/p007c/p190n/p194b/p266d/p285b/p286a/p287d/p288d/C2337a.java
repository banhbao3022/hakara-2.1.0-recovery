package p007c.p190n.p194b.p266d.p285b.p286a.p287d.p288d;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p285b.p286a.p287d.InterfaceC2335b;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;

/* JADX INFO: renamed from: c.n.b.d.b.a.d.d.a */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class C2337a extends AbstractC2767a {
    public static final Parcelable.Creator<C2337a> CREATOR = new C2340d();

    /* JADX INFO: renamed from: f */
    public final int f10932f;

    /* JADX INFO: renamed from: g */
    public int f10933g;

    /* JADX INFO: renamed from: h */
    public Bundle f10934h;

    public C2337a(int i, int i2, Bundle bundle) {
        this.f10932f = i;
        this.f10933g = i2;
        this.f10934h = bundle;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        int i2 = this.f10932f;
        parcel.writeInt(262145);
        parcel.writeInt(i2);
        int i3 = this.f10933g;
        parcel.writeInt(262146);
        parcel.writeInt(i3);
        C2622l.m5295P(parcel, 3, this.f10934h, false);
        C2622l.m5447v2(parcel, iM5239D1);
    }

    public C2337a(InterfaceC2335b interfaceC2335b) {
        int iM4907a = interfaceC2335b.m4907a();
        Bundle bundleM4908b = interfaceC2335b.m4908b();
        this.f10932f = 1;
        this.f10933g = iM4907a;
        this.f10934h = bundleM4908b;
    }
}
