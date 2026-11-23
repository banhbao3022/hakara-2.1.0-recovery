package p636z0.p709j0.p710y;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p636z0.p709j0.ExistingWorkPolicy;
import p636z0.p709j0.Logger9;
import p636z0.p709j0.Operation;
import p636z0.p709j0.WorkContinuation;
import p636z0.p709j0.WorkRequest;

/* JADX INFO: renamed from: z0.j0.y.g, reason: use source file name */
/* JADX INFO: compiled from: WorkContinuationImpl.java */
/* JADX INFO: loaded from: classes.dex */
public class WorkContinuationImpl extends WorkContinuation {

    /* JADX INFO: renamed from: a */
    public static final String f37315a = Logger9.m15886e("WorkContinuationImpl");

    /* JADX INFO: renamed from: b */
    public final WorkManagerImpl f37316b;

    /* JADX INFO: renamed from: c */
    public final String f37317c;

    /* JADX INFO: renamed from: d */
    public final ExistingWorkPolicy f37318d;

    /* JADX INFO: renamed from: e */
    public final List<? extends WorkRequest> f37319e;

    /* JADX INFO: renamed from: f */
    public final List<String> f37320f;

    /* JADX INFO: renamed from: g */
    public final List<String> f37321g;

    /* JADX INFO: renamed from: h */
    public final List<WorkContinuationImpl> f37322h;

    /* JADX INFO: renamed from: i */
    public boolean f37323i;

    /* JADX INFO: renamed from: j */
    public Operation f37324j;

    public WorkContinuationImpl(WorkManagerImpl workManagerImpl, List<? extends WorkRequest> list) {
        this(workManagerImpl, null, ExistingWorkPolicy.KEEP, list, null);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m15912a(WorkContinuationImpl workContinuationImpl, Set<String> set) {
        set.addAll(workContinuationImpl.f37320f);
        Set<String> setM15913b = m15913b(workContinuationImpl);
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            if (((HashSet) setM15913b).contains(it.next())) {
                return true;
            }
        }
        List<WorkContinuationImpl> list = workContinuationImpl.f37322h;
        if (list != null && !list.isEmpty()) {
            Iterator<WorkContinuationImpl> it2 = list.iterator();
            while (it2.hasNext()) {
                if (m15912a(it2.next(), set)) {
                    return true;
                }
            }
        }
        set.removeAll(workContinuationImpl.f37320f);
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static Set<String> m15913b(WorkContinuationImpl workContinuationImpl) {
        HashSet hashSet = new HashSet();
        List<WorkContinuationImpl> list = workContinuationImpl.f37322h;
        if (list != null && !list.isEmpty()) {
            Iterator<WorkContinuationImpl> it = list.iterator();
            while (it.hasNext()) {
                hashSet.addAll(it.next().f37320f);
            }
        }
        return hashSet;
    }

    public WorkContinuationImpl(WorkManagerImpl workManagerImpl, String str, ExistingWorkPolicy existingWorkPolicy, List<? extends WorkRequest> list) {
        this(workManagerImpl, str, existingWorkPolicy, list, null);
    }

    public WorkContinuationImpl(WorkManagerImpl workManagerImpl, String str, ExistingWorkPolicy existingWorkPolicy, List<? extends WorkRequest> list, List<WorkContinuationImpl> list2) {
        this.f37316b = workManagerImpl;
        this.f37317c = str;
        this.f37318d = existingWorkPolicy;
        this.f37319e = list;
        this.f37322h = list2;
        this.f37320f = new ArrayList(list.size());
        this.f37321g = new ArrayList();
        if (list2 != null) {
            Iterator<WorkContinuationImpl> it = list2.iterator();
            while (it.hasNext()) {
                this.f37321g.addAll(it.next().f37321g);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            String strM15894a = list.get(i).m15894a();
            this.f37320f.add(strM15894a);
            this.f37321g.add(strM15894a);
        }
    }
}
