package p007c.p085g.p086a.p089m.p092t;

import android.os.Process;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import p007c.p085g.p086a.p089m.Key;

/* JADX INFO: renamed from: c.g.a.m.t.a, reason: use source file name */
/* JADX INFO: compiled from: ActiveResources.java */
/* JADX INFO: loaded from: classes.dex */
public final class ActiveResources {

    /* JADX INFO: renamed from: a */
    public final boolean f3085a;

    /* JADX INFO: renamed from: b */
    public final Executor f3086b;

    /* JADX INFO: renamed from: c */
    public final Map<Key, b> f3087c;

    /* JADX INFO: renamed from: d */
    public final ReferenceQueue<EngineResource<?>> f3088d;

    /* JADX INFO: renamed from: e */
    public EngineResource.a f3089e;

    /* JADX INFO: renamed from: c.g.a.m.t.a$a */
    /* JADX INFO: compiled from: ActiveResources.java */
    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: c.g.a.m.t.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ActiveResources.java */
        public class RunnableC8500a implements Runnable {

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ Runnable f3090f;

            public RunnableC8500a(a aVar, Runnable runnable) {
                this.f3090f = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                Process.setThreadPriority(10);
                this.f3090f.run();
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(new RunnableC8500a(this, runnable), "glide-active-resources");
        }
    }

    /* JADX INFO: renamed from: c.g.a.m.t.a$b */
    /* JADX INFO: compiled from: ActiveResources.java */
    public static final class b extends WeakReference<EngineResource<?>> {

        /* JADX INFO: renamed from: a */
        public final Key f3091a;

        /* JADX INFO: renamed from: b */
        public final boolean f3092b;

        /* JADX INFO: renamed from: c */
        public Resource2<?> f3093c;

        public b(Key key, EngineResource<?> engineResource, ReferenceQueue<? super EngineResource<?>> referenceQueue, boolean z) {
            Resource2<?> resource2;
            super(engineResource, referenceQueue);
            Objects.requireNonNull(key, "Argument must not be null");
            this.f3091a = key;
            if (engineResource.f3345f && z) {
                resource2 = engineResource.f3347h;
                Objects.requireNonNull(resource2, "Argument must not be null");
            } else {
                resource2 = null;
            }
            this.f3093c = resource2;
            this.f3092b = engineResource.f3345f;
        }
    }

    public ActiveResources(boolean z) {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new a());
        this.f3087c = new HashMap();
        this.f3088d = new ReferenceQueue<>();
        this.f3085a = z;
        this.f3086b = executorServiceNewSingleThreadExecutor;
        executorServiceNewSingleThreadExecutor.execute(new ActiveResources2(this));
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m1732a(Key key, EngineResource<?> engineResource) {
        b bVarPut = this.f3087c.put(key, new b(key, engineResource, this.f3088d, this.f3085a));
        if (bVarPut != null) {
            bVarPut.f3093c = null;
            bVarPut.clear();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m1733b(b bVar) {
        Resource2<?> resource2;
        synchronized (this) {
            this.f3087c.remove(bVar.f3091a);
            if (bVar.f3092b && (resource2 = bVar.f3093c) != null) {
                this.f3089e.mo1814a(bVar.f3091a, new EngineResource<>(resource2, true, false, bVar.f3091a, this.f3089e));
            }
        }
    }
}
