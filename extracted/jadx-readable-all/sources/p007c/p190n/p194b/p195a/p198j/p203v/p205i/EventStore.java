package p007c.p190n.p194b.p195a.p198j.p203v.p205i;

import java.io.Closeable;
import p007c.p190n.p194b.p195a.p198j.EventInternal;
import p007c.p190n.p194b.p195a.p198j.TransportContext;

/* JADX INFO: renamed from: c.n.b.a.j.v.i.c, reason: use source file name */
/* JADX INFO: compiled from: EventStore.java */
/* JADX INFO: loaded from: classes.dex */
public interface EventStore extends Closeable {
    /* JADX INFO: renamed from: C */
    Iterable<TransportContext> mo2859C();

    /* JADX INFO: renamed from: j */
    int mo2860j();

    /* JADX INFO: renamed from: k */
    void mo2861k(Iterable<PersistedEvent> iterable);

    /* JADX INFO: renamed from: k0 */
    PersistedEvent mo2862k0(TransportContext transportContext, EventInternal eventInternal);

    /* JADX INFO: renamed from: o0 */
    long mo2863o0(TransportContext transportContext);

    /* JADX INFO: renamed from: s0 */
    boolean mo2864s0(TransportContext transportContext);

    /* JADX INFO: renamed from: t */
    Iterable<PersistedEvent> mo2865t(TransportContext transportContext);

    /* JADX INFO: renamed from: v0 */
    void mo2866v0(Iterable<PersistedEvent> iterable);

    /* JADX INFO: renamed from: x */
    void mo2867x(TransportContext transportContext, long j2);
}
