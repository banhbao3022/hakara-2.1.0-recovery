package p007c.p085g.p086a.p089m.p096u;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import p007c.p085g.p086a.Priority;
import p007c.p085g.p086a.p089m.DataSource;
import p007c.p085g.p086a.p089m.Options;
import p007c.p085g.p086a.p089m.p090s.DataFetcher;
import p007c.p085g.p086a.p111r.ObjectKey;

/* JADX INFO: renamed from: c.g.a.m.u.f, reason: use source file name */
/* JADX INFO: compiled from: FileLoader.java */
/* JADX INFO: loaded from: classes.dex */
public class FileLoader<Data> implements ModelLoader<File, Data> {

    /* JADX INFO: renamed from: a */
    public final d<Data> f3404a;

    /* JADX INFO: renamed from: c.g.a.m.u.f$a */
    /* JADX INFO: compiled from: FileLoader.java */
    public static class a<Data> implements ModelLoaderFactory<File, Data> {

        /* JADX INFO: renamed from: a */
        public final d<Data> f3405a;

        public a(d<Data> dVar) {
            this.f3405a = dVar;
        }

        @Override // p007c.p085g.p086a.p089m.p096u.ModelLoaderFactory
        /* JADX INFO: renamed from: b */
        public final ModelLoader<File, Data> mo1849b(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new FileLoader(this.f3405a);
        }
    }

    /* JADX INFO: renamed from: c.g.a.m.u.f$b */
    /* JADX INFO: compiled from: FileLoader.java */
    public static class b extends a<ParcelFileDescriptor> {

        /* JADX INFO: renamed from: c.g.a.m.u.f$b$a */
        /* JADX INFO: compiled from: FileLoader.java */
        public class a implements d<ParcelFileDescriptor> {
            @Override // p007c.p085g.p086a.p089m.p096u.FileLoader.d
            /* JADX INFO: renamed from: a */
            public Class<ParcelFileDescriptor> mo1853a() {
                return ParcelFileDescriptor.class;
            }

            @Override // p007c.p085g.p086a.p089m.p096u.FileLoader.d
            /* JADX INFO: renamed from: b */
            public ParcelFileDescriptor mo1854b(File file) throws FileNotFoundException {
                return ParcelFileDescriptor.open(file, 268435456);
            }

            @Override // p007c.p085g.p086a.p089m.p096u.FileLoader.d
            /* JADX INFO: renamed from: c */
            public void mo1855c(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
                parcelFileDescriptor.close();
            }
        }

        public b() {
            super(new a());
        }
    }

    /* JADX INFO: renamed from: c.g.a.m.u.f$c */
    /* JADX INFO: compiled from: FileLoader.java */
    public static final class c<Data> implements DataFetcher<Data> {

        /* JADX INFO: renamed from: f */
        public final File f3406f;

        /* JADX INFO: renamed from: g */
        public final d<Data> f3407g;

        /* JADX INFO: renamed from: h */
        public Data f3408h;

        public c(File file, d<Data> dVar) {
            this.f3406f = file;
            this.f3407g = dVar;
        }

        @Override // p007c.p085g.p086a.p089m.p090s.DataFetcher
        /* JADX INFO: renamed from: a */
        public Class<Data> mo1712a() {
            return this.f3407g.mo1853a();
        }

        @Override // p007c.p085g.p086a.p089m.p090s.DataFetcher
        /* JADX INFO: renamed from: b */
        public void mo1715b() {
            Data data = this.f3408h;
            if (data != null) {
                try {
                    this.f3407g.mo1855c(data);
                } catch (IOException unused) {
                }
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

        /* JADX WARN: Type inference failed for: r3v3, types: [Data, java.lang.Object] */
        @Override // p007c.p085g.p086a.p089m.p090s.DataFetcher
        /* JADX INFO: renamed from: e */
        public void mo1718e(Priority priority, DataFetcher.a<? super Data> aVar) {
            try {
                Data dataMo1854b = this.f3407g.mo1854b(this.f3406f);
                this.f3408h = dataMo1854b;
                aVar.mo1721f(dataMo1854b);
            } catch (FileNotFoundException e) {
                if (Log.isLoggable("FileLoader", 3)) {
                    Log.d("FileLoader", "Failed to open file", e);
                }
                aVar.mo1720c(e);
            }
        }
    }

    /* JADX INFO: renamed from: c.g.a.m.u.f$d */
    /* JADX INFO: compiled from: FileLoader.java */
    public interface d<Data> {
        /* JADX INFO: renamed from: a */
        Class<Data> mo1853a();

        /* JADX INFO: renamed from: b */
        Data mo1854b(File file) throws FileNotFoundException;

        /* JADX INFO: renamed from: c */
        void mo1855c(Data data) throws IOException;
    }

    /* JADX INFO: renamed from: c.g.a.m.u.f$e */
    /* JADX INFO: compiled from: FileLoader.java */
    public static class e extends a<InputStream> {

        /* JADX INFO: renamed from: c.g.a.m.u.f$e$a */
        /* JADX INFO: compiled from: FileLoader.java */
        public class a implements d<InputStream> {
            @Override // p007c.p085g.p086a.p089m.p096u.FileLoader.d
            /* JADX INFO: renamed from: a */
            public Class<InputStream> mo1853a() {
                return InputStream.class;
            }

            @Override // p007c.p085g.p086a.p089m.p096u.FileLoader.d
            /* JADX INFO: renamed from: b */
            public InputStream mo1854b(File file) throws FileNotFoundException {
                return new FileInputStream(file);
            }

            @Override // p007c.p085g.p086a.p089m.p096u.FileLoader.d
            /* JADX INFO: renamed from: c */
            public void mo1855c(InputStream inputStream) throws IOException {
                inputStream.close();
            }
        }

        public e() {
            super(new a());
        }
    }

    public FileLoader(d<Data> dVar) {
        this.f3404a = dVar;
    }

    @Override // p007c.p085g.p086a.p089m.p096u.ModelLoader
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ boolean mo1846a(File file) {
        return true;
    }

    @Override // p007c.p085g.p086a.p089m.p096u.ModelLoader
    /* JADX INFO: renamed from: b */
    public ModelLoader.a mo1847b(File file, int i, int i2, Options options) {
        File file2 = file;
        return new ModelLoader.a(new ObjectKey(file2), new c(file2, this.f3404a));
    }
}
