package p007c.p190n.p385d.p391l.p392e.p395k;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p007c.p190n.p194b.p266d.p314j.p325k.C4340s8;
import p007c.p190n.p194b.p266d.p333n.AbstractC4781i;

/* JADX INFO: renamed from: c.n.d.l.e.k.h, reason: use source file name */
/* JADX INFO: compiled from: CrashlyticsBackgroundWorker.java */
/* JADX INFO: loaded from: classes.dex */
public class CrashlyticsBackgroundWorker {

    /* JADX INFO: renamed from: a */
    public final Executor f26516a;

    /* JADX INFO: renamed from: b */
    public AbstractC4781i<Void> f26517b = C4340s8.m10208e(null);

    /* JADX INFO: renamed from: c */
    public final Object f26518c = new Object();

    /* JADX INFO: renamed from: d */
    public ThreadLocal<Boolean> f26519d = new ThreadLocal<>();

    /* JADX INFO: renamed from: c.n.d.l.e.k.h$a */
    /* JADX INFO: compiled from: CrashlyticsBackgroundWorker.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CrashlyticsBackgroundWorker.this.f26519d.set(Boolean.TRUE);
        }
    }

    public CrashlyticsBackgroundWorker(Executor executor) {
        this.f26516a = executor;
        executor.execute(new a());
    }

    /* JADX INFO: renamed from: a */
    public void m11762a() {
        if (!Boolean.TRUE.equals(this.f26519d.get())) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
    }

    /* JADX INFO: renamed from: b */
    public <T> AbstractC4781i<T> m11763b(Callable<T> callable) {
        AbstractC4781i<T> abstractC4781i;
        synchronized (this.f26518c) {
            abstractC4781i = (AbstractC4781i<T>) this.f26517b.mo10934g(this.f26516a, new CrashlyticsBackgroundWorker3(this, callable));
            this.f26517b = abstractC4781i.mo10934g(this.f26516a, new CrashlyticsBackgroundWorker4(this));
        }
        return abstractC4781i;
    }

    /* JADX INFO: renamed from: c */
    public <T> AbstractC4781i<T> m11764c(Callable<AbstractC4781i<T>> callable) {
        AbstractC4781i<T> abstractC4781i;
        synchronized (this.f26518c) {
            abstractC4781i = (AbstractC4781i<T>) this.f26517b.mo10935h(this.f26516a, new CrashlyticsBackgroundWorker3(this, callable));
            this.f26517b = abstractC4781i.mo10934g(this.f26516a, new CrashlyticsBackgroundWorker4(this));
        }
        return abstractC4781i;
    }
}
