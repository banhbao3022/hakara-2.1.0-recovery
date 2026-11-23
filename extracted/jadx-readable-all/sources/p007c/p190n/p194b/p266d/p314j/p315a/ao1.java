package p007c.p190n.p194b.p266d.p314j.p315a;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Handler;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ao1 {

    /* JADX INFO: renamed from: a */
    @SuppressLint({"StaticFieldLeak"})
    public static final ao1 f12237a = new ao1();

    /* JADX INFO: renamed from: b */
    public Context f12238b;

    /* JADX INFO: renamed from: c */
    public BroadcastReceiver f12239c;

    /* JADX INFO: renamed from: d */
    public boolean f12240d;

    /* JADX INFO: renamed from: e */
    public boolean f12241e;

    /* JADX INFO: renamed from: f */
    public fo1 f12242f;

    /* JADX INFO: renamed from: a */
    public static void m5837a(ao1 ao1Var, boolean z) {
        if (ao1Var.f12241e != z) {
            ao1Var.f12241e = z;
            if (ao1Var.f12240d) {
                ao1Var.m5838b();
                if (ao1Var.f12242f != null) {
                    if (!ao1Var.f12241e) {
                        zo1.f22366a.m8896b();
                        return;
                    }
                    Objects.requireNonNull(zo1.f22366a);
                    Handler handler = zo1.f22368c;
                    if (handler != null) {
                        handler.removeCallbacks(zo1.f22370e);
                        zo1.f22368c = null;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m5838b() {
        boolean z = this.f12241e;
        Iterator<nn1> it = yn1.f21931a.m8806a().iterator();
        while (it.hasNext()) {
            lo1 lo1Var = it.next().f17179e;
            if (lo1Var.f16431a.get() != null) {
                eo1.m6651a(lo1Var.m7596c(), "setState", true != z ? "foregrounded" : "backgrounded");
            }
        }
    }
}
