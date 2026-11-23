package p509g1.p510j0.p515h;

import java.io.IOException;
import p509g1.Request3;
import p509g1.Response3;
import p509g1.p510j0.p514g.RealConnection;
import p524h1.Sink;
import p524h1.Source;

/* JADX INFO: renamed from: g1.j0.h.d, reason: use source file name */
/* JADX INFO: compiled from: ExchangeCodec.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface ExchangeCodec {
    /* JADX INFO: renamed from: a */
    void mo13477a() throws IOException;

    /* JADX INFO: renamed from: b */
    void mo13478b(Request3 request3) throws IOException;

    /* JADX INFO: renamed from: c */
    Source mo13479c(Response3 response3) throws IOException;

    void cancel();

    /* JADX INFO: renamed from: d */
    Response3.a mo13480d(boolean z) throws IOException;

    /* JADX INFO: renamed from: e */
    RealConnection mo13481e();

    /* JADX INFO: renamed from: f */
    void mo13482f() throws IOException;

    /* JADX INFO: renamed from: g */
    long mo13483g(Response3 response3) throws IOException;

    /* JADX INFO: renamed from: h */
    Sink mo13484h(Request3 request3, long j2) throws IOException;
}
