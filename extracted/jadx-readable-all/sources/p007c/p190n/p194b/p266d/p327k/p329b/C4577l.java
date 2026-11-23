package p007c.p190n.p194b.p266d.p327k.p329b;

import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.k.b.l */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4577l {

    /* JADX INFO: renamed from: a */
    public final String f24088a;

    /* JADX INFO: renamed from: b */
    public final String f24089b;

    /* JADX INFO: renamed from: c */
    public final long f24090c;

    /* JADX INFO: renamed from: d */
    public final long f24091d;

    /* JADX INFO: renamed from: e */
    public final long f24092e;

    /* JADX INFO: renamed from: f */
    public final long f24093f;

    /* JADX INFO: renamed from: g */
    public final long f24094g;

    /* JADX INFO: renamed from: h */
    public final Long f24095h;

    /* JADX INFO: renamed from: i */
    public final Long f24096i;

    /* JADX INFO: renamed from: j */
    public final Long f24097j;

    /* JADX INFO: renamed from: k */
    public final Boolean f24098k;

    public C4577l(String str, String str2, long j2, long j3, long j4, long j5, long j6, Long l, Long l2, Long l3, Boolean bool) {
        C2622l.m5359e(str);
        C2622l.m5359e(str2);
        C2622l.m5339a(j2 >= 0);
        C2622l.m5339a(j3 >= 0);
        C2622l.m5339a(j4 >= 0);
        C2622l.m5339a(j6 >= 0);
        this.f24088a = str;
        this.f24089b = str2;
        this.f24090c = j2;
        this.f24091d = j3;
        this.f24092e = j4;
        this.f24093f = j5;
        this.f24094g = j6;
        this.f24095h = l;
        this.f24096i = l2;
        this.f24097j = l3;
        this.f24098k = bool;
    }

    /* JADX INFO: renamed from: a */
    public final C4577l m10635a(long j2) {
        return new C4577l(this.f24088a, this.f24089b, this.f24090c, this.f24091d, this.f24092e, j2, this.f24094g, this.f24095h, this.f24096i, this.f24097j, this.f24098k);
    }

    /* JADX INFO: renamed from: b */
    public final C4577l m10636b(long j2, long j3) {
        return new C4577l(this.f24088a, this.f24089b, this.f24090c, this.f24091d, this.f24092e, this.f24093f, j2, Long.valueOf(j3), this.f24096i, this.f24097j, this.f24098k);
    }

    /* JADX INFO: renamed from: c */
    public final C4577l m10637c(Long l, Long l2, Boolean bool) {
        return new C4577l(this.f24088a, this.f24089b, this.f24090c, this.f24091d, this.f24092e, this.f24093f, this.f24094g, this.f24095h, l, l2, (bool == null || bool.booleanValue()) ? bool : null);
    }

    public C4577l(String str, String str2, long j2) {
        this(str, str2, 0L, 0L, 0L, j2, 0L, null, null, null, null);
    }
}
