package p636z0.p667e.p676b.p677v1;

/* JADX INFO: renamed from: z0.e.b.v1.k1, reason: use source file name */
/* JADX INFO: compiled from: SurfaceConfig.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class SurfaceConfig {

    /* JADX INFO: renamed from: z0.e.b.v1.k1$a */
    /* JADX INFO: compiled from: SurfaceConfig.java */
    public enum a {
        ANALYSIS(0),
        PREVIEW(1),
        RECORD(2),
        MAXIMUM(3),
        NOT_SUPPORT(4);


        /* JADX INFO: renamed from: l */
        public final int f36191l;

        a(int i) {
            this.f36191l = i;
        }
    }

    /* JADX INFO: renamed from: z0.e.b.v1.k1$b */
    /* JADX INFO: compiled from: SurfaceConfig.java */
    public enum b {
        PRIV,
        YUV,
        JPEG,
        RAW
    }

    /* JADX INFO: renamed from: a */
    public abstract a mo15386a();

    /* JADX INFO: renamed from: b */
    public abstract b mo15387b();
}
