package p007c.p085g.p086a.p105n;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import p007c.p085g.p086a.p108q.p109h.Target;
import p007c.p085g.p086a.p112s.Util4;

/* JADX INFO: renamed from: c.g.a.n.p, reason: use source file name */
/* JADX INFO: compiled from: TargetTracker.java */
/* JADX INFO: loaded from: classes.dex */
public final class TargetTracker implements LifecycleListener {

    /* JADX INFO: renamed from: f */
    public final Set<Target<?>> f3701f = Collections.newSetFromMap(new WeakHashMap());

    @Override // p007c.p085g.p086a.p105n.LifecycleListener
    /* JADX INFO: renamed from: e */
    public void mo1649e() {
        Iterator it = ((ArrayList) Util4.m2050e(this.f3701f)).iterator();
        while (it.hasNext()) {
            ((Target) it.next()).mo1649e();
        }
    }

    @Override // p007c.p085g.p086a.p105n.LifecycleListener
    /* JADX INFO: renamed from: j */
    public void mo1650j() {
        Iterator it = ((ArrayList) Util4.m2050e(this.f3701f)).iterator();
        while (it.hasNext()) {
            ((Target) it.next()).mo1650j();
        }
    }

    @Override // p007c.p085g.p086a.p105n.LifecycleListener
    public void onDestroy() {
        Iterator it = ((ArrayList) Util4.m2050e(this.f3701f)).iterator();
        while (it.hasNext()) {
            ((Target) it.next()).onDestroy();
        }
    }
}
