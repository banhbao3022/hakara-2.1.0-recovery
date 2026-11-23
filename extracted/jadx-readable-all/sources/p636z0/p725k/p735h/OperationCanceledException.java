package p636z0.p725k.p735h;

/* JADX INFO: renamed from: z0.k.h.d, reason: use source file name */
/* JADX INFO: compiled from: OperationCanceledException.java */
/* JADX INFO: loaded from: classes.dex */
public class OperationCanceledException extends RuntimeException {
    public OperationCanceledException() {
        this(null);
    }

    public OperationCanceledException(String str) {
        super(str != null ? str.toString() : "The operation has been canceled.");
    }
}
