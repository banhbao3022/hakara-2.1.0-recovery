package p007c.p165l.p182l0;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p007c.p165l.AccessTokenSource;
import p007c.p165l.FacebookException;
import p007c.p165l.p178k0.FacebookDialogFragment;
import p007c.p165l.p178k0.Utility;
import p007c.p165l.p178k0.WebDialog;
import p636z0.p752p.p753c.FragmentActivity;

/* JADX INFO: renamed from: c.l.l0.y, reason: use source file name */
/* JADX INFO: compiled from: WebViewLoginMethodHandler.java */
/* JADX INFO: loaded from: classes.dex */
public class WebViewLoginMethodHandler extends WebLoginMethodHandler {
    public static final Parcelable.Creator<WebViewLoginMethodHandler> CREATOR = new b();

    /* JADX INFO: renamed from: i */
    public WebDialog f5167i;

    /* JADX INFO: renamed from: j */
    public String f5168j;

    /* JADX INFO: renamed from: c.l.l0.y$a */
    /* JADX INFO: compiled from: WebViewLoginMethodHandler.java */
    public class a implements WebDialog.f {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LoginClient.d f5169a;

        public a(LoginClient.d dVar) {
            this.f5169a = dVar;
        }

        @Override // p007c.p165l.p178k0.WebDialog.f
        /* JADX INFO: renamed from: a */
        public void mo2494a(Bundle bundle, FacebookException facebookException) {
            WebViewLoginMethodHandler.this.m2601o(this.f5169a, bundle, facebookException);
        }
    }

    /* JADX INFO: renamed from: c.l.l0.y$b */
    /* JADX INFO: compiled from: WebViewLoginMethodHandler.java */
    public static class b implements Parcelable.Creator<WebViewLoginMethodHandler> {
        @Override // android.os.Parcelable.Creator
        public WebViewLoginMethodHandler createFromParcel(Parcel parcel) {
            return new WebViewLoginMethodHandler(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public WebViewLoginMethodHandler[] newArray(int i) {
            return new WebViewLoginMethodHandler[i];
        }
    }

    /* JADX INFO: renamed from: c.l.l0.y$c */
    /* JADX INFO: compiled from: WebViewLoginMethodHandler.java */
    public static class c extends WebDialog.d {

        /* JADX INFO: renamed from: g */
        public String f5171g;

        /* JADX INFO: renamed from: h */
        public String f5172h;

        /* JADX INFO: renamed from: i */
        public String f5173i;

        public c(Context context, String str, Bundle bundle) {
            super(context, str, "oauth", bundle);
            this.f5173i = "fbconnect://success";
        }

        @Override // p007c.p165l.p178k0.WebDialog.d
        /* JADX INFO: renamed from: a */
        public WebDialog mo2493a() {
            Bundle bundle = this.f4941e;
            bundle.putString("redirect_uri", this.f5173i);
            bundle.putString("client_id", this.f4938b);
            bundle.putString("e2e", this.f5171g);
            bundle.putString("response_type", "token,signed_request,graph_domain");
            bundle.putString("return_scopes", "true");
            bundle.putString("auth_type", this.f5172h);
            Context context = this.f4937a;
            WebDialog.f fVar = this.f4940d;
            WebDialog.m2487b(context);
            return new WebDialog(context, "oauth", bundle, 0, fVar);
        }
    }

    public WebViewLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    @Override // p007c.p165l.p182l0.LoginMethodHandler
    /* JADX INFO: renamed from: b */
    public void mo2570b() {
        WebDialog webDialog = this.f5167i;
        if (webDialog != null) {
            webDialog.cancel();
            this.f5167i = null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // p007c.p165l.p182l0.LoginMethodHandler
    /* JADX INFO: renamed from: e */
    public String mo2554e() {
        return "web_view";
    }

    @Override // p007c.p165l.p182l0.LoginMethodHandler
    /* JADX INFO: renamed from: i */
    public boolean mo2557i(LoginClient.d dVar) {
        Bundle bundleM2599k = m2599k(dVar);
        a aVar = new a(dVar);
        String strM2572g = LoginClient.m2572g();
        this.f5168j = strM2572g;
        m2596a("e2e", strM2572g);
        FragmentActivity fragmentActivityM2578e = this.f5163g.m2578e();
        boolean zM2463v = Utility.m2463v(fragmentActivityM2578e);
        c cVar = new c(fragmentActivityM2578e, dVar.f5129i, bundleM2599k);
        cVar.f5171g = this.f5168j;
        cVar.f5173i = zM2463v ? "fbconnect://chrome_os_success" : "fbconnect://success";
        cVar.f5172h = dVar.f5133m;
        cVar.f4940d = aVar;
        this.f5167i = cVar.mo2493a();
        FacebookDialogFragment facebookDialogFragment = new FacebookDialogFragment();
        facebookDialogFragment.m16551S0(true);
        facebookDialogFragment.f4955t0 = this.f5167i;
        facebookDialogFragment.mo5469c1(fragmentActivityM2578e.m16577C(), "FacebookDialogFragment");
        return true;
    }

    @Override // p007c.p165l.p182l0.WebLoginMethodHandler
    /* JADX INFO: renamed from: n */
    public AccessTokenSource mo2558n() {
        return AccessTokenSource.WEB_VIEW;
    }

    @Override // p007c.p165l.p182l0.LoginMethodHandler, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Utility.m2441N(parcel, this.f5162f);
        parcel.writeString(this.f5168j);
    }

    public WebViewLoginMethodHandler(Parcel parcel) {
        super(parcel);
        this.f5168j = parcel.readString();
    }
}
