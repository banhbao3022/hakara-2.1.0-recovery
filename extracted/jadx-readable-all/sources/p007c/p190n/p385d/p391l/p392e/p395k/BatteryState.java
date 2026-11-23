package p007c.p190n.p385d.p391l.p392e.p395k;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: renamed from: c.n.d.l.e.k.e, reason: use source file name */
/* JADX INFO: compiled from: BatteryState.java */
/* JADX INFO: loaded from: classes.dex */
public class BatteryState {

    /* JADX INFO: renamed from: a */
    public final Float f26478a;

    /* JADX INFO: renamed from: b */
    public final boolean f26479b;

    public BatteryState(Float f, boolean z) {
        this.f26479b = z;
        this.f26478a = f;
    }

    /* JADX INFO: renamed from: a */
    public static BatteryState m11735a(Context context) {
        Float fValueOf = null;
        Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (intentRegisterReceiver != null) {
            int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
            if (intExtra != -1 && (intExtra == 2 || intExtra == 5)) {
                z = true;
            }
            int intExtra2 = intentRegisterReceiver.getIntExtra("level", -1);
            int intExtra3 = intentRegisterReceiver.getIntExtra("scale", -1);
            if (intExtra2 != -1 && intExtra3 != -1) {
                fValueOf = Float.valueOf(intExtra2 / intExtra3);
            }
        }
        return new BatteryState(fValueOf, z);
    }

    /* JADX INFO: renamed from: b */
    public int m11736b() {
        Float f;
        if (!this.f26479b || (f = this.f26478a) == null) {
            return 1;
        }
        return ((double) f.floatValue()) < 0.99d ? 2 : 3;
    }
}
