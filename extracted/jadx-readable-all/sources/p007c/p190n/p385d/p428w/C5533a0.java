package p007c.p190n.p385d.p428w;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: c.n.d.w.a0 */
/* JADX INFO: compiled from: com.google.firebase:firebase-messaging@@21.0.1 */
/* JADX INFO: loaded from: classes.dex */
public final class C5533a0 {

    /* JADX INFO: renamed from: a */
    public static WeakReference<C5533a0> f27227a;

    /* JADX INFO: renamed from: b */
    public final SharedPreferences f27228b;

    /* JADX INFO: renamed from: c */
    public C5560y f27229c;

    /* JADX INFO: renamed from: d */
    public final Executor f27230d;

    public C5533a0(SharedPreferences sharedPreferences, Executor executor) {
        this.f27230d = executor;
        this.f27228b = sharedPreferences;
    }

    /* JADX INFO: renamed from: a */
    public synchronized C5561z m12166a() {
        String strPeek;
        C5561z c5561z;
        C5560y c5560y = this.f27229c;
        synchronized (c5560y.f27298d) {
            strPeek = c5560y.f27298d.peek();
        }
        Pattern pattern = C5561z.f27300a;
        c5561z = null;
        if (!TextUtils.isEmpty(strPeek)) {
            String[] strArrSplit = strPeek.split("!", -1);
            if (strArrSplit.length == 2) {
                c5561z = new C5561z(strArrSplit[0], strArrSplit[1]);
            }
        }
        return c5561z;
    }
}
