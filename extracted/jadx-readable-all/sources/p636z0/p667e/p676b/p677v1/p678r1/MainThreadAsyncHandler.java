package p636z0.p667e.p676b.p677v1.p678r1;

import android.os.Handler;
import android.os.Looper;
import p636z0.p725k.p735h.HandlerCompat;

/* JADX INFO: renamed from: z0.e.b.v1.r1.a, reason: use source file name */
/* JADX INFO: compiled from: MainThreadAsyncHandler.java */
/* JADX INFO: loaded from: classes.dex */
public final class MainThreadAsyncHandler {

    /* JADX INFO: renamed from: a */
    public static volatile Handler f36243a;

    /* JADX INFO: renamed from: a */
    public static Handler m15419a() {
        if (f36243a != null) {
            return f36243a;
        }
        synchronized (MainThreadAsyncHandler.class) {
            if (f36243a == null) {
                f36243a = HandlerCompat.m16203a(Looper.getMainLooper());
            }
        }
        return f36243a;
    }
}
