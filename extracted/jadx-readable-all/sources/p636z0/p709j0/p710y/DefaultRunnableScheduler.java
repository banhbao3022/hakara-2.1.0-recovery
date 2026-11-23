package p636z0.p709j0.p710y;

import android.os.Handler;
import android.os.Looper;
import p636z0.p709j0.RunnableScheduler;
import p636z0.p725k.p735h.HandlerCompat;

/* JADX INFO: renamed from: z0.j0.y.a, reason: use source file name */
/* JADX INFO: compiled from: DefaultRunnableScheduler.java */
/* JADX INFO: loaded from: classes.dex */
public class DefaultRunnableScheduler implements RunnableScheduler {

    /* JADX INFO: renamed from: a */
    public final Handler f37296a;

    public DefaultRunnableScheduler() {
        this.f37296a = HandlerCompat.m16203a(Looper.getMainLooper());
    }

    public DefaultRunnableScheduler(Handler handler) {
        this.f37296a = handler;
    }
}
