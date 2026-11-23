package p007c.p085g.p086a.p089m.p096u;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p007c.p085g.p086a.Priority;
import p007c.p085g.p086a.p089m.DataSource;
import p007c.p085g.p086a.p089m.Options;
import p007c.p085g.p086a.p089m.p090s.DataFetcher;
import p007c.p085g.p086a.p111r.ObjectKey;

/* JADX INFO: renamed from: c.g.a.m.u.b, reason: use source file name */
/* JADX INFO: compiled from: ByteArrayLoader.java */
/* JADX INFO: loaded from: classes.dex */
public class ByteArrayLoader<Data> implements ModelLoader<byte[], Data> {

    /* JADX INFO: renamed from: a */
    public final b<Data> f3395a;

    /* JADX INFO: renamed from: c.g.a.m.u.b$a */
    /* JADX INFO: compiled from: ByteArrayLoader.java */
    public static class a implements ModelLoaderFactory<byte[], ByteBuffer> {

        /* JADX INFO: renamed from: c.g.a.m.u.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ByteArrayLoader.java */
        public class C8503a implements b<ByteBuffer> {
            public C8503a(a aVar) {
            }

            @Override // p007c.p085g.p086a.p089m.p096u.ByteArrayLoader.b
            /* JADX INFO: renamed from: a */
            public Class<ByteBuffer> mo1850a() {
                return ByteBuffer.class;
            }

            @Override // p007c.p085g.p086a.p089m.p096u.ByteArrayLoader.b
            /* JADX INFO: renamed from: b */
            public ByteBuffer mo1851b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // p007c.p085g.p086a.p089m.p096u.ModelLoaderFactory
        /* JADX INFO: renamed from: b */
        public ModelLoader<byte[], ByteBuffer> mo1849b(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new ByteArrayLoader(new C8503a(this));
        }
    }

    /* JADX INFO: renamed from: c.g.a.m.u.b$b */
    /* JADX INFO: compiled from: ByteArrayLoader.java */
    public interface b<Data> {
        /* JADX INFO: renamed from: a */
        Class<Data> mo1850a();

        /* JADX INFO: renamed from: b */
        Data mo1851b(byte[] bArr);
    }

    /* JADX INFO: renamed from: c.g.a.m.u.b$c */
    /* JADX INFO: compiled from: ByteArrayLoader.java */
    public static class c<Data> implements DataFetcher<Data> {

        /* JADX INFO: renamed from: f */
        public final byte[] f3396f;

        /* JADX INFO: renamed from: g */
        public final b<Data> f3397g;

        public c(byte[] bArr, b<Data> bVar) {
            this.f3396f = bArr;
            this.f3397g = bVar;
        }

        @Override // p007c.p085g.p086a.p089m.p090s.DataFetcher
        /* JADX INFO: renamed from: a */
        public Class<Data> mo1712a() {
            return this.f3397g.mo1850a();
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
        public void mo1718e(Priority priority, DataFetcher.a<? super Data> aVar) {
            aVar.mo1721f(this.f3397g.mo1851b(this.f3396f));
        }
    }

    /* JADX INFO: renamed from: c.g.a.m.u.b$d */
    /* JADX INFO: compiled from: ByteArrayLoader.java */
    public static class d implements ModelLoaderFactory<byte[], InputStream> {

        /* JADX INFO: renamed from: c.g.a.m.u.b$d$a */
        /* JADX INFO: compiled from: ByteArrayLoader.java */
        public class a implements b<InputStream> {
            public a(d dVar) {
            }

            @Override // p007c.p085g.p086a.p089m.p096u.ByteArrayLoader.b
            /* JADX INFO: renamed from: a */
            public Class<InputStream> mo1850a() {
                return InputStream.class;
            }

            @Override // p007c.p085g.p086a.p089m.p096u.ByteArrayLoader.b
            /* JADX INFO: renamed from: b */
            public InputStream mo1851b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // p007c.p085g.p086a.p089m.p096u.ModelLoaderFactory
        /* JADX INFO: renamed from: b */
        public ModelLoader<byte[], InputStream> mo1849b(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new ByteArrayLoader(new a(this));
        }
    }

    public ByteArrayLoader(b<Data> bVar) {
        this.f3395a = bVar;
    }

    @Override // p007c.p085g.p086a.p089m.p096u.ModelLoader
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ boolean mo1846a(byte[] bArr) {
        return true;
    }

    @Override // p007c.p085g.p086a.p089m.p096u.ModelLoader
    /* JADX INFO: renamed from: b */
    public ModelLoader.a mo1847b(byte[] bArr, int i, int i2, Options options) {
        byte[] bArr2 = bArr;
        return new ModelLoader.a(new ObjectKey(bArr2), new c(bArr2, this.f3395a));
    }
}
