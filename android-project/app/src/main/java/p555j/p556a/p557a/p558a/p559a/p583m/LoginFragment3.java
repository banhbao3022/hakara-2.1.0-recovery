package p555j.p556a.p557a.p558a.p559a.p583m;

import p007c.p071d.p078c.p079a.outline;
import p007c.p165l.AccessToken;
import p007c.p165l.FacebookCallback;
import p007c.p165l.FacebookException;
import p007c.p165l.p182l0.LoginResult;
import p477d1.p493x.p495c.Intrinsics2;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p636z0.p752p.p753c.FragmentActivity;

/* JADX INFO: renamed from: j.a.a.a.a.m.b, reason: use source file name */
/* JADX INFO: compiled from: LoginFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class LoginFragment3 implements FacebookCallback<LoginResult> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ LoginFragment2 f31661a;

    public LoginFragment3(LoginFragment2 loginFragment2) {
        this.f31661a = loginFragment2;
    }

    @Override // p007c.p165l.FacebookCallback
    /* JADX INFO: renamed from: a */
    public void mo2276a(LoginResult loginResult) {
        LoginResult loginResult2 = loginResult;
        if (loginResult2 != null) {
            LoginFragment2 loginFragment2 = this.f31661a;
            AccessToken accessToken = loginResult2.f5164a;
            Intrinsics2.m13088d(accessToken, "it.accessToken");
            LoginFragment2.b bVar = LoginFragment2.f31647t0;
            loginFragment2.m13937j1(accessToken);
        }
    }

    @Override // p007c.p165l.FacebookCallback
    /* JADX INFO: renamed from: b */
    public void mo2277b() {
        FragmentActivity fragmentActivityM16562f = this.f31661a.m16562f();
        if (fragmentActivityM16562f != null) {
            SkuDao.a.m14094j0(fragmentActivityM16562f, "Facebook login cancelled", 0, 2);
        }
    }

    @Override // p007c.p165l.FacebookCallback
    /* JADX INFO: renamed from: c */
    public void mo2278c(FacebookException facebookException) {
        FragmentActivity fragmentActivityM16562f = this.f31661a.m16562f();
        if (fragmentActivityM16562f != null) {
            StringBuilder sbM1556G = outline.m1556G("Facebook login failed: ");
            sbM1556G.append(String.valueOf(facebookException));
            SkuDao.a.m14094j0(fragmentActivityM16562f, sbM1556G.toString(), 0, 2);
        }
    }
}
