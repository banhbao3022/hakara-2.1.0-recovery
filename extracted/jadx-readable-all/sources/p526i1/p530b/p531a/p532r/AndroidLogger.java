package p526i1.p530b.p531a.p532r;

import android.util.Log;
import java.util.logging.Level;
import p007c.p071d.p078c.p079a.outline;
import p526i1.p530b.p531a.Logger5;

/* JADX INFO: renamed from: i1.b.a.r.a, reason: use source file name */
/* JADX INFO: compiled from: AndroidLogger.java */
/* JADX INFO: loaded from: classes2.dex */
public class AndroidLogger implements Logger5 {

    /* JADX INFO: renamed from: a */
    public static final boolean f30856a;

    /* JADX INFO: renamed from: b */
    public final String f30857b;

    static {
        boolean z;
        try {
            Class.forName("android.util.Log");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        f30856a = z;
    }

    public AndroidLogger(String str) {
        this.f30857b = str;
    }

    @Override // p526i1.p530b.p531a.Logger5
    /* JADX INFO: renamed from: a */
    public void mo13822a(Level level, String str) {
        if (level != Level.OFF) {
            Log.println(m13834c(level), this.f30857b, str);
        }
    }

    @Override // p526i1.p530b.p531a.Logger5
    /* JADX INFO: renamed from: b */
    public void mo13823b(Level level, String str, Throwable th) {
        if (level != Level.OFF) {
            int iM13834c = m13834c(level);
            String str2 = this.f30857b;
            StringBuilder sbM1561L = outline.m1561L(str, "\n");
            sbM1561L.append(Log.getStackTraceString(th));
            Log.println(iM13834c, str2, sbM1561L.toString());
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m13834c(Level level) {
        int iIntValue = level.intValue();
        if (iIntValue < 800) {
            return iIntValue < 500 ? 2 : 3;
        }
        if (iIntValue < 900) {
            return 4;
        }
        return iIntValue < 1000 ? 5 : 6;
    }
}
