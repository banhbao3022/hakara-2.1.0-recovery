package p007c.p190n.p385d.p418r;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p007c.p190n.p194b.p266d.p298f.p307u.p308j.ThreadFactoryC2790a;

/* JADX INFO: renamed from: c.n.d.r.h */
/* JADX INFO: compiled from: com.google.firebase:firebase-iid@@21.0.1 */
/* JADX INFO: loaded from: classes.dex */
public class C5482h {

    /* JADX INFO: renamed from: a */
    public static final Executor f27066a = ExecutorC5481g.f27065f;

    /* JADX INFO: renamed from: a */
    public static ExecutorService m12068a() {
        return new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC2790a("firebase-iid-executor"));
    }
}
