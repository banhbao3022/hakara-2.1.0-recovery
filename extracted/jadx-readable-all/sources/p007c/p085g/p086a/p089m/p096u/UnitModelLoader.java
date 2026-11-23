package p007c.p085g.p086a.p089m.p096u;

import p007c.p085g.p086a.Priority;
import p007c.p085g.p086a.p089m.DataSource;
import p007c.p085g.p086a.p089m.Options;
import p007c.p085g.p086a.p089m.p090s.DataFetcher;
import p007c.p085g.p086a.p111r.ObjectKey;

/* JADX INFO: renamed from: c.g.a.m.u.v, reason: use source file name */
/* JADX INFO: compiled from: UnitModelLoader.java */
/* JADX INFO: loaded from: classes.dex */
public class UnitModelLoader<Model> implements ModelLoader<Model, Model> {

    /* JADX INFO: renamed from: a */
    public static final UnitModelLoader<?> f3466a = new UnitModelLoader<>();

    /* JADX INFO: renamed from: c.g.a.m.u.v$a */
    /* JADX INFO: compiled from: UnitModelLoader.java */
    public static class a<Model> implements ModelLoaderFactory<Model, Model> {

        /* JADX INFO: renamed from: a */
        public static final a<?> f3467a = new a<>();

        @Deprecated
        public a() {
        }

        @Override // p007c.p085g.p086a.p089m.p096u.ModelLoaderFactory
        /* JADX INFO: renamed from: b */
        public ModelLoader<Model, Model> mo1849b(MultiModelLoaderFactory multiModelLoaderFactory) {
            return UnitModelLoader.f3466a;
        }
    }

    /* JADX INFO: renamed from: c.g.a.m.u.v$b */
    /* JADX INFO: compiled from: UnitModelLoader.java */
    public static class b<Model> implements DataFetcher<Model> {

        /* JADX INFO: renamed from: f */
        public final Model f3468f;

        public b(Model model) {
            this.f3468f = model;
        }

        @Override // p007c.p085g.p086a.p089m.p090s.DataFetcher
        /* JADX INFO: renamed from: a */
        public Class<Model> mo1712a() {
            return (Class<Model>) this.f3468f.getClass();
        }

        @Override // p007c.p085g.p086a.p089m.p090s.DataFetcher
        /* JADX INFO: renamed from: b */
        public void mo1715b() {
        }

        @Override // p007c.p085g.p086a.p089m.p090s.DataFetcher
        public void cancel() {
        }

        @Override // p007c.p085g.p086a.p089m.p090s.DataFetcher
        /* JADX INFO: renamed from: d */
        public DataSource mo1717d() {
            return DataSource.LOCAL;
        }

        @Override // p007c.p085g.p086a.p089m.p090s.DataFetcher
        /* JADX INFO: renamed from: e */
        public void mo1718e(Priority priority, DataFetcher.a<? super Model> aVar) {
            aVar.mo1721f(this.f3468f);
        }
    }

    @Deprecated
    public UnitModelLoader() {
    }

    @Override // p007c.p085g.p086a.p089m.p096u.ModelLoader
    /* JADX INFO: renamed from: a */
    public boolean mo1846a(Model model) {
        return true;
    }

    @Override // p007c.p085g.p086a.p089m.p096u.ModelLoader
    /* JADX INFO: renamed from: b */
    public ModelLoader.a<Model> mo1847b(Model model, int i, int i2, Options options) {
        return new ModelLoader.a<>(new ObjectKey(model), new b(model));
    }
}
