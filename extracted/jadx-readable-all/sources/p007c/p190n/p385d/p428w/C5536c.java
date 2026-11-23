package p007c.p190n.p385d.p428w;

import android.R;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p314j.p323i.C4067b;
import p007c.p190n.p194b.p266d.p314j.p323i.C4068c;
import p007c.p190n.p194b.p266d.p314j.p323i.C4076k;
import p007c.p190n.p194b.p266d.p314j.p325k.C4340s8;
import p007c.p190n.p194b.p266d.p333n.AbstractC4781i;
import p636z0.p725k.p726c.C8173j;
import p636z0.p725k.p726c.C8174k;
import p636z0.p725k.p726c.C8176m;
import p636z0.p725k.p727d.ContextCompat;

/* JADX INFO: renamed from: c.n.d.w.c */
/* JADX INFO: compiled from: com.google.firebase:firebase-messaging@@21.0.1 */
/* JADX INFO: loaded from: classes.dex */
public class C5536c {

    /* JADX INFO: renamed from: a */
    public final Executor f27237a;

    /* JADX INFO: renamed from: b */
    public final Context f27238b;

    /* JADX INFO: renamed from: c */
    public final C5555t f27239c;

    public C5536c(Context context, C5555t c5555t, Executor executor) {
        this.f27237a = executor;
        this.f27238b = context;
        this.f27239c = c5555t;
    }

    /* JADX WARN: Code duplicated, block: B:158:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:18:0x004e A[EDGE_INSN: B:18:0x004e->B:19:0x004f BREAK  A[LOOP:0: B:11:0x0036->B:247:?]] */
    /* JADX WARN: Code duplicated, block: B:233:0x0397 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:237:0x01f5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x012e  */
    /* JADX WARN: Code duplicated, block: B:59:0x0135  */
    /* JADX WARN: Code duplicated, block: B:60:0x013b  */
    /* JADX WARN: Code duplicated, block: B:63:0x0148  */
    /* JADX WARN: Code duplicated, block: B:65:0x015a  */
    /* JADX WARN: Code duplicated, block: B:66:0x0162  */
    /* JADX WARN: Code duplicated, block: B:68:0x016f  */
    /* JADX WARN: Code duplicated, block: B:98:0x0223  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v44, types: [int] */
    /* JADX WARN: Type inference failed for: r0v78 */
    /* JADX WARN: Type inference failed for: r0v79 */
    /* JADX WARN: Type inference failed for: r0v80 */
    /* JADX WARN: Type inference failed for: r0v81 */
    /* JADX INFO: renamed from: a */
    public boolean m12167a() {
        boolean z;
        final C5552q c5552q;
        Bundle bundle;
        int identifier;
        String string;
        int i;
        int identifier2;
        Uri defaultUri;
        Intent launchIntentForPackage;
        PendingIntent activity;
        Integer numValueOf;
        int i2;
        if (this.f27239c.m12192a("gcm.n.noui")) {
            return true;
        }
        if (!((KeyguardManager) this.f27238b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            int iMyPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f27238b.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses == null) {
                z = false;
                break;
            }
            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
            while (true) {
                if (it.hasNext()) {
                    ActivityManager.RunningAppProcessInfo next = it.next();
                    if (next.pid == iMyPid) {
                        if (next.importance == 100) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                break;
            }
        }
        z = false;
        break;
        if (z) {
            return false;
        }
        String strM12201j = this.f27239c.m12201j("gcm.n.image");
        if (TextUtils.isEmpty(strM12201j)) {
            c5552q = null;
        } else {
            try {
                c5552q = new C5552q(new URL(strM12201j));
            } catch (MalformedURLException unused) {
                String strValueOf = String.valueOf(strM12201j);
                Log.w("FirebaseMessaging", strValueOf.length() != 0 ? "Not downloading image, bad URL: ".concat(strValueOf) : new String("Not downloading image, bad URL: "));
                c5552q = null;
            }
        }
        if (c5552q != null) {
            c5552q.f27285g = C4340s8.m10206c(this.f27237a, new Callable(c5552q) { // from class: c.n.d.w.p

                /* JADX INFO: renamed from: a */
                public final C5552q f27283a;

                {
                    this.f27283a = c5552q;
                }

                @Override // java.util.concurrent.Callable
                public Object call() throws IOException {
                    byte[] bArrM9331a;
                    C5552q c5552q2 = this.f27283a;
                    String strValueOf2 = String.valueOf(c5552q2.f27284f);
                    StringBuilder sb = new StringBuilder(strValueOf2.length() + 22);
                    sb.append("Starting download of: ");
                    sb.append(strValueOf2);
                    Log.i("FirebaseMessaging", sb.toString());
                    URLConnection uRLConnectionOpenConnection = c5552q2.f27284f.openConnection();
                    if (uRLConnectionOpenConnection.getContentLength() > 1048576) {
                        throw new IOException("Content-Length exceeds max size of 1048576");
                    }
                    InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
                    try {
                        c5552q2.f27286h = inputStream;
                        int i3 = C4068c.f23012a;
                        C4067b c4067b = new C4067b(inputStream);
                        ArrayDeque arrayDeque = new ArrayDeque(20);
                        int i4 = 8192;
                        int i5 = 0;
                        loop0: while (true) {
                            if (i5 >= 2147483639) {
                                if (c4067b.read() != -1) {
                                    throw new OutOfMemoryError("input is too large to fit in a byte array");
                                }
                                bArrM9331a = C4068c.m9331a(arrayDeque, 2147483639);
                                break;
                            }
                            int iMin = Math.min(i4, 2147483639 - i5);
                            byte[] bArr = new byte[iMin];
                            arrayDeque.add(bArr);
                            int i6 = 0;
                            while (i6 < iMin) {
                                int i7 = c4067b.read(bArr, i6, iMin - i6);
                                if (i7 == -1) {
                                    bArrM9331a = C4068c.m9331a(arrayDeque, i5);
                                    break loop0;
                                }
                                i6 += i7;
                                i5 += i7;
                            }
                            long j2 = i4;
                            long j3 = j2 + j2;
                            if (j3 > 2147483647L) {
                                i4 = Integer.MAX_VALUE;
                            } else {
                                i4 = j3 < -2147483648L ? Integer.MIN_VALUE : (int) j3;
                            }
                        }
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (Log.isLoggable("FirebaseMessaging", 2)) {
                            String strValueOf3 = String.valueOf(c5552q2.f27284f);
                            StringBuilder sb2 = new StringBuilder(strValueOf3.length() + 34);
                            sb2.append("Downloaded ");
                            sb2.append(bArrM9331a.length);
                            sb2.append(" bytes from ");
                            sb2.append(strValueOf3);
                            Log.v("FirebaseMessaging", sb2.toString());
                        }
                        if (bArrM9331a.length > 1048576) {
                            throw new IOException("Image exceeds max size of 1048576");
                        }
                        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrM9331a, 0, bArrM9331a.length);
                        if (bitmapDecodeByteArray == null) {
                            String strValueOf4 = String.valueOf(c5552q2.f27284f);
                            throw new IOException(outline.m1550A(new StringBuilder(strValueOf4.length() + 24), "Failed to decode image: ", strValueOf4));
                        }
                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                            String strValueOf5 = String.valueOf(c5552q2.f27284f);
                            StringBuilder sb3 = new StringBuilder(strValueOf5.length() + 31);
                            sb3.append("Successfully downloaded image: ");
                            sb3.append(strValueOf5);
                            Log.d("FirebaseMessaging", sb3.toString());
                        }
                        return bitmapDecodeByteArray;
                    } catch (Throwable th) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th2) {
                                C4076k.f23018a.mo9332a(th, th2);
                            }
                        }
                        throw th;
                    }
                }
            });
        }
        Context context = this.f27238b;
        C5555t c5555t = this.f27239c;
        AtomicInteger atomicInteger = C5532a.f27226a;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
                bundle = Bundle.EMPTY;
            }
        } catch (PackageManager.NameNotFoundException e) {
            String strValueOf2 = String.valueOf(e);
            StringBuilder sb = new StringBuilder(strValueOf2.length() + 35);
            sb.append("Couldn't get own application info: ");
            sb.append(strValueOf2);
            Log.w("FirebaseMessaging", sb.toString());
        }
        String packageName = context.getPackageName();
        String strM12201j2 = c5555t.m12201j("gcm.n.android_channel_id");
        if (Build.VERSION.SDK_INT < 26) {
            strM12201j2 = null;
        } else {
            try {
                if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion >= 26) {
                    NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                    if (TextUtils.isEmpty(strM12201j2)) {
                        strM12201j2 = bundle.getString("com.google.firebase.messaging.default_notification_channel_id");
                        if (!TextUtils.isEmpty(strM12201j2)) {
                            Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                        } else if (notificationManager.getNotificationChannel(strM12201j2) == null) {
                            Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                        }
                        strM12201j2 = "fcm_fallback_notification_channel";
                        if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                            identifier = context.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", context.getPackageName());
                            if (identifier == 0) {
                                Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                                string = "Misc";
                            } else {
                                string = context.getString(identifier);
                            }
                            notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", string, 3));
                        }
                    } else if (notificationManager.getNotificationChannel(strM12201j2) == null) {
                        outline.m1573X(new StringBuilder(String.valueOf(strM12201j2).length() + 122), "Notification Channel requested (", strM12201j2, ") has not been created by the app. Manifest configuration, or default, value will be used.", "FirebaseMessaging");
                        strM12201j2 = bundle.getString("com.google.firebase.messaging.default_notification_channel_id");
                        if (!TextUtils.isEmpty(strM12201j2)) {
                            Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                        } else if (notificationManager.getNotificationChannel(strM12201j2) == null) {
                            Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                        }
                        strM12201j2 = "fcm_fallback_notification_channel";
                        if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                            identifier = context.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", context.getPackageName());
                            if (identifier == 0) {
                                Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                                string = "Misc";
                            } else {
                                string = context.getString(identifier);
                            }
                            notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", string, 3));
                        }
                    }
                } else {
                    strM12201j2 = null;
                }
            } catch (PackageManager.NameNotFoundException unused2) {
            }
        }
        Resources resources = context.getResources();
        PackageManager packageManager = context.getPackageManager();
        C8176m c8176m = new C8176m(context, strM12201j2);
        String strM12200i = c5555t.m12200i(resources, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(strM12200i)) {
            c8176m.m16109f(strM12200i);
        }
        String strM12200i2 = c5555t.m12200i(resources, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(strM12200i2)) {
            c8176m.m16108e(strM12200i2);
            C8174k c8174k = new C8174k();
            c8174k.f37708e = C8176m.m16104d(strM12200i2);
            c8176m.m16114k(c8174k);
        }
        String strM12201j3 = c5555t.m12201j("gcm.n.icon");
        if (TextUtils.isEmpty(strM12201j3)) {
            i = bundle.getInt("com.google.firebase.messaging.default_notification_icon", 0);
            if (i == 0 && C5532a.m12165b(resources, i)) {
                identifier2 = i;
            } else {
                try {
                } catch (PackageManager.NameNotFoundException e2) {
                    String strValueOf3 = String.valueOf(e2);
                    StringBuilder sb2 = new StringBuilder(strValueOf3.length() + 35);
                    sb2.append("Couldn't get own application info: ");
                    sb2.append(strValueOf3);
                    Log.w("FirebaseMessaging", sb2.toString());
                    identifier2 = i;
                }
            }
            if (identifier2 != 0 || !C5532a.m12165b(resources, identifier2)) {
                identifier2 = R.drawable.sym_def_app_icon;
            }
        } else {
            identifier2 = resources.getIdentifier(strM12201j3, "drawable", packageName);
            if ((identifier2 == 0 || !C5532a.m12165b(resources, identifier2)) && ((identifier2 = resources.getIdentifier(strM12201j3, "mipmap", packageName)) == 0 || !C5532a.m12165b(resources, identifier2))) {
                outline.m1573X(new StringBuilder(String.valueOf(strM12201j3).length() + 61), "Icon resource ", strM12201j3, " not found. Notification will use default icon.", "FirebaseMessaging");
                i = bundle.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                identifier2 = i == 0 ? packageManager.getApplicationInfo(packageName, 0).icon : packageManager.getApplicationInfo(packageName, 0).icon;
                if (identifier2 != 0) {
                    identifier2 = R.drawable.sym_def_app_icon;
                } else {
                    identifier2 = R.drawable.sym_def_app_icon;
                }
            }
        }
        c8176m.f37736N.icon = identifier2;
        String strM12201j4 = c5555t.m12201j("gcm.n.sound2");
        if (TextUtils.isEmpty(strM12201j4)) {
            strM12201j4 = c5555t.m12201j("gcm.n.sound");
        }
        if (TextUtils.isEmpty(strM12201j4)) {
            defaultUri = null;
        } else if ("default".equals(strM12201j4) || resources.getIdentifier(strM12201j4, "raw", packageName) == 0) {
            defaultUri = RingtoneManager.getDefaultUri(2);
        } else {
            StringBuilder sb3 = new StringBuilder(String.valueOf(packageName).length() + 24 + String.valueOf(strM12201j4).length());
            sb3.append("android.resource://");
            sb3.append(packageName);
            sb3.append("/raw/");
            sb3.append(strM12201j4);
            defaultUri = Uri.parse(sb3.toString());
        }
        if (defaultUri != null) {
            c8176m.m16113j(defaultUri);
        }
        String strM12201j5 = c5555t.m12201j("gcm.n.click_action");
        if (TextUtils.isEmpty(strM12201j5)) {
            Uri uriM12196e = c5555t.m12196e();
            if (uriM12196e != null) {
                launchIntentForPackage = new Intent("android.intent.action.VIEW");
                launchIntentForPackage.setPackage(packageName);
                launchIntentForPackage.setData(uriM12196e);
            } else {
                launchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
                if (launchIntentForPackage == null) {
                    Log.w("FirebaseMessaging", "No activity found to launch app");
                }
            }
        } else {
            launchIntentForPackage = new Intent(strM12201j5);
            launchIntentForPackage.setPackage(packageName);
            launchIntentForPackage.setFlags(268435456);
        }
        if (launchIntentForPackage == null) {
            activity = null;
        } else {
            launchIntentForPackage.addFlags(67108864);
            Bundle bundle2 = new Bundle(c5555t.f27289a);
            for (String str : c5555t.f27289a.keySet()) {
                if (str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
                    bundle2.remove(str);
                }
            }
            launchIntentForPackage.putExtras(bundle2);
            activity = PendingIntent.getActivity(context, C5532a.f27226a.incrementAndGet(), launchIntentForPackage, 1073741824);
            if (c5555t.m12192a("google.c.a.e")) {
                activity = C5532a.m12164a(context, new Intent("com.google.firebase.messaging.NOTIFICATION_OPEN").putExtras(c5555t.m12203m()).putExtra("pending_intent", activity));
            }
        }
        c8176m.f37745g = activity;
        PendingIntent pendingIntentM12164a = !c5555t.m12192a("google.c.a.e") ? null : C5532a.m12164a(context, new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(c5555t.m12203m()));
        if (pendingIntentM12164a != null) {
            c8176m.f37736N.deleteIntent = pendingIntentM12164a;
        }
        String strM12201j6 = c5555t.m12201j("gcm.n.color");
        if (TextUtils.isEmpty(strM12201j6)) {
            i2 = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
            if (i2 != 0) {
                numValueOf = Integer.valueOf(ContextCompat.m16134b(context, i2));
            } else {
                numValueOf = null;
            }
        } else {
            try {
                numValueOf = Integer.valueOf(Color.parseColor(strM12201j6));
            } catch (IllegalArgumentException unused3) {
                outline.m1573X(new StringBuilder(String.valueOf(strM12201j6).length() + 56), "Color is invalid: ", strM12201j6, ". Notification will use default color.", "FirebaseMessaging");
                i2 = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
                if (i2 != 0) {
                    try {
                        numValueOf = Integer.valueOf(ContextCompat.m16134b(context, i2));
                    } catch (Resources.NotFoundException unused4) {
                        Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
                        numValueOf = null;
                    }
                } else {
                    numValueOf = null;
                }
            }
        }
        if (numValueOf != null) {
            c8176m.f37726D = numValueOf.intValue();
        }
        c8176m.m16110g(16, !c5555t.m12192a("gcm.n.sticky"));
        c8176m.f37763y = c5555t.m12192a("gcm.n.local_only");
        String strM12201j7 = c5555t.m12201j("gcm.n.ticker");
        if (strM12201j7 != null) {
            c8176m.f37736N.tickerText = C8176m.m16104d(strM12201j7);
        }
        Integer numM12193b = c5555t.m12193b("gcm.n.notification_priority");
        if (numM12193b == null) {
            numM12193b = null;
        } else if (numM12193b.intValue() < -2 || numM12193b.intValue() > 2) {
            String strValueOf4 = String.valueOf(numM12193b);
            outline.m1573X(new StringBuilder(strValueOf4.length() + 72), "notificationPriority is invalid ", strValueOf4, ". Skipping setting notificationPriority.", "FirebaseMessaging");
            numM12193b = null;
        }
        if (numM12193b != null) {
            c8176m.f37750l = numM12193b.intValue();
        }
        Integer numM12193b2 = c5555t.m12193b("gcm.n.visibility");
        if (numM12193b2 == null) {
            numM12193b2 = null;
        } else if (numM12193b2.intValue() < -1 || numM12193b2.intValue() > 1) {
            String strValueOf5 = String.valueOf(numM12193b2);
            outline.m1573X(new StringBuilder(strValueOf5.length() + 53), "visibility is invalid: ", strValueOf5, ". Skipping setting visibility.", "NotificationParams");
            numM12193b2 = null;
        }
        if (numM12193b2 != null) {
            c8176m.f37727E = numM12193b2.intValue();
        }
        Integer numM12193b3 = c5555t.m12193b("gcm.n.notification_count");
        if (numM12193b3 == null) {
            numM12193b3 = null;
        } else if (numM12193b3.intValue() < 0) {
            String strValueOf6 = String.valueOf(numM12193b3);
            outline.m1573X(new StringBuilder(strValueOf6.length() + 67), "notificationCount is invalid: ", strValueOf6, ". Skipping setting notificationCount.", "FirebaseMessaging");
            numM12193b3 = null;
        }
        if (numM12193b3 != null) {
            c8176m.f37749k = numM12193b3.intValue();
        }
        Long lM12199h = c5555t.m12199h("gcm.n.event_time");
        if (lM12199h != null) {
            c8176m.f37751m = true;
            c8176m.f37736N.when = lM12199h.longValue();
        }
        long[] jArrM12202k = c5555t.m12202k();
        if (jArrM12202k != null) {
            c8176m.f37736N.vibrate = jArrM12202k;
        }
        int[] iArrM12195d = c5555t.m12195d();
        if (iArrM12195d != null) {
            c8176m.m16112i(iArrM12195d[0], iArrM12195d[1], iArrM12195d[2]);
        }
        boolean zM12192a = c5555t.m12192a("gcm.n.default_sound");
        ?? r0 = zM12192a;
        if (c5555t.m12192a("gcm.n.default_vibrate_timings")) {
            r0 = (zM12192a ? 1 : 0) | 2;
        }
        ?? r1 = r0;
        if (c5555t.m12192a("gcm.n.default_light_settings")) {
            r1 = (r0 == true ? 1 : 0) | 4;
        }
        Notification notification = c8176m.f37736N;
        notification.defaults = r1;
        if ((r1 & 4) != 0) {
            notification.flags |= 1;
        }
        String strM12201j8 = c5555t.m12201j("gcm.n.tag");
        if (TextUtils.isEmpty(strM12201j8)) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            StringBuilder sb4 = new StringBuilder(37);
            sb4.append("FCM-Notification:");
            sb4.append(jUptimeMillis);
            strM12201j8 = sb4.toString();
        }
        if (c5552q != null) {
            try {
                AbstractC4781i<Bitmap> abstractC4781i = c5552q.f27285g;
                Objects.requireNonNull(abstractC4781i, "null reference");
                Bitmap bitmap = (Bitmap) C4340s8.m10205b(abstractC4781i, 5L, TimeUnit.SECONDS);
                c8176m.m16111h(bitmap);
                C8173j c8173j = new C8173j();
                c8173j.f37705e = bitmap;
                c8173j.m16092i(null);
                c8176m.m16114k(c8173j);
            } catch (InterruptedException unused5) {
                Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                c5552q.close();
                Thread.currentThread().interrupt();
            } catch (ExecutionException e3) {
                String strValueOf7 = String.valueOf(e3.getCause());
                StringBuilder sb5 = new StringBuilder(strValueOf7.length() + 26);
                sb5.append("Failed to download image: ");
                sb5.append(strValueOf7);
                Log.w("FirebaseMessaging", sb5.toString());
            } catch (TimeoutException unused6) {
                Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                c5552q.close();
            }
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) this.f27238b.getSystemService("notification")).notify(strM12201j8, 0, c8176m.m16106b());
        return true;
    }
}
