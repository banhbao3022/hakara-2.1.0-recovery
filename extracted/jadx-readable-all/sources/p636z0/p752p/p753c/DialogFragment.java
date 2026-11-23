package p636z0.p752p.p753c;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import mtp.media.karaoke.R;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p752p.p753c.FragmentManager.n;
import p636z0.p759s.LifecycleOwner;
import p636z0.p759s.Observer;

/* JADX INFO: renamed from: z0.p.c.l, reason: use source file name */
/* JADX INFO: compiled from: DialogFragment.java */
/* JADX INFO: loaded from: classes.dex */
public class DialogFragment extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: c0 */
    public Handler f38380c0;

    /* JADX INFO: renamed from: d0 */
    public Runnable f38381d0;

    /* JADX INFO: renamed from: e0 */
    public DialogInterface.OnCancelListener f38382e0;

    /* JADX INFO: renamed from: f0 */
    public DialogInterface.OnDismissListener f38383f0;

    /* JADX INFO: renamed from: g0 */
    public int f38384g0;

    /* JADX INFO: renamed from: h0 */
    public int f38385h0;

    /* JADX INFO: renamed from: i0 */
    public boolean f38386i0;

    /* JADX INFO: renamed from: j0 */
    public boolean f38387j0;

    /* JADX INFO: renamed from: k0 */
    public int f38388k0;

    /* JADX INFO: renamed from: l0 */
    public boolean f38389l0;

    /* JADX INFO: renamed from: m0 */
    public Observer<LifecycleOwner> f38390m0;

    /* JADX INFO: renamed from: n0 */
    public Dialog f38391n0;

    /* JADX INFO: renamed from: o0 */
    public boolean f38392o0;

    /* JADX INFO: renamed from: p0 */
    public boolean f38393p0;

    /* JADX INFO: renamed from: q0 */
    public boolean f38394q0;

    /* JADX INFO: renamed from: r0 */
    public boolean f38395r0;

    /* JADX INFO: renamed from: z0.p.c.l$a */
    /* JADX INFO: compiled from: DialogFragment.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            DialogFragment dialogFragment = DialogFragment.this;
            dialogFragment.f38383f0.onDismiss(dialogFragment.f38391n0);
        }
    }

    /* JADX INFO: renamed from: z0.p.c.l$b */
    /* JADX INFO: compiled from: DialogFragment.java */
    public class b implements DialogInterface.OnCancelListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        @SuppressLint({"SyntheticAccessor"})
        public void onCancel(DialogInterface dialogInterface) {
            DialogFragment dialogFragment = DialogFragment.this;
            Dialog dialog = dialogFragment.f38391n0;
            if (dialog != null) {
                dialogFragment.onCancel(dialog);
            }
        }
    }

    /* JADX INFO: renamed from: z0.p.c.l$c */
    /* JADX INFO: compiled from: DialogFragment.java */
    public class c implements DialogInterface.OnDismissListener {
        public c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        @SuppressLint({"SyntheticAccessor"})
        public void onDismiss(DialogInterface dialogInterface) {
            DialogFragment dialogFragment = DialogFragment.this;
            Dialog dialog = dialogFragment.f38391n0;
            if (dialog != null) {
                dialogFragment.onDismiss(dialog);
            }
        }
    }

    /* JADX INFO: renamed from: z0.p.c.l$d */
    /* JADX INFO: compiled from: DialogFragment.java */
    public class d implements Observer<LifecycleOwner> {
        public d() {
        }

        @Override // p636z0.p759s.Observer
        @SuppressLint({"SyntheticAccessor"})
        /* JADX INFO: renamed from: d */
        public void mo410d(LifecycleOwner lifecycleOwner) {
            if (lifecycleOwner != null) {
                DialogFragment dialogFragment = DialogFragment.this;
                if (dialogFragment.f38387j0) {
                    View viewM16530H0 = dialogFragment.m16530H0();
                    if (viewM16530H0.getParent() != null) {
                        throw new IllegalStateException("DialogFragment can not be attached to a container view");
                    }
                    if (DialogFragment.this.f38391n0 != null) {
                        if (FragmentManager.m16647O(3)) {
                            Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + DialogFragment.this.f38391n0);
                        }
                        DialogFragment.this.f38391n0.setContentView(viewM16530H0);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: z0.p.c.l$e */
    /* JADX INFO: compiled from: DialogFragment.java */
    public class e extends FragmentContainer {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ FragmentContainer f38400a;

        public e(FragmentContainer fragmentContainer) {
            this.f38400a = fragmentContainer;
        }

        @Override // p636z0.p752p.p753c.FragmentContainer
        /* JADX INFO: renamed from: c */
        public View mo16514c(int i) {
            if (this.f38400a.mo16515e()) {
                return this.f38400a.mo16514c(i);
            }
            Dialog dialog = DialogFragment.this.f38391n0;
            if (dialog != null) {
                return dialog.findViewById(i);
            }
            return null;
        }

        @Override // p636z0.p752p.p753c.FragmentContainer
        /* JADX INFO: renamed from: e */
        public boolean mo16515e() {
            return this.f38400a.mo16515e() || DialogFragment.this.f38395r0;
        }
    }

    public DialogFragment() {
        this.f38381d0 = new a();
        this.f38382e0 = new b();
        this.f38383f0 = new c();
        this.f38384g0 = 0;
        this.f38385h0 = 0;
        this.f38386i0 = true;
        this.f38387j0 = true;
        this.f38388k0 = -1;
        this.f38390m0 = new d();
        this.f38395r0 = false;
    }

    /* JADX INFO: renamed from: W0 */
    public void mo11126W0() {
        m16508X0(false, false);
    }

    /* JADX INFO: renamed from: X0 */
    public final void m16508X0(boolean z, boolean z2) {
        if (this.f38393p0) {
            return;
        }
        this.f38393p0 = true;
        this.f38394q0 = false;
        Dialog dialog = this.f38391n0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f38391n0.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.f38380c0.getLooper()) {
                    onDismiss(this.f38391n0);
                } else {
                    this.f38380c0.post(this.f38381d0);
                }
            }
        }
        this.f38392o0 = true;
        if (this.f38388k0 >= 0) {
            FragmentManager fragmentManagerM16529H = m16529H();
            int i = this.f38388k0;
            if (i < 0) {
                throw new IllegalArgumentException(outline.m1590l("Bad id: ", i));
            }
            fragmentManagerM16529H.m16648A(fragmentManagerM16529H.new n(null, i, 1), false);
            this.f38388k0 = -1;
            return;
        }
        BackStackRecord backStackRecord = new BackStackRecord(m16529H());
        backStackRecord.mo16449h(this);
        if (z) {
            backStackRecord.m16454o();
        } else {
            backStackRecord.mo16444c();
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public int mo13868Y0() {
        return this.f38385h0;
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: Z */
    public void mo463Z(Context context) {
        super.mo463Z(context);
        this.f38427X.m423f(this.f38390m0);
        if (this.f38394q0) {
            return;
        }
        this.f38393p0 = false;
    }

    /* JADX INFO: renamed from: Z0 */
    public Dialog mo2217Z0(Bundle bundle) {
        if (FragmentManager.m16647O(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new Dialog(m16528G0(), mo13868Y0());
    }

    /* JADX INFO: renamed from: a1 */
    public final Dialog m16509a1() {
        Dialog dialog = this.f38391n0;
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    /* JADX INFO: renamed from: b1 */
    public void mo14679b1(Dialog dialog, int i) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: c0 */
    public void mo465c0(Bundle bundle) {
        super.mo465c0(bundle);
        this.f38380c0 = new Handler();
        this.f38387j0 = this.f38407D == 0;
        if (bundle != null) {
            this.f38384g0 = bundle.getInt("android:style", 0);
            this.f38385h0 = bundle.getInt("android:theme", 0);
            this.f38386i0 = bundle.getBoolean("android:cancelable", true);
            this.f38387j0 = bundle.getBoolean("android:showsDialog", this.f38387j0);
            this.f38388k0 = bundle.getInt("android:backStackId", -1);
        }
    }

    /* JADX INFO: renamed from: c1 */
    public void mo5469c1(FragmentManager fragmentManager, String str) {
        this.f38393p0 = false;
        this.f38394q0 = true;
        BackStackRecord backStackRecord = new BackStackRecord(fragmentManager);
        backStackRecord.mo16448g(0, this, str, 1);
        backStackRecord.mo16444c();
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: h0 */
    public void mo467h0() {
        this.f38414K = true;
        Dialog dialog = this.f38391n0;
        if (dialog != null) {
            this.f38392o0 = true;
            dialog.setOnDismissListener(null);
            this.f38391n0.dismiss();
            if (!this.f38393p0) {
                onDismiss(this.f38391n0);
            }
            this.f38391n0 = null;
            this.f38395r0 = false;
        }
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: i0 */
    public void mo1957i0() {
        this.f38414K = true;
        if (!this.f38394q0 && !this.f38393p0) {
            this.f38393p0 = true;
        }
        this.f38427X.mo426i(this.f38390m0);
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: j0 */
    public LayoutInflater mo16510j0(Bundle bundle) {
        LayoutInflater layoutInflaterM16525F = m16525F();
        boolean z = this.f38387j0;
        if (!z || this.f38389l0) {
            if (FragmentManager.m16647O(2)) {
                String str = "getting layout inflater for DialogFragment " + this;
                if (this.f38387j0) {
                    Log.d("FragmentManager", "mCreatingDialog = true: " + str);
                } else {
                    Log.d("FragmentManager", "mShowsDialog = false: " + str);
                }
            }
            return layoutInflaterM16525F;
        }
        if (z && !this.f38395r0) {
            try {
                this.f38389l0 = true;
                Dialog dialogMo2217Z0 = mo2217Z0(bundle);
                this.f38391n0 = dialogMo2217Z0;
                if (this.f38387j0) {
                    mo14679b1(dialogMo2217Z0, this.f38384g0);
                    Context contextM16571x = m16571x();
                    if (contextM16571x instanceof Activity) {
                        this.f38391n0.setOwnerActivity((Activity) contextM16571x);
                    }
                    this.f38391n0.setCancelable(this.f38386i0);
                    this.f38391n0.setOnCancelListener(this.f38382e0);
                    this.f38391n0.setOnDismissListener(this.f38383f0);
                    this.f38395r0 = true;
                } else {
                    this.f38391n0 = null;
                }
                this.f38389l0 = false;
            } catch (Throwable th) {
                this.f38389l0 = false;
                throw th;
            }
        }
        if (FragmentManager.m16647O(2)) {
            Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
        }
        Dialog dialog = this.f38391n0;
        return dialog != null ? layoutInflaterM16525F.cloneInContext(dialog.getContext()) : layoutInflaterM16525F;
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: m */
    public FragmentContainer mo16511m() {
        return new e(new Fragment.a());
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f38392o0) {
            return;
        }
        if (FragmentManager.m16647O(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        m16508X0(true, true);
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: t0 */
    public void mo470t0(Bundle bundle) {
        Dialog dialog = this.f38391n0;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i = this.f38384g0;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.f38385h0;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.f38386i0;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.f38387j0;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.f38388k0;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: u0 */
    public void mo1958u0() {
        this.f38414K = true;
        Dialog dialog = this.f38391n0;
        if (dialog != null) {
            this.f38392o0 = false;
            dialog.show();
            View decorView = this.f38391n0.getWindow().getDecorView();
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: v0 */
    public void mo1959v0() {
        this.f38414K = true;
        Dialog dialog = this.f38391n0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: x0 */
    public void mo16512x0(Bundle bundle) {
        Bundle bundle2;
        this.f38414K = true;
        if (this.f38391n0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f38391n0.onRestoreInstanceState(bundle2);
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: y0 */
    public void mo16513y0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.mo16513y0(layoutInflater, viewGroup, bundle);
        if (this.f38416M != null || this.f38391n0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f38391n0.onRestoreInstanceState(bundle2);
    }

    public DialogFragment(int i) {
        super(i);
        this.f38381d0 = new a();
        this.f38382e0 = new b();
        this.f38383f0 = new c();
        this.f38384g0 = 0;
        this.f38385h0 = 0;
        this.f38386i0 = true;
        this.f38387j0 = true;
        this.f38388k0 = -1;
        this.f38390m0 = new d();
        this.f38395r0 = false;
    }
}
