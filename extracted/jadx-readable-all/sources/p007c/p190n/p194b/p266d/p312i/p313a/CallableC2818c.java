package p007c.p190n.p194b.p266d.p312i.p313a;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: c.n.b.d.i.a.c */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC2818c implements Callable<Long> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SharedPreferences f11978a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f11979b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Long f11980c;

    public CallableC2818c(SharedPreferences sharedPreferences, String str, Long l) {
        this.f11978a = sharedPreferences;
        this.f11979b = str;
        this.f11980c = l;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Long call() throws Exception {
        return Long.valueOf(this.f11978a.getLong(this.f11979b, this.f11980c.longValue()));
    }
}
