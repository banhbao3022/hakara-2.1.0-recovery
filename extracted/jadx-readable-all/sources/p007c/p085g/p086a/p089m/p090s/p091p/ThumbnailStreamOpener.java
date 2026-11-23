package p007c.p085g.p086a.p089m.p090s.p091p;

import android.content.ContentResolver;
import com.bumptech.glide.load.ImageHeaderParser;
import java.util.List;
import p007c.p085g.p086a.p089m.p092t.p093c0.ArrayPool;

/* JADX INFO: renamed from: c.g.a.m.s.p.d, reason: use source file name */
/* JADX INFO: compiled from: ThumbnailStreamOpener.java */
/* JADX INFO: loaded from: classes.dex */
public class ThumbnailStreamOpener {

    /* JADX INFO: renamed from: a */
    public static final FileService f3080a = new FileService();

    /* JADX INFO: renamed from: b */
    public final ThumbnailQuery f3081b;

    /* JADX INFO: renamed from: c */
    public final ArrayPool f3082c;

    /* JADX INFO: renamed from: d */
    public final ContentResolver f3083d;

    /* JADX INFO: renamed from: e */
    public final List<ImageHeaderParser> f3084e;

    public ThumbnailStreamOpener(List<ImageHeaderParser> list, ThumbnailQuery thumbnailQuery, ArrayPool arrayPool, ContentResolver contentResolver) {
        this.f3081b = thumbnailQuery;
        this.f3082c = arrayPool;
        this.f3083d = contentResolver;
        this.f3084e = list;
    }
}
