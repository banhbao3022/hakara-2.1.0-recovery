package p007c.p190n.p194b.p209b;

/* JADX INFO: renamed from: c.n.b.b.m0, reason: use source file name */
/* JADX INFO: compiled from: ExoTimeoutException.java */
/* JADX INFO: loaded from: classes.dex */
public final class ExoTimeoutException extends Exception {
    public ExoTimeoutException(int i) {
        super(i != 1 ? i != 2 ? i != 3 ? "Undefined timeout." : "Detaching surface timed out." : "Setting foreground mode timed out." : "Player release timed out.");
    }
}
