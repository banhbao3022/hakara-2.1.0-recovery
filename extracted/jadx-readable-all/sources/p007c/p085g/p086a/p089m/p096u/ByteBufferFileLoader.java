package p007c.p085g.p086a.p089m.p096u;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import p007c.p085g.p086a.Priority;
import p007c.p085g.p086a.p089m.DataSource;
import p007c.p085g.p086a.p089m.Options;
import p007c.p085g.p086a.p089m.p090s.DataFetcher;
import p007c.p085g.p086a.p111r.ObjectKey;
import p007c.p085g.p086a.p112s.ByteBufferUtil;

/* JADX INFO: renamed from: c.g.a.m.u.d, reason: use source file name */
/* JADX INFO: compiled from: ByteBufferFileLoader.java */
/* JADX INFO: loaded from: classes.dex */
public class ByteBufferFileLoader implements ModelLoader<File, ByteBuffer> {

    /* JADX INFO: renamed from: c.g.a.m.u.d$a */
    /* JADX INFO: compiled from: ByteBufferFileLoader.java */
    public static final class a implements DataFetcher<ByteBuffer> {

        /* JADX INFO: renamed from: f */
        public final File f3398f;

        public a(File file) {
            this.f3398f = file;
        }

        @Override // p007c.p085g.p086a.p089m.p090s.DataFetcher
        /* JADX INFO: renamed from: a */
        public Class<ByteBuffer> mo1712a() {
            return ByteBuffer.class;
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
        public void mo1718e(Priority priority, DataFetcher.a<? super ByteBuffer> aVar) {
            try {
                aVar.mo1721f(ByteBufferUtil.m2033a(this.f3398f));
            } catch (IOException e) {
                if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                    Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e);
                }
                aVar.mo1720c(e);
            }
        }
    }

    /* JADX INFO: renamed from: c.g.a.m.u.d$b */
    /* JADX INFO: compiled from: ByteBufferFileLoader.java */
    public static class b implements ModelLoaderFactory<File, ByteBuffer> {
        @Override // p007c.p085g.p086a.p089m.p096u.ModelLoaderFactory
        /* JADX INFO: renamed from: b */
        public ModelLoader<File, ByteBuffer> mo1849b(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new ByteBufferFileLoader();
        }
    }

    @Override // p007c.p085g.p086a.p089m.p096u.ModelLoader
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ boolean mo1846a(File file) {
        return true;
    }

    @Override // p007c.p085g.p086a.p089m.p096u.ModelLoader
    /* JADX INFO: renamed from: b */
    public ModelLoader.a<ByteBuffer> mo1847b(File file, int i, int i2, Options options) {
        File file2 = file;
        return new ModelLoader.a<>(new ObjectKey(file2), new a(file2));
    }
}
