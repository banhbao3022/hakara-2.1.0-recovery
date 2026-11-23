package p555j.p556a.p557a.p606h.p613d;

import mtp.media.karaoke.data.remote.response.ServerErrorResponse;
import p477d1.NoWhenBranchMatchedException;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p623k1.Response4;

/* JADX INFO: renamed from: j.a.a.h.d.b, reason: use source file name */
/* JADX INFO: compiled from: ErrorHandlingFactory.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ErrorHandlingFactory extends RuntimeException {

    /* JADX INFO: renamed from: f */
    public static final a f32359f = new a(null);

    /* JADX INFO: renamed from: g */
    public final ErrorHandlingFactory2 f32360g;

    /* JADX INFO: renamed from: h */
    public final ServerErrorResponse f32361h;

    /* JADX INFO: renamed from: i */
    public final Response4<?> f32362i;

    /* JADX INFO: renamed from: j */
    public final int f32363j;

    /* JADX INFO: renamed from: j.a.a.h.d.b$a */
    /* JADX INFO: compiled from: ErrorHandlingFactory.kt */
    public static final class a {
        public a() {
        }

        /* JADX INFO: renamed from: a */
        public final ErrorHandlingFactory m14174a(Response4<?> response4, int i) {
            return new ErrorHandlingFactory(ErrorHandlingFactory2.HTTP, null, response4, i, null, 18, null);
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public /* synthetic */ ErrorHandlingFactory(ErrorHandlingFactory2 errorHandlingFactory2, ServerErrorResponse serverErrorResponse, Response4 response4, int i, Throwable th, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(errorHandlingFactory2, (i2 & 2) != 0 ? null : serverErrorResponse, (i2 & 4) != 0 ? null : response4, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? null : th);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        int iOrdinal = this.f32360g.ordinal();
        if (iOrdinal == 0) {
            Throwable cause = getCause();
            if (cause != null) {
                return cause.getMessage();
            }
            return null;
        }
        if (iOrdinal == 1) {
            Response4<?> response4 = this.f32362i;
            if (response4 != null) {
                return response4.f33292a.f29992i;
            }
            return null;
        }
        if (iOrdinal == 2) {
            ServerErrorResponse serverErrorResponse = this.f32361h;
            if (serverErrorResponse != null) {
                return serverErrorResponse.getMessage();
            }
            return null;
        }
        if (iOrdinal != 3) {
            throw new NoWhenBranchMatchedException();
        }
        Throwable cause2 = getCause();
        if (cause2 != null) {
            return cause2.getMessage();
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ErrorHandlingFactory(ErrorHandlingFactory2 errorHandlingFactory2, ServerErrorResponse serverErrorResponse, Response4<?> response4, int i, Throwable th) {
        super(th != null ? th.getMessage() : null, th);
        Intrinsics2.m13089e(errorHandlingFactory2, "errorType");
        this.f32360g = errorHandlingFactory2;
        this.f32361h = serverErrorResponse;
        this.f32362i = response4;
        this.f32363j = i;
    }
}
