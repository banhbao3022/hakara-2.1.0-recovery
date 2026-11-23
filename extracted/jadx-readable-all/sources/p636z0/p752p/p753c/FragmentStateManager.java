package p636z0.p752p.p753c;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.LifecycleEventObserver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import mtp.media.karaoke.R;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p654b0.SavedStateRegistryController;
import p636z0.p725k.p739l.ViewCompat;
import p636z0.p759s.Lifecycle3;
import p636z0.p759s.LifecycleOwner;
import p636z0.p759s.LifecycleRegistry;
import p636z0.p759s.ViewModelStore;
import p636z0.p759s.ViewModelStoreOwner;

/* JADX INFO: renamed from: z0.p.c.h0, reason: use source file name */
/* JADX INFO: compiled from: FragmentStateManager.java */
/* JADX INFO: loaded from: classes.dex */
public class FragmentStateManager {

    /* JADX INFO: renamed from: a */
    public final FragmentLifecycleCallbacksDispatcher f38339a;

    /* JADX INFO: renamed from: b */
    public final FragmentStore f38340b;

    /* JADX INFO: renamed from: c */
    public final Fragment f38341c;

    /* JADX INFO: renamed from: d */
    public boolean f38342d = false;

    /* JADX INFO: renamed from: e */
    public int f38343e = -1;

    /* JADX INFO: renamed from: z0.p.c.h0$a */
    /* JADX INFO: compiled from: FragmentStateManager.java */
    public class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ View f38344f;

        public a(FragmentStateManager fragmentStateManager, View view) {
            this.f38344f = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f38344f.removeOnAttachStateChangeListener(this);
            View view2 = this.f38344f;
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            view2.requestApplyInsets();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public FragmentStateManager(FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher, FragmentStore fragmentStore, Fragment fragment) {
        this.f38339a = fragmentLifecycleCallbacksDispatcher;
        this.f38340b = fragmentStore;
        this.f38341c = fragment;
    }

    /* JADX INFO: renamed from: a */
    public void m16475a() {
        if (FragmentManager.m16647O(3)) {
            StringBuilder sbM1556G = outline.m1556G("moveto ACTIVITY_CREATED: ");
            sbM1556G.append(this.f38341c);
            Log.d("FragmentManager", sbM1556G.toString());
        }
        Fragment fragment = this.f38341c;
        Bundle bundle = fragment.f38433h;
        fragment.f38404A.m16668V();
        fragment.f38432g = 3;
        fragment.f38414K = false;
        fragment.mo2065W(bundle);
        if (!fragment.f38414K) {
            throw new SuperNotCalledException(outline.m1597s("Fragment ", fragment, " did not call through to super.onActivityCreated()"));
        }
        if (FragmentManager.m16647O(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + fragment);
        }
        View view = fragment.f38416M;
        if (view != null) {
            Bundle bundle2 = fragment.f38433h;
            SparseArray<Parcelable> sparseArray = fragment.f38434i;
            if (sparseArray != null) {
                view.restoreHierarchyState(sparseArray);
                fragment.f38434i = null;
            }
            if (fragment.f38416M != null) {
                fragment.f38426W.f38563j.m15021a(fragment.f38435j);
                fragment.f38435j = null;
            }
            fragment.f38414K = false;
            fragment.mo16512x0(bundle2);
            if (!fragment.f38414K) {
                throw new SuperNotCalledException(outline.m1597s("Fragment ", fragment, " did not call through to super.onViewStateRestored()"));
            }
            if (fragment.f38416M != null) {
                fragment.f38426W.m16615a(Lifecycle3.a.ON_CREATE);
            }
        }
        fragment.f38433h = null;
        FragmentManager fragmentManager = fragment.f38404A;
        fragmentManager.f38605B = false;
        fragmentManager.f38606C = false;
        fragmentManager.f38613J.f38303i = false;
        fragmentManager.m16707w(4);
        FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher = this.f38339a;
        Fragment fragment2 = this.f38341c;
        fragmentLifecycleCallbacksDispatcher.m16633a(fragment2, fragment2.f38433h, false);
    }

    /* JADX INFO: renamed from: b */
    public void m16476b() {
        View view;
        View view2;
        FragmentStore fragmentStore = this.f38340b;
        Fragment fragment = this.f38341c;
        Objects.requireNonNull(fragmentStore);
        ViewGroup viewGroup = fragment.f38415L;
        int iIndexOfChild = -1;
        if (viewGroup != null) {
            int iIndexOf = fragmentStore.f38348a.indexOf(fragment);
            for (int i = iIndexOf - 1; i >= 0; i--) {
                Fragment fragment2 = fragmentStore.f38348a.get(i);
                if (fragment2.f38415L == viewGroup && (view2 = fragment2.f38416M) != null) {
                    iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                }
            }
            while (true) {
                iIndexOf++;
                if (iIndexOf >= fragmentStore.f38348a.size()) {
                    break;
                }
                Fragment fragment3 = fragmentStore.f38348a.get(iIndexOf);
                if (fragment3.f38415L == viewGroup && (view = fragment3.f38416M) != null) {
                    iIndexOfChild = viewGroup.indexOfChild(view);
                    break;
                }
            }
        }
        Fragment fragment4 = this.f38341c;
        fragment4.f38415L.addView(fragment4.f38416M, iIndexOfChild);
    }

    /* JADX INFO: renamed from: c */
    public void m16477c() {
        if (FragmentManager.m16647O(3)) {
            StringBuilder sbM1556G = outline.m1556G("moveto ATTACHED: ");
            sbM1556G.append(this.f38341c);
            Log.d("FragmentManager", sbM1556G.toString());
        }
        Fragment fragment = this.f38341c;
        Fragment fragment2 = fragment.f38439n;
        FragmentStateManager fragmentStateManagerM16500h = null;
        if (fragment2 != null) {
            FragmentStateManager fragmentStateManagerM16500h2 = this.f38340b.m16500h(fragment2.f38437l);
            if (fragmentStateManagerM16500h2 == null) {
                StringBuilder sbM1556G2 = outline.m1556G("Fragment ");
                sbM1556G2.append(this.f38341c);
                sbM1556G2.append(" declared target fragment ");
                sbM1556G2.append(this.f38341c.f38439n);
                sbM1556G2.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(sbM1556G2.toString());
            }
            Fragment fragment3 = this.f38341c;
            fragment3.f38440o = fragment3.f38439n.f38437l;
            fragment3.f38439n = null;
            fragmentStateManagerM16500h = fragmentStateManagerM16500h2;
        } else {
            String str = fragment.f38440o;
            if (str != null && (fragmentStateManagerM16500h = this.f38340b.m16500h(str)) == null) {
                StringBuilder sbM1556G3 = outline.m1556G("Fragment ");
                sbM1556G3.append(this.f38341c);
                sbM1556G3.append(" declared target fragment ");
                throw new IllegalStateException(outline.m1550A(sbM1556G3, this.f38341c.f38440o, " that does not belong to this FragmentManager!"));
            }
        }
        if (fragmentStateManagerM16500h != null) {
            fragmentStateManagerM16500h.m16485k();
        }
        Fragment fragment4 = this.f38341c;
        FragmentManager fragmentManager = fragment4.f38450y;
        fragment4.f38451z = fragmentManager.f38631q;
        fragment4.f38405B = fragmentManager.f38633s;
        this.f38339a.m16639g(fragment4, false);
        Fragment fragment5 = this.f38341c;
        Iterator<Fragment.d> it = fragment5.f38431b0.iterator();
        while (it.hasNext()) {
            it.next().m16575a();
        }
        fragment5.f38431b0.clear();
        fragment5.f38404A.m16675b(fragment5.f38451z, fragment5.mo16511m(), fragment5);
        fragment5.f38432g = 0;
        fragment5.f38414K = false;
        fragment5.mo463Z(fragment5.f38451z.f38565g);
        if (!fragment5.f38414K) {
            throw new SuperNotCalledException(outline.m1597s("Fragment ", fragment5, " did not call through to super.onAttach()"));
        }
        FragmentManager fragmentManager2 = fragment5.f38450y;
        Iterator<FragmentOnAttachListener> it2 = fragmentManager2.f38629o.iterator();
        while (it2.hasNext()) {
            it2.next().mo16472a(fragmentManager2, fragment5);
        }
        FragmentManager fragmentManager3 = fragment5.f38404A;
        fragmentManager3.f38605B = false;
        fragmentManager3.f38606C = false;
        fragmentManager3.f38613J.f38303i = false;
        fragmentManager3.m16707w(0);
        this.f38339a.m16634b(this.f38341c, false);
    }

    /* JADX INFO: renamed from: d */
    public int m16478d() {
        SpecialEffectsController.d next;
        SpecialEffectsController.d.b bVar;
        Fragment fragment = this.f38341c;
        if (fragment.f38450y == null) {
            return fragment.f38432g;
        }
        int iMin = this.f38343e;
        int iOrdinal = fragment.f38424U.ordinal();
        if (iOrdinal == 1) {
            iMin = Math.min(iMin, 0);
        } else if (iOrdinal == 2) {
            iMin = Math.min(iMin, 1);
        } else if (iOrdinal == 3) {
            iMin = Math.min(iMin, 5);
        } else if (iOrdinal != 4) {
            iMin = Math.min(iMin, -1);
        }
        Fragment fragment2 = this.f38341c;
        if (fragment2.f38445t) {
            if (fragment2.f38446u) {
                iMin = Math.max(this.f38343e, 2);
                View view = this.f38341c.f38416M;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f38343e < 4 ? Math.min(iMin, fragment2.f38432g) : Math.min(iMin, 1);
            }
        }
        if (!this.f38341c.f38443r) {
            iMin = Math.min(iMin, 1);
        }
        Fragment fragment3 = this.f38341c;
        ViewGroup viewGroup = fragment3.f38415L;
        SpecialEffectsController.d.b bVar2 = null;
        if (viewGroup != null) {
            SpecialEffectsController specialEffectsControllerM16619g = SpecialEffectsController.m16619g(viewGroup, fragment3.m16529H().m16660M());
            Objects.requireNonNull(specialEffectsControllerM16619g);
            SpecialEffectsController.d dVarM16622d = specialEffectsControllerM16619g.m16622d(this.f38341c);
            if (dVarM16622d != null) {
                bVar = dVarM16622d.f38584b;
            } else {
                Fragment fragment4 = this.f38341c;
                Iterator<SpecialEffectsController.d> it = specialEffectsControllerM16619g.f38575c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (next.f38585c.equals(fragment4) && !next.f38588f) {
                        break;
                    }
                }
                if (next != null) {
                    bVar = next.f38584b;
                }
            }
            bVar2 = bVar;
        }
        if (bVar2 == SpecialEffectsController.d.b.ADDING) {
            iMin = Math.min(iMin, 6);
        } else if (bVar2 == SpecialEffectsController.d.b.REMOVING) {
            iMin = Math.max(iMin, 3);
        } else {
            Fragment fragment5 = this.f38341c;
            if (fragment5.f38444s) {
                iMin = fragment5.m16552T() ? Math.min(iMin, 1) : Math.min(iMin, -1);
            }
        }
        Fragment fragment6 = this.f38341c;
        if (fragment6.f38417N && fragment6.f38432g < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (FragmentManager.m16647O(2)) {
            StringBuilder sbM1557H = outline.m1557H("computeExpectedState() of ", iMin, " for ");
            sbM1557H.append(this.f38341c);
            Log.v("FragmentManager", sbM1557H.toString());
        }
        return iMin;
    }

    /* JADX INFO: renamed from: e */
    public void m16479e() {
        if (FragmentManager.m16647O(3)) {
            StringBuilder sbM1556G = outline.m1556G("moveto CREATED: ");
            sbM1556G.append(this.f38341c);
            Log.d("FragmentManager", sbM1556G.toString());
        }
        Fragment fragment = this.f38341c;
        if (fragment.f38423T) {
            fragment.m16532I0(fragment.f38433h);
            this.f38341c.f38432g = 1;
            return;
        }
        this.f38339a.m16640h(fragment, fragment.f38433h, false);
        final Fragment fragment2 = this.f38341c;
        Bundle bundle = fragment2.f38433h;
        fragment2.f38404A.m16668V();
        fragment2.f38432g = 1;
        fragment2.f38414K = false;
        fragment2.f38425V.mo16727a(new LifecycleEventObserver() { // from class: androidx.fragment.app.Fragment$5
            @Override // androidx.lifecycle.LifecycleEventObserver
            /* JADX INFO: renamed from: c */
            public void mo130c(LifecycleOwner lifecycleOwner, Lifecycle3.a aVar) {
                View view;
                if (aVar != Lifecycle3.a.ON_STOP || (view = fragment2.f38416M) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
            }
        });
        fragment2.f38429Z.m15021a(bundle);
        fragment2.mo465c0(bundle);
        fragment2.f38423T = true;
        if (!fragment2.f38414K) {
            throw new SuperNotCalledException(outline.m1597s("Fragment ", fragment2, " did not call through to super.onCreate()"));
        }
        fragment2.f38425V.m16733f(Lifecycle3.a.ON_CREATE);
        FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher = this.f38339a;
        Fragment fragment3 = this.f38341c;
        fragmentLifecycleCallbacksDispatcher.m16635c(fragment3, fragment3.f38433h, false);
    }

    /* JADX INFO: renamed from: f */
    public void m16480f() {
        String resourceName;
        if (this.f38341c.f38445t) {
            return;
        }
        if (FragmentManager.m16647O(3)) {
            StringBuilder sbM1556G = outline.m1556G("moveto CREATE_VIEW: ");
            sbM1556G.append(this.f38341c);
            Log.d("FragmentManager", sbM1556G.toString());
        }
        Fragment fragment = this.f38341c;
        LayoutInflater layoutInflaterM16517A0 = fragment.m16517A0(fragment.f38433h);
        ViewGroup viewGroup = null;
        Fragment fragment2 = this.f38341c;
        ViewGroup viewGroup2 = fragment2.f38415L;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i = fragment2.f38407D;
            if (i != 0) {
                if (i == -1) {
                    StringBuilder sbM1556G2 = outline.m1556G("Cannot create fragment ");
                    sbM1556G2.append(this.f38341c);
                    sbM1556G2.append(" for a container view with no id");
                    throw new IllegalArgumentException(sbM1556G2.toString());
                }
                viewGroup = (ViewGroup) fragment2.f38450y.f38632r.mo16514c(i);
                if (viewGroup == null) {
                    Fragment fragment3 = this.f38341c;
                    if (!fragment3.f38447v) {
                        try {
                            resourceName = fragment3.m16539M().getResourceName(this.f38341c.f38407D);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        StringBuilder sbM1556G3 = outline.m1556G("No view found for id 0x");
                        sbM1556G3.append(Integer.toHexString(this.f38341c.f38407D));
                        sbM1556G3.append(" (");
                        sbM1556G3.append(resourceName);
                        sbM1556G3.append(") for fragment ");
                        sbM1556G3.append(this.f38341c);
                        throw new IllegalArgumentException(sbM1556G3.toString());
                    }
                }
            }
        }
        Fragment fragment4 = this.f38341c;
        fragment4.f38415L = viewGroup;
        fragment4.mo16513y0(layoutInflaterM16517A0, viewGroup, fragment4.f38433h);
        View view = this.f38341c.f38416M;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            Fragment fragment5 = this.f38341c;
            fragment5.f38416M.setTag(R.id.fragment_container_view_tag, fragment5);
            if (viewGroup != null) {
                m16476b();
            }
            Fragment fragment6 = this.f38341c;
            if (fragment6.f38409F) {
                fragment6.f38416M.setVisibility(8);
            }
            View view2 = this.f38341c.f38416M;
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            if (view2.isAttachedToWindow()) {
                this.f38341c.f38416M.requestApplyInsets();
            } else {
                View view3 = this.f38341c.f38416M;
                view3.addOnAttachStateChangeListener(new a(this, view3));
            }
            Fragment fragment7 = this.f38341c;
            fragment7.mo471w0(fragment7.f38416M, fragment7.f38433h);
            fragment7.f38404A.m16707w(2);
            FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher = this.f38339a;
            Fragment fragment8 = this.f38341c;
            fragmentLifecycleCallbacksDispatcher.m16645m(fragment8, fragment8.f38416M, fragment8.f38433h, false);
            int visibility = this.f38341c.f38416M.getVisibility();
            this.f38341c.m16567r().f38466n = this.f38341c.f38416M.getAlpha();
            Fragment fragment9 = this.f38341c;
            if (fragment9.f38415L != null && visibility == 0) {
                View viewFindFocus = fragment9.f38416M.findFocus();
                if (viewFindFocus != null) {
                    this.f38341c.m16567r().f38467o = viewFindFocus;
                    if (FragmentManager.m16647O(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + this.f38341c);
                    }
                }
                this.f38341c.f38416M.setAlpha(0.0f);
            }
        }
        this.f38341c.f38432g = 2;
    }

    /* JADX INFO: renamed from: g */
    public void m16481g() {
        Fragment fragmentM16496d;
        if (FragmentManager.m16647O(3)) {
            StringBuilder sbM1556G = outline.m1556G("movefrom CREATED: ");
            sbM1556G.append(this.f38341c);
            Log.d("FragmentManager", sbM1556G.toString());
        }
        Fragment fragment = this.f38341c;
        boolean zIsChangingConfigurations = true;
        boolean z = fragment.f38444s && !fragment.m16552T();
        if (!(z || this.f38340b.f38350c.m16471i(this.f38341c))) {
            String str = this.f38341c.f38440o;
            if (str != null && (fragmentM16496d = this.f38340b.m16496d(str)) != null && fragmentM16496d.f38411H) {
                this.f38341c.f38439n = fragmentM16496d;
            }
            this.f38341c.f38432g = 0;
            return;
        }
        FragmentHostCallback<?> fragmentHostCallback = this.f38341c.f38451z;
        if (fragmentHostCallback instanceof ViewModelStoreOwner) {
            zIsChangingConfigurations = this.f38340b.f38350c.f38302h;
        } else {
            Context context = fragmentHostCallback.f38565g;
            if (context instanceof Activity) {
                zIsChangingConfigurations = true ^ ((Activity) context).isChangingConfigurations();
            }
        }
        if (z || zIsChangingConfigurations) {
            FragmentManagerViewModel fragmentManagerViewModel = this.f38340b.f38350c;
            Fragment fragment2 = this.f38341c;
            Objects.requireNonNull(fragmentManagerViewModel);
            if (FragmentManager.m16647O(3)) {
                Log.d("FragmentManager", "Clearing non-config state for " + fragment2);
            }
            FragmentManagerViewModel fragmentManagerViewModel2 = fragmentManagerViewModel.f38299e.get(fragment2.f38437l);
            if (fragmentManagerViewModel2 != null) {
                fragmentManagerViewModel2.mo438e();
                fragmentManagerViewModel.f38299e.remove(fragment2.f38437l);
            }
            ViewModelStore viewModelStore = fragmentManagerViewModel.f38300f.get(fragment2.f38437l);
            if (viewModelStore != null) {
                viewModelStore.m16725a();
                fragmentManagerViewModel.f38300f.remove(fragment2.f38437l);
            }
        }
        Fragment fragment3 = this.f38341c;
        fragment3.f38404A.m16699o();
        fragment3.f38425V.m16733f(Lifecycle3.a.ON_DESTROY);
        fragment3.f38432g = 0;
        fragment3.f38414K = false;
        fragment3.f38423T = false;
        fragment3.mo1956g0();
        if (!fragment3.f38414K) {
            throw new SuperNotCalledException(outline.m1597s("Fragment ", fragment3, " did not call through to super.onDestroy()"));
        }
        this.f38339a.m16636d(this.f38341c, false);
        for (FragmentStateManager fragmentStateManager : (ArrayList) this.f38340b.m16498f()) {
            if (fragmentStateManager != null) {
                Fragment fragment4 = fragmentStateManager.f38341c;
                if (this.f38341c.f38437l.equals(fragment4.f38440o)) {
                    fragment4.f38439n = this.f38341c;
                    fragment4.f38440o = null;
                }
            }
        }
        Fragment fragment5 = this.f38341c;
        String str2 = fragment5.f38440o;
        if (str2 != null) {
            fragment5.f38439n = this.f38340b.m16496d(str2);
        }
        this.f38340b.m16503k(this);
    }

    /* JADX INFO: renamed from: h */
    public void m16482h() {
        View view;
        if (FragmentManager.m16647O(3)) {
            StringBuilder sbM1556G = outline.m1556G("movefrom CREATE_VIEW: ");
            sbM1556G.append(this.f38341c);
            Log.d("FragmentManager", sbM1556G.toString());
        }
        Fragment fragment = this.f38341c;
        ViewGroup viewGroup = fragment.f38415L;
        if (viewGroup != null && (view = fragment.f38416M) != null) {
            viewGroup.removeView(view);
        }
        this.f38341c.m16574z0();
        this.f38339a.m16646n(this.f38341c, false);
        Fragment fragment2 = this.f38341c;
        fragment2.f38415L = null;
        fragment2.f38416M = null;
        fragment2.f38426W = null;
        fragment2.f38427X.mo427j(null);
        this.f38341c.f38446u = false;
    }

    /* JADX INFO: renamed from: i */
    public void m16483i() {
        if (FragmentManager.m16647O(3)) {
            StringBuilder sbM1556G = outline.m1556G("movefrom ATTACHED: ");
            sbM1556G.append(this.f38341c);
            Log.d("FragmentManager", sbM1556G.toString());
        }
        Fragment fragment = this.f38341c;
        fragment.f38432g = -1;
        fragment.f38414K = false;
        fragment.mo1957i0();
        fragment.f38422S = null;
        if (!fragment.f38414K) {
            throw new SuperNotCalledException(outline.m1597s("Fragment ", fragment, " did not call through to super.onDetach()"));
        }
        FragmentManager fragmentManager = fragment.f38404A;
        if (!fragmentManager.f38607D) {
            fragmentManager.m16699o();
            fragment.f38404A = new FragmentManagerImpl();
        }
        this.f38339a.m16637e(this.f38341c, false);
        Fragment fragment2 = this.f38341c;
        fragment2.f38432g = -1;
        fragment2.f38451z = null;
        fragment2.f38405B = null;
        fragment2.f38450y = null;
        if ((fragment2.f38444s && !fragment2.m16552T()) || this.f38340b.f38350c.m16471i(this.f38341c)) {
            if (FragmentManager.m16647O(3)) {
                StringBuilder sbM1556G2 = outline.m1556G("initState called for fragment: ");
                sbM1556G2.append(this.f38341c);
                Log.d("FragmentManager", sbM1556G2.toString());
            }
            Fragment fragment3 = this.f38341c;
            Objects.requireNonNull(fragment3);
            fragment3.f38425V = new LifecycleRegistry(fragment3);
            fragment3.f38429Z = new SavedStateRegistryController(fragment3);
            fragment3.f38428Y = null;
            fragment3.f38437l = UUID.randomUUID().toString();
            fragment3.f38443r = false;
            fragment3.f38444s = false;
            fragment3.f38445t = false;
            fragment3.f38446u = false;
            fragment3.f38447v = false;
            fragment3.f38449x = 0;
            fragment3.f38450y = null;
            fragment3.f38404A = new FragmentManagerImpl();
            fragment3.f38451z = null;
            fragment3.f38406C = 0;
            fragment3.f38407D = 0;
            fragment3.f38408E = null;
            fragment3.f38409F = false;
            fragment3.f38410G = false;
        }
    }

    /* JADX INFO: renamed from: j */
    public void m16484j() {
        Fragment fragment = this.f38341c;
        if (fragment.f38445t && fragment.f38446u && !fragment.f38448w) {
            if (FragmentManager.m16647O(3)) {
                StringBuilder sbM1556G = outline.m1556G("moveto CREATE_VIEW: ");
                sbM1556G.append(this.f38341c);
                Log.d("FragmentManager", sbM1556G.toString());
            }
            Fragment fragment2 = this.f38341c;
            fragment2.mo16513y0(fragment2.m16517A0(fragment2.f38433h), null, this.f38341c.f38433h);
            View view = this.f38341c.f38416M;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f38341c;
                fragment3.f38416M.setTag(R.id.fragment_container_view_tag, fragment3);
                Fragment fragment4 = this.f38341c;
                if (fragment4.f38409F) {
                    fragment4.f38416M.setVisibility(8);
                }
                Fragment fragment5 = this.f38341c;
                fragment5.mo471w0(fragment5.f38416M, fragment5.f38433h);
                fragment5.f38404A.m16707w(2);
                FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher = this.f38339a;
                Fragment fragment6 = this.f38341c;
                fragmentLifecycleCallbacksDispatcher.m16645m(fragment6, fragment6.f38416M, fragment6.f38433h, false);
                this.f38341c.f38432g = 2;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m16485k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        SpecialEffectsController.d.b bVar = SpecialEffectsController.d.b.NONE;
        if (this.f38342d) {
            if (FragmentManager.m16647O(2)) {
                StringBuilder sbM1556G = outline.m1556G("Ignoring re-entrant call to moveToExpectedState() for ");
                sbM1556G.append(this.f38341c);
                Log.v("FragmentManager", sbM1556G.toString());
                return;
            }
            return;
        }
        try {
            this.f38342d = true;
            while (true) {
                int iM16478d = m16478d();
                Fragment fragment = this.f38341c;
                int i = fragment.f38432g;
                if (iM16478d == i) {
                    if (fragment.f38420Q) {
                        if (fragment.f38416M != null && (viewGroup = fragment.f38415L) != null) {
                            SpecialEffectsController specialEffectsControllerM16619g = SpecialEffectsController.m16619g(viewGroup, fragment.m16529H().m16660M());
                            if (this.f38341c.f38409F) {
                                Objects.requireNonNull(specialEffectsControllerM16619g);
                                if (FragmentManager.m16647O(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + this.f38341c);
                                }
                                specialEffectsControllerM16619g.m16620a(SpecialEffectsController.d.c.GONE, bVar, this);
                            } else {
                                Objects.requireNonNull(specialEffectsControllerM16619g);
                                if (FragmentManager.m16647O(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + this.f38341c);
                                }
                                specialEffectsControllerM16619g.m16620a(SpecialEffectsController.d.c.VISIBLE, bVar, this);
                            }
                        }
                        Fragment fragment2 = this.f38341c;
                        FragmentManager fragmentManager = fragment2.f38450y;
                        if (fragmentManager != null && fragment2.f38443r && fragmentManager.m16662P(fragment2)) {
                            fragmentManager.f38604A = true;
                        }
                        Fragment fragment3 = this.f38341c;
                        fragment3.f38420Q = false;
                        fragment3.m16563k0();
                    }
                    return;
                }
                if (iM16478d <= i) {
                    switch (i - 1) {
                        case -1:
                            m16483i();
                            break;
                        case 0:
                            m16481g();
                            break;
                        case 1:
                            m16482h();
                            this.f38341c.f38432g = 1;
                            break;
                        case 2:
                            fragment.f38446u = false;
                            fragment.f38432g = 2;
                            break;
                        case 3:
                            if (FragmentManager.m16647O(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f38341c);
                            }
                            Fragment fragment4 = this.f38341c;
                            if (fragment4.f38416M != null && fragment4.f38434i == null) {
                                m16490p();
                            }
                            Fragment fragment5 = this.f38341c;
                            if (fragment5.f38416M != null && (viewGroup3 = fragment5.f38415L) != null) {
                                SpecialEffectsController specialEffectsControllerM16619g2 = SpecialEffectsController.m16619g(viewGroup3, fragment5.m16529H().m16660M());
                                Objects.requireNonNull(specialEffectsControllerM16619g2);
                                if (FragmentManager.m16647O(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + this.f38341c);
                                }
                                specialEffectsControllerM16619g2.m16620a(SpecialEffectsController.d.c.REMOVED, SpecialEffectsController.d.b.REMOVING, this);
                            }
                            this.f38341c.f38432g = 3;
                            break;
                        case 4:
                            m16492r();
                            break;
                        case 5:
                            fragment.f38432g = 5;
                            break;
                        case 6:
                            m16486l();
                            break;
                    }
                } else {
                    switch (i + 1) {
                        case 0:
                            m16477c();
                            break;
                        case 1:
                            m16479e();
                            break;
                        case 2:
                            m16484j();
                            m16480f();
                            break;
                        case 3:
                            m16475a();
                            break;
                        case 4:
                            if (fragment.f38416M != null && (viewGroup2 = fragment.f38415L) != null) {
                                SpecialEffectsController specialEffectsControllerM16619g3 = SpecialEffectsController.m16619g(viewGroup2, fragment.m16529H().m16660M());
                                SpecialEffectsController.d.c cVarM16630h = SpecialEffectsController.d.c.m16630h(this.f38341c.f38416M.getVisibility());
                                Objects.requireNonNull(specialEffectsControllerM16619g3);
                                if (FragmentManager.m16647O(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + this.f38341c);
                                }
                                specialEffectsControllerM16619g3.m16620a(cVarM16630h, SpecialEffectsController.d.b.ADDING, this);
                            }
                            this.f38341c.f38432g = 4;
                            break;
                        case 5:
                            m16491q();
                            break;
                        case 6:
                            fragment.f38432g = 6;
                            break;
                        case 7:
                            m16488n();
                            break;
                    }
                }
            }
        } finally {
            this.f38342d = false;
        }
    }

    /* JADX INFO: renamed from: l */
    public void m16486l() {
        if (FragmentManager.m16647O(3)) {
            StringBuilder sbM1556G = outline.m1556G("movefrom RESUMED: ");
            sbM1556G.append(this.f38341c);
            Log.d("FragmentManager", sbM1556G.toString());
        }
        Fragment fragment = this.f38341c;
        fragment.f38404A.m16707w(5);
        if (fragment.f38416M != null) {
            fragment.f38426W.m16615a(Lifecycle3.a.ON_PAUSE);
        }
        fragment.f38425V.m16733f(Lifecycle3.a.ON_PAUSE);
        fragment.f38432g = 6;
        fragment.f38414K = false;
        fragment.mo2074o0();
        if (!fragment.f38414K) {
            throw new SuperNotCalledException(outline.m1597s("Fragment ", fragment, " did not call through to super.onPause()"));
        }
        this.f38339a.m16638f(this.f38341c, false);
    }

    /* JADX INFO: renamed from: m */
    public void m16487m(ClassLoader classLoader) {
        Bundle bundle = this.f38341c.f38433h;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        Fragment fragment = this.f38341c;
        fragment.f38434i = fragment.f38433h.getSparseParcelableArray("android:view_state");
        Fragment fragment2 = this.f38341c;
        fragment2.f38435j = fragment2.f38433h.getBundle("android:view_registry_state");
        Fragment fragment3 = this.f38341c;
        fragment3.f38440o = fragment3.f38433h.getString("android:target_state");
        Fragment fragment4 = this.f38341c;
        if (fragment4.f38440o != null) {
            fragment4.f38441p = fragment4.f38433h.getInt("android:target_req_state", 0);
        }
        Fragment fragment5 = this.f38341c;
        Boolean bool = fragment5.f38436k;
        if (bool != null) {
            fragment5.f38418O = bool.booleanValue();
            this.f38341c.f38436k = null;
        } else {
            fragment5.f38418O = fragment5.f38433h.getBoolean("android:user_visible_hint", true);
        }
        Fragment fragment6 = this.f38341c;
        if (fragment6.f38418O) {
            return;
        }
        fragment6.f38417N = true;
    }

    /* JADX INFO: renamed from: n */
    public void m16488n() {
        boolean z;
        if (FragmentManager.m16647O(3)) {
            StringBuilder sbM1556G = outline.m1556G("moveto RESUMED: ");
            sbM1556G.append(this.f38341c);
            Log.d("FragmentManager", sbM1556G.toString());
        }
        Fragment fragment = this.f38341c;
        Fragment.b bVar = fragment.f38419P;
        View view = bVar == null ? null : bVar.f38467o;
        if (view != null) {
            if (view != fragment.f38416M) {
                ViewParent parent = view.getParent();
                while (true) {
                    if (parent == null) {
                        z = false;
                        break;
                    } else {
                        if (parent == this.f38341c.f38416M) {
                            z = true;
                            break;
                        }
                        parent = parent.getParent();
                    }
                }
            } else {
                z = true;
                break;
            }
            if (z) {
                boolean zRequestFocus = view.requestFocus();
                if (FragmentManager.m16647O(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("requestFocus: Restoring focused view ");
                    sb.append(view);
                    sb.append(" ");
                    sb.append(zRequestFocus ? "succeeded" : "failed");
                    sb.append(" on Fragment ");
                    sb.append(this.f38341c);
                    sb.append(" resulting in focused view ");
                    sb.append(this.f38341c.f38416M.findFocus());
                    Log.v("FragmentManager", sb.toString());
                }
            }
        }
        this.f38341c.m16542N0(null);
        Fragment fragment2 = this.f38341c;
        fragment2.f38404A.m16668V();
        fragment2.f38404A.m16650C(true);
        fragment2.f38432g = 7;
        fragment2.f38414K = false;
        fragment2.mo2076s0();
        if (!fragment2.f38414K) {
            throw new SuperNotCalledException(outline.m1597s("Fragment ", fragment2, " did not call through to super.onResume()"));
        }
        LifecycleRegistry lifecycleRegistry = fragment2.f38425V;
        Lifecycle3.a aVar = Lifecycle3.a.ON_RESUME;
        lifecycleRegistry.m16733f(aVar);
        if (fragment2.f38416M != null) {
            fragment2.f38426W.m16615a(aVar);
        }
        FragmentManager fragmentManager = fragment2.f38404A;
        fragmentManager.f38605B = false;
        fragmentManager.f38606C = false;
        fragmentManager.f38613J.f38303i = false;
        fragmentManager.m16707w(7);
        this.f38339a.m16641i(this.f38341c, false);
        Fragment fragment3 = this.f38341c;
        fragment3.f38433h = null;
        fragment3.f38434i = null;
        fragment3.f38435j = null;
    }

    /* JADX INFO: renamed from: o */
    public final Bundle m16489o() {
        Bundle bundle = new Bundle();
        Fragment fragment = this.f38341c;
        fragment.mo470t0(bundle);
        fragment.f38429Z.m15022b(bundle);
        Parcelable parcelableM16678c0 = fragment.f38404A.m16678c0();
        if (parcelableM16678c0 != null) {
            bundle.putParcelable("android:support:fragments", parcelableM16678c0);
        }
        this.f38339a.m16642j(this.f38341c, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f38341c.f38416M != null) {
            m16490p();
        }
        if (this.f38341c.f38434i != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.f38341c.f38434i);
        }
        if (this.f38341c.f38435j != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", this.f38341c.f38435j);
        }
        if (!this.f38341c.f38418O) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.f38341c.f38418O);
        }
        return bundle;
    }

    /* JADX INFO: renamed from: p */
    public void m16490p() {
        if (this.f38341c.f38416M == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f38341c.f38416M.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f38341c.f38434i = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f38341c.f38426W.f38563j.m15022b(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.f38341c.f38435j = bundle;
    }

    /* JADX INFO: renamed from: q */
    public void m16491q() {
        if (FragmentManager.m16647O(3)) {
            StringBuilder sbM1556G = outline.m1556G("moveto STARTED: ");
            sbM1556G.append(this.f38341c);
            Log.d("FragmentManager", sbM1556G.toString());
        }
        Fragment fragment = this.f38341c;
        fragment.f38404A.m16668V();
        fragment.f38404A.m16650C(true);
        fragment.f38432g = 5;
        fragment.f38414K = false;
        fragment.mo1958u0();
        if (!fragment.f38414K) {
            throw new SuperNotCalledException(outline.m1597s("Fragment ", fragment, " did not call through to super.onStart()"));
        }
        LifecycleRegistry lifecycleRegistry = fragment.f38425V;
        Lifecycle3.a aVar = Lifecycle3.a.ON_START;
        lifecycleRegistry.m16733f(aVar);
        if (fragment.f38416M != null) {
            fragment.f38426W.m16615a(aVar);
        }
        FragmentManager fragmentManager = fragment.f38404A;
        fragmentManager.f38605B = false;
        fragmentManager.f38606C = false;
        fragmentManager.f38613J.f38303i = false;
        fragmentManager.m16707w(5);
        this.f38339a.m16643k(this.f38341c, false);
    }

    /* JADX INFO: renamed from: r */
    public void m16492r() {
        if (FragmentManager.m16647O(3)) {
            StringBuilder sbM1556G = outline.m1556G("movefrom STARTED: ");
            sbM1556G.append(this.f38341c);
            Log.d("FragmentManager", sbM1556G.toString());
        }
        Fragment fragment = this.f38341c;
        FragmentManager fragmentManager = fragment.f38404A;
        fragmentManager.f38606C = true;
        fragmentManager.f38613J.f38303i = true;
        fragmentManager.m16707w(4);
        if (fragment.f38416M != null) {
            fragment.f38426W.m16615a(Lifecycle3.a.ON_STOP);
        }
        fragment.f38425V.m16733f(Lifecycle3.a.ON_STOP);
        fragment.f38432g = 4;
        fragment.f38414K = false;
        fragment.mo1959v0();
        if (!fragment.f38414K) {
            throw new SuperNotCalledException(outline.m1597s("Fragment ", fragment, " did not call through to super.onStop()"));
        }
        this.f38339a.m16644l(this.f38341c, false);
    }

    public FragmentStateManager(FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher, FragmentStore fragmentStore, ClassLoader classLoader, FragmentFactory fragmentFactory, FragmentState fragmentState) {
        this.f38339a = fragmentLifecycleCallbacksDispatcher;
        this.f38340b = fragmentStore;
        Fragment fragmentMo16614a = fragmentFactory.mo16614a(classLoader, fragmentState.f38322f);
        this.f38341c = fragmentMo16614a;
        Bundle bundle = fragmentState.f38331o;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        fragmentMo16614a.m16540M0(fragmentState.f38331o);
        fragmentMo16614a.f38437l = fragmentState.f38323g;
        fragmentMo16614a.f38445t = fragmentState.f38324h;
        fragmentMo16614a.f38447v = true;
        fragmentMo16614a.f38406C = fragmentState.f38325i;
        fragmentMo16614a.f38407D = fragmentState.f38326j;
        fragmentMo16614a.f38408E = fragmentState.f38327k;
        fragmentMo16614a.f38411H = fragmentState.f38328l;
        fragmentMo16614a.f38444s = fragmentState.f38329m;
        fragmentMo16614a.f38410G = fragmentState.f38330n;
        fragmentMo16614a.f38409F = fragmentState.f38332p;
        fragmentMo16614a.f38424U = Lifecycle3.b.values()[fragmentState.f38333q];
        Bundle bundle2 = fragmentState.f38334r;
        if (bundle2 != null) {
            fragmentMo16614a.f38433h = bundle2;
        } else {
            fragmentMo16614a.f38433h = new Bundle();
        }
        if (FragmentManager.m16647O(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + fragmentMo16614a);
        }
    }

    public FragmentStateManager(FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher, FragmentStore fragmentStore, Fragment fragment, FragmentState fragmentState) {
        this.f38339a = fragmentLifecycleCallbacksDispatcher;
        this.f38340b = fragmentStore;
        this.f38341c = fragment;
        fragment.f38434i = null;
        fragment.f38435j = null;
        fragment.f38449x = 0;
        fragment.f38446u = false;
        fragment.f38443r = false;
        Fragment fragment2 = fragment.f38439n;
        fragment.f38440o = fragment2 != null ? fragment2.f38437l : null;
        fragment.f38439n = null;
        Bundle bundle = fragmentState.f38334r;
        if (bundle != null) {
            fragment.f38433h = bundle;
        } else {
            fragment.f38433h = new Bundle();
        }
    }
}
