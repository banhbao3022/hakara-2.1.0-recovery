package p007c.p190n.p194b.p266d.p297e;

import android.content.Context;
import android.util.Log;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import p007c.p190n.p194b.p266d.p298f.p307u.p308j.ThreadFactoryC2790a;
import p007c.p190n.p194b.p266d.p333n.AbstractC4781i;

/* JADX INFO: renamed from: c.n.b.d.e.h */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2581h {

    /* JADX INFO: renamed from: a */
    public static C2581h f11516a;

    /* JADX INFO: renamed from: b */
    public final Context f11517b;

    /* JADX INFO: renamed from: c */
    public final ScheduledExecutorService f11518c;

    /* JADX INFO: renamed from: d */
    public ServiceConnectionC2582i f11519d = new ServiceConnectionC2582i(this, null);

    /* JADX INFO: renamed from: e */
    public int f11520e = 1;

    public C2581h(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f11518c = scheduledExecutorService;
        this.f11517b = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C2581h m5180a(Context context) {
        if (f11516a == null) {
            f11516a = new C2581h(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new ThreadFactoryC2790a("MessengerIpcClient"))));
        }
        return f11516a;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized <T> AbstractC4781i<T> m5181b(AbstractC2593t<T> abstractC2593t) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(abstractC2593t);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 9);
            sb.append("Queueing ");
            sb.append(strValueOf);
            Log.d("MessengerIpcClient", sb.toString());
        }
        if (!this.f11519d.m5183b(abstractC2593t)) {
            ServiceConnectionC2582i serviceConnectionC2582i = new ServiceConnectionC2582i(this, null);
            this.f11519d = serviceConnectionC2582i;
            serviceConnectionC2582i.m5183b(abstractC2593t);
        }
        return abstractC2593t.f11538b.f24683a;
    }
}
