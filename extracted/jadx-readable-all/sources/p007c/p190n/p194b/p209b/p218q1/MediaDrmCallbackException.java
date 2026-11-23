package p007c.p190n.p194b.p209b.p218q1;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import p007c.p190n.p194b.p209b.p210a2.DataSpec;

/* JADX INFO: renamed from: c.n.b.b.q1.i0, reason: use source file name */
/* JADX INFO: compiled from: MediaDrmCallbackException.java */
/* JADX INFO: loaded from: classes.dex */
public final class MediaDrmCallbackException extends IOException {

    /* JADX INFO: renamed from: f */
    public final DataSpec f7346f;

    /* JADX INFO: renamed from: g */
    public final Uri f7347g;

    /* JADX INFO: renamed from: h */
    public final Map<String, List<String>> f7348h;

    /* JADX INFO: renamed from: i */
    public final long f7349i;

    public MediaDrmCallbackException(DataSpec dataSpec, Uri uri, Map<String, List<String>> map, long j2, Throwable th) {
        super(th);
        this.f7346f = dataSpec;
        this.f7347g = uri;
        this.f7348h = map;
        this.f7349i = j2;
    }
}
