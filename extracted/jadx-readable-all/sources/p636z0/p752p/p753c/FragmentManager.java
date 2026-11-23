package p636z0.p752p.p753c;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.FragmentContainerView;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import mtp.media.karaoke.R;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p637a.OnBackPressedCallback;
import p636z0.p637a.OnBackPressedDispatcherOwner;
import p636z0.p637a.p639e.ActivityResult;
import p636z0.p637a.p639e.ActivityResultCallback;
import p636z0.p637a.p639e.ActivityResultLauncher;
import p636z0.p637a.p639e.ActivityResultRegistry;
import p636z0.p637a.p639e.ActivityResultRegistryOwner;
import p636z0.p637a.p639e.IntentSenderRequest;
import p636z0.p637a.p639e.p640g.ActivityResultContract;
import p636z0.p637a.p639e.p640g.ActivityResultContracts;
import p636z0.p637a.p639e.p640g.ActivityResultContracts2;
import p636z0.p725k.p735h.CancellationSignal;
import p636z0.p752p.C8310a;
import p636z0.p759s.Lifecycle3;
import p636z0.p759s.LifecycleOwner;
import p636z0.p759s.ViewModelProvider2;
import p636z0.p759s.ViewModelStoreOwner;

/* JADX INFO: renamed from: z0.p.c.z, reason: use source file name */
/* JADX INFO: compiled from: FragmentManager.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class FragmentManager {

    /* JADX INFO: renamed from: A */
    public boolean f38604A;

    /* JADX INFO: renamed from: B */
    public boolean f38605B;

    /* JADX INFO: renamed from: C */
    public boolean f38606C;

    /* JADX INFO: renamed from: D */
    public boolean f38607D;

    /* JADX INFO: renamed from: E */
    public boolean f38608E;

    /* JADX INFO: renamed from: F */
    public ArrayList<BackStackRecord> f38609F;

    /* JADX INFO: renamed from: G */
    public ArrayList<Boolean> f38610G;

    /* JADX INFO: renamed from: H */
    public ArrayList<Fragment> f38611H;

    /* JADX INFO: renamed from: I */
    public ArrayList<o> f38612I;

    /* JADX INFO: renamed from: J */
    public FragmentManagerViewModel f38613J;

    /* JADX INFO: renamed from: b */
    public boolean f38616b;

    /* JADX INFO: renamed from: d */
    public ArrayList<BackStackRecord> f38618d;

    /* JADX INFO: renamed from: e */
    public ArrayList<Fragment> f38619e;

    /* JADX INFO: renamed from: g */
    public OnBackPressedDispatcher f38621g;

    /* JADX INFO: renamed from: q */
    public FragmentHostCallback<?> f38631q;

    /* JADX INFO: renamed from: r */
    public FragmentContainer f38632r;

    /* JADX INFO: renamed from: s */
    public Fragment f38633s;

    /* JADX INFO: renamed from: t */
    public Fragment f38634t;

    /* JADX INFO: renamed from: w */
    public ActivityResultLauncher<Intent> f38637w;

    /* JADX INFO: renamed from: x */
    public ActivityResultLauncher<IntentSenderRequest> f38638x;

    /* JADX INFO: renamed from: y */
    public ActivityResultLauncher<String[]> f38639y;

    /* JADX INFO: renamed from: a */
    public final ArrayList<m> f38615a = new ArrayList<>();

    /* JADX INFO: renamed from: c */
    public final FragmentStore f38617c = new FragmentStore();

    /* JADX INFO: renamed from: f */
    public final FragmentLayoutInflaterFactory f38620f = new FragmentLayoutInflaterFactory(this);

    /* JADX INFO: renamed from: h */
    public final OnBackPressedCallback f38622h = new c(false);

    /* JADX INFO: renamed from: i */
    public final AtomicInteger f38623i = new AtomicInteger();

    /* JADX INFO: renamed from: j */
    public final Map<String, Bundle> f38624j = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: k */
    public final Map<String, ?> f38625k = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: l */
    public Map<Fragment, HashSet<CancellationSignal>> f38626l = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: m */
    public final FragmentTransition7.a f38627m = new d();

    /* JADX INFO: renamed from: n */
    public final FragmentLifecycleCallbacksDispatcher f38628n = new FragmentLifecycleCallbacksDispatcher(this);

    /* JADX INFO: renamed from: o */
    public final CopyOnWriteArrayList<FragmentOnAttachListener> f38629o = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: p */
    public int f38630p = -1;

    /* JADX INFO: renamed from: u */
    public FragmentFactory f38635u = new e();

    /* JADX INFO: renamed from: v */
    public SpecialEffectsControllerFactory f38636v = new f(this);

    /* JADX INFO: renamed from: z */
    public ArrayDeque<l> f38640z = new ArrayDeque<>();

    /* JADX INFO: renamed from: K */
    public Runnable f38614K = new g();

    /* JADX INFO: renamed from: z0.p.c.z$a */
    /* JADX INFO: compiled from: FragmentManager.java */
    public class a implements ActivityResultCallback<ActivityResult> {
        public a() {
        }

        @Override // p636z0.p637a.p639e.ActivityResultCallback
        /* JADX INFO: renamed from: a */
        public void mo14492a(ActivityResult activityResult) {
            ActivityResult activityResult2 = activityResult;
            l lVarPollFirst = FragmentManager.this.f38640z.pollFirst();
            if (lVarPollFirst == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = lVarPollFirst.f38649f;
            int i = lVarPollFirst.f38650g;
            Fragment fragmentM16497e = FragmentManager.this.f38617c.m16497e(str);
            if (fragmentM16497e == null) {
                outline.m1567R("Intent Sender result delivered for unknown Fragment ", str, "FragmentManager");
            } else {
                fragmentM16497e.mo2588X(i, activityResult2.f34171f, activityResult2.f34172g);
            }
        }
    }

    /* JADX INFO: renamed from: z0.p.c.z$b */
    /* JADX INFO: compiled from: FragmentManager.java */
    public class b implements ActivityResultCallback<Map<String, Boolean>> {
        public b() {
        }

        @Override // p636z0.p637a.p639e.ActivityResultCallback
        @SuppressLint({"SyntheticAccessor"})
        /* JADX INFO: renamed from: a */
        public void mo14492a(Map<String, Boolean> map) {
            Map<String, Boolean> map2 = map;
            String[] strArr = (String[]) map2.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map2.values());
            int[] iArr = new int[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
            }
            l lVarPollFirst = FragmentManager.this.f38640z.pollFirst();
            if (lVarPollFirst == null) {
                Log.w("FragmentManager", "No permissions were requested for " + this);
                return;
            }
            String str = lVarPollFirst.f38649f;
            int i2 = lVarPollFirst.f38650g;
            Fragment fragmentM16497e = FragmentManager.this.f38617c.m16497e(str);
            if (fragmentM16497e == null) {
                outline.m1567R("Permission request result delivered for unknown Fragment ", str, "FragmentManager");
            } else {
                fragmentM16497e.mo2075r0(i2, strArr, iArr);
            }
        }
    }

    /* JADX INFO: renamed from: z0.p.c.z$c */
    /* JADX INFO: compiled from: FragmentManager.java */
    public class c extends OnBackPressedCallback {
        public c(boolean z) {
            super(z);
        }

        @Override // p636z0.p637a.OnBackPressedCallback
        /* JADX INFO: renamed from: a */
        public void mo455a() {
            FragmentManager fragmentManager = FragmentManager.this;
            fragmentManager.m16650C(true);
            if (fragmentManager.f38622h.f34167a) {
                fragmentManager.m16670X();
            } else {
                fragmentManager.f38621g.m133b();
            }
        }
    }

    /* JADX INFO: renamed from: z0.p.c.z$d */
    /* JADX INFO: compiled from: FragmentManager.java */
    public class d implements FragmentTransition7.a {
        public d() {
        }

        /* JADX INFO: renamed from: a */
        public void m16711a(Fragment fragment, CancellationSignal cancellationSignal) {
            boolean z;
            synchronized (cancellationSignal) {
                z = cancellationSignal.f37890a;
            }
            if (z) {
                return;
            }
            FragmentManager fragmentManager = FragmentManager.this;
            HashSet<CancellationSignal> hashSet = fragmentManager.f38626l.get(fragment);
            if (hashSet != null && hashSet.remove(cancellationSignal) && hashSet.isEmpty()) {
                fragmentManager.f38626l.remove(fragment);
                if (fragment.f38432g < 5) {
                    fragmentManager.m16689i(fragment);
                    fragmentManager.m16667U(fragment, fragmentManager.f38630p);
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public void m16712b(Fragment fragment, CancellationSignal cancellationSignal) {
            FragmentManager fragmentManager = FragmentManager.this;
            if (fragmentManager.f38626l.get(fragment) == null) {
                fragmentManager.f38626l.put(fragment, new HashSet<>());
            }
            fragmentManager.f38626l.get(fragment).add(cancellationSignal);
        }
    }

    /* JADX INFO: renamed from: z0.p.c.z$e */
    /* JADX INFO: compiled from: FragmentManager.java */
    public class e extends FragmentFactory {
        public e() {
        }

        @Override // p636z0.p752p.p753c.FragmentFactory
        /* JADX INFO: renamed from: a */
        public Fragment mo16614a(ClassLoader classLoader, String str) {
            FragmentHostCallback<?> fragmentHostCallback = FragmentManager.this.f38631q;
            Context context = fragmentHostCallback.f38565g;
            Objects.requireNonNull(fragmentHostCallback);
            Object obj = Fragment.f38403f;
            try {
                return FragmentFactory.m16613c(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (IllegalAccessException e) {
                throw new Fragment.c(outline.m1600v("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
            } catch (InstantiationException e2) {
                throw new Fragment.c(outline.m1600v("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
            } catch (NoSuchMethodException e3) {
                throw new Fragment.c(outline.m1600v("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
            } catch (InvocationTargetException e4) {
                throw new Fragment.c(outline.m1600v("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
            }
        }
    }

    /* JADX INFO: renamed from: z0.p.c.z$f */
    /* JADX INFO: compiled from: FragmentManager.java */
    public class f implements SpecialEffectsControllerFactory {
        public f(FragmentManager fragmentManager) {
        }
    }

    /* JADX INFO: renamed from: z0.p.c.z$g */
    /* JADX INFO: compiled from: FragmentManager.java */
    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentManager.this.m16650C(true);
        }
    }

    /* JADX INFO: renamed from: z0.p.c.z$h */
    /* JADX INFO: compiled from: FragmentManager.java */
    public class h implements FragmentOnAttachListener {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ Fragment f38647f;

        public h(FragmentManager fragmentManager, Fragment fragment) {
            this.f38647f = fragment;
        }

        @Override // p636z0.p752p.p753c.FragmentOnAttachListener
        /* JADX INFO: renamed from: a */
        public void mo16472a(FragmentManager fragmentManager, Fragment fragment) {
            this.f38647f.mo464a0(fragment);
        }
    }

    /* JADX INFO: renamed from: z0.p.c.z$i */
    /* JADX INFO: compiled from: FragmentManager.java */
    public class i implements ActivityResultCallback<ActivityResult> {
        public i() {
        }

        @Override // p636z0.p637a.p639e.ActivityResultCallback
        /* JADX INFO: renamed from: a */
        public void mo14492a(ActivityResult activityResult) {
            ActivityResult activityResult2 = activityResult;
            l lVarPollFirst = FragmentManager.this.f38640z.pollFirst();
            if (lVarPollFirst == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = lVarPollFirst.f38649f;
            int i = lVarPollFirst.f38650g;
            Fragment fragmentM16497e = FragmentManager.this.f38617c.m16497e(str);
            if (fragmentM16497e == null) {
                outline.m1567R("Activity result delivered for unknown Fragment ", str, "FragmentManager");
            } else {
                fragmentM16497e.mo2588X(i, activityResult2.f34171f, activityResult2.f34172g);
            }
        }
    }

    /* JADX INFO: renamed from: z0.p.c.z$j */
    /* JADX INFO: compiled from: FragmentManager.java */
    public static class j extends ActivityResultContract<IntentSenderRequest, ActivityResult> {
        @Override // p636z0.p637a.p639e.p640g.ActivityResultContract
        /* JADX INFO: renamed from: a */
        public Intent mo14498a(Context context, IntentSenderRequest intentSenderRequest) {
            Bundle bundleExtra;
            IntentSenderRequest intentSenderRequest2 = intentSenderRequest;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent intent2 = intentSenderRequest2.f34188g;
            if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    IntentSenderRequest.b bVar = new IntentSenderRequest.b(intentSenderRequest2.f34187f);
                    bVar.f34192b = null;
                    int i = intentSenderRequest2.f34190i;
                    int i2 = intentSenderRequest2.f34189h;
                    bVar.f34194d = i;
                    bVar.f34193c = i2;
                    intentSenderRequest2 = new IntentSenderRequest(bVar.f34191a, null, i2, i);
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest2);
            if (FragmentManager.m16647O(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // p636z0.p637a.p639e.p640g.ActivityResultContract
        /* JADX INFO: renamed from: c */
        public ActivityResult mo14500c(int i, Intent intent) {
            return new ActivityResult(i, intent);
        }
    }

    /* JADX INFO: renamed from: z0.p.c.z$k */
    /* JADX INFO: compiled from: FragmentManager.java */
    public static abstract class k {
        /* JADX INFO: renamed from: a */
        public void mo15863a(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
        }
    }

    /* JADX INFO: renamed from: z0.p.c.z$m */
    /* JADX INFO: compiled from: FragmentManager.java */
    public interface m {
        /* JADX INFO: renamed from: a */
        boolean mo16443a(ArrayList<BackStackRecord> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* JADX INFO: renamed from: z0.p.c.z$n */
    /* JADX INFO: compiled from: FragmentManager.java */
    public class n implements m {

        /* JADX INFO: renamed from: a */
        public final String f38651a;

        /* JADX INFO: renamed from: b */
        public final int f38652b;

        /* JADX INFO: renamed from: c */
        public final int f38653c;

        public n(String str, int i, int i2) {
            this.f38651a = str;
            this.f38652b = i;
            this.f38653c = i2;
        }

        @Override // p636z0.p752p.p753c.FragmentManager.m
        /* JADX INFO: renamed from: a */
        public boolean mo16443a(ArrayList<BackStackRecord> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = FragmentManager.this.f38634t;
            if (fragment == null || this.f38652b >= 0 || this.f38651a != null || !fragment.m16570w().m16670X()) {
                return FragmentManager.this.m16671Y(arrayList, arrayList2, this.f38651a, this.f38652b, this.f38653c);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: z0.p.c.z$o */
    /* JADX INFO: compiled from: FragmentManager.java */
    public static class o implements Fragment.e {

        /* JADX INFO: renamed from: a */
        public final boolean f38655a;

        /* JADX INFO: renamed from: b */
        public final BackStackRecord f38656b;

        /* JADX INFO: renamed from: c */
        public int f38657c;

        /* JADX INFO: renamed from: a */
        public void m16713a() {
            boolean z = this.f38657c > 0;
            for (Fragment fragment : this.f38656b.f38261q.m16659L()) {
                fragment.m16547Q0(null);
                if (z && fragment.m16554U()) {
                    fragment.m16557V0();
                }
            }
            BackStackRecord backStackRecord = this.f38656b;
            backStackRecord.f38261q.m16685g(backStackRecord, this.f38655a, !z, true);
        }
    }

    /* JADX INFO: renamed from: O */
    public static boolean m16647O(int i2) {
        return Log.isLoggable("FragmentManager", i2);
    }

    /* JADX INFO: renamed from: A */
    public void m16648A(m mVar, boolean z) {
        if (!z) {
            if (this.f38631q == null) {
                if (!this.f38607D) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (m16665S()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f38615a) {
            if (this.f38631q == null) {
                if (!z) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
            } else {
                this.f38615a.add(mVar);
                m16680d0();
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m16649B(boolean z) {
        if (this.f38616b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f38631q == null) {
            if (!this.f38607D) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f38631q.f38566h.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z && m16665S()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f38609F == null) {
            this.f38609F = new ArrayList<>();
            this.f38610G = new ArrayList<>();
        }
        this.f38616b = true;
        try {
            m16653F(null, null);
        } finally {
            this.f38616b = false;
        }
    }

    /* JADX INFO: renamed from: C */
    public boolean m16650C(boolean z) {
        boolean zMo16443a;
        m16649B(z);
        boolean z2 = false;
        while (true) {
            ArrayList<BackStackRecord> arrayList = this.f38609F;
            ArrayList<Boolean> arrayList2 = this.f38610G;
            synchronized (this.f38615a) {
                if (this.f38615a.isEmpty()) {
                    zMo16443a = false;
                } else {
                    int size = this.f38615a.size();
                    zMo16443a = false;
                    for (int i2 = 0; i2 < size; i2++) {
                        zMo16443a |= this.f38615a.get(i2).mo16443a(arrayList, arrayList2);
                    }
                    this.f38615a.clear();
                    this.f38631q.f38566h.removeCallbacks(this.f38614K);
                }
            }
            if (!zMo16443a) {
                m16696l0();
                m16708x();
                this.f38617c.m16494b();
                return z2;
            }
            this.f38616b = true;
            try {
                m16674a0(this.f38609F, this.f38610G);
                m16681e();
                z2 = true;
            } catch (Throwable th) {
                m16681e();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: D */
    public void m16651D(m mVar, boolean z) {
        if (z && (this.f38631q == null || this.f38607D)) {
            return;
        }
        m16649B(z);
        ((BackStackRecord) mVar).mo16443a(this.f38609F, this.f38610G);
        this.f38616b = true;
        try {
            m16674a0(this.f38609F, this.f38610G);
            m16681e();
            m16696l0();
            m16708x();
            this.f38617c.m16494b();
        } catch (Throwable th) {
            m16681e();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0114  */
    /* JADX WARN: Code duplicated, block: B:59:0x014c  */
    /* JADX INFO: renamed from: E */
    public final void m16652E(ArrayList<BackStackRecord> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        ViewGroup viewGroup;
        int i4;
        boolean z = arrayList.get(i2).f38367p;
        ArrayList<Fragment> arrayList3 = this.f38611H;
        if (arrayList3 == null) {
            this.f38611H = new ArrayList<>();
        } else {
            arrayList3.clear();
        }
        this.f38611H.addAll(this.f38617c.m16501i());
        Fragment fragment = this.f38634t;
        int i5 = i2;
        boolean z2 = false;
        while (true) {
            int i6 = 1;
            if (i5 >= i3) {
                this.f38611H.clear();
                if (!z && this.f38630p >= 1) {
                    for (int i7 = i2; i7 < i3; i7++) {
                        Iterator<FragmentTransaction.a> it = arrayList.get(i7).f38352a.iterator();
                        while (it.hasNext()) {
                            Fragment fragment2 = it.next().f38369b;
                            if (fragment2 != null && fragment2.f38450y != null) {
                                this.f38617c.m16502j(m16687h(fragment2));
                            }
                        }
                    }
                }
                int i8 = i2;
                while (i8 < i3) {
                    BackStackRecord backStackRecord = arrayList.get(i8);
                    if (arrayList2.get(i8).booleanValue()) {
                        backStackRecord.m16453n(-1);
                        backStackRecord.m16458s(i8 == i3 + (-1));
                    } else {
                        backStackRecord.m16453n(1);
                        backStackRecord.m16457r();
                    }
                    i8++;
                }
                boolean zBooleanValue = arrayList2.get(i3 - 1).booleanValue();
                for (int i9 = i2; i9 < i3; i9++) {
                    BackStackRecord backStackRecord2 = arrayList.get(i9);
                    if (zBooleanValue) {
                        for (int size = backStackRecord2.f38352a.size() - 1; size >= 0; size--) {
                            Fragment fragment3 = backStackRecord2.f38352a.get(size).f38369b;
                            if (fragment3 != null) {
                                m16687h(fragment3).m16485k();
                            }
                        }
                    } else {
                        Iterator<FragmentTransaction.a> it2 = backStackRecord2.f38352a.iterator();
                        while (it2.hasNext()) {
                            Fragment fragment4 = it2.next().f38369b;
                            if (fragment4 != null) {
                                m16687h(fragment4).m16485k();
                            }
                        }
                    }
                }
                m16666T(this.f38630p, true);
                HashSet<SpecialEffectsController> hashSet = new HashSet();
                for (int i10 = i2; i10 < i3; i10++) {
                    Iterator<FragmentTransaction.a> it3 = arrayList.get(i10).f38352a.iterator();
                    while (it3.hasNext()) {
                        Fragment fragment5 = it3.next().f38369b;
                        if (fragment5 != null && (viewGroup = fragment5.f38415L) != null) {
                            hashSet.add(SpecialEffectsController.m16619g(viewGroup, m16660M()));
                        }
                    }
                }
                for (SpecialEffectsController specialEffectsController : hashSet) {
                    specialEffectsController.f38576d = zBooleanValue;
                    specialEffectsController.m16624h();
                    specialEffectsController.m16621c();
                }
                for (int i11 = i2; i11 < i3; i11++) {
                    BackStackRecord backStackRecord3 = arrayList.get(i11);
                    if (arrayList2.get(i11).booleanValue() && backStackRecord3.f38263s >= 0) {
                        backStackRecord3.f38263s = -1;
                    }
                    Objects.requireNonNull(backStackRecord3);
                }
                return;
            }
            BackStackRecord backStackRecord4 = arrayList.get(i5);
            int i12 = 3;
            if (arrayList2.get(i5).booleanValue()) {
                int i13 = 1;
                ArrayList<Fragment> arrayList4 = this.f38611H;
                int size2 = backStackRecord4.f38352a.size() - 1;
                while (size2 >= 0) {
                    FragmentTransaction.a aVar = backStackRecord4.f38352a.get(size2);
                    int i14 = aVar.f38368a;
                    if (i14 != i13) {
                        if (i14 != 3) {
                            switch (i14) {
                                case 6:
                                    arrayList4.add(aVar.f38369b);
                                    break;
                                case 8:
                                    fragment = null;
                                    break;
                                case 9:
                                    fragment = aVar.f38369b;
                                    break;
                                case 10:
                                    aVar.f38375h = aVar.f38374g;
                                    break;
                            }
                        } else {
                            arrayList4.add(aVar.f38369b);
                        }
                        size2--;
                        i13 = 1;
                    }
                    arrayList4.remove(aVar.f38369b);
                    size2--;
                    i13 = 1;
                }
            } else {
                ArrayList<Fragment> arrayList5 = this.f38611H;
                int i15 = 0;
                while (i15 < backStackRecord4.f38352a.size()) {
                    FragmentTransaction.a aVar2 = backStackRecord4.f38352a.get(i15);
                    int i16 = aVar2.f38368a;
                    if (i16 == i6) {
                        i4 = 1;
                        arrayList5.add(aVar2.f38369b);
                    } else if (i16 != 2) {
                        if (i16 == i12 || i16 == 6) {
                            arrayList5.remove(aVar2.f38369b);
                            Fragment fragment6 = aVar2.f38369b;
                            if (fragment6 == fragment) {
                                backStackRecord4.f38352a.add(i15, new FragmentTransaction.a(9, fragment6));
                                i15++;
                                i4 = 1;
                                fragment = null;
                            }
                        } else if (i16 == 7) {
                            i4 = 1;
                            arrayList5.add(aVar2.f38369b);
                        } else if (i16 == 8) {
                            backStackRecord4.f38352a.add(i15, new FragmentTransaction.a(9, fragment));
                            i15++;
                            fragment = aVar2.f38369b;
                        }
                        i4 = 1;
                    } else {
                        Fragment fragment7 = aVar2.f38369b;
                        int i17 = fragment7.f38407D;
                        int size3 = arrayList5.size() - 1;
                        boolean z3 = false;
                        while (size3 >= 0) {
                            Fragment fragment8 = arrayList5.get(size3);
                            if (fragment8.f38407D != i17) {
                                i17 = i17;
                            } else if (fragment8 == fragment7) {
                                i17 = i17;
                                z3 = true;
                            } else {
                                if (fragment8 == fragment) {
                                    backStackRecord4.f38352a.add(i15, new FragmentTransaction.a(9, fragment8));
                                    i15++;
                                    fragment = null;
                                }
                                FragmentTransaction.a aVar3 = new FragmentTransaction.a(3, fragment8);
                                aVar3.f38370c = aVar2.f38370c;
                                aVar3.f38372e = aVar2.f38372e;
                                aVar3.f38371d = aVar2.f38371d;
                                aVar3.f38373f = aVar2.f38373f;
                                backStackRecord4.f38352a.add(i15, aVar3);
                                arrayList5.remove(fragment8);
                                i15++;
                            }
                            size3--;
                            i17 = i17;
                        }
                        if (z3) {
                            backStackRecord4.f38352a.remove(i15);
                            i15--;
                            i4 = 1;
                        } else {
                            i4 = 1;
                            aVar2.f38368a = 1;
                            arrayList5.add(fragment7);
                        }
                    }
                    i15 += i4;
                    i6 = 1;
                    i12 = 3;
                }
            }
            z2 = z2 || backStackRecord4.f38358g;
            i5++;
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m16653F(ArrayList<BackStackRecord> arrayList, ArrayList<Boolean> arrayList2) {
        int iIndexOf;
        int iIndexOf2;
        ArrayList<o> arrayList3 = this.f38612I;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i2 = 0;
        while (i2 < size) {
            o oVar = this.f38612I.get(i2);
            if (arrayList == null || oVar.f38655a || (iIndexOf2 = arrayList.indexOf(oVar.f38656b)) == -1 || arrayList2 == null || !arrayList2.get(iIndexOf2).booleanValue()) {
                if ((oVar.f38657c == 0) || (arrayList != null && oVar.f38656b.m16460u(arrayList, 0, arrayList.size()))) {
                    this.f38612I.remove(i2);
                    i2--;
                    size--;
                    if (arrayList == null || oVar.f38655a || (iIndexOf = arrayList.indexOf(oVar.f38656b)) == -1 || arrayList2 == null || !arrayList2.get(iIndexOf).booleanValue()) {
                        oVar.m16713a();
                    } else {
                        BackStackRecord backStackRecord = oVar.f38656b;
                        backStackRecord.f38261q.m16685g(backStackRecord, oVar.f38655a, false, false);
                    }
                }
            } else {
                this.f38612I.remove(i2);
                i2--;
                size--;
                BackStackRecord backStackRecord2 = oVar.f38656b;
                backStackRecord2.f38261q.m16685g(backStackRecord2, oVar.f38655a, false, false);
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: G */
    public Fragment m16654G(String str) {
        return this.f38617c.m16496d(str);
    }

    /* JADX INFO: renamed from: H */
    public Fragment m16655H(int i2) {
        FragmentStore fragmentStore = this.f38617c;
        int size = fragmentStore.f38348a.size();
        while (true) {
            size--;
            if (size < 0) {
                for (FragmentStateManager fragmentStateManager : fragmentStore.f38349b.values()) {
                    if (fragmentStateManager != null) {
                        Fragment fragment = fragmentStateManager.f38341c;
                        if (fragment.f38406C == i2) {
                            return fragment;
                        }
                    }
                }
                return null;
            }
            Fragment fragment2 = fragmentStore.f38348a.get(size);
            if (fragment2 != null && fragment2.f38406C == i2) {
                return fragment2;
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public Fragment m16656I(String str) {
        FragmentStore fragmentStore = this.f38617c;
        Objects.requireNonNull(fragmentStore);
        if (str != null) {
            int size = fragmentStore.f38348a.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                Fragment fragment = fragmentStore.f38348a.get(size);
                if (fragment != null && str.equals(fragment.f38408E)) {
                    return fragment;
                }
            }
        }
        if (str != null) {
            for (FragmentStateManager fragmentStateManager : fragmentStore.f38349b.values()) {
                if (fragmentStateManager != null) {
                    Fragment fragment2 = fragmentStateManager.f38341c;
                    if (str.equals(fragment2.f38408E)) {
                        return fragment2;
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: J */
    public final ViewGroup m16657J(Fragment fragment) {
        ViewGroup viewGroup = fragment.f38415L;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.f38407D > 0 && this.f38632r.mo16515e()) {
            View viewMo16514c = this.f38632r.mo16514c(fragment.f38407D);
            if (viewMo16514c instanceof ViewGroup) {
                return (ViewGroup) viewMo16514c;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: K */
    public FragmentFactory m16658K() {
        Fragment fragment = this.f38633s;
        return fragment != null ? fragment.f38450y.m16658K() : this.f38635u;
    }

    /* JADX INFO: renamed from: L */
    public List<Fragment> m16659L() {
        return this.f38617c.m16501i();
    }

    /* JADX INFO: renamed from: M */
    public SpecialEffectsControllerFactory m16660M() {
        Fragment fragment = this.f38633s;
        return fragment != null ? fragment.f38450y.m16660M() : this.f38636v;
    }

    /* JADX INFO: renamed from: N */
    public void m16661N(Fragment fragment) {
        if (m16647O(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (fragment.f38409F) {
            return;
        }
        fragment.f38409F = true;
        fragment.f38420Q = true ^ fragment.f38420Q;
        m16688h0(fragment);
    }

    /* JADX INFO: renamed from: P */
    public final boolean m16662P(Fragment fragment) {
        FragmentManager fragmentManager = fragment.f38404A;
        boolean zM16662P = false;
        for (Fragment fragment2 : (ArrayList) fragmentManager.f38617c.m16499g()) {
            if (fragment2 != null) {
                zM16662P = fragmentManager.m16662P(fragment2);
            }
            if (zM16662P) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: Q */
    public boolean m16663Q(Fragment fragment) {
        FragmentManager fragmentManager;
        if (fragment == null) {
            return true;
        }
        return fragment.f38413J && ((fragmentManager = fragment.f38450y) == null || fragmentManager.m16663Q(fragment.f38405B));
    }

    /* JADX INFO: renamed from: R */
    public boolean m16664R(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.f38450y;
        return fragment.equals(fragmentManager.f38634t) && m16664R(fragmentManager.f38633s);
    }

    /* JADX INFO: renamed from: S */
    public boolean m16665S() {
        return this.f38605B || this.f38606C;
    }

    /* JADX INFO: renamed from: T */
    public void m16666T(int i2, boolean z) {
        FragmentHostCallback<?> fragmentHostCallback;
        if (this.f38631q == null && i2 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z || i2 != this.f38630p) {
            this.f38630p = i2;
            FragmentStore fragmentStore = this.f38617c;
            Iterator<Fragment> it = fragmentStore.f38348a.iterator();
            while (it.hasNext()) {
                FragmentStateManager fragmentStateManager = fragmentStore.f38349b.get(it.next().f38437l);
                if (fragmentStateManager != null) {
                    fragmentStateManager.m16485k();
                }
            }
            Iterator<FragmentStateManager> it2 = fragmentStore.f38349b.values().iterator();
            while (true) {
                boolean z2 = false;
                if (!it2.hasNext()) {
                    break;
                }
                FragmentStateManager next = it2.next();
                if (next != null) {
                    next.m16485k();
                    Fragment fragment = next.f38341c;
                    if (fragment.f38444s && !fragment.m16552T()) {
                        z2 = true;
                    }
                    if (z2) {
                        fragmentStore.m16503k(next);
                    }
                }
            }
            m16692j0();
            if (this.f38604A && (fragmentHostCallback = this.f38631q) != null && this.f38630p == 7) {
                fragmentHostCallback.mo16585k();
                this.f38604A = false;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:104:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:32:0x006c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0071  */
    /* JADX WARN: Code duplicated, block: B:36:0x0076  */
    /* JADX WARN: Code duplicated, block: B:38:0x007b  */
    /* JADX WARN: Code duplicated, block: B:40:0x0080  */
    /* JADX INFO: renamed from: U */
    public void m16667U(Fragment fragment, int i2) {
        int i3;
        ViewGroup viewGroup;
        FragmentStateManager fragmentStateManagerM16500h = this.f38617c.m16500h(fragment.f38437l);
        if (fragmentStateManagerM16500h == null) {
            fragmentStateManagerM16500h = new FragmentStateManager(this.f38628n, this.f38617c, fragment);
            fragmentStateManagerM16500h.f38343e = 1;
        }
        FragmentStateManager fragmentStateManager = fragmentStateManagerM16500h;
        int iMin = Math.min((fragment.f38445t && fragment.f38446u && fragment.f38432g == 2) ? Math.max(i2, 2) : i2, fragmentStateManager.m16478d());
        int i4 = fragment.f38432g;
        if (i4 <= iMin) {
            if (i4 < iMin && !this.f38626l.isEmpty()) {
                m16679d(fragment);
            }
            int i5 = fragment.f38432g;
            if (i5 != -1) {
                if (i5 != 0) {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            if (i5 != 4) {
                                if (i5 == 5) {
                                }
                            }
                            if (iMin > 5) {
                                fragmentStateManager.m16488n();
                            }
                        }
                        if (iMin > 4) {
                            fragmentStateManager.m16491q();
                        }
                        if (iMin > 5) {
                            fragmentStateManager.m16488n();
                        }
                    }
                    if (iMin > 2) {
                        fragmentStateManager.m16475a();
                    }
                    if (iMin > 4) {
                        fragmentStateManager.m16491q();
                    }
                    if (iMin > 5) {
                        fragmentStateManager.m16488n();
                    }
                }
                if (iMin > -1) {
                    fragmentStateManager.m16484j();
                }
                if (iMin > 1) {
                    fragmentStateManager.m16480f();
                }
                if (iMin > 2) {
                    fragmentStateManager.m16475a();
                }
                if (iMin > 4) {
                    fragmentStateManager.m16491q();
                }
                if (iMin > 5) {
                    fragmentStateManager.m16488n();
                }
            } else if (iMin > -1) {
                fragmentStateManager.m16477c();
            }
            if (iMin > 0) {
                fragmentStateManager.m16479e();
            }
            if (iMin > -1) {
                fragmentStateManager.m16484j();
            }
            if (iMin > 1) {
                fragmentStateManager.m16480f();
            }
            if (iMin > 2) {
                fragmentStateManager.m16475a();
            }
            if (iMin > 4) {
                fragmentStateManager.m16491q();
            }
            if (iMin > 5) {
                fragmentStateManager.m16488n();
            }
        } else if (i4 > iMin) {
            if (i4 == 0) {
                i3 = iMin;
                if (i3 < 0) {
                    fragmentStateManager.m16483i();
                }
                iMin = i3;
            } else {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 4) {
                            if (i4 != 5) {
                                if (i4 == 7) {
                                    if (iMin < 7) {
                                        fragmentStateManager.m16486l();
                                    }
                                }
                            }
                            if (iMin < 5) {
                                fragmentStateManager.m16492r();
                            }
                        }
                        if (iMin < 4) {
                            if (m16647O(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + fragment);
                            }
                            if (fragment.f38416M != null && this.f38631q.mo16583i(fragment) && fragment.f38434i == null) {
                                fragmentStateManager.m16490p();
                            }
                        }
                    }
                    if (iMin < 2) {
                        FragmentAnim4 fragmentAnim4M16441f = null;
                        View view = fragment.f38416M;
                        if (view != null && (viewGroup = fragment.f38415L) != null) {
                            viewGroup.endViewTransition(view);
                            fragment.f38416M.clearAnimation();
                            if (!fragment.m16556V()) {
                                if (this.f38630p > -1 && !this.f38607D && fragment.f38416M.getVisibility() == 0 && fragment.f38421R >= 0.0f) {
                                    fragmentAnim4M16441f = C8310a.m16441f(this.f38631q.f38565g, fragment, false, fragment.m16531I());
                                }
                                fragment.f38421R = 0.0f;
                                ViewGroup viewGroup2 = fragment.f38415L;
                                View view2 = fragment.f38416M;
                                if (fragmentAnim4M16441f != null) {
                                    FragmentTransition7.a aVar = this.f38627m;
                                    viewGroup2.startViewTransition(view2);
                                    CancellationSignal cancellationSignal = new CancellationSignal();
                                    cancellationSignal.m16202b(new FragmentAnim(fragment));
                                    d dVar = (d) aVar;
                                    dVar.m16712b(fragment, cancellationSignal);
                                    if (fragmentAnim4M16441f.f38529a != null) {
                                        FragmentAnim5 fragmentAnim5 = new FragmentAnim5(fragmentAnim4M16441f.f38529a, viewGroup2, view2);
                                        fragment.m16534J0(fragment.f38416M);
                                        fragmentAnim5.setAnimationListener(new FragmentAnim2(viewGroup2, fragment, dVar, cancellationSignal));
                                        fragment.f38416M.startAnimation(fragmentAnim5);
                                    } else {
                                        Animator animator = fragmentAnim4M16441f.f38530b;
                                        fragment.m16538L0(animator);
                                        animator.addListener(new FragmentAnim3(viewGroup2, view2, fragment, dVar, cancellationSignal));
                                        animator.setTarget(fragment.f38416M);
                                        animator.start();
                                    }
                                }
                                viewGroup2.removeView(view2);
                                if (m16647O(2)) {
                                    Log.v("FragmentManager", "Removing view " + view2 + " for fragment " + fragment + " from container " + viewGroup2);
                                }
                                if (viewGroup2 != fragment.f38415L) {
                                    return;
                                }
                            }
                        }
                        if (this.f38626l.get(fragment) == null) {
                            fragmentStateManager.m16482h();
                        }
                    }
                }
                if (iMin >= 1) {
                    i3 = iMin;
                } else if (this.f38626l.get(fragment) != null) {
                    i3 = 1;
                } else {
                    fragmentStateManager.m16481g();
                    i3 = iMin;
                }
                if (i3 < 0) {
                    fragmentStateManager.m16483i();
                }
                iMin = i3;
            }
        }
        if (fragment.f38432g != iMin) {
            if (m16647O(3)) {
                Log.d("FragmentManager", "moveToState: Fragment state for " + fragment + " not updated inline; expected state " + iMin + " found " + fragment.f38432g);
            }
            fragment.f38432g = iMin;
        }
    }

    /* JADX INFO: renamed from: V */
    public void m16668V() {
        if (this.f38631q == null) {
            return;
        }
        this.f38605B = false;
        this.f38606C = false;
        this.f38613J.f38303i = false;
        for (Fragment fragment : this.f38617c.m16501i()) {
            if (fragment != null) {
                fragment.f38404A.m16668V();
            }
        }
    }

    /* JADX INFO: renamed from: W */
    public void m16669W(FragmentStateManager fragmentStateManager) {
        Fragment fragment = fragmentStateManager.f38341c;
        if (fragment.f38417N) {
            if (this.f38616b) {
                this.f38608E = true;
            } else {
                fragment.f38417N = false;
                fragmentStateManager.m16485k();
            }
        }
    }

    /* JADX INFO: renamed from: X */
    public boolean m16670X() {
        m16650C(false);
        m16649B(true);
        Fragment fragment = this.f38634t;
        if (fragment != null && fragment.m16570w().m16670X()) {
            return true;
        }
        boolean zM16671Y = m16671Y(this.f38609F, this.f38610G, null, -1, 0);
        if (zM16671Y) {
            this.f38616b = true;
            try {
                m16674a0(this.f38609F, this.f38610G);
                m16681e();
            } catch (Throwable th) {
                m16681e();
                throw th;
            }
        }
        m16696l0();
        m16708x();
        this.f38617c.m16494b();
        return zM16671Y;
    }

    /* JADX INFO: renamed from: Y */
    public boolean m16671Y(ArrayList<BackStackRecord> arrayList, ArrayList<Boolean> arrayList2, String str, int i2, int i3) {
        ArrayList<BackStackRecord> arrayList3 = this.f38618d;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i2 < 0 && (i3 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f38618d.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            int i4 = -1;
            if (str != null || i2 >= 0) {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    BackStackRecord backStackRecord = this.f38618d.get(size2);
                    if ((str != null && str.equals(backStackRecord.f38360i)) || (i2 >= 0 && i2 == backStackRecord.f38263s)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i3 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        BackStackRecord backStackRecord2 = this.f38618d.get(size2);
                        if (str == null || !str.equals(backStackRecord2.f38360i)) {
                            if (i2 < 0 || i2 != backStackRecord2.f38263s) {
                                break;
                            }
                        }
                    }
                }
                i4 = size2;
            }
            if (i4 == this.f38618d.size() - 1) {
                return false;
            }
            for (int size3 = this.f38618d.size() - 1; size3 > i4; size3--) {
                arrayList.add(this.f38618d.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: Z */
    public void m16672Z(Fragment fragment) {
        if (m16647O(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.f38449x);
        }
        boolean z = !fragment.m16552T();
        if (!fragment.f38410G || z) {
            this.f38617c.m16504l(fragment);
            if (m16662P(fragment)) {
                this.f38604A = true;
            }
            fragment.f38444s = true;
            m16688h0(fragment);
        }
    }

    /* JADX INFO: renamed from: a */
    public FragmentStateManager m16673a(Fragment fragment) {
        if (m16647O(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        FragmentStateManager fragmentStateManagerM16687h = m16687h(fragment);
        fragment.f38450y = this;
        this.f38617c.m16502j(fragmentStateManagerM16687h);
        if (!fragment.f38410G) {
            this.f38617c.m16493a(fragment);
            fragment.f38444s = false;
            if (fragment.f38416M == null) {
                fragment.f38420Q = false;
            }
            if (m16662P(fragment)) {
                this.f38604A = true;
            }
        }
        return fragmentStateManagerM16687h;
    }

    /* JADX INFO: renamed from: a0 */
    public final void m16674a0(ArrayList<BackStackRecord> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        m16653F(arrayList, arrayList2);
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            if (!arrayList.get(i2).f38367p) {
                if (i3 != i2) {
                    m16652E(arrayList, arrayList2, i3, i2);
                }
                i3 = i2 + 1;
                if (arrayList2.get(i2).booleanValue()) {
                    while (i3 < size && arrayList2.get(i3).booleanValue() && !arrayList.get(i3).f38367p) {
                        i3++;
                    }
                }
                m16652E(arrayList, arrayList2, i2, i3);
                i2 = i3 - 1;
            }
            i2++;
        }
        if (i3 != size) {
            m16652E(arrayList, arrayList2, i3, size);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"SyntheticAccessor"})
    /* JADX INFO: renamed from: b */
    public void m16675b(FragmentHostCallback<?> fragmentHostCallback, FragmentContainer fragmentContainer, Fragment fragment) {
        LifecycleOwner lifecycleOwner;
        if (this.f38631q != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f38631q = fragmentHostCallback;
        this.f38632r = fragmentContainer;
        this.f38633s = fragment;
        if (fragment != null) {
            this.f38629o.add(new h(this, fragment));
        } else if (fragmentHostCallback instanceof FragmentOnAttachListener) {
            this.f38629o.add((FragmentOnAttachListener) fragmentHostCallback);
        }
        if (this.f38633s != null) {
            m16696l0();
        }
        if (fragmentHostCallback instanceof OnBackPressedDispatcherOwner) {
            OnBackPressedDispatcherOwner onBackPressedDispatcherOwner = (OnBackPressedDispatcherOwner) fragmentHostCallback;
            OnBackPressedDispatcher onBackPressedDispatcherMo125d = onBackPressedDispatcherOwner.mo125d();
            this.f38621g = onBackPressedDispatcherMo125d;
            if (fragment != null) {
                lifecycleOwner = onBackPressedDispatcherOwner;
                lifecycleOwner = fragment;
            }
            lifecycleOwner = onBackPressedDispatcherOwner;
            onBackPressedDispatcherMo125d.m132a(lifecycleOwner, this.f38622h);
        }
        if (fragment != null) {
            FragmentManagerViewModel fragmentManagerViewModel = fragment.f38450y.f38613J;
            FragmentManagerViewModel fragmentManagerViewModel2 = fragmentManagerViewModel.f38299e.get(fragment.f38437l);
            if (fragmentManagerViewModel2 == null) {
                fragmentManagerViewModel2 = new FragmentManagerViewModel(fragmentManagerViewModel.f38301g);
                fragmentManagerViewModel.f38299e.put(fragment.f38437l, fragmentManagerViewModel2);
            }
            this.f38613J = fragmentManagerViewModel2;
        } else if (fragmentHostCallback instanceof ViewModelStoreOwner) {
            this.f38613J = (FragmentManagerViewModel) new ViewModelProvider2(((ViewModelStoreOwner) fragmentHostCallback).mo128o(), FragmentManagerViewModel.f38297c).m16722a(FragmentManagerViewModel.class);
        } else {
            this.f38613J = new FragmentManagerViewModel(false);
        }
        this.f38613J.f38303i = m16665S();
        this.f38617c.f38350c = this.f38613J;
        Object obj = this.f38631q;
        if (obj instanceof ActivityResultRegistryOwner) {
            ActivityResultRegistry activityResultRegistryMo127l = ((ActivityResultRegistryOwner) obj).mo127l();
            String strM1599u = outline.m1599u("FragmentManager:", fragment != null ? outline.m1550A(new StringBuilder(), fragment.f38437l, ":") : "");
            this.f38637w = activityResultRegistryMo127l.m14496c(outline.m1599u(strM1599u, "StartActivityForResult"), new ActivityResultContracts2(), new i());
            this.f38638x = activityResultRegistryMo127l.m14496c(outline.m1599u(strM1599u, "StartIntentSenderForResult"), new j(), new a());
            this.f38639y = activityResultRegistryMo127l.m14496c(outline.m1599u(strM1599u, "RequestPermissions"), new ActivityResultContracts(), new b());
        }
    }

    /* JADX INFO: renamed from: b0 */
    public void m16676b0(Parcelable parcelable) {
        FragmentStateManager fragmentStateManager;
        if (parcelable == null) {
            return;
        }
        FragmentManagerState fragmentManagerState = (FragmentManagerState) parcelable;
        if (fragmentManagerState.f38278f == null) {
            return;
        }
        this.f38617c.f38349b.clear();
        for (FragmentState fragmentState : fragmentManagerState.f38278f) {
            if (fragmentState != null) {
                Fragment fragment = this.f38613J.f38298d.get(fragmentState.f38323g);
                if (fragment != null) {
                    if (m16647O(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + fragment);
                    }
                    fragmentStateManager = new FragmentStateManager(this.f38628n, this.f38617c, fragment, fragmentState);
                } else {
                    fragmentStateManager = new FragmentStateManager(this.f38628n, this.f38617c, this.f38631q.f38565g.getClassLoader(), m16658K(), fragmentState);
                }
                Fragment fragment2 = fragmentStateManager.f38341c;
                fragment2.f38450y = this;
                if (m16647O(2)) {
                    StringBuilder sbM1556G = outline.m1556G("restoreSaveState: active (");
                    sbM1556G.append(fragment2.f38437l);
                    sbM1556G.append("): ");
                    sbM1556G.append(fragment2);
                    Log.v("FragmentManager", sbM1556G.toString());
                }
                fragmentStateManager.m16487m(this.f38631q.f38565g.getClassLoader());
                this.f38617c.m16502j(fragmentStateManager);
                fragmentStateManager.f38343e = this.f38630p;
            }
        }
        FragmentManagerViewModel fragmentManagerViewModel = this.f38613J;
        Objects.requireNonNull(fragmentManagerViewModel);
        for (Fragment fragment3 : new ArrayList(fragmentManagerViewModel.f38298d.values())) {
            if (!this.f38617c.m16495c(fragment3.f38437l)) {
                if (m16647O(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment3 + " that was not found in the set of active Fragments " + fragmentManagerState.f38278f);
                }
                this.f38613J.m16470h(fragment3);
                fragment3.f38450y = this;
                FragmentStateManager fragmentStateManager2 = new FragmentStateManager(this.f38628n, this.f38617c, fragment3);
                fragmentStateManager2.f38343e = 1;
                fragmentStateManager2.m16485k();
                fragment3.f38444s = true;
                fragmentStateManager2.m16485k();
            }
        }
        FragmentStore fragmentStore = this.f38617c;
        ArrayList<String> arrayList = fragmentManagerState.f38279g;
        fragmentStore.f38348a.clear();
        if (arrayList != null) {
            for (String str : arrayList) {
                Fragment fragmentM16496d = fragmentStore.m16496d(str);
                if (fragmentM16496d == null) {
                    throw new IllegalStateException(outline.m1600v("No instantiated fragment for (", str, ")"));
                }
                if (m16647O(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + fragmentM16496d);
                }
                fragmentStore.m16493a(fragmentM16496d);
            }
        }
        Fragment fragment4 = null;
        if (fragmentManagerState.f38280h != null) {
            this.f38618d = new ArrayList<>(fragmentManagerState.f38280h.length);
            int i2 = 0;
            while (true) {
                BackStackState[] backStackStateArr = fragmentManagerState.f38280h;
                if (i2 >= backStackStateArr.length) {
                    break;
                }
                BackStackState backStackState = backStackStateArr[i2];
                Objects.requireNonNull(backStackState);
                BackStackRecord backStackRecord = new BackStackRecord(this);
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    int[] iArr = backStackState.f38264f;
                    if (i3 >= iArr.length) {
                        break;
                    }
                    FragmentTransaction.a aVar = new FragmentTransaction.a();
                    int i5 = i3 + 1;
                    aVar.f38368a = iArr[i3];
                    if (m16647O(2)) {
                        Log.v("FragmentManager", "Instantiate " + backStackRecord + " op #" + i4 + " base fragment #" + backStackState.f38264f[i5]);
                    }
                    String str2 = backStackState.f38265g.get(i4);
                    if (str2 != null) {
                        aVar.f38369b = this.f38617c.m16496d(str2);
                    } else {
                        aVar.f38369b = fragment4;
                    }
                    aVar.f38374g = Lifecycle3.b.values()[backStackState.f38266h[i4]];
                    aVar.f38375h = Lifecycle3.b.values()[backStackState.f38267i[i4]];
                    int[] iArr2 = backStackState.f38264f;
                    int i6 = i5 + 1;
                    int i7 = iArr2[i5];
                    aVar.f38370c = i7;
                    int i8 = i6 + 1;
                    int i9 = iArr2[i6];
                    aVar.f38371d = i9;
                    int i10 = i8 + 1;
                    int i11 = iArr2[i8];
                    aVar.f38372e = i11;
                    int i12 = iArr2[i10];
                    aVar.f38373f = i12;
                    backStackRecord.f38353b = i7;
                    backStackRecord.f38354c = i9;
                    backStackRecord.f38355d = i11;
                    backStackRecord.f38356e = i12;
                    backStackRecord.m16505b(aVar);
                    i4++;
                    fragment4 = null;
                    i3 = i10 + 1;
                }
                backStackRecord.f38357f = backStackState.f38268j;
                backStackRecord.f38360i = backStackState.f38269k;
                backStackRecord.f38263s = backStackState.f38270l;
                backStackRecord.f38358g = true;
                backStackRecord.f38361j = backStackState.f38271m;
                backStackRecord.f38362k = backStackState.f38272n;
                backStackRecord.f38363l = backStackState.f38273o;
                backStackRecord.f38364m = backStackState.f38274p;
                backStackRecord.f38365n = backStackState.f38275q;
                backStackRecord.f38366o = backStackState.f38276r;
                backStackRecord.f38367p = backStackState.f38277s;
                backStackRecord.m16453n(1);
                if (m16647O(2)) {
                    StringBuilder sbM1557H = outline.m1557H("restoreAllState: back stack #", i2, " (index ");
                    sbM1557H.append(backStackRecord.f38263s);
                    sbM1557H.append("): ");
                    sbM1557H.append(backStackRecord);
                    Log.v("FragmentManager", sbM1557H.toString());
                    PrintWriter printWriter = new PrintWriter(new LogWriter("FragmentManager"));
                    backStackRecord.m16456q("  ", printWriter, false);
                    printWriter.close();
                }
                this.f38618d.add(backStackRecord);
                i2++;
                fragment4 = null;
            }
        } else {
            this.f38618d = null;
        }
        this.f38623i.set(fragmentManagerState.f38281i);
        String str3 = fragmentManagerState.f38282j;
        if (str3 != null) {
            Fragment fragmentM16654G = m16654G(str3);
            this.f38634t = fragmentM16654G;
            m16704t(fragmentM16654G);
        }
        ArrayList<String> arrayList2 = fragmentManagerState.f38283k;
        if (arrayList2 != null) {
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                Bundle bundle = fragmentManagerState.f38284l.get(i13);
                bundle.setClassLoader(this.f38631q.f38565g.getClassLoader());
                this.f38624j.put(arrayList2.get(i13), bundle);
            }
        }
        this.f38640z = new ArrayDeque<>(fragmentManagerState.f38285m);
    }

    /* JADX INFO: renamed from: c */
    public void m16677c(Fragment fragment) {
        if (m16647O(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.f38410G) {
            fragment.f38410G = false;
            if (fragment.f38443r) {
                return;
            }
            this.f38617c.m16493a(fragment);
            if (m16647O(2)) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            if (m16662P(fragment)) {
                this.f38604A = true;
            }
        }
    }

    /* JADX INFO: renamed from: c0 */
    public Parcelable m16678c0() {
        int i2;
        ArrayList<String> arrayList;
        int size;
        Iterator it = ((HashSet) m16683f()).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            SpecialEffectsController specialEffectsController = (SpecialEffectsController) it.next();
            if (specialEffectsController.f38577e) {
                specialEffectsController.f38577e = false;
                specialEffectsController.m16621c();
            }
        }
        m16710z();
        m16650C(true);
        this.f38605B = true;
        this.f38613J.f38303i = true;
        FragmentStore fragmentStore = this.f38617c;
        Objects.requireNonNull(fragmentStore);
        ArrayList<FragmentState> arrayList2 = new ArrayList<>(fragmentStore.f38349b.size());
        for (FragmentStateManager fragmentStateManager : fragmentStore.f38349b.values()) {
            if (fragmentStateManager != null) {
                Fragment fragment = fragmentStateManager.f38341c;
                FragmentState fragmentState = new FragmentState(fragment);
                Fragment fragment2 = fragmentStateManager.f38341c;
                if (fragment2.f38432g <= -1 || fragmentState.f38334r != null) {
                    fragmentState.f38334r = fragment2.f38433h;
                } else {
                    Bundle bundleM16489o = fragmentStateManager.m16489o();
                    fragmentState.f38334r = bundleM16489o;
                    if (fragmentStateManager.f38341c.f38440o != null) {
                        if (bundleM16489o == null) {
                            fragmentState.f38334r = new Bundle();
                        }
                        fragmentState.f38334r.putString("android:target_state", fragmentStateManager.f38341c.f38440o);
                        int i3 = fragmentStateManager.f38341c.f38441p;
                        if (i3 != 0) {
                            fragmentState.f38334r.putInt("android:target_req_state", i3);
                        }
                    }
                }
                arrayList2.add(fragmentState);
                if (m16647O(2)) {
                    Log.v("FragmentManager", "Saved state of " + fragment + ": " + fragmentState.f38334r);
                }
            }
        }
        BackStackState[] backStackStateArr = null;
        if (arrayList2.isEmpty()) {
            if (m16647O(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        FragmentStore fragmentStore2 = this.f38617c;
        synchronized (fragmentStore2.f38348a) {
            if (fragmentStore2.f38348a.isEmpty()) {
                arrayList = null;
            } else {
                arrayList = new ArrayList<>(fragmentStore2.f38348a.size());
                for (Fragment fragment3 : fragmentStore2.f38348a) {
                    arrayList.add(fragment3.f38437l);
                    if (m16647O(2)) {
                        Log.v("FragmentManager", "saveAllState: adding fragment (" + fragment3.f38437l + "): " + fragment3);
                    }
                }
            }
        }
        ArrayList<BackStackRecord> arrayList3 = this.f38618d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            backStackStateArr = new BackStackState[size];
            for (i2 = 0; i2 < size; i2++) {
                backStackStateArr[i2] = new BackStackState(this.f38618d.get(i2));
                if (m16647O(2)) {
                    StringBuilder sbM1557H = outline.m1557H("saveAllState: adding back stack #", i2, ": ");
                    sbM1557H.append(this.f38618d.get(i2));
                    Log.v("FragmentManager", sbM1557H.toString());
                }
            }
        }
        FragmentManagerState fragmentManagerState = new FragmentManagerState();
        fragmentManagerState.f38278f = arrayList2;
        fragmentManagerState.f38279g = arrayList;
        fragmentManagerState.f38280h = backStackStateArr;
        fragmentManagerState.f38281i = this.f38623i.get();
        Fragment fragment4 = this.f38634t;
        if (fragment4 != null) {
            fragmentManagerState.f38282j = fragment4.f38437l;
        }
        fragmentManagerState.f38283k.addAll(this.f38624j.keySet());
        fragmentManagerState.f38284l.addAll(this.f38624j.values());
        fragmentManagerState.f38285m = new ArrayList<>(this.f38640z);
        return fragmentManagerState;
    }

    /* JADX INFO: renamed from: d */
    public final void m16679d(Fragment fragment) {
        HashSet<CancellationSignal> hashSet = this.f38626l.get(fragment);
        if (hashSet != null) {
            Iterator<CancellationSignal> it = hashSet.iterator();
            while (it.hasNext()) {
                it.next().m16201a();
            }
            hashSet.clear();
            m16689i(fragment);
            this.f38626l.remove(fragment);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public void m16680d0() {
        synchronized (this.f38615a) {
            ArrayList<o> arrayList = this.f38612I;
            boolean z = (arrayList == null || arrayList.isEmpty()) ? false : true;
            boolean z2 = this.f38615a.size() == 1;
            if (z || z2) {
                this.f38631q.f38566h.removeCallbacks(this.f38614K);
                this.f38631q.f38566h.post(this.f38614K);
                m16696l0();
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m16681e() {
        this.f38616b = false;
        this.f38610G.clear();
        this.f38609F.clear();
    }

    /* JADX INFO: renamed from: e0 */
    public void m16682e0(Fragment fragment, boolean z) {
        ViewGroup viewGroupM16657J = m16657J(fragment);
        if (viewGroupM16657J == null || !(viewGroupM16657J instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupM16657J).setDrawDisappearingViewsLast(!z);
    }

    /* JADX INFO: renamed from: f */
    public final Set<SpecialEffectsController> m16683f() {
        HashSet hashSet = new HashSet();
        Iterator it = ((ArrayList) this.f38617c.m16498f()).iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((FragmentStateManager) it.next()).f38341c.f38415L;
            if (viewGroup != null) {
                hashSet.add(SpecialEffectsController.m16619g(viewGroup, m16660M()));
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: f0 */
    public void m16684f0(Fragment fragment, Lifecycle3.b bVar) {
        if (fragment.equals(m16654G(fragment.f38437l)) && (fragment.f38451z == null || fragment.f38450y == this)) {
            fragment.f38424U = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* JADX INFO: renamed from: g */
    public void m16685g(BackStackRecord backStackRecord, boolean z, boolean z2, boolean z3) {
        if (z) {
            backStackRecord.m16458s(z3);
        } else {
            backStackRecord.m16457r();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(backStackRecord);
        arrayList2.add(Boolean.valueOf(z));
        if (z2 && this.f38630p >= 1) {
            FragmentTransition7.m16601p(this.f38631q.f38565g, this.f38632r, arrayList, arrayList2, 0, 1, true, this.f38627m);
        }
        if (z3) {
            m16666T(this.f38630p, true);
        }
        for (Fragment fragment : (ArrayList) this.f38617c.m16499g()) {
            if (fragment != null) {
                View view = fragment.f38416M;
            }
        }
    }

    /* JADX INFO: renamed from: g0 */
    public void m16686g0(Fragment fragment) {
        if (fragment == null || (fragment.equals(m16654G(fragment.f38437l)) && (fragment.f38451z == null || fragment.f38450y == this))) {
            Fragment fragment2 = this.f38634t;
            this.f38634t = fragment;
            m16704t(fragment2);
            m16704t(this.f38634t);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* JADX INFO: renamed from: h */
    public FragmentStateManager m16687h(Fragment fragment) {
        FragmentStateManager fragmentStateManagerM16500h = this.f38617c.m16500h(fragment.f38437l);
        if (fragmentStateManagerM16500h != null) {
            return fragmentStateManagerM16500h;
        }
        FragmentStateManager fragmentStateManager = new FragmentStateManager(this.f38628n, this.f38617c, fragment);
        fragmentStateManager.m16487m(this.f38631q.f38565g.getClassLoader());
        fragmentStateManager.f38343e = this.f38630p;
        return fragmentStateManager;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m16688h0(Fragment fragment) {
        ViewGroup viewGroupM16657J = m16657J(fragment);
        if (viewGroupM16657J != null) {
            if (fragment.m16535K() + fragment.m16533J() + fragment.m16518B() + fragment.m16572y() > 0) {
                if (viewGroupM16657J.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    viewGroupM16657J.setTag(R.id.visible_removing_fragment_view_tag, fragment);
                }
                ((Fragment) viewGroupM16657J.getTag(R.id.visible_removing_fragment_view_tag)).m16549R0(fragment.m16531I());
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m16689i(Fragment fragment) {
        fragment.m16574z0();
        this.f38628n.m16646n(fragment, false);
        fragment.f38415L = null;
        fragment.f38416M = null;
        fragment.f38426W = null;
        fragment.f38427X.mo427j(null);
        fragment.f38446u = false;
    }

    /* JADX INFO: renamed from: i0 */
    public void m16690i0(Fragment fragment) {
        if (m16647O(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.f38409F) {
            fragment.f38409F = false;
            fragment.f38420Q = !fragment.f38420Q;
        }
    }

    /* JADX INFO: renamed from: j */
    public void m16691j(Fragment fragment) {
        if (m16647O(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (fragment.f38410G) {
            return;
        }
        fragment.f38410G = true;
        if (fragment.f38443r) {
            if (m16647O(2)) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            this.f38617c.m16504l(fragment);
            if (m16662P(fragment)) {
                this.f38604A = true;
            }
            m16688h0(fragment);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final void m16692j0() {
        Iterator it = ((ArrayList) this.f38617c.m16498f()).iterator();
        while (it.hasNext()) {
            m16669W((FragmentStateManager) it.next());
        }
    }

    /* JADX INFO: renamed from: k */
    public void m16693k(Configuration configuration) {
        for (Fragment fragment : this.f38617c.m16501i()) {
            if (fragment != null) {
                fragment.onConfigurationChanged(configuration);
                fragment.f38404A.m16693k(configuration);
            }
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final void m16694k0(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new LogWriter("FragmentManager"));
        FragmentHostCallback<?> fragmentHostCallback = this.f38631q;
        if (fragmentHostCallback != null) {
            try {
                fragmentHostCallback.mo16580f("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
                throw runtimeException;
            }
        }
        try {
            m16709y("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e3) {
            Log.e("FragmentManager", "Failed dumping state", e3);
            throw runtimeException;
        }
    }

    /* JADX INFO: renamed from: l */
    public boolean m16695l(MenuItem menuItem) {
        if (this.f38630p < 1) {
            return false;
        }
        for (Fragment fragment : this.f38617c.m16501i()) {
            if (fragment != null) {
                if (fragment.f38409F ? false : fragment.m16559b0() ? true : fragment.f38404A.m16695l(menuItem)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: l0 */
    public final void m16696l0() {
        synchronized (this.f38615a) {
            if (!this.f38615a.isEmpty()) {
                this.f38622h.f34167a = true;
                return;
            }
            OnBackPressedCallback onBackPressedCallback = this.f38622h;
            ArrayList<BackStackRecord> arrayList = this.f38618d;
            onBackPressedCallback.f34167a = (arrayList != null ? arrayList.size() : 0) > 0 && m16664R(this.f38633s);
        }
    }

    /* JADX INFO: renamed from: m */
    public void m16697m() {
        this.f38605B = false;
        this.f38606C = false;
        this.f38613J.f38303i = false;
        m16707w(1);
    }

    /* JADX INFO: renamed from: n */
    public boolean m16698n(Menu menu, MenuInflater menuInflater) {
        if (this.f38630p < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (Fragment fragment : this.f38617c.m16501i()) {
            if (fragment != null && m16663Q(fragment)) {
                if (!fragment.f38409F ? fragment.f38404A.m16698n(menu, menuInflater) | false : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(fragment);
                    z = true;
                }
            }
        }
        if (this.f38619e != null) {
            for (int i2 = 0; i2 < this.f38619e.size(); i2++) {
                Fragment fragment2 = this.f38619e.get(i2);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    Objects.requireNonNull(fragment2);
                }
            }
        }
        this.f38619e = arrayList;
        return z;
    }

    /* JADX INFO: renamed from: o */
    public void m16699o() {
        this.f38607D = true;
        m16650C(true);
        m16710z();
        m16707w(-1);
        this.f38631q = null;
        this.f38632r = null;
        this.f38633s = null;
        if (this.f38621g != null) {
            this.f38622h.m14490b();
            this.f38621g = null;
        }
        ActivityResultLauncher<Intent> activityResultLauncher = this.f38637w;
        if (activityResultLauncher != null) {
            activityResultLauncher.mo14494b();
            this.f38638x.mo14494b();
            this.f38639y.mo14494b();
        }
    }

    /* JADX INFO: renamed from: p */
    public void m16700p() {
        for (Fragment fragment : this.f38617c.m16501i()) {
            if (fragment != null) {
                fragment.m16519B0();
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public void m16701q(boolean z) {
        for (Fragment fragment : this.f38617c.m16501i()) {
            if (fragment != null) {
                fragment.m16565n0();
                fragment.f38404A.m16701q(z);
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public boolean m16702r(MenuItem menuItem) {
        if (this.f38630p < 1) {
            return false;
        }
        for (Fragment fragment : this.f38617c.m16501i()) {
            if (fragment != null) {
                if (!fragment.f38409F ? fragment.f38404A.m16702r(menuItem) : false) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: s */
    public void m16703s(Menu menu) {
        if (this.f38630p < 1) {
            return;
        }
        for (Fragment fragment : this.f38617c.m16501i()) {
            if (fragment != null && !fragment.f38409F) {
                fragment.f38404A.m16703s(menu);
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m16704t(Fragment fragment) {
        if (fragment == null || !fragment.equals(m16654G(fragment.f38437l))) {
            return;
        }
        boolean zM16664R = fragment.f38450y.m16664R(fragment);
        Boolean bool = fragment.f38442q;
        if (bool == null || bool.booleanValue() != zM16664R) {
            fragment.f38442q = Boolean.valueOf(zM16664R);
            fragment.mo469q0(zM16664R);
            FragmentManager fragmentManager = fragment.f38404A;
            fragmentManager.m16696l0();
            fragmentManager.m16704t(fragmentManager.f38634t);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.f38633s;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f38633s)));
            sb.append("}");
        } else {
            FragmentHostCallback<?> fragmentHostCallback = this.f38631q;
            if (fragmentHostCallback != null) {
                sb.append(fragmentHostCallback.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f38631q)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public void m16705u(boolean z) {
        for (Fragment fragment : this.f38617c.m16501i()) {
            if (fragment != null) {
                fragment.m16566p0();
                fragment.f38404A.m16705u(z);
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public boolean m16706v(Menu menu) {
        boolean z = false;
        if (this.f38630p < 1) {
            return false;
        }
        for (Fragment fragment : this.f38617c.m16501i()) {
            if (fragment != null && m16663Q(fragment) && fragment.m16521C0(menu)) {
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: w */
    public final void m16707w(int i2) {
        try {
            this.f38616b = true;
            for (FragmentStateManager fragmentStateManager : this.f38617c.f38349b.values()) {
                if (fragmentStateManager != null) {
                    fragmentStateManager.f38343e = i2;
                }
            }
            m16666T(i2, false);
            Iterator it = ((HashSet) m16683f()).iterator();
            while (it.hasNext()) {
                ((SpecialEffectsController) it.next()).m16623e();
            }
            this.f38616b = false;
            m16650C(true);
        } catch (Throwable th) {
            this.f38616b = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m16708x() {
        if (this.f38608E) {
            this.f38608E = false;
            m16692j0();
        }
    }

    /* JADX INFO: renamed from: y */
    public void m16709y(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String strM1599u = outline.m1599u(str, "    ");
        FragmentStore fragmentStore = this.f38617c;
        Objects.requireNonNull(fragmentStore);
        String str2 = str + "    ";
        if (!fragmentStore.f38349b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (FragmentStateManager fragmentStateManager : fragmentStore.f38349b.values()) {
                printWriter.print(str);
                if (fragmentStateManager != null) {
                    Fragment fragment = fragmentStateManager.f38341c;
                    printWriter.println(fragment);
                    fragment.mo5545q(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size3 = fragmentStore.f38348a.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size3; i2++) {
                Fragment fragment2 = fragmentStore.f38348a.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(fragment2.toString());
            }
        }
        ArrayList<Fragment> arrayList = this.f38619e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i3 = 0; i3 < size2; i3++) {
                Fragment fragment3 = this.f38619e.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(fragment3.toString());
            }
        }
        ArrayList<BackStackRecord> arrayList2 = this.f38618d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i4 = 0; i4 < size; i4++) {
                BackStackRecord backStackRecord = this.f38618d.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(backStackRecord.toString());
                backStackRecord.m16456q(strM1599u, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f38623i.get());
        synchronized (this.f38615a) {
            int size4 = this.f38615a.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i5 = 0; i5 < size4; i5++) {
                    Object obj = (m) this.f38615a.get(i5);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i5);
                    printWriter.print(": ");
                    printWriter.println(obj);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f38631q);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f38632r);
        if (this.f38633s != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f38633s);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f38630p);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f38605B);
        printWriter.print(" mStopped=");
        printWriter.print(this.f38606C);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f38607D);
        if (this.f38604A) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f38604A);
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m16710z() {
        Iterator it = ((HashSet) m16683f()).iterator();
        while (it.hasNext()) {
            ((SpecialEffectsController) it.next()).m16623e();
        }
    }

    /* JADX INFO: renamed from: z0.p.c.z$l */
    /* JADX INFO: compiled from: FragmentManager.java */
    @SuppressLint({"BanParcelableUsage"})
    public static class l implements Parcelable {
        public static final Parcelable.Creator<l> CREATOR = new a();

        /* JADX INFO: renamed from: f */
        public String f38649f;

        /* JADX INFO: renamed from: g */
        public int f38650g;

        /* JADX INFO: renamed from: z0.p.c.z$l$a */
        /* JADX INFO: compiled from: FragmentManager.java */
        public class a implements Parcelable.Creator<l> {
            @Override // android.os.Parcelable.Creator
            public l createFromParcel(Parcel parcel) {
                return new l(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public l[] newArray(int i) {
                return new l[i];
            }
        }

        public l(String str, int i) {
            this.f38649f = str;
            this.f38650g = i;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f38649f);
            parcel.writeInt(this.f38650g);
        }

        public l(Parcel parcel) {
            this.f38649f = parcel.readString();
            this.f38650g = parcel.readInt();
        }
    }
}
