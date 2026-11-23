package p007c.p190n.p194b.p209b.p243w1.p246v0.p247l;

import java.util.List;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.p212b2.Util6;

/* JADX INFO: renamed from: c.n.b.b.w1.v0.l.j, reason: use source file name */
/* JADX INFO: compiled from: SegmentBase.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class SegmentBase {

    /* JADX INFO: renamed from: a */
    public final RangedUri f9308a;

    /* JADX INFO: renamed from: b */
    public final long f9309b;

    /* JADX INFO: renamed from: c */
    public final long f9310c;

    /* JADX INFO: renamed from: c.n.b.b.w1.v0.l.j$a */
    /* JADX INFO: compiled from: SegmentBase.java */
    public static abstract class a extends SegmentBase {

        /* JADX INFO: renamed from: d */
        public final long f9311d;

        /* JADX INFO: renamed from: e */
        public final long f9312e;

        /* JADX INFO: renamed from: f */
        public final List<d> f9313f;

        /* JADX INFO: renamed from: g */
        public final long f9314g;

        /* JADX INFO: renamed from: h */
        public final long f9315h;

        /* JADX INFO: renamed from: i */
        public final long f9316i;

        public a(RangedUri rangedUri, long j2, long j3, long j4, long j5, List<d> list, long j6, long j7, long j8) {
            super(rangedUri, j2, j3);
            this.f9311d = j4;
            this.f9312e = j5;
            this.f9313f = list;
            this.f9316i = j6;
            this.f9314g = j7;
            this.f9315h = j8;
        }

        /* JADX INFO: renamed from: b */
        public int m4287b(long j2, long j3) {
            int iMo4289d = mo4289d(j2);
            return iMo4289d != -1 ? iMo4289d : (int) (m4291f((j3 - this.f9315h) + this.f9316i, j2) - m4288c(j2, j3));
        }

        /* JADX INFO: renamed from: c */
        public long m4288c(long j2, long j3) {
            if (mo4289d(j2) == -1) {
                long j4 = this.f9314g;
                if (j4 != -9223372036854775807L) {
                    return Math.max(this.f9311d, m4291f((j3 - this.f9315h) - j4, j2));
                }
            }
            return this.f9311d;
        }

        /* JADX INFO: renamed from: d */
        public abstract int mo4289d(long j2);

        /* JADX INFO: renamed from: e */
        public final long m4290e(long j2, long j3) {
            List<d> list = this.f9313f;
            if (list != null) {
                return (list.get((int) (j2 - this.f9311d)).f9322b * 1000000) / this.f9309b;
            }
            int iMo4289d = mo4289d(j3);
            return (iMo4289d == -1 || j2 != (this.f9311d + ((long) iMo4289d)) - 1) ? (this.f9312e * 1000000) / this.f9309b : j3 - m4292g(j2);
        }

        /* JADX INFO: renamed from: f */
        public long m4291f(long j2, long j3) {
            long j4 = this.f9311d;
            long jMo4289d = mo4289d(j3);
            if (jMo4289d == 0) {
                return j4;
            }
            if (this.f9313f == null) {
                long j5 = (j2 / ((this.f9312e * 1000000) / this.f9309b)) + this.f9311d;
                if (j5 < j4) {
                    return j4;
                }
                return jMo4289d == -1 ? j5 : Math.min(j5, (j4 + jMo4289d) - 1);
            }
            long j6 = (jMo4289d + j4) - 1;
            long j7 = j4;
            while (j7 <= j6) {
                long j8 = ((j6 - j7) / 2) + j7;
                long jM4292g = m4292g(j8);
                if (jM4292g < j2) {
                    j7 = j8 + 1;
                } else {
                    if (jM4292g <= j2) {
                        return j8;
                    }
                    j6 = j8 - 1;
                }
            }
            return j7 == j4 ? j7 : j6;
        }

        /* JADX INFO: renamed from: g */
        public final long m4292g(long j2) {
            List<d> list = this.f9313f;
            return Util6.m3104M(list != null ? list.get((int) (j2 - this.f9311d)).f9321a - this.f9310c : (j2 - this.f9311d) * this.f9312e, 1000000L, this.f9309b);
        }

        /* JADX INFO: renamed from: h */
        public abstract RangedUri mo4293h(Representation representation, long j2);

        /* JADX INFO: renamed from: i */
        public boolean mo4294i() {
            return this.f9313f != null;
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.w1.v0.l.j$b */
    /* JADX INFO: compiled from: SegmentBase.java */
    public static final class b extends a {

        /* JADX INFO: renamed from: j */
        public final List<RangedUri> f9317j;

        public b(RangedUri rangedUri, long j2, long j3, long j4, long j5, List<d> list, long j6, List<RangedUri> list2, long j7, long j8) {
            super(rangedUri, j2, j3, j4, j5, list, j6, j7, j8);
            this.f9317j = list2;
        }

        @Override // p007c.p190n.p194b.p209b.p243w1.p246v0.p247l.SegmentBase.a
        /* JADX INFO: renamed from: d */
        public int mo4289d(long j2) {
            return this.f9317j.size();
        }

        @Override // p007c.p190n.p194b.p209b.p243w1.p246v0.p247l.SegmentBase.a
        /* JADX INFO: renamed from: h */
        public RangedUri mo4293h(Representation representation, long j2) {
            return this.f9317j.get((int) (j2 - this.f9311d));
        }

        @Override // p007c.p190n.p194b.p209b.p243w1.p246v0.p247l.SegmentBase.a
        /* JADX INFO: renamed from: i */
        public boolean mo4294i() {
            return true;
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.w1.v0.l.j$c */
    /* JADX INFO: compiled from: SegmentBase.java */
    public static final class c extends a {

        /* JADX INFO: renamed from: j */
        public final UrlTemplate f9318j;

        /* JADX INFO: renamed from: k */
        public final UrlTemplate f9319k;

        /* JADX INFO: renamed from: l */
        public final long f9320l;

        public c(RangedUri rangedUri, long j2, long j3, long j4, long j5, long j6, List<d> list, long j7, UrlTemplate urlTemplate, UrlTemplate urlTemplate2, long j8, long j9) {
            super(rangedUri, j2, j3, j4, j6, list, j7, j8, j9);
            this.f9318j = urlTemplate;
            this.f9319k = urlTemplate2;
            this.f9320l = j5;
        }

        @Override // p007c.p190n.p194b.p209b.p243w1.p246v0.p247l.SegmentBase
        /* JADX INFO: renamed from: a */
        public RangedUri mo4286a(Representation representation) {
            UrlTemplate urlTemplate = this.f9318j;
            if (urlTemplate == null) {
                return this.f9308a;
            }
            Format format = representation.f9299a;
            return new RangedUri(urlTemplate.m4295a(format.f6923f, 0L, format.f6930m, 0L), 0L, -1L);
        }

        @Override // p007c.p190n.p194b.p209b.p243w1.p246v0.p247l.SegmentBase.a
        /* JADX INFO: renamed from: d */
        public int mo4289d(long j2) {
            List<d> list = this.f9313f;
            if (list != null) {
                return list.size();
            }
            long j3 = this.f9320l;
            if (j3 != -1) {
                return (int) ((j3 - this.f9311d) + 1);
            }
            if (j2 == -9223372036854775807L) {
                return -1;
            }
            long j4 = (this.f9312e * 1000000) / this.f9309b;
            int i = Util6.f6307a;
            return (int) (((j2 + j4) - 1) / j4);
        }

        @Override // p007c.p190n.p194b.p209b.p243w1.p246v0.p247l.SegmentBase.a
        /* JADX INFO: renamed from: h */
        public RangedUri mo4293h(Representation representation, long j2) {
            List<d> list = this.f9313f;
            long j3 = list != null ? list.get((int) (j2 - this.f9311d)).f9321a : (j2 - this.f9311d) * this.f9312e;
            UrlTemplate urlTemplate = this.f9319k;
            Format format = representation.f9299a;
            return new RangedUri(urlTemplate.m4295a(format.f6923f, j2, format.f6930m, j3), 0L, -1L);
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.w1.v0.l.j$d */
    /* JADX INFO: compiled from: SegmentBase.java */
    public static final class d {

        /* JADX INFO: renamed from: a */
        public final long f9321a;

        /* JADX INFO: renamed from: b */
        public final long f9322b;

        public d(long j2, long j3) {
            this.f9321a = j2;
            this.f9322b = j3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f9321a == dVar.f9321a && this.f9322b == dVar.f9322b;
        }

        public int hashCode() {
            return (((int) this.f9321a) * 31) + ((int) this.f9322b);
        }
    }

    public SegmentBase(RangedUri rangedUri, long j2, long j3) {
        this.f9308a = rangedUri;
        this.f9309b = j2;
        this.f9310c = j3;
    }

    /* JADX INFO: renamed from: a */
    public RangedUri mo4286a(Representation representation) {
        return this.f9308a;
    }

    /* JADX INFO: renamed from: c.n.b.b.w1.v0.l.j$e */
    /* JADX INFO: compiled from: SegmentBase.java */
    public static class e extends SegmentBase {

        /* JADX INFO: renamed from: d */
        public final long f9323d;

        /* JADX INFO: renamed from: e */
        public final long f9324e;

        public e(RangedUri rangedUri, long j2, long j3, long j4, long j5) {
            super(rangedUri, j2, j3);
            this.f9323d = j4;
            this.f9324e = j5;
        }

        public e() {
            this(null, 1L, 0L, 0L, 0L);
        }
    }
}
