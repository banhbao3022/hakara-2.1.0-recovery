package p007c.p190n.p385d.p417q;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p007c.p190n.p385d.p390k.Lazy;
import p007c.p190n.p385d.p420s.Provider2;

/* JADX INFO: renamed from: c.n.d.q.d, reason: use source file name */
/* JADX INFO: compiled from: DefaultHeartBeatInfo.java */
/* JADX INFO: loaded from: classes.dex */
public class DefaultHeartBeatInfo4 implements HeartBeatInfo {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f27038a = 0;

    /* JADX INFO: renamed from: b */
    public Provider2<HeartBeatInfoStorage> f27039b;

    public DefaultHeartBeatInfo4(final Context context, Set<HeartBeatConsumer> set) {
        Lazy lazy = new Lazy(new Provider2(context) { // from class: c.n.d.q.a

            /* JADX INFO: renamed from: a */
            public final Context f27035a;

            {
                this.f27035a = context;
            }

            @Override // p007c.p190n.p385d.p420s.Provider2
            public Object get() {
                HeartBeatInfoStorage heartBeatInfoStorage;
                Context context2 = this.f27035a;
                int i = DefaultHeartBeatInfo4.f27038a;
                HeartBeatInfoStorage heartBeatInfoStorage2 = HeartBeatInfoStorage.f27040a;
                synchronized (HeartBeatInfoStorage.class) {
                    if (HeartBeatInfoStorage.f27040a == null) {
                        HeartBeatInfoStorage.f27040a = new HeartBeatInfoStorage(context2);
                    }
                    heartBeatInfoStorage = HeartBeatInfoStorage.f27040a;
                }
                return heartBeatInfoStorage;
            }
        });
        new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: c.n.d.q.c
            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                int i = DefaultHeartBeatInfo4.f27038a;
                return new Thread(runnable, "heartbeat-information-executor");
            }
        });
        this.f27039b = lazy;
    }

    @Override // p007c.p190n.p385d.p417q.HeartBeatInfo
    /* JADX INFO: renamed from: a */
    public int mo12059a(String str) {
        boolean zM12060a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean zM12060a2 = this.f27039b.get().m12060a(str, jCurrentTimeMillis);
        HeartBeatInfoStorage heartBeatInfoStorage = this.f27039b.get();
        synchronized (heartBeatInfoStorage) {
            zM12060a = heartBeatInfoStorage.m12060a("fire-global", jCurrentTimeMillis);
        }
        if (zM12060a2 && zM12060a) {
            return 4;
        }
        if (zM12060a) {
            return 3;
        }
        return zM12060a2 ? 2 : 1;
    }
}
