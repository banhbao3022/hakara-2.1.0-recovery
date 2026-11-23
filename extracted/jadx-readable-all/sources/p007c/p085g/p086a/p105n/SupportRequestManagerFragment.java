package p007c.p085g.p086a.p105n;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import p007c.p085g.p086a.Glide;
import p007c.p085g.p086a.RequestManager;
import p636z0.p752p.p753c.Fragment;
import p636z0.p752p.p753c.FragmentManager;

/* JADX INFO: renamed from: c.g.a.n.o, reason: use source file name */
/* JADX INFO: compiled from: SupportRequestManagerFragment.java */
/* JADX INFO: loaded from: classes.dex */
public class SupportRequestManagerFragment extends Fragment {

    /* JADX INFO: renamed from: c0 */
    public final ActivityFragmentLifecycle f3694c0;

    /* JADX INFO: renamed from: d0 */
    public final RequestManagerTreeNode f3695d0;

    /* JADX INFO: renamed from: e0 */
    public final Set<SupportRequestManagerFragment> f3696e0;

    /* JADX INFO: renamed from: f0 */
    public SupportRequestManagerFragment f3697f0;

    /* JADX INFO: renamed from: g0 */
    public RequestManager f3698g0;

    /* JADX INFO: renamed from: h0 */
    public Fragment f3699h0;

    /* JADX INFO: renamed from: c.g.a.n.o$a */
    /* JADX INFO: compiled from: SupportRequestManagerFragment.java */
    public class a implements RequestManagerTreeNode {
        public a() {
        }

        public String toString() {
            return super.toString() + "{fragment=" + SupportRequestManagerFragment.this + "}";
        }
    }

    public SupportRequestManagerFragment() {
        this(new ActivityFragmentLifecycle());
    }

    /* JADX INFO: renamed from: W0 */
    public final Fragment m1953W0() {
        Fragment fragment = this.f38405B;
        return fragment != null ? fragment : this.f3699h0;
    }

    /* JADX INFO: renamed from: X0 */
    public final void m1954X0(Context context, FragmentManager fragmentManager) {
        m1955Y0();
        RequestManagerRetriever requestManagerRetriever = Glide.m1624b(context).f2861m;
        Objects.requireNonNull(requestManagerRetriever);
        SupportRequestManagerFragment supportRequestManagerFragmentM1950e = requestManagerRetriever.m1950e(fragmentManager, null, RequestManagerRetriever.m1946f(context));
        this.f3697f0 = supportRequestManagerFragmentM1950e;
        if (equals(supportRequestManagerFragmentM1950e)) {
            return;
        }
        this.f3697f0.f3696e0.add(this);
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m1955Y0() {
        SupportRequestManagerFragment supportRequestManagerFragment = this.f3697f0;
        if (supportRequestManagerFragment != null) {
            supportRequestManagerFragment.f3696e0.remove(this);
            this.f3697f0 = null;
        }
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: Z */
    public void mo463Z(Context context) {
        super.mo463Z(context);
        Fragment fragment = this;
        while (true) {
            Fragment fragment2 = fragment.f38405B;
            if (fragment2 == null) {
                break;
            } else {
                fragment = fragment2;
            }
        }
        FragmentManager fragmentManager = fragment.f38450y;
        if (fragmentManager == null) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root, ancestor detached");
            }
        } else {
            try {
                m1954X0(m16571x(), fragmentManager);
            } catch (IllegalStateException e) {
                if (Log.isLoggable("SupportRMFragment", 5)) {
                    Log.w("SupportRMFragment", "Unable to register fragment with root", e);
                }
            }
        }
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: g0 */
    public void mo1956g0() {
        this.f38414K = true;
        this.f3694c0.m1939c();
        m1955Y0();
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: i0 */
    public void mo1957i0() {
        this.f38414K = true;
        this.f3699h0 = null;
        m1955Y0();
    }

    @Override // p636z0.p752p.p753c.Fragment
    public String toString() {
        return super.toString() + "{parent=" + m1953W0() + "}";
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: u0 */
    public void mo1958u0() {
        this.f38414K = true;
        this.f3694c0.m1940d();
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: v0 */
    public void mo1959v0() {
        this.f38414K = true;
        this.f3694c0.m1941e();
    }

    @SuppressLint({"ValidFragment"})
    public SupportRequestManagerFragment(ActivityFragmentLifecycle activityFragmentLifecycle) {
        this.f3695d0 = new a();
        this.f3696e0 = new HashSet();
        this.f3694c0 = activityFragmentLifecycle;
    }
}
