package p007c.p190n.p194b.p266d.p312i.p313a;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: c.n.b.d.i.a.d */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC2819d implements Callable<String> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SharedPreferences f11981a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f11982b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f11983c;

    public CallableC2819d(SharedPreferences sharedPreferences, String str, String str2) {
        this.f11981a = sharedPreferences;
        this.f11982b = str;
        this.f11983c = str2;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() throws Exception {
        return this.f11981a.getString(this.f11982b, this.f11983c);
    }
}
