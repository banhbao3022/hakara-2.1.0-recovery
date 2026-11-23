package p007c.p190n.p194b.p266d.p330l.p331b;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p299o.InterfaceC2638k;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;

/* JADX INFO: renamed from: c.n.b.d.l.b.c */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4749c extends AbstractC2767a implements InterfaceC2638k {
    public static final Parcelable.Creator<C4749c> CREATOR = new C4748b();

    /* JADX INFO: renamed from: f */
    public final int f24641f;

    /* JADX INFO: renamed from: g */
    public int f24642g;

    /* JADX INFO: renamed from: h */
    public Intent f24643h;

    public C4749c() {
        this.f24641f = 2;
        this.f24642g = 0;
        this.f24643h = null;
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p299o.InterfaceC2638k
    /* JADX INFO: renamed from: B */
    public final Status mo4909B() {
        return this.f24642g == 0 ? Status.f28648f : Status.f28652j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        int i2 = this.f24641f;
        parcel.writeInt(262145);
        parcel.writeInt(i2);
        int i3 = this.f24642g;
        parcel.writeInt(262146);
        parcel.writeInt(i3);
        C2622l.m5311T(parcel, 3, this.f24643h, i, false);
        C2622l.m5447v2(parcel, iM5239D1);
    }

    public C4749c(int i, int i2, Intent intent) {
        this.f24641f = i;
        this.f24642g = i2;
        this.f24643h = intent;
    }
}
