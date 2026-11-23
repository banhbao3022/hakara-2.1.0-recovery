package p007c.p190n.p194b.p266d.p298f.p299o.p300n;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: renamed from: c.n.b.d.f.o.n.h0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2663h0 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public Context f11699a;

    /* JADX INFO: renamed from: b */
    public final AbstractC2660g0 f11700b;

    public C2663h0(AbstractC2660g0 abstractC2660g0) {
        this.f11700b = abstractC2660g0;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m5538a() {
        Context context = this.f11699a;
        if (context != null) {
            context.unregisterReceiver(this);
        }
        this.f11699a = null;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f11700b.mo5512a();
            m5538a();
        }
    }
}
