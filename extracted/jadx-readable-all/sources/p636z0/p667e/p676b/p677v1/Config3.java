package p636z0.p667e.p676b.p677v1;

import java.util.Set;

/* JADX INFO: renamed from: z0.e.b.v1.k0, reason: use source file name */
/* JADX INFO: compiled from: Config.java */
/* JADX INFO: loaded from: classes.dex */
public interface Config3 {

    /* JADX INFO: renamed from: z0.e.b.v1.k0$a */
    /* JADX INFO: compiled from: Config.java */
    public static abstract class a<T> {
        /* JADX INFO: renamed from: a */
        public abstract String mo15383a();

        /* JADX INFO: renamed from: b */
        public abstract Object mo15384b();

        /* JADX INFO: renamed from: c */
        public abstract Class<T> mo15385c();
    }

    /* JADX INFO: renamed from: z0.e.b.v1.k0$b */
    /* JADX INFO: compiled from: Config.java */
    public interface b {
    }

    /* JADX INFO: renamed from: z0.e.b.v1.k0$c */
    /* JADX INFO: compiled from: Config.java */
    public enum c {
        ALWAYS_OVERRIDE,
        REQUIRED,
        OPTIONAL
    }

    /* JADX INFO: renamed from: a */
    <ValueT> ValueT mo15102a(a<ValueT> aVar);

    /* JADX INFO: renamed from: b */
    boolean mo15103b(a<?> aVar);

    /* JADX INFO: renamed from: c */
    Set<a<?>> mo15104c();

    /* JADX INFO: renamed from: d */
    <ValueT> ValueT mo15105d(a<ValueT> aVar, ValueT valuet);

    /* JADX INFO: renamed from: e */
    c mo15106e(a<?> aVar);

    /* JADX INFO: renamed from: k */
    void mo15110k(String str, b bVar);

    /* JADX INFO: renamed from: l */
    <ValueT> ValueT mo15111l(a<ValueT> aVar, c cVar);

    /* JADX INFO: renamed from: p */
    Set<c> mo15113p(a<?> aVar);
}
