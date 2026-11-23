package p007c.p085g.p086a.p089m.p092t;

/* JADX INFO: renamed from: c.g.a.m.t.c, reason: use source file name */
/* JADX INFO: compiled from: CallbackException.java */
/* JADX INFO: loaded from: classes.dex */
public final class CallbackException extends RuntimeException {
    public CallbackException(Throwable th) {
        super("Unexpected exception thrown by non-Glide code", th);
    }
}
