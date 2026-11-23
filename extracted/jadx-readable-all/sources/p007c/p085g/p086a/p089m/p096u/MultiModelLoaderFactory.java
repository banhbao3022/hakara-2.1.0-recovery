package p007c.p085g.p086a.p089m.p096u;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import p007c.p085g.p086a.Registry;
import p007c.p085g.p086a.p089m.Options;
import p636z0.p725k.p738k.Pools2;

/* JADX INFO: renamed from: c.g.a.m.u.r, reason: use source file name */
/* JADX INFO: compiled from: MultiModelLoaderFactory.java */
/* JADX INFO: loaded from: classes.dex */
public class MultiModelLoaderFactory {

    /* JADX INFO: renamed from: a */
    public static final c f3449a = new c();

    /* JADX INFO: renamed from: b */
    public static final ModelLoader<Object, Object> f3450b = new a();

    /* JADX INFO: renamed from: c */
    public final List<b<?, ?>> f3451c;

    /* JADX INFO: renamed from: d */
    public final c f3452d;

    /* JADX INFO: renamed from: e */
    public final Set<b<?, ?>> f3453e;

    /* JADX INFO: renamed from: f */
    public final Pools2<List<Throwable>> f3454f;

    /* JADX INFO: renamed from: c.g.a.m.u.r$a */
    /* JADX INFO: compiled from: MultiModelLoaderFactory.java */
    public static class a implements ModelLoader<Object, Object> {
        @Override // p007c.p085g.p086a.p089m.p096u.ModelLoader
        /* JADX INFO: renamed from: a */
        public boolean mo1846a(Object obj) {
            return false;
        }

        @Override // p007c.p085g.p086a.p089m.p096u.ModelLoader
        /* JADX INFO: renamed from: b */
        public ModelLoader.a<Object> mo1847b(Object obj, int i, int i2, Options options) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c.g.a.m.u.r$b */
    /* JADX INFO: compiled from: MultiModelLoaderFactory.java */
    public static class b<Model, Data> {

        /* JADX INFO: renamed from: a */
        public final Class<Model> f3455a;

        /* JADX INFO: renamed from: b */
        public final Class<Data> f3456b;

        /* JADX INFO: renamed from: c */
        public final ModelLoaderFactory<? extends Model, ? extends Data> f3457c;

        public b(Class<Model> cls, Class<Data> cls2, ModelLoaderFactory<? extends Model, ? extends Data> modelLoaderFactory) {
            this.f3455a = cls;
            this.f3456b = cls2;
            this.f3457c = modelLoaderFactory;
        }
    }

    /* JADX INFO: renamed from: c.g.a.m.u.r$c */
    /* JADX INFO: compiled from: MultiModelLoaderFactory.java */
    public static class c {
    }

    public MultiModelLoaderFactory(Pools2<List<Throwable>> pools2) {
        c cVar = f3449a;
        this.f3451c = new ArrayList();
        this.f3453e = new HashSet();
        this.f3454f = pools2;
        this.f3452d = cVar;
    }

    /* JADX INFO: renamed from: a */
    public final <Model, Data> ModelLoader<Model, Data> m1864a(b<?, ?> bVar) {
        ModelLoader<Model, Data> modelLoader = (ModelLoader<Model, Data>) bVar.f3457c.mo1849b(this);
        Objects.requireNonNull(modelLoader, "Argument must not be null");
        return modelLoader;
    }

    /* JADX INFO: renamed from: b */
    public synchronized <Model, Data> ModelLoader<Model, Data> m1865b(Class<Model> cls, Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (b<?, ?> bVar : this.f3451c) {
                if (this.f3453e.contains(bVar)) {
                    z = true;
                } else if (bVar.f3455a.isAssignableFrom(cls) && bVar.f3456b.isAssignableFrom(cls2)) {
                    this.f3453e.add(bVar);
                    arrayList.add(m1864a(bVar));
                    this.f3453e.remove(bVar);
                }
            }
            if (arrayList.size() > 1) {
                c cVar = this.f3452d;
                Pools2<List<Throwable>> pools2 = this.f3454f;
                Objects.requireNonNull(cVar);
                return new MultiModelLoader(arrayList, pools2);
            }
            if (arrayList.size() == 1) {
                return (ModelLoader) arrayList.get(0);
            }
            if (z) {
                return (ModelLoader<Model, Data>) f3450b;
            }
            throw new Registry.c((Class<?>) cls, (Class<?>) cls2);
        } catch (Throwable th) {
            this.f3453e.clear();
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public synchronized <Model> List<ModelLoader<Model, ?>> m1866c(Class<Model> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (b<?, ?> bVar : this.f3451c) {
                if (!this.f3453e.contains(bVar) && bVar.f3455a.isAssignableFrom(cls)) {
                    this.f3453e.add(bVar);
                    ModelLoader<? extends Object, ? extends Object> modelLoaderMo1849b = bVar.f3457c.mo1849b(this);
                    Objects.requireNonNull(modelLoaderMo1849b, "Argument must not be null");
                    arrayList.add(modelLoaderMo1849b);
                    this.f3453e.remove(bVar);
                }
            }
        } catch (Throwable th) {
            this.f3453e.clear();
            throw th;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public synchronized List<Class<?>> m1867d(Class<?> cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (b<?, ?> bVar : this.f3451c) {
            if (!arrayList.contains(bVar.f3456b) && bVar.f3455a.isAssignableFrom(cls)) {
                arrayList.add(bVar.f3456b);
            }
        }
        return arrayList;
    }
}
