package androidx.navigation.fragment;

import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.navigation.NavController;
import java.util.HashSet;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p752p.C8310a;
import p636z0.p752p.p753c.DialogFragment;
import p636z0.p752p.p753c.Fragment;
import p636z0.p752p.p753c.FragmentManager;
import p636z0.p759s.Lifecycle3;
import p636z0.p759s.LifecycleOwner;
import p636z0.p770y.FloatingWindow;
import p636z0.p770y.NavDestination;
import p636z0.p770y.NavOptions;
import p636z0.p770y.Navigator;
import p636z0.p770y.NavigatorProvider;
import p636z0.p770y.p772u.C8459b;

/* JADX INFO: loaded from: classes.dex */
@Navigator.b("dialog")
public final class DialogFragmentNavigator extends Navigator<C0138a> {

    /* JADX INFO: renamed from: a */
    public final Context f847a;

    /* JADX INFO: renamed from: b */
    public final FragmentManager f848b;

    /* JADX INFO: renamed from: c */
    public int f849c = 0;

    /* JADX INFO: renamed from: d */
    public final HashSet<String> f850d = new HashSet<>();

    /* JADX INFO: renamed from: e */
    public LifecycleEventObserver f851e = new LifecycleEventObserver(this) { // from class: androidx.navigation.fragment.DialogFragmentNavigator.1
        @Override // androidx.lifecycle.LifecycleEventObserver
        /* JADX INFO: renamed from: c */
        public void mo130c(LifecycleOwner lifecycleOwner, Lifecycle3.a aVar) {
            NavController navControllerM16438c;
            if (aVar == Lifecycle3.a.ON_STOP) {
                DialogFragment dialogFragment = (DialogFragment) lifecycleOwner;
                if (dialogFragment.m16509a1().isShowing()) {
                    return;
                }
                int i = NavHostFragment.f853c0;
                for (Fragment fragment = dialogFragment; fragment != null; fragment = fragment.f38405B) {
                    if (fragment instanceof NavHostFragment) {
                        navControllerM16438c = ((NavHostFragment) fragment).f854d0;
                        if (navControllerM16438c == null) {
                            throw new IllegalStateException("NavController is not available before onCreate()");
                        }
                    } else {
                        Fragment fragment2 = fragment.m16529H().f38634t;
                        if (fragment2 instanceof NavHostFragment) {
                            navControllerM16438c = ((NavHostFragment) fragment2).f854d0;
                            if (navControllerM16438c == null) {
                                throw new IllegalStateException("NavController is not available before onCreate()");
                            }
                        }
                    }
                    navControllerM16438c.m451f();
                }
                View view = dialogFragment.f38416M;
                if (view != null) {
                    navControllerM16438c = C8310a.m16438c(view);
                } else {
                    Dialog dialog = dialogFragment.f38391n0;
                    if (dialog == null || dialog.getWindow() == null) {
                        throw new IllegalStateException("Fragment " + dialogFragment + " does not have a NavController set");
                    }
                    navControllerM16438c = C8310a.m16438c(dialog.getWindow().getDecorView());
                }
                navControllerM16438c.m451f();
            }
        }
    };

    /* JADX INFO: renamed from: androidx.navigation.fragment.DialogFragmentNavigator$a */
    public static class C0138a extends NavDestination implements FloatingWindow {

        /* JADX INFO: renamed from: n */
        public String f852n;

        public C0138a(NavigatorProvider navigatorProvider) {
            this((Navigator<? extends C0138a>) navigatorProvider.m16929c(DialogFragmentNavigator.class));
        }

        @Override // p636z0.p770y.NavDestination
        /* JADX INFO: renamed from: m */
        public void mo462m(Context context, AttributeSet attributeSet) {
            super.mo462m(context, attributeSet);
            TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, C8459b.f39100a);
            String string = typedArrayObtainAttributes.getString(0);
            if (string != null) {
                this.f852n = string;
            }
            typedArrayObtainAttributes.recycle();
        }

        public C0138a(Navigator<? extends C0138a> navigator) {
            super(navigator);
        }
    }

    public DialogFragmentNavigator(Context context, FragmentManager fragmentManager) {
        this.f847a = context;
        this.f848b = fragmentManager;
    }

    @Override // p636z0.p770y.Navigator
    /* JADX INFO: renamed from: a */
    public NavDestination mo457a() {
        return new C0138a(this);
    }

    @Override // p636z0.p770y.Navigator
    /* JADX INFO: renamed from: b */
    public NavDestination mo458b(NavDestination navDestination, Bundle bundle, NavOptions navOptions, Navigator.a aVar) {
        C0138a c0138a = (C0138a) navDestination;
        if (this.f848b.m16665S()) {
            Log.i("DialogFragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return null;
        }
        String str = c0138a.f852n;
        if (str == null) {
            throw new IllegalStateException("DialogFragment class was not set");
        }
        if (str.charAt(0) == '.') {
            str = this.f847a.getPackageName() + str;
        }
        Fragment fragmentMo16614a = this.f848b.m16658K().mo16614a(this.f847a.getClassLoader(), str);
        if (!DialogFragment.class.isAssignableFrom(fragmentMo16614a.getClass())) {
            StringBuilder sbM1556G = outline.m1556G("Dialog destination ");
            String str2 = c0138a.f852n;
            if (str2 != null) {
                throw new IllegalArgumentException(outline.m1550A(sbM1556G, str2, " is not an instance of DialogFragment"));
            }
            throw new IllegalStateException("DialogFragment class was not set");
        }
        DialogFragment dialogFragment = (DialogFragment) fragmentMo16614a;
        dialogFragment.m16540M0(bundle);
        dialogFragment.f38425V.mo16727a(this.f851e);
        FragmentManager fragmentManager = this.f848b;
        StringBuilder sbM1556G2 = outline.m1556G("androidx-nav-fragment:navigator:dialog:");
        int i = this.f849c;
        this.f849c = i + 1;
        sbM1556G2.append(i);
        dialogFragment.mo5469c1(fragmentManager, sbM1556G2.toString());
        return c0138a;
    }

    @Override // p636z0.p770y.Navigator
    /* JADX INFO: renamed from: c */
    public void mo459c(Bundle bundle) {
        this.f849c = bundle.getInt("androidx-nav-dialogfragment:navigator:count", 0);
        for (int i = 0; i < this.f849c; i++) {
            DialogFragment dialogFragment = (DialogFragment) this.f848b.m16656I("androidx-nav-fragment:navigator:dialog:" + i);
            if (dialogFragment != null) {
                dialogFragment.f38425V.mo16727a(this.f851e);
            } else {
                this.f850d.add("androidx-nav-fragment:navigator:dialog:" + i);
            }
        }
    }

    @Override // p636z0.p770y.Navigator
    /* JADX INFO: renamed from: d */
    public Bundle mo460d() {
        if (this.f849c == 0) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("androidx-nav-dialogfragment:navigator:count", this.f849c);
        return bundle;
    }

    @Override // p636z0.p770y.Navigator
    /* JADX INFO: renamed from: e */
    public boolean mo461e() {
        if (this.f849c == 0) {
            return false;
        }
        if (this.f848b.m16665S()) {
            Log.i("DialogFragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return false;
        }
        FragmentManager fragmentManager = this.f848b;
        StringBuilder sbM1556G = outline.m1556G("androidx-nav-fragment:navigator:dialog:");
        int i = this.f849c - 1;
        this.f849c = i;
        sbM1556G.append(i);
        Fragment fragmentM16656I = fragmentManager.m16656I(sbM1556G.toString());
        if (fragmentM16656I != null) {
            fragmentM16656I.f38425V.mo16729c(this.f851e);
            ((DialogFragment) fragmentM16656I).mo11126W0();
        }
        return true;
    }
}
