package p007c.p190n.p194b.p266d.p267a.p280x;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import p007c.p190n.p194b.p266d.p298f.C2618j;

/* JADX INFO: renamed from: c.n.b.d.a.x.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2213c {

    /* JADX INFO: renamed from: a */
    public SharedPreferences f10631a;

    public C2213c(Context context) {
        try {
            Context contextM5215a = C2618j.m5215a(context);
            this.f10631a = contextM5215a == null ? null : contextM5215a.getSharedPreferences("google_ads_flags", 0);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while getting SharedPreferences ", th);
            this.f10631a = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m4666a(String str) {
        try {
            SharedPreferences sharedPreferences = this.f10631a;
            if (sharedPreferences == null) {
                return false;
            }
            return sharedPreferences.getBoolean(str, false);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return false;
        }
    }
}
