package p636z0.p752p.p753c;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: z0.p.c.y, reason: use source file name */
/* JADX INFO: compiled from: FragmentLifecycleCallbacksDispatcher.java */
/* JADX INFO: loaded from: classes.dex */
public class FragmentLifecycleCallbacksDispatcher {

    /* JADX INFO: renamed from: a */
    public final CopyOnWriteArrayList<a> f38600a = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: b */
    public final FragmentManager f38601b;

    /* JADX INFO: renamed from: z0.p.c.y$a */
    /* JADX INFO: compiled from: FragmentLifecycleCallbacksDispatcher.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final FragmentManager.k f38602a;

        /* JADX INFO: renamed from: b */
        public final boolean f38603b;

        public a(FragmentManager.k kVar, boolean z) {
            this.f38602a = kVar;
            this.f38603b = z;
        }
    }

    public FragmentLifecycleCallbacksDispatcher(FragmentManager fragmentManager) {
        this.f38601b = fragmentManager;
    }

    /* JADX INFO: renamed from: a */
    public void m16633a(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.f38601b.f38633s;
        if (fragment2 != null) {
            fragment2.m16529H().f38628n.m16633a(fragment, bundle, true);
        }
        for (a aVar : this.f38600a) {
            if (!z || aVar.f38603b) {
                Objects.requireNonNull(aVar.f38602a);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m16634b(Fragment fragment, boolean z) {
        FragmentManager fragmentManager = this.f38601b;
        Context context = fragmentManager.f38631q.f38565g;
        Fragment fragment2 = fragmentManager.f38633s;
        if (fragment2 != null) {
            fragment2.m16529H().f38628n.m16634b(fragment, true);
        }
        for (a aVar : this.f38600a) {
            if (!z || aVar.f38603b) {
                Objects.requireNonNull(aVar.f38602a);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m16635c(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.f38601b.f38633s;
        if (fragment2 != null) {
            fragment2.m16529H().f38628n.m16635c(fragment, bundle, true);
        }
        for (a aVar : this.f38600a) {
            if (!z || aVar.f38603b) {
                Objects.requireNonNull(aVar.f38602a);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m16636d(Fragment fragment, boolean z) {
        Fragment fragment2 = this.f38601b.f38633s;
        if (fragment2 != null) {
            fragment2.m16529H().f38628n.m16636d(fragment, true);
        }
        for (a aVar : this.f38600a) {
            if (!z || aVar.f38603b) {
                Objects.requireNonNull(aVar.f38602a);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void m16637e(Fragment fragment, boolean z) {
        Fragment fragment2 = this.f38601b.f38633s;
        if (fragment2 != null) {
            fragment2.m16529H().f38628n.m16637e(fragment, true);
        }
        for (a aVar : this.f38600a) {
            if (!z || aVar.f38603b) {
                Objects.requireNonNull(aVar.f38602a);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m16638f(Fragment fragment, boolean z) {
        Fragment fragment2 = this.f38601b.f38633s;
        if (fragment2 != null) {
            fragment2.m16529H().f38628n.m16638f(fragment, true);
        }
        for (a aVar : this.f38600a) {
            if (!z || aVar.f38603b) {
                Objects.requireNonNull(aVar.f38602a);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public void m16639g(Fragment fragment, boolean z) {
        FragmentManager fragmentManager = this.f38601b;
        Context context = fragmentManager.f38631q.f38565g;
        Fragment fragment2 = fragmentManager.f38633s;
        if (fragment2 != null) {
            fragment2.m16529H().f38628n.m16639g(fragment, true);
        }
        for (a aVar : this.f38600a) {
            if (!z || aVar.f38603b) {
                Objects.requireNonNull(aVar.f38602a);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public void m16640h(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.f38601b.f38633s;
        if (fragment2 != null) {
            fragment2.m16529H().f38628n.m16640h(fragment, bundle, true);
        }
        for (a aVar : this.f38600a) {
            if (!z || aVar.f38603b) {
                Objects.requireNonNull(aVar.f38602a);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public void m16641i(Fragment fragment, boolean z) {
        Fragment fragment2 = this.f38601b.f38633s;
        if (fragment2 != null) {
            fragment2.m16529H().f38628n.m16641i(fragment, true);
        }
        for (a aVar : this.f38600a) {
            if (!z || aVar.f38603b) {
                Objects.requireNonNull(aVar.f38602a);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public void m16642j(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.f38601b.f38633s;
        if (fragment2 != null) {
            fragment2.m16529H().f38628n.m16642j(fragment, bundle, true);
        }
        for (a aVar : this.f38600a) {
            if (!z || aVar.f38603b) {
                Objects.requireNonNull(aVar.f38602a);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m16643k(Fragment fragment, boolean z) {
        Fragment fragment2 = this.f38601b.f38633s;
        if (fragment2 != null) {
            fragment2.m16529H().f38628n.m16643k(fragment, true);
        }
        for (a aVar : this.f38600a) {
            if (!z || aVar.f38603b) {
                Objects.requireNonNull(aVar.f38602a);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public void m16644l(Fragment fragment, boolean z) {
        Fragment fragment2 = this.f38601b.f38633s;
        if (fragment2 != null) {
            fragment2.m16529H().f38628n.m16644l(fragment, true);
        }
        for (a aVar : this.f38600a) {
            if (!z || aVar.f38603b) {
                Objects.requireNonNull(aVar.f38602a);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public void m16645m(Fragment fragment, View view, Bundle bundle, boolean z) {
        Fragment fragment2 = this.f38601b.f38633s;
        if (fragment2 != null) {
            fragment2.m16529H().f38628n.m16645m(fragment, view, bundle, true);
        }
        for (a aVar : this.f38600a) {
            if (!z || aVar.f38603b) {
                aVar.f38602a.mo15863a(this.f38601b, fragment, view, bundle);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public void m16646n(Fragment fragment, boolean z) {
        Fragment fragment2 = this.f38601b.f38633s;
        if (fragment2 != null) {
            fragment2.m16529H().f38628n.m16646n(fragment, true);
        }
        for (a aVar : this.f38600a) {
            if (!z || aVar.f38603b) {
                Objects.requireNonNull(aVar.f38602a);
            }
        }
    }
}
