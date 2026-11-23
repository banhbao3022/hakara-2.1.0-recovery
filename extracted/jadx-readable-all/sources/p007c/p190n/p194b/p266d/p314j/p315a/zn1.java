package p007c.p190n.p194b.p266d.p314j.p315a;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zn1 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ao1 f22360a;

    public zn1(ao1 ao1Var) {
        this.f22360a = ao1Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        KeyguardManager keyguardManager;
        if (intent == null) {
            return;
        }
        if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            ao1.m5837a(this.f22360a, true);
            return;
        }
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            ao1.m5837a(this.f22360a, false);
        } else {
            if (!"android.intent.action.SCREEN_ON".equals(intent.getAction()) || (keyguardManager = (KeyguardManager) context.getSystemService("keyguard")) == null || keyguardManager.inKeyguardRestrictedInputMode()) {
                return;
            }
            ao1.m5837a(this.f22360a, false);
        }
    }
}
