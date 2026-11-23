package p007c.p190n.p194b.p209b.p221s1;

import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.b.b.s1.v, reason: use source file name */
/* JADX INFO: compiled from: SeekMap.java */
/* JADX INFO: loaded from: classes.dex */
public interface SeekMap {

    /* JADX INFO: renamed from: c.n.b.b.s1.v$a */
    /* JADX INFO: compiled from: SeekMap.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final SeekPoint f8520a;

        /* JADX INFO: renamed from: b */
        public final SeekPoint f8521b;

        public a(SeekPoint seekPoint) {
            this(seekPoint, seekPoint);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f8520a.equals(aVar.f8520a) && this.f8521b.equals(aVar.f8521b);
        }

        public int hashCode() {
            return this.f8521b.hashCode() + (this.f8520a.hashCode() * 31);
        }

        public String toString() {
            String string;
            StringBuilder sbM1556G = outline.m1556G("[");
            sbM1556G.append(this.f8520a);
            if (this.f8520a.equals(this.f8521b)) {
                string = "";
            } else {
                StringBuilder sbM1556G2 = outline.m1556G(", ");
                sbM1556G2.append(this.f8521b);
                string = sbM1556G2.toString();
            }
            return outline.m1550A(sbM1556G, string, "]");
        }

        public a(SeekPoint seekPoint, SeekPoint seekPoint2) {
            Objects.requireNonNull(seekPoint);
            this.f8520a = seekPoint;
            Objects.requireNonNull(seekPoint2);
            this.f8521b = seekPoint2;
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.s1.v$b */
    /* JADX INFO: compiled from: SeekMap.java */
    public static class b implements SeekMap {

        /* JADX INFO: renamed from: a */
        public final long f8522a;

        /* JADX INFO: renamed from: b */
        public final a f8523b;

        public b(long j2) {
            this(j2, 0L);
        }

        @Override // p007c.p190n.p194b.p209b.p221s1.SeekMap
        /* JADX INFO: renamed from: d */
        public boolean mo3716d() {
            return false;
        }

        @Override // p007c.p190n.p194b.p209b.p221s1.SeekMap
        /* JADX INFO: renamed from: h */
        public a mo3717h(long j2) {
            return this.f8523b;
        }

        @Override // p007c.p190n.p194b.p209b.p221s1.SeekMap
        /* JADX INFO: renamed from: i */
        public long mo3718i() {
            return this.f8522a;
        }

        public b(long j2, long j3) {
            this.f8522a = j2;
            this.f8523b = new a(j3 == 0 ? SeekPoint.f8524a : new SeekPoint(0L, j3));
        }
    }

    /* JADX INFO: renamed from: d */
    boolean mo3716d();

    /* JADX INFO: renamed from: h */
    a mo3717h(long j2);

    /* JADX INFO: renamed from: i */
    long mo3718i();
}
