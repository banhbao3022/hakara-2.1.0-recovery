package p007c.p085g.p086a.p089m.p096u;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;
import p007c.p071d.p078c.p079a.outline;
import p007c.p085g.p086a.Priority;
import p007c.p085g.p086a.p089m.DataSource;
import p007c.p085g.p086a.p089m.Options;
import p007c.p085g.p086a.p089m.p090s.DataFetcher;
import p007c.p085g.p086a.p111r.ObjectKey;
import p636z0.p770y.p773v.C8462c;

/* JADX INFO: renamed from: c.g.a.m.u.k, reason: use source file name */
/* JADX INFO: compiled from: MediaStoreFileLoader.java */
/* JADX INFO: loaded from: classes.dex */
public final class MediaStoreFileLoader implements ModelLoader<Uri, File> {

    /* JADX INFO: renamed from: a */
    public final Context f3423a;

    /* JADX INFO: renamed from: c.g.a.m.u.k$a */
    /* JADX INFO: compiled from: MediaStoreFileLoader.java */
    public static final class a implements ModelLoaderFactory<Uri, File> {

        /* JADX INFO: renamed from: a */
        public final Context f3424a;

        public a(Context context) {
            this.f3424a = context;
        }

        @Override // p007c.p085g.p086a.p089m.p096u.ModelLoaderFactory
        /* JADX INFO: renamed from: b */
        public ModelLoader<Uri, File> mo1849b(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new MediaStoreFileLoader(this.f3424a);
        }
    }

    /* JADX INFO: renamed from: c.g.a.m.u.k$b */
    /* JADX INFO: compiled from: MediaStoreFileLoader.java */
    public static class b implements DataFetcher<File> {

        /* JADX INFO: renamed from: f */
        public static final String[] f3425f = {"_data"};

        /* JADX INFO: renamed from: g */
        public final Context f3426g;

        /* JADX INFO: renamed from: h */
        public final Uri f3427h;

        public b(Context context, Uri uri) {
            this.f3426g = context;
            this.f3427h = uri;
        }

        @Override // p007c.p085g.p086a.p089m.p090s.DataFetcher
        /* JADX INFO: renamed from: a */
        public Class<File> mo1712a() {
            return File.class;
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
        public void mo1718e(Priority priority, DataFetcher.a<? super File> aVar) {
            Cursor cursorQuery = this.f3426g.getContentResolver().query(this.f3427h, f3425f, null, null, null);
            String string = null;
            if (cursorQuery != null) {
                try {
                    string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
                    cursorQuery.close();
                } catch (Throwable th) {
                    cursorQuery.close();
                    throw th;
                }
            }
            if (!TextUtils.isEmpty(string)) {
                aVar.mo1721f(new File(string));
                return;
            }
            StringBuilder sbM1556G = outline.m1556G("Failed to find file path for: ");
            sbM1556G.append(this.f3427h);
            aVar.mo1720c(new FileNotFoundException(sbM1556G.toString()));
        }
    }

    public MediaStoreFileLoader(Context context) {
        this.f3423a = context;
    }

    @Override // p007c.p085g.p086a.p089m.p096u.ModelLoader
    /* JADX INFO: renamed from: a */
    public boolean mo1846a(Uri uri) {
        return C8462c.m16951r(uri);
    }

    @Override // p007c.p085g.p086a.p089m.p096u.ModelLoader
    /* JADX INFO: renamed from: b */
    public ModelLoader.a<File> mo1847b(Uri uri, int i, int i2, Options options) {
        Uri uri2 = uri;
        return new ModelLoader.a<>(new ObjectKey(uri2), new b(this.f3423a, uri2));
    }
}
