package p500e1.p501a;

import java.util.concurrent.CancellationException;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: e1.a.d1, reason: use source file name */
/* JADX INFO: compiled from: Exceptions.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Exceptions6 extends CancellationException {

    /* JADX INFO: renamed from: f */
    public final Job f29689f;

    public Exceptions6(String str, Throwable th, Job job) {
        super(str);
        this.f29689f = job;
        if (th != null) {
            initCause(th);
        }
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Exceptions6) {
                Exceptions6 exceptions6 = (Exceptions6) obj;
                if (!Intrinsics2.m13085a(exceptions6.getMessage(), getMessage()) || !Intrinsics2.m13085a(exceptions6.f29689f, this.f29689f) || !Intrinsics2.m13085a(exceptions6.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        Intrinsics2.m13087c(message);
        int iHashCode = (this.f29689f.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return iHashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + "; job=" + this.f29689f;
    }
}
