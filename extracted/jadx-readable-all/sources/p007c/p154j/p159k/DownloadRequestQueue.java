package p007c.p154j.p159k;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p007c.p154j.p161l.DownloadRequest;

/* JADX INFO: renamed from: c.j.k.b, reason: use source file name */
/* JADX INFO: compiled from: DownloadRequestQueue.java */
/* JADX INFO: loaded from: classes.dex */
public class DownloadRequestQueue {

    /* JADX INFO: renamed from: a */
    public static DownloadRequestQueue f4436a;

    /* JADX INFO: renamed from: b */
    public final Map<Integer, DownloadRequest> f4437b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c */
    public final AtomicInteger f4438c = new AtomicInteger();

    /* JADX INFO: renamed from: a */
    public static DownloadRequestQueue m2230a() {
        if (f4436a == null) {
            synchronized (DownloadRequestQueue.class) {
                if (f4436a == null) {
                    f4436a = new DownloadRequestQueue();
                }
            }
        }
        return f4436a;
    }
}
