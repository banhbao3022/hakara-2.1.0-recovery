package p007c.p085g.p086a.p089m.p096u;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p007c.p085g.p086a.p089m.Options;
import p007c.p085g.p086a.p089m.p090s.AssetFileDescriptorLocalUriFetcher;
import p007c.p085g.p086a.p089m.p090s.DataFetcher;
import p007c.p085g.p086a.p089m.p090s.FileDescriptorLocalUriFetcher;
import p007c.p085g.p086a.p089m.p090s.StreamLocalUriFetcher;
import p007c.p085g.p086a.p111r.ObjectKey;

/* JADX INFO: renamed from: c.g.a.m.u.w, reason: use source file name */
/* JADX INFO: compiled from: UriLoader.java */
/* JADX INFO: loaded from: classes.dex */
public class UriLoader<Data> implements ModelLoader<Uri, Data> {

    /* JADX INFO: renamed from: a */
    public static final Set<String> f3469a = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "android.resource", "content")));

    /* JADX INFO: renamed from: b */
    public final c<Data> f3470b;

    /* JADX INFO: renamed from: c.g.a.m.u.w$a */
    /* JADX INFO: compiled from: UriLoader.java */
    public static final class a implements ModelLoaderFactory<Uri, AssetFileDescriptor>, c<AssetFileDescriptor> {

        /* JADX INFO: renamed from: a */
        public final ContentResolver f3471a;

        public a(ContentResolver contentResolver) {
            this.f3471a = contentResolver;
        }

        @Override // p007c.p085g.p086a.p089m.p096u.UriLoader.c
        /* JADX INFO: renamed from: a */
        public DataFetcher<AssetFileDescriptor> mo1868a(Uri uri) {
            return new AssetFileDescriptorLocalUriFetcher(this.f3471a, uri);
        }

        @Override // p007c.p085g.p086a.p089m.p096u.ModelLoaderFactory
        /* JADX INFO: renamed from: b */
        public ModelLoader<Uri, AssetFileDescriptor> mo1849b(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new UriLoader(this);
        }
    }

    /* JADX INFO: renamed from: c.g.a.m.u.w$b */
    /* JADX INFO: compiled from: UriLoader.java */
    public static class b implements ModelLoaderFactory<Uri, ParcelFileDescriptor>, c<ParcelFileDescriptor> {

        /* JADX INFO: renamed from: a */
        public final ContentResolver f3472a;

        public b(ContentResolver contentResolver) {
            this.f3472a = contentResolver;
        }

        @Override // p007c.p085g.p086a.p089m.p096u.UriLoader.c
        /* JADX INFO: renamed from: a */
        public DataFetcher<ParcelFileDescriptor> mo1868a(Uri uri) {
            return new FileDescriptorLocalUriFetcher(this.f3472a, uri);
        }

        @Override // p007c.p085g.p086a.p089m.p096u.ModelLoaderFactory
        /* JADX INFO: renamed from: b */
        public ModelLoader<Uri, ParcelFileDescriptor> mo1849b(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new UriLoader(this);
        }
    }

    /* JADX INFO: renamed from: c.g.a.m.u.w$c */
    /* JADX INFO: compiled from: UriLoader.java */
    public interface c<Data> {
        /* JADX INFO: renamed from: a */
        DataFetcher<Data> mo1868a(Uri uri);
    }

    /* JADX INFO: renamed from: c.g.a.m.u.w$d */
    /* JADX INFO: compiled from: UriLoader.java */
    public static class d implements ModelLoaderFactory<Uri, InputStream>, c<InputStream> {

        /* JADX INFO: renamed from: a */
        public final ContentResolver f3473a;

        public d(ContentResolver contentResolver) {
            this.f3473a = contentResolver;
        }

        @Override // p007c.p085g.p086a.p089m.p096u.UriLoader.c
        /* JADX INFO: renamed from: a */
        public DataFetcher<InputStream> mo1868a(Uri uri) {
            return new StreamLocalUriFetcher(this.f3473a, uri);
        }

        @Override // p007c.p085g.p086a.p089m.p096u.ModelLoaderFactory
        /* JADX INFO: renamed from: b */
        public ModelLoader<Uri, InputStream> mo1849b(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new UriLoader(this);
        }
    }

    public UriLoader(c<Data> cVar) {
        this.f3470b = cVar;
    }

    @Override // p007c.p085g.p086a.p089m.p096u.ModelLoader
    /* JADX INFO: renamed from: a */
    public boolean mo1846a(Uri uri) {
        return f3469a.contains(uri.getScheme());
    }

    @Override // p007c.p085g.p086a.p089m.p096u.ModelLoader
    /* JADX INFO: renamed from: b */
    public ModelLoader.a mo1847b(Uri uri, int i, int i2, Options options) {
        Uri uri2 = uri;
        return new ModelLoader.a(new ObjectKey(uri2), this.f3470b.mo1868a(uri2));
    }
}
