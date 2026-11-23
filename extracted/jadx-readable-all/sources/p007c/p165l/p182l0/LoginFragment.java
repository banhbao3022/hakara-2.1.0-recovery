package p007c.p165l.p182l0;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import mtp.media.karaoke.R;
import p007c.p165l.AccessToken;
import p007c.p165l.FacebookException;
import p636z0.p667e.p676b.C7804v0;
import p636z0.p752p.p753c.Fragment;
import p636z0.p752p.p753c.FragmentActivity;

/* JADX INFO: renamed from: c.l.l0.o, reason: use source file name */
/* JADX INFO: compiled from: LoginFragment.java */
/* JADX INFO: loaded from: classes.dex */
public class LoginFragment extends Fragment {

    /* JADX INFO: renamed from: c0 */
    public String f5147c0;

    /* JADX INFO: renamed from: d0 */
    public LoginClient f5148d0;

    /* JADX INFO: renamed from: e0 */
    public LoginClient.d f5149e0;

    /* JADX INFO: renamed from: c.l.l0.o$a */
    /* JADX INFO: compiled from: LoginFragment.java */
    public class a implements LoginClient.c {
        public a() {
        }
    }

    /* JADX INFO: renamed from: c.l.l0.o$b */
    /* JADX INFO: compiled from: LoginFragment.java */
    public class b implements LoginClient.b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f5151a;

        public b(LoginFragment loginFragment, View view) {
            this.f5151a = view;
        }
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: X */
    public void mo2588X(int i, int i2, Intent intent) {
        super.mo2588X(i, i2, intent);
        LoginClient loginClient = this.f5148d0;
        if (loginClient.f5122l != null) {
            loginClient.m2579f().mo2555g(i, i2, intent);
        }
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: c0 */
    public void mo465c0(Bundle bundle) {
        Bundle bundleExtra;
        super.mo465c0(bundle);
        if (bundle != null) {
            LoginClient loginClient = (LoginClient) bundle.getParcelable("loginClient");
            this.f5148d0 = loginClient;
            if (loginClient.f5118h != null) {
                throw new FacebookException("Can't set fragment once it is already set.");
            }
            loginClient.f5118h = this;
        } else {
            this.f5148d0 = new LoginClient(this);
        }
        this.f5148d0.f5119i = new a();
        FragmentActivity fragmentActivityM16568t = m16562f();
        if (fragmentActivityM16568t == null) {
            return;
        }
        ComponentName callingActivity = fragmentActivityM16568t.getCallingActivity();
        if (callingActivity != null) {
            this.f5147c0 = callingActivity.getPackageName();
        }
        Intent intent = fragmentActivityM16568t.getIntent();
        if (intent == null || (bundleExtra = intent.getBundleExtra("com.facebook.LoginFragment:Request")) == null) {
            return;
        }
        this.f5149e0 = (LoginClient.d) bundleExtra.getParcelable("request");
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: f0 */
    public View mo466f0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.com_facebook_login_fragment, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(R.id.com_facebook_login_fragment_progress_bar);
        this.f5148d0.f5120j = new b(this, viewFindViewById);
        return viewInflate;
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: g0 */
    public void mo1956g0() {
        LoginClient loginClient = this.f5148d0;
        if (loginClient.f5117g >= 0) {
            loginClient.m2579f().mo2570b();
        }
        this.f38414K = true;
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: o0 */
    public void mo2074o0() {
        this.f38414K = true;
        View view = this.f38416M;
        View viewFindViewById = view == null ? null : view.findViewById(R.id.com_facebook_login_fragment_progress_bar);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(8);
        }
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: s0 */
    public void mo2076s0() {
        this.f38414K = true;
        if (this.f5147c0 == null) {
            Log.e("LoginFragment", "Cannot call LoginFragment with a null calling package. This can occur if the launchMode of the caller is singleInstance.");
            m16562f().finish();
            return;
        }
        LoginClient loginClient = this.f5148d0;
        LoginClient.d dVar = this.f5149e0;
        LoginClient.d dVar2 = loginClient.f5122l;
        if ((dVar2 != null && loginClient.f5117g >= 0) || dVar == null) {
            return;
        }
        if (dVar2 != null) {
            throw new FacebookException("Attempted to authorize while a request is pending.");
        }
        if (!AccessToken.m2248c() || loginClient.m2575b()) {
            loginClient.f5122l = dVar;
            ArrayList arrayList = new ArrayList();
            int i = dVar.f5126f;
            if (C7804v0.m15329r(i)) {
                arrayList.add(new GetTokenLoginMethodHandler(loginClient));
            }
            if (C7804v0.m15330s(i)) {
                arrayList.add(new KatanaProxyLoginMethodHandler(loginClient));
            }
            if (C7804v0.m15328q(i)) {
                arrayList.add(new FacebookLiteLoginMethodHandler(loginClient));
            }
            if (C7804v0.m15326o(i)) {
                arrayList.add(new CustomTabLoginMethodHandler(loginClient));
            }
            if (C7804v0.m15331t(i)) {
                arrayList.add(new WebViewLoginMethodHandler(loginClient));
            }
            if (C7804v0.m15327p(i)) {
                arrayList.add(new DeviceAuthMethodHandler(loginClient));
            }
            LoginMethodHandler[] loginMethodHandlerArr = new LoginMethodHandler[arrayList.size()];
            arrayList.toArray(loginMethodHandlerArr);
            loginClient.f5116f = loginMethodHandlerArr;
            loginClient.m2582l();
        }
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: t0 */
    public void mo470t0(Bundle bundle) {
        bundle.putParcelable("loginClient", this.f5148d0);
    }
}
