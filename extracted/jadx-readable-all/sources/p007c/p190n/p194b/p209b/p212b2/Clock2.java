package p007c.p190n.p194b.p209b.p212b2;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: c.n.b.b.b2.g, reason: use source file name */
/* JADX INFO: compiled from: Clock.java */
/* JADX INFO: loaded from: classes.dex */
public interface Clock2 {

    /* JADX INFO: renamed from: a */
    public static final Clock2 f6300a = new SystemClock();

    /* JADX INFO: renamed from: a */
    long mo3068a();

    /* JADX INFO: renamed from: b */
    long mo3069b();

    /* JADX INFO: renamed from: c */
    SystemHandlerWrapper mo3070c(Looper looper, Handler.Callback callback);
}
