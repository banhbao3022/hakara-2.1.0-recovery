package p007c.p190n.p194b.p209b.p252x1.p257r;

import java.util.Collections;
import java.util.List;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p252x1.Cue;
import p007c.p190n.p194b.p209b.p252x1.Subtitle;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.x1.r.d, reason: use source file name */
/* JADX INFO: compiled from: SsaSubtitle.java */
/* JADX INFO: loaded from: classes.dex */
public final class SsaSubtitle implements Subtitle {

    /* JADX INFO: renamed from: f */
    public final List<List<Cue>> f10035f;

    /* JADX INFO: renamed from: g */
    public final List<Long> f10036g;

    public SsaSubtitle(List<List<Cue>> list, List<Long> list2) {
        this.f10035f = list;
        this.f10036g = list2;
    }

    @Override // p007c.p190n.p194b.p209b.p252x1.Subtitle
    /* JADX INFO: renamed from: f */
    public int mo4395f(long j2) {
        int i;
        List<Long> list = this.f10036g;
        Long lValueOf = Long.valueOf(j2);
        int i2 = Util6.f6307a;
        int iBinarySearch = Collections.binarySearch(list, lValueOf);
        if (iBinarySearch < 0) {
            i = ~iBinarySearch;
        } else {
            int size = list.size();
            do {
                iBinarySearch++;
                if (iBinarySearch >= size) {
                    break;
                }
            } while (list.get(iBinarySearch).compareTo(lValueOf) == 0);
            i = iBinarySearch;
        }
        if (i < this.f10036g.size()) {
            return i;
        }
        return -1;
    }

    @Override // p007c.p190n.p194b.p209b.p252x1.Subtitle
    /* JADX INFO: renamed from: h */
    public long mo4396h(int i) {
        C2096e.m4566b(i >= 0);
        C2096e.m4566b(i < this.f10036g.size());
        return this.f10036g.get(i).longValue();
    }

    @Override // p007c.p190n.p194b.p209b.p252x1.Subtitle
    /* JADX INFO: renamed from: j */
    public List<Cue> mo4397j(long j2) {
        int iM3116d = Util6.m3116d(this.f10036g, Long.valueOf(j2), true, false);
        return iM3116d == -1 ? Collections.emptyList() : this.f10035f.get(iM3116d);
    }

    @Override // p007c.p190n.p194b.p209b.p252x1.Subtitle
    /* JADX INFO: renamed from: l */
    public int mo4398l() {
        return this.f10036g.size();
    }
}
