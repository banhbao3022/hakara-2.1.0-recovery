package p509g1.p510j0.p514g;

import java.io.IOException;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: g1.j0.g.l, reason: use source file name */
/* JADX INFO: compiled from: RouteException.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class RouteException extends RuntimeException {

    /* JADX INFO: renamed from: f */
    public IOException f30264f;

    /* JADX INFO: renamed from: g */
    public final IOException f30265g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteException(IOException iOException) {
        super(iOException);
        Intrinsics2.m13090f(iOException, "firstConnectException");
        this.f30265g = iOException;
        this.f30264f = iOException;
    }
}
