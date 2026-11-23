package p636z0.p709j0.p710y.p715q.p716e;

import java.util.ArrayList;
import java.util.List;
import p636z0.p709j0.Logger9;
import p636z0.p709j0.p710y.p715q.ConstraintListener;
import p636z0.p709j0.p710y.p715q.WorkConstraintsCallback;
import p636z0.p709j0.p710y.p715q.WorkConstraintsTracker;
import p636z0.p709j0.p710y.p715q.p717f.ConstraintTracker;
import p636z0.p709j0.p710y.p719s.WorkSpec;

/* JADX INFO: renamed from: z0.j0.y.q.e.c, reason: use source file name */
/* JADX INFO: compiled from: ConstraintController.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class ConstraintController<T> implements ConstraintListener<T> {

    /* JADX INFO: renamed from: a */
    public final List<String> f37451a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public T f37452b;

    /* JADX INFO: renamed from: c */
    public ConstraintTracker<T> f37453c;

    /* JADX INFO: renamed from: d */
    public a f37454d;

    /* JADX INFO: renamed from: z0.j0.y.q.e.c$a */
    /* JADX INFO: compiled from: ConstraintController.java */
    public interface a {
    }

    public ConstraintController(ConstraintTracker<T> constraintTracker) {
        this.f37453c = constraintTracker;
    }

    @Override // p636z0.p709j0.p710y.p715q.ConstraintListener
    /* JADX INFO: renamed from: a */
    public void mo15949a(T t) {
        this.f37452b = t;
        m15956e(this.f37454d, t);
    }

    /* JADX INFO: renamed from: b */
    public abstract boolean mo15953b(WorkSpec workSpec);

    /* JADX INFO: renamed from: c */
    public abstract boolean mo15954c(T t);

    /* JADX INFO: renamed from: d */
    public void m15955d(Iterable<WorkSpec> iterable) {
        this.f37451a.clear();
        for (WorkSpec workSpec : iterable) {
            if (mo15953b(workSpec)) {
                this.f37451a.add(workSpec.f37524a);
            }
        }
        if (this.f37451a.isEmpty()) {
            this.f37453c.m15962b(this);
        } else {
            ConstraintTracker<T> constraintTracker = this.f37453c;
            synchronized (constraintTracker.f37465d) {
                if (constraintTracker.f37466e.add(this)) {
                    if (constraintTracker.f37466e.size() == 1) {
                        constraintTracker.f37467f = constraintTracker.mo15957a();
                        Logger9.m15885c().mo15887a(ConstraintTracker.f37462a, String.format("%s: initial state = %s", constraintTracker.getClass().getSimpleName(), constraintTracker.f37467f), new Throwable[0]);
                        constraintTracker.mo15960d();
                    }
                    mo15949a(constraintTracker.f37467f);
                }
            }
        }
        m15956e(this.f37454d, this.f37452b);
    }

    /* JADX INFO: renamed from: e */
    public final void m15956e(a aVar, T t) {
        if (this.f37451a.isEmpty() || aVar == null) {
            return;
        }
        if (t == null || mo15954c(t)) {
            List<String> list = this.f37451a;
            WorkConstraintsTracker workConstraintsTracker = (WorkConstraintsTracker) aVar;
            synchronized (workConstraintsTracker.f37450d) {
                WorkConstraintsCallback workConstraintsCallback = workConstraintsTracker.f37448b;
                if (workConstraintsCallback != null) {
                    workConstraintsCallback.mo967b(list);
                }
            }
            return;
        }
        List<String> list2 = this.f37451a;
        WorkConstraintsTracker workConstraintsTracker2 = (WorkConstraintsTracker) aVar;
        synchronized (workConstraintsTracker2.f37450d) {
            ArrayList arrayList = new ArrayList();
            for (String str : list2) {
                if (workConstraintsTracker2.m15950a(str)) {
                    Logger9.m15885c().mo15887a(WorkConstraintsTracker.f37447a, String.format("Constraints met for %s", str), new Throwable[0]);
                    arrayList.add(str);
                }
            }
            WorkConstraintsCallback workConstraintsCallback2 = workConstraintsTracker2.f37448b;
            if (workConstraintsCallback2 != null) {
                workConstraintsCallback2.mo969f(arrayList);
            }
        }
    }
}
