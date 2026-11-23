package p007c.p190n.p194b.p209b.p252x1.p254o;

import java.util.List;
import p007c.p190n.p194b.p209b.p252x1.Cue;
import p007c.p190n.p194b.p209b.p252x1.Subtitle;

/* JADX INFO: renamed from: c.n.b.b.x1.o.c, reason: use source file name */
/* JADX INFO: compiled from: DvbSubtitle.java */
/* JADX INFO: loaded from: classes.dex */
public final class DvbSubtitle implements Subtitle {

    /* JADX INFO: renamed from: f */
    public final List<Cue> f9987f;

    public DvbSubtitle(List<Cue> list) {
        this.f9987f = list;
    }

    @Override // p007c.p190n.p194b.p209b.p252x1.Subtitle
    /* JADX INFO: renamed from: f */
    public int mo4395f(long j2) {
        return -1;
    }

    @Override // p007c.p190n.p194b.p209b.p252x1.Subtitle
    /* JADX INFO: renamed from: h */
    public long mo4396h(int i) {
        return 0L;
    }

    @Override // p007c.p190n.p194b.p209b.p252x1.Subtitle
    /* JADX INFO: renamed from: j */
    public List<Cue> mo4397j(long j2) {
        return this.f9987f;
    }

    @Override // p007c.p190n.p194b.p209b.p252x1.Subtitle
    /* JADX INFO: renamed from: l */
    public int mo4398l() {
        return 1;
    }
}
