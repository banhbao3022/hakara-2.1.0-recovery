package p007c.p190n.p385d.p391l;

import android.os.Bundle;
import p007c.p190n.p385d.p386j.p387a.InterfaceC5229a;
import p007c.p190n.p385d.p391l.p392e.Logger4;
import p007c.p190n.p385d.p391l.p392e.p393i.AnalyticsEventReceiver;

/* JADX INFO: renamed from: c.n.d.l.a, reason: use source file name */
/* JADX INFO: compiled from: CrashlyticsAnalyticsListener.java */
/* JADX INFO: loaded from: classes.dex */
public class CrashlyticsAnalyticsListener implements InterfaceC5229a.b {

    /* JADX INFO: renamed from: a */
    public AnalyticsEventReceiver f26413a;

    /* JADX INFO: renamed from: b */
    public AnalyticsEventReceiver f26414b;

    /* JADX INFO: renamed from: a */
    public void m11703a(int i, Bundle bundle) {
        Logger4.f26421a.m11713b("Received Analytics message: " + i + " " + bundle);
        String string = bundle.getString("name");
        if (string != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            AnalyticsEventReceiver analyticsEventReceiver = "clx".equals(bundle2.getString("_o")) ? this.f26413a : this.f26414b;
            if (analyticsEventReceiver == null) {
                return;
            }
            analyticsEventReceiver.mo11722b(string, bundle2);
        }
    }
}
