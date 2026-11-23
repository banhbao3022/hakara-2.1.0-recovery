package p636z0.p709j0;

import android.os.Build;

/* JADX INFO: renamed from: z0.j0.c, reason: use source file name */
/* JADX INFO: compiled from: Constraints.java */
/* JADX INFO: loaded from: classes.dex */
public final class Constraints2 {

    /* JADX INFO: renamed from: a */
    public static final Constraints2 f37242a = new a().m15876a();

    /* JADX INFO: renamed from: b */
    public NetworkType f37243b;

    /* JADX INFO: renamed from: c */
    public boolean f37244c;

    /* JADX INFO: renamed from: d */
    public boolean f37245d;

    /* JADX INFO: renamed from: e */
    public boolean f37246e;

    /* JADX INFO: renamed from: f */
    public boolean f37247f;

    /* JADX INFO: renamed from: g */
    public long f37248g;

    /* JADX INFO: renamed from: h */
    public long f37249h;

    /* JADX INFO: renamed from: i */
    public ContentUriTriggers f37250i;

    /* JADX INFO: renamed from: z0.j0.c$a */
    /* JADX INFO: compiled from: Constraints.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public NetworkType f37251a = NetworkType.NOT_REQUIRED;

        /* JADX INFO: renamed from: b */
        public long f37252b = -1;

        /* JADX INFO: renamed from: c */
        public long f37253c = -1;

        /* JADX INFO: renamed from: d */
        public ContentUriTriggers f37254d = new ContentUriTriggers();

        /* JADX INFO: renamed from: a */
        public Constraints2 m15876a() {
            return new Constraints2(this);
        }
    }

    public Constraints2() {
        this.f37243b = NetworkType.NOT_REQUIRED;
        this.f37248g = -1L;
        this.f37249h = -1L;
        this.f37250i = new ContentUriTriggers();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Constraints2.class != obj.getClass()) {
            return false;
        }
        Constraints2 constraints2 = (Constraints2) obj;
        if (this.f37244c == constraints2.f37244c && this.f37245d == constraints2.f37245d && this.f37246e == constraints2.f37246e && this.f37247f == constraints2.f37247f && this.f37248g == constraints2.f37248g && this.f37249h == constraints2.f37249h && this.f37243b == constraints2.f37243b) {
            return this.f37250i.equals(constraints2.f37250i);
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.f37243b.hashCode() * 31) + (this.f37244c ? 1 : 0)) * 31) + (this.f37245d ? 1 : 0)) * 31) + (this.f37246e ? 1 : 0)) * 31) + (this.f37247f ? 1 : 0)) * 31;
        long j2 = this.f37248g;
        int i = (iHashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f37249h;
        return this.f37250i.hashCode() + ((i + ((int) (j3 ^ (j3 >>> 32)))) * 31);
    }

    public Constraints2(a aVar) {
        this.f37243b = NetworkType.NOT_REQUIRED;
        this.f37248g = -1L;
        this.f37249h = -1L;
        this.f37250i = new ContentUriTriggers();
        this.f37244c = false;
        int i = Build.VERSION.SDK_INT;
        this.f37245d = false;
        this.f37243b = aVar.f37251a;
        this.f37246e = false;
        this.f37247f = false;
        if (i >= 24) {
            this.f37250i = aVar.f37254d;
            this.f37248g = aVar.f37252b;
            this.f37249h = aVar.f37253c;
        }
    }

    public Constraints2(Constraints2 constraints2) {
        this.f37243b = NetworkType.NOT_REQUIRED;
        this.f37248g = -1L;
        this.f37249h = -1L;
        this.f37250i = new ContentUriTriggers();
        this.f37244c = constraints2.f37244c;
        this.f37245d = constraints2.f37245d;
        this.f37243b = constraints2.f37243b;
        this.f37246e = constraints2.f37246e;
        this.f37247f = constraints2.f37247f;
        this.f37250i = constraints2.f37250i;
    }
}
