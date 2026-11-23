package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class w61 implements ia1<x61> {

    /* JADX INFO: renamed from: a */
    public final lv1 f21007a;

    /* JADX INFO: renamed from: b */
    public final Context f21008b;

    public w61(lv1 lv1Var, Context context) {
        this.f21007a = lv1Var;
        this.f21008b = context;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ia1
    public final kv1<x61> zza() {
        return this.f21007a.mo6691u0(new Callable(this) { // from class: c.n.b.d.j.a.v61

            /* JADX INFO: renamed from: a */
            public final w61 f20703a;

            {
                this.f20703a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                double intExtra;
                w61 w61Var = this.f20703a;
                Objects.requireNonNull(w61Var);
                Intent intentRegisterReceiver = w61Var.f21008b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                boolean z = false;
                if (intentRegisterReceiver != null) {
                    int intExtra2 = intentRegisterReceiver.getIntExtra("status", -1);
                    intExtra = ((double) intentRegisterReceiver.getIntExtra("level", -1)) / ((double) intentRegisterReceiver.getIntExtra("scale", -1));
                    if (intExtra2 == 2 || intExtra2 == 5) {
                        z = true;
                    }
                } else {
                    intExtra = -1.0d;
                }
                return new x61(intExtra, z);
            }
        });
    }
}
