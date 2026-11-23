package p007c.p190n.p194b.p209b.p210a2;

import com.facebook.stetho.websocket.CloseCodes;
import java.io.FileNotFoundException;
import java.io.IOException;
import p007c.p190n.p194b.p209b.ParserException;

/* JADX INFO: renamed from: c.n.b.b.a2.w, reason: use source file name */
/* JADX INFO: compiled from: DefaultLoadErrorHandlingPolicy.java */
/* JADX INFO: loaded from: classes.dex */
public class DefaultLoadErrorHandlingPolicy implements LoadErrorHandlingPolicy {

    /* JADX INFO: renamed from: a */
    public final int f6235a;

    public DefaultLoadErrorHandlingPolicy() {
        this(-1);
    }

    /* JADX INFO: renamed from: a */
    public long m3024a(LoadErrorHandlingPolicy.a aVar) {
        int i;
        IOException iOException = aVar.f5953c;
        return ((iOException instanceof HttpDataSource.f) && ((i = ((HttpDataSource.f) iOException).f6242f) == 403 || i == 404 || i == 410 || i == 416 || i == 500 || i == 503)) ? 60000L : -9223372036854775807L;
    }

    /* JADX INFO: renamed from: b */
    public int m3025b(int i) {
        int i2 = this.f6235a;
        if (i2 == -1) {
            return i == 7 ? 6 : 3;
        }
        return i2;
    }

    /* JADX INFO: renamed from: c */
    public long m3026c(LoadErrorHandlingPolicy.a aVar) {
        IOException iOException = aVar.f5953c;
        if ((iOException instanceof ParserException) || (iOException instanceof FileNotFoundException) || (iOException instanceof HttpDataSource.b) || (iOException instanceof Loader.h)) {
            return -9223372036854775807L;
        }
        return Math.min((aVar.f5954d - 1) * CloseCodes.NORMAL_CLOSURE, 5000);
    }

    public DefaultLoadErrorHandlingPolicy(int i) {
        this.f6235a = i;
    }
}
