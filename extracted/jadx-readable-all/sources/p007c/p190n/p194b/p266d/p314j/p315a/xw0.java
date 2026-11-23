package p007c.p190n.p194b.p266d.p314j.p315a;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import com.google.android.gms.ads.AdService;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import mtp.media.karaoke.R;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p283a.BinderC2232o;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2267h1;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.InterfaceC2266h0;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;
import p636z0.p725k.p726c.C8176m;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class xw0 extends AbstractBinderC3398pg {

    /* JADX INFO: renamed from: g */
    public final Context f21703g;

    /* JADX INFO: renamed from: h */
    public final po0 f21704h;

    /* JADX INFO: renamed from: i */
    public final C3665wn f21705i;

    /* JADX INFO: renamed from: j */
    public final pw0 f21706j;

    /* JADX INFO: renamed from: k */
    public final im1 f21707k;

    public xw0(Context context, pw0 pw0Var, C3665wn c3665wn, po0 po0Var, im1 im1Var) {
        this.f21703g = context;
        this.f21704h = po0Var;
        this.f21705i = c3665wn;
        this.f21706j = pw0Var;
        this.f21707k = im1Var;
    }

    /* JADX INFO: renamed from: F6 */
    public static void m8760F6(final Activity activity, final BinderC2232o binderC2232o, final InterfaceC2266h0 interfaceC2266h0, final pw0 pw0Var, final po0 po0Var, final im1 im1Var, final String str, final String str2) {
        C2330u c2330u = C2330u.f10884a;
        C2267h1 c2267h1 = c2330u.f10889d;
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, c2330u.f10891f.mo4724m());
        final Resources resourcesM6646c = c2330u.f10893h.m6646c();
        builder.setTitle(resourcesM6646c == null ? "Open ad when you're back online." : resourcesM6646c.getString(R.string.offline_opt_in_title)).setMessage(resourcesM6646c == null ? "We'll send you a notification with a link to the advertiser site." : resourcesM6646c.getString(R.string.offline_opt_in_message)).setPositiveButton(resourcesM6646c == null ? "OK" : resourcesM6646c.getString(R.string.offline_opt_in_confirm), new DialogInterface.OnClickListener(po0Var, activity, im1Var, pw0Var, str, interfaceC2266h0, str2, resourcesM6646c, binderC2232o) { // from class: c.n.b.d.j.a.sw0

            /* JADX INFO: renamed from: f */
            public final po0 f19717f;

            /* JADX INFO: renamed from: g */
            public final Activity f19718g;

            /* JADX INFO: renamed from: h */
            public final im1 f19719h;

            /* JADX INFO: renamed from: i */
            public final pw0 f19720i;

            /* JADX INFO: renamed from: j */
            public final String f19721j;

            /* JADX INFO: renamed from: k */
            public final InterfaceC2266h0 f19722k;

            /* JADX INFO: renamed from: l */
            public final String f19723l;

            /* JADX INFO: renamed from: m */
            public final Resources f19724m;

            /* JADX INFO: renamed from: n */
            public final BinderC2232o f19725n;

            {
                this.f19717f = po0Var;
                this.f19718g = activity;
                this.f19719h = im1Var;
                this.f19720i = pw0Var;
                this.f19721j = str;
                this.f19722k = interfaceC2266h0;
                this.f19723l = str2;
                this.f19724m = resourcesM6646c;
                this.f19725n = binderC2232o;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                po0 po0Var2 = this.f19717f;
                Activity activity2 = this.f19718g;
                im1 im1Var2 = this.f19719h;
                pw0 pw0Var2 = this.f19720i;
                String str3 = this.f19721j;
                InterfaceC2266h0 interfaceC2266h1 = this.f19722k;
                String str4 = this.f19723l;
                Resources resources = this.f19724m;
                final BinderC2232o binderC2232o2 = this.f19725n;
                if (po0Var2 != null) {
                    HashMap map = new HashMap();
                    map.put("dialog_action", "confirm");
                    xw0.m8762H6(activity2, po0Var2, im1Var2, pw0Var2, str3, "dialog_click", map);
                }
                try {
                    if (!interfaceC2266h1.zze(new BinderC2800b(activity2), str4, str3)) {
                        pw0Var2.m8170c(str3);
                        if (po0Var2 != null) {
                            xw0.m8761G6(activity2, po0Var2, im1Var2, pw0Var2, str3, "offline_notification_worker_not_scheduled");
                        }
                    }
                } catch (RemoteException e) {
                    C2622l.m5438t3("Failed to schedule offline notification poster.", e);
                }
                C2330u c2330u2 = C2330u.f10884a;
                C2267h1 c2267h2 = c2330u2.f10889d;
                AlertDialog.Builder builder2 = new AlertDialog.Builder(activity2, c2330u2.f10891f.mo4724m());
                builder2.setMessage(resources == null ? "You'll get a notification with the link when you're back online" : resources.getString(R.string.offline_opt_in_confirmation)).setOnCancelListener(new DialogInterface.OnCancelListener(binderC2232o2) { // from class: c.n.b.d.j.a.vw0

                    /* JADX INFO: renamed from: f */
                    public final BinderC2232o f20954f;

                    {
                        this.f20954f = binderC2232o2;
                    }

                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface2) {
                        BinderC2232o binderC2232o3 = this.f20954f;
                        if (binderC2232o3 != null) {
                            binderC2232o3.m4683a();
                        }
                    }
                });
                AlertDialog alertDialogCreate = builder2.create();
                alertDialogCreate.show();
                Timer timer = new Timer();
                timer.schedule(new ww0(alertDialogCreate, timer, binderC2232o2), 3000L);
            }
        }).setNegativeButton(resourcesM6646c == null ? "No thanks" : resourcesM6646c.getString(R.string.offline_opt_in_decline), new DialogInterface.OnClickListener(pw0Var, str, po0Var, activity, im1Var, binderC2232o) { // from class: c.n.b.d.j.a.tw0

            /* JADX INFO: renamed from: f */
            public final pw0 f20166f;

            /* JADX INFO: renamed from: g */
            public final String f20167g;

            /* JADX INFO: renamed from: h */
            public final po0 f20168h;

            /* JADX INFO: renamed from: i */
            public final Activity f20169i;

            /* JADX INFO: renamed from: j */
            public final im1 f20170j;

            /* JADX INFO: renamed from: k */
            public final BinderC2232o f20171k;

            {
                this.f20166f = pw0Var;
                this.f20167g = str;
                this.f20168h = po0Var;
                this.f20169i = activity;
                this.f20170j = im1Var;
                this.f20171k = binderC2232o;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                pw0 pw0Var2 = this.f20166f;
                String str3 = this.f20167g;
                po0 po0Var2 = this.f20168h;
                Activity activity2 = this.f20169i;
                im1 im1Var2 = this.f20170j;
                BinderC2232o binderC2232o2 = this.f20171k;
                pw0Var2.m8170c(str3);
                if (po0Var2 != null) {
                    HashMap map = new HashMap();
                    map.put("dialog_action", "dismiss");
                    xw0.m8762H6(activity2, po0Var2, im1Var2, pw0Var2, str3, "dialog_click", map);
                }
                if (binderC2232o2 != null) {
                    binderC2232o2.m4683a();
                }
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener(pw0Var, str, po0Var, activity, im1Var, binderC2232o) { // from class: c.n.b.d.j.a.uw0

            /* JADX INFO: renamed from: f */
            public final pw0 f20663f;

            /* JADX INFO: renamed from: g */
            public final String f20664g;

            /* JADX INFO: renamed from: h */
            public final po0 f20665h;

            /* JADX INFO: renamed from: i */
            public final Activity f20666i;

            /* JADX INFO: renamed from: j */
            public final im1 f20667j;

            /* JADX INFO: renamed from: k */
            public final BinderC2232o f20668k;

            {
                this.f20663f = pw0Var;
                this.f20664g = str;
                this.f20665h = po0Var;
                this.f20666i = activity;
                this.f20667j = im1Var;
                this.f20668k = binderC2232o;
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                pw0 pw0Var2 = this.f20663f;
                String str3 = this.f20664g;
                po0 po0Var2 = this.f20665h;
                Activity activity2 = this.f20666i;
                im1 im1Var2 = this.f20667j;
                BinderC2232o binderC2232o2 = this.f20668k;
                pw0Var2.m8170c(str3);
                if (po0Var2 != null) {
                    HashMap map = new HashMap();
                    map.put("dialog_action", "dismiss");
                    xw0.m8762H6(activity2, po0Var2, im1Var2, pw0Var2, str3, "dialog_click", map);
                }
                if (binderC2232o2 != null) {
                    binderC2232o2.m4683a();
                }
            }
        });
        builder.create().show();
    }

    /* JADX INFO: renamed from: G6 */
    public static void m8761G6(Context context, po0 po0Var, im1 im1Var, pw0 pw0Var, String str, String str2) {
        m8762H6(context, po0Var, im1Var, pw0Var, str, str2, new HashMap());
    }

    /* JADX INFO: renamed from: H6 */
    public static void m8762H6(Context context, po0 po0Var, im1 im1Var, pw0 pw0Var, String str, String str2, Map<String, String> map) {
        String strM8356a;
        if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14351f5)).booleanValue()) {
            hm1 hm1VarM7144a = hm1.m7144a(str2);
            hm1VarM7144a.f14911a.put("gqi", str);
            C2330u c2330u = C2330u.f10884a;
            C2267h1 c2267h1 = c2330u.f10889d;
            hm1VarM7144a.f14911a.put("device_connectivity", true == C2267h1.m4747f(context) ? "online" : "offline");
            hm1VarM7144a.f14911a.put("event_timestamp", String.valueOf(c2330u.f10896k.mo5623c()));
            for (Map.Entry<String, String> entry : map.entrySet()) {
                hm1VarM7144a.f14911a.put(entry.getKey(), entry.getValue());
            }
            strM8356a = im1Var.mo7279a(hm1VarM7144a);
        } else {
            oo0 oo0VarM8131a = po0Var.m8131a();
            oo0VarM8131a.f17700a.put("gqi", str);
            oo0VarM8131a.f17700a.put("action", str2);
            C2330u c2330u2 = C2330u.f10884a;
            C2267h1 c2267h2 = c2330u2.f10889d;
            oo0VarM8131a.f17700a.put("device_connectivity", true == C2267h1.m4747f(context) ? "online" : "offline");
            oo0VarM8131a.f17700a.put("event_timestamp", String.valueOf(c2330u2.f10896k.mo5623c()));
            for (Map.Entry<String, String> entry2 : map.entrySet()) {
                oo0VarM8131a.f17700a.put(entry2.getKey(), entry2.getValue());
            }
            strM8356a = oo0VarM8131a.f17701b.f18043a.f21279e.m8356a(oo0VarM8131a.f17700a);
        }
        pw0Var.m8169a(new nw0(pw0Var, new rw0(C2330u.f10884a.f10896k.mo5623c(), str, strM8356a, 2)));
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3435qg
    /* JADX INFO: renamed from: I0 */
    public final void mo8005I0(Intent intent) {
        char c2;
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
            String stringExtra2 = intent.getStringExtra("gws_query_id");
            String stringExtra3 = intent.getStringExtra("uri");
            C2267h1 c2267h1 = C2330u.f10884a.f10889d;
            boolean zM4747f = C2267h1.m4747f(this.f21703g);
            HashMap map = new HashMap();
            if (stringExtra.equals("offline_notification_clicked")) {
                map.put("offline_notification_action", "offline_notification_clicked");
                char c3 = true == zM4747f ? (char) 1 : (char) 2;
                map.put("obvs", String.valueOf(Build.VERSION.SDK_INT));
                map.put("olaih", String.valueOf(stringExtra3.startsWith("http")));
                try {
                    Context context = this.f21703g;
                    Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                    if (launchIntentForPackage == null) {
                        launchIntentForPackage = new Intent("android.intent.action.VIEW");
                        launchIntentForPackage.setData(Uri.parse(stringExtra3));
                    }
                    launchIntentForPackage.addFlags(268435456);
                    context.startActivity(launchIntentForPackage);
                    map.put("olaa", "olas");
                } catch (ActivityNotFoundException unused) {
                    map.put("olaa", "olaf");
                }
                c2 = c3;
            } else {
                map.put("offline_notification_action", "offline_notification_dismissed");
                c2 = 2;
            }
            m8762H6(this.f21703g, this.f21704h, this.f21707k, this.f21706j, stringExtra2, "offline_notification_action", map);
            try {
                SQLiteDatabase writableDatabase = this.f21706j.getWritableDatabase();
                if (c2 == 1) {
                    this.f21706j.f18111g.execute(new kw0(writableDatabase, stringExtra2, this.f21705i));
                } else {
                    pw0.m8167f(writableDatabase, stringExtra2);
                }
            } catch (SQLiteException e) {
                String strValueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 51);
                sb.append("Failed to get writable offline buffering database: ");
                sb.append(strValueOf);
                C2622l.m5408n3(sb.toString());
            }
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3435qg
    /* JADX INFO: renamed from: O0 */
    public final void mo8006O0(InterfaceC2799a interfaceC2799a, String str, String str2) {
        Context context = (Context) BinderC2800b.m5639T1(interfaceC2799a);
        C2330u c2330u = C2330u.f10884a;
        C2267h1 c2267h1 = c2330u.f10889d;
        if (C2622l.m5464z()) {
            NotificationChannel notificationChannel = new NotificationChannel("offline_notification_channel", "AdMob Offline Notifications", 2);
            notificationChannel.setShowBadge(false);
            ((NotificationManager) context.getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannel);
        }
        Intent intent = new Intent();
        intent.setClass(context, AdService.class);
        intent.setAction("offline_notification_clicked");
        intent.putExtra("offline_notification_action", "offline_notification_clicked");
        intent.putExtra("gws_query_id", str2);
        intent.putExtra("uri", str);
        int i = yr1.f21981a | 1073741824;
        PendingIntent pendingIntentM8828a = yr1.m8828a(context, 0, intent, i);
        Intent intent2 = new Intent();
        intent2.setClass(context, AdService.class);
        intent2.setAction("offline_notification_dismissed");
        intent2.putExtra("offline_notification_action", "offline_notification_dismissed");
        intent2.putExtra("gws_query_id", str2);
        PendingIntent pendingIntentM8828a2 = yr1.m8828a(context, 0, intent2, i);
        Resources resourcesM6646c = c2330u.f10893h.m6646c();
        C8176m c8176m = new C8176m(context, "offline_notification_channel");
        c8176m.m16109f(resourcesM6646c == null ? "View the ad you saved when you were offline" : resourcesM6646c.getString(R.string.offline_notification_title));
        c8176m.m16108e(resourcesM6646c == null ? "Tap to open ad" : resourcesM6646c.getString(R.string.offline_notification_text));
        c8176m.m16110g(16, true);
        c8176m.f37736N.deleteIntent = pendingIntentM8828a2;
        c8176m.f37745g = pendingIntentM8828a;
        c8176m.f37736N.icon = context.getApplicationInfo().icon;
        ((NotificationManager) context.getSystemService("notification")).notify(str2, 54321, c8176m.m16106b());
        m8762H6(this.f21703g, this.f21704h, this.f21707k, this.f21706j, str2, "offline_notification_impression", new HashMap());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3435qg
    /* JADX INFO: renamed from: f */
    public final void mo8007f() {
        this.f21706j.m8169a(new jw0(this.f21705i));
    }
}
