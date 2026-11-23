package p007c.p085g.p086a.p089m.p096u.p097y;

import java.io.InputStream;
import java.net.URL;
import p007c.p085g.p086a.p089m.Options;
import p007c.p085g.p086a.p089m.p096u.GlideUrl;
import p007c.p085g.p086a.p089m.p096u.ModelLoader;
import p007c.p085g.p086a.p089m.p096u.ModelLoaderFactory;
import p007c.p085g.p086a.p089m.p096u.MultiModelLoaderFactory;

/* JADX INFO: renamed from: c.g.a.m.u.y.f, reason: use source file name */
/* JADX INFO: compiled from: UrlLoader.java */
/* JADX INFO: loaded from: classes.dex */
public class UrlLoader implements ModelLoader<URL, InputStream> {

    /* JADX INFO: renamed from: a */
    public final ModelLoader<GlideUrl, InputStream> f3502a;

    /* JADX INFO: renamed from: c.g.a.m.u.y.f$a */
    /* JADX INFO: compiled from: UrlLoader.java */
    public static class a implements ModelLoaderFactory<URL, InputStream> {
        @Override // p007c.p085g.p086a.p089m.p096u.ModelLoaderFactory
        /* JADX INFO: renamed from: b */
        public ModelLoader<URL, InputStream> mo1849b(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new UrlLoader(multiModelLoaderFactory.m1865b(GlideUrl.class, InputStream.class));
        }
    }

    public UrlLoader(ModelLoader<GlideUrl, InputStream> modelLoader) {
        this.f3502a = modelLoader;
    }

    @Override // p007c.p085g.p086a.p089m.p096u.ModelLoader
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ boolean mo1846a(URL url) {
        return true;
    }

    @Override // p007c.p085g.p086a.p089m.p096u.ModelLoader
    /* JADX INFO: renamed from: b */
    public ModelLoader.a<InputStream> mo1847b(URL url, int i, int i2, Options options) {
        return this.f3502a.mo1847b(new GlideUrl(url), i, i2, options);
    }
}
