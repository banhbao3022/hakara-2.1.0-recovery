package p007c.p190n.p194b.p209b.p221s1;

import java.io.IOException;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.s1.a, reason: use source file name */
/* JADX INFO: compiled from: BinarySearchSeeker.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class BinarySearchSeeker {

    /* JADX INFO: renamed from: a */
    public final a f7526a;

    /* JADX INFO: renamed from: b */
    public final f f7527b;

    /* JADX INFO: renamed from: c */
    public c f7528c;

    /* JADX INFO: renamed from: d */
    public final int f7529d;

    /* JADX INFO: renamed from: c.n.b.b.s1.a$a */
    /* JADX INFO: compiled from: BinarySearchSeeker.java */
    public static class a implements SeekMap {

        /* JADX INFO: renamed from: a */
        public final d f7530a;

        /* JADX INFO: renamed from: b */
        public final long f7531b;

        /* JADX INFO: renamed from: c */
        public final long f7532c;

        /* JADX INFO: renamed from: d */
        public final long f7533d;

        /* JADX INFO: renamed from: e */
        public final long f7534e;

        /* JADX INFO: renamed from: f */
        public final long f7535f;

        /* JADX INFO: renamed from: g */
        public final long f7536g;

        public a(d dVar, long j2, long j3, long j4, long j5, long j6, long j7) {
            this.f7530a = dVar;
            this.f7531b = j2;
            this.f7532c = j3;
            this.f7533d = j4;
            this.f7534e = j5;
            this.f7535f = j6;
            this.f7536g = j7;
        }

        @Override // p007c.p190n.p194b.p209b.p221s1.SeekMap
        /* JADX INFO: renamed from: d */
        public boolean mo3716d() {
            return true;
        }

        @Override // p007c.p190n.p194b.p209b.p221s1.SeekMap
        /* JADX INFO: renamed from: h */
        public SeekMap.a mo3717h(long j2) {
            return new SeekMap.a(new SeekPoint(j2, c.m3720a(this.f7530a.mo3719a(j2), this.f7532c, this.f7533d, this.f7534e, this.f7535f, this.f7536g)));
        }

        @Override // p007c.p190n.p194b.p209b.p221s1.SeekMap
        /* JADX INFO: renamed from: i */
        public long mo3718i() {
            return this.f7531b;
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.s1.a$b */
    /* JADX INFO: compiled from: BinarySearchSeeker.java */
    public static final class b implements d {
        @Override // p007c.p190n.p194b.p209b.p221s1.BinarySearchSeeker.d
        /* JADX INFO: renamed from: a */
        public long mo3719a(long j2) {
            return j2;
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.s1.a$c */
    /* JADX INFO: compiled from: BinarySearchSeeker.java */
    public static class c {

        /* JADX INFO: renamed from: a */
        public final long f7537a;

        /* JADX INFO: renamed from: b */
        public final long f7538b;

        /* JADX INFO: renamed from: c */
        public final long f7539c;

        /* JADX INFO: renamed from: d */
        public long f7540d;

        /* JADX INFO: renamed from: e */
        public long f7541e;

        /* JADX INFO: renamed from: f */
        public long f7542f;

        /* JADX INFO: renamed from: g */
        public long f7543g;

        /* JADX INFO: renamed from: h */
        public long f7544h;

        public c(long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
            this.f7537a = j2;
            this.f7538b = j3;
            this.f7540d = j4;
            this.f7541e = j5;
            this.f7542f = j6;
            this.f7543g = j7;
            this.f7539c = j8;
            this.f7544h = m3720a(j3, j4, j5, j6, j7, j8);
        }

        /* JADX INFO: renamed from: a */
        public static long m3720a(long j2, long j3, long j4, long j5, long j6, long j7) {
            if (j5 + 1 >= j6 || j3 + 1 >= j4) {
                return j5;
            }
            long j8 = (long) ((j2 - j3) * ((j6 - j5) / (j4 - j3)));
            return Util6.m3122j(((j8 + j5) - j7) - (j8 / 20), j5, j6 - 1);
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.s1.a$d */
    /* JADX INFO: compiled from: BinarySearchSeeker.java */
    public interface d {
        /* JADX INFO: renamed from: a */
        long mo3719a(long j2);
    }

    /* JADX INFO: renamed from: c.n.b.b.s1.a$e */
    /* JADX INFO: compiled from: BinarySearchSeeker.java */
    public static final class e {

        /* JADX INFO: renamed from: a */
        public static final e f7545a = new e(-3, -9223372036854775807L, -1);

        /* JADX INFO: renamed from: b */
        public final int f7546b;

        /* JADX INFO: renamed from: c */
        public final long f7547c;

        /* JADX INFO: renamed from: d */
        public final long f7548d;

        public e(int i, long j2, long j3) {
            this.f7546b = i;
            this.f7547c = j2;
            this.f7548d = j3;
        }

        /* JADX INFO: renamed from: a */
        public static e m3721a(long j2, long j3) {
            return new e(-1, j2, j3);
        }

        /* JADX INFO: renamed from: b */
        public static e m3722b(long j2) {
            return new e(0, -9223372036854775807L, j2);
        }

        /* JADX INFO: renamed from: c */
        public static e m3723c(long j2, long j3) {
            return new e(-2, j2, j3);
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.s1.a$f */
    /* JADX INFO: compiled from: BinarySearchSeeker.java */
    public interface f {
        /* JADX INFO: renamed from: a */
        void mo3724a();

        /* JADX INFO: renamed from: b */
        e mo3725b(ExtractorInput extractorInput, long j2) throws IOException;
    }

    public BinarySearchSeeker(d dVar, f fVar, long j2, long j3, long j4, long j5, long j6, long j7, int i) {
        this.f7527b = fVar;
        this.f7529d = i;
        this.f7526a = new a(dVar, j2, j3, j4, j5, j6, j7);
    }

    /* JADX INFO: renamed from: a */
    public int m3710a(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        while (true) {
            c cVar = this.f7528c;
            C2096e.m4572h(cVar);
            long j2 = cVar.f7542f;
            long j3 = cVar.f7543g;
            long j4 = cVar.f7544h;
            if (j3 - j2 <= this.f7529d) {
                m3712c(false, j2);
                return m3713d(extractorInput, j2, positionHolder);
            }
            if (!m3715f(extractorInput, j4)) {
                return m3713d(extractorInput, j4, positionHolder);
            }
            extractorInput.mo3736k();
            e eVarMo3725b = this.f7527b.mo3725b(extractorInput, cVar.f7538b);
            int i = eVarMo3725b.f7546b;
            if (i == -3) {
                m3712c(false, j4);
                return m3713d(extractorInput, j4, positionHolder);
            }
            if (i == -2) {
                long j5 = eVarMo3725b.f7547c;
                long j6 = eVarMo3725b.f7548d;
                cVar.f7540d = j5;
                cVar.f7542f = j6;
                cVar.f7544h = c.m3720a(cVar.f7538b, j5, cVar.f7541e, j6, cVar.f7543g, cVar.f7539c);
            } else {
                if (i != -1) {
                    if (i != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    m3715f(extractorInput, eVarMo3725b.f7548d);
                    m3712c(true, eVarMo3725b.f7548d);
                    return m3713d(extractorInput, eVarMo3725b.f7548d, positionHolder);
                }
                long j7 = eVarMo3725b.f7547c;
                long j8 = eVarMo3725b.f7548d;
                cVar.f7541e = j7;
                cVar.f7543g = j8;
                cVar.f7544h = c.m3720a(cVar.f7538b, cVar.f7540d, j7, cVar.f7542f, j8, cVar.f7539c);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m3711b() {
        return this.f7528c != null;
    }

    /* JADX INFO: renamed from: c */
    public final void m3712c(boolean z, long j2) {
        this.f7528c = null;
        this.f7527b.mo3724a();
    }

    /* JADX INFO: renamed from: d */
    public final int m3713d(ExtractorInput extractorInput, long j2, PositionHolder positionHolder) {
        if (j2 == extractorInput.mo3740p()) {
            return 0;
        }
        positionHolder.f8519a = j2;
        return 1;
    }

    /* JADX INFO: renamed from: e */
    public final void m3714e(long j2) {
        c cVar = this.f7528c;
        if (cVar == null || cVar.f7537a != j2) {
            long jMo3719a = this.f7526a.f7530a.mo3719a(j2);
            a aVar = this.f7526a;
            this.f7528c = new c(j2, jMo3719a, aVar.f7532c, aVar.f7533d, aVar.f7534e, aVar.f7535f, aVar.f7536g);
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m3715f(ExtractorInput extractorInput, long j2) throws IOException {
        long jMo3740p = j2 - extractorInput.mo3740p();
        if (jMo3740p < 0 || jMo3740p > 262144) {
            return false;
        }
        extractorInput.mo3737l((int) jMo3740p);
        return true;
    }
}
