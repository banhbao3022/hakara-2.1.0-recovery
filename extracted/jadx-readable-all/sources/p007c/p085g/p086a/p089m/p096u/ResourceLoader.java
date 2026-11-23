package p007c.p085g.p086a.p089m.p096u;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.InputStream;
import p007c.p085g.p086a.p089m.Options;

/* JADX INFO: renamed from: c.g.a.m.u.s, reason: use source file name */
/* JADX INFO: compiled from: ResourceLoader.java */
/* JADX INFO: loaded from: classes.dex */
public class ResourceLoader<Data> implements ModelLoader<Integer, Data> {

    /* JADX INFO: renamed from: a */
    public final ModelLoader<Uri, Data> f3458a;

    /* JADX INFO: renamed from: b */
    public final Resources f3459b;

    /* JADX INFO: renamed from: c.g.a.m.u.s$a */
    /* JADX INFO: compiled from: ResourceLoader.java */
    public static final class a implements ModelLoaderFactory<Integer, AssetFileDescriptor> {

        /* JADX INFO: renamed from: a */
        public final Resources f3460a;

        public a(Resources resources) {
            this.f3460a = resources;
        }

        @Override // p007c.p085g.p086a.p089m.p096u.ModelLoaderFactory
        /* JADX INFO: renamed from: b */
        public ModelLoader<Integer, AssetFileDescriptor> mo1849b(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new ResourceLoader(this.f3460a, multiModelLoaderFactory.m1865b(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* JADX INFO: renamed from: c.g.a.m.u.s$b */
    /* JADX INFO: compiled from: ResourceLoader.java */
    public static class b implements ModelLoaderFactory<Integer, ParcelFileDescriptor> {

        /* JADX INFO: renamed from: a */
        public final Resources f3461a;

        public b(Resources resources) {
            this.f3461a = resources;
        }

        @Override // p007c.p085g.p086a.p089m.p096u.ModelLoaderFactory
        /* JADX INFO: renamed from: b */
        public ModelLoader<Integer, ParcelFileDescriptor> mo1849b(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new ResourceLoader(this.f3461a, multiModelLoaderFactory.m1865b(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* JADX INFO: renamed from: c.g.a.m.u.s$c */
    /* JADX INFO: compiled from: ResourceLoader.java */
    public static class c implements ModelLoaderFactory<Integer, InputStream> {

        /* JADX INFO: renamed from: a */
        public final Resources f3462a;

        public c(Resources resources) {
            this.f3462a = resources;
        }

        @Override // p007c.p085g.p086a.p089m.p096u.ModelLoaderFactory
        /* JADX INFO: renamed from: b */
        public ModelLoader<Integer, InputStream> mo1849b(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new ResourceLoader(this.f3462a, multiModelLoaderFactory.m1865b(Uri.class, InputStream.class));
        }
    }

    /* JADX INFO: renamed from: c.g.a.m.u.s$d */
    /* JADX INFO: compiled from: ResourceLoader.java */
    public static class d implements ModelLoaderFactory<Integer, Uri> {

        /* JADX INFO: renamed from: a */
        public final Resources f3463a;

        public d(Resources resources) {
            this.f3463a = resources;
        }

        @Override // p007c.p085g.p086a.p089m.p096u.ModelLoaderFactory
        /* JADX INFO: renamed from: b */
        public ModelLoader<Integer, Uri> mo1849b(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new ResourceLoader(this.f3463a, UnitModelLoader.f3466a);
        }
    }

    public ResourceLoader(Resources resources, ModelLoader<Uri, Data> modelLoader) {
        this.f3459b = resources;
        this.f3458a = modelLoader;
    }

    @Override // p007c.p085g.p086a.p089m.p096u.ModelLoader
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ boolean mo1846a(Integer num) {
        return true;
    }

    @Override // p007c.p085g.p086a.p089m.p096u.ModelLoader
    /* JADX INFO: renamed from: b */
    public ModelLoader.a mo1847b(Integer num, int i, int i2, Options options) {
        Uri uri;
        Integer num2 = num;
        try {
            uri = Uri.parse("android.resource://" + this.f3459b.getResourcePackageName(num2.intValue()) + '/' + this.f3459b.getResourceTypeName(num2.intValue()) + '/' + this.f3459b.getResourceEntryName(num2.intValue()));
        } catch (Resources.NotFoundException e) {
            if (Log.isLoggable("ResourceLoader", 5)) {
                Log.w("ResourceLoader", "Received invalid resource id: " + num2, e);
            }
            uri = null;
        }
        if (uri == null) {
            return null;
        }
        return this.f3458a.mo1847b(uri, i, i2, options);
    }
}
