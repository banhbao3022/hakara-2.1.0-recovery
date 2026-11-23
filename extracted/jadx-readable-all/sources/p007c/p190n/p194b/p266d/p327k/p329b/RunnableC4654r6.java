package p007c.p190n.p194b.p266d.p327k.p329b;

import android.os.Bundle;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p314j.p325k.C4186h8;

/* JADX INFO: renamed from: c.n.b.d.k.b.r6 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4654r6 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Bundle f24404f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C4500e6 f24405g;

    public RunnableC4654r6(C4500e6 c4500e6, Bundle bundle) {
        this.f24405g = c4500e6;
        this.f24404f = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4500e6 c4500e6 = this.f24405g;
        Bundle bundle = this.f24404f;
        c4500e6.mo10381b();
        c4500e6.m10479t();
        Objects.requireNonNull(bundle, "null reference");
        C2622l.m5359e(bundle.getString("name"));
        if (!c4500e6.f24476a.m10828d()) {
            c4500e6.mo10684l().f24426n.m10811a("Conditional property not cleared since app measurement is disabled");
        } else {
            try {
                c4500e6.m10385p().m10777y(new C4624oa(bundle.getString("app_id"), bundle.getString("origin"), new C4712w9(bundle.getString("name"), 0L, null, null), bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), c4500e6.m10817f().m10870B(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), bundle.getString("origin"), bundle.getLong("creation_timestamp"), true, C4186h8.m9830a() && c4500e6.f24476a.f24534h.m10417k(C4647r.f24319L0))));
            } catch (IllegalArgumentException unused) {
            }
        }
    }
}
