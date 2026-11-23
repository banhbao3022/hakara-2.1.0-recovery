package p007c.p190n.p194b.p266d.p267a.p282z.p284b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p314j.p315a.C3553tn;

/* JADX INFO: renamed from: c.n.b.d.a.z.b.f1 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2261f1 extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (C3553tn.f19921a) {
            C3553tn.f19922b = false;
            C3553tn.f19923c = false;
            C2622l.m5226A3("Ad debug logging enablement is out of date.");
        }
        C2096e.m4589y(context);
    }
}
