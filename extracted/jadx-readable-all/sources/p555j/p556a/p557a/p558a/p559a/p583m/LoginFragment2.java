package p555j.p556a.p557a.p558a.p559a.p583m;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.facebook.FacebookActivity;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.Simple4;
import mtp.media.karaoke.data.model.User;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p071d.p078c.p079a.outline;
import p007c.p165l.AccessToken;
import p007c.p165l.CallbackManager;
import p007c.p165l.FacebookException;
import p007c.p165l.FacebookSdk;
import p007c.p165l.GraphRequest;
import p007c.p165l.GraphRequest2;
import p007c.p165l.GraphResponse;
import p007c.p165l.LoggingBehavior;
import p007c.p165l.p166h0.InternalAppEventsLogger;
import p007c.p165l.p175i0.C1095a;
import p007c.p165l.p178k0.CallbackManagerImpl;
import p007c.p165l.p178k0.Validate;
import p007c.p165l.p182l0.DefaultAudience;
import p007c.p165l.p182l0.LoginClient;
import p007c.p165l.p182l0.LoginLogger;
import p007c.p165l.p182l0.LoginManager;
import p007c.p165l.p182l0.LoginManager3;
import p007c.p165l.p182l0.LoginManager4;
import p007c.p190n.p194b.p266d.p285b.p286a.p287d.C2334a;
import p007c.p190n.p194b.p266d.p285b.p286a.p287d.C2336c;
import p007c.p190n.p194b.p266d.p285b.p286a.p287d.C2365i;
import p007c.p190n.p194b.p266d.p285b.p286a.p287d.p288d.C2346j;
import p007c.p190n.p194b.p266d.p285b.p286a.p287d.p288d.C2352p;
import p007c.p190n.p194b.p266d.p298f.p299o.C2629b;
import p007c.p190n.p194b.p266d.p298f.p302q.C2714b;
import p007c.p190n.p194b.p266d.p298f.p304r.C2775a;
import p007c.p190n.p194b.p266d.p314j.p325k.C4340s8;
import p007c.p190n.p194b.p266d.p333n.AbstractC4781i;
import p007c.p451o.p452a.C5729a;
import p477d1.Lazy3;
import p477d1.Lazy4;
import p477d1.LazyJVM;
import p477d1.p481d0.Strings5;
import p477d1.p483s.MapsJVM;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p477d1.p493x.p495c.Reflection;
import p526i1.p536d.p543c.p551n.Qualifier;
import p555j.p556a.p557a.p558a.p592b.BaseBottomSheetDialogFragment3;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p616i.LoginFragmentBinding;
import p555j.p556a.p557a.p619l.CustomURLSpan;
import p555j.p556a.p557a.p619l.DeviceUtils;
import p636z0.p667e.p676b.C7804v0;
import p636z0.p752p.C8310a;
import p636z0.p752p.p753c.FragmentActivity;
import p636z0.p759s.Observer;
import p636z0.p759s.ViewModelStoreOwner;

/* JADX INFO: renamed from: j.a.a.a.a.m.a, reason: use source file name */
/* JADX INFO: compiled from: LoginFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class LoginFragment2 extends BaseBottomSheetDialogFragment3<LoginFragmentBinding, LoginViewModel3> {

    /* JADX INFO: renamed from: t0 */
    public static final b f31647t0 = new b(null);

    /* JADX INFO: renamed from: w0 */
    public CallbackManager f31650w0;

    /* JADX INFO: renamed from: x0 */
    public c f31651x0;

    /* JADX INFO: renamed from: z0 */
    public HashMap f31653z0;

    /* JADX INFO: renamed from: u0 */
    public final int f31648u0 = R.layout.login_fragment;

    /* JADX INFO: renamed from: v0 */
    public final Lazy3 f31649v0 = LazyJVM.m13020a(Lazy4.NONE, new a(this, null, null));

    /* JADX INFO: renamed from: y0 */
    public int f31652y0 = 2;

    /* JADX INFO: renamed from: j.a.a.a.a.m.a$a */
    /* JADX INFO: compiled from: ViewModelStoreOwnerExt.kt */
    public static final class a extends Lambda implements InterfaceC6153a<LoginViewModel3> {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ ViewModelStoreOwner f31654g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ Qualifier f31655h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ InterfaceC6153a f31656i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ViewModelStoreOwner viewModelStoreOwner, Qualifier qualifier, InterfaceC6153a interfaceC6153a) {
            super(0);
            this.f31654g = viewModelStoreOwner;
            this.f31655h = qualifier;
            this.f31656i = interfaceC6153a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, j.a.a.a.a.m.e] */
        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public LoginViewModel3 mo2c() {
            return SkuDao.a.m14107t(this.f31654g, Reflection.m13097a(LoginViewModel3.class), this.f31655h, this.f31656i);
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.m.a$b */
    /* JADX INFO: compiled from: LoginFragment.kt */
    public static final class b {
        public b() {
        }

        /* JADX INFO: renamed from: a */
        public final LoginFragment2 m13940a(int i) {
            LoginFragment2 loginFragment2 = new LoginFragment2();
            Bundle bundle = new Bundle();
            bundle.putInt("tab", i);
            loginFragment2.m16540M0(bundle);
            return loginFragment2;
        }

        public b(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.m.a$c */
    /* JADX INFO: compiled from: LoginFragment.kt */
    public interface c {
        /* JADX INFO: renamed from: g */
        void mo13941g(int i);
    }

    /* JADX INFO: renamed from: j.a.a.a.a.m.a$d */
    /* JADX INFO: compiled from: LoginFragment.kt */
    public static final class d implements GraphRequest2.d {
        public d() {
        }

        @Override // p007c.p165l.GraphRequest2.d
        /* JADX INFO: renamed from: a */
        public final void mo2692a(JSONObject jSONObject, GraphResponse graphResponse) {
            JSONObject jSONObjectOptJSONObject;
            Intrinsics2.m13088d(graphResponse, "response");
            if (graphResponse.f5409d == null) {
                HashMap map = new HashMap();
                String strOptString = jSONObject.optString("id");
                Intrinsics2.m13088d(strOptString, "data.optString(\"id\")");
                map.put("fb_user_id", strOptString);
                String strOptString2 = jSONObject.optString("name");
                Intrinsics2.m13088d(strOptString2, "data.optString(\"name\")");
                map.put("full_name", strOptString2);
                String strOptString3 = jSONObject.optString("email");
                Intrinsics2.m13088d(strOptString3, "data.optString(\"email\")");
                map.put("email", strOptString3);
                JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("picture");
                map.put("avatar", String.valueOf((jSONObjectOptJSONObject2 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("data")) == null) ? null : jSONObjectOptJSONObject.opt("url")));
                map.put("unique_id", DeviceUtils.f33080a.m14247a(LoginFragment2.this.m16571x()));
                LoginViewModel3 loginViewModel3Mo13926g1 = LoginFragment2.this.mo13926g1();
                Objects.requireNonNull(loginViewModel3Mo13926g1);
                Intrinsics2.m13089e(map, "hashMap");
                C5729a.m12428A(C8310a.m16440e(loginViewModel3Mo13926g1), null, 0, new LoginViewModel(loginViewModel3Mo13926g1, map, null), 3, null);
                FragmentActivity fragmentActivityM16562f = LoginFragment2.this.m16562f();
                if (fragmentActivityM16562f != null) {
                    SkuDao.a.m14092i0(fragmentActivityM16562f, R.string.msg_login_success, 0, 2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.m.a$e */
    /* JADX INFO: compiled from: LoginFragment.kt */
    public static final class e<T> implements Observer<User> {
        public e() {
        }

        @Override // p636z0.p759s.Observer
        /* JADX INFO: renamed from: d */
        public void mo410d(User user) {
            c cVar;
            if (user != null) {
                LoginFragment2 loginFragment2 = LoginFragment2.this;
                b bVar = LoginFragment2.f31647t0;
                loginFragment2.mo11126W0();
                int i = loginFragment2.f31652y0;
                if (i < 0 || (cVar = loginFragment2.f31651x0) == null) {
                    return;
                }
                cVar.mo13941g(i);
            }
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.m.a$f */
    /* JADX INFO: compiled from: LoginFragment.kt */
    public static final class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) throws Exception {
            LoginFragment2 loginFragment2 = LoginFragment2.this;
            b bVar = LoginFragment2.f31647t0;
            Objects.requireNonNull(loginFragment2);
            AccessToken accessTokenM2247b = AccessToken.m2247b();
            if (accessTokenM2247b != null && !accessTokenM2247b.m2250d()) {
                loginFragment2.m13937j1(accessTokenM2247b);
                return;
            }
            CallbackManagerImpl callbackManagerImpl = new CallbackManagerImpl();
            Intrinsics2.m13088d(callbackManagerImpl, "CallbackManager.Factory.create()");
            loginFragment2.f31650w0 = callbackManagerImpl;
            LoginManager4 loginManager4M2591a = LoginManager4.m2591a();
            FragmentActivity fragmentActivityM16562f = loginFragment2.m16562f();
            String[] strArr = {"email", "public_profile"};
            Intrinsics2.m13089e(strArr, "elements");
            Intrinsics2.m13089e(strArr, "$this$toSet");
            LinkedHashSet<String> linkedHashSet = new LinkedHashSet(MapsJVM.m13052a(2));
            Intrinsics2.m13089e(strArr, "$this$toCollection");
            Intrinsics2.m13089e(linkedHashSet, "destination");
            boolean z = false;
            for (int i = 0; i < 2; i++) {
                linkedHashSet.add(strArr[i]);
            }
            Objects.requireNonNull(loginManager4M2591a);
            for (String str : linkedHashSet) {
                if (LoginManager4.m2592b(str)) {
                    throw new FacebookException(String.format("Cannot pass a publish or manage permission (%s) to a request for read authorization", str));
                }
            }
            Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(linkedHashSet));
            DefaultAudience defaultAudience = DefaultAudience.FRIENDS;
            HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
            Validate.m2479h();
            LoginClient.d dVar = new LoginClient.d(1, setUnmodifiableSet, defaultAudience, "rerequest", FacebookSdk.f5354c, UUID.randomUUID().toString());
            dVar.f5131k = AccessToken.m2248c();
            Validate.m2477f(fragmentActivityM16562f, "activity");
            LoginLogger loginLoggerM2385a = C1095a.m2385a(fragmentActivityM16562f);
            if (loginLoggerM2385a != null) {
                Bundle bundleM2589b = LoginLogger.m2589b(dVar.f5130j);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("login_behavior", "NATIVE_WITH_FALLBACK");
                    jSONObject.put("request_code", LoginClient.m2573i());
                    jSONObject.put("permissions", TextUtils.join(",", dVar.f5127g));
                    jSONObject.put("default_audience", dVar.f5128h.toString());
                    jSONObject.put("isReauthorize", dVar.f5131k);
                    String str2 = loginLoggerM2385a.f5154c;
                    if (str2 != null) {
                        jSONObject.put("facebookVersion", str2);
                    }
                    bundleM2589b.putString("6_extras", jSONObject.toString());
                } catch (JSONException unused) {
                }
                InternalAppEventsLogger internalAppEventsLogger = loginLoggerM2385a.f5152a;
                Objects.requireNonNull(internalAppEventsLogger);
                if (FacebookSdk.m2659a()) {
                    internalAppEventsLogger.f4855a.m2367f("fb_mobile_login_start", null, bundleM2589b);
                }
            }
            CallbackManagerImpl.m2425b(C7804v0.m15318g(1), new LoginManager3(loginManager4M2591a));
            Intent intent = new Intent();
            HashSet<LoggingBehavior> hashSet2 = FacebookSdk.f5352a;
            Validate.m2479h();
            intent.setClass(FacebookSdk.f5360i, FacebookActivity.class);
            intent.setAction(C7804v0.m15323l(dVar.f5126f));
            Bundle bundle = new Bundle();
            bundle.putParcelable("request", dVar);
            intent.putExtra("com.facebook.LoginFragment:Request", bundle);
            Validate.m2479h();
            if (FacebookSdk.f5360i.getPackageManager().resolveActivity(intent, 0) != null) {
                try {
                    fragmentActivityM16562f.startActivityForResult(intent, LoginClient.m2573i());
                    z = true;
                } catch (ActivityNotFoundException unused2) {
                }
            }
            if (!z) {
                Exception facebookException = new FacebookException("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
                loginManager4M2591a.m2593c(fragmentActivityM16562f, LoginClient.e.b.ERROR, null, facebookException, false, dVar);
                throw facebookException;
            }
            LoginManager4 loginManager4M2591a2 = LoginManager4.m2591a();
            CallbackManager callbackManager = loginFragment2.f31650w0;
            if (callbackManager == null) {
                Intrinsics2.m13096l("callbackManager");
                throw null;
            }
            LoginFragment3 loginFragment3 = new LoginFragment3(loginFragment2);
            Objects.requireNonNull(loginManager4M2591a2);
            if (!(callbackManager instanceof CallbackManagerImpl)) {
                throw new FacebookException("Unexpected CallbackManager, please use the provided Factory.");
            }
            int iM15318g = C7804v0.m15318g(1);
            LoginManager loginManager = new LoginManager(loginManager4M2591a2, loginFragment3);
            Validate.m2477f(loginManager, "callback");
            ((CallbackManagerImpl) callbackManager).f4908b.put(Integer.valueOf(iM15318g), loginManager);
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.m.a$g */
    /* JADX INFO: compiled from: LoginFragment.kt */
    public static final class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            GoogleSignInAccount googleSignInAccount;
            Intent intentM4927a;
            LoginFragment2 loginFragment2 = LoginFragment2.this;
            b bVar = LoginFragment2.f31647t0;
            FragmentActivity fragmentActivityM16562f = loginFragment2.m16562f();
            if (fragmentActivityM16562f != null) {
                C2352p c2352pM4932b = C2352p.m4932b(fragmentActivityM16562f);
                synchronized (c2352pM4932b) {
                    googleSignInAccount = c2352pM4932b.f10951c;
                }
                if (googleSignInAccount != null) {
                    loginFragment2.m13938k1(googleSignInAccount);
                    return;
                }
                GoogleSignInOptions.C5890a c5890a = new GoogleSignInOptions.C5890a(GoogleSignInOptions.f28511k);
                c5890a.f28524a.add(GoogleSignInOptions.f28507g);
                C2334a c2334a = new C2334a((Activity) fragmentActivityM16562f, c5890a.m12643a());
                Intrinsics2.m13088d(c2334a, "mGoogleSignInClient");
                Context context = c2334a.f11610a;
                int i = C2365i.f10954a[c2334a.m4906d() - 1];
                if (i == 1) {
                    GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) c2334a.f11612c;
                    C2346j.f10946a.m5613a("getFallbackSignInIntent()", new Object[0]);
                    intentM4927a = C2346j.m4927a(context, googleSignInOptions);
                    intentM4927a.setAction("com.google.android.gms.auth.APPAUTH_SIGN_IN");
                } else if (i != 2) {
                    GoogleSignInOptions googleSignInOptions2 = (GoogleSignInOptions) c2334a.f11612c;
                    C2346j.f10946a.m5613a("getNoImplementationSignInIntent()", new Object[0]);
                    intentM4927a = C2346j.m4927a(context, googleSignInOptions2);
                    intentM4927a.setAction("com.google.android.gms.auth.NO_IMPL");
                } else {
                    intentM4927a = C2346j.m4927a(context, (GoogleSignInOptions) c2334a.f11612c);
                }
                Intrinsics2.m13088d(intentM4927a, "mGoogleSignInClient.signInIntent");
                fragmentActivityM16562f.startActivityForResult(intentM4927a, 2);
            }
        }
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: X */
    public void mo2588X(int i, int i2, Intent intent) {
        C2336c c2336c;
        if (i != 2) {
            CallbackManager callbackManager = this.f31650w0;
            if (callbackManager != null) {
                ((CallbackManagerImpl) callbackManager).m2426a(i, i2, intent);
                return;
            } else {
                Intrinsics2.m13096l("callbackManager");
                throw null;
            }
        }
        C2775a c2775a = C2346j.f10946a;
        if (intent == null) {
            c2336c = new C2336c(null, Status.f28650h);
        } else {
            Status status = (Status) intent.getParcelableExtra("googleSignInStatus");
            GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) intent.getParcelableExtra("googleSignInAccount");
            if (googleSignInAccount == null) {
                if (status == null) {
                    status = Status.f28650h;
                }
                c2336c = new C2336c(null, status);
            } else {
                c2336c = new C2336c(googleSignInAccount, Status.f28648f);
            }
        }
        GoogleSignInAccount googleSignInAccount2 = c2336c.f10931g;
        AbstractC4781i abstractC4781iM10207d = (!c2336c.f10930f.m12654H() || googleSignInAccount2 == null) ? C4340s8.m10207d(C2714b.m5564a(c2336c.f10930f)) : C4340s8.m10208e(googleSignInAccount2);
        Intrinsics2.m13088d(abstractC4781iM10207d, "task");
        try {
            m13938k1((GoogleSignInAccount) abstractC4781iM10207d.mo10938k(C2629b.class));
        } catch (C2629b e2) {
            StringBuilder sbM1556G = outline.m1556G("signInResult:failed code=");
            sbM1556G.append(e2.f11608f.f28654l);
            Intrinsics2.m13089e(sbM1556G.toString(), "message");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p636z0.p752p.p753c.DialogFragment, p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: Z */
    public void mo463Z(Context context) {
        Intrinsics2.m13089e(context, "context");
        super.mo463Z(context);
        if (context instanceof c) {
            this.f31651x0 = (c) context;
            return;
        }
        throw new RuntimeException(context + " must implement OnFragmentInteractionListener");
    }

    @Override // p636z0.p752p.p753c.DialogFragment, p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: c0 */
    public void mo465c0(Bundle bundle) {
        super.mo465c0(bundle);
        Bundle bundle2 = this.f38438m;
        if (bundle2 != null) {
            this.f31652y0 = bundle2.getInt("tab");
        }
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseBottomSheetDialogFragment3
    /* JADX INFO: renamed from: d1 */
    public void mo13924d1() {
        HashMap map = this.f31653z0;
        if (map != null) {
            map.clear();
        }
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseBottomSheetDialogFragment3
    /* JADX INFO: renamed from: f1 */
    public int mo13925f1() {
        return this.f31648u0;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseBottomSheetDialogFragment3, p636z0.p752p.p753c.DialogFragment, p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: h0 */
    public void mo467h0() {
        super.mo467h0();
        HashMap map = this.f31653z0;
        if (map != null) {
            map.clear();
        }
    }

    @Override // p636z0.p752p.p753c.DialogFragment, p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: i0 */
    public void mo1957i0() {
        super.mo1957i0();
        this.f31651x0 = null;
    }

    /* JADX INFO: renamed from: i1 */
    public View m13936i1(int i) {
        if (this.f31653z0 == null) {
            this.f31653z0 = new HashMap();
        }
        View view = (View) this.f31653z0.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = this.f38416M;
        if (view2 == null) {
            return null;
        }
        View viewFindViewById = view2.findViewById(i);
        this.f31653z0.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    /* JADX INFO: renamed from: j1 */
    public final void m13937j1(AccessToken accessToken) {
        GraphRequest2 graphRequest2 = new GraphRequest2(accessToken, "me", null, null, new GraphRequest(new d()));
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,name,email,picture");
        Intrinsics2.m13088d(graphRequest2, "request");
        graphRequest2.f5380i = bundle;
        graphRequest2.m2688e();
    }

    /* JADX INFO: renamed from: k1 */
    public final void m13938k1(GoogleSignInAccount googleSignInAccount) {
        if (googleSignInAccount != null) {
            HashMap map = new HashMap();
            map.put("gg_user_id", String.valueOf(googleSignInAccount.f28494h));
            map.put("full_name", String.valueOf(googleSignInAccount.f28497k));
            map.put("email", String.valueOf(googleSignInAccount.f28496j));
            Uri uri = googleSignInAccount.f28498l;
            if (uri != null) {
                String string = uri.toString();
                Intrinsics2.m13088d(string, "url.toString()");
                map.put("avatar", string);
            }
            map.put("unique_id", DeviceUtils.f33080a.m14247a(m16571x()));
            String string2 = map.toString();
            Intrinsics2.m13088d(string2, "hashMap.toString()");
            Intrinsics2.m13089e(string2, "message");
            LoginViewModel3 loginViewModel3Mo13926g1 = mo13926g1();
            Objects.requireNonNull(loginViewModel3Mo13926g1);
            Intrinsics2.m13089e(map, "hashMap");
            C5729a.m12428A(C8310a.m16440e(loginViewModel3Mo13926g1), null, 0, new LoginViewModel2(loginViewModel3Mo13926g1, map, null), 3, null);
            FragmentActivity fragmentActivityM16562f = m16562f();
            if (fragmentActivityM16562f != null) {
                SkuDao.a.m14092i0(fragmentActivityM16562f, R.string.msg_login_success, 0, 2);
            }
        }
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseBottomSheetDialogFragment3
    /* JADX INFO: renamed from: l1, reason: merged with bridge method [inline-methods] */
    public LoginViewModel3 mo13926g1() {
        return (LoginViewModel3) this.f31649v0.getValue();
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseBottomSheetDialogFragment3, p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: w0 */
    public void mo471w0(View view, Bundle bundle) {
        Intrinsics2.m13089e(view, "view");
        super.mo471w0(view, bundle);
        mo13926g1().f31670l.mo422e(m16548R(), new e());
        ArrayList<Simple4> arrayList = new ArrayList();
        String strM16546Q = m16546Q(R.string.txt_terms_of_use);
        Intrinsics2.m13088d(strM16546Q, "getString(R.string.txt_terms_of_use)");
        arrayList.add(new Simple4(strM16546Q, "https://www.karavietnam.com/terms"));
        String strM16546Q2 = m16546Q(R.string.txt_privace_policy);
        Intrinsics2.m13088d(strM16546Q2, "getString(R.string.txt_privace_policy)");
        arrayList.add(new Simple4(strM16546Q2, "https://www.karavietnam.com/privacy"));
        TextView textView = (TextView) m13936i1(R.id.txtPolicy);
        Intrinsics2.m13088d(textView, "txtPolicy");
        String strM16546Q3 = m16546Q(R.string.txt_login_policy);
        Intrinsics2.m13088d(strM16546Q3, "getString(R.string.txt_login_policy)");
        Intrinsics2.m13089e(strM16546Q3, "content");
        Intrinsics2.m13089e(arrayList, "linkTexts");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strM16546Q3);
        for (Simple4 simple4 : arrayList) {
            int iM13012v = Strings5.m13012v(strM16546Q3, simple4.getText(), 0, false, 6);
            spannableStringBuilder.setSpan(new CustomURLSpan(simple4.getUrl()), iM13012v, simple4.getText().length() + iM13012v, 17);
            spannableStringBuilder.append((CharSequence) "\u200b");
        }
        textView.setText(spannableStringBuilder);
        TextView textView2 = (TextView) m13936i1(R.id.txtPolicy);
        Intrinsics2.m13088d(textView2, "txtPolicy");
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        ((Button) m13936i1(R.id.btnLoginFb)).setOnClickListener(new f());
        ((Button) m13936i1(R.id.btnLoginGoogle)).setOnClickListener(new g());
    }
}
