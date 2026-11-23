package p007c.p190n.p385d.p428w;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: c.n.d.w.y */
/* JADX INFO: compiled from: com.google.firebase:firebase-messaging@@21.0.1 */
/* JADX INFO: loaded from: classes.dex */
public final class C5560y {

    /* JADX INFO: renamed from: a */
    public final SharedPreferences f27295a;

    /* JADX INFO: renamed from: e */
    public final Executor f27299e;

    /* JADX INFO: renamed from: d */
    public final ArrayDeque<String> f27298d = new ArrayDeque<>();

    /* JADX INFO: renamed from: b */
    public final String f27296b = "topic_operation_queue";

    /* JADX INFO: renamed from: c */
    public final String f27297c = ",";

    public C5560y(SharedPreferences sharedPreferences, String str, Executor executor) {
        this.f27295a = sharedPreferences;
        this.f27299e = executor;
    }

    /* JADX INFO: renamed from: a */
    public static C5560y m12206a(SharedPreferences sharedPreferences, String str, Executor executor) {
        C5560y c5560y = new C5560y(sharedPreferences, "topic_operation_queue", executor);
        synchronized (c5560y.f27298d) {
            c5560y.f27298d.clear();
            String string = c5560y.f27295a.getString(c5560y.f27296b, "");
            if (!TextUtils.isEmpty(string) && string.contains(c5560y.f27297c)) {
                String[] strArrSplit = string.split(c5560y.f27297c, -1);
                if (strArrSplit.length == 0) {
                    Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                }
                for (String str2 : strArrSplit) {
                    if (!TextUtils.isEmpty(str2)) {
                        c5560y.f27298d.add(str2);
                    }
                }
            }
        }
        return c5560y;
    }
}
