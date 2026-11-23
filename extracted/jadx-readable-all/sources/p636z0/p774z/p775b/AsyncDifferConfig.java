package p636z0.p774z.p775b;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: z0.z.b.c, reason: use source file name */
/* JADX INFO: compiled from: AsyncDifferConfig.java */
/* JADX INFO: loaded from: classes.dex */
public final class AsyncDifferConfig<T> {

    /* JADX INFO: renamed from: a */
    public final Executor f39138a;

    /* JADX INFO: renamed from: b */
    public final DiffUtil.e<T> f39139b;

    /* JADX INFO: renamed from: z0.z.b.c$a */
    /* JADX INFO: compiled from: AsyncDifferConfig.java */
    public static final class a<T> {

        /* JADX INFO: renamed from: a */
        public static final Object f39140a = new Object();

        /* JADX INFO: renamed from: b */
        public static Executor f39141b;

        /* JADX INFO: renamed from: c */
        public Executor f39142c;

        /* JADX INFO: renamed from: d */
        public final DiffUtil.e<T> f39143d;

        public a(DiffUtil.e<T> eVar) {
            this.f39143d = eVar;
        }

        /* JADX INFO: renamed from: a */
        public AsyncDifferConfig<T> m16985a() {
            if (this.f39142c == null) {
                synchronized (f39140a) {
                    if (f39141b == null) {
                        f39141b = Executors.newFixedThreadPool(2);
                    }
                }
                this.f39142c = f39141b;
            }
            return new AsyncDifferConfig<>(null, this.f39142c, this.f39143d);
        }
    }

    public AsyncDifferConfig(Executor executor, Executor executor2, DiffUtil.e<T> eVar) {
        this.f39138a = executor2;
        this.f39139b = eVar;
    }
}
