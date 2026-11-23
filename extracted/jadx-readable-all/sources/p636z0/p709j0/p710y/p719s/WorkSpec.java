package p636z0.p709j0.p710y.p719s;

import p007c.p071d.p078c.p079a.outline;
import p636z0.p709j0.BackoffPolicy;
import p636z0.p709j0.Constraints2;
import p636z0.p709j0.Data;
import p636z0.p709j0.Logger9;
import p636z0.p709j0.WorkInfo;

/* JADX INFO: renamed from: z0.j0.y.s.p, reason: use source file name */
/* JADX INFO: compiled from: WorkSpec.java */
/* JADX INFO: loaded from: classes.dex */
public final class WorkSpec {

    /* JADX INFO: renamed from: a */
    public String f37524a;

    /* JADX INFO: renamed from: b */
    public WorkInfo f37525b;

    /* JADX INFO: renamed from: c */
    public String f37526c;

    /* JADX INFO: renamed from: d */
    public String f37527d;

    /* JADX INFO: renamed from: e */
    public Data f37528e;

    /* JADX INFO: renamed from: f */
    public Data f37529f;

    /* JADX INFO: renamed from: g */
    public long f37530g;

    /* JADX INFO: renamed from: h */
    public long f37531h;

    /* JADX INFO: renamed from: i */
    public long f37532i;

    /* JADX INFO: renamed from: j */
    public Constraints2 f37533j;

    /* JADX INFO: renamed from: k */
    public int f37534k;

    /* JADX INFO: renamed from: l */
    public BackoffPolicy f37535l;

    /* JADX INFO: renamed from: m */
    public long f37536m;

    /* JADX INFO: renamed from: n */
    public long f37537n;

    /* JADX INFO: renamed from: o */
    public long f37538o;

    /* JADX INFO: renamed from: p */
    public long f37539p;

    /* JADX INFO: renamed from: q */
    public boolean f37540q;

    /* JADX INFO: renamed from: z0.j0.y.s.p$a */
    /* JADX INFO: compiled from: WorkSpec.java */
    public static class a {

        /* JADX INFO: renamed from: a */
        public String f37541a;

        /* JADX INFO: renamed from: b */
        public WorkInfo f37542b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f37542b != aVar.f37542b) {
                return false;
            }
            return this.f37541a.equals(aVar.f37541a);
        }

        public int hashCode() {
            return this.f37542b.hashCode() + (this.f37541a.hashCode() * 31);
        }
    }

    static {
        Logger9.m15886e("WorkSpec");
    }

    public WorkSpec(String str, String str2) {
        this.f37525b = WorkInfo.ENQUEUED;
        Data data = Data.f37259b;
        this.f37528e = data;
        this.f37529f = data;
        this.f37533j = Constraints2.f37242a;
        this.f37535l = BackoffPolicy.EXPONENTIAL;
        this.f37536m = 30000L;
        this.f37539p = -1L;
        this.f37524a = str;
        this.f37526c = str2;
    }

    /* JADX INFO: renamed from: a */
    public long m15980a() {
        long jCurrentTimeMillis;
        long j2;
        if (this.f37525b == WorkInfo.ENQUEUED && this.f37534k > 0) {
            long jScalb = this.f37535l == BackoffPolicy.LINEAR ? this.f37536m * ((long) this.f37534k) : (long) Math.scalb(this.f37536m, this.f37534k - 1);
            j2 = this.f37537n;
            jCurrentTimeMillis = Math.min(18000000L, jScalb);
        } else {
            if (m15982c()) {
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                long j3 = this.f37537n;
                if (j3 == 0) {
                    j3 = this.f37530g + jCurrentTimeMillis2;
                }
                long j4 = this.f37532i;
                long j5 = this.f37531h;
                if (j4 != j5) {
                    return j3 + j5 + (j3 == 0 ? j4 * (-1) : 0L);
                }
                return j3 + (j3 != 0 ? j5 : 0L);
            }
            jCurrentTimeMillis = this.f37537n;
            if (jCurrentTimeMillis == 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            j2 = this.f37530g;
        }
        return jCurrentTimeMillis + j2;
    }

    /* JADX INFO: renamed from: b */
    public boolean m15981b() {
        return !Constraints2.f37242a.equals(this.f37533j);
    }

    /* JADX INFO: renamed from: c */
    public boolean m15982c() {
        return this.f37531h != 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WorkSpec)) {
            return false;
        }
        WorkSpec workSpec = (WorkSpec) obj;
        if (this.f37530g != workSpec.f37530g || this.f37531h != workSpec.f37531h || this.f37532i != workSpec.f37532i || this.f37534k != workSpec.f37534k || this.f37536m != workSpec.f37536m || this.f37537n != workSpec.f37537n || this.f37538o != workSpec.f37538o || this.f37539p != workSpec.f37539p || this.f37540q != workSpec.f37540q || !this.f37524a.equals(workSpec.f37524a) || this.f37525b != workSpec.f37525b || !this.f37526c.equals(workSpec.f37526c)) {
            return false;
        }
        String str = this.f37527d;
        if (str == null ? workSpec.f37527d == null : str.equals(workSpec.f37527d)) {
            return this.f37528e.equals(workSpec.f37528e) && this.f37529f.equals(workSpec.f37529f) && this.f37533j.equals(workSpec.f37533j) && this.f37535l == workSpec.f37535l;
        }
        return false;
    }

    public int hashCode() {
        int iM1569T = outline.m1569T(this.f37526c, (this.f37525b.hashCode() + (this.f37524a.hashCode() * 31)) * 31, 31);
        String str = this.f37527d;
        int iHashCode = (this.f37529f.hashCode() + ((this.f37528e.hashCode() + ((iM1569T + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        long j2 = this.f37530g;
        int i = (iHashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f37531h;
        int i2 = (i + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.f37532i;
        int iHashCode2 = (this.f37535l.hashCode() + ((((this.f37533j.hashCode() + ((i2 + ((int) (j4 ^ (j4 >>> 32)))) * 31)) * 31) + this.f37534k) * 31)) * 31;
        long j5 = this.f37536m;
        int i3 = (iHashCode2 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        long j6 = this.f37537n;
        int i4 = (i3 + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        long j7 = this.f37538o;
        int i5 = (i4 + ((int) (j7 ^ (j7 >>> 32)))) * 31;
        long j8 = this.f37539p;
        return ((i5 + ((int) (j8 ^ (j8 >>> 32)))) * 31) + (this.f37540q ? 1 : 0);
    }

    public String toString() {
        return outline.m1550A(outline.m1556G("{WorkSpec: "), this.f37524a, "}");
    }

    public WorkSpec(WorkSpec workSpec) {
        this.f37525b = WorkInfo.ENQUEUED;
        Data data = Data.f37259b;
        this.f37528e = data;
        this.f37529f = data;
        this.f37533j = Constraints2.f37242a;
        this.f37535l = BackoffPolicy.EXPONENTIAL;
        this.f37536m = 30000L;
        this.f37539p = -1L;
        this.f37524a = workSpec.f37524a;
        this.f37526c = workSpec.f37526c;
        this.f37525b = workSpec.f37525b;
        this.f37527d = workSpec.f37527d;
        this.f37528e = new Data(workSpec.f37528e);
        this.f37529f = new Data(workSpec.f37529f);
        this.f37530g = workSpec.f37530g;
        this.f37531h = workSpec.f37531h;
        this.f37532i = workSpec.f37532i;
        this.f37533j = new Constraints2(workSpec.f37533j);
        this.f37534k = workSpec.f37534k;
        this.f37535l = workSpec.f37535l;
        this.f37536m = workSpec.f37536m;
        this.f37537n = workSpec.f37537n;
        this.f37538o = workSpec.f37538o;
        this.f37539p = workSpec.f37539p;
        this.f37540q = workSpec.f37540q;
    }
}
