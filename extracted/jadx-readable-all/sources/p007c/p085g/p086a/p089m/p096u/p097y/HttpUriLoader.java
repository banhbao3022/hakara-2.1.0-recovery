package p007c.p085g.p086a.p089m.p096u.p097y;

import android.net.Uri;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p007c.p085g.p086a.p089m.Options;
import p007c.p085g.p086a.p089m.p096u.GlideUrl;
import p007c.p085g.p086a.p089m.p096u.ModelLoader;
import p007c.p085g.p086a.p089m.p096u.ModelLoaderFactory;
import p007c.p085g.p086a.p089m.p096u.MultiModelLoaderFactory;

/* JADX INFO: renamed from: c.g.a.m.u.y.b, reason: use source file name */
/* JADX INFO: compiled from: HttpUriLoader.java */
/* JADX INFO: loaded from: classes.dex */
public class HttpUriLoader implements ModelLoader<Uri, InputStream> {

    /* JADX INFO: renamed from: a */
    public static final Set<String> f3479a = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* JADX INFO: renamed from: b */
    public final ModelLoader<GlideUrl, InputStream> f3480b;

    /* JADX INFO: renamed from: c.g.a.m.u.y.b$a */
    /* JADX INFO: compiled from: HttpUriLoader.java */
    public static class a implements ModelLoaderFactory<Uri, InputStream> {
        @Override // p007c.p085g.p086a.p089m.p096u.ModelLoaderFactory
        /* JADX INFO: renamed from: b */
        public ModelLoader<Uri, InputStream> mo1849b(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new HttpUriLoader(multiModelLoaderFactory.m1865b(GlideUrl.class, InputStream.class));
        }
    }

    public HttpUriLoader(ModelLoader<GlideUrl, InputStream> modelLoader) {
        this.f3480b = modelLoader;
    }

    @Override // p007c.p085g.p086a.p089m.p096u.ModelLoader
    /* JADX INFO: renamed from: a */
    public boolean mo1846a(Uri uri) {
        return f3479a.contains(uri.getScheme());
    }

    @Override // p007c.p085g.p086a.p089m.p096u.ModelLoader
    /* JADX INFO: renamed from: b */
    public ModelLoader.a<InputStream> mo1847b(Uri uri, int i, int i2, Options options) {
        return this.f3480b.mo1847b(new GlideUrl(uri.toString()), i, i2, options);
    }
}
