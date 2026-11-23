package p007c.p190n.p194b.p266d.p297e;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p333n.AbstractC4781i;
import p007c.p190n.p194b.p266d.p333n.C4778g0;
import p007c.p190n.p194b.p266d.p333n.C4782j;
import p007c.p190n.p194b.p266d.p333n.C4793u;
import p007c.p190n.p194b.p266d.p333n.InterfaceC4771d;
import p636z0.p691g.SimpleArrayMap;

/* JADX INFO: renamed from: c.n.b.d.e.c */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class C2575c {

    /* JADX INFO: renamed from: a */
    public static int f11499a;

    /* JADX INFO: renamed from: b */
    public static PendingIntent f11500b;

    /* JADX INFO: renamed from: c */
    public static final Executor f11501c = ExecutorC2576c0.f11509f;

    /* JADX INFO: renamed from: e */
    public final Context f11503e;

    /* JADX INFO: renamed from: f */
    public final C2594u f11504f;

    /* JADX INFO: renamed from: g */
    public final ScheduledExecutorService f11505g;

    /* JADX INFO: renamed from: i */
    public Messenger f11507i;

    /* JADX INFO: renamed from: j */
    public C2577d f11508j;

    /* JADX INFO: renamed from: d */
    public final SimpleArrayMap<String, C4782j<Bundle>> f11502d = new SimpleArrayMap<>();

    /* JADX INFO: renamed from: h */
    public Messenger f11506h = new Messenger(new HandlerC2574b0(this, Looper.getMainLooper()));

    public C2575c(Context context) {
        this.f11503e = context;
        this.f11504f = new C2594u(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f11505g = scheduledThreadPoolExecutor;
    }

    /* JADX INFO: renamed from: a */
    public final void m5177a(String str, Bundle bundle) {
        synchronized (this.f11502d) {
            C4782j<Bundle> c4782jRemove = this.f11502d.remove(str);
            if (c4782jRemove != null) {
                c4782jRemove.f24683a.m10944q(bundle);
            } else {
                String strValueOf = String.valueOf(str);
                Log.w("Rpc", strValueOf.length() != 0 ? "Missing callback for ".concat(strValueOf) : new String("Missing callback for "));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e2  */
    /* JADX INFO: renamed from: b */
    public final AbstractC4781i<Bundle> m5178b(Bundle bundle) {
        final String string;
        synchronized (C2575c.class) {
            int i = f11499a;
            f11499a = i + 1;
            string = Integer.toString(i);
        }
        final C4782j<Bundle> c4782j = new C4782j<>();
        synchronized (this.f11502d) {
            this.f11502d.put(string, c4782j);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f11504f.m5189a() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        Context context = this.f11503e;
        synchronized (C2575c.class) {
            if (f11500b == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f11500b = PendingIntent.getBroadcast(context, 0, intent2, 0);
            }
            intent.putExtra("app", f11500b);
        }
        intent.putExtra("kid", outline.m1587i(outline.m1558I(string, 5), "|ID|", string, "|"));
        if (Log.isLoggable("Rpc", 3)) {
            String strValueOf = String.valueOf(intent.getExtras());
            StringBuilder sb = new StringBuilder(strValueOf.length() + 8);
            sb.append("Sending ");
            sb.append(strValueOf);
            Log.d("Rpc", sb.toString());
        }
        intent.putExtra("google.messenger", this.f11506h);
        if (this.f11507i != null || this.f11508j != null) {
            Message messageObtain = Message.obtain();
            messageObtain.obj = intent;
            try {
                Messenger messenger = this.f11507i;
                if (messenger != null) {
                    messenger.send(messageObtain);
                } else {
                    Messenger messenger2 = this.f11508j.f11510f;
                    Objects.requireNonNull(messenger2);
                    messenger2.send(messageObtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
                if (this.f11504f.m5189a() == 2) {
                    this.f11503e.sendBroadcast(intent);
                } else {
                    this.f11503e.startService(intent);
                }
            }
        } else if (this.f11504f.m5189a() == 2) {
            this.f11503e.sendBroadcast(intent);
        } else {
            this.f11503e.startService(intent);
        }
        final ScheduledFuture<?> scheduledFutureSchedule = this.f11505g.schedule(new Runnable(c4782j) { // from class: c.n.b.d.e.x

            /* JADX INFO: renamed from: f */
            public final C4782j f11545f;

            {
                this.f11545f = c4782j;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (this.f11545f.m10947a(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                }
            }
        }, 30L, TimeUnit.SECONDS);
        C4778g0<Bundle> c4778g0 = c4782j.f24683a;
        c4778g0.f24676b.m10927b(new C4793u(ExecutorC2576c0.f11509f, new InterfaceC4771d(this, string, scheduledFutureSchedule) { // from class: c.n.b.d.e.a0

            /* JADX INFO: renamed from: a */
            public final C2575c f11494a;

            /* JADX INFO: renamed from: b */
            public final String f11495b;

            /* JADX INFO: renamed from: c */
            public final ScheduledFuture f11496c;

            {
                this.f11494a = this;
                this.f11495b = string;
                this.f11496c = scheduledFutureSchedule;
            }

            @Override // p007c.p190n.p194b.p266d.p333n.InterfaceC4771d
            /* JADX INFO: renamed from: b */
            public final void mo5171b(AbstractC4781i abstractC4781i) {
                C2575c c2575c = this.f11494a;
                String str = this.f11495b;
                ScheduledFuture scheduledFuture = this.f11496c;
                synchronized (c2575c.f11502d) {
                    c2575c.f11502d.remove(str);
                }
                scheduledFuture.cancel(false);
            }
        }));
        c4778g0.m10946s();
        return c4782j.f24683a;
    }
}
