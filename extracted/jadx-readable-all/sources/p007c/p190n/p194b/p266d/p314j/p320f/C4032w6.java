package p007c.p190n.p194b.p266d.p314j.p320f;

import android.util.Log;
import java.math.BigInteger;
import p007c.p190n.p194b.p266d.p290d.p295s.C2518b;

/* JADX INFO: renamed from: c.n.b.d.j.f.w6 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4032w6 {

    /* JADX INFO: renamed from: a */
    public static final C2518b f22981a = new C2518b("ApplicationAnalyticsUtils");

    /* JADX INFO: renamed from: a */
    public static C4055z2 m9292a(C3843d4 c3843d4) {
        return (C4055z2) ((AbstractC4057z4) m9294c(c3843d4).m9326p());
    }

    /* JADX INFO: renamed from: b */
    public static void m9293b(C4055z2.a aVar, boolean z) {
        C4019v2.a aVarM9271n = C4019v2.m9271n(aVar.m9316r());
        if (aVarM9271n.f23003h) {
            aVarM9271n.m9324n();
            aVarM9271n.f23003h = false;
        }
        C4019v2.m9276s((C4019v2) aVarM9271n.f23002g, z);
        aVar.m9315q(aVarM9271n);
    }

    /* JADX INFO: renamed from: c */
    public static C4055z2.a m9294c(C3843d4 c3843d4) {
        long jLongValue;
        C4055z2.a aVarM9312v = C4055z2.m9312v();
        long j2 = c3843d4.f22561e;
        if (aVarM9312v.f23003h) {
            aVarM9312v.m9324n();
            aVarM9312v.f23003h = false;
        }
        C4055z2.m9307p((C4055z2) aVarM9312v.f23002g, j2);
        int i = c3843d4.f22562f;
        c3843d4.f22562f = i + 1;
        if (aVarM9312v.f23003h) {
            aVarM9312v.m9324n();
            aVarM9312v.f23003h = false;
        }
        C4055z2.m9306o((C4055z2) aVarM9312v.f23002g, i);
        String str = c3843d4.f22560d;
        if (str != null) {
            if (aVarM9312v.f23003h) {
                aVarM9312v.m9324n();
                aVarM9312v.f23003h = false;
            }
            C4055z2.m9311t((C4055z2) aVarM9312v.f23002g, str);
        }
        C4019v2.a aVarM9277t = C4019v2.m9277t();
        if (c3843d4.f22559c != null) {
            C3832c3.a aVarM9006o = C3832c3.m9006o();
            String str2 = c3843d4.f22559c;
            if (aVarM9006o.f23003h) {
                aVarM9006o.m9324n();
                aVarM9006o.f23003h = false;
            }
            C3832c3.m9005n((C3832c3) aVarM9006o.f23002g, str2);
            C3832c3 c3832c3 = (C3832c3) ((AbstractC4057z4) aVarM9006o.m9326p());
            if (aVarM9277t.f23003h) {
                aVarM9277t.m9324n();
                aVarM9277t.f23003h = false;
            }
            C4019v2.m9275r((C4019v2) aVarM9277t.f23002g, c3832c3);
        }
        if (aVarM9277t.f23003h) {
            aVarM9277t.m9324n();
            aVarM9277t.f23003h = false;
        }
        C4019v2.m9276s((C4019v2) aVarM9277t.f23002g, false);
        String str3 = c3843d4.f22563g;
        if (str3 != null) {
            try {
                String strReplace = str3.replace("-", "");
                jLongValue = new BigInteger(strReplace.substring(0, Math.min(16, strReplace.length())), 16).longValue();
            } catch (NumberFormatException e) {
                C2518b c2518b = f22981a;
                Log.w(c2518b.f11373a, c2518b.m5123e("receiverSessionId %s is not valid for hash: %s", str3, e.getMessage()));
                jLongValue = 0;
            }
            if (aVarM9277t.f23003h) {
                aVarM9277t.m9324n();
                aVarM9277t.f23003h = false;
            }
            C4019v2.m9272o((C4019v2) aVarM9277t.f23002g, jLongValue);
        }
        aVarM9312v.m9315q(aVarM9277t);
        return aVarM9312v;
    }
}
