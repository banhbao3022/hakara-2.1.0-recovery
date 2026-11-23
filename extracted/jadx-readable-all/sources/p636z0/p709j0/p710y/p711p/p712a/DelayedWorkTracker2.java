package p636z0.p709j0.p710y.p711p.p712a;

import java.util.HashMap;
import java.util.Map;
import p636z0.p709j0.Logger9;
import p636z0.p709j0.RunnableScheduler;

/* JADX INFO: renamed from: z0.j0.y.p.a.b, reason: use source file name */
/* JADX INFO: compiled from: DelayedWorkTracker.java */
/* JADX INFO: loaded from: classes.dex */
public class DelayedWorkTracker2 {

    /* JADX INFO: renamed from: a */
    public static final String f37385a = Logger9.m15886e("DelayedWorkTracker");

    /* JADX INFO: renamed from: b */
    public final GreedyScheduler f37386b;

    /* JADX INFO: renamed from: c */
    public final RunnableScheduler f37387c;

    /* JADX INFO: renamed from: d */
    public final Map<String, Runnable> f37388d = new HashMap();

    public DelayedWorkTracker2(GreedyScheduler greedyScheduler, RunnableScheduler runnableScheduler) {
        this.f37386b = greedyScheduler;
        this.f37387c = runnableScheduler;
    }
}
