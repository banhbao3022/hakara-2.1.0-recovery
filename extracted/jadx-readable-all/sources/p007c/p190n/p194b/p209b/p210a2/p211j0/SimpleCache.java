package p007c.p190n.p194b.p209b.p210a2.p211j0;

import android.os.ConditionVariable;

/* JADX INFO: renamed from: c.n.b.b.a2.j0.r, reason: use source file name */
/* JADX INFO: compiled from: SimpleCache.java */
/* JADX INFO: loaded from: classes.dex */
public class SimpleCache extends Thread {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ConditionVariable f6113f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ SimpleCache2 f6114g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleCache(SimpleCache2 simpleCache2, String str, ConditionVariable conditionVariable) {
        super(str);
        this.f6114g = simpleCache2;
        this.f6113f = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        synchronized (this.f6114g) {
            this.f6113f.open();
            SimpleCache2.m2987j(this.f6114g);
            this.f6114g.f6117c.mo2955e();
        }
    }
}
