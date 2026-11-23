package p007c.p085g.p086a.p089m.p096u.p097y;

import java.io.InputStream;
import java.util.Objects;
import java.util.Queue;
import p007c.p085g.p086a.p089m.Option;
import p007c.p085g.p086a.p089m.Options;
import p007c.p085g.p086a.p089m.p090s.HttpUrlFetcher;
import p007c.p085g.p086a.p089m.p096u.GlideUrl;
import p007c.p085g.p086a.p089m.p096u.ModelCache;
import p007c.p085g.p086a.p089m.p096u.ModelLoader;
import p007c.p085g.p086a.p089m.p096u.ModelLoaderFactory;
import p007c.p085g.p086a.p089m.p096u.MultiModelLoaderFactory;

/* JADX INFO: renamed from: c.g.a.m.u.y.a, reason: use source file name */
/* JADX INFO: compiled from: HttpGlideUrlLoader.java */
/* JADX INFO: loaded from: classes.dex */
public class HttpGlideUrlLoader implements ModelLoader<GlideUrl, InputStream> {

    /* JADX INFO: renamed from: a */
    public static final Option<Integer> f3476a = Option.m1705a("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);

    /* JADX INFO: renamed from: b */
    public final ModelCache<GlideUrl, GlideUrl> f3477b;

    /* JADX INFO: renamed from: c.g.a.m.u.y.a$a */
    /* JADX INFO: compiled from: HttpGlideUrlLoader.java */
    public static class a implements ModelLoaderFactory<GlideUrl, InputStream> {

        /* JADX INFO: renamed from: a */
        public final ModelCache<GlideUrl, GlideUrl> f3478a = new ModelCache<>(500);

        @Override // p007c.p085g.p086a.p089m.p096u.ModelLoaderFactory
        /* JADX INFO: renamed from: b */
        public ModelLoader<GlideUrl, InputStream> mo1849b(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new HttpGlideUrlLoader(this.f3478a);
        }
    }

    public HttpGlideUrlLoader() {
        this(null);
    }

    @Override // p007c.p085g.p086a.p089m.p096u.ModelLoader
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ boolean mo1846a(GlideUrl glideUrl) {
        return true;
    }

    @Override // p007c.p085g.p086a.p089m.p096u.ModelLoader
    /* JADX INFO: renamed from: b */
    public ModelLoader.a<InputStream> mo1847b(GlideUrl glideUrl, int i, int i2, Options options) {
        GlideUrl glideUrl2 = glideUrl;
        ModelCache<GlideUrl, GlideUrl> modelCache = this.f3477b;
        if (modelCache != null) {
            ModelCache.b<GlideUrl> bVarM1862a = ModelCache.b.m1862a(glideUrl2, 0, 0);
            GlideUrl glideUrlM2041a = modelCache.f3428a.m2041a(bVarM1862a);
            Queue<ModelCache.b<?>> queue = ModelCache.b.f3429a;
            synchronized (queue) {
                queue.offer(bVarM1862a);
            }
            GlideUrl glideUrl3 = glideUrlM2041a;
            if (glideUrl3 == null) {
                ModelCache<GlideUrl, GlideUrl> modelCache2 = this.f3477b;
                Objects.requireNonNull(modelCache2);
                modelCache2.f3428a.m2042d(ModelCache.b.m1862a(glideUrl2, 0, 0), glideUrl2);
            } else {
                glideUrl2 = glideUrl3;
            }
        }
        return new ModelLoader.a<>(glideUrl2, new HttpUrlFetcher(glideUrl2, ((Integer) options.m1707c(f3476a)).intValue()));
    }

    public HttpGlideUrlLoader(ModelCache<GlideUrl, GlideUrl> modelCache) {
        this.f3477b = modelCache;
    }
}
