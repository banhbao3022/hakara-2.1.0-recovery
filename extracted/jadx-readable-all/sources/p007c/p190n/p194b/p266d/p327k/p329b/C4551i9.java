package p007c.p190n.p194b.p266d.p327k.p329b;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p314j.p325k.C4243l9;

/* JADX INFO: renamed from: c.n.b.d.k.b.i9 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4551i9 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C4744z8 f24009a;

    public C4551i9(C4744z8 c4744z8) {
        this.f24009a = c4744z8;
    }

    /* JADX INFO: renamed from: a */
    public final void m10600a() {
        this.f24009a.mo10381b();
        if (this.f24009a.m10818g().m10536u(this.f24009a.f24476a.f24541o.mo5623c())) {
            this.f24009a.m10818g().f23904s.m10593a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.f24009a.mo10684l().f24426n.m10811a("Detected application was in foreground");
                m10602c(this.f24009a.f24476a.f24541o.mo5623c(), false);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m10601b(long j2, boolean z) {
        this.f24009a.mo10381b();
        this.f24009a.m10915x();
        if (this.f24009a.m10818g().m10536u(j2)) {
            this.f24009a.m10818g().f23904s.m10593a(true);
        }
        this.f24009a.m10818g().f23907v.m10611b(j2);
        if (this.f24009a.m10818g().f23904s.m10594b()) {
            m10602c(j2, z);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m10602c(long j2, boolean z) {
        this.f24009a.mo10381b();
        if (this.f24009a.f24476a.m10828d()) {
            this.f24009a.m10818g().f23907v.m10611b(j2);
            this.f24009a.mo10684l().f24426n.m10812b("Session started, time", Long.valueOf(this.f24009a.f24476a.f24541o.mo5621a()));
            Long lValueOf = Long.valueOf(j2 / 1000);
            this.f24009a.m10383i().m10520K("auto", "_sid", lValueOf, j2);
            this.f24009a.m10818g().f23904s.m10593a(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", lValueOf.longValue());
            if (this.f24009a.f24476a.f24534h.m10417k(C4647r.f24358k0) && z) {
                bundle.putLong("_aib", 1L);
            }
            this.f24009a.m10383i().m10514E("auto", "_s", j2, bundle);
            if (C4243l9.m10004a() && this.f24009a.f24476a.f24534h.m10417k(C4647r.f24368p0)) {
                String strM10639a = this.f24009a.m10818g().f23885A.m10639a();
                if (TextUtils.isEmpty(strM10639a)) {
                    return;
                }
                this.f24009a.m10383i().m10514E("auto", "_ssr", j2, outline.m1575Z("_ffr", strM10639a));
            }
        }
    }
}
