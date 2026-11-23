package p007c.p190n.p194b.p266d.p314j.p315a;

import android.app.Activity;
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
public final class tw2 extends fx2<InterfaceC2955dh> {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Activity f20175b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ex2 f20176c;

    public tw2(ex2 ex2Var, Activity activity) {
        this.f20176c = ex2Var;
        this.f20175b = activity;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.fx2
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ InterfaceC2955dh mo5889a() {
        ex2.m6696b(this.f20175b, "ad_overlay");
        return null;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.fx2
    /* JADX INFO: renamed from: b */
    public final InterfaceC2955dh mo5890b() throws RemoteException {
        C2843ah c2843ah = this.f20176c.f13752d;
        Activity activity = this.f20175b;
        Objects.requireNonNull(c2843ah);
        try {
            BinderC2800b binderC2800b = new BinderC2800b(activity);
            C2992eh c2992ehM5641b = c2843ah.m5641b(activity);
            Parcel parcelM7001E0 = c2992ehM5641b.m7001E0();
            ig2.m7253d(parcelM7001E0, binderC2800b);
            Parcel parcelM7003i1 = c2992ehM5641b.m7003i1(1, parcelM7001E0);
            IBinder strongBinder = parcelM7003i1.readStrongBinder();
            parcelM7003i1.recycle();
            if (strongBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            return iInterfaceQueryLocalInterface instanceof InterfaceC2955dh ? (InterfaceC2955dh) iInterfaceQueryLocalInterface : new C2880bh(strongBinder);
        } catch (RemoteException e) {
            C2622l.m5241D3("Could not create remote AdOverlay.", e);
            return null;
        } catch (AbstractC2801c.a e2) {
            C2622l.m5241D3("Could not create remote AdOverlay.", e2);
            return null;
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.fx2
    /* JADX INFO: renamed from: c */
    public final InterfaceC2955dh mo5891c(InterfaceC2975e0 interfaceC2975e0) throws RemoteException {
        return interfaceC2975e0.mo6135q0(new BinderC2800b(this.f20175b));
    }
}
