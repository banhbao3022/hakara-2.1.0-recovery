package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Map;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: renamed from: c.n.b.d.j.a.sh */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3510sh extends AbstractC2767a {
    public static final Parcelable.Creator<C3510sh> CREATOR = new C3547th();

    /* JADX INFO: renamed from: f */
    public final View f19555f;

    /* JADX INFO: renamed from: g */
    public final Map<String, WeakReference<View>> f19556g;

    public C3510sh(IBinder iBinder, IBinder iBinder2) {
        this.f19555f = (View) BinderC2800b.m5639T1(InterfaceC2799a.a.m5638i1(iBinder));
        this.f19556g = (Map) BinderC2800b.m5639T1(InterfaceC2799a.a.m5638i1(iBinder2));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        C2622l.m5303R(parcel, 1, new BinderC2800b(this.f19555f), false);
        C2622l.m5303R(parcel, 2, new BinderC2800b(this.f19556g), false);
        C2622l.m5447v2(parcel, iM5239D1);
    }
}
