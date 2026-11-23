package p007c.p190n.p194b.p195a.p198j.p199s;

/* JADX INFO: renamed from: c.n.b.a.j.s.g, reason: use source file name */
/* JADX INFO: compiled from: BackendResponse.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class BackendResponse {

    /* JADX INFO: renamed from: c.n.b.a.j.s.g$a */
    /* JADX INFO: compiled from: BackendResponse.java */
    public enum a {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR
    }

    /* JADX INFO: renamed from: a */
    public static BackendResponse m2832a() {
        return new AutoValue_BackendResponse(a.FATAL_ERROR, -1L);
    }

    /* JADX INFO: renamed from: b */
    public abstract long mo2825b();

    /* JADX INFO: renamed from: c */
    public abstract a mo2826c();
}
