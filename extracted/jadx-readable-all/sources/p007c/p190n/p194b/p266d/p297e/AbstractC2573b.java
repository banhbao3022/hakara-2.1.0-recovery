package p007c.p190n.p194b.p266d.p297e;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.stetho.server.http.HttpStatus;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p298f.p307u.p308j.ThreadFactoryC2790a;
import p007c.p190n.p194b.p266d.p314j.p325k.C4340s8;
import p007c.p190n.p194b.p266d.p333n.AbstractC4781i;

/* JADX INFO: renamed from: c.n.b.d.e.b */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2573b extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public final ExecutorService f11497a;

    public AbstractC2573b() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC2790a("firebase-iid-executor"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f11497a = Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo5172a(Context context, C2571a c2571a);

    /* JADX INFO: renamed from: b */
    public void mo5173b(Context context, Bundle bundle) {
    }

    /* JADX INFO: renamed from: c */
    public void mo5174c(Context context, Bundle bundle) {
    }

    /* JADX INFO: renamed from: d */
    public final int m5175d(Context context, Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("CloudMessagingReceiver", "Notification pending intent canceled");
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove("pending_intent");
        } else {
            extras = new Bundle();
        }
        if ("com.google.firebase.messaging.NOTIFICATION_OPEN".equals(intent.getAction())) {
            mo5174c(context, extras);
            return -1;
        }
        if ("com.google.firebase.messaging.NOTIFICATION_DISMISS".equals(intent.getAction())) {
            mo5173b(context, extras);
            return -1;
        }
        Log.e("CloudMessagingReceiver", "Unknown notification action");
        return HttpStatus.HTTP_INTERNAL_SERVER_ERROR;
    }

    /* JADX INFO: renamed from: e */
    public final int m5176e(Context context, Intent intent) {
        int i;
        AbstractC4781i abstractC4781iM5181b;
        if (intent.getExtras() == null) {
            return HttpStatus.HTTP_INTERNAL_SERVER_ERROR;
        }
        String stringExtra = intent.getStringExtra("google.message_id");
        if (TextUtils.isEmpty(stringExtra)) {
            abstractC4781iM5181b = C4340s8.m10208e(null);
        } else {
            Bundle bundleM1575Z = outline.m1575Z("google.message_id", stringExtra);
            C2581h c2581hM5180a = C2581h.m5180a(context);
            synchronized (c2581hM5180a) {
                i = c2581hM5180a.f11520e;
                c2581hM5180a.f11520e = i + 1;
            }
            abstractC4781iM5181b = c2581hM5180a.m5181b(new C2590q(i, bundleM1575Z));
        }
        int iMo5172a = mo5172a(context, new C2571a(intent));
        try {
            C4340s8.m10205b(abstractC4781iM5181b, TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            String strValueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 20);
            sb.append("Message ack failed: ");
            sb.append(strValueOf);
            Log.w("CloudMessagingReceiver", sb.toString());
        }
        return iMo5172a;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, final Intent intent) {
        if (intent == null) {
            return;
        }
        final boolean zIsOrderedBroadcast = isOrderedBroadcast();
        final BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
        this.f11497a.execute(new Runnable(this, intent, context, zIsOrderedBroadcast, pendingResultGoAsync) { // from class: c.n.b.d.e.g

            /* JADX INFO: renamed from: f */
            public final AbstractC2573b f11511f;

            /* JADX INFO: renamed from: g */
            public final Intent f11512g;

            /* JADX INFO: renamed from: h */
            public final Context f11513h;

            /* JADX INFO: renamed from: i */
            public final boolean f11514i;

            /* JADX INFO: renamed from: j */
            public final BroadcastReceiver.PendingResult f11515j;

            {
                this.f11511f = this;
                this.f11512g = intent;
                this.f11513h = context;
                this.f11514i = zIsOrderedBroadcast;
                this.f11515j = pendingResultGoAsync;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AbstractC2573b abstractC2573b = this.f11511f;
                Intent intent2 = this.f11512g;
                Context context2 = this.f11513h;
                boolean z = this.f11514i;
                BroadcastReceiver.PendingResult pendingResult = this.f11515j;
                Objects.requireNonNull(abstractC2573b);
                try {
                    Parcelable parcelableExtra = intent2.getParcelableExtra("wrapped_intent");
                    Intent intent3 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
                    int iM5175d = intent3 != null ? abstractC2573b.m5175d(context2, intent3) : abstractC2573b.m5176e(context2, intent2);
                    if (z) {
                        pendingResult.setResultCode(iM5175d);
                    }
                } finally {
                    pendingResult.finish();
                }
            }
        });
    }
}
