package p636z0.p752p.p753c;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import mtp.media.karaoke.R;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p654b0.SavedStateRegistry;
import p636z0.p654b0.SavedStateRegistryController;
import p636z0.p654b0.SavedStateRegistryOwner;
import p636z0.p725k.p726c.SharedElementCallback;
import p636z0.p725k.p727d.ContextCompat;
import p636z0.p759s.HasDefaultViewModelProviderFactory;
import p636z0.p759s.Lifecycle3;
import p636z0.p759s.LifecycleOwner;
import p636z0.p759s.LifecycleRegistry;
import p636z0.p759s.MutableLiveData;
import p636z0.p759s.SavedStateViewModelFactory;
import p636z0.p759s.ViewModelProvider2;
import p636z0.p759s.ViewModelStore;
import p636z0.p759s.ViewModelStoreOwner;
import p636z0.p760t.p761a.LoaderManager;
import p636z0.p760t.p761a.LoaderManagerImpl;

/* JADX INFO: renamed from: z0.p.c.m, reason: use source file name */
/* JADX INFO: compiled from: Fragment.java */
/* JADX INFO: loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, LifecycleOwner, ViewModelStoreOwner, HasDefaultViewModelProviderFactory, SavedStateRegistryOwner {

    /* JADX INFO: renamed from: f */
    public static final Object f38403f = new Object();

    /* JADX INFO: renamed from: A */
    public FragmentManager f38404A;

    /* JADX INFO: renamed from: B */
    public Fragment f38405B;

    /* JADX INFO: renamed from: C */
    public int f38406C;

    /* JADX INFO: renamed from: D */
    public int f38407D;

    /* JADX INFO: renamed from: E */
    public String f38408E;

    /* JADX INFO: renamed from: F */
    public boolean f38409F;

    /* JADX INFO: renamed from: G */
    public boolean f38410G;

    /* JADX INFO: renamed from: H */
    public boolean f38411H;

    /* JADX INFO: renamed from: I */
    public boolean f38412I;

    /* JADX INFO: renamed from: J */
    public boolean f38413J;

    /* JADX INFO: renamed from: K */
    public boolean f38414K;

    /* JADX INFO: renamed from: L */
    public ViewGroup f38415L;

    /* JADX INFO: renamed from: M */
    public View f38416M;

    /* JADX INFO: renamed from: N */
    public boolean f38417N;

    /* JADX INFO: renamed from: O */
    public boolean f38418O;

    /* JADX INFO: renamed from: P */
    public b f38419P;

    /* JADX INFO: renamed from: Q */
    public boolean f38420Q;

    /* JADX INFO: renamed from: R */
    public float f38421R;

    /* JADX INFO: renamed from: S */
    public LayoutInflater f38422S;

    /* JADX INFO: renamed from: T */
    public boolean f38423T;

    /* JADX INFO: renamed from: U */
    public Lifecycle3.b f38424U;

    /* JADX INFO: renamed from: V */
    public LifecycleRegistry f38425V;

    /* JADX INFO: renamed from: W */
    public FragmentViewLifecycleOwner f38426W;

    /* JADX INFO: renamed from: X */
    public MutableLiveData<LifecycleOwner> f38427X;

    /* JADX INFO: renamed from: Y */
    public ViewModelProvider2.b f38428Y;

    /* JADX INFO: renamed from: Z */
    public SavedStateRegistryController f38429Z;

    /* JADX INFO: renamed from: a0 */
    public int f38430a0;

    /* JADX INFO: renamed from: b0 */
    public final ArrayList<d> f38431b0;

    /* JADX INFO: renamed from: g */
    public int f38432g;

    /* JADX INFO: renamed from: h */
    public Bundle f38433h;

    /* JADX INFO: renamed from: i */
    public SparseArray<Parcelable> f38434i;

    /* JADX INFO: renamed from: j */
    public Bundle f38435j;

    /* JADX INFO: renamed from: k */
    public Boolean f38436k;

    /* JADX INFO: renamed from: l */
    public String f38437l;

    /* JADX INFO: renamed from: m */
    public Bundle f38438m;

    /* JADX INFO: renamed from: n */
    public Fragment f38439n;

    /* JADX INFO: renamed from: o */
    public String f38440o;

    /* JADX INFO: renamed from: p */
    public int f38441p;

    /* JADX INFO: renamed from: q */
    public Boolean f38442q;

    /* JADX INFO: renamed from: r */
    public boolean f38443r;

    /* JADX INFO: renamed from: s */
    public boolean f38444s;

    /* JADX INFO: renamed from: t */
    public boolean f38445t;

    /* JADX INFO: renamed from: u */
    public boolean f38446u;

    /* JADX INFO: renamed from: v */
    public boolean f38447v;

    /* JADX INFO: renamed from: w */
    public boolean f38448w;

    /* JADX INFO: renamed from: x */
    public int f38449x;

    /* JADX INFO: renamed from: y */
    public FragmentManager f38450y;

    /* JADX INFO: renamed from: z */
    public FragmentHostCallback<?> f38451z;

    /* JADX INFO: renamed from: z0.p.c.m$a */
    /* JADX INFO: compiled from: Fragment.java */
    public class a extends FragmentContainer {
        public a() {
        }

        @Override // p636z0.p752p.p753c.FragmentContainer
        /* JADX INFO: renamed from: c */
        public View mo16514c(int i) {
            View view = Fragment.this.f38416M;
            if (view != null) {
                return view.findViewById(i);
            }
            StringBuilder sbM1556G = outline.m1556G("Fragment ");
            sbM1556G.append(Fragment.this);
            sbM1556G.append(" does not have a view");
            throw new IllegalStateException(sbM1556G.toString());
        }

        @Override // p636z0.p752p.p753c.FragmentContainer
        /* JADX INFO: renamed from: e */
        public boolean mo16515e() {
            return Fragment.this.f38416M != null;
        }
    }

    /* JADX INFO: renamed from: z0.p.c.m$b */
    /* JADX INFO: compiled from: Fragment.java */
    public static class b {

        /* JADX INFO: renamed from: a */
        public View f38453a;

        /* JADX INFO: renamed from: b */
        public Animator f38454b;

        /* JADX INFO: renamed from: c */
        public boolean f38455c;

        /* JADX INFO: renamed from: d */
        public int f38456d;

        /* JADX INFO: renamed from: e */
        public int f38457e;

        /* JADX INFO: renamed from: f */
        public int f38458f;

        /* JADX INFO: renamed from: g */
        public int f38459g;

        /* JADX INFO: renamed from: h */
        public int f38460h;

        /* JADX INFO: renamed from: i */
        public ArrayList<String> f38461i;

        /* JADX INFO: renamed from: j */
        public ArrayList<String> f38462j;

        /* JADX INFO: renamed from: k */
        public Object f38463k;

        /* JADX INFO: renamed from: l */
        public Object f38464l;

        /* JADX INFO: renamed from: m */
        public Object f38465m;

        /* JADX INFO: renamed from: n */
        public float f38466n;

        /* JADX INFO: renamed from: o */
        public View f38467o;

        /* JADX INFO: renamed from: p */
        public e f38468p;

        /* JADX INFO: renamed from: q */
        public boolean f38469q;

        public b() {
            Object obj = Fragment.f38403f;
            this.f38463k = obj;
            this.f38464l = obj;
            this.f38465m = obj;
            this.f38466n = 1.0f;
            this.f38467o = null;
        }
    }

    /* JADX INFO: renamed from: z0.p.c.m$c */
    /* JADX INFO: compiled from: Fragment.java */
    public static class c extends RuntimeException {
        public c(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* JADX INFO: renamed from: z0.p.c.m$d */
    /* JADX INFO: compiled from: Fragment.java */
    public static abstract class d {
        /* JADX INFO: renamed from: a */
        public abstract void m16575a();
    }

    /* JADX INFO: renamed from: z0.p.c.m$e */
    /* JADX INFO: compiled from: Fragment.java */
    public interface e {
    }

    public Fragment() {
        this.f38432g = -1;
        this.f38437l = UUID.randomUUID().toString();
        this.f38440o = null;
        this.f38442q = null;
        this.f38404A = new FragmentManagerImpl();
        this.f38413J = true;
        this.f38418O = true;
        this.f38424U = Lifecycle3.b.RESUMED;
        this.f38427X = new MutableLiveData<>();
        new AtomicInteger();
        this.f38431b0 = new ArrayList<>();
        this.f38425V = new LifecycleRegistry(this);
        this.f38429Z = new SavedStateRegistryController(this);
        this.f38428Y = null;
    }

    /* JADX INFO: renamed from: A */
    public SharedElementCallback m16516A() {
        b bVar = this.f38419P;
        if (bVar == null) {
            return null;
        }
        Objects.requireNonNull(bVar);
        return null;
    }

    /* JADX INFO: renamed from: A0 */
    public LayoutInflater m16517A0(Bundle bundle) {
        LayoutInflater layoutInflaterMo16510j0 = mo16510j0(bundle);
        this.f38422S = layoutInflaterMo16510j0;
        return layoutInflaterMo16510j0;
    }

    /* JADX INFO: renamed from: B */
    public int m16518B() {
        b bVar = this.f38419P;
        if (bVar == null) {
            return 0;
        }
        return bVar.f38457e;
    }

    /* JADX INFO: renamed from: B0 */
    public void m16519B0() {
        onLowMemory();
        this.f38404A.m16700p();
    }

    /* JADX INFO: renamed from: C */
    public Object m16520C() {
        b bVar = this.f38419P;
        if (bVar == null) {
            return null;
        }
        Objects.requireNonNull(bVar);
        return null;
    }

    /* JADX INFO: renamed from: C0 */
    public boolean m16521C0(Menu menu) {
        if (this.f38409F) {
            return false;
        }
        return false | this.f38404A.m16706v(menu);
    }

    /* JADX INFO: renamed from: D */
    public SharedElementCallback m16522D() {
        b bVar = this.f38419P;
        if (bVar == null) {
            return null;
        }
        Objects.requireNonNull(bVar);
        return null;
    }

    @Deprecated
    /* JADX INFO: renamed from: D0 */
    public final void m16523D0(String[] strArr, int i) {
        if (this.f38451z == null) {
            throw new IllegalStateException(outline.m1597s("Fragment ", this, " not attached to Activity"));
        }
        FragmentManager fragmentManagerM16529H = m16529H();
        if (fragmentManagerM16529H.f38639y == null) {
            Objects.requireNonNull(fragmentManagerM16529H.f38631q);
            return;
        }
        fragmentManagerM16529H.f38640z.addLast(new FragmentManager.l(this.f38437l, i));
        fragmentManagerM16529H.f38639y.mo14493a(strArr, null);
    }

    /* JADX INFO: renamed from: E */
    public final LayoutInflater m16524E() {
        LayoutInflater layoutInflater = this.f38422S;
        return layoutInflater == null ? m16517A0(null) : layoutInflater;
    }

    @Deprecated
    /* JADX INFO: renamed from: F */
    public LayoutInflater m16525F() {
        FragmentHostCallback<?> fragmentHostCallback = this.f38451z;
        if (fragmentHostCallback == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        LayoutInflater layoutInflaterMo16582h = fragmentHostCallback.mo16582h();
        layoutInflaterMo16582h.setFactory2(this.f38404A.f38620f);
        return layoutInflaterMo16582h;
    }

    /* JADX INFO: renamed from: F0 */
    public final FragmentActivity m16526F0() {
        FragmentActivity fragmentActivityM16562f = m16562f();
        if (fragmentActivityM16562f != null) {
            return fragmentActivityM16562f;
        }
        throw new IllegalStateException(outline.m1597s("Fragment ", this, " not attached to an activity."));
    }

    /* JADX INFO: renamed from: G */
    public final int m16527G() {
        Lifecycle3.b bVar = this.f38424U;
        return (bVar == Lifecycle3.b.INITIALIZED || this.f38405B == null) ? bVar.ordinal() : Math.min(bVar.ordinal(), this.f38405B.m16527G());
    }

    /* JADX INFO: renamed from: G0 */
    public final Context m16528G0() {
        Context contextM16571x = m16571x();
        if (contextM16571x != null) {
            return contextM16571x;
        }
        throw new IllegalStateException(outline.m1597s("Fragment ", this, " not attached to a context."));
    }

    /* JADX INFO: renamed from: H */
    public final FragmentManager m16529H() {
        FragmentManager fragmentManager = this.f38450y;
        if (fragmentManager != null) {
            return fragmentManager;
        }
        throw new IllegalStateException(outline.m1597s("Fragment ", this, " not associated with a fragment manager."));
    }

    /* JADX INFO: renamed from: H0 */
    public final View m16530H0() {
        View view = this.f38416M;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(outline.m1597s("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    /* JADX INFO: renamed from: I */
    public boolean m16531I() {
        b bVar = this.f38419P;
        if (bVar == null) {
            return false;
        }
        return bVar.f38455c;
    }

    /* JADX INFO: renamed from: I0 */
    public void m16532I0(Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        this.f38404A.m16676b0(parcelable);
        this.f38404A.m16697m();
    }

    /* JADX INFO: renamed from: J */
    public int m16533J() {
        b bVar = this.f38419P;
        if (bVar == null) {
            return 0;
        }
        return bVar.f38458f;
    }

    /* JADX INFO: renamed from: J0 */
    public void m16534J0(View view) {
        m16567r().f38453a = view;
    }

    /* JADX INFO: renamed from: K */
    public int m16535K() {
        b bVar = this.f38419P;
        if (bVar == null) {
            return 0;
        }
        return bVar.f38459g;
    }

    /* JADX INFO: renamed from: K0 */
    public void m16536K0(int i, int i2, int i3, int i4) {
        if (this.f38419P == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        m16567r().f38456d = i;
        m16567r().f38457e = i2;
        m16567r().f38458f = i3;
        m16567r().f38459g = i4;
    }

    /* JADX INFO: renamed from: L */
    public Object m16537L() {
        b bVar = this.f38419P;
        if (bVar == null) {
            return null;
        }
        Object obj = bVar.f38464l;
        if (obj != f38403f) {
            return obj;
        }
        m16520C();
        return null;
    }

    /* JADX INFO: renamed from: L0 */
    public void m16538L0(Animator animator) {
        m16567r().f38454b = animator;
    }

    /* JADX INFO: renamed from: M */
    public final Resources m16539M() {
        return m16528G0().getResources();
    }

    /* JADX INFO: renamed from: M0 */
    public void m16540M0(Bundle bundle) {
        FragmentManager fragmentManager = this.f38450y;
        if (fragmentManager != null) {
            if (fragmentManager == null ? false : fragmentManager.m16665S()) {
                throw new IllegalStateException("Fragment already added and state has been saved");
            }
        }
        this.f38438m = bundle;
    }

    /* JADX INFO: renamed from: N */
    public Object m16541N() {
        b bVar = this.f38419P;
        if (bVar == null) {
            return null;
        }
        Object obj = bVar.f38463k;
        if (obj != f38403f) {
            return obj;
        }
        m16573z();
        return null;
    }

    /* JADX INFO: renamed from: N0 */
    public void m16542N0(View view) {
        m16567r().f38467o = null;
    }

    /* JADX INFO: renamed from: O */
    public Object m16543O() {
        b bVar = this.f38419P;
        if (bVar == null) {
            return null;
        }
        Objects.requireNonNull(bVar);
        return null;
    }

    /* JADX INFO: renamed from: O0 */
    public void m16544O0(boolean z) {
        m16567r().f38469q = z;
    }

    /* JADX INFO: renamed from: P */
    public Object m16545P() {
        b bVar = this.f38419P;
        if (bVar == null) {
            return null;
        }
        Object obj = bVar.f38465m;
        if (obj != f38403f) {
            return obj;
        }
        m16543O();
        return null;
    }

    /* JADX INFO: renamed from: P0 */
    public void mo13901P0(boolean z) {
        if (this.f38413J != z) {
            this.f38413J = z;
        }
    }

    /* JADX INFO: renamed from: Q */
    public final String m16546Q(int i) {
        return m16539M().getString(i);
    }

    /* JADX INFO: renamed from: Q0 */
    public void m16547Q0(e eVar) {
        m16567r();
        e eVar2 = this.f38419P.f38468p;
        if (eVar == eVar2) {
            return;
        }
        if (eVar != null && eVar2 != null) {
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
        if (eVar != null) {
            ((FragmentManager.o) eVar).f38657c++;
        }
    }

    /* JADX INFO: renamed from: R */
    public LifecycleOwner m16548R() {
        FragmentViewLifecycleOwner fragmentViewLifecycleOwner = this.f38426W;
        if (fragmentViewLifecycleOwner != null) {
            return fragmentViewLifecycleOwner;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    /* JADX INFO: renamed from: R0 */
    public void m16549R0(boolean z) {
        if (this.f38419P == null) {
            return;
        }
        m16567r().f38455c = z;
    }

    /* JADX INFO: renamed from: S */
    public final boolean m16550S() {
        return this.f38451z != null && this.f38443r;
    }

    @Deprecated
    /* JADX INFO: renamed from: S0 */
    public void m16551S0(boolean z) {
        this.f38411H = z;
        FragmentManager fragmentManager = this.f38450y;
        if (fragmentManager == null) {
            this.f38412I = true;
        } else if (z) {
            fragmentManager.f38613J.m16469g(this);
        } else {
            fragmentManager.f38613J.m16470h(this);
        }
    }

    /* JADX INFO: renamed from: T */
    public final boolean m16552T() {
        return this.f38449x > 0;
    }

    @Deprecated
    /* JADX INFO: renamed from: T0 */
    public void m16553T0(boolean z) {
        if (!this.f38418O && z && this.f38432g < 5 && this.f38450y != null && m16550S() && this.f38423T) {
            FragmentManager fragmentManager = this.f38450y;
            fragmentManager.m16669W(fragmentManager.m16687h(this));
        }
        this.f38418O = z;
        this.f38417N = this.f38432g < 5 && !z;
        if (this.f38433h != null) {
            this.f38436k = Boolean.valueOf(z);
        }
    }

    /* JADX INFO: renamed from: U */
    public boolean m16554U() {
        if (this.f38419P == null) {
        }
        return false;
    }

    /* JADX INFO: renamed from: U0 */
    public void m16555U0(@SuppressLint({"UnknownNullness"}) Intent intent) {
        FragmentHostCallback<?> fragmentHostCallback = this.f38451z;
        if (fragmentHostCallback == null) {
            throw new IllegalStateException(outline.m1597s("Fragment ", this, " not attached to Activity"));
        }
        Context context = fragmentHostCallback.f38565g;
        Object obj = ContextCompat.f37815a;
        ContextCompat.a.m16136b(context, intent, null);
    }

    /* JADX INFO: renamed from: V */
    public final boolean m16556V() {
        Fragment fragment = this.f38405B;
        return fragment != null && (fragment.f38444s || fragment.m16556V());
    }

    /* JADX INFO: renamed from: V0 */
    public void m16557V0() {
        if (this.f38419P != null) {
            Objects.requireNonNull(m16567r());
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: W */
    public void mo2065W(Bundle bundle) {
        this.f38414K = true;
    }

    @Deprecated
    /* JADX INFO: renamed from: X */
    public void mo2588X(int i, int i2, Intent intent) {
        if (FragmentManager.m16647O(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: Y */
    public void m16558Y() {
        this.f38414K = true;
    }

    /* JADX INFO: renamed from: Z */
    public void mo463Z(Context context) {
        this.f38414K = true;
        FragmentHostCallback<?> fragmentHostCallback = this.f38451z;
        if ((fragmentHostCallback == null ? null : fragmentHostCallback.f38564f) != null) {
            this.f38414K = false;
            m16558Y();
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: a0 */
    public void mo464a0(Fragment fragment) {
    }

    @Override // p636z0.p759s.LifecycleOwner
    /* JADX INFO: renamed from: b */
    public Lifecycle3 mo124b() {
        return this.f38425V;
    }

    /* JADX INFO: renamed from: b0 */
    public boolean m16559b0() {
        return false;
    }

    /* JADX INFO: renamed from: c0 */
    public void mo465c0(Bundle bundle) {
        Parcelable parcelable;
        this.f38414K = true;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.f38404A.m16676b0(parcelable);
            this.f38404A.m16697m();
        }
        FragmentManager fragmentManager = this.f38404A;
        if (fragmentManager.f38630p >= 1) {
            return;
        }
        fragmentManager.m16697m();
    }

    /* JADX INFO: renamed from: d0 */
    public Animation m16560d0() {
        return null;
    }

    /* JADX INFO: renamed from: e0 */
    public Animator m16561e0() {
        return null;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* JADX INFO: renamed from: f0 */
    public View mo466f0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = this.f38430a0;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    /* JADX INFO: renamed from: g0 */
    public void mo1956g0() {
        this.f38414K = true;
    }

    /* JADX INFO: renamed from: h0 */
    public void mo467h0() {
        this.f38414K = true;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    @Override // p636z0.p759s.HasDefaultViewModelProviderFactory
    /* JADX INFO: renamed from: i */
    public ViewModelProvider2.b mo126i() {
        if (this.f38450y == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.f38428Y == null) {
            Application application = null;
            for (Context applicationContext = m16528G0().getApplicationContext(); applicationContext instanceof ContextWrapper; applicationContext = ((ContextWrapper) applicationContext).getBaseContext()) {
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
            }
            if (application == null && FragmentManager.m16647O(3)) {
                StringBuilder sbM1556G = outline.m1556G("Could not find Application instance from Context ");
                sbM1556G.append(m16528G0().getApplicationContext());
                sbM1556G.append(", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
                Log.d("FragmentManager", sbM1556G.toString());
            }
            this.f38428Y = new SavedStateViewModelFactory(application, this, this.f38438m);
        }
        return this.f38428Y;
    }

    /* JADX INFO: renamed from: i0 */
    public void mo1957i0() {
        this.f38414K = true;
    }

    /* JADX INFO: renamed from: j0 */
    public LayoutInflater mo16510j0(Bundle bundle) {
        return m16525F();
    }

    /* JADX INFO: renamed from: k0 */
    public void m16563k0() {
    }

    @Deprecated
    /* JADX INFO: renamed from: l0 */
    public void m16564l0() {
        this.f38414K = true;
    }

    /* JADX INFO: renamed from: m */
    public FragmentContainer mo16511m() {
        return new a();
    }

    /* JADX INFO: renamed from: m0 */
    public void mo468m0(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.f38414K = true;
        FragmentHostCallback<?> fragmentHostCallback = this.f38451z;
        if ((fragmentHostCallback == null ? null : fragmentHostCallback.f38564f) != null) {
            this.f38414K = false;
            m16564l0();
        }
    }

    /* JADX INFO: renamed from: n0 */
    public void m16565n0() {
    }

    @Override // p636z0.p759s.ViewModelStoreOwner
    /* JADX INFO: renamed from: o */
    public ViewModelStore mo128o() {
        if (this.f38450y == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (m16527G() == Lifecycle3.b.INITIALIZED.ordinal()) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        FragmentManagerViewModel fragmentManagerViewModel = this.f38450y.f38613J;
        ViewModelStore viewModelStore = fragmentManagerViewModel.f38300f.get(this.f38437l);
        if (viewModelStore != null) {
            return viewModelStore;
        }
        ViewModelStore viewModelStore2 = new ViewModelStore();
        fragmentManagerViewModel.f38300f.put(this.f38437l, viewModelStore2);
        return viewModelStore2;
    }

    /* JADX INFO: renamed from: o0 */
    public void mo2074o0() {
        this.f38414K = true;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.f38414K = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        m16526F0().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.f38414K = true;
    }

    /* JADX INFO: renamed from: p0 */
    public void m16566p0() {
    }

    /* JADX INFO: renamed from: q */
    public void mo5545q(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2;
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f38406C));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f38407D));
        printWriter.print(" mTag=");
        printWriter.println(this.f38408E);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f38432g);
        printWriter.print(" mWho=");
        printWriter.print(this.f38437l);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f38449x);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f38443r);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f38444s);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f38445t);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f38446u);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f38409F);
        printWriter.print(" mDetached=");
        printWriter.print(this.f38410G);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.f38413J);
        printWriter.print(" mHasMenu=");
        printWriter.println(false);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.f38411H);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.f38418O);
        if (this.f38450y != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f38450y);
        }
        if (this.f38451z != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f38451z);
        }
        if (this.f38405B != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f38405B);
        }
        if (this.f38438m != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f38438m);
        }
        if (this.f38433h != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f38433h);
        }
        if (this.f38434i != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f38434i);
        }
        if (this.f38435j != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.f38435j);
        }
        Fragment fragmentM16654G = this.f38439n;
        if (fragmentM16654G == null) {
            FragmentManager fragmentManager = this.f38450y;
            fragmentM16654G = (fragmentManager == null || (str2 = this.f38440o) == null) ? null : fragmentManager.m16654G(str2);
        }
        if (fragmentM16654G != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(fragmentM16654G);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f38441p);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(m16531I());
        if (m16572y() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(m16572y());
        }
        if (m16518B() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(m16518B());
        }
        if (m16533J() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(m16533J());
        }
        if (m16535K() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(m16535K());
        }
        if (this.f38415L != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.f38415L);
        }
        if (this.f38416M != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.f38416M);
        }
        if (m16569v() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(m16569v());
        }
        if (m16571x() != null) {
            LoaderManager.m16748b(this).mo16749a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.f38404A + ":");
        this.f38404A.m16709y(outline.m1599u(str, "  "), fileDescriptor, printWriter, strArr);
    }

    /* JADX INFO: renamed from: q0 */
    public void mo469q0(boolean z) {
    }

    /* JADX INFO: renamed from: r */
    public final b m16567r() {
        if (this.f38419P == null) {
            this.f38419P = new b();
        }
        return this.f38419P;
    }

    @Deprecated
    /* JADX INFO: renamed from: r0 */
    public void mo2075r0(int i, String[] strArr, int[] iArr) {
    }

    @Override // p636z0.p654b0.SavedStateRegistryOwner
    /* JADX INFO: renamed from: s */
    public final SavedStateRegistry mo129s() {
        return this.f38429Z.f35301b;
    }

    /* JADX INFO: renamed from: s0 */
    public void mo2076s0() {
        this.f38414K = true;
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        if (this.f38451z == null) {
            throw new IllegalStateException(outline.m1597s("Fragment ", this, " not attached to Activity"));
        }
        FragmentManager fragmentManagerM16529H = m16529H();
        if (fragmentManagerM16529H.f38637w != null) {
            fragmentManagerM16529H.f38640z.addLast(new FragmentManager.l(this.f38437l, i));
            fragmentManagerM16529H.f38637w.mo14493a(intent, null);
            return;
        }
        FragmentHostCallback<?> fragmentHostCallback = fragmentManagerM16529H.f38631q;
        Objects.requireNonNull(fragmentHostCallback);
        if (i != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        Context context = fragmentHostCallback.f38565g;
        Object obj = ContextCompat.f37815a;
        ContextCompat.a.m16136b(context, intent, null);
    }

    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final FragmentActivity m16562f() {
        FragmentHostCallback<?> fragmentHostCallback = this.f38451z;
        if (fragmentHostCallback == null) {
            return null;
        }
        return (FragmentActivity) fragmentHostCallback.f38564f;
    }

    /* JADX INFO: renamed from: t0 */
    public void mo470t0(Bundle bundle) {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.f38437l);
        if (this.f38406C != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f38406C));
        }
        if (this.f38408E != null) {
            sb.append(" tag=");
            sb.append(this.f38408E);
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: u0 */
    public void mo1958u0() {
        this.f38414K = true;
    }

    /* JADX INFO: renamed from: v */
    public View m16569v() {
        b bVar = this.f38419P;
        if (bVar == null) {
            return null;
        }
        return bVar.f38453a;
    }

    /* JADX INFO: renamed from: v0 */
    public void mo1959v0() {
        this.f38414K = true;
    }

    /* JADX INFO: renamed from: w */
    public final FragmentManager m16570w() {
        if (this.f38451z != null) {
            return this.f38404A;
        }
        throw new IllegalStateException(outline.m1597s("Fragment ", this, " has not been attached yet."));
    }

    /* JADX INFO: renamed from: w0 */
    public void mo471w0(View view, Bundle bundle) {
    }

    /* JADX INFO: renamed from: x */
    public Context m16571x() {
        FragmentHostCallback<?> fragmentHostCallback = this.f38451z;
        if (fragmentHostCallback == null) {
            return null;
        }
        return fragmentHostCallback.f38565g;
    }

    /* JADX INFO: renamed from: x0 */
    public void mo16512x0(Bundle bundle) {
        this.f38414K = true;
    }

    /* JADX INFO: renamed from: y */
    public int m16572y() {
        b bVar = this.f38419P;
        if (bVar == null) {
            return 0;
        }
        return bVar.f38456d;
    }

    /* JADX INFO: renamed from: y0 */
    public void mo16513y0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f38404A.m16668V();
        this.f38448w = true;
        this.f38426W = new FragmentViewLifecycleOwner(this, mo128o());
        View viewMo466f0 = mo466f0(layoutInflater, viewGroup, bundle);
        this.f38416M = viewMo466f0;
        if (viewMo466f0 == null) {
            if (this.f38426W.f38562i != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f38426W = null;
        } else {
            this.f38426W.m16616c();
            this.f38416M.setTag(R.id.view_tree_lifecycle_owner, this.f38426W);
            this.f38416M.setTag(R.id.view_tree_view_model_store_owner, this.f38426W);
            this.f38416M.setTag(R.id.view_tree_saved_state_registry_owner, this.f38426W);
            this.f38427X.mo427j(this.f38426W);
        }
    }

    /* JADX INFO: renamed from: z */
    public Object m16573z() {
        b bVar = this.f38419P;
        if (bVar == null) {
            return null;
        }
        Objects.requireNonNull(bVar);
        return null;
    }

    /* JADX INFO: renamed from: z0 */
    public void m16574z0() {
        this.f38404A.m16707w(1);
        if (this.f38416M != null) {
            FragmentViewLifecycleOwner fragmentViewLifecycleOwner = this.f38426W;
            fragmentViewLifecycleOwner.m16616c();
            if (fragmentViewLifecycleOwner.f38562i.f38705b.isAtLeast(Lifecycle3.b.CREATED)) {
                this.f38426W.m16615a(Lifecycle3.a.ON_DESTROY);
            }
        }
        this.f38432g = 1;
        this.f38414K = false;
        mo467h0();
        if (!this.f38414K) {
            throw new SuperNotCalledException(outline.m1597s("Fragment ", this, " did not call through to super.onDestroyView()"));
        }
        LoaderManagerImpl.c cVar = ((LoaderManagerImpl) LoaderManager.m16748b(this)).f38737b;
        int iM15620k = cVar.f38748d.m15620k();
        for (int i = 0; i < iM15620k; i++) {
            cVar.f38748d.m15621l(i).m16751m();
        }
        this.f38448w = false;
    }

    /* JADX INFO: renamed from: z0.p.c.m$f */
    /* JADX INFO: compiled from: Fragment.java */
    @SuppressLint({"BanParcelableUsage, ParcelClassLoader"})
    public static class f implements Parcelable {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* JADX INFO: renamed from: f */
        public final Bundle f38470f;

        /* JADX INFO: renamed from: z0.p.c.m$f$a */
        /* JADX INFO: compiled from: Fragment.java */
        public class a implements Parcelable.ClassLoaderCreator<f> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new f(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new f[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public f createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new f(parcel, classLoader);
            }
        }

        public f(Bundle bundle) {
            this.f38470f = bundle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeBundle(this.f38470f);
        }

        public f(Parcel parcel, ClassLoader classLoader) {
            Bundle bundle = parcel.readBundle();
            this.f38470f = bundle;
            if (classLoader == null || bundle == null) {
                return;
            }
            bundle.setClassLoader(classLoader);
        }
    }

    public Fragment(int i) {
        this();
        this.f38430a0 = i;
    }
}
