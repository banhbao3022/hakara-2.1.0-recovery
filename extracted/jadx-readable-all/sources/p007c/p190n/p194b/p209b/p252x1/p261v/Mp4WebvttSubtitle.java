package p007c.p190n.p194b.p209b.p252x1.p261v;

import java.util.Collections;
import java.util.List;
import p007c.p190n.p194b.p209b.p252x1.Cue;
import p007c.p190n.p194b.p209b.p252x1.Subtitle;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.x1.v.e, reason: use source file name */
/* JADX INFO: compiled from: Mp4WebvttSubtitle.java */
/* JADX INFO: loaded from: classes.dex */
public final class Mp4WebvttSubtitle implements Subtitle {

    /* JADX INFO: renamed from: f */
    public final List<Cue> f10128f;

    public Mp4WebvttSubtitle(List<Cue> list) {
        this.f10128f = Collections.unmodifiableList(list);
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
        return j2 >= 0 ? this.f10128f : Collections.emptyList();
    }

    @Override // p007c.p190n.p194b.p209b.p252x1.Subtitle
    /* JADX INFO: renamed from: l */
    public int mo4398l() {
        return 1;
    }
}
