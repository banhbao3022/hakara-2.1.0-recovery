package p636z0.p709j0.p710y.p723u;

import androidx.work.impl.workers.ConstraintTrackingWorker;
import p007c.p190n.p378c.p383e.p384a.ListenableFuture;

/* JADX INFO: renamed from: z0.j0.y.u.a, reason: use source file name */
/* JADX INFO: compiled from: ConstraintTrackingWorker.java */
/* JADX INFO: loaded from: classes.dex */
public class ConstraintTrackingWorker2 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ListenableFuture f37643f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ConstraintTrackingWorker f37644g;

    public ConstraintTrackingWorker2(ConstraintTrackingWorker constraintTrackingWorker, ListenableFuture listenableFuture) {
        this.f37644g = constraintTrackingWorker;
        this.f37643f = listenableFuture;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f37644g.f1414m) {
            if (this.f37644g.f1415n) {
                this.f37644g.m968c();
            } else {
                this.f37644g.f1416o.m16029m(this.f37643f);
            }
        }
    }
}
