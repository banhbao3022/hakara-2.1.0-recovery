package p007c.p190n.p194b.p209b.p243w1;

import p007c.p190n.p194b.p209b.Timeline;

/* JADX INFO: renamed from: c.n.b.b.w1.v, reason: use source file name */
/* JADX INFO: compiled from: ForwardingTimeline.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class ForwardingTimeline extends Timeline {

    /* JADX INFO: renamed from: b */
    public final Timeline f9166b;

    public ForwardingTimeline(Timeline timeline) {
        this.f9166b = timeline;
    }

    @Override // p007c.p190n.p194b.p209b.Timeline
    /* JADX INFO: renamed from: a */
    public int mo3456a(boolean z) {
        return this.f9166b.mo3456a(z);
    }

    @Override // p007c.p190n.p194b.p209b.Timeline
    /* JADX INFO: renamed from: b */
    public int mo3457b(Object obj) {
        return this.f9166b.mo3457b(obj);
    }

    @Override // p007c.p190n.p194b.p209b.Timeline
    /* JADX INFO: renamed from: c */
    public int mo3458c(boolean z) {
        return this.f9166b.mo3458c(z);
    }

    @Override // p007c.p190n.p194b.p209b.Timeline
    /* JADX INFO: renamed from: e */
    public int mo3460e(int i, int i2, boolean z) {
        return this.f9166b.mo3460e(i, i2, z);
    }

    @Override // p007c.p190n.p194b.p209b.Timeline
    /* JADX INFO: renamed from: g */
    public Timeline.b mo3462g(int i, Timeline.b bVar, boolean z) {
        return this.f9166b.mo3462g(i, bVar, z);
    }

    @Override // p007c.p190n.p194b.p209b.Timeline
    /* JADX INFO: renamed from: i */
    public int mo3355i() {
        return this.f9166b.mo3355i();
    }

    @Override // p007c.p190n.p194b.p209b.Timeline
    /* JADX INFO: renamed from: l */
    public int mo3466l(int i, int i2, boolean z) {
        return this.f9166b.mo3466l(i, i2, z);
    }

    @Override // p007c.p190n.p194b.p209b.Timeline
    /* JADX INFO: renamed from: m */
    public Object mo3467m(int i) {
        return this.f9166b.mo3467m(i);
    }

    @Override // p007c.p190n.p194b.p209b.Timeline
    /* JADX INFO: renamed from: o */
    public Timeline.c mo3469o(int i, Timeline.c cVar, long j2) {
        return this.f9166b.mo3469o(i, cVar, j2);
    }

    @Override // p007c.p190n.p194b.p209b.Timeline
    /* JADX INFO: renamed from: p */
    public int mo3356p() {
        return this.f9166b.mo3356p();
    }
}
