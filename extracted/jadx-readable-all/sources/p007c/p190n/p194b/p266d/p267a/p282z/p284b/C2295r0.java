package p007c.p190n.p194b.p266d.p267a.p282z.p284b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import java.util.Map;
import java.util.WeakHashMap;
import p007c.p190n.p194b.p266d.p314j.p315a.C2862b;
import p007c.p190n.p194b.p266d.p314j.p315a.C3052g3;

/* JADX INFO: renamed from: c.n.b.d.a.z.b.r0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2295r0 {

    /* JADX INFO: renamed from: d */
    public boolean f10772d;

    /* JADX INFO: renamed from: e */
    public Context f10773e;

    /* JADX INFO: renamed from: c */
    public boolean f10771c = false;

    /* JADX INFO: renamed from: b */
    public final Map<BroadcastReceiver, IntentFilter> f10770b = new WeakHashMap();

    /* JADX INFO: renamed from: a */
    public final BroadcastReceiver f10769a = new C2293q0(this);

    /* JADX INFO: renamed from: a */
    public final synchronized void m4799a(Context context) {
        if (this.f10771c) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        this.f10773e = applicationContext;
        if (applicationContext == null) {
            this.f10773e = context;
        }
        C3052g3.m6922a(this.f10773e);
        this.f10772d = ((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14264S1)).booleanValue();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        this.f10773e.registerReceiver(this.f10769a, intentFilter);
        this.f10771c = true;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m4800b(Context context, BroadcastReceiver broadcastReceiver) {
        if (this.f10772d) {
            this.f10770b.remove(broadcastReceiver);
        } else {
            context.unregisterReceiver(broadcastReceiver);
        }
    }
}
