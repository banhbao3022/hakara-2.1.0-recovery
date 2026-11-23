package p007c.p190n.p194b.p266d.p290d.p295s;

import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.d.s.b */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class C2518b {

    /* JADX INFO: renamed from: a */
    public final String f11373a;

    /* JADX INFO: renamed from: b */
    public final boolean f11374b;

    /* JADX INFO: renamed from: c */
    public String f11375c;

    public C2518b(String str) {
        C2622l.m5364f(str, "The log tag cannot be null or empty.");
        this.f11373a = str;
        this.f11374b = str.length() <= 23;
    }

    /* JADX INFO: renamed from: a */
    public void m5119a(String str, Object... objArr) {
        if (m5124f()) {
            Log.d(this.f11373a, m5123e(str, objArr));
        }
    }

    /* JADX INFO: renamed from: b */
    public void m5120b(Throwable th, String str, Object... objArr) {
        if (m5124f()) {
            Log.d(this.f11373a, m5123e(str, objArr), th);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m5121c(String str, Object... objArr) {
        Log.e(this.f11373a, m5123e(str, objArr));
    }

    /* JADX INFO: renamed from: d */
    public void m5122d(String str, Object... objArr) {
        Log.w(this.f11373a, m5123e(str, objArr));
    }

    /* JADX INFO: renamed from: e */
    public final String m5123e(String str, Object... objArr) {
        if (objArr.length != 0) {
            str = String.format(Locale.ROOT, str, objArr);
        }
        if (TextUtils.isEmpty(this.f11375c)) {
            return str;
        }
        String strValueOf = String.valueOf(this.f11375c);
        String strValueOf2 = String.valueOf(str);
        return strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m5124f() {
        return this.f11374b && Log.isLoggable(this.f11373a, 3);
    }
}
