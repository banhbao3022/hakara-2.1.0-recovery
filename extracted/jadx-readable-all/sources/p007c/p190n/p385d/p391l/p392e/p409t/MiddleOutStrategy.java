package p007c.p190n.p385d.p391l.p392e.p409t;

/* JADX INFO: renamed from: c.n.d.l.e.t.b, reason: use source file name */
/* JADX INFO: compiled from: MiddleOutStrategy.java */
/* JADX INFO: loaded from: classes.dex */
public class MiddleOutStrategy implements StackTraceTrimmingStrategy {

    /* JADX INFO: renamed from: a */
    public final int f27005a;

    public MiddleOutStrategy(int i) {
        this.f27005a = i;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p409t.StackTraceTrimmingStrategy
    /* JADX INFO: renamed from: a */
    public StackTraceElement[] mo12043a(StackTraceElement[] stackTraceElementArr) {
        int length = stackTraceElementArr.length;
        int i = this.f27005a;
        if (length <= i) {
            return stackTraceElementArr;
        }
        int i2 = i / 2;
        int i3 = i - i2;
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[i];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, i3);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - i2, stackTraceElementArr2, i3, i2);
        return stackTraceElementArr2;
    }
}
