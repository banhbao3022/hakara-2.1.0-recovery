package p007c.p190n.p194b.p209b.p243w1;

/* JADX INFO: renamed from: c.n.b.b.w1.q, reason: use source file name */
/* JADX INFO: compiled from: CompositeSequenceableLoader.java */
/* JADX INFO: loaded from: classes.dex */
public class CompositeSequenceableLoader implements SequenceableLoader {

    /* JADX INFO: renamed from: f */
    public final SequenceableLoader[] f9063f;

    public CompositeSequenceableLoader(SequenceableLoader[] sequenceableLoaderArr) {
        this.f9063f = sequenceableLoaderArr;
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.SequenceableLoader
    /* JADX INFO: renamed from: b */
    public final long mo4068b() {
        long jMin = Long.MAX_VALUE;
        for (SequenceableLoader sequenceableLoader : this.f9063f) {
            long jMo4068b = sequenceableLoader.mo4068b();
            if (jMo4068b != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jMo4068b);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.SequenceableLoader
    /* JADX INFO: renamed from: d */
    public boolean mo4069d(long j2) {
        boolean zMo4069d;
        boolean z = false;
        do {
            long jMo4068b = mo4068b();
            if (jMo4068b == Long.MIN_VALUE) {
                break;
            }
            zMo4069d = false;
            for (SequenceableLoader sequenceableLoader : this.f9063f) {
                long jMo4068b2 = sequenceableLoader.mo4068b();
                boolean z2 = jMo4068b2 != Long.MIN_VALUE && jMo4068b2 <= j2;
                if (jMo4068b2 == jMo4068b || z2) {
                    zMo4069d |= sequenceableLoader.mo4069d(j2);
                }
            }
            z |= zMo4069d;
        } while (zMo4069d);
        return z;
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.SequenceableLoader
    /* JADX INFO: renamed from: e */
    public boolean mo4070e() {
        for (SequenceableLoader sequenceableLoader : this.f9063f) {
            if (sequenceableLoader.mo4070e()) {
                return true;
            }
        }
        return false;
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.SequenceableLoader
    /* JADX INFO: renamed from: g */
    public final long mo4072g() {
        long jMin = Long.MAX_VALUE;
        for (SequenceableLoader sequenceableLoader : this.f9063f) {
            long jMo4072g = sequenceableLoader.mo4072g();
            if (jMo4072g != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jMo4072g);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.SequenceableLoader
    /* JADX INFO: renamed from: h */
    public final void mo4073h(long j2) {
        for (SequenceableLoader sequenceableLoader : this.f9063f) {
            sequenceableLoader.mo4073h(j2);
        }
    }
}
