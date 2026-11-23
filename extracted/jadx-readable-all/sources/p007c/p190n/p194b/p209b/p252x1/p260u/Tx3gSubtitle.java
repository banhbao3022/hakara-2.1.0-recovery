package p007c.p190n.p194b.p209b.p252x1.p260u;

import java.util.Collections;
import java.util.List;
import p007c.p190n.p194b.p209b.p252x1.Cue;
import p007c.p190n.p194b.p209b.p252x1.Subtitle;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.x1.u.b, reason: use source file name */
/* JADX INFO: compiled from: Tx3gSubtitle.java */
/* JADX INFO: loaded from: classes.dex */
public final class Tx3gSubtitle implements Subtitle {

    /* JADX INFO: renamed from: f */
    public static final Tx3gSubtitle f10120f = new Tx3gSubtitle();

    /* JADX INFO: renamed from: g */
    public final List<Cue> f10121g;

    public Tx3gSubtitle(Cue cue) {
        this.f10121g = Collections.singletonList(cue);
    }

    @Override // p007c.p190n.p194b.p209b.p252x1.Subtitle
    /* JADX INFO: renamed from: f */
    public int mo4395f(long j2) {
        return j2 < 0 ? 0 : -1;
    }

    @Override // p007c.p190n.p194b.p209b.p252x1.Subtitle
    /* JADX INFO: renamed from: h */
    public long mo4396h(int i) {
        C2096e.m4566b(i == 0);
        return 0L;
    }

    @Override // p007c.p190n.p194b.p209b.p252x1.Subtitle
    /* JADX INFO: renamed from: j */
    public List<Cue> mo4397j(long j2) {
        return j2 >= 0 ? this.f10121g : Collections.emptyList();
    }

    @Override // p007c.p190n.p194b.p209b.p252x1.Subtitle
    /* JADX INFO: renamed from: l */
    public int mo4398l() {
        return 1;
    }

    public Tx3gSubtitle() {
        this.f10121g = Collections.emptyList();
    }
}
