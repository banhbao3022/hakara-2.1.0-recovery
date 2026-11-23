package p007c.p085g.p086a.p089m.p096u.p097y;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import p007c.p085g.p086a.Priority;
import p007c.p085g.p086a.p089m.DataSource;
import p007c.p085g.p086a.p089m.Options;
import p007c.p085g.p086a.p089m.p090s.DataFetcher;
import p007c.p085g.p086a.p089m.p096u.ModelLoader;
import p007c.p085g.p086a.p089m.p096u.ModelLoaderFactory;
import p007c.p085g.p086a.p089m.p096u.MultiModelLoaderFactory;
import p007c.p085g.p086a.p111r.ObjectKey;
import p636z0.p770y.p773v.C8462c;

/* JADX INFO: renamed from: c.g.a.m.u.y.e, reason: use source file name */
/* JADX INFO: compiled from: QMediaStoreUriLoader.java */
/* JADX INFO: loaded from: classes.dex */
public final class QMediaStoreUriLoader<DataT> implements ModelLoader<Uri, DataT> {

    /* JADX INFO: renamed from: a */
    public final Context f3485a;

    /* JADX INFO: renamed from: b */
    public final ModelLoader<File, DataT> f3486b;

    /* JADX INFO: renamed from: c */
    public final ModelLoader<Uri, DataT> f3487c;

    /* JADX INFO: renamed from: d */
    public final Class<DataT> f3488d;

    /* JADX INFO: renamed from: c.g.a.m.u.y.e$a */
    /* JADX INFO: compiled from: QMediaStoreUriLoader.java */
    public static abstract class a<DataT> implements ModelLoaderFactory<Uri, DataT> {

        /* JADX INFO: renamed from: a */
        public final Context f3489a;

        /* JADX INFO: renamed from: b */
        public final Class<DataT> f3490b;

        public a(Context context, Class<DataT> cls) {
            this.f3489a = context;
            this.f3490b = cls;
        }

        @Override // p007c.p085g.p086a.p089m.p096u.ModelLoaderFactory
        /* JADX INFO: renamed from: b */
        public final ModelLoader<Uri, DataT> mo1849b(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new QMediaStoreUriLoader(this.f3489a, multiModelLoaderFactory.m1865b(File.class, this.f3490b), multiModelLoaderFactory.m1865b(Uri.class, this.f3490b), this.f3490b);
        }
    }

    /* JADX INFO: renamed from: c.g.a.m.u.y.e$b */
    /* JADX INFO: compiled from: QMediaStoreUriLoader.java */
    public static final class b extends a<ParcelFileDescriptor> {
        public b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    /* JADX INFO: renamed from: c.g.a.m.u.y.e$c */
    /* JADX INFO: compiled from: QMediaStoreUriLoader.java */
    public static final class c extends a<InputStream> {
        public c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* JADX INFO: renamed from: c.g.a.m.u.y.e$d */
    /* JADX INFO: compiled from: QMediaStoreUriLoader.java */
    public static final class d<DataT> implements DataFetcher<DataT> {

        /* JADX INFO: renamed from: f */
        public static final String[] f3491f = {"_data"};

        /* JADX INFO: renamed from: g */
        public final Context f3492g;

        /* JADX INFO: renamed from: h */
        public final ModelLoader<File, DataT> f3493h;

        /* JADX INFO: renamed from: i */
        public final ModelLoader<Uri, DataT> f3494i;

        /* JADX INFO: renamed from: j */
        public final Uri f3495j;

        /* JADX INFO: renamed from: k */
        public final int f3496k;

        /* JADX INFO: renamed from: l */
        public final int f3497l;

        /* JADX INFO: renamed from: m */
        public final Options f3498m;

        /* JADX INFO: renamed from: n */
        public final Class<DataT> f3499n;

        /* JADX INFO: renamed from: o */
        public volatile boolean f3500o;

        /* JADX INFO: renamed from: p */
        public volatile DataFetcher<DataT> f3501p;

        public d(Context context, ModelLoader<File, DataT> modelLoader, ModelLoader<Uri, DataT> modelLoader2, Uri uri, int i, int i2, Options options, Class<DataT> cls) {
            this.f3492g = context.getApplicationContext();
            this.f3493h = modelLoader;
            this.f3494i = modelLoader2;
            this.f3495j = uri;
            this.f3496k = i;
            this.f3497l = i2;
            this.f3498m = options;
            this.f3499n = cls;
        }

        @Override // p007c.p085g.p086a.p089m.p090s.DataFetcher
        /* JADX INFO: renamed from: a */
        public Class<DataT> mo1712a() {
            return this.f3499n;
        }

        @Override // p007c.p085g.p086a.p089m.p090s.DataFetcher
        /* JADX INFO: renamed from: b */
        public void mo1715b() {
            DataFetcher<DataT> dataFetcher = this.f3501p;
            if (dataFetcher != null) {
                dataFetcher.mo1715b();
            }
        }

        /* JADX INFO: renamed from: c */
        public final DataFetcher<DataT> m1869c() throws Throwable {
            ModelLoader.a<DataT> aVarMo1847b;
            Cursor cursor = null;
            if (Environment.isExternalStorageLegacy()) {
                ModelLoader<File, DataT> modelLoader = this.f3493h;
                Uri uri = this.f3495j;
                try {
                    Cursor cursorQuery = this.f3492g.getContentResolver().query(uri, f3491f, null, null, null);
                    if (cursorQuery != null) {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                                if (TextUtils.isEmpty(string)) {
                                    throw new FileNotFoundException("File path was empty in media store for: " + uri);
                                }
                                File file = new File(string);
                                cursorQuery.close();
                                aVarMo1847b = modelLoader.mo1847b(file, this.f3496k, this.f3497l, this.f3498m);
                            }
                        } catch (Throwable th) {
                            th = th;
                            cursor = cursorQuery;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    }
                    throw new FileNotFoundException("Failed to media store entry for: " + uri);
                } catch (Throwable th2) {
                    th = th2;
                }
            } else {
                aVarMo1847b = this.f3494i.mo1847b(this.f3492g.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0 ? MediaStore.setRequireOriginal(this.f3495j) : this.f3495j, this.f3496k, this.f3497l, this.f3498m);
            }
            if (aVarMo1847b != null) {
                return aVarMo1847b.f3435c;
            }
            return null;
        }

        @Override // p007c.p085g.p086a.p089m.p090s.DataFetcher
        public void cancel() {
            this.f3500o = true;
            DataFetcher<DataT> dataFetcher = this.f3501p;
            if (dataFetcher != null) {
                dataFetcher.cancel();
            }
        }

        @Override // p007c.p085g.p086a.p089m.p090s.DataFetcher
        /* JADX INFO: renamed from: d */
        public DataSource mo1717d() {
            return DataSource.LOCAL;
        }

        @Override // p007c.p085g.p086a.p089m.p090s.DataFetcher
        /* JADX INFO: renamed from: e */
        public void mo1718e(Priority priority, DataFetcher.a<? super DataT> aVar) throws Throwable {
            try {
                DataFetcher<DataT> dataFetcherM1869c = m1869c();
                if (dataFetcherM1869c == null) {
                    aVar.mo1720c(new IllegalArgumentException("Failed to build fetcher for: " + this.f3495j));
                    return;
                }
                this.f3501p = dataFetcherM1869c;
                if (this.f3500o) {
                    cancel();
                } else {
                    dataFetcherM1869c.mo1718e(priority, aVar);
                }
            } catch (FileNotFoundException e) {
                aVar.mo1720c(e);
            }
        }
    }

    public QMediaStoreUriLoader(Context context, ModelLoader<File, DataT> modelLoader, ModelLoader<Uri, DataT> modelLoader2, Class<DataT> cls) {
        this.f3485a = context.getApplicationContext();
        this.f3486b = modelLoader;
        this.f3487c = modelLoader2;
        this.f3488d = cls;
    }

    @Override // p007c.p085g.p086a.p089m.p096u.ModelLoader
    /* JADX INFO: renamed from: a */
    public boolean mo1846a(Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && C8462c.m16951r(uri);
    }

    @Override // p007c.p085g.p086a.p089m.p096u.ModelLoader
    /* JADX INFO: renamed from: b */
    public ModelLoader.a mo1847b(Uri uri, int i, int i2, Options options) {
        Uri uri2 = uri;
        return new ModelLoader.a(new ObjectKey(uri2), new d(this.f3485a, this.f3486b, this.f3487c, uri2, i, i2, options, this.f3488d));
    }
}
