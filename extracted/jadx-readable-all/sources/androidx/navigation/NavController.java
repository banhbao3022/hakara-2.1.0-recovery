package androidx.navigation;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.lifecycle.LifecycleEventObserver;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p637a.OnBackPressedCallback;
import p636z0.p725k.C8162a;
import p636z0.p725k.p727d.ContextCompat;
import p636z0.p759s.Lifecycle3;
import p636z0.p759s.LifecycleObserver;
import p636z0.p759s.LifecycleOwner;
import p636z0.p759s.ViewModelStore;
import p636z0.p770y.ActivityNavigator;
import p636z0.p770y.FloatingWindow;
import p636z0.p770y.NavAction;
import p636z0.p770y.NavBackStackEntry;
import p636z0.p770y.NavBackStackEntryState;
import p636z0.p770y.NavControllerViewModel;
import p636z0.p770y.NavDeepLinkRequest;
import p636z0.p770y.NavDestination;
import p636z0.p770y.NavGraph;
import p636z0.p770y.NavGraphNavigator;
import p636z0.p770y.NavInflater;
import p636z0.p770y.NavOptions;
import p636z0.p770y.Navigator;
import p636z0.p770y.NavigatorProvider;

/* JADX INFO: loaded from: classes.dex */
public class NavController {

    /* JADX INFO: renamed from: a */
    public final Context f830a;

    /* JADX INFO: renamed from: b */
    public Activity f831b;

    /* JADX INFO: renamed from: c */
    public NavInflater f832c;

    /* JADX INFO: renamed from: d */
    public NavGraph f833d;

    /* JADX INFO: renamed from: e */
    public Bundle f834e;

    /* JADX INFO: renamed from: f */
    public Parcelable[] f835f;

    /* JADX INFO: renamed from: g */
    public boolean f836g;

    /* JADX INFO: renamed from: i */
    public LifecycleOwner f838i;

    /* JADX INFO: renamed from: j */
    public NavControllerViewModel f839j;

    /* JADX INFO: renamed from: h */
    public final Deque<NavBackStackEntry> f837h = new ArrayDeque();

    /* JADX INFO: renamed from: k */
    public NavigatorProvider f840k = new NavigatorProvider();

    /* JADX INFO: renamed from: l */
    public final CopyOnWriteArrayList<InterfaceC0136b> f841l = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: m */
    public final LifecycleObserver f842m = new LifecycleEventObserver() { // from class: androidx.navigation.NavController.1
        /* JADX WARN: Code duplicated, block: B:23:0x004d  */
        /* JADX WARN: Code duplicated, block: B:24:0x0050  */
        @Override // androidx.lifecycle.LifecycleEventObserver
        /* JADX INFO: renamed from: c */
        public void mo130c(LifecycleOwner lifecycleOwner, Lifecycle3.a aVar) {
            Lifecycle3.b bVar;
            NavController navController = NavController.this;
            if (navController.f833d != null) {
                for (NavBackStackEntry navBackStackEntry : navController.f837h) {
                    Objects.requireNonNull(navBackStackEntry);
                    int iOrdinal = aVar.ordinal();
                    if (iOrdinal == 0) {
                        bVar = Lifecycle3.b.CREATED;
                    } else if (iOrdinal == 1) {
                        bVar = Lifecycle3.b.STARTED;
                    } else if (iOrdinal == 2) {
                        bVar = Lifecycle3.b.RESUMED;
                    } else if (iOrdinal == 3) {
                        bVar = Lifecycle3.b.STARTED;
                    } else if (iOrdinal == 4) {
                        bVar = Lifecycle3.b.CREATED;
                    } else {
                        if (iOrdinal != 5) {
                            throw new IllegalArgumentException("Unexpected event value " + aVar);
                        }
                        bVar = Lifecycle3.b.DESTROYED;
                    }
                    navBackStackEntry.f39005l = bVar;
                    navBackStackEntry.m16903a();
                }
            }
        }
    };

    /* JADX INFO: renamed from: n */
    public final OnBackPressedCallback f843n = new C0135a(false);

    /* JADX INFO: renamed from: o */
    public boolean f844o = true;

    /* JADX INFO: renamed from: androidx.navigation.NavController$a */
    public class C0135a extends OnBackPressedCallback {
        public C0135a(boolean z) {
            super(z);
        }

        @Override // p636z0.p637a.OnBackPressedCallback
        /* JADX INFO: renamed from: a */
        public void mo455a() {
            NavController.this.m451f();
        }
    }

    /* JADX INFO: renamed from: androidx.navigation.NavController$b */
    public interface InterfaceC0136b {
        /* JADX INFO: renamed from: a */
        void mo456a(NavController navController, NavDestination navDestination, Bundle bundle);
    }

    public NavController(Context context) {
        this.f830a = context;
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                this.f831b = (Activity) context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        NavigatorProvider navigatorProvider = this.f840k;
        navigatorProvider.m16928a(new NavGraphNavigator(navigatorProvider));
        this.f840k.m16928a(new ActivityNavigator(this.f830a));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m446a() {
        while (!this.f837h.isEmpty() && (this.f837h.peekLast().f39000g instanceof NavGraph) && m452g(this.f837h.peekLast().f39000g.f39033h, true)) {
        }
        if (this.f837h.isEmpty()) {
            return false;
        }
        NavDestination navDestination = this.f837h.peekLast().f39000g;
        NavDestination navDestination2 = null;
        if (navDestination instanceof FloatingWindow) {
            Iterator<NavBackStackEntry> itDescendingIterator = this.f837h.descendingIterator();
            while (itDescendingIterator.hasNext()) {
                NavDestination navDestination3 = itDescendingIterator.next().f39000g;
                if (!(navDestination3 instanceof NavGraph) && !(navDestination3 instanceof FloatingWindow)) {
                    navDestination2 = navDestination3;
                    break;
                }
            }
        }
        HashMap map = new HashMap();
        Iterator<NavBackStackEntry> itDescendingIterator2 = this.f837h.descendingIterator();
        while (itDescendingIterator2.hasNext()) {
            NavBackStackEntry next = itDescendingIterator2.next();
            Lifecycle3.b bVar = next.f39006m;
            NavDestination navDestination4 = next.f39000g;
            if (navDestination != null && navDestination4.f39033h == navDestination.f39033h) {
                Lifecycle3.b bVar2 = Lifecycle3.b.RESUMED;
                if (bVar != bVar2) {
                    map.put(next, bVar2);
                }
                navDestination = navDestination.f39032g;
            } else if (navDestination2 == null || navDestination4.f39033h != navDestination2.f39033h) {
                next.f39006m = Lifecycle3.b.CREATED;
                next.m16903a();
            } else {
                if (bVar == Lifecycle3.b.RESUMED) {
                    next.f39006m = Lifecycle3.b.STARTED;
                    next.m16903a();
                } else {
                    Lifecycle3.b bVar3 = Lifecycle3.b.STARTED;
                    if (bVar != bVar3) {
                        map.put(next, bVar3);
                    }
                }
                navDestination2 = navDestination2.f39032g;
            }
        }
        for (NavBackStackEntry navBackStackEntry : this.f837h) {
            Lifecycle3.b bVar4 = (Lifecycle3.b) map.get(navBackStackEntry);
            if (bVar4 != null) {
                navBackStackEntry.f39006m = bVar4;
                navBackStackEntry.m16903a();
            } else {
                navBackStackEntry.m16903a();
            }
        }
        NavBackStackEntry navBackStackEntryPeekLast = this.f837h.peekLast();
        Iterator<InterfaceC0136b> it = this.f841l.iterator();
        while (it.hasNext()) {
            it.next().mo456a(this, navBackStackEntryPeekLast.f39000g, navBackStackEntryPeekLast.f39001h);
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public NavDestination m447b(int i) {
        NavGraph navGraph = this.f833d;
        if (navGraph == null) {
            return null;
        }
        if (navGraph.f39033h == i) {
            return navGraph;
        }
        NavDestination navDestination = this.f837h.isEmpty() ? this.f833d : this.f837h.getLast().f39000g;
        return (navDestination instanceof NavGraph ? (NavGraph) navDestination : navDestination.f39032g).m16914t(i, true);
    }

    /* JADX INFO: renamed from: c */
    public NavDestination m448c() {
        NavBackStackEntry last = this.f837h.isEmpty() ? null : this.f837h.getLast();
        if (last != null) {
            return last.f39000g;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0035 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0037  */
    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x005c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0066  */
    /* JADX WARN: Code duplicated, block: B:34:0x0087  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a8  */
    /* JADX WARN: Instruction removed from duplicated block: B:34:0x0087, please report this as an issue */
    /* JADX INFO: renamed from: d */
    public void m449d(int i, Bundle bundle, NavOptions navOptions) {
        int i2;
        Bundle bundle2;
        NavDestination navDestinationM447b;
        String strM16907h;
        int i3;
        NavDestination navDestination = this.f837h.isEmpty() ? this.f833d : this.f837h.getLast().f39000g;
        if (navDestination == null) {
            throw new IllegalStateException("no current navigation node");
        }
        NavAction navActionM16909f = navDestination.m16909f(i);
        if (navActionM16909f != null) {
            if (navOptions == null) {
                navOptions = navActionM16909f.f38989b;
            }
            i2 = navActionM16909f.f38988a;
            Bundle bundle3 = navActionM16909f.f38990c;
            if (bundle3 != null) {
                bundle2 = new Bundle();
                bundle2.putAll(bundle3);
            }
            if (bundle != null) {
                if (bundle2 == null) {
                    bundle2 = new Bundle();
                }
                bundle2.putAll(bundle);
            }
            if (i2 != 0 && navOptions != null && (i3 = navOptions.f39055b) != -1) {
                if (m452g(i3, navOptions.f39056c)) {
                    m446a();
                    return;
                }
                return;
            }
            if (i2 != 0) {
                throw new IllegalArgumentException("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo");
            }
            navDestinationM447b = m447b(i2);
            if (navDestinationM447b == null) {
                m450e(navDestinationM447b, bundle2, navOptions, null);
                return;
            }
            strM16907h = NavDestination.m16907h(this.f830a, i2);
            if (navActionM16909f != null) {
                StringBuilder sbM1562M = outline.m1562M("Navigation destination ", strM16907h, " referenced from action ");
                sbM1562M.append(NavDestination.m16907h(this.f830a, i));
                sbM1562M.append(" cannot be found from the current destination ");
                sbM1562M.append(navDestination);
                throw new IllegalArgumentException(sbM1562M.toString());
            }
            throw new IllegalArgumentException("Navigation action/destination " + strM16907h + " cannot be found from the current destination " + navDestination);
        }
        i2 = i;
        bundle2 = null;
        if (bundle != null) {
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            bundle2.putAll(bundle);
        }
        if (i2 != 0) {
        }
        if (i2 != 0) {
            throw new IllegalArgumentException("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo");
        }
        navDestinationM447b = m447b(i2);
        if (navDestinationM447b == null) {
            m450e(navDestinationM447b, bundle2, navOptions, null);
            return;
        }
        strM16907h = NavDestination.m16907h(this.f830a, i2);
        if (navActionM16909f != null) {
            StringBuilder sbM1562M2 = outline.m1562M("Navigation destination ", strM16907h, " referenced from action ");
            sbM1562M2.append(NavDestination.m16907h(this.f830a, i));
            sbM1562M2.append(" cannot be found from the current destination ");
            sbM1562M2.append(navDestination);
            throw new IllegalArgumentException(sbM1562M2.toString());
        }
        throw new IllegalArgumentException("Navigation action/destination " + strM16907h + " cannot be found from the current destination " + navDestination);
    }

    /* JADX INFO: renamed from: e */
    public final void m450e(NavDestination navDestination, Bundle bundle, NavOptions navOptions, Navigator.a aVar) {
        int i;
        boolean z = false;
        boolean zM452g = (navOptions == null || (i = navOptions.f39055b) == -1) ? false : m452g(i, navOptions.f39056c);
        Navigator navigatorM16930d = this.f840k.m16930d(navDestination.f39031f);
        Bundle bundleM16908c = navDestination.m16908c(bundle);
        NavDestination navDestinationMo458b = navigatorM16930d.mo458b(navDestination, bundleM16908c, navOptions, aVar);
        if (navDestinationMo458b != null) {
            if (!(navDestinationMo458b instanceof FloatingWindow)) {
                while (!this.f837h.isEmpty() && (this.f837h.peekLast().f39000g instanceof FloatingWindow) && m452g(this.f837h.peekLast().f39000g.f39033h, true)) {
                }
            }
            ArrayDeque arrayDeque = new ArrayDeque();
            if (navDestination instanceof NavGraph) {
                NavDestination navDestination2 = navDestinationMo458b;
                while (true) {
                    NavGraph navGraph = navDestination2.f39032g;
                    if (navGraph != null) {
                        arrayDeque.addFirst(new NavBackStackEntry(this.f830a, navGraph, bundleM16908c, this.f838i, this.f839j));
                        if (!this.f837h.isEmpty() && this.f837h.getLast().f39000g == navGraph) {
                            m452g(navGraph.f39033h, true);
                        }
                    }
                    if (navGraph == null || navGraph == navDestination) {
                        break;
                    } else {
                        navDestination2 = navGraph;
                    }
                }
            }
            NavDestination navDestination3 = arrayDeque.isEmpty() ? navDestinationMo458b : ((NavBackStackEntry) arrayDeque.getFirst()).f39000g;
            while (navDestination3 != null && m447b(navDestination3.f39033h) == null) {
                navDestination3 = navDestination3.f39032g;
                if (navDestination3 != null) {
                    arrayDeque.addFirst(new NavBackStackEntry(this.f830a, navDestination3, bundleM16908c, this.f838i, this.f839j));
                }
            }
            NavDestination navDestination4 = arrayDeque.isEmpty() ? navDestinationMo458b : ((NavBackStackEntry) arrayDeque.getLast()).f39000g;
            while (!this.f837h.isEmpty() && (this.f837h.getLast().f39000g instanceof NavGraph) && ((NavGraph) this.f837h.getLast().f39000g).m16914t(navDestination4.f39033h, false) == null && m452g(this.f837h.getLast().f39000g.f39033h, true)) {
            }
            this.f837h.addAll(arrayDeque);
            if (this.f837h.isEmpty() || this.f837h.getFirst().f39000g != this.f833d) {
                this.f837h.addFirst(new NavBackStackEntry(this.f830a, this.f833d, bundleM16908c, this.f838i, this.f839j));
            }
            this.f837h.add(new NavBackStackEntry(this.f830a, navDestinationMo458b, navDestinationMo458b.m16908c(bundleM16908c), this.f838i, this.f839j));
        } else if (navOptions != null && navOptions.f39054a) {
            NavBackStackEntry navBackStackEntryPeekLast = this.f837h.peekLast();
            if (navBackStackEntryPeekLast != null) {
                navBackStackEntryPeekLast.f39001h = bundleM16908c;
            }
            z = true;
        }
        m454i();
        if (zM452g || navDestinationMo458b != null || z) {
            m446a();
        }
    }

    /* JADX INFO: renamed from: f */
    public boolean m451f() {
        return !this.f837h.isEmpty() && m452g(m448c().f39033h, true) && m446a();
    }

    /* JADX INFO: renamed from: g */
    public boolean m452g(int i, boolean z) {
        boolean z2;
        boolean z3 = false;
        if (this.f837h.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<NavBackStackEntry> itDescendingIterator = this.f837h.descendingIterator();
        while (true) {
            if (!itDescendingIterator.hasNext()) {
                z2 = false;
                break;
            }
            NavDestination navDestination = itDescendingIterator.next().f39000g;
            Navigator navigatorM16930d = this.f840k.m16930d(navDestination.f39031f);
            if (z || navDestination.f39033h != i) {
                arrayList.add(navigatorM16930d);
            }
            if (navDestination.f39033h == i) {
                z2 = true;
                break;
            }
        }
        if (!z2) {
            Log.i("NavController", "Ignoring popBackStack to destination " + NavDestination.m16907h(this.f830a, i) + " as it was not found on the current back stack");
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext() && ((Navigator) it.next()).mo461e()) {
            NavBackStackEntry navBackStackEntryRemoveLast = this.f837h.removeLast();
            if (navBackStackEntryRemoveLast.f39002i.f38705b.isAtLeast(Lifecycle3.b.CREATED)) {
                navBackStackEntryRemoveLast.f39006m = Lifecycle3.b.DESTROYED;
                navBackStackEntryRemoveLast.m16903a();
            }
            NavControllerViewModel navControllerViewModel = this.f839j;
            if (navControllerViewModel != null) {
                ViewModelStore viewModelStoreRemove = navControllerViewModel.f39014d.remove(navBackStackEntryRemoveLast.f39004k);
                if (viewModelStoreRemove != null) {
                    viewModelStoreRemove.m16725a();
                }
            }
            z3 = true;
        }
        m454i();
        return z3;
    }

    /* JADX WARN: Code duplicated, block: B:156:0x0311  */
    /* JADX WARN: Code duplicated, block: B:159:0x0315  */
    /* JADX INFO: renamed from: h */
    public void m453h(int i, Bundle bundle) {
        boolean z;
        Activity activity;
        boolean z2;
        NavDestination.a aVarMo16910j;
        String strM16907h;
        NavGraph navGraph;
        NavDestination navDestinationM16913s;
        NavGraph navGraph2;
        ArrayList<String> stringArrayList;
        if (this.f832c == null) {
            this.f832c = new NavInflater(this.f830a, this.f840k);
        }
        NavGraph navGraphM16917c = this.f832c.m16917c(i);
        NavGraph navGraph3 = this.f833d;
        if (navGraph3 != null) {
            m452g(navGraph3.f39033h, true);
        }
        this.f833d = navGraphM16917c;
        Bundle bundle2 = this.f834e;
        if (bundle2 != null && (stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:navigatorState:names")) != null) {
            for (String str : stringArrayList) {
                Navigator navigatorM16930d = this.f840k.m16930d(str);
                Bundle bundle3 = this.f834e.getBundle(str);
                if (bundle3 != null) {
                    navigatorM16930d.mo459c(bundle3);
                }
            }
        }
        Parcelable[] parcelableArr = this.f835f;
        if (parcelableArr != null) {
            for (Parcelable parcelable : parcelableArr) {
                NavBackStackEntryState navBackStackEntryState = (NavBackStackEntryState) parcelable;
                NavDestination navDestinationM447b = m447b(navBackStackEntryState.f39010g);
                if (navDestinationM447b == null) {
                    StringBuilder sbM1562M = outline.m1562M("Restoring the Navigation back stack failed: destination ", NavDestination.m16907h(this.f830a, navBackStackEntryState.f39010g), " cannot be found from the current destination ");
                    sbM1562M.append(m448c());
                    throw new IllegalStateException(sbM1562M.toString());
                }
                Bundle bundle4 = navBackStackEntryState.f39011h;
                if (bundle4 != null) {
                    bundle4.setClassLoader(this.f830a.getClassLoader());
                }
                this.f837h.add(new NavBackStackEntry(this.f830a, navDestinationM447b, bundle4, this.f838i, this.f839j, navBackStackEntryState.f39009f, navBackStackEntryState.f39012i));
            }
            m454i();
            this.f835f = null;
        }
        if (this.f833d == null || !this.f837h.isEmpty()) {
            m446a();
            return;
        }
        if (!this.f836g && (activity = this.f831b) != null) {
            Intent intent = activity.getIntent();
            if (intent != null) {
                Bundle extras = intent.getExtras();
                int[] intArray = extras != null ? extras.getIntArray("android-support-nav:controller:deepLinkIds") : null;
                Bundle bundle5 = new Bundle();
                Bundle bundle6 = extras != null ? extras.getBundle("android-support-nav:controller:deepLinkExtras") : null;
                if (bundle6 != null) {
                    bundle5.putAll(bundle6);
                }
                if ((intArray == null || intArray.length == 0) && intent.getData() != null && (aVarMo16910j = this.f833d.mo16910j(new NavDeepLinkRequest(intent))) != null) {
                    NavDestination navDestination = aVarMo16910j.f39039f;
                    Objects.requireNonNull(navDestination);
                    ArrayDeque arrayDeque = new ArrayDeque();
                    NavDestination navDestination2 = navDestination;
                    while (true) {
                        NavGraph navGraph4 = navDestination2.f39032g;
                        if (navGraph4 == null || navGraph4.f39045o != navDestination2.f39033h) {
                            arrayDeque.addFirst(navDestination2);
                        }
                        if (navGraph4 == null) {
                            break;
                        } else {
                            navDestination2 = navGraph4;
                        }
                    }
                    intArray = new int[arrayDeque.size()];
                    Iterator it = arrayDeque.iterator();
                    int i2 = 0;
                    while (it.hasNext()) {
                        intArray[i2] = ((NavDestination) it.next()).f39033h;
                        i2++;
                    }
                    bundle5.putAll(navDestination.m16908c(aVarMo16910j.f39040g));
                }
                if (intArray == null || intArray.length == 0) {
                    z2 = false;
                } else {
                    NavGraph navGraph5 = this.f833d;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= intArray.length) {
                            strM16907h = null;
                            break;
                        }
                        int i4 = intArray[i3];
                        if (i3 == 0) {
                            navDestinationM16913s = this.f833d;
                            if (navDestinationM16913s.f39033h != i4) {
                                navDestinationM16913s = null;
                            }
                        } else {
                            navDestinationM16913s = navGraph5.m16913s(i4);
                        }
                        if (navDestinationM16913s == null) {
                            strM16907h = NavDestination.m16907h(this.f830a, i4);
                            break;
                        }
                        if (i3 != intArray.length - 1) {
                            while (true) {
                                navGraph2 = (NavGraph) navDestinationM16913s;
                                if (!(navGraph2.m16913s(navGraph2.f39045o) instanceof NavGraph)) {
                                    break;
                                } else {
                                    navDestinationM16913s = navGraph2.m16913s(navGraph2.f39045o);
                                }
                            }
                            navGraph5 = navGraph2;
                        }
                        i3++;
                    }
                    if (strM16907h != null) {
                        Log.i("NavController", "Could not find destination " + strM16907h + " in the navigation graph, ignoring the deep link from " + intent);
                        z2 = false;
                    } else {
                        bundle5.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
                        int flags = intent.getFlags();
                        int i5 = 268435456 & flags;
                        if (i5 != 0 && (flags & 32768) == 0) {
                            intent.addFlags(32768);
                            Context context = this.f830a;
                            ArrayList arrayList = new ArrayList();
                            ComponentName component = intent.getComponent();
                            if (component == null) {
                                component = intent.resolveActivity(context.getPackageManager());
                            }
                            if (component != null) {
                                int size = arrayList.size();
                                try {
                                    for (Intent intentM16081z = C8162a.m16081z(context, component); intentM16081z != null; intentM16081z = C8162a.m16081z(context, intentM16081z.getComponent())) {
                                        arrayList.add(size, intentM16081z);
                                    }
                                } catch (PackageManager.NameNotFoundException e) {
                                    Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                                    throw new IllegalArgumentException(e);
                                }
                            }
                            arrayList.add(intent);
                            if (arrayList.isEmpty()) {
                                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
                            }
                            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
                            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                            Object obj = ContextCompat.f37815a;
                            ContextCompat.a.m16135a(context, intentArr, null);
                            Activity activity2 = this.f831b;
                            if (activity2 != null) {
                                activity2.finish();
                                this.f831b.overridePendingTransition(0, 0);
                            }
                        } else if (i5 != 0) {
                            if (!this.f837h.isEmpty()) {
                                m452g(this.f833d.f39033h, true);
                            }
                            int i6 = 0;
                            while (i6 < intArray.length) {
                                int i7 = i6 + 1;
                                int i8 = intArray[i6];
                                NavDestination navDestinationM447b2 = m447b(i8);
                                if (navDestinationM447b2 == null) {
                                    StringBuilder sbM1562M2 = outline.m1562M("Deep Linking failed: destination ", NavDestination.m16907h(this.f830a, i8), " cannot be found from the current destination ");
                                    sbM1562M2.append(m448c());
                                    throw new IllegalStateException(sbM1562M2.toString());
                                }
                                NavOptions.a aVar = new NavOptions.a();
                                aVar.f39064d = 0;
                                aVar.f39065e = 0;
                                m450e(navDestinationM447b2, bundle5, aVar.m16919a(), null);
                                i6 = i7;
                            }
                        } else {
                            NavGraph navGraph6 = this.f833d;
                            int i9 = 0;
                            while (i9 < intArray.length) {
                                int i10 = intArray[i9];
                                NavDestination navDestinationM16913s2 = i9 == 0 ? this.f833d : navGraph6.m16913s(i10);
                                if (navDestinationM16913s2 == null) {
                                    throw new IllegalStateException("Deep Linking failed: destination " + NavDestination.m16907h(this.f830a, i10) + " cannot be found in graph " + navGraph6);
                                }
                                if (i9 != intArray.length - 1) {
                                    while (true) {
                                        navGraph = (NavGraph) navDestinationM16913s2;
                                        if (!(navGraph.m16913s(navGraph.f39045o) instanceof NavGraph)) {
                                            break;
                                        } else {
                                            navDestinationM16913s2 = navGraph.m16913s(navGraph.f39045o);
                                        }
                                    }
                                    navGraph6 = navGraph;
                                } else {
                                    Bundle bundleM16908c = navDestinationM16913s2.m16908c(bundle5);
                                    NavOptions.a aVar2 = new NavOptions.a();
                                    aVar2.f39062b = this.f833d.f39033h;
                                    aVar2.f39063c = true;
                                    aVar2.f39064d = 0;
                                    aVar2.f39065e = 0;
                                    m450e(navDestinationM16913s2, bundleM16908c, aVar2.m16919a(), null);
                                }
                                i9++;
                            }
                            this.f836g = true;
                        }
                        z2 = true;
                    }
                }
            } else {
                z2 = false;
            }
            z = z2;
        }
        if (z) {
            return;
        }
        m450e(this.f833d, bundle, null, null);
    }

    /* JADX INFO: renamed from: i */
    public final void m454i() {
        OnBackPressedCallback onBackPressedCallback = this.f843n;
        boolean z = false;
        if (this.f844o) {
            Iterator<NavBackStackEntry> it = this.f837h.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (!(it.next().f39000g instanceof NavGraph)) {
                    i++;
                }
            }
            if (i > 1) {
                z = true;
            }
        }
        onBackPressedCallback.f34167a = z;
    }
}
