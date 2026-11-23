package p007c.p190n.p385d.p391l.p392e.p402q.p404d;

import p007c.p190n.p385d.p391l.p392e.p402q.p403c.CreateReportRequest;
import p636z0.p667e.p676b.C7804v0;

/* JADX INFO: renamed from: c.n.d.l.e.q.d.a, reason: use source file name */
/* JADX INFO: compiled from: CompositeCreateReportSpiCall.java */
/* JADX INFO: loaded from: classes.dex */
public class CompositeCreateReportSpiCall implements CreateReportSpiCall {

    /* JADX INFO: renamed from: a */
    public final DefaultCreateReportSpiCall f26942a;

    /* JADX INFO: renamed from: b */
    public final NativeCreateReportSpiCall f26943b;

    public CompositeCreateReportSpiCall(DefaultCreateReportSpiCall defaultCreateReportSpiCall, NativeCreateReportSpiCall nativeCreateReportSpiCall) {
        this.f26942a = defaultCreateReportSpiCall;
        this.f26943b = nativeCreateReportSpiCall;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p402q.p404d.CreateReportSpiCall
    /* JADX INFO: renamed from: a */
    public boolean mo12025a(CreateReportRequest createReportRequest, boolean z) {
        int iM15315d = C7804v0.m15315d(createReportRequest.f26937c.mo12022d());
        if (iM15315d == 0) {
            this.f26942a.mo12025a(createReportRequest, z);
            return true;
        }
        if (iM15315d != 1) {
            return false;
        }
        this.f26943b.mo12025a(createReportRequest, z);
        return true;
    }
}
