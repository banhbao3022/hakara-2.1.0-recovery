package p007c.p190n.p438f;

/* JADX INFO: renamed from: c.n.f.f, reason: use source file name */
/* JADX INFO: compiled from: ReaderException.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class ReaderException extends Exception {

    /* JADX INFO: renamed from: f */
    public static final boolean f27621f;

    /* JADX INFO: renamed from: g */
    public static final StackTraceElement[] f27622g;

    static {
        f27621f = System.getProperty("surefire.test.class.path") != null;
        f27622g = new StackTraceElement[0];
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return null;
    }
}
