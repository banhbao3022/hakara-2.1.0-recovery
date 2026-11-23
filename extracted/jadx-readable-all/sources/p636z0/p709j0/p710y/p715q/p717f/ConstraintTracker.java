package p636z0.p709j0.p710y.p715q.p717f;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p636z0.p709j0.Logger9;
import p636z0.p709j0.p710y.p715q.ConstraintListener;
import p636z0.p709j0.p710y.p720t.p722t.TaskExecutor2;
import p636z0.p709j0.p710y.p720t.p722t.WorkManagerTaskExecutor;

/* JADX INFO: renamed from: z0.j0.y.q.f.d, reason: use source file name */
/* JADX INFO: compiled from: ConstraintTracker.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class ConstraintTracker<T> {

    /* JADX INFO: renamed from: a */
    public static final String f37462a = Logger9.m15886e("ConstraintTracker");

    /* JADX INFO: renamed from: b */
    public final TaskExecutor2 f37463b;

    /* JADX INFO: renamed from: c */
    public final Context f37464c;

    /* JADX INFO: renamed from: d */
    public final Object f37465d = new Object();

    /* JADX INFO: renamed from: e */
    public final Set<ConstraintListener<T>> f37466e = new LinkedHashSet();

    /* JADX INFO: renamed from: f */
    public T f37467f;

    /* JADX INFO: renamed from: z0.j0.y.q.f.d$a */
    /* JADX INFO: compiled from: ConstraintTracker.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ List f37468f;

        public a(List list) {
            this.f37468f = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f37468f.iterator();
            while (it.hasNext()) {
                ((ConstraintListener) it.next()).mo15949a(ConstraintTracker.this.f37467f);
            }
        }
    }

    public ConstraintTracker(Context context, TaskExecutor2 taskExecutor2) {
        this.f37464c = context.getApplicationContext();
        this.f37463b = taskExecutor2;
    }

    /* JADX INFO: renamed from: a */
    public abstract T mo15957a();

    /* JADX INFO: renamed from: b */
    public void m15962b(ConstraintListener<T> constraintListener) {
        synchronized (this.f37465d) {
            if (this.f37466e.remove(constraintListener) && this.f37466e.isEmpty()) {
                mo15961e();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m15963c(T t) {
        synchronized (this.f37465d) {
            T t2 = this.f37467f;
            if (t2 != t && (t2 == null || !t2.equals(t))) {
                this.f37467f = t;
                ((WorkManagerTaskExecutor) this.f37463b).f37641c.execute(new a(new ArrayList(this.f37466e)));
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo15960d();

    /* JADX INFO: renamed from: e */
    public abstract void mo15961e();
}
