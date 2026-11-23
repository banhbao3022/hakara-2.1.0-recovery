package p007c.p085g.p086a.p089m.p096u;

import android.net.Uri;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p007c.p085g.p086a.p089m.Options;

/* JADX INFO: renamed from: c.g.a.m.u.x, reason: use source file name */
/* JADX INFO: compiled from: UrlUriLoader.java */
/* JADX INFO: loaded from: classes.dex */
public class UrlUriLoader<Data> implements ModelLoader<Uri, Data> {

    /* JADX INFO: renamed from: a */
    public static final Set<String> f3474a = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* JADX INFO: renamed from: b */
    public final ModelLoader<GlideUrl, Data> f3475b;

    /* JADX INFO: renamed from: c.g.a.m.u.x$a */
    /* JADX INFO: compiled from: UrlUriLoader.java */
    public static class a implements ModelLoaderFactory<Uri, InputStream> {
        @Override // p007c.p085g.p086a.p089m.p096u.ModelLoaderFactory
        /* JADX INFO: renamed from: b */
        public ModelLoader<Uri, InputStream> mo1849b(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new UrlUriLoader(multiModelLoaderFactory.m1865b(GlideUrl.class, InputStream.class));
        }
    }

    public UrlUriLoader(ModelLoader<GlideUrl, Data> modelLoader) {
        this.f3475b = modelLoader;
    }

    @Override // p007c.p085g.p086a.p089m.p096u.ModelLoader
    /* JADX INFO: renamed from: a */
    public boolean mo1846a(Uri uri) {
        return f3474a.contains(uri.getScheme());
    }

    @Override // p007c.p085g.p086a.p089m.p096u.ModelLoader
    /* JADX INFO: renamed from: b */
    public ModelLoader.a mo1847b(Uri uri, int i, int i2, Options options) {
        return this.f3475b.mo1847b(new GlideUrl(uri.toString()), i, i2, options);
    }
}
