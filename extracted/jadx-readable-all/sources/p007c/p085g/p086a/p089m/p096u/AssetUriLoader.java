package p007c.p085g.p086a.p089m.p096u;

import android.content.res.AssetManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import p007c.p085g.p086a.p089m.Options;
import p007c.p085g.p086a.p089m.p090s.DataFetcher;
import p007c.p085g.p086a.p089m.p090s.FileDescriptorAssetPathFetcher;
import p007c.p085g.p086a.p089m.p090s.StreamAssetPathFetcher;
import p007c.p085g.p086a.p111r.ObjectKey;

/* JADX INFO: renamed from: c.g.a.m.u.a, reason: use source file name */
/* JADX INFO: compiled from: AssetUriLoader.java */
/* JADX INFO: loaded from: classes.dex */
public class AssetUriLoader<Data> implements ModelLoader<Uri, Data> {

    /* JADX INFO: renamed from: a */
    public final AssetManager f3391a;

    /* JADX INFO: renamed from: b */
    public final a<Data> f3392b;

    /* JADX INFO: renamed from: c.g.a.m.u.a$a */
    /* JADX INFO: compiled from: AssetUriLoader.java */
    public interface a<Data> {
        /* JADX INFO: renamed from: a */
        DataFetcher<Data> mo1848a(AssetManager assetManager, String str);
    }

    /* JADX INFO: renamed from: c.g.a.m.u.a$b */
    /* JADX INFO: compiled from: AssetUriLoader.java */
    public static class b implements ModelLoaderFactory<Uri, ParcelFileDescriptor>, a<ParcelFileDescriptor> {

        /* JADX INFO: renamed from: a */
        public final AssetManager f3393a;

        public b(AssetManager assetManager) {
            this.f3393a = assetManager;
        }

        @Override // p007c.p085g.p086a.p089m.p096u.AssetUriLoader.a
        /* JADX INFO: renamed from: a */
        public DataFetcher<ParcelFileDescriptor> mo1848a(AssetManager assetManager, String str) {
            return new FileDescriptorAssetPathFetcher(assetManager, str);
        }

        @Override // p007c.p085g.p086a.p089m.p096u.ModelLoaderFactory
        /* JADX INFO: renamed from: b */
        public ModelLoader<Uri, ParcelFileDescriptor> mo1849b(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new AssetUriLoader(this.f3393a, this);
        }
    }

    /* JADX INFO: renamed from: c.g.a.m.u.a$c */
    /* JADX INFO: compiled from: AssetUriLoader.java */
    public static class c implements ModelLoaderFactory<Uri, InputStream>, a<InputStream> {

        /* JADX INFO: renamed from: a */
        public final AssetManager f3394a;

        public c(AssetManager assetManager) {
            this.f3394a = assetManager;
        }

        @Override // p007c.p085g.p086a.p089m.p096u.AssetUriLoader.a
        /* JADX INFO: renamed from: a */
        public DataFetcher<InputStream> mo1848a(AssetManager assetManager, String str) {
            return new StreamAssetPathFetcher(assetManager, str);
        }

        @Override // p007c.p085g.p086a.p089m.p096u.ModelLoaderFactory
        /* JADX INFO: renamed from: b */
        public ModelLoader<Uri, InputStream> mo1849b(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new AssetUriLoader(this.f3394a, this);
        }
    }

    public AssetUriLoader(AssetManager assetManager, a<Data> aVar) {
        this.f3391a = assetManager;
        this.f3392b = aVar;
    }

    @Override // p007c.p085g.p086a.p089m.p096u.ModelLoader
    /* JADX INFO: renamed from: a */
    public boolean mo1846a(Uri uri) {
        Uri uri2 = uri;
        return "file".equals(uri2.getScheme()) && !uri2.getPathSegments().isEmpty() && "android_asset".equals(uri2.getPathSegments().get(0));
    }

    @Override // p007c.p085g.p086a.p089m.p096u.ModelLoader
    /* JADX INFO: renamed from: b */
    public ModelLoader.a mo1847b(Uri uri, int i, int i2, Options options) {
        Uri uri2 = uri;
        return new ModelLoader.a(new ObjectKey(uri2), this.f3392b.mo1848a(this.f3391a, uri2.toString().substring(22)));
    }
}
