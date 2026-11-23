package p007c.p190n.p194b.p266d.p297e;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;

/* JADX INFO: renamed from: c.n.b.d.e.a */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2571a extends AbstractC2767a {
    public static final Parcelable.Creator<C2571a> CREATOR = new C2578e();

    /* JADX INFO: renamed from: f */
    public Intent f11493f;

    public C2571a(Intent intent) {
        this.f11493f = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        C2622l.m5311T(parcel, 1, this.f11493f, i, false);
        C2622l.m5447v2(parcel, iM5239D1);
    }
}
