package p007c.p190n.p194b.p266d.p314j.p320f;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.CastDevice;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p290d.p291r.C2422a;
import p007c.p190n.p194b.p266d.p290d.p291r.C2424b;
import p007c.p190n.p194b.p266d.p290d.p291r.C2426c;
import p007c.p190n.p194b.p266d.p290d.p295s.C2518b;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.f.u0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4008u0 {

    /* JADX INFO: renamed from: a */
    public static final C2518b f22883a = new C2518b("ApplicationAnalytics");

    /* JADX INFO: renamed from: b */
    public final C3889i0 f22884b;

    /* JADX INFO: renamed from: e */
    public final SharedPreferences f22887e;

    /* JADX INFO: renamed from: f */
    public C3843d4 f22888f;

    /* JADX INFO: renamed from: d */
    public final Handler f22886d = new HandlerC4025w(Looper.getMainLooper());

    /* JADX INFO: renamed from: c */
    public final Runnable f22885c = new Runnable(this) { // from class: c.n.b.d.j.f.x1

        /* JADX INFO: renamed from: f */
        public final C4008u0 f22985f;

        {
            this.f22985f = this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C4008u0 c4008u0 = this.f22985f;
            C3843d4 c3843d4 = c4008u0.f22888f;
            if (c3843d4 != null) {
                c4008u0.f22884b.m9038a(C4032w6.m9292a(c3843d4), EnumC3860f1.APP_SESSION_PING);
            }
            c4008u0.f22886d.postDelayed(c4008u0.f22885c, 300000L);
        }
    };

    public C4008u0(SharedPreferences sharedPreferences, C3889i0 c3889i0) {
        this.f22887e = sharedPreferences;
        this.f22884b = c3889i0;
    }

    /* JADX INFO: renamed from: a */
    public static String m9224a() {
        C2518b c2518b = C2422a.f11141a;
        C2622l.m5354d("Must be called from the main thread.");
        C2422a c2422a = C2422a.f11142b;
        Objects.requireNonNull(c2422a);
        C2622l.m5354d("Must be called from the main thread.");
        C2424b c2424b = c2422a.f11147g;
        if (c2424b == null) {
            return null;
        }
        return c2424b.f11152f;
    }

    /* JADX INFO: renamed from: b */
    public static void m9225b(C4008u0 c4008u0, C2426c c2426c, int i) {
        EnumC3919l0 enumC3919l0;
        c4008u0.m9229f(c2426c);
        C4055z2.a aVarM9294c = C4032w6.m9294c(c4008u0.f22888f);
        C4019v2.a aVarM9271n = C4019v2.m9271n(aVarM9294c.m9316r());
        aVarM9271n.m9280q(i == 0 ? EnumC3929m0.APP_SESSION_CASTING_STOPPED : EnumC3929m0.APP_SESSION_REASON_ERROR);
        if (i == 0) {
            enumC3919l0 = EnumC3919l0.APP_SESSION_ERROR_UNKNOWN;
        } else if (i == 7) {
            enumC3919l0 = EnumC3919l0.APP_SESSION_ERROR_CONN_IO;
        } else if (i == 15) {
            enumC3919l0 = EnumC3919l0.APP_SESSION_ERROR_CONN_TIMEOUT;
        } else if (i == 2000) {
            enumC3919l0 = EnumC3919l0.APP_SESSION_ERROR_CONN_DEVICE_AUTH;
        } else if (i == 2002) {
            enumC3919l0 = EnumC3919l0.APP_SESSION_ERROR_CONN_CANCELLED;
        } else if (i != 2004) {
            enumC3919l0 = i != 2005 ? EnumC3919l0.APP_SESSION_ERROR_CONN_OTHER : EnumC3919l0.APP_SESSION_ERROR_RECEIVER_SESSION_NOT_RUNNING;
        } else {
            enumC3919l0 = EnumC3919l0.APP_SESSION_ERROR_RECEIVER_APPLICATION_NOT_FOUND;
        }
        if (aVarM9271n.f23003h) {
            aVarM9271n.m9324n();
            aVarM9271n.f23003h = false;
        }
        C4019v2.m9273p((C4019v2) aVarM9271n.f23002g, enumC3919l0);
        aVarM9294c.m9315q(aVarM9271n);
        c4008u0.f22884b.m9038a((C4055z2) ((AbstractC4057z4) aVarM9294c.m9326p()), EnumC3860f1.APP_SESSION_END);
        c4008u0.f22886d.removeCallbacks(c4008u0.f22885c);
        c4008u0.f22888f = null;
    }

    /* JADX INFO: renamed from: d */
    public static void m9226d(C4008u0 c4008u0) {
        C3843d4 c3843d4 = c4008u0.f22888f;
        SharedPreferences sharedPreferences = c4008u0.f22887e;
        Objects.requireNonNull(c3843d4);
        if (sharedPreferences == null) {
            return;
        }
        C3843d4.f22557a.m5119a("Save the ApplicationAnalyticsSession to SharedPreferences %s", sharedPreferences);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString("application_id", c3843d4.f22559c);
        editorEdit.putString("receiver_metrics_id", c3843d4.f22560d);
        editorEdit.putLong("analytics_session_id", c3843d4.f22561e);
        editorEdit.putInt("event_sequence_number", c3843d4.f22562f);
        editorEdit.putString("receiver_session_id", c3843d4.f22563g);
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m9227c() {
        String str;
        if (this.f22888f == null) {
            f22883a.m5119a("The analytics session is null when matching with application ID.", new Object[0]);
            return false;
        }
        String strM9224a = m9224a();
        if (strM9224a != null && (str = this.f22888f.f22559c) != null && TextUtils.equals(str, strM9224a)) {
            return true;
        }
        f22883a.m5119a("The analytics session doesn't match the application ID %s", strM9224a);
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final void m9228e(C2426c c2426c) {
        f22883a.m5119a("Create a new ApplicationAnalyticsSession based on CastSession", new Object[0]);
        C3843d4 c3843d4 = new C3843d4();
        C3843d4.f22558b++;
        this.f22888f = c3843d4;
        c3843d4.f22559c = m9224a();
        if (c2426c == null || c2426c.m5010i() == null) {
            return;
        }
        this.f22888f.f22560d = c2426c.m5010i().f28556q;
    }

    /* JADX INFO: renamed from: f */
    public final void m9229f(C2426c c2426c) {
        if (!m9227c()) {
            C2518b c2518b = f22883a;
            Log.w(c2518b.f11373a, c2518b.m5123e("The analyticsSession should not be null for logging. Create a dummy one.", new Object[0]));
            m9228e(c2426c);
        } else {
            CastDevice castDeviceM5010i = c2426c != null ? c2426c.m5010i() : null;
            if (castDeviceM5010i == null || TextUtils.equals(this.f22888f.f22560d, castDeviceM5010i.f28556q)) {
                return;
            }
            this.f22888f.f22560d = castDeviceM5010i.f28556q;
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m9230g(String str) {
        String str2;
        if (!m9227c()) {
            return false;
        }
        if (str != null && (str2 = this.f22888f.f22563g) != null && TextUtils.equals(str2, str)) {
            return true;
        }
        f22883a.m5119a("The analytics session doesn't match the receiver session ID %s.", str);
        return false;
    }
}
