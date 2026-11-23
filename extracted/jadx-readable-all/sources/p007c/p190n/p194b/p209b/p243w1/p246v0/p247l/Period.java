package p007c.p190n.p194b.p209b.p243w1.p246v0.p247l;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: c.n.b.b.w1.v0.l.f, reason: use source file name */
/* JADX INFO: compiled from: Period.java */
/* JADX INFO: loaded from: classes.dex */
public class Period {

    /* JADX INFO: renamed from: a */
    public final String f9286a;

    /* JADX INFO: renamed from: b */
    public final long f9287b;

    /* JADX INFO: renamed from: c */
    public final List<AdaptationSet> f9288c;

    /* JADX INFO: renamed from: d */
    public final List<EventStream> f9289d;

    public Period(String str, long j2, List<AdaptationSet> list) {
        this(str, j2, list, Collections.emptyList(), null);
    }

    public Period(String str, long j2, List<AdaptationSet> list, List<EventStream> list2) {
        this(str, j2, list, list2, null);
    }

    public Period(String str, long j2, List<AdaptationSet> list, List<EventStream> list2, Descriptor2 descriptor2) {
        this.f9286a = str;
        this.f9287b = j2;
        this.f9288c = Collections.unmodifiableList(list);
        this.f9289d = Collections.unmodifiableList(list2);
    }
}
