package p636z0.p752p.p753c;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;
import p636z0.p695h0.p696a.PagerAdapter2;
import p636z0.p759s.Lifecycle3;

/* JADX INFO: renamed from: z0.p.c.e0, reason: use source file name */
/* JADX INFO: compiled from: FragmentPagerAdapter.java */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class FragmentPagerAdapter extends PagerAdapter2 {

    /* JADX INFO: renamed from: b */
    public final FragmentManager f38310b;

    /* JADX INFO: renamed from: c */
    public final int f38311c;

    /* JADX INFO: renamed from: d */
    public FragmentTransaction f38312d;

    /* JADX INFO: renamed from: e */
    public Fragment f38313e;

    /* JADX INFO: renamed from: f */
    public boolean f38314f;

    @Deprecated
    public FragmentPagerAdapter(FragmentManager fragmentManager) {
        this(fragmentManager, 0);
    }

    /* JADX INFO: renamed from: m */
    public static String m16473m(int i, long j2) {
        return "android:switcher:" + i + ":" + j2;
    }

    @Override // p636z0.p695h0.p696a.PagerAdapter2
    /* JADX INFO: renamed from: a */
    public void mo12479a(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f38312d == null) {
            this.f38312d = new BackStackRecord(this.f38310b);
        }
        this.f38312d.mo16447f(fragment);
        if (fragment.equals(this.f38313e)) {
            this.f38313e = null;
        }
    }

    @Override // p636z0.p695h0.p696a.PagerAdapter2
    /* JADX INFO: renamed from: b */
    public void mo15662b(ViewGroup viewGroup) {
        FragmentTransaction fragmentTransaction = this.f38312d;
        if (fragmentTransaction != null) {
            if (!this.f38314f) {
                try {
                    this.f38314f = true;
                    fragmentTransaction.mo16446e();
                    this.f38314f = false;
                } catch (Throwable th) {
                    this.f38314f = false;
                    throw th;
                }
            }
            this.f38312d = null;
        }
    }

    @Override // p636z0.p695h0.p696a.PagerAdapter2
    /* JADX INFO: renamed from: f */
    public Object mo12482f(ViewGroup viewGroup, int i) {
        if (this.f38312d == null) {
            this.f38312d = new BackStackRecord(this.f38310b);
        }
        long j2 = i;
        Fragment fragmentM16656I = this.f38310b.m16656I(m16473m(viewGroup.getId(), j2));
        if (fragmentM16656I != null) {
            FragmentTransaction fragmentTransaction = this.f38312d;
            Objects.requireNonNull(fragmentTransaction);
            fragmentTransaction.m16505b(new FragmentTransaction.a(7, fragmentM16656I));
        } else {
            fragmentM16656I = mo13992l(i);
            this.f38312d.mo16448g(viewGroup.getId(), fragmentM16656I, m16473m(viewGroup.getId(), j2), 1);
        }
        if (fragmentM16656I != this.f38313e) {
            fragmentM16656I.mo13901P0(false);
            if (this.f38311c == 1) {
                this.f38312d.mo16450k(fragmentM16656I, Lifecycle3.b.STARTED);
            } else {
                fragmentM16656I.m16553T0(false);
            }
        }
        return fragmentM16656I;
    }

    @Override // p636z0.p695h0.p696a.PagerAdapter2
    /* JADX INFO: renamed from: g */
    public boolean mo12483g(View view, Object obj) {
        return ((Fragment) obj).f38416M == view;
    }

    @Override // p636z0.p695h0.p696a.PagerAdapter2
    /* JADX INFO: renamed from: h */
    public void mo12484h(Parcelable parcelable, ClassLoader classLoader) {
    }

    @Override // p636z0.p695h0.p696a.PagerAdapter2
    /* JADX INFO: renamed from: i */
    public Parcelable mo12485i() {
        return null;
    }

    @Override // p636z0.p695h0.p696a.PagerAdapter2
    /* JADX INFO: renamed from: j */
    public void mo15663j(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f38313e;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.mo13901P0(false);
                if (this.f38311c == 1) {
                    if (this.f38312d == null) {
                        this.f38312d = new BackStackRecord(this.f38310b);
                    }
                    this.f38312d.mo16450k(this.f38313e, Lifecycle3.b.STARTED);
                } else {
                    this.f38313e.m16553T0(false);
                }
            }
            fragment.mo13901P0(true);
            if (this.f38311c == 1) {
                if (this.f38312d == null) {
                    this.f38312d = new BackStackRecord(this.f38310b);
                }
                this.f38312d.mo16450k(fragment, Lifecycle3.b.RESUMED);
            } else {
                fragment.m16553T0(true);
            }
            this.f38313e = fragment;
        }
    }

    @Override // p636z0.p695h0.p696a.PagerAdapter2
    /* JADX INFO: renamed from: k */
    public void mo15664k(ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }

    /* JADX INFO: renamed from: l */
    public abstract Fragment mo13992l(int i);

    public FragmentPagerAdapter(FragmentManager fragmentManager, int i) {
        this.f38312d = null;
        this.f38313e = null;
        this.f38310b = fragmentManager;
        this.f38311c = i;
    }
}
