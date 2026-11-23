package p007c.p190n.p194b.p266d.p312i.p313a;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: c.n.b.d.i.a.f */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC2821f implements Callable<SharedPreferences> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Context f11985a;

    public CallableC2821f(Context context) {
        this.f11985a = context;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ SharedPreferences call() throws Exception {
        return this.f11985a.getSharedPreferences("google_sdk_flags", 0);
    }
}
