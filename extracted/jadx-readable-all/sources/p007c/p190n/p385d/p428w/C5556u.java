package p007c.p190n.p385d.p428w;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.Map;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;
import p636z0.p691g.ArrayMap;

/* JADX INFO: renamed from: c.n.d.w.u */
/* JADX INFO: compiled from: com.google.firebase:firebase-messaging@@21.0.1 */
/* JADX INFO: loaded from: classes.dex */
public final class C5556u extends AbstractC2767a {
    public static final Parcelable.Creator<C5556u> CREATOR = new C5557v();

    /* JADX INFO: renamed from: f */
    public Bundle f27290f;

    /* JADX INFO: renamed from: g */
    public Map<String, String> f27291g;

    /* JADX INFO: renamed from: h */
    public b f27292h;

    /* JADX INFO: renamed from: c.n.d.w.u$b */
    /* JADX INFO: compiled from: com.google.firebase:firebase-messaging@@21.0.1 */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final String f27293a;

        public b(C5555t c5555t, a aVar) {
            c5555t.m12201j("gcm.n.title");
            c5555t.m12198g("gcm.n.title");
            m12205a(c5555t, "gcm.n.title");
            this.f27293a = c5555t.m12201j("gcm.n.body");
            c5555t.m12198g("gcm.n.body");
            m12205a(c5555t, "gcm.n.body");
            c5555t.m12201j("gcm.n.icon");
            if (TextUtils.isEmpty(c5555t.m12201j("gcm.n.sound2"))) {
                c5555t.m12201j("gcm.n.sound");
            }
            c5555t.m12201j("gcm.n.tag");
            c5555t.m12201j("gcm.n.color");
            c5555t.m12201j("gcm.n.click_action");
            c5555t.m12201j("gcm.n.android_channel_id");
            c5555t.m12196e();
            c5555t.m12201j("gcm.n.image");
            c5555t.m12201j("gcm.n.ticker");
            c5555t.m12193b("gcm.n.notification_priority");
            c5555t.m12193b("gcm.n.visibility");
            c5555t.m12193b("gcm.n.notification_count");
            c5555t.m12192a("gcm.n.sticky");
            c5555t.m12192a("gcm.n.local_only");
            c5555t.m12192a("gcm.n.default_sound");
            c5555t.m12192a("gcm.n.default_vibrate_timings");
            c5555t.m12192a("gcm.n.default_light_settings");
            c5555t.m12199h("gcm.n.event_time");
            c5555t.m12195d();
            c5555t.m12202k();
        }

        /* JADX INFO: renamed from: a */
        public static String[] m12205a(C5555t c5555t, String str) {
            Object[] objArrM12197f = c5555t.m12197f(str);
            if (objArrM12197f == null) {
                return null;
            }
            String[] strArr = new String[objArrM12197f.length];
            for (int i = 0; i < objArrM12197f.length; i++) {
                strArr[i] = String.valueOf(objArrM12197f[i]);
            }
            return strArr;
        }
    }

    public C5556u(Bundle bundle) {
        this.f27290f = bundle;
    }

    /* JADX INFO: renamed from: H */
    public Map<String, String> m12204H() {
        if (this.f27291g == null) {
            Bundle bundle = this.f27290f;
            ArrayMap arrayMap = new ArrayMap();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        arrayMap.put(str, str2);
                    }
                }
            }
            this.f27291g = arrayMap;
        }
        return this.f27291g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        C2622l.m5295P(parcel, 2, this.f27290f, false);
        C2622l.m5447v2(parcel, iM5239D1);
    }
}
