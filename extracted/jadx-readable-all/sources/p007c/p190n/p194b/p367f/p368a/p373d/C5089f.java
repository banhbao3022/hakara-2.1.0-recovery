package p007c.p190n.p194b.p367f.p368a.p373d;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.b.f.a.d.f */
/* JADX INFO: loaded from: classes.dex */
public final class C5089f {

    /* JADX INFO: renamed from: a */
    public final String f26040a;

    public C5089f(String str) {
        int iMyUid = Process.myUid();
        int iMyPid = Process.myPid();
        StringBuilder sb = new StringBuilder(39);
        sb.append("UID: [");
        sb.append(iMyUid);
        sb.append("]  PID: [");
        sb.append(iMyPid);
        sb.append("] ");
        String strValueOf = String.valueOf(sb.toString());
        String strValueOf2 = String.valueOf(str);
        this.f26040a = strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
    }

    /* JADX INFO: renamed from: c */
    public static String m11531c(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                String strValueOf = String.valueOf(str2);
                Log.e("PlayCore", strValueOf.length() != 0 ? "Unable to format ".concat(strValueOf) : new String("Unable to format "), e);
                String strJoin = TextUtils.join(", ", objArr);
                str2 = outline.m1553D(new StringBuilder(String.valueOf(str2).length() + 3 + String.valueOf(strJoin).length()), str2, " [", strJoin, "]");
            }
        }
        return outline.m1552C(new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length()), str, " : ", str2);
    }

    /* JADX INFO: renamed from: a */
    public final void m11532a(Throwable th, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", m11531c(this.f26040a, str, objArr), th);
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m11533b(int i, String str, Object[] objArr) {
        if (Log.isLoggable("PlayCore", i)) {
            return Log.i("PlayCore", m11531c(this.f26040a, str, objArr));
        }
        return 0;
    }
}
