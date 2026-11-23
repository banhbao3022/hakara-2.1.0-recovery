package p007c.p190n.p194b.p209b.p243w1;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import p007c.p190n.p194b.p209b.p210a2.DataSpec;

/* JADX INFO: renamed from: c.n.b.b.w1.x, reason: use source file name */
/* JADX INFO: compiled from: LoadEventInfo.java */
/* JADX INFO: loaded from: classes.dex */
public final class LoadEventInfo {

    /* JADX INFO: renamed from: a */
    public static final AtomicLong f9670a = new AtomicLong();

    /* JADX INFO: renamed from: b */
    public final Map<String, List<String>> f9671b;

    /* JADX INFO: renamed from: c */
    public final long f9672c;

    public LoadEventInfo(long j2, DataSpec dataSpec, long j3) {
        this(j2, dataSpec, dataSpec.f6137a, Collections.emptyMap(), j3, 0L, 0L);
    }

    /* JADX INFO: renamed from: a */
    public static long m4367a() {
        return f9670a.getAndIncrement();
    }

    public LoadEventInfo(long j2, DataSpec dataSpec, Uri uri, Map<String, List<String>> map, long j3, long j4, long j5) {
        this.f9671b = map;
        this.f9672c = j4;
    }
}
