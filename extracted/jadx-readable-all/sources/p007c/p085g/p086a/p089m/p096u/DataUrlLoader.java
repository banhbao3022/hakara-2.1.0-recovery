package p007c.p085g.p086a.p089m.p096u;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import p007c.p085g.p086a.Priority;
import p007c.p085g.p086a.p089m.DataSource;
import p007c.p085g.p086a.p089m.Options;
import p007c.p085g.p086a.p089m.p090s.DataFetcher;
import p007c.p085g.p086a.p111r.ObjectKey;

/* JADX INFO: renamed from: c.g.a.m.u.e, reason: use source file name */
/* JADX INFO: compiled from: DataUrlLoader.java */
/* JADX INFO: loaded from: classes.dex */
public final class DataUrlLoader<Model, Data> implements ModelLoader<Model, Data> {

    /* JADX INFO: renamed from: a */
    public final a<Data> f3399a;

    /* JADX INFO: renamed from: c.g.a.m.u.e$a */
    /* JADX INFO: compiled from: DataUrlLoader.java */
    public interface a<Data> {
    }

    /* JADX INFO: renamed from: c.g.a.m.u.e$b */
    /* JADX INFO: compiled from: DataUrlLoader.java */
    public static final class b<Data> implements DataFetcher<Data> {

        /* JADX INFO: renamed from: f */
        public final String f3400f;

        /* JADX INFO: renamed from: g */
        public final a<Data> f3401g;

        /* JADX INFO: renamed from: h */
        public Data f3402h;

        public b(String str, a<Data> aVar) {
            this.f3400f = str;
            this.f3401g = aVar;
        }

        @Override // p007c.p085g.p086a.p089m.p090s.DataFetcher
        /* JADX INFO: renamed from: a */
        public Class<Data> mo1712a() {
            Objects.requireNonNull((c.a) this.f3401g);
            return InputStream.class;
        }

        @Override // p007c.p085g.p086a.p089m.p090s.DataFetcher
        /* JADX INFO: renamed from: b */
        public void mo1715b() {
            try {
                a<Data> aVar = this.f3401g;
                Data data = this.f3402h;
                Objects.requireNonNull((c.a) aVar);
                ((InputStream) data).close();
            } catch (IOException unused) {
            }
        }

        @Override // p007c.p085g.p086a.p089m.p090s.DataFetcher
        public void cancel() {
        }

        @Override // p007c.p085g.p086a.p089m.p090s.DataFetcher
        /* JADX INFO: renamed from: d */
        public DataSource mo1717d() {
            return DataSource.LOCAL;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [Data, java.lang.Object] */
        @Override // p007c.p085g.p086a.p089m.p090s.DataFetcher
        /* JADX INFO: renamed from: e */
        public void mo1718e(Priority priority, DataFetcher.a<? super Data> aVar) {
            try {
                ?? r2 = (Data) ((c.a) this.f3401g).m1852a(this.f3400f);
                this.f3402h = r2;
                aVar.mo1721f(r2);
            } catch (IllegalArgumentException e) {
                aVar.mo1720c(e);
            }
        }
    }

    /* JADX INFO: renamed from: c.g.a.m.u.e$c */
    /* JADX INFO: compiled from: DataUrlLoader.java */
    public static final class c<Model> implements ModelLoaderFactory<Model, InputStream> {

        /* JADX INFO: renamed from: a */
        public final a<InputStream> f3403a = new a(this);

        /* JADX INFO: renamed from: c.g.a.m.u.e$c$a */
        /* JADX INFO: compiled from: DataUrlLoader.java */
        public class a implements a<InputStream> {
            public a(c cVar) {
            }

            /* JADX INFO: renamed from: a */
            public Object m1852a(String str) throws IllegalArgumentException {
                if (!str.startsWith("data:image")) {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
                int iIndexOf = str.indexOf(44);
                if (iIndexOf == -1) {
                    throw new IllegalArgumentException("Missing comma in data URL.");
                }
                if (str.substring(0, iIndexOf).endsWith(";base64")) {
                    return new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
                }
                throw new IllegalArgumentException("Not a base64 image data URL.");
            }
        }

        @Override // p007c.p085g.p086a.p089m.p096u.ModelLoaderFactory
        /* JADX INFO: renamed from: b */
        public ModelLoader<Model, InputStream> mo1849b(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new DataUrlLoader(this.f3403a);
        }
    }

    public DataUrlLoader(a<Data> aVar) {
        this.f3399a = aVar;
    }

    @Override // p007c.p085g.p086a.p089m.p096u.ModelLoader
    /* JADX INFO: renamed from: a */
    public boolean mo1846a(Model model) {
        return model.toString().startsWith("data:image");
    }

    @Override // p007c.p085g.p086a.p089m.p096u.ModelLoader
    /* JADX INFO: renamed from: b */
    public ModelLoader.a<Data> mo1847b(Model model, int i, int i2, Options options) {
        return new ModelLoader.a<>(new ObjectKey(model), new b(model.toString(), this.f3399a));
    }
}
