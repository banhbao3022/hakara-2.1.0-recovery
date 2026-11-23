package p007c.p190n.p194b.p266d.p290d.p291r.p292l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p290d.p295s.C2518b;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;

/* JADX INFO: renamed from: c.n.b.d.d.r.l.a */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class C2444a extends AbstractC2767a {

    /* JADX INFO: renamed from: g */
    public final String f11199g;

    /* JADX INFO: renamed from: h */
    public final String f11200h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC2496x f11201i;

    /* JADX INFO: renamed from: j */
    public final C2456g f11202j;

    /* JADX INFO: renamed from: k */
    public final boolean f11203k;

    /* JADX INFO: renamed from: l */
    public final boolean f11204l;

    /* JADX INFO: renamed from: f */
    public static final C2518b f11198f = new C2518b("CastMediaOptions");
    public static final Parcelable.Creator<C2444a> CREATOR = new C2479k();

    /* JADX INFO: renamed from: c.n.b.d.d.r.l.a$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public String f11205a = "com.google.android.gms.cast.framework.media.MediaIntentReceiver";

        /* JADX INFO: renamed from: b */
        public C2456g f11206b;

        /* JADX INFO: renamed from: c */
        public boolean f11207c;

        public a() {
            C2456g.a aVar = new C2456g.a();
            this.f11206b = new C2456g(aVar.f11270a, aVar.f11271b, aVar.f11285p, null, aVar.f11272c, aVar.f11273d, aVar.f11274e, aVar.f11275f, aVar.f11276g, aVar.f11277h, aVar.f11278i, aVar.f11279j, aVar.f11280k, aVar.f11281l, aVar.f11282m, aVar.f11283n, aVar.f11284o, C2456g.a.m5058a("notificationImageSizeDimenResId"), C2456g.a.m5058a("castingToDeviceStringResId"), C2456g.a.m5058a("stopLiveStreamStringResId"), C2456g.a.m5058a("pauseStringResId"), C2456g.a.m5058a("playStringResId"), C2456g.a.m5058a("skipNextStringResId"), C2456g.a.m5058a("skipPrevStringResId"), C2456g.a.m5058a("forwardStringResId"), C2456g.a.m5058a("forward10StringResId"), C2456g.a.m5058a("forward30StringResId"), C2456g.a.m5058a("rewindStringResId"), C2456g.a.m5058a("rewind10StringResId"), C2456g.a.m5058a("rewind30StringResId"), C2456g.a.m5058a("disconnectStringResId"), null);
            this.f11207c = true;
        }
    }

    public C2444a(String str, String str2, IBinder iBinder, C2456g c2456g, boolean z, boolean z2) {
        InterfaceC2496x c2498z;
        this.f11199g = str;
        this.f11200h = str2;
        if (iBinder == null) {
            c2498z = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.IImagePicker");
            c2498z = iInterfaceQueryLocalInterface instanceof InterfaceC2496x ? (InterfaceC2496x) iInterfaceQueryLocalInterface : new C2498z(iBinder);
        }
        this.f11201i = c2498z;
        this.f11202j = c2456g;
        this.f11203k = z;
        this.f11204l = z2;
    }

    /* JADX INFO: renamed from: H */
    public C2448c m5036H() {
        InterfaceC2496x interfaceC2496x = this.f11201i;
        if (interfaceC2496x == null) {
            return null;
        }
        try {
            return (C2448c) BinderC2800b.m5639T1(interfaceC2496x.mo5040r0());
        } catch (RemoteException e) {
            f11198f.m5120b(e, "Unable to call %s on %s.", "getWrappedClientObject", InterfaceC2496x.class.getSimpleName());
            return null;
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        C2622l.m5315U(parcel, 2, this.f11199g, false);
        C2622l.m5315U(parcel, 3, this.f11200h, false);
        InterfaceC2496x interfaceC2496x = this.f11201i;
        C2622l.m5303R(parcel, 4, interfaceC2496x == null ? null : interfaceC2496x.asBinder(), false);
        C2622l.m5311T(parcel, 5, this.f11202j, i, false);
        boolean z = this.f11203k;
        parcel.writeInt(262150);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.f11204l;
        parcel.writeInt(262151);
        parcel.writeInt(z2 ? 1 : 0);
        C2622l.m5447v2(parcel, iM5239D1);
    }
}
