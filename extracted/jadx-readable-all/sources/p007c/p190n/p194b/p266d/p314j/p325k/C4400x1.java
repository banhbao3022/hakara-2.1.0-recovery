package p007c.p190n.p194b.p266d.p314j.p325k;

import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: c.n.b.d.j.k.x1 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class C4400x1 {

    /* JADX INFO: renamed from: f */
    public static HashMap<String, String> f23606f;

    /* JADX INFO: renamed from: k */
    public static Object f23611k;

    /* JADX INFO: renamed from: l */
    public static boolean f23612l;

    /* JADX INFO: renamed from: a */
    public static final Uri f23601a = Uri.parse("content://com.google.android.gsf.gservices");

    /* JADX INFO: renamed from: b */
    public static final Uri f23602b = Uri.parse("content://com.google.android.gsf.gservices/prefix");

    /* JADX INFO: renamed from: c */
    public static final Pattern f23603c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    /* JADX INFO: renamed from: d */
    public static final Pattern f23604d = Pattern.compile("^(0|false|f|off|no|n)$", 2);

    /* JADX INFO: renamed from: e */
    public static final AtomicBoolean f23605e = new AtomicBoolean();

    /* JADX INFO: renamed from: g */
    public static final HashMap<String, Boolean> f23607g = new HashMap<>();

    /* JADX INFO: renamed from: h */
    public static final HashMap<String, Integer> f23608h = new HashMap<>();

    /* JADX INFO: renamed from: i */
    public static final HashMap<String, Long> f23609i = new HashMap<>();

    /* JADX INFO: renamed from: j */
    public static final HashMap<String, Float> f23610j = new HashMap<>();

    /* JADX INFO: renamed from: m */
    public static String[] f23613m = new String[0];

    /* JADX INFO: renamed from: a */
    public static void m10328a(Object obj, String str, String str2) {
        synchronized (C4400x1.class) {
            if (obj == f23611k) {
                f23606f.put(str, str2);
            }
        }
    }
}
