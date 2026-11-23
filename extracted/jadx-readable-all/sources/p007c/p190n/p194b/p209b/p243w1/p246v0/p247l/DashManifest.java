package p007c.p190n.p194b.p209b.p243w1.p246v0.p247l;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import p007c.p190n.p194b.p209b.C;
import p007c.p190n.p194b.p209b.p242v1.FilterableManifest;
import p007c.p190n.p194b.p209b.p242v1.StreamKey;

/* JADX INFO: renamed from: c.n.b.b.w1.v0.l.b, reason: use source file name */
/* JADX INFO: compiled from: DashManifest.java */
/* JADX INFO: loaded from: classes.dex */
public class DashManifest implements FilterableManifest<DashManifest> {

    /* JADX INFO: renamed from: a */
    public final long f9254a;

    /* JADX INFO: renamed from: b */
    public final long f9255b;

    /* JADX INFO: renamed from: c */
    public final long f9256c;

    /* JADX INFO: renamed from: d */
    public final boolean f9257d;

    /* JADX INFO: renamed from: e */
    public final long f9258e;

    /* JADX INFO: renamed from: f */
    public final long f9259f;

    /* JADX INFO: renamed from: g */
    public final long f9260g;

    /* JADX INFO: renamed from: h */
    public final long f9261h;

    /* JADX INFO: renamed from: i */
    public final UtcTimingElement f9262i;

    /* JADX INFO: renamed from: j */
    public final ServiceDescriptionElement f9263j;

    /* JADX INFO: renamed from: k */
    public final Uri f9264k;

    /* JADX INFO: renamed from: l */
    public final ProgramInformation f9265l;

    /* JADX INFO: renamed from: m */
    public final List<Period> f9266m;

    @Deprecated
    public DashManifest(long j2, long j3, long j4, boolean z, long j5, long j6, long j7, long j8, UtcTimingElement utcTimingElement, Uri uri, List<Period> list) {
        this(j2, j3, j4, z, j5, j6, j7, j8, null, utcTimingElement, null, uri, list);
    }

    @Override // p007c.p190n.p194b.p209b.p242v1.FilterableManifest
    /* JADX INFO: renamed from: a */
    public DashManifest mo4049a(List list) {
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new StreamKey(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j2 = 0;
        int i = 0;
        while (true) {
            if (i >= m4254c()) {
                break;
            }
            if (((StreamKey) linkedList.peek()).f8819f != i) {
                long jM4255d = m4255d(i);
                if (jM4255d != -9223372036854775807L) {
                    j2 += jM4255d;
                }
            } else {
                Period periodM4253b = m4253b(i);
                List<AdaptationSet> list2 = periodM4253b.f9288c;
                StreamKey streamKey = (StreamKey) linkedList.poll();
                int i2 = streamKey.f8819f;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i3 = streamKey.f8820g;
                    AdaptationSet adaptationSet = list2.get(i3);
                    List<Representation> list3 = adaptationSet.f9250c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add(list3.get(streamKey.f8821h));
                        streamKey = (StreamKey) linkedList.poll();
                        if (streamKey.f8819f != i2) {
                            break;
                        }
                    } while (streamKey.f8820g == i3);
                    List<AdaptationSet> list4 = list2;
                    arrayList2.add(new AdaptationSet(adaptationSet.f9248a, adaptationSet.f9249b, arrayList3, adaptationSet.f9251d, adaptationSet.f9252e, adaptationSet.f9253f));
                    if (streamKey.f8819f != i2) {
                        break;
                    }
                    list2 = list4;
                }
                linkedList.addFirst(streamKey);
                arrayList.add(new Period(periodM4253b.f9286a, periodM4253b.f9287b - j2, arrayList2, periodM4253b.f9289d));
            }
            i++;
        }
        long j3 = this.f9255b;
        return new DashManifest(this.f9254a, j3 != -9223372036854775807L ? j3 - j2 : -9223372036854775807L, this.f9256c, this.f9257d, this.f9258e, this.f9259f, this.f9260g, this.f9261h, this.f9265l, this.f9262i, this.f9263j, this.f9264k, arrayList);
    }

    /* JADX INFO: renamed from: b */
    public final Period m4253b(int i) {
        return this.f9266m.get(i);
    }

    /* JADX INFO: renamed from: c */
    public final int m4254c() {
        return this.f9266m.size();
    }

    /* JADX INFO: renamed from: d */
    public final long m4255d(int i) {
        if (i != this.f9266m.size() - 1) {
            return this.f9266m.get(i + 1).f9287b - this.f9266m.get(i).f9287b;
        }
        long j2 = this.f9255b;
        if (j2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j2 - this.f9266m.get(i).f9287b;
    }

    /* JADX INFO: renamed from: e */
    public final long m4256e(int i) {
        return C.m3236b(m4255d(i));
    }

    public DashManifest(long j2, long j3, long j4, boolean z, long j5, long j6, long j7, long j8, ProgramInformation programInformation, UtcTimingElement utcTimingElement, ServiceDescriptionElement serviceDescriptionElement, Uri uri, List<Period> list) {
        this.f9254a = j2;
        this.f9255b = j3;
        this.f9256c = j4;
        this.f9257d = z;
        this.f9258e = j5;
        this.f9259f = j6;
        this.f9260g = j7;
        this.f9261h = j8;
        this.f9265l = programInformation;
        this.f9262i = utcTimingElement;
        this.f9264k = uri;
        this.f9263j = serviceDescriptionElement;
        this.f9266m = list == null ? Collections.emptyList() : list;
    }
}
