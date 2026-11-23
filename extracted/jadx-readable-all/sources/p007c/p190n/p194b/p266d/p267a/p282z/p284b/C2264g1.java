package p007c.p190n.p194b.p266d.p267a.p282z.p284b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: c.n.b.d.a.z.b.g1 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2264g1 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2267h1 f10710a;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            this.f10710a.f10717e = true;
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            this.f10710a.f10717e = false;
        }
    }
}
