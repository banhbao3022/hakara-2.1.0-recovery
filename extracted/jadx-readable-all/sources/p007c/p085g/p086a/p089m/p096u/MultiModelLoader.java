package p007c.p085g.p086a.p089m.p096u;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p007c.p085g.p086a.Priority;
import p007c.p085g.p086a.p089m.DataSource;
import p007c.p085g.p086a.p089m.Key;
import p007c.p085g.p086a.p089m.Options;
import p007c.p085g.p086a.p089m.p090s.DataFetcher;
import p007c.p085g.p086a.p089m.p092t.GlideException;
import p636z0.p725k.p738k.Pools2;

/* JADX INFO: renamed from: c.g.a.m.u.q, reason: use source file name */
/* JADX INFO: compiled from: MultiModelLoader.java */
/* JADX INFO: loaded from: classes.dex */
public class MultiModelLoader<Model, Data> implements ModelLoader<Model, Data> {

    /* JADX INFO: renamed from: a */
    public final List<ModelLoader<Model, Data>> f3440a;

    /* JADX INFO: renamed from: b */
    public final Pools2<List<Throwable>> f3441b;

    /* JADX INFO: renamed from: c.g.a.m.u.q$a */
    /* JADX INFO: compiled from: MultiModelLoader.java */
    public static class a<Data> implements DataFetcher<Data>, DataFetcher.a<Data> {

        /* JADX INFO: renamed from: f */
        public final List<DataFetcher<Data>> f3442f;

        /* JADX INFO: renamed from: g */
        public final Pools2<List<Throwable>> f3443g;

        /* JADX INFO: renamed from: h */
        public int f3444h;

        /* JADX INFO: renamed from: i */
        public Priority f3445i;

        /* JADX INFO: renamed from: j */
        public DataFetcher.a<? super Data> f3446j;

        /* JADX INFO: renamed from: k */
        public List<Throwable> f3447k;

        /* JADX INFO: renamed from: l */
        public boolean f3448l;

        public a(List<DataFetcher<Data>> list, Pools2<List<Throwable>> pools2) {
            this.f3443g = pools2;
            if (list.isEmpty()) {
                throw new IllegalArgumentException("Must not be empty.");
            }
            this.f3442f = list;
            this.f3444h = 0;
        }

        @Override // p007c.p085g.p086a.p089m.p090s.DataFetcher
        /* JADX INFO: renamed from: a */
        public Class<Data> mo1712a() {
            return this.f3442f.get(0).mo1712a();
        }

        @Override // p007c.p085g.p086a.p089m.p090s.DataFetcher
        /* JADX INFO: renamed from: b */
        public void mo1715b() {
            List<Throwable> list = this.f3447k;
            if (list != null) {
                this.f3443g.mo2058b(list);
            }
            this.f3447k = null;
            Iterator<DataFetcher<Data>> it = this.f3442f.iterator();
            while (it.hasNext()) {
                it.next().mo1715b();
            }
        }

        @Override // p007c.p085g.p086a.p089m.p090s.DataFetcher.a
        /* JADX INFO: renamed from: c */
        public void mo1720c(Exception exc) {
            List<Throwable> list = this.f3447k;
            Objects.requireNonNull(list, "Argument must not be null");
            list.add(exc);
            m1863g();
        }

        @Override // p007c.p085g.p086a.p089m.p090s.DataFetcher
        public void cancel() {
            this.f3448l = true;
            Iterator<DataFetcher<Data>> it = this.f3442f.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
        }

        @Override // p007c.p085g.p086a.p089m.p090s.DataFetcher
        /* JADX INFO: renamed from: d */
        public DataSource mo1717d() {
            return this.f3442f.get(0).mo1717d();
        }

        @Override // p007c.p085g.p086a.p089m.p090s.DataFetcher
        /* JADX INFO: renamed from: e */
        public void mo1718e(Priority priority, DataFetcher.a<? super Data> aVar) {
            this.f3445i = priority;
            this.f3446j = aVar;
            this.f3447k = this.f3443g.mo2057a();
            this.f3442f.get(this.f3444h).mo1718e(priority, this);
            if (this.f3448l) {
                cancel();
            }
        }

        @Override // p007c.p085g.p086a.p089m.p090s.DataFetcher.a
        /* JADX INFO: renamed from: f */
        public void mo1721f(Data data) {
            if (data != null) {
                this.f3446j.mo1721f(data);
            } else {
                m1863g();
            }
        }

        /* JADX INFO: renamed from: g */
        public final void m1863g() {
            if (this.f3448l) {
                return;
            }
            if (this.f3444h < this.f3442f.size() - 1) {
                this.f3444h++;
                mo1718e(this.f3445i, this.f3446j);
            } else {
                Objects.requireNonNull(this.f3447k, "Argument must not be null");
                this.f3446j.mo1720c(new GlideException("Fetch failed", new ArrayList(this.f3447k)));
            }
        }
    }

    public MultiModelLoader(List<ModelLoader<Model, Data>> list, Pools2<List<Throwable>> pools2) {
        this.f3440a = list;
        this.f3441b = pools2;
    }

    @Override // p007c.p085g.p086a.p089m.p096u.ModelLoader
    /* JADX INFO: renamed from: a */
    public boolean mo1846a(Model model) {
        Iterator<ModelLoader<Model, Data>> it = this.f3440a.iterator();
        while (it.hasNext()) {
            if (it.next().mo1846a(model)) {
                return true;
            }
        }
        return false;
    }

    @Override // p007c.p085g.p086a.p089m.p096u.ModelLoader
    /* JADX INFO: renamed from: b */
    public ModelLoader.a<Data> mo1847b(Model model, int i, int i2, Options options) {
        ModelLoader.a<Data> aVarMo1847b;
        int size = this.f3440a.size();
        ArrayList arrayList = new ArrayList(size);
        Key key = null;
        for (int i3 = 0; i3 < size; i3++) {
            ModelLoader<Model, Data> modelLoader = this.f3440a.get(i3);
            if (modelLoader.mo1846a(model) && (aVarMo1847b = modelLoader.mo1847b(model, i, i2, options)) != null) {
                key = aVarMo1847b.f3433a;
                arrayList.add(aVarMo1847b.f3435c);
            }
        }
        if (arrayList.isEmpty() || key == null) {
            return null;
        }
        return new ModelLoader.a<>(key, new a(arrayList, this.f3441b));
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("MultiModelLoader{modelLoaders=");
        sbM1556G.append(Arrays.toString(this.f3440a.toArray()));
        sbM1556G.append('}');
        return sbM1556G.toString();
    }
}
