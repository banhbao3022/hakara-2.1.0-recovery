package p007c.p190n.p385d.p391l.p392e.p409t;

/* JADX INFO: renamed from: c.n.d.l.e.t.e, reason: use source file name */
/* JADX INFO: compiled from: TrimmedThrowableData.java */
/* JADX INFO: loaded from: classes.dex */
public class TrimmedThrowableData {

    /* JADX INFO: renamed from: a */
    public final String f27007a;

    /* JADX INFO: renamed from: b */
    public final String f27008b;

    /* JADX INFO: renamed from: c */
    public final StackTraceElement[] f27009c;

    /* JADX INFO: renamed from: d */
    public final TrimmedThrowableData f27010d;

    public TrimmedThrowableData(Throwable th, StackTraceTrimmingStrategy stackTraceTrimmingStrategy) {
        this.f27007a = th.getLocalizedMessage();
        this.f27008b = th.getClass().getName();
        this.f27009c = stackTraceTrimmingStrategy.mo12043a(th.getStackTrace());
        Throwable cause = th.getCause();
        this.f27010d = cause != null ? new TrimmedThrowableData(cause, stackTraceTrimmingStrategy) : null;
    }
}
