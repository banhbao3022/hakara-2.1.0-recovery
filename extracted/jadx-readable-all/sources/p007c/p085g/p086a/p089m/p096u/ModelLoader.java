package p007c.p085g.p086a.p089m.p096u;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p007c.p085g.p086a.p089m.Key;
import p007c.p085g.p086a.p089m.Options;
import p007c.p085g.p086a.p089m.p090s.DataFetcher;

/* JADX INFO: renamed from: c.g.a.m.u.n, reason: use source file name */
/* JADX INFO: compiled from: ModelLoader.java */
/* JADX INFO: loaded from: classes.dex */
public interface ModelLoader<Model, Data> {

    /* JADX INFO: renamed from: c.g.a.m.u.n$a */
    /* JADX INFO: compiled from: ModelLoader.java */
    public static class a<Data> {

        /* JADX INFO: renamed from: a */
        public final Key f3433a;

        /* JADX INFO: renamed from: b */
        public final List<Key> f3434b;

        /* JADX INFO: renamed from: c */
        public final DataFetcher<Data> f3435c;

        public a(Key key, DataFetcher<Data> dataFetcher) {
            this(key, Collections.emptyList(), dataFetcher);
        }

        public a(Key key, List<Key> list, DataFetcher<Data> dataFetcher) {
            Objects.requireNonNull(key, "Argument must not be null");
            this.f3433a = key;
            Objects.requireNonNull(list, "Argument must not be null");
            this.f3434b = list;
            Objects.requireNonNull(dataFetcher, "Argument must not be null");
            this.f3435c = dataFetcher;
        }
    }

    /* JADX INFO: renamed from: a */
    boolean mo1846a(Model model);

    /* JADX INFO: renamed from: b */
    a<Data> mo1847b(Model model, int i, int i2, Options options);
}
