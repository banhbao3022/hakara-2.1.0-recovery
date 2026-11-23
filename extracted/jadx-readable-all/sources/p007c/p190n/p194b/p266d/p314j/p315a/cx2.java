package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p310g.AbstractC2801c;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class cx2 extends fx2<InterfaceC3234l0> {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f13148b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ex2 f13149c;

    public cx2(ex2 ex2Var, Context context) {
        this.f13149c = ex2Var;
        this.f13148b = context;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.fx2
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ InterfaceC3234l0 mo5889a() {
        ex2.m6696b(this.f13148b, "mobile_ads_settings");
        return new BinderC2977e2();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.fx2
    /* JADX INFO: renamed from: b */
    public final InterfaceC3234l0 mo5890b() throws RemoteException {
        C3680x1 c3680x1 = this.f13149c.f13751c;
        Context context = this.f13148b;
        Objects.requireNonNull(c3680x1);
        try {
            BinderC2800b binderC2800b = new BinderC2800b(context);
            C3271m0 c3271m0M5641b = c3680x1.m5641b(context);
            Parcel parcelM7001E0 = c3271m0M5641b.m7001E0();
            ig2.m7253d(parcelM7001E0, binderC2800b);
            parcelM7001E0.writeInt(210890000);
            Parcel parcelM7003i1 = c3271m0M5641b.m7003i1(1, parcelM7001E0);
            IBinder strongBinder = parcelM7003i1.readStrongBinder();
            parcelM7003i1.recycle();
            if (strongBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return iInterfaceQueryLocalInterface instanceof InterfaceC3234l0 ? (InterfaceC3234l0) iInterfaceQueryLocalInterface : new C3160j0(strongBinder);
        } catch (RemoteException | AbstractC2801c.a e) {
            C2622l.m5241D3("Could not get remote MobileAdsSettingManager.", e);
            return null;
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.fx2
    /* JADX INFO: renamed from: c */
    public final InterfaceC3234l0 mo5891c(InterfaceC2975e0 interfaceC2975e0) throws RemoteException {
        return interfaceC2975e0.mo6132Z4(new BinderC2800b(this.f13148b), 210890000);
    }
}
