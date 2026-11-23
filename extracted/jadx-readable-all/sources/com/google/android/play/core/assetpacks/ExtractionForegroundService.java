package com.google.android.play.core.assetpacks;

import android.R;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import java.util.Objects;
import p007c.p190n.p194b.p334e.C4799a;
import p007c.p190n.p194b.p367f.p368a.p370b.C4989c2;
import p007c.p190n.p194b.p367f.p368a.p370b.C4999f0;
import p007c.p190n.p194b.p367f.p368a.p373d.C5089f;

/* JADX INFO: loaded from: classes.dex */
public class ExtractionForegroundService extends Service {

    /* JADX INFO: renamed from: f */
    public final C5089f f29265f = new C5089f("ExtractionForegroundService");

    /* JADX INFO: renamed from: g */
    public Context f29266g;

    /* JADX INFO: renamed from: h */
    public C4989c2 f29267h;

    /* JADX INFO: renamed from: i */
    public NotificationManager f29268i;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        C4999f0 c4999f0M10985e0 = C4799a.m10985e0(getApplicationContext());
        Context context = c4999f0M10985e0.f25756a.f25784a;
        Objects.requireNonNull(context, "Cannot return null from a non-@Nullable @Provides method");
        this.f29266g = context;
        this.f29267h = c4999f0M10985e0.f25780y.mo11416a();
        this.f29268i = (NotificationManager) this.f29266g.getSystemService("notification");
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this) {
            String stringExtra = intent.getStringExtra("notification_title");
            String stringExtra2 = intent.getStringExtra("notification_subtext");
            long longExtra = intent.getLongExtra("notification_timeout", 600000L);
            PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("notification_on_click_intent");
            int i3 = Build.VERSION.SDK_INT;
            Notification.Builder timeoutAfter = i3 >= 26 ? new Notification.Builder(this.f29266g, "playcore-assetpacks-service-notification-channel").setTimeoutAfter(longExtra) : new Notification.Builder(this.f29266g).setPriority(-2);
            if (pendingIntent != null) {
                timeoutAfter.setContentIntent(pendingIntent);
            }
            Notification.Builder contentTitle = timeoutAfter.setSmallIcon(R.drawable.stat_sys_download).setOngoing(false).setContentTitle(stringExtra == null ? "Downloading additional file" : stringExtra);
            if (stringExtra2 == null) {
                stringExtra = "Transferring";
            }
            contentTitle.setSubText(stringExtra);
            int intExtra = intent.getIntExtra("notification_color", 0);
            if (intExtra != 0) {
                timeoutAfter.setColor(intExtra).setVisibility(-1);
            }
            Notification notificationBuild = timeoutAfter.build();
            this.f29265f.m11533b(4, "Starting foreground installation service.", new Object[0]);
            this.f29267h.m11430a(true);
            if (i3 >= 26) {
                String stringExtra3 = intent.getStringExtra("notification_channel_name");
                synchronized (this) {
                    if (stringExtra3 == null) {
                        stringExtra3 = "File downloads by Play";
                    }
                    this.f29268i.createNotificationChannel(new NotificationChannel("playcore-assetpacks-service-notification-channel", stringExtra3, 2));
                }
                return 2;
            }
            startForeground(-1883842196, notificationBuild);
        }
        int intExtra2 = intent.getIntExtra("action_type", 0);
        if (intExtra2 == 2) {
            synchronized (this) {
                this.f29265f.m11533b(4, "Stopping service.", new Object[0]);
                this.f29267h.m11430a(false);
                stopForeground(true);
                stopSelf();
            }
        } else {
            this.f29265f.m11533b(6, "Unknown action type received: %d", new Object[]{Integer.valueOf(intExtra2)});
        }
        return 2;
    }
}
