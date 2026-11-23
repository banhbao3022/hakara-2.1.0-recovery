package p007c.p190n.p194b.p209b.p243w1.p246v0.p247l;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p243w1.p246v0.DashSegmentIndex;

/* JADX INFO: renamed from: c.n.b.b.w1.v0.l.i, reason: use source file name */
/* JADX INFO: compiled from: Representation.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class Representation {

    /* JADX INFO: renamed from: a */
    public final Format f9299a;

    /* JADX INFO: renamed from: b */
    public final String f9300b;

    /* JADX INFO: renamed from: c */
    public final long f9301c;

    /* JADX INFO: renamed from: d */
    public final List<Descriptor2> f9302d;

    /* JADX INFO: renamed from: e */
    public final RangedUri f9303e;

    /* JADX INFO: renamed from: c.n.b.b.w1.v0.l.i$b */
    /* JADX INFO: compiled from: Representation.java */
    public static class b extends Representation implements DashSegmentIndex {

        /* JADX INFO: renamed from: f */
        public final SegmentBase.a f9304f;

        public b(long j2, Format format, String str, SegmentBase.a aVar, List<Descriptor2> list) {
            super(j2, format, str, aVar, list, null);
            this.f9304f = aVar;
        }

        @Override // p007c.p190n.p194b.p209b.p243w1.p246v0.DashSegmentIndex
        /* JADX INFO: renamed from: a */
        public long mo4230a(long j2) {
            return this.f9304f.m4292g(j2);
        }

        @Override // p007c.p190n.p194b.p209b.p243w1.p246v0.DashSegmentIndex
        /* JADX INFO: renamed from: b */
        public long mo4231b(long j2, long j3) {
            return this.f9304f.m4290e(j2, j3);
        }

        @Override // p007c.p190n.p194b.p209b.p243w1.p246v0.DashSegmentIndex
        /* JADX INFO: renamed from: c */
        public long mo4232c(long j2, long j3) {
            return this.f9304f.m4288c(j2, j3);
        }

        @Override // p007c.p190n.p194b.p209b.p243w1.p246v0.DashSegmentIndex
        /* JADX INFO: renamed from: d */
        public long mo4233d(long j2, long j3) {
            SegmentBase.a aVar = this.f9304f;
            if (aVar.f9313f != null) {
                return -9223372036854775807L;
            }
            long jM4288c = aVar.m4288c(j2, j3) + ((long) aVar.m4287b(j2, j3));
            return (aVar.m4290e(jM4288c, j2) + aVar.m4292g(jM4288c)) - aVar.f9316i;
        }

        @Override // p007c.p190n.p194b.p209b.p243w1.p246v0.DashSegmentIndex
        /* JADX INFO: renamed from: e */
        public RangedUri mo4234e(long j2) {
            return this.f9304f.mo4293h(this, j2);
        }

        @Override // p007c.p190n.p194b.p209b.p243w1.p246v0.DashSegmentIndex
        /* JADX INFO: renamed from: f */
        public long mo4235f(long j2, long j3) {
            return this.f9304f.m4291f(j2, j3);
        }

        @Override // p007c.p190n.p194b.p209b.p243w1.p246v0.DashSegmentIndex
        /* JADX INFO: renamed from: g */
        public boolean mo4236g() {
            return this.f9304f.mo4294i();
        }

        @Override // p007c.p190n.p194b.p209b.p243w1.p246v0.DashSegmentIndex
        /* JADX INFO: renamed from: h */
        public long mo4237h() {
            return this.f9304f.f9311d;
        }

        @Override // p007c.p190n.p194b.p209b.p243w1.p246v0.DashSegmentIndex
        /* JADX INFO: renamed from: i */
        public int mo4238i(long j2) {
            return this.f9304f.mo4289d(j2);
        }

        @Override // p007c.p190n.p194b.p209b.p243w1.p246v0.DashSegmentIndex
        /* JADX INFO: renamed from: j */
        public int mo4239j(long j2, long j3) {
            return this.f9304f.m4287b(j2, j3);
        }

        @Override // p007c.p190n.p194b.p209b.p243w1.p246v0.p247l.Representation
        /* JADX INFO: renamed from: k */
        public String mo4283k() {
            return null;
        }

        @Override // p007c.p190n.p194b.p209b.p243w1.p246v0.p247l.Representation
        /* JADX INFO: renamed from: l */
        public DashSegmentIndex mo4284l() {
            return this;
        }

        @Override // p007c.p190n.p194b.p209b.p243w1.p246v0.p247l.Representation
        /* JADX INFO: renamed from: m */
        public RangedUri mo4285m() {
            return null;
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.w1.v0.l.i$c */
    /* JADX INFO: compiled from: Representation.java */
    public static class c extends Representation {

        /* JADX INFO: renamed from: f */
        public final String f9305f;

        /* JADX INFO: renamed from: g */
        public final RangedUri f9306g;

        /* JADX INFO: renamed from: h */
        public final SingleSegmentIndex f9307h;

        public c(long j2, Format format, String str, SegmentBase.e eVar, List<Descriptor2> list, String str2, long j3) {
            super(j2, format, str, eVar, list, null);
            Uri.parse(str);
            long j4 = eVar.f9324e;
            RangedUri rangedUri = j4 <= 0 ? null : new RangedUri(null, eVar.f9323d, j4);
            this.f9306g = rangedUri;
            this.f9305f = str2;
            this.f9307h = rangedUri == null ? new SingleSegmentIndex(new RangedUri(null, 0L, j3)) : null;
        }

        @Override // p007c.p190n.p194b.p209b.p243w1.p246v0.p247l.Representation
        /* JADX INFO: renamed from: k */
        public String mo4283k() {
            return this.f9305f;
        }

        @Override // p007c.p190n.p194b.p209b.p243w1.p246v0.p247l.Representation
        /* JADX INFO: renamed from: l */
        public DashSegmentIndex mo4284l() {
            return this.f9307h;
        }

        @Override // p007c.p190n.p194b.p209b.p243w1.p246v0.p247l.Representation
        /* JADX INFO: renamed from: m */
        public RangedUri mo4285m() {
            return this.f9306g;
        }
    }

    public Representation(long j2, Format format, String str, SegmentBase segmentBase, List list, a aVar) {
        this.f9299a = format;
        this.f9300b = str;
        this.f9302d = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.f9303e = segmentBase.mo4286a(this);
        this.f9301c = Util6.m3104M(segmentBase.f9310c, 1000000L, segmentBase.f9309b);
    }

    /* JADX INFO: renamed from: k */
    public abstract String mo4283k();

    /* JADX INFO: renamed from: l */
    public abstract DashSegmentIndex mo4284l();

    /* JADX INFO: renamed from: m */
    public abstract RangedUri mo4285m();
}
