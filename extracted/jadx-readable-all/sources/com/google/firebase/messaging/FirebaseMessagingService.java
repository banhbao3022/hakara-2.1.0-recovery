package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p007c.p190n.p194b.p195a.AutoValue_Event;
import p007c.p190n.p194b.p195a.Encoding;
import p007c.p190n.p194b.p195a.Priority2;
import p007c.p190n.p194b.p195a.TransportFactory;
import p007c.p190n.p194b.p266d.p298f.p307u.p308j.ThreadFactoryC2790a;
import p007c.p190n.p385d.FirebaseApp2;
import p007c.p190n.p385d.p386j.p387a.InterfaceC5229a;
import p007c.p190n.p385d.p413o.EncodingException;
import p007c.p190n.p385d.p413o.p415j.JsonDataEncoderBuilder4;
import p007c.p190n.p385d.p418r.C5496v;
import p007c.p190n.p385d.p428w.AbstractServiceC5542g;
import p007c.p190n.p385d.p428w.C5536c;
import p007c.p190n.p385d.p428w.C5550o;
import p007c.p190n.p385d.p428w.C5553r;
import p007c.p190n.p385d.p428w.C5554s;
import p007c.p190n.p385d.p428w.C5555t;
import p007c.p190n.p385d.p428w.C5556u;
import p007c.p190n.p385d.p428w.C5558w;

/* JADX INFO: compiled from: com.google.firebase:firebase-messaging@@21.0.1 */
/* JADX INFO: loaded from: classes.dex */
public class FirebaseMessagingService extends AbstractServiceC5542g {

    /* JADX INFO: renamed from: k */
    public static final Queue<String> f29296k = new ArrayDeque(10);

    @Override // p007c.p190n.p385d.p428w.AbstractServiceC5542g
    /* JADX INFO: renamed from: b */
    public Intent mo12182b(Intent intent) {
        return C5496v.m12078a().f27100e.poll();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:60:0x00df  */
    @Override // p007c.p190n.p385d.p428w.AbstractServiceC5542g
    /* JADX INFO: renamed from: c */
    public void mo12183c(Intent intent) {
        boolean z;
        byte b;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        String action = intent.getAction();
        if (!"com.google.android.c2dm.intent.RECEIVE".equals(action) && !"com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(action)) {
            if ("com.google.firebase.messaging.NOTIFICATION_DISMISS".equals(action)) {
                if (C5554s.m12189c(intent)) {
                    C5554s.m12188b("_nd", intent);
                    return;
                }
                return;
            } else if ("com.google.firebase.messaging.NEW_TOKEN".equals(action)) {
                mo12935i(intent.getStringExtra("token"));
                return;
            } else {
                String strValueOf = String.valueOf(intent.getAction());
                Log.d("FirebaseMessaging", strValueOf.length() != 0 ? "Unknown intent action: ".concat(strValueOf) : new String("Unknown intent action: "));
                return;
            }
        }
        String stringExtra = intent.getStringExtra("google.message_id");
        boolean z2 = false;
        if (TextUtils.isEmpty(stringExtra)) {
            z = false;
        } else {
            Queue<String> queue = f29296k;
            if (queue.contains(stringExtra)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    String strValueOf2 = String.valueOf(stringExtra);
                    Log.d("FirebaseMessaging", strValueOf2.length() != 0 ? "Received duplicate message: ".concat(strValueOf2) : new String("Received duplicate message: "));
                }
                z = true;
            } else {
                if (queue.size() >= 10) {
                    queue.remove();
                }
                queue.add(stringExtra);
                z = false;
            }
        }
        if (z) {
            return;
        }
        String stringExtra2 = intent.getStringExtra("message_type");
        if (stringExtra2 == null) {
            stringExtra2 = "gcm";
        }
        switch (stringExtra2) {
            case "deleted_messages":
                b = 1;
                break;
            case "gcm":
                b = 0;
                break;
            case "send_error":
                b = 3;
                break;
            case "send_event":
                b = 2;
                break;
            default:
                b = -1;
                break;
        }
        if (b != 0) {
            if (b != 1) {
                if (b == 2) {
                    intent.getStringExtra("google.message_id");
                    m12934h();
                    return;
                } else {
                    if (b != 3) {
                        Log.w("FirebaseMessaging", stringExtra2.length() != 0 ? "Received message with unknown type: ".concat(stringExtra2) : new String("Received message with unknown type: "));
                        return;
                    }
                    if (intent.getStringExtra("google.message_id") == null) {
                        intent.getStringExtra("message_id");
                    }
                    new C5558w(intent.getStringExtra("error"));
                    m12936j();
                    return;
                }
            }
            return;
        }
        if (C5554s.m12189c(intent)) {
            C5554s.m12188b("_nr", intent);
        }
        if (!"com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction())) {
            try {
                FirebaseApp2.m11665b();
                FirebaseApp2 firebaseApp2M11665b = FirebaseApp2.m11665b();
                firebaseApp2M11665b.m11668a();
                Context context = firebaseApp2M11665b.f26303d;
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
                if (sharedPreferences.contains("export_to_big_query")) {
                    z2 = sharedPreferences.getBoolean("export_to_big_query", false);
                } else {
                    try {
                        PackageManager packageManager = context.getPackageManager();
                        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                            z2 = applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
            } catch (IllegalStateException unused2) {
                Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            }
        }
        if (z2) {
            TransportFactory transportFactory = FirebaseMessaging.f29284a;
            if (transportFactory != null) {
                try {
                    transportFactory.mo2750a("FCM_CLIENT_EVENT_LOGGING", String.class, new Encoding("json"), C5553r.f27287a).mo2748a(new AutoValue_Event(null, ((JsonDataEncoderBuilder4) C5554s.f27288a).m12054a(new C5550o.b(new C5550o(intent))), Priority2.VERY_LOW));
                } catch (EncodingException unused3) {
                    Log.d("FirebaseMessaging", "Failed to encode big query analytics payload. Skip sending");
                }
            } else {
                Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
            }
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.remove("androidx.content.wakelockid");
        if (C5555t.m12190l(extras)) {
            C5555t c5555t = new C5555t(extras);
            ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactoryC2790a("Firebase-Messaging-Network-Io"));
            try {
                if (new C5536c(this, c5555t, executorServiceNewSingleThreadExecutor).m12167a()) {
                    executorServiceNewSingleThreadExecutor.shutdown();
                    return;
                } else {
                    executorServiceNewSingleThreadExecutor.shutdown();
                    if (C5554s.m12189c(intent)) {
                        C5554s.m12188b("_nf", intent);
                    }
                }
            } catch (Throwable th) {
                executorServiceNewSingleThreadExecutor.shutdown();
                throw th;
            }
        }
        mo12933g(new C5556u(extras));
    }

    @Override // p007c.p190n.p385d.p428w.AbstractServiceC5542g
    /* JADX INFO: renamed from: d */
    public boolean mo12184d(Intent intent) {
        if (!"com.google.firebase.messaging.NOTIFICATION_OPEN".equals(intent.getAction())) {
            return false;
        }
        if (!C5554s.m12189c(intent)) {
            return true;
        }
        if ("1".equals(intent.getStringExtra("google.c.a.tc"))) {
            FirebaseApp2 firebaseApp2M11665b = FirebaseApp2.m11665b();
            firebaseApp2M11665b.m11668a();
            InterfaceC5229a interfaceC5229a = (InterfaceC5229a) firebaseApp2M11665b.f26306g.mo11684a(InterfaceC5229a.class);
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
            }
            if (interfaceC5229a != null) {
                String stringExtra = intent.getStringExtra("google.c.a.c_id");
                interfaceC5229a.mo11677b("fcm", "_ln", stringExtra);
                Bundle bundle = new Bundle();
                bundle.putString("source", "Firebase");
                bundle.putString("medium", "notification");
                bundle.putString("campaign", stringExtra);
                interfaceC5229a.mo11676a("fcm", "_cmp", bundle);
            } else {
                Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
            }
        } else if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
        }
        C5554s.m12188b("_no", intent);
        return true;
    }

    /* JADX INFO: renamed from: g */
    public void mo12933g(C5556u c5556u) {
    }

    /* JADX INFO: renamed from: h */
    public void m12934h() {
    }

    /* JADX INFO: renamed from: i */
    public void mo12935i(String str) {
    }

    /* JADX INFO: renamed from: j */
    public void m12936j() {
    }
}
