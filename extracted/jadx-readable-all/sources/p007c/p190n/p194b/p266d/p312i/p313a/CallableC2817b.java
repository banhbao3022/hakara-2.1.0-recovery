package p007c.p190n.p194b.p266d.p312i.p313a;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: c.n.b.d.i.a.b */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC2817b implements Callable<Integer> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SharedPreferences f11975a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f11976b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Integer f11977c;

    public CallableC2817b(SharedPreferences sharedPreferences, String str, Integer num) {
        this.f11975a = sharedPreferences;
        this.f11976b = str;
        this.f11977c = num;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Integer call() throws Exception {
        return Integer.valueOf(this.f11975a.getInt(this.f11976b, this.f11977c.intValue()));
    }
}
