package p007c.p190n.p194b.p266d.p298f;

import android.R;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.TypedValue;
import java.util.concurrent.atomic.AtomicBoolean;
import p007c.p190n.p194b.p266d.p298f.p299o.p300n.InterfaceC2668j;
import p007c.p190n.p194b.p266d.p298f.p302q.AbstractDialogInterfaceOnClickListenerC2729g;
import p007c.p190n.p194b.p266d.p298f.p302q.C2723e;
import p007c.p190n.p194b.p266d.p298f.p302q.C2771y;
import p007c.p190n.p194b.p266d.p298f.p302q.C2773z;
import p007c.p190n.p194b.p266d.p314j.p319e.HandlerC3807c;
import p636z0.p691g.SimpleArrayMap;
import p636z0.p725k.p726c.C8174k;
import p636z0.p725k.p726c.C8176m;
import p636z0.p752p.p753c.FragmentActivity;
import p636z0.p752p.p753c.FragmentManager;

/* JADX INFO: renamed from: c.n.b.d.f.e */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class C2608e extends C2610f {

    /* JADX INFO: renamed from: c */
    public static final Object f11562c = new Object();

    /* JADX INFO: renamed from: d */
    public static final C2608e f11563d = new C2608e();

    /* JADX INFO: renamed from: c.n.b.d.f.e$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    @SuppressLint({"HandlerLeak"})
    public class a extends HandlerC3807c {

        /* JADX INFO: renamed from: a */
        public final Context f11564a;

        public a(Context context) {
            super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
            this.f11564a = context.getApplicationContext();
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                StringBuilder sb = new StringBuilder(50);
                sb.append("Don't know how to handle this message: ");
                sb.append(i);
                Log.w("GoogleApiAvailability", sb.toString());
                return;
            }
            int iMo5206c = C2608e.this.mo5206c(this.f11564a);
            if (C2608e.this.m5208e(iMo5206c)) {
                C2608e c2608e = C2608e.this;
                Context context = this.f11564a;
                Intent intentMo5205b = c2608e.mo5205b(context, iMo5206c, "n");
                c2608e.m5210i(context, iMo5206c, intentMo5205b == null ? null : PendingIntent.getActivity(context, 0, intentMo5205b, 134217728));
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static Dialog m5203g(Context context, int i, AbstractDialogInterfaceOnClickListenerC2729g abstractDialogInterfaceOnClickListenerC2729g, DialogInterface.OnCancelListener onCancelListener) {
        String string;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(C2723e.m5588b(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = context.getResources();
        if (i == 1) {
            string = resources.getString(mtp.media.karaoke.R.string.common_google_play_services_install_button);
        } else if (i != 2) {
            string = i != 3 ? resources.getString(R.string.ok) : resources.getString(mtp.media.karaoke.R.string.common_google_play_services_enable_button);
        } else {
            string = resources.getString(mtp.media.karaoke.R.string.common_google_play_services_update_button);
        }
        if (string != null) {
            builder.setPositiveButton(string, abstractDialogInterfaceOnClickListenerC2729g);
        }
        String strM5589c = C2723e.m5589c(context, i);
        if (strM5589c != null) {
            builder.setTitle(strM5589c);
        }
        return builder.create();
    }

    /* JADX INFO: renamed from: h */
    public static void m5204h(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        if (activity instanceof FragmentActivity) {
            FragmentManager fragmentManagerM16577C = ((FragmentActivity) activity).m16577C();
            C2624m c2624m = new C2624m();
            C2622l.m5379i(dialog, "Cannot display null dialog");
            dialog.setOnCancelListener(null);
            dialog.setOnDismissListener(null);
            c2624m.f11599s0 = dialog;
            if (onCancelListener != null) {
                c2624m.f11600t0 = onCancelListener;
            }
            c2624m.mo5469c1(fragmentManagerM16577C, str);
            return;
        }
        android.app.FragmentManager fragmentManager = activity.getFragmentManager();
        DialogFragmentC2604c dialogFragmentC2604c = new DialogFragmentC2604c();
        C2622l.m5379i(dialog, "Cannot display null dialog");
        dialog.setOnCancelListener(null);
        dialog.setOnDismissListener(null);
        dialogFragmentC2604c.f11556f = dialog;
        if (onCancelListener != null) {
            dialogFragmentC2604c.f11557g = onCancelListener;
        }
        dialogFragmentC2604c.show(fragmentManager, str);
    }

    @Override // p007c.p190n.p194b.p266d.p298f.C2610f
    /* JADX INFO: renamed from: b */
    public Intent mo5205b(Context context, int i, String str) {
        return super.mo5205b(context, i, str);
    }

    @Override // p007c.p190n.p194b.p266d.p298f.C2610f
    /* JADX INFO: renamed from: c */
    public int mo5206c(Context context) {
        return mo5207d(context, C2610f.f11567a);
    }

    @Override // p007c.p190n.p194b.p266d.p298f.C2610f
    /* JADX INFO: renamed from: d */
    public int mo5207d(Context context, int i) {
        return super.mo5207d(context, i);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m5208e(int i) {
        AtomicBoolean atomicBoolean = C2618j.f11583a;
        return i == 1 || i == 2 || i == 3 || i == 9;
    }

    /* JADX INFO: renamed from: f */
    public boolean m5209f(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogM5203g = m5203g(activity, i, new C2771y(super.mo5205b(activity, i, "d"), activity, i2), onCancelListener);
        if (dialogM5203g == null) {
            return false;
        }
        m5204h(activity, dialogM5203g, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    @TargetApi(20)
    /* JADX INFO: renamed from: i */
    public final void m5210i(Context context, int i, PendingIntent pendingIntent) {
        int i2;
        if (i == 18) {
            new a(context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strM5590d = i == 6 ? C2723e.m5590d(context, "common_google_play_services_resolution_required_title") : C2723e.m5589c(context, i);
        if (strM5590d == null) {
            strM5590d = context.getResources().getString(mtp.media.karaoke.R.string.common_google_play_services_notification_ticker);
        }
        String strM5591e = (i == 6 || i == 19) ? C2723e.m5591e(context, "common_google_play_services_resolution_required_text", C2723e.m5587a(context)) : C2723e.m5588b(context, i);
        Resources resources = context.getResources();
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        C8176m c8176m = new C8176m(context);
        c8176m.f37763y = true;
        c8176m.m16110g(16, true);
        c8176m.m16109f(strM5590d);
        C8174k c8174k = new C8174k();
        c8174k.f37708e = C8176m.m16104d(strM5591e);
        c8176m.m16114k(c8174k);
        if (C2622l.m5237D(context)) {
            C2622l.m5384j(true);
            c8176m.f37736N.icon = context.getApplicationInfo().icon;
            c8176m.f37750l = 2;
            if (C2622l.m5242E(context)) {
                c8176m.m16105a(mtp.media.karaoke.R.drawable.common_full_open_on_phone, resources.getString(mtp.media.karaoke.R.string.common_open_on_phone), pendingIntent);
            } else {
                c8176m.f37745g = pendingIntent;
            }
        } else {
            c8176m.f37736N.icon = R.drawable.stat_sys_warning;
            c8176m.m16115l(resources.getString(mtp.media.karaoke.R.string.common_google_play_services_notification_ticker));
            c8176m.f37736N.when = System.currentTimeMillis();
            c8176m.f37745g = pendingIntent;
            c8176m.m16108e(strM5591e);
        }
        if (C2622l.m5464z()) {
            C2622l.m5384j(C2622l.m5464z());
            synchronized (f11562c) {
            }
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            SimpleArrayMap<String, String> simpleArrayMap = C2723e.f11848a;
            String string = context.getResources().getString(mtp.media.karaoke.R.string.common_google_play_services_notification_channel_name);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
            } else if (!string.contentEquals(notificationChannel.getName())) {
                notificationChannel.setName(string);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            c8176m.f37729G = "com.google.android.gms.availability";
        }
        Notification notificationM16106b = c8176m.m16106b();
        if (i == 1 || i == 2 || i == 3) {
            i2 = 10436;
            C2618j.f11583a.set(false);
        } else {
            i2 = 39789;
        }
        notificationManager.notify(i2, notificationM16106b);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m5211j(Activity activity, InterfaceC2668j interfaceC2668j, int i, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogM5203g = m5203g(activity, i, new C2773z(super.mo5205b(activity, i, "d"), interfaceC2668j, 2), onCancelListener);
        if (dialogM5203g == null) {
            return false;
        }
        m5204h(activity, dialogM5203g, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }
}
