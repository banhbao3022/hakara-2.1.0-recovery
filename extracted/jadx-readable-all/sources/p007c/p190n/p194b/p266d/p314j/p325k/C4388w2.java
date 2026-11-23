package p007c.p190n.p194b.p266d.p314j.p325k;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import java.util.Map;
import p636z0.p691g.ArrayMap;

/* JADX INFO: renamed from: c.n.b.d.j.k.w2 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4388w2 implements InterfaceC4138e2 {

    /* JADX INFO: renamed from: a */
    public static final Map<String, C4388w2> f23578a = new ArrayMap();

    /* JADX INFO: renamed from: b */
    public final SharedPreferences f23579b;

    /* JADX INFO: renamed from: c */
    public final SharedPreferences.OnSharedPreferenceChangeListener f23580c;

    /* JADX INFO: renamed from: d */
    public final Object f23581d;

    /* JADX INFO: renamed from: e */
    public volatile Map<String, ?> f23582e;

    /* JADX INFO: renamed from: a */
    public static C4388w2 m10308a(Context context) {
        C4388w2 c4388w2;
        if (C4426z1.m10339a()) {
            throw null;
        }
        synchronized (C4388w2.class) {
            c4388w2 = f23578a.get(null);
            if (c4388w2 == null) {
                StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                try {
                    throw null;
                } catch (Throwable th) {
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    throw th;
                }
            }
        }
        return c4388w2;
    }

    /* JADX INFO: renamed from: b */
    public static synchronized void m10309b() {
        for (C4388w2 c4388w2 : f23578a.values()) {
            c4388w2.f23579b.unregisterOnSharedPreferenceChangeListener(c4388w2.f23580c);
        }
        f23578a.clear();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4138e2
    /* JADX INFO: renamed from: f */
    public final Object mo9407f(String str) {
        Map<String, ?> map = this.f23582e;
        if (map == null) {
            synchronized (this.f23581d) {
                map = this.f23582e;
                if (map == null) {
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        Map<String, ?> all = this.f23579b.getAll();
                        this.f23582e = all;
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        map = all;
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        throw th;
                    }
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }
}
