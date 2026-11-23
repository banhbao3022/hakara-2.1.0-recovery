package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.FragmentContainerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import mtp.media.karaoke.R;
import p636z0.p752p.C8310a;
import p636z0.p752p.p753c.BackStackRecord;
import p636z0.p752p.p753c.Fragment;
import p636z0.p752p.p753c.FragmentManager;
import p636z0.p759s.ViewModelProvider2;
import p636z0.p759s.ViewModelStore;
import p636z0.p770y.C8456s;
import p636z0.p770y.NavBackStackEntry;
import p636z0.p770y.NavBackStackEntryState;
import p636z0.p770y.NavControllerViewModel;
import p636z0.p770y.NavDestination;
import p636z0.p770y.NavHostController;
import p636z0.p770y.Navigator;
import p636z0.p770y.NavigatorProvider;
import p636z0.p770y.p772u.C8459b;
import p636z0.p770y.p772u.FragmentNavigator;

/* JADX INFO: loaded from: classes.dex */
public class NavHostFragment extends Fragment {

    /* JADX INFO: renamed from: c0 */
    public static final /* synthetic */ int f853c0 = 0;

    /* JADX INFO: renamed from: d0 */
    public NavHostController f854d0;

    /* JADX INFO: renamed from: e0 */
    public Boolean f855e0 = null;

    /* JADX INFO: renamed from: f0 */
    public View f856f0;

    /* JADX INFO: renamed from: g0 */
    public int f857g0;

    /* JADX INFO: renamed from: h0 */
    public boolean f858h0;

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: Z */
    public void mo463Z(Context context) {
        super.mo463Z(context);
        if (this.f858h0) {
            BackStackRecord backStackRecord = new BackStackRecord(m16529H());
            backStackRecord.mo16451l(this);
            backStackRecord.mo16444c();
        }
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: a0 */
    public void mo464a0(Fragment fragment) {
        DialogFragmentNavigator dialogFragmentNavigator = (DialogFragmentNavigator) this.f854d0.f840k.m16929c(DialogFragmentNavigator.class);
        if (dialogFragmentNavigator.f850d.remove(fragment.f38408E)) {
            fragment.f38425V.mo16727a(dialogFragmentNavigator.f851e);
        }
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: c0 */
    public void mo465c0(Bundle bundle) {
        Bundle bundle2;
        NavHostController navHostController = new NavHostController(m16528G0());
        this.f854d0 = navHostController;
        if (this != navHostController.f838i) {
            navHostController.f838i = this;
            this.f38425V.mo16727a(navHostController.f842m);
        }
        NavHostController navHostController2 = this.f854d0;
        OnBackPressedDispatcher onBackPressedDispatcher = m16526F0().f143l;
        if (navHostController2.f838i == null) {
            throw new IllegalStateException("You must call setLifecycleOwner() before calling setOnBackPressedDispatcher()");
        }
        navHostController2.f843n.m14490b();
        onBackPressedDispatcher.m132a(navHostController2.f838i, navHostController2.f843n);
        navHostController2.f838i.mo124b().mo16729c(navHostController2.f842m);
        navHostController2.f838i.mo124b().mo16727a(navHostController2.f842m);
        NavHostController navHostController3 = this.f854d0;
        Boolean bool = this.f855e0;
        navHostController3.f844o = bool != null && bool.booleanValue();
        navHostController3.m454i();
        this.f855e0 = null;
        NavHostController navHostController4 = this.f854d0;
        ViewModelStore viewModelStoreMo128o = mo128o();
        NavControllerViewModel navControllerViewModel = navHostController4.f839j;
        ViewModelProvider2.b bVar = NavControllerViewModel.f39013c;
        if (navControllerViewModel != ((NavControllerViewModel) new ViewModelProvider2(viewModelStoreMo128o, bVar).m16722a(NavControllerViewModel.class))) {
            if (!navHostController4.f837h.isEmpty()) {
                throw new IllegalStateException("ViewModelStore should be set before setGraph call");
            }
            navHostController4.f839j = (NavControllerViewModel) new ViewModelProvider2(viewModelStoreMo128o, bVar).m16722a(NavControllerViewModel.class);
        }
        NavHostController navHostController5 = this.f854d0;
        navHostController5.f840k.m16928a(new DialogFragmentNavigator(m16528G0(), m16570w()));
        NavigatorProvider navigatorProvider = navHostController5.f840k;
        Context contextM16528G0 = m16528G0();
        FragmentManager fragmentManagerM16570w = m16570w();
        int i = this.f38406C;
        if (i == 0 || i == -1) {
            i = R.id.nav_host_fragment_container;
        }
        navigatorProvider.m16928a(new FragmentNavigator(contextM16528G0, fragmentManagerM16570w, i));
        if (bundle != null) {
            bundle2 = bundle.getBundle("android-support-nav:fragment:navControllerState");
            if (bundle.getBoolean("android-support-nav:fragment:defaultHost", false)) {
                this.f858h0 = true;
                BackStackRecord backStackRecord = new BackStackRecord(m16529H());
                backStackRecord.mo16451l(this);
                backStackRecord.mo16444c();
            }
            this.f857g0 = bundle.getInt("android-support-nav:fragment:graphId");
        } else {
            bundle2 = null;
        }
        if (bundle2 != null) {
            NavHostController navHostController6 = this.f854d0;
            Objects.requireNonNull(navHostController6);
            bundle2.setClassLoader(navHostController6.f830a.getClassLoader());
            navHostController6.f834e = bundle2.getBundle("android-support-nav:controller:navigatorState");
            navHostController6.f835f = bundle2.getParcelableArray("android-support-nav:controller:backStack");
            navHostController6.f836g = bundle2.getBoolean("android-support-nav:controller:deepLinkHandled");
        }
        int i2 = this.f857g0;
        if (i2 != 0) {
            this.f854d0.m453h(i2, null);
        } else {
            Bundle bundle3 = this.f38438m;
            int i3 = bundle3 != null ? bundle3.getInt("android-support-nav:fragment:graphId") : 0;
            Bundle bundle4 = bundle3 != null ? bundle3.getBundle("android-support-nav:fragment:startDestinationArgs") : null;
            if (i3 != 0) {
                this.f854d0.m453h(i3, bundle4);
            }
        }
        super.mo465c0(bundle);
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: f0 */
    public View mo466f0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FragmentContainerView fragmentContainerView = new FragmentContainerView(layoutInflater.getContext());
        int i = this.f38406C;
        if (i == 0 || i == -1) {
            i = R.id.nav_host_fragment_container;
        }
        fragmentContainerView.setId(i);
        return fragmentContainerView;
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: h0 */
    public void mo467h0() {
        this.f38414K = true;
        View view = this.f856f0;
        if (view != null && C8310a.m16438c(view) == this.f854d0) {
            this.f856f0.setTag(R.id.nav_controller_view_tag, null);
        }
        this.f856f0 = null;
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: m0 */
    public void mo468m0(Context context, AttributeSet attributeSet, Bundle bundle) {
        super.mo468m0(context, attributeSet, bundle);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C8456s.f39088b);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            this.f857g0 = resourceId;
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C8459b.f39102c);
        if (typedArrayObtainStyledAttributes2.getBoolean(0, false)) {
            this.f858h0 = true;
        }
        typedArrayObtainStyledAttributes2.recycle();
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: q0 */
    public void mo469q0(boolean z) {
        NavHostController navHostController = this.f854d0;
        if (navHostController == null) {
            this.f855e0 = Boolean.valueOf(z);
        } else {
            navHostController.f844o = z;
            navHostController.m454i();
        }
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: t0 */
    public void mo470t0(Bundle bundle) {
        Bundle bundle2;
        NavHostController navHostController = this.f854d0;
        Objects.requireNonNull(navHostController);
        ArrayList<String> arrayList = new ArrayList<>();
        Bundle bundle3 = new Bundle();
        for (Map.Entry<String, Navigator<? extends NavDestination>> entry : navHostController.f840k.f39086b.entrySet()) {
            String key = entry.getKey();
            Bundle bundleMo460d = entry.getValue().mo460d();
            if (bundleMo460d != null) {
                arrayList.add(key);
                bundle3.putBundle(key, bundleMo460d);
            }
        }
        if (arrayList.isEmpty()) {
            bundle2 = null;
        } else {
            bundle2 = new Bundle();
            bundle3.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
            bundle2.putBundle("android-support-nav:controller:navigatorState", bundle3);
        }
        if (!navHostController.f837h.isEmpty()) {
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            Parcelable[] parcelableArr = new Parcelable[navHostController.f837h.size()];
            int i = 0;
            Iterator<NavBackStackEntry> it = navHostController.f837h.iterator();
            while (it.hasNext()) {
                parcelableArr[i] = new NavBackStackEntryState(it.next());
                i++;
            }
            bundle2.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
        }
        if (navHostController.f836g) {
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            bundle2.putBoolean("android-support-nav:controller:deepLinkHandled", navHostController.f836g);
        }
        if (bundle2 != null) {
            bundle.putBundle("android-support-nav:fragment:navControllerState", bundle2);
        }
        if (this.f858h0) {
            bundle.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
        int i2 = this.f857g0;
        if (i2 != 0) {
            bundle.putInt("android-support-nav:fragment:graphId", i2);
        }
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: w0 */
    public void mo471w0(View view, Bundle bundle) {
        if (!(view instanceof ViewGroup)) {
            throw new IllegalStateException("created host view " + view + " is not a ViewGroup");
        }
        view.setTag(R.id.nav_controller_view_tag, this.f854d0);
        if (view.getParent() != null) {
            View view2 = (View) view.getParent();
            this.f856f0 = view2;
            if (view2.getId() == this.f38406C) {
                this.f856f0.setTag(R.id.nav_controller_view_tag, this.f854d0);
            }
        }
    }
}
