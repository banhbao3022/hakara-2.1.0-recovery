package p007c.p190n.p385d.p386j.p387a.p388c;

import android.os.Bundle;
import p007c.p190n.p194b.p266d.p327k.p328a.C4444a;
import p007c.p190n.p385d.p391l.CrashlyticsAnalyticsListener;

/* JADX INFO: renamed from: c.n.d.j.a.c.f */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5236f implements C4444a.a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C5234d f26344a;

    public C5236f(C5234d c5234d) {
        this.f26344a = c5234d;
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.InterfaceC4464b6
    /* JADX INFO: renamed from: a */
    public final void mo10409a(String str, String str2, Bundle bundle, long j2) {
        if (str == null || str.equals("crash") || !(!C5233c.f26334a.contains(str2))) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str2);
        bundle2.putLong("timestampInMillis", j2);
        bundle2.putBundle("params", bundle);
        ((CrashlyticsAnalyticsListener) this.f26344a.f26340a).m11703a(3, bundle2);
    }
}
