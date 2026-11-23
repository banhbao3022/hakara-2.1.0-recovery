package p007c.p190n.p385d.p418r;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: renamed from: c.n.d.r.v */
/* JADX INFO: compiled from: com.google.firebase:firebase-iid@@21.0.1 */
/* JADX INFO: loaded from: classes.dex */
public class C5496v {

    /* JADX INFO: renamed from: a */
    public static C5496v f27096a;

    /* JADX INFO: renamed from: b */
    public String f27097b = null;

    /* JADX INFO: renamed from: c */
    public Boolean f27098c = null;

    /* JADX INFO: renamed from: d */
    public Boolean f27099d = null;

    /* JADX INFO: renamed from: e */
    public final Queue<Intent> f27100e = new ArrayDeque();

    /* JADX INFO: renamed from: a */
    public static synchronized C5496v m12078a() {
        if (f27096a == null) {
            f27096a = new C5496v();
        }
        return f27096a;
    }

    /* JADX INFO: renamed from: b */
    public boolean m12079b(Context context) {
        if (this.f27099d == null) {
            this.f27099d = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.f27098c.booleanValue() && Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f27099d.booleanValue();
    }

    /* JADX INFO: renamed from: c */
    public boolean m12080c(Context context) {
        if (this.f27098c == null) {
            this.f27098c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.f27098c.booleanValue() && Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f27098c.booleanValue();
    }
}
