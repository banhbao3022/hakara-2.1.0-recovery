package p007c.p190n.p194b.p209b.p212b2;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: c.n.b.b.b2.d0, reason: use source file name */
/* JADX INFO: compiled from: SystemClock.java */
/* JADX INFO: loaded from: classes.dex */
public class SystemClock implements Clock2 {
    @Override // p007c.p190n.p194b.p209b.p212b2.Clock2
    /* JADX INFO: renamed from: a */
    public long mo3068a() {
        return android.os.SystemClock.elapsedRealtime();
    }

    @Override // p007c.p190n.p194b.p209b.p212b2.Clock2
    /* JADX INFO: renamed from: b */
    public long mo3069b() {
        return android.os.SystemClock.uptimeMillis();
    }

    @Override // p007c.p190n.p194b.p209b.p212b2.Clock2
    /* JADX INFO: renamed from: c */
    public SystemHandlerWrapper mo3070c(Looper looper, Handler.Callback callback) {
        return new SystemHandlerWrapper(new Handler(looper, callback));
    }
}
