package p007c.p190n.p194b.p266d.p312i.p313a;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: c.n.b.d.i.a.a */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC2816a implements Callable<Boolean> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SharedPreferences f11972a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f11973b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Boolean f11974c;

    public CallableC2816a(SharedPreferences sharedPreferences, String str, Boolean bool) {
        this.f11972a = sharedPreferences;
        this.f11973b = str;
        this.f11974c = bool;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Boolean call() throws Exception {
        return Boolean.valueOf(this.f11972a.getBoolean(this.f11973b, this.f11974c.booleanValue()));
    }
}
