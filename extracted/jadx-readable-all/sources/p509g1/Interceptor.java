package p509g1;

import java.io.IOException;

/* JADX INFO: renamed from: g1.x, reason: use source file name */
/* JADX INFO: compiled from: Interceptor.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface Interceptor {

    /* JADX INFO: renamed from: g1.x$a */
    /* JADX INFO: compiled from: Interceptor.kt */
    public interface a {
        /* JADX INFO: renamed from: a */
        Response3 mo13492a(Request3 request3) throws IOException;

        /* JADX INFO: renamed from: b */
        Connection mo13493b();

        /* JADX INFO: renamed from: c */
        Request3 mo13494c();
    }

    Response3 intercept(a aVar) throws IOException;
}
