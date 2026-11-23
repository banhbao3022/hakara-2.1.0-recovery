package p007c.p190n.p194b.p266d.p267a.p282z.p284b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: renamed from: c.n.b.d.a.z.b.q0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2293q0 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2295r0 f10766a;

    public C2293q0(C2295r0 c2295r0) {
        this.f10766a = c2295r0;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        C2295r0 c2295r0 = this.f10766a;
        synchronized (c2295r0) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<BroadcastReceiver, IntentFilter> entry : c2295r0.f10770b.entrySet()) {
                if (entry.getValue().hasAction(intent.getAction())) {
                    arrayList.add(entry.getKey());
                }
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((BroadcastReceiver) arrayList.get(i)).onReceive(context, intent);
            }
        }
    }
}
