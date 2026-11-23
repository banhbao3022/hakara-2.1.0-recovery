package p007c.p085g.p086a.p105n;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import p007c.p085g.p086a.p112s.Util4;

/* JADX INFO: renamed from: c.g.a.n.a, reason: use source file name */
/* JADX INFO: compiled from: ActivityFragmentLifecycle.java */
/* JADX INFO: loaded from: classes.dex */
public class ActivityFragmentLifecycle implements Lifecycle2 {

    /* JADX INFO: renamed from: a */
    public final Set<LifecycleListener> f3669a = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: b */
    public boolean f3670b;

    /* JADX INFO: renamed from: c */
    public boolean f3671c;

    @Override // p007c.p085g.p086a.p105n.Lifecycle2
    /* JADX INFO: renamed from: a */
    public void mo1937a(LifecycleListener lifecycleListener) {
        this.f3669a.add(lifecycleListener);
        if (this.f3671c) {
            lifecycleListener.onDestroy();
        } else if (this.f3670b) {
            lifecycleListener.mo1650j();
        } else {
            lifecycleListener.mo1649e();
        }
    }

    @Override // p007c.p085g.p086a.p105n.Lifecycle2
    /* JADX INFO: renamed from: b */
    public void mo1938b(LifecycleListener lifecycleListener) {
        this.f3669a.remove(lifecycleListener);
    }

    /* JADX INFO: renamed from: c */
    public void m1939c() {
        this.f3671c = true;
        Iterator it = ((ArrayList) Util4.m2050e(this.f3669a)).iterator();
        while (it.hasNext()) {
            ((LifecycleListener) it.next()).onDestroy();
        }
    }

    /* JADX INFO: renamed from: d */
    public void m1940d() {
        this.f3670b = true;
        Iterator it = ((ArrayList) Util4.m2050e(this.f3669a)).iterator();
        while (it.hasNext()) {
            ((LifecycleListener) it.next()).mo1650j();
        }
    }

    /* JADX INFO: renamed from: e */
    public void m1941e() {
        this.f3670b = false;
        Iterator it = ((ArrayList) Util4.m2050e(this.f3669a)).iterator();
        while (it.hasNext()) {
            ((LifecycleListener) it.next()).mo1649e();
        }
    }
}
