package p007c.p190n.p194b.p266d.p267a.p282z.p284b;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.WebSettings;
import java.util.concurrent.Callable;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.d.a.z.b.o0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC2287o0 implements Callable<String> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Context f10760a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f10761b;

    public CallableC2287o0(Context context, Context context2) {
        this.f10760a = context;
        this.f10761b = context2;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ String call() throws Exception {
        SharedPreferences sharedPreferences;
        boolean z = false;
        if (this.f10760a != null) {
            C2096e.m4590z("Attempting to read user agent from Google Play Services.");
            sharedPreferences = this.f10760a.getSharedPreferences("admob_user_agent", 0);
        } else {
            C2096e.m4590z("Attempting to read user agent from local cache.");
            sharedPreferences = this.f10761b.getSharedPreferences("admob_user_agent", 0);
            z = true;
        }
        String string = sharedPreferences.getString("user_agent", "");
        if (TextUtils.isEmpty(string)) {
            C2096e.m4590z("Reading user agent from WebSettings");
            string = WebSettings.getDefaultUserAgent(this.f10761b);
            if (z) {
                sharedPreferences.edit().putString("user_agent", string).apply();
                C2096e.m4590z("Persisting user agent.");
            }
        }
        return string;
    }
}
