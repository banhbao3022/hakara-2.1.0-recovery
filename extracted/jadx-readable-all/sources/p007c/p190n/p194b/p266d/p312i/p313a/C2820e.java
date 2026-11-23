package p007c.p190n.p194b.p266d.p312i.p313a;

import android.content.Context;
import android.content.SharedPreferences;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.i.a.e */
/* JADX INFO: loaded from: classes.dex */
public final class C2820e {

    /* JADX INFO: renamed from: a */
    public static SharedPreferences f11984a;

    /* JADX INFO: renamed from: a */
    public static SharedPreferences m5651a(Context context) throws Exception {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            if (f11984a == null) {
                f11984a = (SharedPreferences) C2622l.m5248F0(new CallableC2821f(context));
            }
            sharedPreferences = f11984a;
        }
        return sharedPreferences;
    }
}
