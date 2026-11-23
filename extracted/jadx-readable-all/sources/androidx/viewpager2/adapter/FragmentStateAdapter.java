package androidx.viewpager2.adapter;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p691g.ArraySet2;
import p636z0.p691g.LongSparseArray;
import p636z0.p704i0.p705b.FragmentStateAdapter2;
import p636z0.p704i0.p705b.FragmentStateAdapter3;
import p636z0.p704i0.p705b.FragmentStateAdapter4;
import p636z0.p704i0.p705b.FragmentStateAdapter5;
import p636z0.p704i0.p705b.FragmentStateAdapter6;
import p636z0.p704i0.p705b.FragmentViewHolder;
import p636z0.p704i0.p705b.StatefulAdapter;
import p636z0.p725k.C8162a;
import p636z0.p725k.p739l.ViewCompat;
import p636z0.p752p.p753c.BackStackRecord;
import p636z0.p752p.p753c.Fragment;
import p636z0.p752p.p753c.FragmentActivity;
import p636z0.p752p.p753c.FragmentLifecycleCallbacksDispatcher;
import p636z0.p752p.p753c.FragmentManager;
import p636z0.p752p.p753c.FragmentStateManager;
import p636z0.p759s.Lifecycle3;
import p636z0.p759s.LifecycleOwner;

/* JADX INFO: loaded from: classes.dex */
public abstract class FragmentStateAdapter extends RecyclerView.AbstractC0152e<FragmentViewHolder> implements StatefulAdapter {

    /* JADX INFO: renamed from: d */
    public final Lifecycle3 f1288d;

    /* JADX INFO: renamed from: e */
    public final FragmentManager f1289e;

    /* JADX INFO: renamed from: f */
    public final LongSparseArray<Fragment> f1290f;

    /* JADX INFO: renamed from: g */
    public final LongSparseArray<Fragment.f> f1291g;

    /* JADX INFO: renamed from: h */
    public final LongSparseArray<Integer> f1292h;

    /* JADX INFO: renamed from: i */
    public C0208b f1293i;

    /* JADX INFO: renamed from: j */
    public boolean f1294j;

    /* JADX INFO: renamed from: k */
    public boolean f1295k;

    /* JADX INFO: renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$a */
    public static abstract class AbstractC0207a extends RecyclerView.AbstractC0154g {
        public AbstractC0207a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0154g
        /* JADX INFO: renamed from: b */
        public final void mo679b(int i, int i2) {
            mo678a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0154g
        /* JADX INFO: renamed from: c */
        public final void mo680c(int i, int i2, Object obj) {
            mo678a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0154g
        /* JADX INFO: renamed from: d */
        public final void mo681d(int i, int i2) {
            mo678a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0154g
        /* JADX INFO: renamed from: e */
        public final void mo682e(int i, int i2, int i3) {
            mo678a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0154g
        /* JADX INFO: renamed from: f */
        public final void mo683f(int i, int i2) {
            mo678a();
        }

        public AbstractC0207a(FragmentStateAdapter2 fragmentStateAdapter2) {
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$b */
    public class C0208b {

        /* JADX INFO: renamed from: a */
        public ViewPager2.AbstractC0215g f1301a;

        /* JADX INFO: renamed from: b */
        public RecyclerView.AbstractC0154g f1302b;

        /* JADX INFO: renamed from: c */
        public LifecycleEventObserver f1303c;

        /* JADX INFO: renamed from: d */
        public ViewPager2 f1304d;

        /* JADX INFO: renamed from: e */
        public long f1305e = -1;

        public C0208b() {
        }

        /* JADX INFO: renamed from: a */
        public final ViewPager2 m921a(RecyclerView recyclerView) {
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof ViewPager2) {
                return (ViewPager2) parent;
            }
            throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
        }

        /* JADX INFO: renamed from: b */
        public void m922b(boolean z) {
            int currentItem;
            Fragment fragmentM15589i;
            if (FragmentStateAdapter.this.m920v() || this.f1304d.getScrollState() != 0 || FragmentStateAdapter.this.f1290f.m15591k() || FragmentStateAdapter.this.mo662d() == 0 || (currentItem = this.f1304d.getCurrentItem()) >= FragmentStateAdapter.this.mo662d()) {
                return;
            }
            Objects.requireNonNull(FragmentStateAdapter.this);
            long j2 = currentItem;
            if ((j2 != this.f1305e || z) && (fragmentM15589i = FragmentStateAdapter.this.f1290f.m15589i(j2)) != null && fragmentM15589i.m16550S()) {
                this.f1305e = j2;
                BackStackRecord backStackRecord = new BackStackRecord(FragmentStateAdapter.this.f1289e);
                Fragment fragment = null;
                for (int i = 0; i < FragmentStateAdapter.this.f1290f.m15595o(); i++) {
                    long jM15592l = FragmentStateAdapter.this.f1290f.m15592l(i);
                    Fragment fragmentM15596p = FragmentStateAdapter.this.f1290f.m15596p(i);
                    if (fragmentM15596p.m16550S()) {
                        if (jM15592l != this.f1305e) {
                            backStackRecord.mo16450k(fragmentM15596p, Lifecycle3.b.STARTED);
                        } else {
                            fragment = fragmentM15596p;
                        }
                        fragmentM15596p.mo13901P0(jM15592l == this.f1305e);
                    }
                }
                if (fragment != null) {
                    backStackRecord.mo16450k(fragment, Lifecycle3.b.RESUMED);
                }
                if (backStackRecord.f38352a.isEmpty()) {
                    return;
                }
                backStackRecord.mo16445d();
            }
        }
    }

    public FragmentStateAdapter(FragmentActivity fragmentActivity) {
        this(fragmentActivity.m16577C(), fragmentActivity.f139h);
    }

    /* JADX INFO: renamed from: r */
    public static boolean m910r(String str, String str2) {
        return str.startsWith(str2) && str.length() > str2.length();
    }

    @Override // p636z0.p704i0.p705b.StatefulAdapter
    /* JADX INFO: renamed from: a */
    public final Parcelable mo911a() {
        Bundle bundle = new Bundle(this.f1291g.m15595o() + this.f1290f.m15595o());
        for (int i = 0; i < this.f1290f.m15595o(); i++) {
            long jM15592l = this.f1290f.m15592l(i);
            Fragment fragmentM15589i = this.f1290f.m15589i(jM15592l);
            if (fragmentM15589i != null && fragmentM15589i.m16550S()) {
                String strM1594p = outline.m1594p("f#", jM15592l);
                FragmentManager fragmentManager = this.f1289e;
                Objects.requireNonNull(fragmentManager);
                if (fragmentM15589i.f38450y != fragmentManager) {
                    fragmentManager.m16694k0(new IllegalStateException(outline.m1597s("Fragment ", fragmentM15589i, " is not currently in the FragmentManager")));
                    throw null;
                }
                bundle.putString(strM1594p, fragmentM15589i.f38437l);
            }
        }
        for (int i2 = 0; i2 < this.f1291g.m15595o(); i2++) {
            long jM15592l2 = this.f1291g.m15592l(i2);
            if (m914o(jM15592l2)) {
                bundle.putParcelable(outline.m1594p("s#", jM15592l2), this.f1291g.m15589i(jM15592l2));
            }
        }
        return bundle;
    }

    @Override // p636z0.p704i0.p705b.StatefulAdapter
    /* JADX INFO: renamed from: b */
    public final void mo912b(Parcelable parcelable) {
        if (!this.f1291g.m15591k() || !this.f1290f.m15591k()) {
            throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
        }
        Bundle bundle = (Bundle) parcelable;
        if (bundle.getClassLoader() == null) {
            bundle.setClassLoader(getClass().getClassLoader());
        }
        for (String str : bundle.keySet()) {
            if (m910r(str, "f#")) {
                long j2 = Long.parseLong(str.substring(2));
                FragmentManager fragmentManager = this.f1289e;
                Objects.requireNonNull(fragmentManager);
                String string = bundle.getString(str);
                Fragment fragment = null;
                if (string != null) {
                    Fragment fragmentM16496d = fragmentManager.f38617c.m16496d(string);
                    if (fragmentM16496d == null) {
                        fragmentManager.m16694k0(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
                        throw null;
                    }
                    fragment = fragmentM16496d;
                }
                this.f1290f.m15593m(j2, fragment);
            } else {
                if (!m910r(str, "s#")) {
                    throw new IllegalArgumentException(outline.m1599u("Unexpected key in savedState: ", str));
                }
                long j3 = Long.parseLong(str.substring(2));
                Fragment.f fVar = (Fragment.f) bundle.getParcelable(str);
                if (m914o(j3)) {
                    this.f1291g.m15593m(j3, fVar);
                }
            }
        }
        if (this.f1290f.m15591k()) {
            return;
        }
        this.f1295k = true;
        this.f1294j = true;
        m916q();
        final Handler handler = new Handler(Looper.getMainLooper());
        final FragmentStateAdapter4 fragmentStateAdapter4 = new FragmentStateAdapter4(this);
        this.f1288d.mo16727a(new LifecycleEventObserver(this) { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.5
            @Override // androidx.lifecycle.LifecycleEventObserver
            /* JADX INFO: renamed from: c */
            public void mo130c(LifecycleOwner lifecycleOwner, Lifecycle3.a aVar) {
                if (aVar == Lifecycle3.a.ON_DESTROY) {
                    handler.removeCallbacks(fragmentStateAdapter4);
                    lifecycleOwner.mo124b().mo16729c(this);
                }
            }
        });
        handler.postDelayed(fragmentStateAdapter4, 10000L);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0152e
    /* JADX INFO: renamed from: e */
    public long mo663e(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0152e
    /* JADX INFO: renamed from: g */
    public void mo665g(RecyclerView recyclerView) {
        C8162a.m16060e(this.f1293i == null);
        final C0208b c0208b = new C0208b();
        this.f1293i = c0208b;
        c0208b.f1304d = c0208b.m921a(recyclerView);
        FragmentStateAdapter5 fragmentStateAdapter5 = new FragmentStateAdapter5(c0208b);
        c0208b.f1301a = fragmentStateAdapter5;
        c0208b.f1304d.f1309h.f37189a.add(fragmentStateAdapter5);
        FragmentStateAdapter6 fragmentStateAdapter6 = new FragmentStateAdapter6(c0208b);
        c0208b.f1302b = fragmentStateAdapter6;
        this.f1023a.registerObserver(fragmentStateAdapter6);
        LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3
            @Override // androidx.lifecycle.LifecycleEventObserver
            /* JADX INFO: renamed from: c */
            public void mo130c(LifecycleOwner lifecycleOwner, Lifecycle3.a aVar) {
                c0208b.m922b(false);
            }
        };
        c0208b.f1303c = lifecycleEventObserver;
        this.f1288d.mo16727a(lifecycleEventObserver);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0152e
    /* JADX INFO: renamed from: h */
    public void mo666h(RecyclerView.AbstractC0149b0 abstractC0149b0, int i) {
        Bundle bundle;
        FragmentViewHolder fragmentViewHolder = (FragmentViewHolder) abstractC0149b0;
        long j2 = fragmentViewHolder.f1007f;
        int id = ((FrameLayout) fragmentViewHolder.f1003b).getId();
        Long lM917s = m917s(id);
        if (lM917s != null && lM917s.longValue() != j2) {
            m919u(lM917s.longValue());
            this.f1292h.m15594n(lM917s.longValue());
        }
        this.f1292h.m15593m(j2, Integer.valueOf(id));
        long j3 = i;
        if (!this.f1290f.m15587e(j3)) {
            Fragment fragmentMo915p = mo915p(i);
            Fragment.f fVarM15589i = this.f1291g.m15589i(j3);
            if (fragmentMo915p.f38450y != null) {
                throw new IllegalStateException("Fragment already added");
            }
            if (fVarM15589i == null || (bundle = fVarM15589i.f38470f) == null) {
                bundle = null;
            }
            fragmentMo915p.f38433h = bundle;
            this.f1290f.m15593m(j3, fragmentMo915p);
        }
        FrameLayout frameLayout = (FrameLayout) fragmentViewHolder.f1003b;
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        if (frameLayout.isAttachedToWindow()) {
            if (frameLayout.getParent() != null) {
                throw new IllegalStateException("Design assumption violated.");
            }
            frameLayout.addOnLayoutChangeListener(new FragmentStateAdapter2(this, frameLayout, fragmentViewHolder));
        }
        m916q();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0152e
    /* JADX INFO: renamed from: i */
    public RecyclerView.AbstractC0149b0 mo667i(ViewGroup viewGroup, int i) {
        int i2 = FragmentViewHolder.f37186u;
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        frameLayout.setId(View.generateViewId());
        frameLayout.setSaveEnabled(false);
        return new FragmentViewHolder(frameLayout);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0152e
    /* JADX INFO: renamed from: j */
    public void mo668j(RecyclerView recyclerView) {
        C0208b c0208b = this.f1293i;
        ViewPager2 viewPager2M921a = c0208b.m921a(recyclerView);
        viewPager2M921a.f1309h.f37189a.remove(c0208b.f1301a);
        FragmentStateAdapter fragmentStateAdapter = FragmentStateAdapter.this;
        fragmentStateAdapter.f1023a.unregisterObserver(c0208b.f1302b);
        FragmentStateAdapter.this.f1288d.mo16729c(c0208b.f1303c);
        c0208b.f1304d = null;
        this.f1293i = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0152e
    /* JADX INFO: renamed from: k */
    public /* bridge */ /* synthetic */ boolean mo669k(RecyclerView.AbstractC0149b0 abstractC0149b0) {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0152e
    /* JADX INFO: renamed from: l */
    public void mo670l(RecyclerView.AbstractC0149b0 abstractC0149b0) {
        m918t((FragmentViewHolder) abstractC0149b0);
        m916q();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0152e
    /* JADX INFO: renamed from: m */
    public void mo671m(RecyclerView.AbstractC0149b0 abstractC0149b0) {
        Long lM917s = m917s(((FrameLayout) ((FragmentViewHolder) abstractC0149b0).f1003b).getId());
        if (lM917s != null) {
            m919u(lM917s.longValue());
            this.f1292h.m15594n(lM917s.longValue());
        }
    }

    /* JADX INFO: renamed from: n */
    public void m913n(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (view.getParent() == frameLayout) {
            return;
        }
        if (frameLayout.getChildCount() > 0) {
            frameLayout.removeAllViews();
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        frameLayout.addView(view);
    }

    /* JADX INFO: renamed from: o */
    public boolean m914o(long j2) {
        return j2 >= 0 && j2 < ((long) mo662d());
    }

    /* JADX INFO: renamed from: p */
    public abstract Fragment mo915p(int i);

    /* JADX INFO: renamed from: q */
    public void m916q() {
        Fragment fragmentM15590j;
        View view;
        if (!this.f1295k || m920v()) {
            return;
        }
        ArraySet2 arraySet2 = new ArraySet2();
        for (int i = 0; i < this.f1290f.m15595o(); i++) {
            long jM15592l = this.f1290f.m15592l(i);
            if (!m914o(jM15592l)) {
                arraySet2.add(Long.valueOf(jM15592l));
                this.f1292h.m15594n(jM15592l);
            }
        }
        if (!this.f1294j) {
            this.f1295k = false;
            for (int i2 = 0; i2 < this.f1290f.m15595o(); i2++) {
                long jM15592l2 = this.f1290f.m15592l(i2);
                boolean z = true;
                if (!this.f1292h.m15587e(jM15592l2) && ((fragmentM15590j = this.f1290f.m15590j(jM15592l2, null)) == null || (view = fragmentM15590j.f38416M) == null || view.getParent() == null)) {
                    z = false;
                }
                if (!z) {
                    arraySet2.add(Long.valueOf(jM15592l2));
                }
            }
        }
        Iterator it = arraySet2.iterator();
        while (it.hasNext()) {
            m919u(((Long) it.next()).longValue());
        }
    }

    /* JADX INFO: renamed from: s */
    public final Long m917s(int i) {
        Long lValueOf = null;
        for (int i2 = 0; i2 < this.f1292h.m15595o(); i2++) {
            if (this.f1292h.m15596p(i2).intValue() == i) {
                if (lValueOf != null) {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
                lValueOf = Long.valueOf(this.f1292h.m15592l(i2));
            }
        }
        return lValueOf;
    }

    /* JADX INFO: renamed from: t */
    public void m918t(final FragmentViewHolder fragmentViewHolder) {
        Fragment fragmentM15589i = this.f1290f.m15589i(fragmentViewHolder.f1007f);
        if (fragmentM15589i == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        FrameLayout frameLayout = (FrameLayout) fragmentViewHolder.f1003b;
        View view = fragmentM15589i.f38416M;
        if (!fragmentM15589i.m16550S() && view != null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (fragmentM15589i.m16550S() && view == null) {
            this.f1289e.f38628n.f38600a.add(new FragmentLifecycleCallbacksDispatcher.a(new FragmentStateAdapter3(this, fragmentM15589i, frameLayout), false));
            return;
        }
        if (fragmentM15589i.m16550S() && view.getParent() != null) {
            if (view.getParent() != frameLayout) {
                m913n(view, frameLayout);
                return;
            }
            return;
        }
        if (fragmentM15589i.m16550S()) {
            m913n(view, frameLayout);
            return;
        }
        if (m920v()) {
            if (this.f1289e.f38607D) {
                return;
            }
            this.f1288d.mo16727a(new LifecycleEventObserver() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.2
                @Override // androidx.lifecycle.LifecycleEventObserver
                /* JADX INFO: renamed from: c */
                public void mo130c(LifecycleOwner lifecycleOwner, Lifecycle3.a aVar) {
                    if (FragmentStateAdapter.this.m920v()) {
                        return;
                    }
                    lifecycleOwner.mo124b().mo16729c(this);
                    FrameLayout frameLayout2 = (FrameLayout) fragmentViewHolder.f1003b;
                    AtomicInteger atomicInteger = ViewCompat.f38073a;
                    if (frameLayout2.isAttachedToWindow()) {
                        FragmentStateAdapter.this.m918t(fragmentViewHolder);
                    }
                }
            });
            return;
        }
        this.f1289e.f38628n.f38600a.add(new FragmentLifecycleCallbacksDispatcher.a(new FragmentStateAdapter3(this, fragmentM15589i, frameLayout), false));
        BackStackRecord backStackRecord = new BackStackRecord(this.f1289e);
        StringBuilder sbM1556G = outline.m1556G("f");
        sbM1556G.append(fragmentViewHolder.f1007f);
        backStackRecord.mo16448g(0, fragmentM15589i, sbM1556G.toString(), 1);
        backStackRecord.mo16450k(fragmentM15589i, Lifecycle3.b.STARTED);
        backStackRecord.mo16445d();
        this.f1293i.m922b(false);
    }

    /* JADX INFO: renamed from: u */
    public final void m919u(long j2) {
        Bundle bundleM16489o;
        ViewParent parent;
        Fragment.f fVar = null;
        Fragment fragmentM15590j = this.f1290f.m15590j(j2, null);
        if (fragmentM15590j == null) {
            return;
        }
        View view = fragmentM15590j.f38416M;
        if (view != null && (parent = view.getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        if (!m914o(j2)) {
            this.f1291g.m15594n(j2);
        }
        if (!fragmentM15590j.m16550S()) {
            this.f1290f.m15594n(j2);
            return;
        }
        if (m920v()) {
            this.f1295k = true;
            return;
        }
        if (fragmentM15590j.m16550S() && m914o(j2)) {
            LongSparseArray<Fragment.f> longSparseArray = this.f1291g;
            FragmentManager fragmentManager = this.f1289e;
            FragmentStateManager fragmentStateManagerM16500h = fragmentManager.f38617c.m16500h(fragmentM15590j.f38437l);
            if (fragmentStateManagerM16500h == null || !fragmentStateManagerM16500h.f38341c.equals(fragmentM15590j)) {
                fragmentManager.m16694k0(new IllegalStateException(outline.m1597s("Fragment ", fragmentM15590j, " is not currently in the FragmentManager")));
                throw null;
            }
            if (fragmentStateManagerM16500h.f38341c.f38432g > -1 && (bundleM16489o = fragmentStateManagerM16500h.m16489o()) != null) {
                fVar = new Fragment.f(bundleM16489o);
            }
            longSparseArray.m15593m(j2, fVar);
        }
        BackStackRecord backStackRecord = new BackStackRecord(this.f1289e);
        backStackRecord.mo16449h(fragmentM15590j);
        backStackRecord.mo16445d();
        this.f1290f.m15594n(j2);
    }

    /* JADX INFO: renamed from: v */
    public boolean m920v() {
        return this.f1289e.m16665S();
    }

    public FragmentStateAdapter(Fragment fragment) {
        this(fragment.m16570w(), fragment.f38425V);
    }

    public FragmentStateAdapter(FragmentManager fragmentManager, Lifecycle3 lifecycle3) {
        this.f1290f = new LongSparseArray<>();
        this.f1291g = new LongSparseArray<>();
        this.f1292h = new LongSparseArray<>();
        this.f1294j = false;
        this.f1295k = false;
        this.f1289e = fragmentManager;
        this.f1288d = lifecycle3;
        if (!this.f1023a.m672a()) {
            this.f1024b = true;
            return;
        }
        throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
    }
}
