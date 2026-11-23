package p636z0.p709j0.p710y.p720t;

import androidx.work.WorkerParameters;
import p636z0.p709j0.p710y.WorkManagerImpl;

/* JADX INFO: renamed from: z0.j0.y.t.k, reason: use source file name */
/* JADX INFO: compiled from: StartWorkRunnable.java */
/* JADX INFO: loaded from: classes.dex */
public class StartWorkRunnable implements Runnable {

    /* JADX INFO: renamed from: f */
    public WorkManagerImpl f37577f;

    /* JADX INFO: renamed from: g */
    public String f37578g;

    /* JADX INFO: renamed from: h */
    public WorkerParameters.C0226a f37579h;

    public StartWorkRunnable(WorkManagerImpl workManagerImpl, String str, WorkerParameters.C0226a c0226a) {
        this.f37577f = workManagerImpl;
        this.f37578g = str;
        this.f37579h = c0226a;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f37577f.f37345j.m15904g(this.f37578g, this.f37579h);
    }
}
