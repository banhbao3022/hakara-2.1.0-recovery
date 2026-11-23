package p007c.p085g.p086a.p089m.p096u.p097y;

import android.content.Context;
import android.net.Uri;
import java.io.InputStream;
import p007c.p085g.p086a.p089m.Options;
import p007c.p085g.p086a.p089m.p090s.p091p.ThumbFetcher;
import p007c.p085g.p086a.p089m.p096u.ModelLoader;
import p007c.p085g.p086a.p089m.p096u.ModelLoaderFactory;
import p007c.p085g.p086a.p089m.p096u.MultiModelLoaderFactory;
import p007c.p085g.p086a.p111r.ObjectKey;
import p636z0.p770y.p773v.C8462c;

/* JADX INFO: renamed from: c.g.a.m.u.y.c, reason: use source file name */
/* JADX INFO: compiled from: MediaStoreImageThumbLoader.java */
/* JADX INFO: loaded from: classes.dex */
public class MediaStoreImageThumbLoader implements ModelLoader<Uri, InputStream> {

    /* JADX INFO: renamed from: a */
    public final Context f3481a;

    /* JADX INFO: renamed from: c.g.a.m.u.y.c$a */
    /* JADX INFO: compiled from: MediaStoreImageThumbLoader.java */
    public static class a implements ModelLoaderFactory<Uri, InputStream> {

        /* JADX INFO: renamed from: a */
        public final Context f3482a;

        public a(Context context) {
            this.f3482a = context;
        }

        @Override // p007c.p085g.p086a.p089m.p096u.ModelLoaderFactory
        /* JADX INFO: renamed from: b */
        public ModelLoader<Uri, InputStream> mo1849b(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new MediaStoreImageThumbLoader(this.f3482a);
        }
    }

    public MediaStoreImageThumbLoader(Context context) {
        this.f3481a = context.getApplicationContext();
    }

    @Override // p007c.p085g.p086a.p089m.p096u.ModelLoader
    /* JADX INFO: renamed from: a */
    public boolean mo1846a(Uri uri) {
        Uri uri2 = uri;
        return C8462c.m16951r(uri2) && !uri2.getPathSegments().contains("video");
    }

    @Override // p007c.p085g.p086a.p089m.p096u.ModelLoader
    /* JADX INFO: renamed from: b */
    public ModelLoader.a<InputStream> mo1847b(Uri uri, int i, int i2, Options options) {
        Uri uri2 = uri;
        if (!C8462c.m16952s(i, i2)) {
            return null;
        }
        ObjectKey objectKey = new ObjectKey(uri2);
        Context context = this.f3481a;
        return new ModelLoader.a<>(objectKey, ThumbFetcher.m1729c(context, uri2, new ThumbFetcher.a(context.getContentResolver())));
    }
}
