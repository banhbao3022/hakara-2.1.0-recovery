package p007c.p190n.p194b.p209b.p252x1.p258s;

import java.util.Collections;
import java.util.List;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p252x1.Cue;
import p007c.p190n.p194b.p209b.p252x1.Subtitle;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.x1.s.b, reason: use source file name */
/* JADX INFO: compiled from: SubripSubtitle.java */
/* JADX INFO: loaded from: classes.dex */
public final class SubripSubtitle implements Subtitle {

    /* JADX INFO: renamed from: f */
    public final Cue[] f10041f;

    /* JADX INFO: renamed from: g */
    public final long[] f10042g;

    public SubripSubtitle(Cue[] cueArr, long[] jArr) {
        this.f10041f = cueArr;
        this.f10042g = jArr;
    }

    @Override // p007c.p190n.p194b.p209b.p252x1.Subtitle
    /* JADX INFO: renamed from: f */
    public int mo4395f(long j2) {
        int iM3114b = Util6.m3114b(this.f10042g, j2, false, false);
        if (iM3114b < this.f10042g.length) {
            return iM3114b;
        }
        return -1;
    }

    @Override // p007c.p190n.p194b.p209b.p252x1.Subtitle
    /* JADX INFO: renamed from: h */
    public long mo4396h(int i) {
        C2096e.m4566b(i >= 0);
        C2096e.m4566b(i < this.f10042g.length);
        return this.f10042g[i];
    }

    @Override // p007c.p190n.p194b.p209b.p252x1.Subtitle
    /* JADX INFO: renamed from: j */
    public List<Cue> mo4397j(long j2) {
        int iM3118f = Util6.m3118f(this.f10042g, j2, true, false);
        if (iM3118f != -1) {
            Cue[] cueArr = this.f10041f;
            if (cueArr[iM3118f] != Cue.f9786a) {
                return Collections.singletonList(cueArr[iM3118f]);
            }
        }
        return Collections.emptyList();
    }

    @Override // p007c.p190n.p194b.p209b.p252x1.Subtitle
    /* JADX INFO: renamed from: l */
    public int mo4398l() {
        return this.f10042g.length;
    }
}
