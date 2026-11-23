package p007c.p085g.p086a.p089m.p096u;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p636z0.p725k.p738k.Pools2;

/* JADX INFO: renamed from: c.g.a.m.u.p, reason: use source file name */
/* JADX INFO: compiled from: ModelLoaderRegistry.java */
/* JADX INFO: loaded from: classes.dex */
public class ModelLoaderRegistry {

    /* JADX INFO: renamed from: a */
    public final MultiModelLoaderFactory f3436a;

    /* JADX INFO: renamed from: b */
    public final a f3437b;

    /* JADX INFO: renamed from: c.g.a.m.u.p$a */
    /* JADX INFO: compiled from: ModelLoaderRegistry.java */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final Map<Class<?>, C8504a<?>> f3438a = new HashMap();

        /* JADX INFO: renamed from: c.g.a.m.u.p$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ModelLoaderRegistry.java */
        public static class C8504a<Model> {

            /* JADX INFO: renamed from: a */
            public final List<ModelLoader<Model, ?>> f3439a;

            public C8504a(List<ModelLoader<Model, ?>> list) {
                this.f3439a = list;
            }
        }
    }

    public ModelLoaderRegistry(Pools2<List<Throwable>> pools2) {
        MultiModelLoaderFactory multiModelLoaderFactory = new MultiModelLoaderFactory(pools2);
        this.f3437b = new a();
        this.f3436a = multiModelLoaderFactory;
    }
}
