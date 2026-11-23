package p007c.p085g.p086a.p089m.p090s.p091p;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import p007c.p085g.p086a.Glide;
import p007c.p085g.p086a.Priority;
import p007c.p085g.p086a.p089m.DataSource;
import p007c.p085g.p086a.p089m.p090s.DataFetcher;
import p007c.p085g.p086a.p089m.p090s.ExifOrientationStream;
import p636z0.p770y.p773v.C8462c;

/* JADX INFO: renamed from: c.g.a.m.s.p.b, reason: use source file name */
/* JADX INFO: compiled from: ThumbFetcher.java */
/* JADX INFO: loaded from: classes.dex */
public class ThumbFetcher implements DataFetcher<InputStream> {

    /* JADX INFO: renamed from: f */
    public final Uri f3073f;

    /* JADX INFO: renamed from: g */
    public final ThumbnailStreamOpener f3074g;

    /* JADX INFO: renamed from: h */
    public InputStream f3075h;

    /* JADX INFO: renamed from: c.g.a.m.s.p.b$a */
    /* JADX INFO: compiled from: ThumbFetcher.java */
    public static class a implements ThumbnailQuery {

        /* JADX INFO: renamed from: a */
        public static final String[] f3076a = {"_data"};

        /* JADX INFO: renamed from: b */
        public final ContentResolver f3077b;

        public a(ContentResolver contentResolver) {
            this.f3077b = contentResolver;
        }

        @Override // p007c.p085g.p086a.p089m.p090s.p091p.ThumbnailQuery
        /* JADX INFO: renamed from: a */
        public Cursor mo1731a(Uri uri) {
            return this.f3077b.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f3076a, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    /* JADX INFO: renamed from: c.g.a.m.s.p.b$b */
    /* JADX INFO: compiled from: ThumbFetcher.java */
    public static class b implements ThumbnailQuery {

        /* JADX INFO: renamed from: a */
        public static final String[] f3078a = {"_data"};

        /* JADX INFO: renamed from: b */
        public final ContentResolver f3079b;

        public b(ContentResolver contentResolver) {
            this.f3079b = contentResolver;
        }

        @Override // p007c.p085g.p086a.p089m.p090s.p091p.ThumbnailQuery
        /* JADX INFO: renamed from: a */
        public Cursor mo1731a(Uri uri) {
            return this.f3079b.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f3078a, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    public ThumbFetcher(Uri uri, ThumbnailStreamOpener thumbnailStreamOpener) {
        this.f3073f = uri;
        this.f3074g = thumbnailStreamOpener;
    }

    /* JADX INFO: renamed from: c */
    public static ThumbFetcher m1729c(Context context, Uri uri, ThumbnailQuery thumbnailQuery) {
        return new ThumbFetcher(uri, new ThumbnailStreamOpener(Glide.m1624b(context).f2859k.m1632e(), thumbnailQuery, Glide.m1624b(context).f2860l, context.getContentResolver()));
    }

    @Override // p007c.p085g.p086a.p089m.p090s.DataFetcher
    /* JADX INFO: renamed from: a */
    public Class<InputStream> mo1712a() {
        return InputStream.class;
    }

    @Override // p007c.p085g.p086a.p089m.p090s.DataFetcher
    /* JADX INFO: renamed from: b */
    public void mo1715b() {
        InputStream inputStream = this.f3075h;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
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
    public void mo1718e(Priority priority, DataFetcher.a<? super InputStream> aVar) throws Throwable {
        try {
            InputStream inputStreamM1730f = m1730f();
            this.f3075h = inputStreamM1730f;
            aVar.mo1721f(inputStreamM1730f);
        } catch (FileNotFoundException e) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e);
            }
            aVar.mo1720c(e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004d A[PHI: r6
  0x004d: PHI (r6v4 android.database.Cursor) = (r6v3 android.database.Cursor), (r6v9 android.database.Cursor) binds: [B:22:0x004b, B:13:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x0057  */
    /* JADX WARN: Code duplicated, block: B:28:0x0059  */
    /* JADX WARN: Code duplicated, block: B:35:0x0072  */
    /* JADX WARN: Code duplicated, block: B:39:0x007f  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:71:0x0096 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0023: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:10:0x0023 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.NullPointerException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX INFO: renamed from: f */
    public final InputStream m1730f() throws Throwable {
        SecurityException e;
        Cursor cursorMo1731a;
        ?? r6;
        String string;
        File file;
        Uri uriFromFile;
        InputStream inputStreamOpenInputStream;
        int iM16941h;
        Uri uri;
        ThumbnailStreamOpener thumbnailStreamOpener = this.f3074g;
        Uri uri2 = this.f3073f;
        Objects.requireNonNull(thumbnailStreamOpener);
        boolean z = false;
        ?? r5 = 0;
        InputStream inputStreamOpenInputStream2 = null;
        try {
            try {
                cursorMo1731a = thumbnailStreamOpener.f3081b.mo1731a(uri2);
                if (cursorMo1731a != null) {
                    try {
                        if (cursorMo1731a.moveToFirst()) {
                            string = cursorMo1731a.getString(0);
                            cursorMo1731a.close();
                        }
                    } catch (SecurityException e2) {
                        e = e2;
                        if (Log.isLoggable("ThumbStreamOpener", 3)) {
                            Log.d("ThumbStreamOpener", "Failed to query for thumbnail for Uri: " + uri2, e);
                        }
                        if (cursorMo1731a != null) {
                            cursorMo1731a.close();
                        }
                    }
                    if (TextUtils.isEmpty(string)) {
                        inputStreamOpenInputStream = null;
                    } else {
                        file = new File(string);
                        if (file.exists() && 0 < file.length()) {
                            z = true;
                        }
                        if (z) {
                            uriFromFile = Uri.fromFile(file);
                            try {
                                inputStreamOpenInputStream = thumbnailStreamOpener.f3083d.openInputStream(uriFromFile);
                            } catch (NullPointerException e3) {
                                throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri2 + " -> " + uriFromFile).initCause(e3));
                            }
                        } else {
                            inputStreamOpenInputStream = null;
                        }
                    }
                    if (inputStreamOpenInputStream != null) {
                        ThumbnailStreamOpener thumbnailStreamOpener2 = this.f3074g;
                        uri = this.f3073f;
                        Objects.requireNonNull(thumbnailStreamOpener2);
                        try {
                            try {
                                inputStreamOpenInputStream2 = thumbnailStreamOpener2.f3083d.openInputStream(uri);
                                iM16941h = C8462c.m16941h(thumbnailStreamOpener2.f3084e, inputStreamOpenInputStream2, thumbnailStreamOpener2.f3082c);
                                if (inputStreamOpenInputStream2 != null) {
                                    try {
                                        inputStreamOpenInputStream2.close();
                                    } catch (IOException unused) {
                                    }
                                }
                            } catch (Throwable th) {
                                if (0 != 0) {
                                    try {
                                        r5.close();
                                    } catch (IOException unused2) {
                                    }
                                }
                                throw th;
                            }
                        } catch (IOException | NullPointerException e4) {
                            if (Log.isLoggable("ThumbStreamOpener", 3)) {
                                Log.d("ThumbStreamOpener", "Failed to open uri: " + uri, e4);
                            }
                            if (inputStreamOpenInputStream2 != null) {
                                try {
                                    inputStreamOpenInputStream2.close();
                                } catch (IOException unused3) {
                                }
                            }
                            iM16941h = -1;
                        }
                    } else {
                        iM16941h = -1;
                    }
                    if (iM16941h != -1) {
                        return new ExifOrientationStream(inputStreamOpenInputStream, iM16941h);
                    }
                    return inputStreamOpenInputStream;
                }
                if (cursorMo1731a != null) {
                    cursorMo1731a.close();
                }
            } catch (Throwable th2) {
                th = th2;
                r5 = r6;
                if (r5 != 0) {
                    r5.close();
                }
                throw th;
            }
        } catch (SecurityException e5) {
            e = e5;
            cursorMo1731a = null;
        } catch (Throwable th3) {
            th = th3;
            if (r5 != 0) {
                r5.close();
            }
            throw th;
        }
        string = null;
        if (TextUtils.isEmpty(string)) {
            inputStreamOpenInputStream = null;
        } else {
            file = new File(string);
            if (file.exists()) {
                z = true;
            }
            if (z) {
                inputStreamOpenInputStream = null;
            } else {
                uriFromFile = Uri.fromFile(file);
                inputStreamOpenInputStream = thumbnailStreamOpener.f3083d.openInputStream(uriFromFile);
            }
        }
        if (inputStreamOpenInputStream != null) {
            ThumbnailStreamOpener thumbnailStreamOpener3 = this.f3074g;
            uri = this.f3073f;
            Objects.requireNonNull(thumbnailStreamOpener3);
            inputStreamOpenInputStream2 = thumbnailStreamOpener3.f3083d.openInputStream(uri);
            iM16941h = C8462c.m16941h(thumbnailStreamOpener3.f3084e, inputStreamOpenInputStream2, thumbnailStreamOpener3.f3082c);
            if (inputStreamOpenInputStream2 != null) {
                inputStreamOpenInputStream2.close();
            }
        } else {
            iM16941h = -1;
        }
        if (iM16941h != -1) {
            return new ExifOrientationStream(inputStreamOpenInputStream, iM16941h);
        }
        return inputStreamOpenInputStream;
    }
}
