package p636z0.p709j0.p710y.p711p.p712a;

import p636z0.p709j0.Logger9;
import p636z0.p709j0.p710y.p719s.WorkSpec;

/* JADX INFO: renamed from: z0.j0.y.p.a.a, reason: use source file name */
/* JADX INFO: compiled from: DelayedWorkTracker.java */
/* JADX INFO: loaded from: classes.dex */
public class DelayedWorkTracker implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ WorkSpec f37383f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ DelayedWorkTracker2 f37384g;

    public DelayedWorkTracker(DelayedWorkTracker2 delayedWorkTracker2, WorkSpec workSpec) {
        this.f37384g = delayedWorkTracker2;
        this.f37383f = workSpec;
    }

    @Override // java.lang.Runnable
    public void run() {
        Logger9.m15885c().mo15887a(DelayedWorkTracker2.f37385a, String.format("Scheduling work %s", this.f37383f.f37524a), new Throwable[0]);
        this.f37384g.f37386b.mo15908a(this.f37383f);
    }
}
