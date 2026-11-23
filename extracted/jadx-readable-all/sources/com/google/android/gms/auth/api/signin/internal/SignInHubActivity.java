package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Set;
import p007c.p190n.p194b.p266d.p285b.p286a.p287d.p288d.C2342f;
import p007c.p190n.p194b.p266d.p285b.p286a.p287d.p288d.C2352p;
import p007c.p190n.p194b.p266d.p285b.p286a.p287d.p288d.C2360x;
import p007c.p190n.p194b.p266d.p298f.p299o.AbstractC2632e;
import p636z0.p752p.p753c.FragmentActivity;
import p636z0.p760t.p761a.LoaderManager;
import p636z0.p760t.p761a.LoaderManagerImpl;

/* JADX INFO: compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
@KeepName
public class SignInHubActivity extends FragmentActivity {

    /* JADX INFO: renamed from: t */
    public static boolean f28538t = false;

    /* JADX INFO: renamed from: u */
    public boolean f28539u = false;

    /* JADX INFO: renamed from: v */
    public SignInConfiguration f28540v;

    /* JADX INFO: renamed from: w */
    public boolean f28541w;

    /* JADX INFO: renamed from: x */
    public int f28542x;

    /* JADX INFO: renamed from: y */
    public Intent f28543y;

    /* JADX INFO: renamed from: com.google.android.gms.auth.api.signin.internal.SignInHubActivity$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
    public class C5891a implements LoaderManager.a<Void> {
        public C5891a(C2360x c2360x) {
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m12644H(int i) {
        Status status = new Status(i);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        f28538t = false;
    }

    /* JADX INFO: renamed from: I */
    public final void m12645I() {
        LoaderManager loaderManagerM16748b = LoaderManager.m16748b(this);
        C5891a c5891a = new C5891a(null);
        LoaderManagerImpl loaderManagerImpl = (LoaderManagerImpl) loaderManagerM16748b;
        if (loaderManagerImpl.f38737b.f38749e) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        LoaderManagerImpl.a aVarM15617g = loaderManagerImpl.f38737b.f38748d.m15617g(0, null);
        if (aVarM15617g == null) {
            try {
                loaderManagerImpl.f38737b.f38749e = true;
                Set<AbstractC2632e> set = AbstractC2632e.f11624a;
                synchronized (set) {
                }
                C2342f c2342f = new C2342f(this, set);
                if (c2342f.getClass().isMemberClass() && !Modifier.isStatic(c2342f.getClass().getModifiers())) {
                    throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + c2342f);
                }
                LoaderManagerImpl.a aVar = new LoaderManagerImpl.a(0, null, c2342f, null);
                loaderManagerImpl.f38737b.f38748d.m15619j(0, aVar);
                loaderManagerImpl.f38737b.f38749e = false;
                aVar.m16752n(loaderManagerImpl.f38736a, c5891a);
            } catch (Throwable th) {
                loaderManagerImpl.f38737b.f38749e = false;
                throw th;
            }
        } else {
            aVarM15617g.m16752n(loaderManagerImpl.f38736a, c5891a);
        }
        f28538t = false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    @Override // p636z0.p752p.p753c.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        GoogleSignInAccount googleSignInAccount;
        if (this.f28539u) {
            return;
        }
        setResult(0);
        if (i != 40962) {
            return;
        }
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
            if (signInAccount != null && (googleSignInAccount = signInAccount.f28534g) != null) {
                C2352p c2352pM4932b = C2352p.m4932b(this);
                GoogleSignInOptions googleSignInOptions = this.f28540v.f28537g;
                synchronized (c2352pM4932b) {
                    c2352pM4932b.f10950b.m4916d(googleSignInAccount, googleSignInOptions);
                    c2352pM4932b.f10951c = googleSignInAccount;
                }
                intent.removeExtra("signInAccount");
                intent.putExtra("googleSignInAccount", googleSignInAccount);
                this.f28541w = true;
                this.f28542x = i2;
                this.f28543y = intent;
                m12645I();
                return;
            }
            if (intent.hasExtra("errorCode")) {
                int intExtra = intent.getIntExtra("errorCode", 8);
                if (intExtra == 13) {
                    intExtra = 12501;
                }
                m12644H(intExtra);
                return;
            }
        }
        m12644H(8);
    }

    @Override // p636z0.p752p.p753c.FragmentActivity, androidx.activity.ComponentActivity, p636z0.p725k.p726c.ComponentActivity2, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        Objects.requireNonNull(action);
        if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
            m12644H(12500);
            return;
        }
        if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            String strValueOf = String.valueOf(intent.getAction());
            Log.e("AuthSignInClient", strValueOf.length() != 0 ? "Unknown action: ".concat(strValueOf) : new String("Unknown action: "));
            finish();
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("config");
        Objects.requireNonNull(bundleExtra);
        SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
        if (signInConfiguration == null) {
            Log.e("AuthSignInClient", "Activity started with invalid configuration.");
            setResult(0);
            finish();
            return;
        }
        this.f28540v = signInConfiguration;
        if (bundle != null) {
            boolean z = bundle.getBoolean("signingInGoogleApiClients");
            this.f28541w = z;
            if (z) {
                this.f28542x = bundle.getInt("signInResultCode");
                Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
                Objects.requireNonNull(intent2);
                this.f28543y = intent2;
                m12645I();
                return;
            }
            return;
        }
        if (f28538t) {
            setResult(0);
            m12644H(12502);
            return;
        }
        f28538t = true;
        Intent intent3 = new Intent(action);
        if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
            intent3.setPackage("com.google.android.gms");
        } else {
            intent3.setPackage(getPackageName());
        }
        intent3.putExtra("config", this.f28540v);
        try {
            startActivityForResult(intent3, 40962);
        } catch (ActivityNotFoundException unused) {
            this.f28539u = true;
            Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
            m12644H(17);
        }
    }

    @Override // androidx.activity.ComponentActivity, p636z0.p725k.p726c.ComponentActivity2, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f28541w);
        if (this.f28541w) {
            bundle.putInt("signInResultCode", this.f28542x);
            bundle.putParcelable("signInResultData", this.f28543y);
        }
    }
}
