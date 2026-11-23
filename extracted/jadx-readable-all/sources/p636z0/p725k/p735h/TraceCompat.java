package p636z0.p725k.p735h;

import android.os.Build;
import android.os.Trace;
import android.util.Log;

/* JADX INFO: renamed from: z0.k.h.e, reason: use source file name */
/* JADX INFO: compiled from: TraceCompat.java */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class TraceCompat {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f37894a = 0;

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception e) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e);
            }
        }
    }
}
