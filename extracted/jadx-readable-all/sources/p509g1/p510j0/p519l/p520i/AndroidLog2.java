package p509g1.p510j0.p519l.p520i;

import android.util.Log;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import p007c.p071d.p078c.p079a.outline;
import p477d1.p481d0.Strings5;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: g1.j0.l.i.d, reason: use source file name */
/* JADX INFO: compiled from: AndroidLog.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class AndroidLog2 extends Handler {

    /* JADX INFO: renamed from: a */
    public static final AndroidLog2 f30555a = new AndroidLog2();

    @Override // java.util.logging.Handler
    public void close() {
    }

    @Override // java.util.logging.Handler
    public void flush() {
    }

    @Override // java.util.logging.Handler
    public void publish(LogRecord logRecord) {
        int i;
        int iMin;
        Intrinsics2.m13090f(logRecord, "record");
        AndroidLog androidLog = AndroidLog.f30554c;
        String loggerName = logRecord.getLoggerName();
        Intrinsics2.m13086b(loggerName, "record.loggerName");
        if (logRecord.getLevel().intValue() > Level.INFO.intValue()) {
            i = 5;
        } else {
            i = logRecord.getLevel().intValue() == Level.INFO.intValue() ? 4 : 3;
        }
        String message = logRecord.getMessage();
        Intrinsics2.m13086b(message, "record.message");
        Throwable thrown = logRecord.getThrown();
        Intrinsics2.m13090f(loggerName, "loggerName");
        Intrinsics2.m13090f(message, "message");
        String strSubstring = AndroidLog.f30553b.get(loggerName);
        if (strSubstring == null) {
            Intrinsics2.m13089e(loggerName, "$this$take");
            int length = loggerName.length();
            strSubstring = loggerName.substring(0, 23 > length ? length : 23);
            Intrinsics2.m13088d(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        }
        if (Log.isLoggable(strSubstring, i)) {
            if (thrown != null) {
                StringBuilder sbM1561L = outline.m1561L(message, "\n");
                sbM1561L.append(Log.getStackTraceString(thrown));
                message = sbM1561L.toString();
            }
            int length2 = message.length();
            int i2 = 0;
            while (i2 < length2) {
                int iM13011u = Strings5.m13011u(message, '\n', i2, false, 4);
                if (iM13011u == -1) {
                    iM13011u = length2;
                }
                while (true) {
                    iMin = Math.min(iM13011u, i2 + 4000);
                    String strSubstring2 = message.substring(i2, iMin);
                    Intrinsics2.m13086b(strSubstring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    Log.println(i, strSubstring, strSubstring2);
                    if (iMin >= iM13011u) {
                        break;
                    } else {
                        i2 = iMin;
                    }
                }
                i2 = iMin + 1;
            }
        }
    }
}
