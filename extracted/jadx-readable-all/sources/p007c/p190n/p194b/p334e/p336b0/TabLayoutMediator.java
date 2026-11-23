package p007c.p190n.p194b.p334e.p336b0;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: c.n.b.e.b0.e, reason: use source file name */
/* JADX INFO: compiled from: TabLayoutMediator.java */
/* JADX INFO: loaded from: classes.dex */
public final class TabLayoutMediator {

    /* JADX INFO: renamed from: a */
    public final TabLayout f24777a;

    /* JADX INFO: renamed from: b */
    public final ViewPager2 f24778b;

    /* JADX INFO: renamed from: c */
    public final boolean f24779c;

    /* JADX INFO: renamed from: d */
    public final boolean f24780d;

    /* JADX INFO: renamed from: e */
    public final b f24781e;

    /* JADX INFO: renamed from: f */
    public RecyclerView.AbstractC0152e<?> f24782f;

    /* JADX INFO: renamed from: g */
    public boolean f24783g;

    /* JADX INFO: renamed from: h */
    public c f24784h;

    /* JADX INFO: renamed from: i */
    public TabLayout.InterfaceC5966d f24785i;

    /* JADX INFO: renamed from: j */
    public RecyclerView.AbstractC0154g f24786j;

    /* JADX INFO: renamed from: c.n.b.e.b0.e$a */
    /* JADX INFO: compiled from: TabLayoutMediator.java */
    public class a extends RecyclerView.AbstractC0154g {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0154g
        /* JADX INFO: renamed from: a */
        public void mo678a() {
            TabLayoutMediator.this.m11025b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0154g
        /* JADX INFO: renamed from: b */
        public void mo679b(int i, int i2) {
            TabLayoutMediator.this.m11025b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0154g
        /* JADX INFO: renamed from: c */
        public void mo680c(int i, int i2, Object obj) {
            TabLayoutMediator.this.m11025b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0154g
        /* JADX INFO: renamed from: d */
        public void mo681d(int i, int i2) {
            TabLayoutMediator.this.m11025b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0154g
        /* JADX INFO: renamed from: e */
        public void mo682e(int i, int i2, int i3) {
            TabLayoutMediator.this.m11025b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0154g
        /* JADX INFO: renamed from: f */
        public void mo683f(int i, int i2) {
            TabLayoutMediator.this.m11025b();
        }
    }

    /* JADX INFO: renamed from: c.n.b.e.b0.e$b */
    /* JADX INFO: compiled from: TabLayoutMediator.java */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo11026a(TabLayout.C5969g c5969g, int i);
    }

    /* JADX INFO: renamed from: c.n.b.e.b0.e$c */
    /* JADX INFO: compiled from: TabLayoutMediator.java */
    public static class c extends ViewPager2.AbstractC0215g {

        /* JADX INFO: renamed from: a */
        public final WeakReference<TabLayout> f24788a;

        /* JADX INFO: renamed from: c */
        public int f24790c = 0;

        /* JADX INFO: renamed from: b */
        public int f24789b = 0;

        public c(TabLayout tabLayout) {
            this.f24788a = new WeakReference<>(tabLayout);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0215g
        /* JADX INFO: renamed from: a */
        public void mo928a(int i) {
            this.f24789b = this.f24790c;
            this.f24790c = i;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0215g
        /* JADX INFO: renamed from: b */
        public void mo932b(int i, float f, int i2) {
            TabLayout tabLayout = this.f24788a.get();
            if (tabLayout != null) {
                int i3 = this.f24790c;
                tabLayout.m12828m(i, f, i3 != 2 || this.f24789b == 1, (i3 == 2 && this.f24789b == 0) ? false : true);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0215g
        /* JADX INFO: renamed from: c */
        public void mo929c(int i) {
            TabLayout tabLayout = this.f24788a.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i || i >= tabLayout.getTabCount()) {
                return;
            }
            int i2 = this.f24790c;
            tabLayout.m12826k(tabLayout.m12822g(i), i2 == 0 || (i2 == 2 && this.f24789b == 0));
        }
    }

    /* JADX INFO: renamed from: c.n.b.e.b0.e$d */
    /* JADX INFO: compiled from: TabLayoutMediator.java */
    public static class d implements TabLayout.InterfaceC5966d {

        /* JADX INFO: renamed from: a */
        public final ViewPager2 f24791a;

        /* JADX INFO: renamed from: b */
        public final boolean f24792b;

        public d(ViewPager2 viewPager2, boolean z) {
            this.f24791a = viewPager2;
            this.f24792b = z;
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC5965c
        /* JADX INFO: renamed from: a */
        public void mo11027a(TabLayout.C5969g c5969g) {
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC5965c
        /* JADX INFO: renamed from: b */
        public void mo11028b(TabLayout.C5969g c5969g) {
            ViewPager2 viewPager2 = this.f24791a;
            int i = c5969g.f29081d;
            boolean z = this.f24792b;
            if (viewPager2.f1320s.f37190a.f37205m) {
                throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
            }
            viewPager2.m926d(i, z);
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC5965c
        /* JADX INFO: renamed from: c */
        public void mo11029c(TabLayout.C5969g c5969g) {
        }
    }

    public TabLayoutMediator(TabLayout tabLayout, ViewPager2 viewPager2, b bVar) {
        this(tabLayout, viewPager2, true, bVar);
    }

    /* JADX INFO: renamed from: a */
    public void m11024a() {
        if (this.f24783g) {
            throw new IllegalStateException("TabLayoutMediator is already attached");
        }
        RecyclerView.AbstractC0152e<?> adapter = this.f24778b.getAdapter();
        this.f24782f = adapter;
        if (adapter == null) {
            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        this.f24783g = true;
        c cVar = new c(this.f24777a);
        this.f24784h = cVar;
        this.f24778b.f1309h.f37189a.add(cVar);
        d dVar = new d(this.f24778b, this.f24780d);
        this.f24785i = dVar;
        TabLayout tabLayout = this.f24777a;
        if (!tabLayout.f29034M.contains(dVar)) {
            tabLayout.f29034M.add(dVar);
        }
        if (this.f24779c) {
            a aVar = new a();
            this.f24786j = aVar;
            this.f24782f.f1023a.registerObserver(aVar);
        }
        m11025b();
        this.f24777a.m12828m(this.f24778b.getCurrentItem(), 0.0f, true, true);
    }

    /* JADX INFO: renamed from: b */
    public void m11025b() {
        this.f24777a.m12825j();
        RecyclerView.AbstractC0152e<?> abstractC0152e = this.f24782f;
        if (abstractC0152e != null) {
            int iMo662d = abstractC0152e.mo662d();
            for (int i = 0; i < iMo662d; i++) {
                TabLayout.C5969g c5969gM12823h = this.f24777a.m12823h();
                this.f24781e.mo11026a(c5969gM12823h, i);
                this.f24777a.m12816a(c5969gM12823h, false);
            }
            if (iMo662d > 0) {
                int iMin = Math.min(this.f24778b.getCurrentItem(), this.f24777a.getTabCount() - 1);
                if (iMin != this.f24777a.getSelectedTabPosition()) {
                    TabLayout tabLayout = this.f24777a;
                    tabLayout.m12826k(tabLayout.m12822g(iMin), true);
                }
            }
        }
    }

    public TabLayoutMediator(TabLayout tabLayout, ViewPager2 viewPager2, boolean z, b bVar) {
        this(tabLayout, viewPager2, z, true, bVar);
    }

    public TabLayoutMediator(TabLayout tabLayout, ViewPager2 viewPager2, boolean z, boolean z2, b bVar) {
        this.f24777a = tabLayout;
        this.f24778b = viewPager2;
        this.f24779c = z;
        this.f24780d = z2;
        this.f24781e = bVar;
    }
}
