package p636z0.p709j0.p710y.p718r;

import android.app.Notification;
import androidx.work.impl.foreground.SystemForegroundService;

/* JADX INFO: renamed from: z0.j0.y.r.d, reason: use source file name */
/* JADX INFO: compiled from: SystemForegroundService.java */
/* JADX INFO: loaded from: classes.dex */
public class SystemForegroundService2 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f37496f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Notification f37497g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ SystemForegroundService f37498h;

    public SystemForegroundService2(SystemForegroundService systemForegroundService, int i, Notification notification) {
        this.f37498h = systemForegroundService;
        this.f37496f = i;
        this.f37497g = notification;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f37498h.f1401k.notify(this.f37496f, this.f37497g);
    }
}
