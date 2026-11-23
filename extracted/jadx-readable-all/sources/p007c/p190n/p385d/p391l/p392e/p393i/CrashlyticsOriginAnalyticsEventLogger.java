package p007c.p190n.p385d.p391l.p392e.p393i;

import android.os.Bundle;
import p007c.p190n.p385d.p386j.p387a.InterfaceC5229a;

/* JADX INFO: renamed from: c.n.d.l.e.i.e, reason: use source file name */
/* JADX INFO: compiled from: CrashlyticsOriginAnalyticsEventLogger.java */
/* JADX INFO: loaded from: classes.dex */
public class CrashlyticsOriginAnalyticsEventLogger implements AnalyticsEventLogger {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5229a f26449a;

    public CrashlyticsOriginAnalyticsEventLogger(InterfaceC5229a interfaceC5229a) {
        this.f26449a = interfaceC5229a;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p393i.AnalyticsEventLogger
    /* JADX INFO: renamed from: a */
    public void mo11721a(String str, Bundle bundle) {
        this.f26449a.mo11676a("clx", str, bundle);
    }
}
