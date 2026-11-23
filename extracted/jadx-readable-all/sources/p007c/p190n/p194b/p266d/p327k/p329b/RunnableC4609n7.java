package p007c.p190n.p194b.p266d.p327k.p329b;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: renamed from: c.n.b.d.k.b.n7 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4609n7 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Bundle f24182f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C4585l7 f24183g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C4585l7 f24184h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ long f24185i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C4573k7 f24186j;

    public RunnableC4609n7(C4573k7 c4573k7, Bundle bundle, C4585l7 c4585l7, C4585l7 c4585l8, long j2) {
        this.f24186j = c4573k7;
        this.f24182f = bundle;
        this.f24183g = c4585l7;
        this.f24184h = c4585l8;
        this.f24185i = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4573k7 c4573k7 = this.f24186j;
        Bundle bundle = this.f24182f;
        C4585l7 c4585l7 = this.f24183g;
        C4585l7 c4585l8 = this.f24184h;
        long j2 = this.f24185i;
        Objects.requireNonNull(c4573k7);
        if (bundle != null) {
            bundle.remove("screen_name");
            bundle.remove("screen_class");
        }
        c4573k7.m10624B(c4585l7, c4585l8, j2, true, c4573k7.m10817f().m10909z(null, "screen_view", bundle, null, true));
    }
}
