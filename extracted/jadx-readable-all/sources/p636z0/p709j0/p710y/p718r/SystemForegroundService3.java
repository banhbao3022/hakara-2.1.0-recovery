package p636z0.p709j0.p710y.p718r;

import androidx.work.impl.foreground.SystemForegroundService;

/* JADX INFO: renamed from: z0.j0.y.r.e, reason: use source file name */
/* JADX INFO: compiled from: SystemForegroundService.java */
/* JADX INFO: loaded from: classes.dex */
public class SystemForegroundService3 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f37499f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ SystemForegroundService f37500g;

    public SystemForegroundService3(SystemForegroundService systemForegroundService, int i) {
        this.f37500g = systemForegroundService;
        this.f37499f = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f37500g.f1401k.cancel(this.f37499f);
    }
}
