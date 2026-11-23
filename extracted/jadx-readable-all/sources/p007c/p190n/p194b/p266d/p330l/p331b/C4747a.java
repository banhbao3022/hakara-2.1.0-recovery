package p007c.p190n.p194b.p266d.p330l.p331b;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import p007c.p190n.p194b.p266d.p285b.p286a.p287d.p288d.C2339c;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p299o.AbstractC2632e;
import p007c.p190n.p194b.p266d.p298f.p299o.p300n.BinderC2684p0;
import p007c.p190n.p194b.p266d.p298f.p299o.p300n.RunnableC2688r0;
import p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c;
import p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2735i;
import p007c.p190n.p194b.p266d.p298f.p302q.C2720d;
import p007c.p190n.p194b.p266d.p298f.p302q.C2757s;
import p007c.p190n.p194b.p266d.p330l.C4746a;
import p007c.p190n.p194b.p266d.p330l.InterfaceC4761e;

/* JADX INFO: renamed from: c.n.b.d.l.b.a */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class C4747a extends AbstractC2735i<InterfaceC4752f> implements InterfaceC4761e {

    /* JADX INFO: renamed from: A */
    public final boolean f24637A;

    /* JADX INFO: renamed from: B */
    public final C2720d f24638B;

    /* JADX INFO: renamed from: C */
    public final Bundle f24639C;

    /* JADX INFO: renamed from: D */
    public Integer f24640D;

    public C4747a(Context context, Looper looper, boolean z, C2720d c2720d, C4746a c4746a, AbstractC2632e.a aVar, AbstractC2632e.b bVar) {
        C4746a c4746a2 = c2720d.f11831h;
        Integer num = c2720d.f11832i;
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", c2720d.f11824a);
        if (num != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
        }
        if (c4746a2 != null) {
            bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
            bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
            bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
            bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
            bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
            bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
            bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
            bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        }
        super(context, looper, 44, c2720d, aVar, bVar);
        this.f24637A = true;
        this.f24638B = c2720d;
        this.f24639C = bundle;
        this.f24640D = c2720d.f11832i;
    }

    @Override // p007c.p190n.p194b.p266d.p330l.InterfaceC4761e
    /* JADX INFO: renamed from: K */
    public final void mo10916K() {
        m5574f(new AbstractC2717c.d());
    }

    @Override // p007c.p190n.p194b.p266d.p330l.InterfaceC4761e
    /* JADX INFO: renamed from: c */
    public final void mo10917c(InterfaceC4750d interfaceC4750d) {
        C2622l.m5379i(interfaceC4750d, "Expecting a valid ISignInCallbacks");
        try {
            Account account = this.f24638B.f11824a;
            if (account == null) {
                account = new Account("<<default account>>", "com.google");
            }
            ((InterfaceC4752f) m5581u()).mo10918j6(new C4756j(new C2757s(account, this.f24640D.intValue(), "<<default account>>".equals(account.name) ? C2339c.m4912a(this.f11801c).m4914b() : null)), interfaceC4750d);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                BinderC2684p0 binderC2684p0 = (BinderC2684p0) interfaceC4750d;
                binderC2684p0.f11740h.post(new RunnableC2688r0(binderC2684p0, new C4758l(8)));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c
    /* JADX INFO: renamed from: h */
    public String mo4923h() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c
    /* JADX INFO: renamed from: i */
    public /* synthetic */ IInterface mo4924i(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC4752f ? (InterfaceC4752f) iInterfaceQueryLocalInterface : new C4754h(iBinder);
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2735i, p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c, p007c.p190n.p194b.p266d.p298f.p299o.C2628a.f
    /* JADX INFO: renamed from: k */
    public int mo4925k() {
        return 12451000;
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c, p007c.p190n.p194b.p266d.p298f.p299o.C2628a.f
    /* JADX INFO: renamed from: m */
    public boolean mo5480m() {
        return this.f24637A;
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c
    /* JADX INFO: renamed from: n */
    public String mo4926n() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c
    /* JADX INFO: renamed from: s */
    public Bundle mo5135s() {
        if (!this.f11801c.getPackageName().equals(this.f24638B.f11829f)) {
            this.f24639C.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f24638B.f11829f);
        }
        return this.f24639C;
    }
}
