package p509g1;

import java.io.IOException;

/* JADX INFO: renamed from: g1.e, reason: use source file name */
/* JADX INFO: compiled from: Call.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface Call extends Cloneable {

    /* JADX INFO: renamed from: g1.e$a */
    /* JADX INFO: compiled from: Call.kt */
    public interface a {
        /* JADX INFO: renamed from: a */
        Call mo13300a(Request3 request3);
    }

    /* JADX INFO: renamed from: c */
    Request3 mo13332c();

    void cancel();

    /* JADX INFO: renamed from: f */
    boolean mo13333f();

    /* JADX INFO: renamed from: h */
    Response3 mo13334h() throws IOException;

    /* JADX INFO: renamed from: u */
    void mo13335u(Callback callback);
}
