package p636z0.p709j0;

/* JADX INFO: renamed from: z0.j0.t, reason: use source file name */
/* JADX INFO: compiled from: WorkInfo.java */
/* JADX INFO: loaded from: classes.dex */
public enum WorkInfo {
    ENQUEUED,
    RUNNING,
    SUCCEEDED,
    FAILED,
    BLOCKED,
    CANCELLED;

    /* JADX INFO: renamed from: f */
    public boolean m15892f() {
        return this == SUCCEEDED || this == FAILED || this == CANCELLED;
    }
}
