package p007c.p080e.p081a;

import android.os.AsyncTask;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: c.e.a.c, reason: use source file name */
/* JADX INFO: compiled from: FFmpeg.java */
/* JADX INFO: loaded from: classes.dex */
public class FFmpeg {

    /* JADX INFO: renamed from: a */
    public static final AtomicLong f2794a = new AtomicLong(3000);

    /* JADX INFO: renamed from: a */
    public static long m1606a(String str, ExecuteCallback executeCallback) {
        long jIncrementAndGet = f2794a.incrementAndGet();
        new AsyncFFmpegExecuteTask(jIncrementAndGet, str, executeCallback).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        return jIncrementAndGet;
    }

    /* JADX INFO: renamed from: b */
    public static String[] m1607b(String str) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (i < str.length()) {
            Character chValueOf = i > 0 ? Character.valueOf(str.charAt(i - 1)) : null;
            char cCharAt = str.charAt(i);
            if (cCharAt == ' ') {
                if (z || z2) {
                    sb.append(cCharAt);
                } else if (sb.length() > 0) {
                    arrayList.add(sb.toString());
                    sb = new StringBuilder();
                }
            } else if (cCharAt != '\'' || (chValueOf != null && chValueOf.charValue() == '\\')) {
                if (cCharAt != '\"' || (chValueOf != null && chValueOf.charValue() == '\\')) {
                    sb.append(cCharAt);
                } else if (z2) {
                    z2 = false;
                } else if (z) {
                    sb.append(cCharAt);
                } else {
                    z2 = true;
                }
            } else if (z) {
                z = false;
            } else if (z2) {
                sb.append(cCharAt);
            } else {
                z = true;
            }
            i++;
        }
        if (sb.length() > 0) {
            arrayList.add(sb.toString());
        }
        return (String[]) arrayList.toArray(new String[0]);
    }
}
