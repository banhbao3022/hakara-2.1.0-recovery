package p007c.p165l.p178k0;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.HashSet;
import p007c.p165l.FacebookException;
import p007c.p165l.FacebookSdk;
import p007c.p165l.LoggingBehavior;
import p636z0.p752p.p753c.DialogFragment;
import p636z0.p752p.p753c.FragmentActivity;

/* JADX INFO: renamed from: c.l.k0.j, reason: use source file name */
/* JADX INFO: compiled from: FacebookDialogFragment.java */
/* JADX INFO: loaded from: classes.dex */
public class FacebookDialogFragment extends DialogFragment {

    /* JADX INFO: renamed from: s0 */
    public static final /* synthetic */ int f4954s0 = 0;

    /* JADX INFO: renamed from: t0 */
    public Dialog f4955t0;

    /* JADX INFO: renamed from: c.l.k0.j$a */
    /* JADX INFO: compiled from: FacebookDialogFragment.java */
    public class a implements WebDialog.f {
        public a() {
        }

        @Override // p007c.p165l.p178k0.WebDialog.f
        /* JADX INFO: renamed from: a */
        public void mo2494a(Bundle bundle, FacebookException facebookException) {
            FacebookDialogFragment facebookDialogFragment = FacebookDialogFragment.this;
            int i = FacebookDialogFragment.f4954s0;
            facebookDialogFragment.m2503d1(bundle, facebookException);
        }
    }

    /* JADX INFO: renamed from: c.l.k0.j$b */
    /* JADX INFO: compiled from: FacebookDialogFragment.java */
    public class b implements WebDialog.f {
        public b() {
        }

        @Override // p007c.p165l.p178k0.WebDialog.f
        /* JADX INFO: renamed from: a */
        public void mo2494a(Bundle bundle, FacebookException facebookException) {
            FacebookDialogFragment facebookDialogFragment = FacebookDialogFragment.this;
            int i = FacebookDialogFragment.f4954s0;
            FragmentActivity fragmentActivityM16562f = facebookDialogFragment.m16562f();
            Intent intent = new Intent();
            if (bundle == null) {
                bundle = new Bundle();
            }
            intent.putExtras(bundle);
            fragmentActivityM16562f.setResult(-1, intent);
            fragmentActivityM16562f.finish();
        }
    }

    @Override // p636z0.p752p.p753c.DialogFragment
    /* JADX INFO: renamed from: Z0 */
    public Dialog mo2217Z0(Bundle bundle) {
        if (this.f4955t0 == null) {
            m2503d1(null, null);
            this.f38387j0 = false;
        }
        return this.f4955t0;
    }

    @Override // p636z0.p752p.p753c.DialogFragment, p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: c0 */
    public void mo465c0(Bundle bundle) {
        WebDialog webDialogMo2493a;
        super.mo465c0(bundle);
        if (this.f4955t0 == null) {
            FragmentActivity fragmentActivityM16562f = m16562f();
            Bundle bundleM2546j = NativeProtocol.m2546j(fragmentActivityM16562f.getIntent());
            if (bundleM2546j.getBoolean("is_fallback", false)) {
                String string = bundleM2546j.getString("url");
                if (Utility.m2466y(string)) {
                    HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
                    fragmentActivityM16562f.finish();
                    return;
                }
                HashSet<LoggingBehavior> hashSet2 = FacebookSdk.f5352a;
                Validate.m2479h();
                String str = String.format("fb%s://bridge/", FacebookSdk.f5354c);
                String str2 = FacebookWebFallbackDialog.f4988s;
                WebDialog.m2487b(fragmentActivityM16562f);
                FacebookWebFallbackDialog facebookWebFallbackDialog = new FacebookWebFallbackDialog(fragmentActivityM16562f, string, str);
                facebookWebFallbackDialog.f4926i = new b();
                webDialogMo2493a = facebookWebFallbackDialog;
            } else {
                String string2 = bundleM2546j.getString("action");
                Bundle bundle2 = bundleM2546j.getBundle("params");
                if (Utility.m2466y(string2)) {
                    HashSet<LoggingBehavior> hashSet3 = FacebookSdk.f5352a;
                    fragmentActivityM16562f.finish();
                    return;
                } else {
                    WebDialog.d dVar = new WebDialog.d(fragmentActivityM16562f, string2, bundle2);
                    dVar.f4940d = new a();
                    webDialogMo2493a = dVar.mo2493a();
                }
            }
            this.f4955t0 = webDialogMo2493a;
        }
    }

    /* JADX INFO: renamed from: d1 */
    public final void m2503d1(Bundle bundle, FacebookException facebookException) {
        FragmentActivity fragmentActivityM16562f = m16562f();
        fragmentActivityM16562f.setResult(facebookException == null ? -1 : 0, NativeProtocol.m2540d(fragmentActivityM16562f.getIntent(), bundle, facebookException));
        fragmentActivityM16562f.finish();
    }

    @Override // p636z0.p752p.p753c.DialogFragment, p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: h0 */
    public void mo467h0() {
        Dialog dialog = this.f38391n0;
        if (dialog != null && this.f38411H) {
            dialog.setDismissMessage(null);
        }
        super.mo467h0();
    }

    @Override // p636z0.p752p.p753c.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.f38414K = true;
        Dialog dialog = this.f4955t0;
        if (dialog instanceof WebDialog) {
            if (this.f38432g >= 7) {
                ((WebDialog) dialog).m2490d();
            }
        }
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: s0 */
    public void mo2076s0() {
        this.f38414K = true;
        Dialog dialog = this.f4955t0;
        if (dialog instanceof WebDialog) {
            ((WebDialog) dialog).m2490d();
        }
    }
}
