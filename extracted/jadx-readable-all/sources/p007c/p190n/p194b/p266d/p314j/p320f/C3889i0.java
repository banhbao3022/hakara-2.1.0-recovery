package p007c.p190n.p194b.p266d.p314j.p320f;

import android.content.SharedPreferences;
import java.util.UUID;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p195a.AutoValue_Event;
import p007c.p190n.p194b.p195a.Priority2;
import p007c.p190n.p194b.p195a.Transport;

/* JADX INFO: renamed from: c.n.b.d.j.f.i0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3889i0 {

    /* JADX INFO: renamed from: a */
    public final Transport<C4055z2> f22701a;

    /* JADX INFO: renamed from: b */
    public final String f22702b;

    /* JADX INFO: renamed from: c */
    public final int f22703c;

    public C3889i0(SharedPreferences sharedPreferences, Transport<C4055z2> transport, long j2) {
        this.f22701a = transport;
        String string = sharedPreferences.getString("client_sender_id", null);
        if (string == null) {
            string = UUID.randomUUID().toString();
            outline.m1564O(sharedPreferences, "client_sender_id", string);
        }
        this.f22702b = string;
        this.f22703c = j2 == 0 ? 1 : 2;
    }

    /* JADX INFO: renamed from: a */
    public final void m9038a(C4055z2 c4055z2, EnumC3860f1 enumC3860f1) {
        C4055z2.a aVarM9305n = C4055z2.m9305n(c4055z2);
        String str = this.f22702b;
        if (aVarM9305n.f23003h) {
            aVarM9305n.m9324n();
            aVarM9305n.f23003h = false;
        }
        C4055z2.m9310s((C4055z2) aVarM9305n.f23002g, str);
        C4055z2 c4055z3 = (C4055z2) ((AbstractC4057z4) aVarM9305n.m9326p());
        AutoValue_Event autoValue_Event = null;
        int i = C4034x.f22983a[this.f22703c - 1];
        if (i == 1) {
            autoValue_Event = new AutoValue_Event(Integer.valueOf(enumC3860f1.f22669W0), c4055z3, Priority2.VERY_LOW);
        } else if (i == 2) {
            autoValue_Event = new AutoValue_Event(Integer.valueOf(enumC3860f1.f22669W0), c4055z3, Priority2.DEFAULT);
        }
        this.f22701a.mo2748a(autoValue_Event);
    }
}
