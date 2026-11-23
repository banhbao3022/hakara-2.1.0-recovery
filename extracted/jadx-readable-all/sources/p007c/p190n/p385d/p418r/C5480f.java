package p007c.p190n.p385d.p418r;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Base64;
import android.util.Log;
import com.facebook.stetho.server.http.HttpStatus;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p314j.p325k.C4340s8;
import p007c.p190n.p194b.p266d.p333n.AbstractC4781i;
import p007c.p190n.p194b.p266d.p333n.C4778g0;
import p007c.p190n.p194b.p266d.p333n.C4793u;
import p007c.p190n.p194b.p266d.p333n.InterfaceC4767b;
import p007c.p190n.p194b.p266d.p333n.InterfaceC4771d;

/* JADX INFO: renamed from: c.n.d.r.f */
/* JADX INFO: compiled from: com.google.firebase:firebase-iid@@21.0.1 */
/* JADX INFO: loaded from: classes.dex */
public class C5480f {

    /* JADX INFO: renamed from: a */
    public static final Object f27061a = new Object();

    /* JADX INFO: renamed from: b */
    public static ServiceConnectionC5477d0 f27062b;

    /* JADX INFO: renamed from: c */
    public final Context f27063c;

    /* JADX INFO: renamed from: d */
    public final Executor f27064d;

    public C5480f(Context context) {
        this.f27063c = context;
        this.f27064d = ExecutorC5470a.f27043f;
    }

    public C5480f(Context context, ExecutorService executorService) {
        this.f27063c = context;
        this.f27064d = executorService;
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC4781i<Integer> m12066a(Context context, Intent intent) {
        ServiceConnectionC5477d0 serviceConnectionC5477d0;
        C4778g0<Void> c4778g0;
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Binding to service");
        }
        synchronized (f27061a) {
            if (f27062b == null) {
                f27062b = new ServiceConnectionC5477d0(context, "com.google.firebase.MESSAGING_EVENT");
            }
            serviceConnectionC5477d0 = f27062b;
        }
        synchronized (serviceConnectionC5477d0) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "new intent queued in the bind-strategy delivery");
            }
            final ServiceConnectionC5477d0.a aVar = new ServiceConnectionC5477d0.a(intent);
            ScheduledExecutorService scheduledExecutorService = serviceConnectionC5477d0.f27054c;
            final ScheduledFuture<?> scheduledFutureSchedule = scheduledExecutorService.schedule(new Runnable(aVar) { // from class: c.n.d.r.b0

                /* JADX INFO: renamed from: f */
                public final ServiceConnectionC5477d0.a f27047f;

                {
                    this.f27047f = aVar;
                }

                @Override // java.lang.Runnable
                public void run() {
                    ServiceConnectionC5477d0.a aVar2 = this.f27047f;
                    String action = aVar2.f27058a.getAction();
                    StringBuilder sb = new StringBuilder(String.valueOf(action).length() + 61);
                    sb.append("Service took too long to process intent: ");
                    sb.append(action);
                    sb.append(" App may get closed.");
                    Log.w("FirebaseInstanceId", sb.toString());
                    aVar2.m12065a();
                }
            }, 9000L, TimeUnit.MILLISECONDS);
            C4778g0<Void> c4778g1 = aVar.f27059b.f24683a;
            c4778g1.f24676b.m10927b(new C4793u(scheduledExecutorService, new InterfaceC4771d(scheduledFutureSchedule) { // from class: c.n.d.r.c0

                /* JADX INFO: renamed from: a */
                public final ScheduledFuture f27050a;

                {
                    this.f27050a = scheduledFutureSchedule;
                }

                @Override // p007c.p190n.p194b.p266d.p333n.InterfaceC4771d
                /* JADX INFO: renamed from: b */
                public void mo5171b(AbstractC4781i abstractC4781i) {
                    this.f27050a.cancel(false);
                }
            }));
            c4778g1.m10946s();
            serviceConnectionC5477d0.f27055d.add(aVar);
            serviceConnectionC5477d0.m12063b();
            c4778g0 = aVar.f27059b.f24683a;
        }
        Executor executor = C5482h.f27066a;
        return c4778g0.mo10934g(ExecutorC5481g.f27065f, C5476d.f27051a);
    }

    /* JADX INFO: renamed from: b */
    public AbstractC4781i<Integer> m12067b(final Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        boolean z = false;
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        final Context context = this.f27063c;
        if (C2622l.m5464z() && context.getApplicationInfo().targetSdkVersion >= 26) {
            z = true;
        }
        return (z && (intent.getFlags() & 268435456) == 0) ? m12066a(context, intent) : C4340s8.m10206c(this.f27064d, new Callable(context, intent) { // from class: c.n.d.r.b

            /* JADX INFO: renamed from: a */
            public final Context f27045a;

            /* JADX INFO: renamed from: b */
            public final Intent f27046b;

            {
                this.f27045a = context;
                this.f27046b = intent;
            }

            @Override // java.util.concurrent.Callable
            public Object call() {
                String str;
                ServiceInfo serviceInfo;
                String str2;
                int i;
                ComponentName componentNameStartService;
                Context context2 = this.f27045a;
                Intent intent2 = this.f27046b;
                C5496v c5496vM12078a = C5496v.m12078a();
                Objects.requireNonNull(c5496vM12078a);
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    Log.d("FirebaseInstanceId", "Starting service");
                }
                c5496vM12078a.f27100e.offer(intent2);
                Intent intent3 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent3.setPackage(context2.getPackageName());
                synchronized (c5496vM12078a) {
                    str = c5496vM12078a.f27097b;
                    if (str == null) {
                        ResolveInfo resolveInfoResolveService = context2.getPackageManager().resolveService(intent3, 0);
                        if (resolveInfoResolveService == null || (serviceInfo = resolveInfoResolveService.serviceInfo) == null) {
                            Log.e("FirebaseInstanceId", "Failed to resolve target intent service, skipping classname enforcement");
                        } else if (!context2.getPackageName().equals(serviceInfo.packageName) || (str2 = serviceInfo.name) == null) {
                            String str3 = serviceInfo.packageName;
                            String str4 = serviceInfo.name;
                            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 94 + String.valueOf(str4).length());
                            sb.append("Error resolving target intent service, skipping classname enforcement. Resolved service was: ");
                            sb.append(str3);
                            sb.append("/");
                            sb.append(str4);
                            Log.e("FirebaseInstanceId", sb.toString());
                        } else {
                            if (str2.startsWith(".")) {
                                String strValueOf = String.valueOf(context2.getPackageName());
                                String strValueOf2 = String.valueOf(serviceInfo.name);
                                c5496vM12078a.f27097b = strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
                            } else {
                                c5496vM12078a.f27097b = serviceInfo.name;
                            }
                            str = c5496vM12078a.f27097b;
                        }
                        str = null;
                    }
                }
                if (str != null) {
                    if (Log.isLoggable("FirebaseInstanceId", 3)) {
                        Log.d("FirebaseInstanceId", str.length() != 0 ? "Restricting intent to a specific service: ".concat(str) : new String("Restricting intent to a specific service: "));
                    }
                    intent3.setClassName(context2.getPackageName(), str);
                }
                try {
                    if (c5496vM12078a.m12080c(context2)) {
                        componentNameStartService = C5499y.m12092a(context2, intent3);
                    } else {
                        componentNameStartService = context2.startService(intent3);
                        Log.d("FirebaseInstanceId", "Missing wake lock permission, service start may be delayed");
                    }
                    if (componentNameStartService == null) {
                        Log.e("FirebaseInstanceId", "Error while delivering the message: ServiceIntent not found.");
                        i = HttpStatus.HTTP_NOT_FOUND;
                    } else {
                        i = -1;
                    }
                } catch (IllegalStateException e) {
                    String strValueOf3 = String.valueOf(e);
                    StringBuilder sb2 = new StringBuilder(strValueOf3.length() + 45);
                    sb2.append("Failed to start service while in background: ");
                    sb2.append(strValueOf3);
                    Log.e("FirebaseInstanceId", sb2.toString());
                    i = 402;
                } catch (SecurityException e2) {
                    Log.e("FirebaseInstanceId", "Error while delivering the message to the serviceIntent", e2);
                    i = 401;
                }
                return Integer.valueOf(i);
            }
        }).mo10935h(this.f27064d, new InterfaceC4767b(context, intent) { // from class: c.n.d.r.c

            /* JADX INFO: renamed from: a */
            public final Context f27048a;

            /* JADX INFO: renamed from: b */
            public final Intent f27049b;

            {
                this.f27048a = context;
                this.f27049b = intent;
            }

            @Override // p007c.p190n.p194b.p266d.p333n.InterfaceC4767b
            /* JADX INFO: renamed from: a */
            public Object mo5191a(AbstractC4781i abstractC4781i) {
                Context context2 = this.f27048a;
                Intent intent2 = this.f27049b;
                if (!C2622l.m5464z() || ((Integer) abstractC4781i.mo10937j()).intValue() != 402) {
                    return abstractC4781i;
                }
                AbstractC4781i<Integer> abstractC4781iM12066a = C5480f.m12066a(context2, intent2);
                Executor executor = C5482h.f27066a;
                return abstractC4781iM12066a.mo10934g(ExecutorC5481g.f27065f, C5478e.f27060a);
            }
        });
    }
}
