package p007c.p165l.p166h0.p168c0;

import android.util.Log;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: renamed from: c.l.h0.c0.k, reason: use source file name */
/* JADX INFO: compiled from: ViewIndexer.java */
/* JADX INFO: loaded from: classes.dex */
public class ViewIndexer2 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ TimerTask f4655f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ViewIndexer5 f4656g;

    public ViewIndexer2(ViewIndexer5 viewIndexer5, TimerTask timerTask) {
        this.f4656g = viewIndexer5;
        this.f4655f = timerTask;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Timer timer = this.f4656g.f4662d;
            if (timer != null) {
                timer.cancel();
            }
            ViewIndexer5 viewIndexer5 = this.f4656g;
            viewIndexer5.f4663e = null;
            viewIndexer5.f4662d = new Timer();
            this.f4656g.f4662d.scheduleAtFixedRate(this.f4655f, 0L, 1000L);
        } catch (Exception e) {
            Log.e(ViewIndexer5.f4659a, "Error scheduling indexing job", e);
        }
    }
}
