package p509g1.p510j0.p517j;

import java.io.IOException;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: g1.j0.j.t, reason: use source file name */
/* JADX INFO: compiled from: StreamResetException.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class StreamResetException extends IOException {

    /* JADX INFO: renamed from: f */
    public final ErrorCode2 f30513f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamResetException(ErrorCode2 errorCode2) {
        super("stream was reset: " + errorCode2);
        Intrinsics2.m13090f(errorCode2, "errorCode");
        this.f30513f = errorCode2;
    }
}
