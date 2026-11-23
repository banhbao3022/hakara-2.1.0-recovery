package p007c.p085g.p086a.p105n;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import p007c.p085g.p086a.p108q.Request2;

/* JADX INFO: renamed from: c.g.a.n.n, reason: use source file name */
/* JADX INFO: compiled from: RequestTracker.java */
/* JADX INFO: loaded from: classes.dex */
public class RequestTracker {

    /* JADX INFO: renamed from: a */
    public final Set<Request2> f3691a = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: b */
    public final List<Request2> f3692b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public boolean f3693c;

    /* JADX INFO: renamed from: a */
    public boolean m1952a(Request2 request2) {
        boolean z = true;
        if (request2 == null) {
            return true;
        }
        boolean zRemove = this.f3691a.remove(request2);
        if (!this.f3692b.remove(request2) && !zRemove) {
            z = false;
        }
        if (z) {
            request2.clear();
        }
        return z;
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.f3691a.size() + ", isPaused=" + this.f3693c + "}";
    }
}
