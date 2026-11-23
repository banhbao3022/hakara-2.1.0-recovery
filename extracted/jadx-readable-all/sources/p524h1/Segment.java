package p524h1;

import p477d1.p483s._ArraysJvm;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: h1.u, reason: use source file name */
/* JADX INFO: compiled from: Segment.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Segment {

    /* JADX INFO: renamed from: a */
    public final byte[] f30742a;

    /* JADX INFO: renamed from: b */
    public int f30743b;

    /* JADX INFO: renamed from: c */
    public int f30744c;

    /* JADX INFO: renamed from: d */
    public boolean f30745d;

    /* JADX INFO: renamed from: e */
    public boolean f30746e;

    /* JADX INFO: renamed from: f */
    public Segment f30747f;

    /* JADX INFO: renamed from: g */
    public Segment f30748g;

    /* JADX INFO: renamed from: h1.u$a */
    /* JADX INFO: compiled from: Segment.kt */
    public static final class a {
        public a() {
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        new a(null);
    }

    public Segment() {
        this.f30742a = new byte[8192];
        this.f30746e = true;
        this.f30745d = false;
    }

    /* JADX INFO: renamed from: a */
    public final Segment m13786a() {
        Segment segment = this.f30747f;
        Segment segment2 = segment != this ? segment : null;
        Segment segment3 = this.f30748g;
        if (segment3 == null) {
            Intrinsics2.m13095k();
            throw null;
        }
        segment3.f30747f = segment;
        Segment segment4 = this.f30747f;
        if (segment4 == null) {
            Intrinsics2.m13095k();
            throw null;
        }
        segment4.f30748g = segment3;
        this.f30747f = null;
        this.f30748g = null;
        return segment2;
    }

    /* JADX INFO: renamed from: b */
    public final Segment m13787b(Segment segment) {
        Intrinsics2.m13090f(segment, "segment");
        segment.f30748g = this;
        segment.f30747f = this.f30747f;
        Segment segment2 = this.f30747f;
        if (segment2 == null) {
            Intrinsics2.m13095k();
            throw null;
        }
        segment2.f30748g = segment;
        this.f30747f = segment;
        return segment;
    }

    /* JADX INFO: renamed from: c */
    public final Segment m13788c() {
        this.f30745d = true;
        return new Segment(this.f30742a, this.f30743b, this.f30744c, true, false);
    }

    /* JADX INFO: renamed from: d */
    public final void m13789d(Segment segment, int i) {
        Intrinsics2.m13090f(segment, "sink");
        if (!segment.f30746e) {
            throw new IllegalStateException("only owner can write".toString());
        }
        int i2 = segment.f30744c;
        if (i2 + i > 8192) {
            if (segment.f30745d) {
                throw new IllegalArgumentException();
            }
            int i3 = segment.f30743b;
            if ((i2 + i) - i3 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = segment.f30742a;
            _ArraysJvm.m13029c(bArr, bArr, 0, i3, i2, 2);
            segment.f30744c -= segment.f30743b;
            segment.f30743b = 0;
        }
        byte[] bArr2 = this.f30742a;
        byte[] bArr3 = segment.f30742a;
        int i4 = segment.f30744c;
        int i5 = this.f30743b;
        _ArraysJvm.m13028b(bArr2, bArr3, i4, i5, i5 + i);
        segment.f30744c += i;
        this.f30743b += i;
    }

    public Segment(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        Intrinsics2.m13090f(bArr, "data");
        this.f30742a = bArr;
        this.f30743b = i;
        this.f30744c = i2;
        this.f30745d = z;
        this.f30746e = z2;
    }
}
