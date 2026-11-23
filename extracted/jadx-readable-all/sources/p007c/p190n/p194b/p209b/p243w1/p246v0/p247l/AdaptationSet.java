package p007c.p190n.p194b.p209b.p243w1.p246v0.p247l;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: c.n.b.b.w1.v0.l.a, reason: use source file name */
/* JADX INFO: compiled from: AdaptationSet.java */
/* JADX INFO: loaded from: classes.dex */
public class AdaptationSet {

    /* JADX INFO: renamed from: a */
    public final int f9248a;

    /* JADX INFO: renamed from: b */
    public final int f9249b;

    /* JADX INFO: renamed from: c */
    public final List<Representation> f9250c;

    /* JADX INFO: renamed from: d */
    public final List<Descriptor2> f9251d;

    /* JADX INFO: renamed from: e */
    public final List<Descriptor2> f9252e;

    /* JADX INFO: renamed from: f */
    public final List<Descriptor2> f9253f;

    public AdaptationSet(int i, int i2, List<Representation> list, List<Descriptor2> list2, List<Descriptor2> list3, List<Descriptor2> list4) {
        this.f9248a = i;
        this.f9249b = i2;
        this.f9250c = Collections.unmodifiableList(list);
        this.f9251d = Collections.unmodifiableList(list2);
        this.f9252e = Collections.unmodifiableList(list3);
        this.f9253f = Collections.unmodifiableList(list4);
    }
}
