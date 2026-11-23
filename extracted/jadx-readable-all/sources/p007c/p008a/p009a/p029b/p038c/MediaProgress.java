package p007c.p008a.p009a.p029b.p038c;

import p477d1.p493x.p495c.DefaultConstructorMarker;

/* JADX INFO: renamed from: c.a.a.b.c.b, reason: use source file name */
/* JADX INFO: compiled from: MediaProgress.kt */
/* JADX INFO: loaded from: classes.dex */
public final class MediaProgress {

    /* JADX INFO: renamed from: a */
    public long f1745a;

    /* JADX INFO: renamed from: b */
    public long f1746b;

    /* JADX INFO: renamed from: c */
    public int f1747c;

    /* JADX INFO: renamed from: d */
    public float f1748d;

    /* JADX INFO: renamed from: c.a.a.b.c.b$a */
    /* JADX INFO: compiled from: MediaProgress.kt */
    public static final class a {
        public a() {
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        new a(null);
    }

    public MediaProgress(long j2, int i, long j3) {
        m1267b(j2, i, j3);
    }

    /* JADX INFO: renamed from: a */
    public final long m1266a() {
        return Math.max(0L, this.f1745a);
    }

    /* JADX INFO: renamed from: b */
    public final void m1267b(long j2, int i, long j3) {
        this.f1745a = j2;
        int iMin = Math.min(100, Math.max(0, i));
        this.f1747c = iMin;
        this.f1748d = iMin == 100 ? iMin : iMin / 100;
        this.f1746b = Math.max(0L, j3);
    }
}
