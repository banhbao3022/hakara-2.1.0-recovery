package p007c.p190n.p385d.p418r;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import p007c.p190n.p194b.p266d.p298f.p306t.C2778a;
import p007c.p190n.p194b.p266d.p298f.p307u.p308j.ThreadFactoryC2790a;
import p007c.p190n.p194b.p266d.p333n.C4782j;

/* JADX INFO: renamed from: c.n.d.r.d0 */
/* JADX INFO: compiled from: com.google.firebase:firebase-iid@@21.0.1 */
/* JADX INFO: loaded from: classes.dex */
public class ServiceConnectionC5477d0 implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    public final Context f27052a;

    /* JADX INFO: renamed from: b */
    public final Intent f27053b;

    /* JADX INFO: renamed from: c */
    public final ScheduledExecutorService f27054c;

    /* JADX INFO: renamed from: d */
    public final Queue<a> f27055d;

    /* JADX INFO: renamed from: e */
    public BinderC5471a0 f27056e;

    /* JADX INFO: renamed from: f */
    public boolean f27057f;

    /* JADX INFO: renamed from: c.n.d.r.d0$a */
    /* JADX INFO: compiled from: com.google.firebase:firebase-iid@@21.0.1 */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final Intent f27058a;

        /* JADX INFO: renamed from: b */
        public final C4782j<Void> f27059b = new C4782j<>();

        public a(Intent intent) {
            this.f27058a = intent;
        }

        /* JADX INFO: renamed from: a */
        public void m12065a() {
            this.f27059b.m10948b(null);
        }
    }

    public ServiceConnectionC5477d0(Context context, String str) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0, new ThreadFactoryC2790a("Firebase-FirebaseInstanceIdServiceConnection"));
        this.f27055d = new ArrayDeque();
        this.f27057f = false;
        Context applicationContext = context.getApplicationContext();
        this.f27052a = applicationContext;
        this.f27053b = new Intent(str).setPackage(applicationContext.getPackageName());
        this.f27054c = scheduledThreadPoolExecutor;
    }

    /* JADX INFO: renamed from: a */
    public final void m12062a() {
        while (!this.f27055d.isEmpty()) {
            this.f27055d.poll().m12065a();
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m12063b() {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "flush queue called");
        }
        while (!this.f27055d.isEmpty()) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "found intent to be delivered");
            }
            BinderC5471a0 binderC5471a0 = this.f27056e;
            if (binderC5471a0 == null || !binderC5471a0.isBinderAlive()) {
                m12064c();
                return;
            }
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "binder is alive, sending the intent.");
            }
            this.f27056e.m12061a(this.f27055d.poll());
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m12064c() {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            boolean z = this.f27057f;
            StringBuilder sb = new StringBuilder(39);
            sb.append("binder is dead. start connection? ");
            sb.append(!z);
            Log.d("FirebaseInstanceId", sb.toString());
        }
        if (this.f27057f) {
            return;
        }
        this.f27057f = true;
        try {
            if (C2778a.m5615b().m5616a(this.f27052a, this.f27053b, this, 65)) {
                return;
            } else {
                Log.e("FirebaseInstanceId", "binding to the service failed");
            }
        } catch (SecurityException e) {
            Log.e("FirebaseInstanceId", "Exception while binding the service", e);
        }
        this.f27057f = false;
        m12062a();
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String strValueOf = String.valueOf(componentName);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 20);
            sb.append("onServiceConnected: ");
            sb.append(strValueOf);
            Log.d("FirebaseInstanceId", sb.toString());
        }
        this.f27057f = false;
        if (iBinder instanceof BinderC5471a0) {
            this.f27056e = (BinderC5471a0) iBinder;
            m12063b();
            return;
        }
        String strValueOf2 = String.valueOf(iBinder);
        StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 28);
        sb2.append("Invalid service connection: ");
        sb2.append(strValueOf2);
        Log.e("FirebaseInstanceId", sb2.toString());
        m12062a();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String strValueOf = String.valueOf(componentName);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 23);
            sb.append("onServiceDisconnected: ");
            sb.append(strValueOf);
            Log.d("FirebaseInstanceId", sb.toString());
        }
        m12063b();
    }
}
