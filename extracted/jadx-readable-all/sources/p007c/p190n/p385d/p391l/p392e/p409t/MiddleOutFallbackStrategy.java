package p007c.p190n.p385d.p391l.p392e.p409t;

/* JADX INFO: renamed from: c.n.d.l.e.t.a, reason: use source file name */
/* JADX INFO: compiled from: MiddleOutFallbackStrategy.java */
/* JADX INFO: loaded from: classes.dex */
public class MiddleOutFallbackStrategy implements StackTraceTrimmingStrategy {

    /* JADX INFO: renamed from: a */
    public final int f27002a;

    /* JADX INFO: renamed from: b */
    public final StackTraceTrimmingStrategy[] f27003b;

    /* JADX INFO: renamed from: c */
    public final MiddleOutStrategy f27004c;

    public MiddleOutFallbackStrategy(int i, StackTraceTrimmingStrategy... stackTraceTrimmingStrategyArr) {
        this.f27002a = i;
        this.f27003b = stackTraceTrimmingStrategyArr;
        this.f27004c = new MiddleOutStrategy(i);
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p409t.StackTraceTrimmingStrategy
    /* JADX INFO: renamed from: a */
    public StackTraceElement[] mo12043a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= this.f27002a) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArrMo12043a = stackTraceElementArr;
        for (StackTraceTrimmingStrategy stackTraceTrimmingStrategy : this.f27003b) {
            if (stackTraceElementArrMo12043a.length <= this.f27002a) {
                break;
            }
            stackTraceElementArrMo12043a = stackTraceTrimmingStrategy.mo12043a(stackTraceElementArr);
        }
        return stackTraceElementArrMo12043a.length > this.f27002a ? this.f27004c.mo12043a(stackTraceElementArrMo12043a) : stackTraceElementArrMo12043a;
    }
}
