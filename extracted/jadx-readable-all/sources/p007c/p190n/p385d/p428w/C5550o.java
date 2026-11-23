package p007c.p190n.p385d.p428w;

import android.content.Intent;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;
import java.io.IOException;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p385d.FirebaseApp2;
import p007c.p190n.p385d.p413o.ObjectEncoder;
import p007c.p190n.p385d.p413o.ObjectEncoderContext;

/* JADX INFO: renamed from: c.n.d.w.o */
/* JADX INFO: compiled from: com.google.firebase:firebase-messaging@@21.0.1 */
/* JADX INFO: loaded from: classes.dex */
public final class C5550o {

    /* JADX INFO: renamed from: a */
    public final String f27280a;

    /* JADX INFO: renamed from: b */
    public final Intent f27281b;

    /* JADX INFO: renamed from: c.n.d.w.o$a */
    /* JADX INFO: compiled from: com.google.firebase:firebase-messaging@@21.0.1 */
    public static class a implements ObjectEncoder<C5550o> {
        /* JADX WARN: Code duplicated, block: B:22:0x009f  */
        /* JADX WARN: Code duplicated, block: B:23:0x00a1  */
        /* JADX WARN: Code duplicated, block: B:25:0x00a9  */
        /* JADX WARN: Code duplicated, block: B:60:0x0162  */
        @Override // p007c.p190n.p385d.p413o.Encoder2
        /* JADX INFO: renamed from: a */
        public void mo2772a(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            int iIntValue;
            C5550o c5550o = (C5550o) obj;
            ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
            Intent intent = c5550o.f27281b;
            Object obj2 = intent.getExtras().get("google.ttl");
            int i = 0;
            if (obj2 instanceof Integer) {
                iIntValue = ((Integer) obj2).intValue();
            } else if (obj2 instanceof String) {
                try {
                    iIntValue = Integer.parseInt((String) obj2);
                } catch (NumberFormatException unused) {
                    String strValueOf = String.valueOf(obj2);
                    StringBuilder sb = new StringBuilder(strValueOf.length() + 13);
                    sb.append("Invalid TTL: ");
                    sb.append(strValueOf);
                    Log.w("FirebaseMessaging", sb.toString());
                    iIntValue = 0;
                }
            } else {
                iIntValue = 0;
            }
            objectEncoderContext2.mo12049d("ttl", iIntValue);
            objectEncoderContext2.mo12050g("event", c5550o.f27280a);
            FirebaseInstanceId firebaseInstanceId = FirebaseInstanceId.getInstance(FirebaseApp2.m11665b());
            FirebaseInstanceId.m12915c(firebaseInstanceId.f29278f);
            if (firebaseInstanceId.m12929p(firebaseInstanceId.m12924j())) {
                firebaseInstanceId.m12927n();
            }
            objectEncoderContext2.mo12050g("instanceId", firebaseInstanceId.m12919e());
            String stringExtra = intent.getStringExtra("google.delivered_priority");
            if (stringExtra != null) {
                if ("high".equals(stringExtra)) {
                    i = 1;
                } else if ("normal".equals(stringExtra)) {
                    i = 2;
                }
            } else if ("1".equals(intent.getStringExtra("google.priority_reduced"))) {
                i = 2;
            } else {
                stringExtra = intent.getStringExtra("google.priority");
                if ("high".equals(stringExtra)) {
                    i = 1;
                } else if ("normal".equals(stringExtra)) {
                    i = 2;
                }
            }
            objectEncoderContext2.mo12049d("priority", i);
            FirebaseApp2 firebaseApp2M11665b = FirebaseApp2.m11665b();
            firebaseApp2M11665b.m11668a();
            objectEncoderContext2.mo12050g("packageName", firebaseApp2M11665b.f26303d.getPackageName());
            objectEncoderContext2.mo12050g("sdkPlatform", "ANDROID");
            objectEncoderContext2.mo12050g("messageType", (intent.getExtras() == null || !C5555t.m12190l(intent.getExtras())) ? "DATA_MESSAGE" : "DISPLAY_NOTIFICATION");
            String stringExtra2 = intent.getStringExtra("google.message_id");
            if (stringExtra2 == null) {
                stringExtra2 = intent.getStringExtra("message_id");
            }
            if (stringExtra2 != null) {
                objectEncoderContext2.mo12050g("messageId", stringExtra2);
            }
            String strM12187a = C5554s.m12187a(intent);
            if (strM12187a != null) {
                objectEncoderContext2.mo12050g("topic", strM12187a);
            }
            String stringExtra3 = intent.getStringExtra("collapse_key");
            if (stringExtra3 != null) {
                objectEncoderContext2.mo12050g("collapseKey", stringExtra3);
            }
            if (intent.getStringExtra("google.c.a.m_l") != null) {
                objectEncoderContext2.mo12050g("analyticsLabel", intent.getStringExtra("google.c.a.m_l"));
            }
            if (intent.getStringExtra("google.c.a.c_l") != null) {
                objectEncoderContext2.mo12050g("composerLabel", intent.getStringExtra("google.c.a.c_l"));
            }
            FirebaseApp2 firebaseApp2M11665b2 = FirebaseApp2.m11665b();
            firebaseApp2M11665b2.m11668a();
            String str = firebaseApp2M11665b2.f26305f.f26323e;
            if (str == null) {
                firebaseApp2M11665b2.m11668a();
                str = firebaseApp2M11665b2.f26305f.f26320b;
                if (str.startsWith("1:")) {
                    String[] strArrSplit = str.split(":");
                    if (strArrSplit.length < 2) {
                        str = null;
                    } else {
                        str = strArrSplit[1];
                        if (str.isEmpty()) {
                            str = null;
                        }
                    }
                }
            }
            if (str != null) {
                objectEncoderContext2.mo12050g("projectNumber", str);
            }
        }
    }

    /* JADX INFO: renamed from: c.n.d.w.o$b */
    /* JADX INFO: compiled from: com.google.firebase:firebase-messaging@@21.0.1 */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final C5550o f27282a;

        public b(C5550o c5550o) {
            this.f27282a = c5550o;
        }
    }

    /* JADX INFO: renamed from: c.n.d.w.o$c */
    /* JADX INFO: compiled from: com.google.firebase:firebase-messaging@@21.0.1 */
    public static final class c implements ObjectEncoder<b> {
        @Override // p007c.p190n.p385d.p413o.Encoder2
        /* JADX INFO: renamed from: a */
        public void mo2772a(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.mo12050g("messaging_client_event", ((b) obj).f27282a);
        }
    }

    public C5550o(Intent intent) {
        C2622l.m5364f("MESSAGE_DELIVERED", "evenType must be non-null");
        this.f27280a = "MESSAGE_DELIVERED";
        C2622l.m5379i(intent, "intent must be non-null");
        this.f27281b = intent;
    }
}
