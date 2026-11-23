package p007c.p190n.p430e.p437g0;

import java.io.IOException;

/* JADX INFO: renamed from: c.n.e.g0.d, reason: use source file name */
/* JADX INFO: compiled from: MalformedJsonException.java */
/* JADX INFO: loaded from: classes.dex */
public final class MalformedJsonException extends IOException {
    public MalformedJsonException(String str) {
        super(str);
    }

    public MalformedJsonException(String str, Throwable th) {
        super(str);
        initCause(th);
    }

    public MalformedJsonException(Throwable th) {
        initCause(th);
    }
}
