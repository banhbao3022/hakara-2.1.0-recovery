package p007c.p085g.p086a.p089m.p096u;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.File;
import java.io.InputStream;
import p007c.p085g.p086a.p089m.Options;

/* JADX INFO: renamed from: c.g.a.m.u.u, reason: use source file name */
/* JADX INFO: compiled from: StringLoader.java */
/* JADX INFO: loaded from: classes.dex */
public class StringLoader<Data> implements ModelLoader<String, Data> {

    /* JADX INFO: renamed from: a */
    public final ModelLoader<Uri, Data> f3465a;

    /* JADX INFO: renamed from: c.g.a.m.u.u$a */
    /* JADX INFO: compiled from: StringLoader.java */
    public static final class a implements ModelLoaderFactory<String, AssetFileDescriptor> {
        @Override // p007c.p085g.p086a.p089m.p096u.ModelLoaderFactory
        /* JADX INFO: renamed from: b */
        public ModelLoader<String, AssetFileDescriptor> mo1849b(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new StringLoader(multiModelLoaderFactory.m1865b(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* JADX INFO: renamed from: c.g.a.m.u.u$b */
    /* JADX INFO: compiled from: StringLoader.java */
    public static class b implements ModelLoaderFactory<String, ParcelFileDescriptor> {
        @Override // p007c.p085g.p086a.p089m.p096u.ModelLoaderFactory
        /* JADX INFO: renamed from: b */
        public ModelLoader<String, ParcelFileDescriptor> mo1849b(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new StringLoader(multiModelLoaderFactory.m1865b(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* JADX INFO: renamed from: c.g.a.m.u.u$c */
    /* JADX INFO: compiled from: StringLoader.java */
    public static class c implements ModelLoaderFactory<String, InputStream> {
        @Override // p007c.p085g.p086a.p089m.p096u.ModelLoaderFactory
        /* JADX INFO: renamed from: b */
        public ModelLoader<String, InputStream> mo1849b(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new StringLoader(multiModelLoaderFactory.m1865b(Uri.class, InputStream.class));
        }
    }

    public StringLoader(ModelLoader<Uri, Data> modelLoader) {
        this.f3465a = modelLoader;
    }

    @Override // p007c.p085g.p086a.p089m.p096u.ModelLoader
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ boolean mo1846a(String str) {
        return true;
    }

    @Override // p007c.p085g.p086a.p089m.p096u.ModelLoader
    /* JADX INFO: renamed from: b */
    public ModelLoader.a mo1847b(String str, int i, int i2, Options options) {
        Uri uriFromFile;
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            uriFromFile = null;
        } else if (str2.charAt(0) == '/') {
            uriFromFile = Uri.fromFile(new File(str2));
        } else {
            Uri uri = Uri.parse(str2);
            uriFromFile = uri.getScheme() == null ? Uri.fromFile(new File(str2)) : uri;
        }
        if (uriFromFile == null || !this.f3465a.mo1846a(uriFromFile)) {
            return null;
        }
        return this.f3465a.mo1847b(uriFromFile, i, i2, options);
    }
}
