package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p310g.AbstractC2801c;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class bx2 extends fx2<InterfaceC3455r> {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f12889b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f12890c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC3395pd f12891d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ex2 f12892e;

    public bx2(ex2 ex2Var, Context context, String str, InterfaceC3395pd interfaceC3395pd) {
        this.f12892e = ex2Var;
        this.f12889b = context;
        this.f12890c = str;
        this.f12891d = interfaceC3395pd;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.fx2
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ InterfaceC3455r mo5889a() {
        ex2.m6696b(this.f12889b, "native_ad");
        return new BinderC2828a2();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.fx2
    /* JADX INFO: renamed from: b */
    public final InterfaceC3455r mo5890b() throws RemoteException {
        cw2 cw2Var = this.f12892e.f13750b;
        Context context = this.f12889b;
        String str = this.f12890c;
        InterfaceC3395pd interfaceC3395pd = this.f12891d;
        Objects.requireNonNull(cw2Var);
        try {
            IBinder iBinderM8335K2 = cw2Var.m5641b(context).m8335K2(new BinderC2800b(context), str, interfaceC3395pd, 210890000);
            if (iBinderM8335K2 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderM8335K2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return iInterfaceQueryLocalInterface instanceof InterfaceC3455r ? (InterfaceC3455r) iInterfaceQueryLocalInterface : new C3381p(iBinderM8335K2);
        } catch (RemoteException | AbstractC2801c.a e) {
            C2622l.m5241D3("Could not create remote builder for AdLoader.", e);
            return null;
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.fx2
    /* JADX INFO: renamed from: c */
    public final InterfaceC3455r mo5891c(InterfaceC2975e0 interfaceC2975e0) throws RemoteException {
        return interfaceC2975e0.mo6137t6(new BinderC2800b(this.f12889b), this.f12890c, this.f12891d, 210890000);
    }
}
