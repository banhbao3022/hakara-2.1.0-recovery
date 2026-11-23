package p007c.p190n.p194b.p266d.p267a.p279w;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;

/* JADX INFO: renamed from: c.n.b.d.a.w.a */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2198a extends AbstractC2767a {

    @RecentlyNonNull
    public static final Parcelable.Creator<C2198a> CREATOR = new C2207j();

    /* JADX INFO: renamed from: f */
    public final boolean f10596f;

    /* JADX INFO: renamed from: g */
    public final IBinder f10597g;

    public C2198a(boolean z, IBinder iBinder) {
        this.f10596f = z;
        this.f10597g = iBinder;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        boolean z = this.f10596f;
        parcel.writeInt(262145);
        parcel.writeInt(z ? 1 : 0);
        C2622l.m5303R(parcel, 2, this.f10597g, false);
        C2622l.m5447v2(parcel, iM5239D1);
    }
}
