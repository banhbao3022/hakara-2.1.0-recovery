package p007c.p190n.p385d.p391l.p392e;

import android.util.Log;

/* JADX INFO: renamed from: c.n.d.l.e.b, reason: use source file name */
/* JADX INFO: compiled from: Logger.java */
/* JADX INFO: loaded from: classes.dex */
public class Logger4 {

    /* JADX INFO: renamed from: a */
    public static final Logger4 f26421a = new Logger4("FirebaseCrashlytics");

    /* JADX INFO: renamed from: b */
    public final String f26422b;

    /* JADX INFO: renamed from: c */
    public int f26423c = 4;

    public Logger4(String str) {
        this.f26422b = str;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m11712a(int i) {
        return this.f26423c <= i || Log.isLoggable(this.f26422b, i);
    }

    /* JADX INFO: renamed from: b */
    public void m11713b(String str) {
        if (m11712a(3)) {
            Log.d(this.f26422b, str, null);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m11714c(String str, Throwable th) {
        if (m11712a(3)) {
            Log.d(this.f26422b, str, th);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m11715d(String str) {
        if (m11712a(6)) {
            Log.e(this.f26422b, str, null);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m11716e(String str, Throwable th) {
        if (m11712a(6)) {
            Log.e(this.f26422b, str, th);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m11717f(String str) {
        if (m11712a(5)) {
            Log.w(this.f26422b, str, null);
        }
    }
}
