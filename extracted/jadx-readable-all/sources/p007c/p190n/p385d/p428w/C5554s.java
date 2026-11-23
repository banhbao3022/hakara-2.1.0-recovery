package p007c.p190n.p385d.p428w;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p385d.FirebaseApp2;
import p007c.p190n.p385d.p386j.p387a.InterfaceC5229a;
import p007c.p190n.p385d.p413o.DataEncoder;
import p007c.p190n.p385d.p413o.p415j.JsonDataEncoderBuilder4;
import p007c.p190n.p385d.p413o.p415j.JsonDataEncoderBuilder5;

/* JADX INFO: renamed from: c.n.d.w.s */
/* JADX INFO: compiled from: com.google.firebase:firebase-messaging@@21.0.1 */
/* JADX INFO: loaded from: classes.dex */
public class C5554s {

    /* JADX INFO: renamed from: a */
    public static final DataEncoder f27288a;

    static {
        JsonDataEncoderBuilder5 jsonDataEncoderBuilder5 = new JsonDataEncoderBuilder5();
        jsonDataEncoderBuilder5.f27022b.put(C5550o.b.class, new C5550o.c());
        jsonDataEncoderBuilder5.f27023c.remove(C5550o.b.class);
        jsonDataEncoderBuilder5.f27022b.put(C5550o.class, new C5550o.a());
        jsonDataEncoderBuilder5.f27023c.remove(C5550o.class);
        f27288a = new JsonDataEncoderBuilder4(jsonDataEncoderBuilder5);
    }

    /* JADX INFO: renamed from: a */
    public static String m12187a(Intent intent) {
        String stringExtra = intent.getStringExtra("from");
        if (stringExtra == null || !stringExtra.startsWith("/topics/")) {
            return null;
        }
        return stringExtra;
    }

    /* JADX INFO: renamed from: b */
    public static void m12188b(String str, Intent intent) {
        Bundle bundle = new Bundle();
        String stringExtra = intent.getStringExtra("google.c.a.c_id");
        if (stringExtra != null) {
            bundle.putString("_nmid", stringExtra);
        }
        String stringExtra2 = intent.getStringExtra("google.c.a.c_l");
        if (stringExtra2 != null) {
            bundle.putString("_nmn", stringExtra2);
        }
        String stringExtra3 = intent.getStringExtra("google.c.a.m_l");
        if (!TextUtils.isEmpty(stringExtra3)) {
            bundle.putString("label", stringExtra3);
        }
        String stringExtra4 = intent.getStringExtra("google.c.a.m_c");
        if (!TextUtils.isEmpty(stringExtra4)) {
            bundle.putString("message_channel", stringExtra4);
        }
        String strM12187a = m12187a(intent);
        if (strM12187a != null) {
            bundle.putString("_nt", strM12187a);
        }
        String stringExtra5 = intent.getStringExtra("google.c.a.ts");
        if (stringExtra5 != null) {
            try {
                bundle.putInt("_nmt", Integer.parseInt(stringExtra5));
            } catch (NumberFormatException e) {
                Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e);
            }
        }
        String stringExtra6 = intent.hasExtra("google.c.a.udt") ? intent.getStringExtra("google.c.a.udt") : null;
        if (stringExtra6 != null) {
            try {
                bundle.putInt("_ndt", Integer.parseInt(stringExtra6));
            } catch (NumberFormatException e2) {
                Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e2);
            }
        }
        String str2 = (intent.getExtras() == null || !C5555t.m12190l(intent.getExtras())) ? "data" : "display";
        if ("_nr".equals(str) || "_nf".equals(str)) {
            bundle.putString("_nmc", str2);
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            String strValueOf = String.valueOf(bundle);
            Log.d("FirebaseMessaging", outline.m1553D(new StringBuilder(str.length() + 37 + strValueOf.length()), "Logging to scion event=", str, " scionPayload=", strValueOf));
        }
        FirebaseApp2 firebaseApp2M11665b = FirebaseApp2.m11665b();
        firebaseApp2M11665b.m11668a();
        InterfaceC5229a interfaceC5229a = (InterfaceC5229a) firebaseApp2M11665b.f26306g.mo11684a(InterfaceC5229a.class);
        if (interfaceC5229a != null) {
            interfaceC5229a.mo11676a("fcm", str, bundle);
        } else {
            Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m12189c(Intent intent) {
        if (intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction())) {
            return false;
        }
        return "1".equals(intent.getStringExtra("google.c.a.e"));
    }
}
